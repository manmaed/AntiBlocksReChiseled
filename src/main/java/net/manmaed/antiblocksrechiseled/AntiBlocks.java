package net.manmaed.antiblocksrechiseled;

import com.google.common.collect.ImmutableList;
import net.manmaed.antiblocksrechiseled.blocks.base.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelBuilder;
import net.minecraftforge.client.model.generators.ModelProvider;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@Mod(AntiBlocks.MOD_ID)
public class AntiBlocks {
    static final String MOD_ID = "antiblocksrechiseled";

    static List<String> woolColors = List.of("white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red");
    static List<String> colors = List.of("white", "orange", "magenta", "yellow", "cyan", "blue", "green", "red", "black");
    static List<String> variants = List.of("wool", "bright", "border", "bright_border");

    static List<AntiEntry> entries = new ArrayList<>();

    static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocks.MOD_ID);
    static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocks.MOD_ID);

    public AntiBlocks() {
        for (AntiType type : AntiType.VALUES) {
            var useColors = type == AntiType.WOOL ? woolColors : colors;

            for (String color : useColors) {
                for (String variant : variants) {
                    if (!type.hasBorderedType && variant.equals("border")) {
                        continue;
                    }

                    boolean isBright = variant.equals("bright");
                    boolean isBordered = variant.equals("border") || variant.equals("bright_border");

                    String name = variant + "_" + color + "_" + type.name().toLowerCase();
                    StringBuilder prettyName = new StringBuilder();
                    if (isBright) {
                        prettyName.append("Bright ");
                    }
                    prettyName.append(titleCase(color));
                    prettyName.append(" ");
                    if (isBordered) {
                        prettyName.append("Bordered ");
                    }
                    prettyName.append(Arrays.stream(type.name().split("_")).map(this::titleCase).collect(Collectors.joining(" ")));

                    entries.add(new AntiEntry(color, type, name, prettyName.toString(), isBright));
                }
            }
        }

        // Sort the entries by the variant
        entries.sort((a, b) -> {
            int aIndex = variants.indexOf(a.name.split("_")[0]);
            int bIndex = variants.indexOf(b.name.split("_")[0]);
            return Integer.compare(aIndex, bIndex);
        });

        System.out.println(entries.stream().map(entry -> entry.name).collect(Collectors.joining("\n")));
        System.out.println(entries.size());

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        modEventBus.addListener(this::onDataGen);
    }

    static class AntiEntry {
        final String color;
        final AntiType type;
        final Supplier<Block> block;
        final Supplier<Item> blockItem;
        final String name;
        final String prettyName;
//        final Supplier<RecipeBuilder> recipe;
        final boolean isBright;

        public AntiEntry(String color, AntiType type, String name, String prettyName, boolean isBright) {
            this.color = color;
            this.type = type;
            this.name = name;
            this.prettyName = prettyName;
//            this.recipe = recipe;
            this.isBright = isBright;
            this.block = BLOCKS.register(name, type.creator.create(color, name, isBright));
            this.blockItem = ITEMS.register(name, () -> new BlockItem(this.block.get(), new Item.Properties()));
        }
    }

    enum AntiType {
        WOOL(AntiBlock::new, new String[]{"wdw", "wgw", "wdw"}),
        BUTTON(AntiButton::new, new String[]{}),
        SLAB(AntiSlabBlock::new, new String[]{"www"}),
        STAIR((color, name, isBright) -> {
            final Optional<AntiEntry> foundBaseBlock = entries.stream()
                    .filter(e -> e.color.equals(color) && e.type == WOOL && e.isBright == isBright)
                    .findFirst();

            if (foundBaseBlock.isEmpty()) {
                throw new IllegalStateException("Could not find base block for stair " + name);
            }

            return () -> new AntiStairBlock(foundBaseBlock.get().block.get().defaultBlockState());
        }, false, new String[]{"w  ", "ww ", "www"}),
        PRESSURE_PLATE(AntiPressurePlate::new, false, new String[]{"ww"});

        static final List<AntiType> VALUES = List.of(values());

        final AntiBlockCreator creator;
        final String[] recipePattern;
        boolean hasBorderedType = true;

        AntiType(AntiBlockCreator creator, boolean hasBorderedType, String[] recipePattern) {
            this.recipePattern = recipePattern;
            this.creator = creator;
            this.hasBorderedType = hasBorderedType;
        }

        AntiType(Supplier<Block> block, String[] recipePattern) {
            this.recipePattern = recipePattern;
            this.creator = (a, b, c) -> block;
        }

        AntiType(Supplier<Block> block, boolean hasBorderedType, String[] recipePattern) {
            this.recipePattern = recipePattern;
            this.creator = (a, b, c) -> block;
            this.hasBorderedType = hasBorderedType;
        }
    }

    @FunctionalInterface
    interface AntiBlockCreator {
        Supplier<Block> create(String color, String name, boolean isBright);
    }

    private String titleCase(String input) {
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

    private void onDataGen(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = event.getGenerator().getPackOutput();

        // Translations
        generator.addProvider(true, new LanguageProvider(packOutput, AntiBlocks.MOD_ID, "en_us") {
            @Override
            protected void addTranslations() {
                for (AntiEntry entry : entries) {
                    addBlock(entry.block, entry.prettyName);
                }
            }
        });

        generator.addProvider(true, new LootTableProvider(packOutput, Set.of(), ImmutableList.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK))) {});

        generator.addProvider(true, new ItemModelProvider(packOutput, AntiBlocks.MOD_ID, event.getExistingFileHelper()) {
            @Override
            protected void registerModels() {
                for (AntiEntry entry : entries) {
                    if (entry.type == AntiType.)
                }
            }
        });

        generator.addProvider(true, new BlockTagsProvider(packOutput, event.getLookupProvider(), AntiBlocks.MOD_ID, event.getExistingFileHelper()) {
            @Override
            protected void addTags(HolderLookup.Provider provider) {
                List<Block> blocks = entries.stream().map(entry -> entry.block.get()).toList();

                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(blocks.toArray(new Block[0]));
                tag(BlockTags.NEEDS_IRON_TOOL).add(blocks.toArray(new Block[0]));
            }
        });
    }

    static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
        }

        @Override
        protected void generate() {
            for (AntiEntry entry : entries) {
                this.dropSelf(entry.block.get());
            }
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            return entries.stream().map(entry -> entry.block.get()).collect(Collectors.toList());
        }
    }
}
