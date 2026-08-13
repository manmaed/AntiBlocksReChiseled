package net.manmaed.antiblocksrechiseled.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import org.jspecify.annotations.Nullable;

import java.util.concurrent.CompletableFuture;
@SuppressWarnings("deprecation")
public class ModItemsTagsProvider extends FabricTagsProvider.ItemTagsProvider {

    public ModItemsTagsProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture, @Nullable BlockTagsProvider blockTagsProvider) {
        super(output, registryLookupFuture, blockTagsProvider);
    }

    public static final ResourceKey[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_ORANGE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_YELLOW_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_CYAN_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_BLUE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_GREEN_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_RED_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_BLACK_BORDER_ITEM.builtInRegistryHolder().key()
    };
    public static final ResourceKey[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_RED_ITEM.builtInRegistryHolder().key(),
            ABRCBrightColors.BRIGHT_BLACK_ITEM.builtInRegistryHolder().key()
    };
    public static final ResourceKey[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_ORANGE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_MAGENTA_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_YELLOW_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIME_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_PINK_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_GRAY_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_CYAN_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_PURPLE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_BLUE_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_BROWN_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_GREEN_BORDER_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_RED_BORDER_ITEM.builtInRegistryHolder().key()
    };

    public static final ResourceKey[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIME_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_PINK_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_PURPLE_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_BROWN_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCWoolColors.WOOL_RED_ITEM.builtInRegistryHolder().key()
    };

    public static final ResourceKey[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_BRIGHT_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_BLACK_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_BRIGHT_RED_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_LIME_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_PINK_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_PURPLE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_BROWN_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCSlabs.SLAB_WOOL_RED_ITEM.builtInRegistryHolder().key()
    };
    public static final ResourceKey[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_BLACK_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_BRIGHT_RED_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_LIME_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_PINK_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_PURPLE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_BROWN_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCStairs.STAIR_WOOL_RED_ITEM.builtInRegistryHolder().key()
    };
    public static final ResourceKey[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_RED_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_BRIGHT_BLACK_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_LIME_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_PINK_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_PURPLE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_BROWN_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCButtons.BUTTON_WOOL_RED_ITEM.builtInRegistryHolder().key()
    };
    public static final ResourceKey[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN_ITEM.builtInRegistryHolder().key(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED_ITEM.builtInRegistryHolder().key()
    };

    @Override
    protected void addTags(HolderLookup.Provider registries) {
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
