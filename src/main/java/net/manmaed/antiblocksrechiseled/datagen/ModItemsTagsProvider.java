package net.manmaed.antiblocksrechiseled.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemsTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
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
            ABRCSlabs.SLAB_BRIGHT_WHITE_ITEM,
            ABRCSlabs.SLAB_BRIGHT_BLACK_ITEM,
            ABRCSlabs.SLAB_BRIGHT_ORANGE_ITEM,
            ABRCSlabs.SLAB_BRIGHT_MAGENTA_ITEM,
            ABRCSlabs.SLAB_BRIGHT_YELLOW_ITEM,
            ABRCSlabs.SLAB_BRIGHT_CYAN_ITEM,
            ABRCSlabs.SLAB_BRIGHT_BLUE_ITEM,
            ABRCSlabs.SLAB_BRIGHT_GREEN_ITEM,
            ABRCSlabs.SLAB_BRIGHT_RED_ITEM,
            ABRCSlabs.SLAB_WOOL_WHITE_ITEM,
            ABRCSlabs.SLAB_WOOL_ORANGE_ITEM,
            ABRCSlabs.SLAB_WOOL_MAGENTA_ITEM,
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE_ITEM,
            ABRCSlabs.SLAB_WOOL_YELLOW_ITEM,
            ABRCSlabs.SLAB_WOOL_LIME_ITEM,
            ABRCSlabs.SLAB_WOOL_PINK_ITEM,
            ABRCSlabs.SLAB_WOOL_GRAY_ITEM,
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY_ITEM,
            ABRCSlabs.SLAB_WOOL_CYAN_ITEM,
            ABRCSlabs.SLAB_WOOL_PURPLE_ITEM,
            ABRCSlabs.SLAB_WOOL_BLUE_ITEM,
            ABRCSlabs.SLAB_WOOL_BROWN_ITEM,
            ABRCSlabs.SLAB_WOOL_GREEN_ITEM,
            ABRCSlabs.SLAB_WOOL_RED_ITEM
    };
    public static final Item[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE_ITEM,
            ABRCStairs.STAIR_BRIGHT_BLACK_ITEM,
            ABRCStairs.STAIR_BRIGHT_ORANGE_ITEM,
            ABRCStairs.STAIR_BRIGHT_MAGENTA_ITEM,
            ABRCStairs.STAIR_BRIGHT_YELLOW_ITEM,
            ABRCStairs.STAIR_BRIGHT_CYAN_ITEM,
            ABRCStairs.STAIR_BRIGHT_BLUE_ITEM,
            ABRCStairs.STAIR_BRIGHT_GREEN_ITEM,
            ABRCStairs.STAIR_BRIGHT_RED_ITEM,
            ABRCStairs.STAIR_WOOL_WHITE_ITEM,
            ABRCStairs.STAIR_WOOL_ORANGE_ITEM,
            ABRCStairs.STAIR_WOOL_MAGENTA_ITEM,
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE_ITEM,
            ABRCStairs.STAIR_WOOL_YELLOW_ITEM,
            ABRCStairs.STAIR_WOOL_LIME_ITEM,
            ABRCStairs.STAIR_WOOL_PINK_ITEM,
            ABRCStairs.STAIR_WOOL_GRAY_ITEM,
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY_ITEM,
            ABRCStairs.STAIR_WOOL_CYAN_ITEM,
            ABRCStairs.STAIR_WOOL_PURPLE_ITEM,
            ABRCStairs.STAIR_WOOL_BLUE_ITEM,
            ABRCStairs.STAIR_WOOL_BROWN_ITEM,
            ABRCStairs.STAIR_WOOL_GREEN_ITEM,
            ABRCStairs.STAIR_WOOL_RED_ITEM
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
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ItemTags.BUTTONS).add(BUTTONS);
        valueLookupBuilder(ItemTags.STAIRS).add(STAIRS);
        valueLookupBuilder(ItemTags.SLABS).add(SLABS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_BUTTONS_ITEM).add(BUTTONS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_STAIRS_ITEM).add(STAIRS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_SLABS_ITEM).add(SLABS);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_PRESSURE_PLATES_ITEM).add(PRESSURE_PLATES);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WITHOUT_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WITH_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITH_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_WOOL_COLORS_ITEM).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        valueLookupBuilder(ABRCTags.ANTIBLOCK_BRIGHT_COLORS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITH_BORDER);

    }
}
