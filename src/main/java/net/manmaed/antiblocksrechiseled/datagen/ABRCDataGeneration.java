package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ABRCDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new ModBlockStateProvider(generator, fileHelper));
        generator.addProvider(new ModBlockModelProvider(generator, fileHelper));
        generator.addProvider(new ModItemModelProvider(generator, fileHelper));
        generator.addProvider(new ModBlocksTagsProvider(generator, fileHelper));
        generator.addProvider(new ModLangProvider(generator));
        generator.addProvider(new ModLootTablesProvider(generator));
        generator.addProvider(new ModRecipeProvider(generator));
    }
}
