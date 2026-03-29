package net.manmaed.antiblocksrechiseled.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends FabricTagsProvider.BlockTagsProvider {

    public ModBlocksTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    public static final Block[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER,
            ABRCBrightColors.BRIGHT_ORANGE_BORDER,
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER,
            ABRCBrightColors.BRIGHT_YELLOW_BORDER,
            ABRCBrightColors.BRIGHT_CYAN_BORDER,
            ABRCBrightColors.BRIGHT_BLUE_BORDER,
            ABRCBrightColors.BRIGHT_GREEN_BORDER,
            ABRCBrightColors.BRIGHT_RED_BORDER,
            ABRCBrightColors.BRIGHT_BLACK_BORDER
    };
    public static final Block[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE,
            ABRCBrightColors.BRIGHT_ORANGE,
            ABRCBrightColors.BRIGHT_MAGENTA,
            ABRCBrightColors.BRIGHT_YELLOW,
            ABRCBrightColors.BRIGHT_CYAN,
            ABRCBrightColors.BRIGHT_BLUE,
            ABRCBrightColors.BRIGHT_GREEN,
            ABRCBrightColors.BRIGHT_RED,
            ABRCBrightColors.BRIGHT_BLACK
    };
    public static final Block[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER,
            ABRCWoolColors.WOOL_ORANGE_BORDER,
            ABRCWoolColors.WOOL_MAGENTA_BORDER,
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER,
            ABRCWoolColors.WOOL_YELLOW_BORDER,
            ABRCWoolColors.WOOL_LIME_BORDER,
            ABRCWoolColors.WOOL_PINK_BORDER,
            ABRCWoolColors.WOOL_GRAY_BORDER,
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER,
            ABRCWoolColors.WOOL_CYAN_BORDER,
            ABRCWoolColors.WOOL_PURPLE_BORDER,
            ABRCWoolColors.WOOL_BLUE_BORDER,
            ABRCWoolColors.WOOL_BROWN_BORDER,
            ABRCWoolColors.WOOL_GREEN_BORDER,
            ABRCWoolColors.WOOL_RED_BORDER
    };

    public static final Block[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE,
            ABRCWoolColors.WOOL_ORANGE,
            ABRCWoolColors.WOOL_MAGENTA,
            ABRCWoolColors.WOOL_LIGHT_BLUE,
            ABRCWoolColors.WOOL_YELLOW,
            ABRCWoolColors.WOOL_LIME,
            ABRCWoolColors.WOOL_PINK,
            ABRCWoolColors.WOOL_GRAY,
            ABRCWoolColors.WOOL_LIGHT_GRAY,
            ABRCWoolColors.WOOL_CYAN,
            ABRCWoolColors.WOOL_PURPLE,
            ABRCWoolColors.WOOL_BLUE,
            ABRCWoolColors.WOOL_BROWN,
            ABRCWoolColors.WOOL_GREEN,
            ABRCWoolColors.WOOL_RED
    };

    public static final Block[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_BRIGHT_WHITE,
            ABRCSlabs.SLAB_BRIGHT_BLACK,
            ABRCSlabs.SLAB_BRIGHT_ORANGE,
            ABRCSlabs.SLAB_BRIGHT_MAGENTA,
            ABRCSlabs.SLAB_BRIGHT_YELLOW,
            ABRCSlabs.SLAB_BRIGHT_CYAN,
            ABRCSlabs.SLAB_BRIGHT_BLUE,
            ABRCSlabs.SLAB_BRIGHT_GREEN,
            ABRCSlabs.SLAB_BRIGHT_RED,
            ABRCSlabs.SLAB_WOOL_WHITE,
            ABRCSlabs.SLAB_WOOL_ORANGE,
            ABRCSlabs.SLAB_WOOL_MAGENTA,
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE,
            ABRCSlabs.SLAB_WOOL_YELLOW,
            ABRCSlabs.SLAB_WOOL_LIME,
            ABRCSlabs.SLAB_WOOL_PINK,
            ABRCSlabs.SLAB_WOOL_GRAY,
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY,
            ABRCSlabs.SLAB_WOOL_CYAN,
            ABRCSlabs.SLAB_WOOL_PURPLE,
            ABRCSlabs.SLAB_WOOL_BLUE,
            ABRCSlabs.SLAB_WOOL_BROWN,
            ABRCSlabs.SLAB_WOOL_GREEN,
            ABRCSlabs.SLAB_WOOL_RED
    };
    public static final Block[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE,
            ABRCStairs.STAIR_BRIGHT_BLACK,
            ABRCStairs.STAIR_BRIGHT_ORANGE,
            ABRCStairs.STAIR_BRIGHT_MAGENTA,
            ABRCStairs.STAIR_BRIGHT_YELLOW,
            ABRCStairs.STAIR_BRIGHT_CYAN,
            ABRCStairs.STAIR_BRIGHT_BLUE,
            ABRCStairs.STAIR_BRIGHT_GREEN,
            ABRCStairs.STAIR_BRIGHT_RED,
            ABRCStairs.STAIR_WOOL_WHITE,
            ABRCStairs.STAIR_WOOL_ORANGE,
            ABRCStairs.STAIR_WOOL_MAGENTA,
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE,
            ABRCStairs.STAIR_WOOL_YELLOW,
            ABRCStairs.STAIR_WOOL_LIME,
            ABRCStairs.STAIR_WOOL_PINK,
            ABRCStairs.STAIR_WOOL_GRAY,
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY,
            ABRCStairs.STAIR_WOOL_CYAN,
            ABRCStairs.STAIR_WOOL_PURPLE,
            ABRCStairs.STAIR_WOOL_BLUE,
            ABRCStairs.STAIR_WOOL_BROWN,
            ABRCStairs.STAIR_WOOL_GREEN,
            ABRCStairs.STAIR_WOOL_RED
    };
    public static final Block[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE,
            ABRCButtons.BUTTON_BRIGHT_ORANGE,
            ABRCButtons.BUTTON_BRIGHT_MAGENTA,
            ABRCButtons.BUTTON_BRIGHT_YELLOW,
            ABRCButtons.BUTTON_BRIGHT_CYAN,
            ABRCButtons.BUTTON_BRIGHT_BLUE,
            ABRCButtons.BUTTON_BRIGHT_GREEN,
            ABRCButtons.BUTTON_BRIGHT_RED,
            ABRCButtons.BUTTON_BRIGHT_BLACK,
            ABRCButtons.BUTTON_WOOL_WHITE,
            ABRCButtons.BUTTON_WOOL_ORANGE,
            ABRCButtons.BUTTON_WOOL_MAGENTA,
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE,
            ABRCButtons.BUTTON_WOOL_YELLOW,
            ABRCButtons.BUTTON_WOOL_LIME,
            ABRCButtons.BUTTON_WOOL_PINK,
            ABRCButtons.BUTTON_WOOL_GRAY,
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY,
            ABRCButtons.BUTTON_WOOL_CYAN,
            ABRCButtons.BUTTON_WOOL_PURPLE,
            ABRCButtons.BUTTON_WOOL_BLUE,
            ABRCButtons.BUTTON_WOOL_BROWN,
            ABRCButtons.BUTTON_WOOL_GREEN,
            ABRCButtons.BUTTON_WOOL_RED
    };
    public static final Block[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED
    };

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        valueLookupBuilder(BlockTags.BUTTONS).add(BUTTONS);
        valueLookupBuilder(BlockTags.STAIRS).add(STAIRS);
        valueLookupBuilder(BlockTags.SLABS).add(SLABS);
        valueLookupBuilder(BlockTags.PRESSURE_PLATES).add(PRESSURE_PLATES);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_BUTTONS).add(BUTTONS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_STAIRS).add(STAIRS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_SLABS).add(SLABS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_PRESSURE_PLATES).add(PRESSURE_PLATES);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WITHOUT_BORDERS).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WITH_BORDERS).add(BRIGHT_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITH_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WOOL_COLORS).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_BRIGHT_COLORS).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITH_BORDER);
    }
}
