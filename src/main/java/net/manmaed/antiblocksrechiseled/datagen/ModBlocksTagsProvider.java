package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlocksTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    public static final Block[] BIGHT_BLOCKS = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE,
            ABRCBrightColors.BRIGHT_ORANGE,
            ABRCBrightColors.BRIGHT_MAGENTA,
            ABRCBrightColors.BRIGHT_YELLOW,
            ABRCBrightColors.BRIGHT_CYAN,
            ABRCBrightColors.BRIGHT_BLUE,
            ABRCBrightColors.BRIGHT_GREEN,
            ABRCBrightColors.BRIGHT_RED,
            ABRCBrightColors.BRIGHT_BLACK,
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
    public static final Block[] WOOL_BLOCKS = {
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
            ABRCWoolColors.WOOL_RED,
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

    public static final Block[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_WHITE_BRIGHT,
            ABRCSlabs.SLAB_BLACK,
            ABRCSlabs.SLAB_ORANGE_BRIGHT,
            ABRCSlabs.SLAB_MAGENTA_BRIGHT,
            ABRCSlabs.SLAB_YELLOW_BRIGHT,
            ABRCSlabs.SLAB_CYAN_BRIGHT,
            ABRCSlabs.SLAB_BLUE_BRIGHT,
            ABRCSlabs.SLAB_GREEN_BRIGHT,
            ABRCSlabs.SLAB_RED_BRIGHT,
            ABRCSlabs.SLAB_WHITE_WOOL,
            ABRCSlabs.SLAB_ORANGE_WOOL,
            ABRCSlabs.SLAB_MAGENTA_WOOL,
            ABRCSlabs.SLAB_LIGHT_BLUE_WOOL,
            ABRCSlabs.SLAB_YELLOW_WOOL,
            ABRCSlabs.SLAB_LIME_WOOL,
            ABRCSlabs.SLAB_PINK_WOOL,
            ABRCSlabs.SLAB_GRAY_WOOL,
            ABRCSlabs.SLAB_LIGHT_GRAY_WOOL,
            ABRCSlabs.SLAB_CYAN_WOOL,
            ABRCSlabs.SLAB_PURPLE_WOOL,
            ABRCSlabs.SLAB_BLUE_WOOL,
            ABRCSlabs.SLAB_BROWN_WOOL,
            ABRCSlabs.SLAB_GREEN_WOOL,
            ABRCSlabs.SLAB_RED_WOOL
    };
    public static final Block[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_WHITE_BRIGHT,
            ABRCStairs.STAIR_BLACK,
            ABRCStairs.STAIR_ORANGE_BRIGHT,
            ABRCStairs.STAIR_MAGENTA_BRIGHT,
            ABRCStairs.STAIR_YELLOW_BRIGHT,
            ABRCStairs.STAIR_CYAN_BRIGHT,
            ABRCStairs.STAIR_BLUE_BRIGHT,
            ABRCStairs.STAIR_GREEN_BRIGHT,
            ABRCStairs.STAIR_RED_BRIGHT,
            ABRCStairs.STAIR_WHITE_WOOL,
            ABRCStairs.STAIR_ORANGE_WOOL,
            ABRCStairs.STAIR_MAGENTA_WOOL,
            ABRCStairs.STAIR_LIGHT_BLUE_WOOL,
            ABRCStairs.STAIR_YELLOW_WOOL,
            ABRCStairs.STAIR_LIME_WOOL,
            ABRCStairs.STAIR_PINK_WOOL,
            ABRCStairs.STAIR_GRAY_WOOL,
            ABRCStairs.STAIR_LIGHT_GRAY_WOOL,
            ABRCStairs.STAIR_CYAN_WOOL,
            ABRCStairs.STAIR_PURPLE_WOOL,
            ABRCStairs.STAIR_BLUE_WOOL,
            ABRCStairs.STAIR_BROWN_WOOL,
            ABRCStairs.STAIR_GREEN_WOOL,
            ABRCStairs.STAIR_RED_WOOL
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
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(BIGHT_BLOCKS).add(WOOL_BLOCKS).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(BIGHT_BLOCKS).add(WOOL_BLOCKS).add(SLABS).add(STAIRS).add(BUTTONS).add(PRESSURE_PLATES);
        getOrCreateTagBuilder(BlockTags.BUTTONS).add(BUTTONS);
        getOrCreateTagBuilder(BlockTags.STAIRS).add(STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS).add(SLABS);
        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).add(PRESSURE_PLATES);
    }
}
