package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, value = Dist.CLIENT)
public class ABRCDataGeneration {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event) {
        DataGenerator generator =  event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        //TODO: ReImplement Block Models/States and Item Models
        //generator.addProvider(true, new ModBlockStateProvider(packOutput, fileHelper));
        //generator.addProvider(true, new ModBlockModelProvider(packOutput, fileHelper));
        //generator.addProvider(true, new ModItemModelProvider(packOutput, fileHelper));
        generator.addProvider(true, new ModBlocksTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModItemsTagProvider(packOutput, lookupProvider));
        ModLangProvider.addTranslations(generator);
        generator.addProvider(true, new ModLootTablesProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModRecipeProvider.Runner(packOutput, lookupProvider));
    }
}
