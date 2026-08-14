package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.manmaed.antiblocksrechiseled.tag.ABRCTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.VanillaBlockTagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeBlockTagsProvider;
import org.jetbrains.annotations.Nullable;
import org.osgi.resource.Resource;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends VanillaBlockTagsProvider {

    public ModBlocksTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
    }

    public static final ResourceKey[] BRIGHT_BLOCKS_WITH_BORDER = {
            ABRCBrightColors.BRIGHT_WHITE_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_ORANGE_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_MAGENTA_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_YELLOW_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_CYAN_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_BLUE_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_GREEN_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_RED_BORDER.getKey(),
            ABRCBrightColors.BRIGHT_BLACK_BORDER.getKey()
    };
    public static final ResourceKey[] BRIGHT_BLOCKS_WITHOUT_BORDER = {
            //Bright Colors
            ABRCBrightColors.BRIGHT_WHITE.getKey(),
            ABRCBrightColors.BRIGHT_ORANGE.getKey(),
            ABRCBrightColors.BRIGHT_MAGENTA.getKey(),
            ABRCBrightColors.BRIGHT_YELLOW.getKey(),
            ABRCBrightColors.BRIGHT_CYAN.getKey(),
            ABRCBrightColors.BRIGHT_BLUE.getKey(),
            ABRCBrightColors.BRIGHT_GREEN.getKey(),
            ABRCBrightColors.BRIGHT_RED.getKey(),
            ABRCBrightColors.BRIGHT_BLACK.getKey()
    };
    public static final ResourceKey[] WOOL_BLOCKS_WITH_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE_BORDER.getKey(),
            ABRCWoolColors.WOOL_ORANGE_BORDER.getKey(),
            ABRCWoolColors.WOOL_MAGENTA_BORDER.getKey(),
            ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.getKey(),
            ABRCWoolColors.WOOL_YELLOW_BORDER.getKey(),
            ABRCWoolColors.WOOL_LIME_BORDER.getKey(),
            ABRCWoolColors.WOOL_PINK_BORDER.getKey(),
            ABRCWoolColors.WOOL_GRAY_BORDER.getKey(),
            ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.getKey(),
            ABRCWoolColors.WOOL_CYAN_BORDER.getKey(),
            ABRCWoolColors.WOOL_PURPLE_BORDER.getKey(),
            ABRCWoolColors.WOOL_BLUE_BORDER.getKey(),
            ABRCWoolColors.WOOL_BROWN_BORDER.getKey(),
            ABRCWoolColors.WOOL_GREEN_BORDER.getKey(),
            ABRCWoolColors.WOOL_RED_BORDER.getKey()
    };

    public static final ResourceKey[] WOOL_BLOCKS_WITHOUT_BORDER = {
            //Wool Colors
            ABRCWoolColors.WOOL_WHITE.getKey(),
            ABRCWoolColors.WOOL_ORANGE.getKey(),
            ABRCWoolColors.WOOL_MAGENTA.getKey(),
            ABRCWoolColors.WOOL_LIGHT_BLUE.getKey(),
            ABRCWoolColors.WOOL_YELLOW.getKey(),
            ABRCWoolColors.WOOL_LIME.getKey(),
            ABRCWoolColors.WOOL_PINK.getKey(),
            ABRCWoolColors.WOOL_GRAY.getKey(),
            ABRCWoolColors.WOOL_LIGHT_GRAY.getKey(),
            ABRCWoolColors.WOOL_CYAN.getKey(),
            ABRCWoolColors.WOOL_PURPLE.getKey(),
            ABRCWoolColors.WOOL_BLUE.getKey(),
            ABRCWoolColors.WOOL_BROWN.getKey(),
            ABRCWoolColors.WOOL_GREEN.getKey(),
            ABRCWoolColors.WOOL_RED.getKey()
    };

    public static final ResourceKey[] SLABS = {
            //Slabs
            ABRCSlabs.SLAB_BRIGHT_WHITE.getKey(),
            ABRCSlabs.SLAB_BRIGHT_BLACK.getKey(),
            ABRCSlabs.SLAB_BRIGHT_ORANGE.getKey(),
            ABRCSlabs.SLAB_BRIGHT_MAGENTA.getKey(),
            ABRCSlabs.SLAB_BRIGHT_YELLOW.getKey(),
            ABRCSlabs.SLAB_BRIGHT_CYAN.getKey(),
            ABRCSlabs.SLAB_BRIGHT_BLUE.getKey(),
            ABRCSlabs.SLAB_BRIGHT_GREEN.getKey(),
            ABRCSlabs.SLAB_BRIGHT_RED.getKey(),
            ABRCSlabs.SLAB_WOOL_WHITE.getKey(),
            ABRCSlabs.SLAB_WOOL_ORANGE.getKey(),
            ABRCSlabs.SLAB_WOOL_MAGENTA.getKey(),
            ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.getKey(),
            ABRCSlabs.SLAB_WOOL_YELLOW.getKey(),
            ABRCSlabs.SLAB_WOOL_LIME.getKey(),
            ABRCSlabs.SLAB_WOOL_PINK.getKey(),
            ABRCSlabs.SLAB_WOOL_GRAY.getKey(),
            ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.getKey(),
            ABRCSlabs.SLAB_WOOL_CYAN.getKey(),
            ABRCSlabs.SLAB_WOOL_PURPLE.getKey(),
            ABRCSlabs.SLAB_WOOL_BLUE.getKey(),
            ABRCSlabs.SLAB_WOOL_BROWN.getKey(),
            ABRCSlabs.SLAB_WOOL_GREEN.getKey(),
            ABRCSlabs.SLAB_WOOL_RED.getKey()
    };
    public static final ResourceKey[] STAIRS = {
            //Stairs
            ABRCStairs.STAIR_BRIGHT_WHITE.getKey(),
            ABRCStairs.STAIR_BRIGHT_BLACK.getKey(),
            ABRCStairs.STAIR_BRIGHT_ORANGE.getKey(),
            ABRCStairs.STAIR_BRIGHT_MAGENTA.getKey(),
            ABRCStairs.STAIR_BRIGHT_YELLOW.getKey(),
            ABRCStairs.STAIR_BRIGHT_CYAN.getKey(),
            ABRCStairs.STAIR_BRIGHT_BLUE.getKey(),
            ABRCStairs.STAIR_BRIGHT_GREEN.getKey(),
            ABRCStairs.STAIR_BRIGHT_RED.getKey(),
            ABRCStairs.STAIR_WOOL_WHITE.getKey(),
            ABRCStairs.STAIR_WOOL_ORANGE.getKey(),
            ABRCStairs.STAIR_WOOL_MAGENTA.getKey(),
            ABRCStairs.STAIR_WOOL_LIGHT_BLUE.getKey(),
            ABRCStairs.STAIR_WOOL_YELLOW.getKey(),
            ABRCStairs.STAIR_WOOL_LIME.getKey(),
            ABRCStairs.STAIR_WOOL_PINK.getKey(),
            ABRCStairs.STAIR_WOOL_GRAY.getKey(),
            ABRCStairs.STAIR_WOOL_LIGHT_GRAY.getKey(),
            ABRCStairs.STAIR_WOOL_CYAN.getKey(),
            ABRCStairs.STAIR_WOOL_PURPLE.getKey(),
            ABRCStairs.STAIR_WOOL_BLUE.getKey(),
            ABRCStairs.STAIR_WOOL_BROWN.getKey(),
            ABRCStairs.STAIR_WOOL_GREEN.getKey(),
            ABRCStairs.STAIR_WOOL_RED.getKey()
    };
    public static final ResourceKey[] BUTTONS = {
            ABRCButtons.BUTTON_BRIGHT_WHITE.getKey(),
            ABRCButtons.BUTTON_BRIGHT_ORANGE.getKey(),
            ABRCButtons.BUTTON_BRIGHT_MAGENTA.getKey(),
            ABRCButtons.BUTTON_BRIGHT_YELLOW.getKey(),
            ABRCButtons.BUTTON_BRIGHT_CYAN.getKey(),
            ABRCButtons.BUTTON_BRIGHT_BLUE.getKey(),
            ABRCButtons.BUTTON_BRIGHT_GREEN.getKey(),
            ABRCButtons.BUTTON_BRIGHT_RED.getKey(),
            ABRCButtons.BUTTON_BRIGHT_BLACK.getKey(),
            ABRCButtons.BUTTON_WOOL_WHITE.getKey(),
            ABRCButtons.BUTTON_WOOL_ORANGE.getKey(),
            ABRCButtons.BUTTON_WOOL_MAGENTA.getKey(),
            ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.getKey(),
            ABRCButtons.BUTTON_WOOL_YELLOW.getKey(),
            ABRCButtons.BUTTON_WOOL_LIME.getKey(),
            ABRCButtons.BUTTON_WOOL_PINK.getKey(),
            ABRCButtons.BUTTON_WOOL_GRAY.getKey(),
            ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.getKey(),
            ABRCButtons.BUTTON_WOOL_CYAN.getKey(),
            ABRCButtons.BUTTON_WOOL_PURPLE.getKey(),
            ABRCButtons.BUTTON_WOOL_BLUE.getKey(),
            ABRCButtons.BUTTON_WOOL_BROWN.getKey(),
            ABRCButtons.BUTTON_WOOL_GREEN.getKey(),
            ABRCButtons.BUTTON_WOOL_RED.getKey()
    };
    public static final ResourceKey[] PRESSURE_PLATES = {
            //Pressure Plates
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.getKey(),
            ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.getKey()
    };

    @Override
    protected void addTags(HolderLookup.Provider provider) {
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
