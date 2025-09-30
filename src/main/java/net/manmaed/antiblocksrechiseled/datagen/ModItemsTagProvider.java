package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemsTagProvider extends ItemTagsProvider {
    public ModItemsTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, AntiBlocksReChiseled.MOD_ID);
    }

    public static final Item[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_ORANGE_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_YELLOW_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_CYAN_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_BLUE_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_GREEN_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_RED_BORDER_ITEM.get(),
            ABRCBrightColors.BRIGHT_BLACK_BORDER_ITEM.get()
    };
    public static final Item[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE_ITEM.get(),
            ABRCBrightColors.BRIGHT_ORANGE_ITEM.get(),
            ABRCBrightColors.BRIGHT_MAGENTA_ITEM.get(),
            ABRCBrightColors.BRIGHT_YELLOW_ITEM.get(),
            ABRCBrightColors.BRIGHT_CYAN_ITEM.get(),
            ABRCBrightColors.BRIGHT_BLUE_ITEM.get(),
            ABRCBrightColors.BRIGHT_GREEN_ITEM.get(),
            ABRCBrightColors.BRIGHT_RED_ITEM.get(),
            ABRCBrightColors.BRIGHT_BLACK_ITEM.get()
    };
    public static final Item[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_ORANGE_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_MAGENTA_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_YELLOW_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_LIME_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_PINK_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_GRAY_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_CYAN_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_PURPLE_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_BLUE_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_BROWN_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_GREEN_BORDER_ITEM.get(),
            ABRCWoolColors.WOOL_RED_BORDER_ITEM.get()
    };

    public static final Item[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_ITEM.get(),
            ABRCWoolColors.WOOL_ORANGE_ITEM.get(),
            ABRCWoolColors.WOOL_MAGENTA_ITEM.get(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_ITEM.get(),
            ABRCWoolColors.WOOL_YELLOW_ITEM.get(),
            ABRCWoolColors.WOOL_LIME_ITEM.get(),
            ABRCWoolColors.WOOL_PINK_ITEM.get(),
            ABRCWoolColors.WOOL_GRAY_ITEM.get(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_ITEM.get(),
            ABRCWoolColors.WOOL_CYAN_ITEM.get(),
            ABRCWoolColors.WOOL_PURPLE_ITEM.get(),
            ABRCWoolColors.WOOL_BLUE_ITEM.get(),
            ABRCWoolColors.WOOL_BROWN_ITEM.get(),
            ABRCWoolColors.WOOL_GREEN_ITEM.get(),
            ABRCWoolColors.WOOL_RED_ITEM.get()
    };

    public static final Item[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_BRIGHT_WHITE_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_BLACK_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_ORANGE_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_MAGENTA_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_YELLOW_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_CYAN_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_BLUE_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_GREEN_ITEM.get(),
            ABRCSlabs.SLAB_BRIGHT_RED_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_WHITE_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_ORANGE_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_MAGENTA_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_YELLOW_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_LIME_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_PINK_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_GRAY_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_CYAN_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_PURPLE_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_BLUE_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_BROWN_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_GREEN_ITEM.get(),
            ABRCSlabs.SLAB_WOOL_RED_ITEM.get()
    };
    public static final Item[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_BLACK_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_ORANGE_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_MAGENTA_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_YELLOW_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_CYAN_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_BLUE_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_GREEN_ITEM.get(),
            ABRCStairs.STAIR_BRIGHT_RED_ITEM.get(),
            ABRCStairs.STAIR_WOOL_WHITE_ITEM.get(),
            ABRCStairs.STAIR_WOOL_ORANGE_ITEM.get(),
            ABRCStairs.STAIR_WOOL_MAGENTA_ITEM.get(),
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE_ITEM.get(),
            ABRCStairs.STAIR_WOOL_YELLOW_ITEM.get(),
            ABRCStairs.STAIR_WOOL_LIME_ITEM.get(),
            ABRCStairs.STAIR_WOOL_PINK_ITEM.get(),
            ABRCStairs.STAIR_WOOL_GRAY_ITEM.get(),
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY_ITEM.get(),
            ABRCStairs.STAIR_WOOL_CYAN_ITEM.get(),
            ABRCStairs.STAIR_WOOL_PURPLE_ITEM.get(),
            ABRCStairs.STAIR_WOOL_BLUE_ITEM.get(),
            ABRCStairs.STAIR_WOOL_BROWN_ITEM.get(),
            ABRCStairs.STAIR_WOOL_GREEN_ITEM.get(),
            ABRCStairs.STAIR_WOOL_RED_ITEM.get()
    };
    public static final Item[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_ORANGE_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_MAGENTA_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_YELLOW_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_CYAN_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_BLUE_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_GREEN_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_RED_ITEM.get(),
            ABRCButtons.BUTTON_BRIGHT_BLACK_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_WHITE_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_ORANGE_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_MAGENTA_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_YELLOW_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_LIME_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_PINK_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_GRAY_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_CYAN_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_PURPLE_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_BLUE_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_BROWN_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_GREEN_ITEM.get(),
            ABRCButtons.BUTTON_WOOL_RED_ITEM.get()
    };
    public static final Item[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN_ITEM.get(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED_ITEM.get()
    };


    @Override
    protected void addTags(HolderLookup.Provider context) {
        tag(ItemTags.BUTTONS).add(BUTTONS);
        tag(ItemTags.STAIRS).add(STAIRS);
        tag(ItemTags.SLABS).add(SLABS);
        tag(ABRCTags.ANTIBLOCK_BUTTONS_ITEM).add(BUTTONS);
        tag(ABRCTags.ANTIBLOCK_STAIRS_ITEM).add(STAIRS);
        tag(ABRCTags.ANTIBLOCK_SLABS_ITEM).add(SLABS);
        tag(ABRCTags.ANTIBLOCK_PRESSURE_PLATES_ITEM).add(PRESSURE_PLATES);
        tag(ABRCTags.ANTIBLOCK_WITHOUT_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITHOUT_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        tag(ABRCTags.ANTIBLOCK_WITH_BORDERS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITH_BORDER);
        tag(ABRCTags.ANTIBLOCK_WOOL_COLORS_ITEM).add(WOOL_BLOCKS_WITH_BORDER).add(WOOL_BLOCKS_WITHOUT_BORDER);
        tag(ABRCTags.ANTIBLOCK_BRIGHT_COLORS_ITEM).add(BRIGHT_BLOCKS_WITH_BORDER).add(BRIGHT_BLOCKS_WITH_BORDER);
    }
}
