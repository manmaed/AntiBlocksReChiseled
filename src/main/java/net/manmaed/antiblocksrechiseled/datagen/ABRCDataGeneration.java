package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
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
        ModBlocksTagsProvider blocksTagsProvider = new ModBlocksTagsProvider(packOutput, lookupProvider, fileHelper);
        generator.addProvider(true, new ModBlockStateProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModBlockModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModItemModelProvider(packOutput, fileHelper));
        generator.addProvider(true, blocksTagsProvider);
        generator.addProvider(true, new ModItemsTagsProvider(packOutput, lookupProvider, blocksTagsProvider.contentsGetter(), fileHelper));
        generator.addProvider(true, new ModLangProvider(packOutput));
        generator.addProvider(true, new ModLootTablesProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModRecipeProvider(packOutput, lookupProvider));
    }
}
