package net.manmaed.antiblocksrechiseled.datagen;


import com.google.common.collect.ImmutableList;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModLootTablesProvider extends LootTableProvider {
    public ModLootTablesProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookup) {
        super(packOutput, Set.of(), ImmutableList.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)), lookup);
    }

    public static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot(HolderLookup.Provider lookup) {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookup);
        }

        @Override
        protected void generate() {
            dropSelf(ABRCBrightColors.BRIGHT_WHITE.get());
            dropSelf(ABRCBrightColors.BRIGHT_ORANGE.get());
            dropSelf(ABRCBrightColors.BRIGHT_MAGENTA.get());
            dropSelf(ABRCBrightColors.BRIGHT_YELLOW.get());
            dropSelf(ABRCBrightColors.BRIGHT_CYAN.get());
            dropSelf(ABRCBrightColors.BRIGHT_BLUE.get());
            dropSelf(ABRCBrightColors.BRIGHT_GREEN.get());
            dropSelf(ABRCBrightColors.BRIGHT_RED.get());
            dropSelf(ABRCBrightColors.BRIGHT_BLACK.get());
            dropSelf(ABRCBrightColors.BRIGHT_WHITE_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_CYAN_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_BLUE_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_GREEN_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_RED_BORDER.get());
            dropSelf(ABRCBrightColors.BRIGHT_BLACK_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_WHITE.get());
            dropSelf(ABRCWoolColors.WOOL_ORANGE.get());
            dropSelf(ABRCWoolColors.WOOL_MAGENTA.get());
            dropSelf(ABRCWoolColors.WOOL_LIGHT_BLUE.get());
            dropSelf(ABRCWoolColors.WOOL_YELLOW.get());
            dropSelf(ABRCWoolColors.WOOL_LIME.get());
            dropSelf(ABRCWoolColors.WOOL_PINK.get());
            dropSelf(ABRCWoolColors.WOOL_GRAY.get());
            dropSelf(ABRCWoolColors.WOOL_LIGHT_GRAY.get());
            dropSelf(ABRCWoolColors.WOOL_CYAN.get());
            dropSelf(ABRCWoolColors.WOOL_PURPLE.get());
            dropSelf(ABRCWoolColors.WOOL_BLUE.get());
            dropSelf(ABRCWoolColors.WOOL_BROWN.get());
            dropSelf(ABRCWoolColors.WOOL_GREEN.get());
            dropSelf(ABRCWoolColors.WOOL_RED.get());
            dropSelf(ABRCWoolColors.WOOL_WHITE_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_ORANGE_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_MAGENTA_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_YELLOW_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_LIME_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_PINK_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_GRAY_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_CYAN_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_PURPLE_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_BLUE_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_BROWN_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_GREEN_BORDER.get());
            dropSelf(ABRCWoolColors.WOOL_RED_BORDER.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_WHITE.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_BLACK.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_ORANGE.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_YELLOW.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_CYAN.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_BLUE.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_GREEN.get());
            dropSelf(ABRCSlabs.SLAB_BRIGHT_RED.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_WHITE.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_ORANGE.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_MAGENTA.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_YELLOW.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_LIME.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_PINK.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_GRAY.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_CYAN.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_PURPLE.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_BLUE.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_BROWN.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_GREEN.get());
            dropSelf(ABRCSlabs.SLAB_WOOL_RED.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_WHITE.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_BLACK.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_ORANGE.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_MAGENTA.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_YELLOW.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_CYAN.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_BLUE.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_GREEN.get());
            dropSelf(ABRCStairs.STAIR_BRIGHT_RED.get());
            dropSelf(ABRCStairs.STAIR_WOOL_WHITE.get());
            dropSelf(ABRCStairs.STAIR_WOOL_ORANGE.get());
            dropSelf(ABRCStairs.STAIR_WOOL_MAGENTA.get());
            dropSelf(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get());
            dropSelf(ABRCStairs.STAIR_WOOL_YELLOW.get());
            dropSelf(ABRCStairs.STAIR_WOOL_LIME.get());
            dropSelf(ABRCStairs.STAIR_WOOL_PINK.get());
            dropSelf(ABRCStairs.STAIR_WOOL_GRAY.get());
            dropSelf(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get());
            dropSelf(ABRCStairs.STAIR_WOOL_CYAN.get());
            dropSelf(ABRCStairs.STAIR_WOOL_PURPLE.get());
            dropSelf(ABRCStairs.STAIR_WOOL_BLUE.get());
            dropSelf(ABRCStairs.STAIR_WOOL_BROWN.get());
            dropSelf(ABRCStairs.STAIR_WOOL_GREEN.get());
            dropSelf(ABRCStairs.STAIR_WOOL_RED.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_WHITE.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_ORANGE.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_YELLOW.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_CYAN.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_BLUE.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_GREEN.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_RED.get());
            dropSelf(ABRCButtons.BUTTON_BRIGHT_BLACK.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_WHITE.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_ORANGE.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_MAGENTA.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_YELLOW.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_LIME.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_PINK.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_GRAY.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_CYAN.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_PURPLE.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_BLUE.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_BROWN.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_GREEN.get());
            dropSelf(ABRCButtons.BUTTON_WOOL_RED.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get());
            dropSelf(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get());
        }

        @Override
        protected Iterable<Block> getKnownBlocks() {
            List<Block> blocks = new ArrayList<>();
            ABRCBrightColors.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCWoolColors.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCSlabs.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCStairs.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCButtons.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCPressurePlates.getBlocks().getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            return blocks;
        }
    }
}
