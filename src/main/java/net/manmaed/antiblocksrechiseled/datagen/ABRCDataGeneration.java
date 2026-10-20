package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = AntiBlocksReChiseled.MOD_ID, value = Dist.CLIENT)
public class ABRCDataGeneration {
    @SubscribeEvent
    public static void onGatherData(GatherDataEvent.Client event) {
        DataGenerator generator =  event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getReloadableLookupProvider();
        generator.addProvider(true, new ModBlocksTagsProvider(packOutput, lookupProvider));
        generator.addProvider(true, new ModItemsTagProvider(packOutput, lookupProvider));
        ModLangProvider.addTranslations(generator);
        event.createReloadableRegistryObjects(new RegistrySetBuilder()
                .add(Registries.LOOT_TABLE, new ModLootTablesProvider())
                .add(RecipeProvider.asBootstrap(ModRecipeProvider::new))
        );
    }
}
