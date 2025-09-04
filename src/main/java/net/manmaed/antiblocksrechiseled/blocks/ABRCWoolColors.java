package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCWoolColors {

    public static void init(IEventBus e) {
        BLOCKS.register(e);
        ITEMS.register(e);
    }

    public static DeferredRegister<Block> getBlocks() {
        return BLOCKS;
    }

    public static DeferredRegister<Item> getItems() {
        return ITEMS;
    }

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    //Wool Colors Pure
    public static final RegistryObject<Block> WOOL_WHITE = BLOCKS.register("wool_white", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_ORANGE = BLOCKS.register("wool_orange", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_MAGENTA = BLOCKS.register("wool_magenta", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_BLUE = BLOCKS.register("wool_light_blue", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_YELLOW = BLOCKS.register("wool_yellow", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIME = BLOCKS.register("wool_lime", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PINK = BLOCKS.register("wool_pink", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GRAY = BLOCKS.register("wool_gray", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_GRAY = BLOCKS.register("wool_light_gray", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_CYAN = BLOCKS.register("wool_cyan", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PURPLE = BLOCKS.register("wool_purple", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BLUE = BLOCKS.register("wool_blue", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BROWN = BLOCKS.register("wool_brown", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GREEN = BLOCKS.register("wool_green", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_RED = BLOCKS.register("wool_red", AntiBlock::new);

    //Wool Colors Borderd
    public static final RegistryObject<Block> WOOL_WHITE_BORDER = BLOCKS.register("wool_white_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_ORANGE_BORDER = BLOCKS.register("wool_orange_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_MAGENTA_BORDER = BLOCKS.register("wool_magenta_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_BLUE_BORDER = BLOCKS.register("wool_light_blue_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_YELLOW_BORDER = BLOCKS.register("wool_yellow_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIME_BORDER = BLOCKS.register("wool_lime_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PINK_BORDER = BLOCKS.register("wool_pink_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GRAY_BORDER = BLOCKS.register("wool_gray_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_GRAY_BORDER = BLOCKS.register("wool_light_gray_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_CYAN_BORDER = BLOCKS.register("wool_cyan_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PURPLE_BORDER = BLOCKS.register("wool_purple_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BLUE_BORDER = BLOCKS.register("wool_blue_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BROWN_BORDER = BLOCKS.register("wool_brown_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GREEN_BORDER = BLOCKS.register("wool_green_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_RED_BORDER = BLOCKS.register("wool_red_border", AntiBlock::new);

    //Wool Colors BlockItems

    public static final RegistryObject<Item> WOOL_WHITE_ITEM = ITEMS.register("wool_white", () -> new AntiBlockItem(WOOL_WHITE.get()));
    public static final RegistryObject<Item> WOOL_ORANGE_ITEM = ITEMS.register("wool_orange", () -> new AntiBlockItem(WOOL_ORANGE.get()));
    public static final RegistryObject<Item> WOOL_MAGENTA_ITEM = ITEMS.register("wool_magenta", () -> new AntiBlockItem(WOOL_MAGENTA.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_BLUE_ITEM = ITEMS.register("wool_light_blue", () -> new AntiBlockItem(WOOL_LIGHT_BLUE.get()));
    public static final RegistryObject<Item> WOOL_YELLOW_ITEM = ITEMS.register("wool_yellow", () -> new AntiBlockItem(WOOL_YELLOW.get()));
    public static final RegistryObject<Item> WOOL_LIME_ITEM = ITEMS.register("wool_lime", () -> new AntiBlockItem(WOOL_LIME.get()));
    public static final RegistryObject<Item> WOOL_PINK_ITEM = ITEMS.register("wool_pink", () -> new AntiBlockItem(WOOL_PINK.get()));
    public static final RegistryObject<Item> WOOL_GRAY_ITEM = ITEMS.register("wool_gray", () -> new AntiBlockItem(WOOL_GRAY.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_GRAY_ITEM = ITEMS.register("wool_light_gray", () -> new AntiBlockItem(WOOL_LIGHT_GRAY.get()));
    public static final RegistryObject<Item> WOOL_CYAN_ITEM = ITEMS.register("wool_cyan", () -> new AntiBlockItem(WOOL_CYAN.get()));
    public static final RegistryObject<Item> WOOL_PURPLE_ITEM = ITEMS.register("wool_purple", () -> new AntiBlockItem(WOOL_PURPLE.get()));
    public static final RegistryObject<Item> WOOL_BLUE_ITEM = ITEMS.register("wool_blue", () -> new AntiBlockItem(WOOL_BLUE.get()));
    public static final RegistryObject<Item> WOOL_BROWN_ITEM = ITEMS.register("wool_brown", () -> new AntiBlockItem(WOOL_BROWN.get()));
    public static final RegistryObject<Item> WOOL_GREEN_ITEM = ITEMS.register("wool_green", () -> new AntiBlockItem(WOOL_GREEN.get()));
    public static final RegistryObject<Item> WOOL_RED_ITEM = ITEMS.register("wool_red", () -> new AntiBlockItem(WOOL_RED.get()));

    //Wool Colors Borderd
    public static final RegistryObject<Item> WOOL_WHITE_BORDER_ITEM = ITEMS.register("wool_white_border", () -> new AntiBlockItem(WOOL_WHITE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_ORANGE_BORDER_ITEM = ITEMS.register("wool_orange_border", () -> new AntiBlockItem(WOOL_ORANGE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_MAGENTA_BORDER_ITEM = ITEMS.register("wool_magenta_border", () -> new AntiBlockItem(WOOL_MAGENTA_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_BLUE_BORDER_ITEM = ITEMS.register("wool_light_blue_border", () -> new AntiBlockItem(WOOL_LIGHT_BLUE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_YELLOW_BORDER_ITEM = ITEMS.register("wool_yellow_border", () -> new AntiBlockItem(WOOL_YELLOW_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIME_BORDER_ITEM = ITEMS.register("wool_lime_border", () -> new AntiBlockItem(WOOL_LIME_BORDER.get()));
    public static final RegistryObject<Item> WOOL_PINK_BORDER_ITEM = ITEMS.register("wool_pink_border", () -> new AntiBlockItem(WOOL_PINK_BORDER.get()));
    public static final RegistryObject<Item> WOOL_GRAY_BORDER_ITEM = ITEMS.register("wool_gray_border", () -> new AntiBlockItem(WOOL_GRAY_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_GRAY_BORDER_ITEM = ITEMS.register("wool_light_gray_border", () -> new AntiBlockItem(WOOL_LIGHT_GRAY_BORDER.get()));
    public static final RegistryObject<Item> WOOL_CYAN_BORDER_ITEM = ITEMS.register("wool_cyan_border", () -> new AntiBlockItem(WOOL_CYAN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_PURPLE_BORDER_ITEM = ITEMS.register("wool_purple_border", () -> new AntiBlockItem(WOOL_PURPLE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_BLUE_BORDER_ITEM = ITEMS.register("wool_blue_border", () -> new AntiBlockItem(WOOL_BLUE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_BROWN_BORDER_ITEM = ITEMS.register("wool_brown_border", () -> new AntiBlockItem(WOOL_BROWN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_GREEN_BORDER_ITEM = ITEMS.register("wool_green_border", () -> new AntiBlockItem(WOOL_GREEN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_RED_BORDER_ITEM = ITEMS.register("wool_red_border", () -> new AntiBlockItem(WOOL_RED_BORDER.get()));

}
