package net.manmaed.antiblocksrechiseled.datagen;


import com.google.common.collect.ImmutableList;
import net.manmaed.antiblocksrechiseled.blocks.*;
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

public class ModLootTablesProvider extends LootTableProvider {
    public ModLootTablesProvider(PackOutput packOutput) {
        super(packOutput, Set.of(), ImmutableList.of(new LootTableProvider.SubProviderEntry(ModBlockLoot::new, LootContextParamSets.BLOCK)));
    }

    public static class ModBlockLoot extends BlockLootSubProvider {
        protected ModBlockLoot() {
            super(Set.of(), FeatureFlags.REGISTRY.allFlags());
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
            dropSelf(ABRCSlabs.SLAB_WHITE_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_BLACK.get());
            dropSelf(ABRCSlabs.SLAB_ORANGE_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_YELLOW_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_CYAN_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_BLUE_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_GREEN_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_RED_BRIGHT.get());
            dropSelf(ABRCSlabs.SLAB_WHITE_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_ORANGE_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_MAGENTA_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_YELLOW_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_LIME_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_PINK_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_GRAY_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_CYAN_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_PURPLE_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_BLUE_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_BROWN_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_GREEN_WOOL.get());
            dropSelf(ABRCSlabs.SLAB_RED_WOOL.get());
            dropSelf(ABRCStairs.STAIR_WHITE_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_BLACK.get());
            dropSelf(ABRCStairs.STAIR_ORANGE_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_MAGENTA_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_YELLOW_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_CYAN_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_BLUE_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_GREEN_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_RED_BRIGHT.get());
            dropSelf(ABRCStairs.STAIR_WHITE_WOOL.get());
            dropSelf(ABRCStairs.STAIR_ORANGE_WOOL.get());
            dropSelf(ABRCStairs.STAIR_MAGENTA_WOOL.get());
            dropSelf(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get());
            dropSelf(ABRCStairs.STAIR_YELLOW_WOOL.get());
            dropSelf(ABRCStairs.STAIR_LIME_WOOL.get());
            dropSelf(ABRCStairs.STAIR_PINK_WOOL.get());
            dropSelf(ABRCStairs.STAIR_GRAY_WOOL.get());
            dropSelf(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get());
            dropSelf(ABRCStairs.STAIR_CYAN_WOOL.get());
            dropSelf(ABRCStairs.STAIR_PURPLE_WOOL.get());
            dropSelf(ABRCStairs.STAIR_BLUE_WOOL.get());
            dropSelf(ABRCStairs.STAIR_BROWN_WOOL.get());
            dropSelf(ABRCStairs.STAIR_GREEN_WOOL.get());
            dropSelf(ABRCStairs.STAIR_RED_WOOL.get());
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
            ABRCBrightColors.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCWoolColors.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCSlabs.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCStairs.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCButtons.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            ABRCPressurePlates.BLOCKS.getEntries().stream().map(DeferredHolder::get).forEach((b) -> blocks.add(b.defaultBlockState().getBlock()));
            return blocks;
        }
    }
}
