package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.registries.RegistriesDatapackGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.RegistryDataBuilder;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ABRCDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator =  event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(true, new ModBlocksTagsProvider(packOutput, lookupProvider, fileHelper));
        generator.addProvider(true, new ModItemsTagsProvider(packOutput, lookupProvider, fileHelper));
        ModLangProvider.addTranslations(generator);

        RegistryDataBuilder builder = RegistriesDatapackGenerator.builder()
                .modid(AntiBlocksReChiseled.MOD_ID)
                .reloadable(registries -> {
                   registries.add(ModRecipeProvider.BOOTSTRAP);
                   registries.add(Registries.LOOT_TABLE, ModLootTablesProvider.create());
                });

        generator.addProvider(true, builder.reloadableGenerator(packOutput));
    }
}
