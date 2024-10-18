package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.block.Block;
import net.minecraft.data.server.tag.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemsTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture, @Nullable BlockTagProvider blockTagProvider) {
        super(output, completableFuture, blockTagProvider);
    }

    public static final Item[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_ORANGE_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_YELLOW_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_CYAN_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_BLUE_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_GREEN_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_RED_BORDER_ITEM,
            ABRCBrightColors.BRIGHT_BLACK_BORDER_ITEM
    };
    public static final Item[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE_ITEM,
            ABRCBrightColors.BRIGHT_ORANGE_ITEM,
            ABRCBrightColors.BRIGHT_MAGENTA_ITEM,
            ABRCBrightColors.BRIGHT_YELLOW_ITEM,
            ABRCBrightColors.BRIGHT_CYAN_ITEM,
            ABRCBrightColors.BRIGHT_BLUE_ITEM,
            ABRCBrightColors.BRIGHT_GREEN_ITEM,
            ABRCBrightColors.BRIGHT_RED_ITEM,
            ABRCBrightColors.BRIGHT_BLACK_ITEM
    };
    public static final Item[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER_ITEM,
            ABRCWoolColors.WOOL_ORANGE_BORDER_ITEM,
            ABRCWoolColors.WOOL_MAGENTA_BORDER_ITEM,
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER_ITEM,
            ABRCWoolColors.WOOL_YELLOW_BORDER_ITEM,
            ABRCWoolColors.WOOL_LIME_BORDER_ITEM,
            ABRCWoolColors.WOOL_PINK_BORDER_ITEM,
            ABRCWoolColors.WOOL_GRAY_BORDER_ITEM,
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER_ITEM,
            ABRCWoolColors.WOOL_CYAN_BORDER_ITEM,
            ABRCWoolColors.WOOL_PURPLE_BORDER_ITEM,
            ABRCWoolColors.WOOL_BLUE_BORDER_ITEM,
            ABRCWoolColors.WOOL_BROWN_BORDER_ITEM,
            ABRCWoolColors.WOOL_GREEN_BORDER_ITEM,
            ABRCWoolColors.WOOL_RED_BORDER_ITEM
    };

    public static final Item[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_ITEM,
            ABRCWoolColors.WOOL_ORANGE_ITEM,
            ABRCWoolColors.WOOL_MAGENTA_ITEM,
            ABRCWoolColors.WOOL_LIGHT_BLUE_ITEM,
            ABRCWoolColors.WOOL_YELLOW_ITEM,
            ABRCWoolColors.WOOL_LIME_ITEM,
            ABRCWoolColors.WOOL_PINK_ITEM,
            ABRCWoolColors.WOOL_GRAY_ITEM,
            ABRCWoolColors.WOOL_LIGHT_GRAY_ITEM,
            ABRCWoolColors.WOOL_CYAN_ITEM,
            ABRCWoolColors.WOOL_PURPLE_ITEM,
            ABRCWoolColors.WOOL_BLUE_ITEM,
            ABRCWoolColors.WOOL_BROWN_ITEM,
            ABRCWoolColors.WOOL_GREEN_ITEM,
            ABRCWoolColors.WOOL_RED_ITEM
    };

    public static final Item[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_WHITE_BRIGHT_ITEM,
            ABRCSlabs.SLAB_BLACK_ITEM,
            ABRCSlabs.SLAB_ORANGE_BRIGHT_ITEM,
            ABRCSlabs.SLAB_MAGENTA_BRIGHT_ITEM,
            ABRCSlabs.SLAB_YELLOW_BRIGHT_ITEM,
            ABRCSlabs.SLAB_CYAN_BRIGHT_ITEM,
            ABRCSlabs.SLAB_BLUE_BRIGHT_ITEM,
            ABRCSlabs.SLAB_GREEN_BRIGHT_ITEM,
            ABRCSlabs.SLAB_RED_BRIGHT_ITEM,
            ABRCSlabs.SLAB_WHITE_WOOL_ITEM,
            ABRCSlabs.SLAB_ORANGE_WOOL_ITEM,
            ABRCSlabs.SLAB_MAGENTA_WOOL_ITEM,
            ABRCSlabs.SLAB_LIGHT_BLUE_WOOL_ITEM,
            ABRCSlabs.SLAB_YELLOW_WOOL_ITEM,
            ABRCSlabs.SLAB_LIME_WOOL_ITEM,
            ABRCSlabs.SLAB_PINK_WOOL_ITEM,
            ABRCSlabs.SLAB_GRAY_WOOL_ITEM,
            ABRCSlabs.SLAB_LIGHT_GRAY_WOOL_ITEM,
            ABRCSlabs.SLAB_CYAN_WOOL_ITEM,
            ABRCSlabs.SLAB_PURPLE_WOOL_ITEM,
            ABRCSlabs.SLAB_BLUE_WOOL_ITEM,
            ABRCSlabs.SLAB_BROWN_WOOL_ITEM,
            ABRCSlabs.SLAB_GREEN_WOOL_ITEM,
            ABRCSlabs.SLAB_RED_WOOL_ITEM
    };
    public static final Item[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_WHITE_BRIGHT_ITEM,
            ABRCStairs.STAIR_BLACK_ITEM,
            ABRCStairs.STAIR_ORANGE_BRIGHT_ITEM,
            ABRCStairs.STAIR_MAGENTA_BRIGHT_ITEM,
            ABRCStairs.STAIR_YELLOW_BRIGHT_ITEM,
            ABRCStairs.STAIR_CYAN_BRIGHT_ITEM,
            ABRCStairs.STAIR_BLUE_BRIGHT_ITEM,
            ABRCStairs.STAIR_GREEN_BRIGHT_ITEM,
            ABRCStairs.STAIR_RED_BRIGHT_ITEM,
            ABRCStairs.STAIR_WHITE_WOOL_ITEM,
            ABRCStairs.STAIR_ORANGE_WOOL_ITEM,
            ABRCStairs.STAIR_MAGENTA_WOOL_ITEM,
            ABRCStairs.STAIR_LIGHT_BLUE_WOOL_ITEM,
            ABRCStairs.STAIR_YELLOW_WOOL_ITEM,
            ABRCStairs.STAIR_LIME_WOOL_ITEM,
            ABRCStairs.STAIR_PINK_WOOL_ITEM,
            ABRCStairs.STAIR_GRAY_WOOL_ITEM,
            ABRCStairs.STAIR_LIGHT_GRAY_WOOL_ITEM,
            ABRCStairs.STAIR_CYAN_WOOL_ITEM,
            ABRCStairs.STAIR_PURPLE_WOOL_ITEM,
            ABRCStairs.STAIR_BLUE_WOOL_ITEM,
            ABRCStairs.STAIR_BROWN_WOOL_ITEM,
            ABRCStairs.STAIR_GREEN_WOOL_ITEM,
            ABRCStairs.STAIR_RED_WOOL_ITEM
    };
    public static final Item[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE_ITEM,
            ABRCButtons.BUTTON_BRIGHT_ORANGE_ITEM,
            ABRCButtons.BUTTON_BRIGHT_MAGENTA_ITEM,
            ABRCButtons.BUTTON_BRIGHT_YELLOW_ITEM,
            ABRCButtons.BUTTON_BRIGHT_CYAN_ITEM,
            ABRCButtons.BUTTON_BRIGHT_BLUE_ITEM,
            ABRCButtons.BUTTON_BRIGHT_GREEN_ITEM,
            ABRCButtons.BUTTON_BRIGHT_RED_ITEM,
            ABRCButtons.BUTTON_BRIGHT_BLACK_ITEM,
            ABRCButtons.BUTTON_WOOL_WHITE_ITEM,
            ABRCButtons.BUTTON_WOOL_ORANGE_ITEM,
            ABRCButtons.BUTTON_WOOL_MAGENTA_ITEM,
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE_ITEM,
            ABRCButtons.BUTTON_WOOL_YELLOW_ITEM,
            ABRCButtons.BUTTON_WOOL_LIME_ITEM,
            ABRCButtons.BUTTON_WOOL_PINK_ITEM,
            ABRCButtons.BUTTON_WOOL_GRAY_ITEM,
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY_ITEM,
            ABRCButtons.BUTTON_WOOL_CYAN_ITEM,
            ABRCButtons.BUTTON_WOOL_PURPLE_ITEM,
            ABRCButtons.BUTTON_WOOL_BLUE_ITEM,
            ABRCButtons.BUTTON_WOOL_BROWN_ITEM,
            ABRCButtons.BUTTON_WOOL_GREEN_ITEM,
            ABRCButtons.BUTTON_WOOL_RED_ITEM
    };
    public static final Item[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN_ITEM,
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED_ITEM
    };

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.BUTTONS).add(BUTTONS);
        getOrCreateTagBuilder(ItemTags.STAIRS).add(STAIRS);
        getOrCreateTagBuilder(ItemTags.SLABS).add(SLABS);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_BUTTONS_ITEM).add(BUTTONS);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_STAIRS_ITEM).add(STAIRS);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_SLABS_ITEM).add(SLABS);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_PRESSURE_PLATES_ITEM).add(PRESSURE_PLATES);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_WITHOUT_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_WITH_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITH_BORDER);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_WOOL_COLORS_ITEM).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        getOrCreateTagBuilder(ABRCTags.ANTIBLOCK_BRIGHT_COLORS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITH_BORDER);

    }
}
