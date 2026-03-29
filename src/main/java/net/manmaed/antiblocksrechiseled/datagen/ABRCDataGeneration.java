package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ABRCDataGeneration implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack generator = fabricDataGenerator.createPack();
        generator.addProvider(((output, registriesFuture) -> {
            ModBlocksTagsProvider blocksTagsProvider = new ModBlocksTagsProvider(output, registriesFuture);
            generator.addProvider((out, future) -> new ModItemsTagsProvider(out, future, blocksTagsProvider));
            return blocksTagsProvider;
        }));
        ModLangProvider.addTranslations(generator);
        generator.addProvider(ModLootTablesProvider::new);
        generator.addProvider(ModRecipeProvider::new);
        //generator.addProvider(ModModelProvider::new);

    }
}
