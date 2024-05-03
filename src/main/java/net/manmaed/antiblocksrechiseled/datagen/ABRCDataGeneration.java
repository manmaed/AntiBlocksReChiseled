package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class ABRCDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator =  event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(true, new ModBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModBlockModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModItemModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModBlocksTagsProvider(packOutput, lookupProvider, fileHelper));
        generator.addProvider(true, new ModLangProvider(packOutput));
        generator.addProvider(true, new ModLootTablesProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModRecipeProvider(packOutput, lookupProvider));
    }
}