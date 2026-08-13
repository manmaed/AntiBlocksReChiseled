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

    public static final ResourceKey[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_ORANGE_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_YELLOW_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_CYAN_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_BLUE_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_GREEN_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_RED_BORDER.properties().blockId(),
            ABRCBrightColors.BRIGHT_BLACK_BORDER.properties().blockId()
    };
    public static final ResourceKey[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE.properties().blockId(),
            ABRCBrightColors.BRIGHT_ORANGE.properties().blockId(),
            ABRCBrightColors.BRIGHT_MAGENTA.properties().blockId(),
            ABRCBrightColors.BRIGHT_YELLOW.properties().blockId(),
            ABRCBrightColors.BRIGHT_CYAN.properties().blockId(),
            ABRCBrightColors.BRIGHT_BLUE.properties().blockId(),
            ABRCBrightColors.BRIGHT_GREEN.properties().blockId(),
            ABRCBrightColors.BRIGHT_RED.properties().blockId(),
            ABRCBrightColors.BRIGHT_BLACK.properties().blockId()
    };
    public static final ResourceKey[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_ORANGE_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_MAGENTA_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_YELLOW_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_LIME_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_PINK_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_GRAY_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_CYAN_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_PURPLE_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_BLUE_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_BROWN_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_GREEN_BORDER.properties().blockId(),
            ABRCWoolColors.WOOL_RED_BORDER.properties().blockId()
    };

    public static final ResourceKey[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE.properties().blockId(),
            ABRCWoolColors.WOOL_ORANGE.properties().blockId(),
            ABRCWoolColors.WOOL_MAGENTA.properties().blockId(),
            ABRCWoolColors.WOOL_LIGHT_BLUE.properties().blockId(),
            ABRCWoolColors.WOOL_YELLOW.properties().blockId(),
            ABRCWoolColors.WOOL_LIME.properties().blockId(),
            ABRCWoolColors.WOOL_PINK.properties().blockId(),
            ABRCWoolColors.WOOL_GRAY.properties().blockId(),
            ABRCWoolColors.WOOL_LIGHT_GRAY.properties().blockId(),
            ABRCWoolColors.WOOL_CYAN.properties().blockId(),
            ABRCWoolColors.WOOL_PURPLE.properties().blockId(),
            ABRCWoolColors.WOOL_BLUE.properties().blockId(),
            ABRCWoolColors.WOOL_BROWN.properties().blockId(),
            ABRCWoolColors.WOOL_GREEN.properties().blockId(),
            ABRCWoolColors.WOOL_RED.properties().blockId()
    };

    public static final ResourceKey[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_BRIGHT_WHITE.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_BLACK.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_ORANGE.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_MAGENTA.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_YELLOW.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_CYAN.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_BLUE.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_GREEN.properties().blockId(),
            ABRCSlabs.SLAB_BRIGHT_RED.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_WHITE.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_ORANGE.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_MAGENTA.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_YELLOW.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_LIME.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_PINK.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_GRAY.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_CYAN.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_PURPLE.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_BLUE.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_BROWN.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_GREEN.properties().blockId(),
            ABRCSlabs.SLAB_WOOL_RED.properties().blockId()
    };
    public static final ResourceKey[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_BLACK.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_ORANGE.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_MAGENTA.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_YELLOW.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_CYAN.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_BLUE.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_GREEN.properties().blockId(),
            ABRCStairs.STAIR_BRIGHT_RED.properties().blockId(),
            ABRCStairs.STAIR_WOOL_WHITE.properties().blockId(),
            ABRCStairs.STAIR_WOOL_ORANGE.properties().blockId(),
            ABRCStairs.STAIR_WOOL_MAGENTA.properties().blockId(),
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE.properties().blockId(),
            ABRCStairs.STAIR_WOOL_YELLOW.properties().blockId(),
            ABRCStairs.STAIR_WOOL_LIME.properties().blockId(),
            ABRCStairs.STAIR_WOOL_PINK.properties().blockId(),
            ABRCStairs.STAIR_WOOL_GRAY.properties().blockId(),
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY.properties().blockId(),
            ABRCStairs.STAIR_WOOL_CYAN.properties().blockId(),
            ABRCStairs.STAIR_WOOL_PURPLE.properties().blockId(),
            ABRCStairs.STAIR_WOOL_BLUE.properties().blockId(),
            ABRCStairs.STAIR_WOOL_BROWN.properties().blockId(),
            ABRCStairs.STAIR_WOOL_GREEN.properties().blockId(),
            ABRCStairs.STAIR_WOOL_RED.properties().blockId()
    };
    public static final ResourceKey[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_ORANGE.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_MAGENTA.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_YELLOW.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_CYAN.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_BLUE.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_GREEN.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_RED.properties().blockId(),
            ABRCButtons.BUTTON_BRIGHT_BLACK.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_WHITE.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_ORANGE.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_MAGENTA.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_YELLOW.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_LIME.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_PINK.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_GRAY.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_CYAN.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_PURPLE.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_BLUE.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_BROWN.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_GREEN.properties().blockId(),
            ABRCButtons.BUTTON_WOOL_RED.properties().blockId()
    };
    public static final ResourceKey[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.properties().blockId(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.properties().blockId()
    };

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        tag(BlockTags.NEEDS_IRON_TOOL).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        tag(BlockTags.BUTTONS).add(BUTTONS);
        tag(BlockTags.STAIRS).add(STAIRS);
        tag(BlockTags.SLABS).add(SLABS);
        tag(BlockTags.PRESSURE_PLATES).add(PRESSURE_PLATES);
        tag(ABRCTags.ANTIBLOCK_BUTTONS).add(BUTTONS);
        tag(ABRCTags.ANTIBLOCK_STAIRS).add(STAIRS);
        tag(ABRCTags.ANTIBLOCK_SLABS).add(SLABS);
        tag(ABRCTags.ANTIBLOCK_PRESSURE_PLATES).add(PRESSURE_PLATES);
        tag(ABRCTags.ANTIBLOCK_WITHOUT_BORDERS).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        tag(ABRCTags.ANTIBLOCK_WITH_BORDERS).add(BRIGHT_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITH_BORDER);
        tag(ABRCTags.ANTIBLOCK_WOOL_COLORS).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        tag(ABRCTags.ANTIBLOCK_BRIGHT_COLORS).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITH_BORDER);
    }
}
