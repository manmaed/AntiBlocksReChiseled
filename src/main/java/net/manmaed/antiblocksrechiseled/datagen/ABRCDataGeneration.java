package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ABRCDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack generator = fabricDataGenerator.createPack();
        //generator.addProvider(ModModelProvider::new);
        generator.addProvider(ModBlocksTagsProvider::new);
        generator.addProvider(ModLangProvider::new);
        generator.addProvider(ModLootTablesProvider::new);
        generator.addProvider(ModRecipeProvider::new);

    }
}
