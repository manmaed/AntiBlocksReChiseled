package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ABRCDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator =  event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        //generator.addProvider(false, new ModLootTableProvider(generator));
        generator.addProvider(true, new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(true, new ModBlockModelProvider(generator, fileHelper));
        generator.addProvider(true, new ModItemModelProvider(generator, fileHelper));
        generator.addProvider(true, new ModBlocksTagsProvider(generator, fileHelper));
        generator.addProvider(true, new ModLangProvider(generator));
        generator.addProvider(true, new ModLootTablesProvider(generator));
        generator.addProvider(true, new RecipeProvider(generator));
    }
}
