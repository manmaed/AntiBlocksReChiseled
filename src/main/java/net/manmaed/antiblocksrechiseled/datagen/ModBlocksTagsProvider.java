package net.manmaed.antiblocksrechiseled.datagen;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends BlockTagsProvider {
    public ModBlocksTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, AntiBlocksReChiseled.MOD_ID, existingFileHelper);
    }
    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(

                //Bright Colors
                ABRCBrightColors.BRIGHT_WHITE.get(),
                ABRCBrightColors.BRIGHT_ORANGE.get(),
                ABRCBrightColors.BRIGHT_MAGENTA.get(),
                ABRCBrightColors.BRIGHT_YELLOW.get(),
                ABRCBrightColors.BRIGHT_CYAN.get(),
                ABRCBrightColors.BRIGHT_BLUE.get(),
                ABRCBrightColors.BRIGHT_GREEN.get(),
                ABRCBrightColors.BRIGHT_RED.get(),
                ABRCBrightColors.BRIGHT_BLACK.get(),
                ABRCBrightColors.BRIGHT_WHITE_BORDER.get(),
                ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(),
                ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(),
                ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(),
                ABRCBrightColors.BRIGHT_CYAN_BORDER.get(),
                ABRCBrightColors.BRIGHT_BLUE_BORDER.get(),
                ABRCBrightColors.BRIGHT_GREEN_BORDER.get(),
                ABRCBrightColors.BRIGHT_RED_BORDER.get(),
                ABRCBrightColors.BRIGHT_BLACK_BORDER.get(),

                //Wool Colors
                ABRCWoolColors.WOOL_WHITE.get(),
                ABRCWoolColors.WOOL_ORANGE.get(),
                ABRCWoolColors.WOOL_MAGENTA.get(),
                ABRCWoolColors.WOOL_LIGHT_BLUE.get(),
                ABRCWoolColors.WOOL_YELLOW.get(),
                ABRCWoolColors.WOOL_LIME.get(),
                ABRCWoolColors.WOOL_PINK.get(),
                ABRCWoolColors.WOOL_GRAY.get(),
                ABRCWoolColors.WOOL_LIGHT_GRAY.get(),
                ABRCWoolColors.WOOL_CYAN.get(),
                ABRCWoolColors.WOOL_PURPLE.get(),
                ABRCWoolColors.WOOL_BLUE.get(),
                ABRCWoolColors.WOOL_BROWN.get(),
                ABRCWoolColors.WOOL_GREEN.get(),
                ABRCWoolColors.WOOL_RED.get(),
                ABRCWoolColors.WOOL_WHITE_BORDER.get(),
                ABRCWoolColors.WOOL_ORANGE_BORDER.get(),
                ABRCWoolColors.WOOL_MAGENTA_BORDER.get(),
                ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(),
                ABRCWoolColors.WOOL_YELLOW_BORDER.get(),
                ABRCWoolColors.WOOL_LIME_BORDER.get(),
                ABRCWoolColors.WOOL_PINK_BORDER.get(),
                ABRCWoolColors.WOOL_GRAY_BORDER.get(),
                ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(),
                ABRCWoolColors.WOOL_CYAN_BORDER.get(),
                ABRCWoolColors.WOOL_PURPLE_BORDER.get(),
                ABRCWoolColors.WOOL_BLUE_BORDER.get(),
                ABRCWoolColors.WOOL_BROWN_BORDER.get(),
                ABRCWoolColors.WOOL_GREEN_BORDER.get(),
                ABRCWoolColors.WOOL_RED_BORDER.get(),

                //Slabs
                ABRCSlabs.SLAB_WHITE_BRIGHT.get(),
                ABRCSlabs.SLAB_BLACK.get(),
                ABRCSlabs.SLAB_ORANGE_BRIGHT.get(),
                ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(),
                ABRCSlabs.SLAB_YELLOW_BRIGHT.get(),
                ABRCSlabs.SLAB_CYAN_BRIGHT.get(),
                ABRCSlabs.SLAB_BLUE_BRIGHT.get(),
                ABRCSlabs.SLAB_GREEN_BRIGHT.get(),
                ABRCSlabs.SLAB_RED_BRIGHT.get(),
                ABRCSlabs.SLAB_WHITE_WOOL.get(),
                ABRCSlabs.SLAB_ORANGE_WOOL.get(),
                ABRCSlabs.SLAB_MAGENTA_WOOL.get(),
                ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(),
                ABRCSlabs.SLAB_YELLOW_WOOL.get(),
                ABRCSlabs.SLAB_LIME_WOOL.get(),
                ABRCSlabs.SLAB_PINK_WOOL.get(),
                ABRCSlabs.SLAB_GRAY_WOOL.get(),
                ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(),
                ABRCSlabs.SLAB_CYAN_WOOL.get(),
                ABRCSlabs.SLAB_PURPLE_WOOL.get(),
                ABRCSlabs.SLAB_BLUE_WOOL.get(),
                ABRCSlabs.SLAB_BROWN_WOOL.get(),
                ABRCSlabs.SLAB_GREEN_WOOL.get(),
                ABRCSlabs.SLAB_RED_WOOL.get(),

                //Stairs
                ABRCStairs.STAIR_WHITE_BRIGHT.get(),
                ABRCStairs.STAIR_BLACK.get(),
                ABRCStairs.STAIR_ORANGE_BRIGHT.get(),
                ABRCStairs.STAIR_MAGENTA_BRIGHT.get(),
                ABRCStairs.STAIR_YELLOW_BRIGHT.get(),
                ABRCStairs.STAIR_CYAN_BRIGHT.get(),
                ABRCStairs.STAIR_BLUE_BRIGHT.get(),
                ABRCStairs.STAIR_GREEN_BRIGHT.get(),
                ABRCStairs.STAIR_RED_BRIGHT.get(),
                ABRCStairs.STAIR_WHITE_WOOL.get(),
                ABRCStairs.STAIR_ORANGE_WOOL.get(),
                ABRCStairs.STAIR_MAGENTA_WOOL.get(),
                ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(),
                ABRCStairs.STAIR_YELLOW_WOOL.get(),
                ABRCStairs.STAIR_LIME_WOOL.get(),
                ABRCStairs.STAIR_PINK_WOOL.get(),
                ABRCStairs.STAIR_GRAY_WOOL.get(),
                ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(),
                ABRCStairs.STAIR_CYAN_WOOL.get(),
                ABRCStairs.STAIR_PURPLE_WOOL.get(),
                ABRCStairs.STAIR_BLUE_WOOL.get(),
                ABRCStairs.STAIR_BROWN_WOOL.get(),
                ABRCStairs.STAIR_GREEN_WOOL.get(),
                ABRCStairs.STAIR_RED_WOOL.get(),

                ABRCButtons.BUTTON_BRIGHT_WHITE.get(),
                ABRCButtons.BUTTON_BRIGHT_ORANGE.get(),
                ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(),
                ABRCButtons.BUTTON_BRIGHT_YELLOW.get(),
                ABRCButtons.BUTTON_BRIGHT_CYAN.get(),
                ABRCButtons.BUTTON_BRIGHT_BLUE.get(),
                ABRCButtons.BUTTON_BRIGHT_GREEN.get(),
                ABRCButtons.BUTTON_BRIGHT_RED.get(),
                ABRCButtons.BUTTON_BRIGHT_BLACK.get(),
                ABRCButtons.BUTTON_WOOL_WHITE.get(),
                ABRCButtons.BUTTON_WOOL_ORANGE.get(),
                ABRCButtons.BUTTON_WOOL_MAGENTA.get(),
                ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(),
                ABRCButtons.BUTTON_WOOL_YELLOW.get(),
                ABRCButtons.BUTTON_WOOL_LIME.get(),
                ABRCButtons.BUTTON_WOOL_PINK.get(),
                ABRCButtons.BUTTON_WOOL_GRAY.get(),
                ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(),
                ABRCButtons.BUTTON_WOOL_CYAN.get(),
                ABRCButtons.BUTTON_WOOL_PURPLE.get(),
                ABRCButtons.BUTTON_WOOL_BLUE.get(),
                ABRCButtons.BUTTON_WOOL_BROWN.get(),
                ABRCButtons.BUTTON_WOOL_GREEN.get(),
                ABRCButtons.BUTTON_WOOL_RED.get(),

                //Pressure Plates
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get()
        );
        tag(BlockTags.NEEDS_IRON_TOOL).add(
                //Bright Colors
                ABRCBrightColors.BRIGHT_WHITE.get(),
                ABRCBrightColors.BRIGHT_ORANGE.get(),
                ABRCBrightColors.BRIGHT_MAGENTA.get(),
                ABRCBrightColors.BRIGHT_YELLOW.get(),
                ABRCBrightColors.BRIGHT_CYAN.get(),
                ABRCBrightColors.BRIGHT_BLUE.get(),
                ABRCBrightColors.BRIGHT_GREEN.get(),
                ABRCBrightColors.BRIGHT_RED.get(),
                ABRCBrightColors.BRIGHT_BLACK.get(),
                ABRCBrightColors.BRIGHT_WHITE_BORDER.get(),
                ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(),
                ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(),
                ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(),
                ABRCBrightColors.BRIGHT_CYAN_BORDER.get(),
                ABRCBrightColors.BRIGHT_BLUE_BORDER.get(),
                ABRCBrightColors.BRIGHT_GREEN_BORDER.get(),
                ABRCBrightColors.BRIGHT_RED_BORDER.get(),
                ABRCBrightColors.BRIGHT_BLACK_BORDER.get(),

                //Wool Colors
                ABRCWoolColors.WOOL_WHITE.get(),
                ABRCWoolColors.WOOL_ORANGE.get(),
                ABRCWoolColors.WOOL_MAGENTA.get(),
                ABRCWoolColors.WOOL_LIGHT_BLUE.get(),
                ABRCWoolColors.WOOL_YELLOW.get(),
                ABRCWoolColors.WOOL_LIME.get(),
                ABRCWoolColors.WOOL_PINK.get(),
                ABRCWoolColors.WOOL_GRAY.get(),
                ABRCWoolColors.WOOL_LIGHT_GRAY.get(),
                ABRCWoolColors.WOOL_CYAN.get(),
                ABRCWoolColors.WOOL_PURPLE.get(),
                ABRCWoolColors.WOOL_BLUE.get(),
                ABRCWoolColors.WOOL_BROWN.get(),
                ABRCWoolColors.WOOL_GREEN.get(),
                ABRCWoolColors.WOOL_RED.get(),
                ABRCWoolColors.WOOL_WHITE_BORDER.get(),
                ABRCWoolColors.WOOL_ORANGE_BORDER.get(),
                ABRCWoolColors.WOOL_MAGENTA_BORDER.get(),
                ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(),
                ABRCWoolColors.WOOL_YELLOW_BORDER.get(),
                ABRCWoolColors.WOOL_LIME_BORDER.get(),
                ABRCWoolColors.WOOL_PINK_BORDER.get(),
                ABRCWoolColors.WOOL_GRAY_BORDER.get(),
                ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(),
                ABRCWoolColors.WOOL_CYAN_BORDER.get(),
                ABRCWoolColors.WOOL_PURPLE_BORDER.get(),
                ABRCWoolColors.WOOL_BLUE_BORDER.get(),
                ABRCWoolColors.WOOL_BROWN_BORDER.get(),
                ABRCWoolColors.WOOL_GREEN_BORDER.get(),
                ABRCWoolColors.WOOL_RED_BORDER.get(),

                //Slabs
                ABRCSlabs.SLAB_WHITE_BRIGHT.get(),
                ABRCSlabs.SLAB_BLACK.get(),
                ABRCSlabs.SLAB_ORANGE_BRIGHT.get(),
                ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(),
                ABRCSlabs.SLAB_YELLOW_BRIGHT.get(),
                ABRCSlabs.SLAB_CYAN_BRIGHT.get(),
                ABRCSlabs.SLAB_BLUE_BRIGHT.get(),
                ABRCSlabs.SLAB_GREEN_BRIGHT.get(),
                ABRCSlabs.SLAB_RED_BRIGHT.get(),
                ABRCSlabs.SLAB_WHITE_WOOL.get(),
                ABRCSlabs.SLAB_ORANGE_WOOL.get(),
                ABRCSlabs.SLAB_MAGENTA_WOOL.get(),
                ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(),
                ABRCSlabs.SLAB_YELLOW_WOOL.get(),
                ABRCSlabs.SLAB_LIME_WOOL.get(),
                ABRCSlabs.SLAB_PINK_WOOL.get(),
                ABRCSlabs.SLAB_GRAY_WOOL.get(),
                ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(),
                ABRCSlabs.SLAB_CYAN_WOOL.get(),
                ABRCSlabs.SLAB_PURPLE_WOOL.get(),
                ABRCSlabs.SLAB_BLUE_WOOL.get(),
                ABRCSlabs.SLAB_BROWN_WOOL.get(),
                ABRCSlabs.SLAB_GREEN_WOOL.get(),
                ABRCSlabs.SLAB_RED_WOOL.get(),

                //Stairs
                ABRCStairs.STAIR_WHITE_BRIGHT.get(),
                ABRCStairs.STAIR_BLACK.get(),
                ABRCStairs.STAIR_ORANGE_BRIGHT.get(),
                ABRCStairs.STAIR_MAGENTA_BRIGHT.get(),
                ABRCStairs.STAIR_YELLOW_BRIGHT.get(),
                ABRCStairs.STAIR_CYAN_BRIGHT.get(),
                ABRCStairs.STAIR_BLUE_BRIGHT.get(),
                ABRCStairs.STAIR_GREEN_BRIGHT.get(),
                ABRCStairs.STAIR_RED_BRIGHT.get(),
                ABRCStairs.STAIR_WHITE_WOOL.get(),
                ABRCStairs.STAIR_ORANGE_WOOL.get(),
                ABRCStairs.STAIR_MAGENTA_WOOL.get(),
                ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(),
                ABRCStairs.STAIR_YELLOW_WOOL.get(),
                ABRCStairs.STAIR_LIME_WOOL.get(),
                ABRCStairs.STAIR_PINK_WOOL.get(),
                ABRCStairs.STAIR_GRAY_WOOL.get(),
                ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(),
                ABRCStairs.STAIR_CYAN_WOOL.get(),
                ABRCStairs.STAIR_PURPLE_WOOL.get(),
                ABRCStairs.STAIR_BLUE_WOOL.get(),
                ABRCStairs.STAIR_BROWN_WOOL.get(),
                ABRCStairs.STAIR_GREEN_WOOL.get(),
                ABRCStairs.STAIR_RED_WOOL.get(),

                //Buttons
                ABRCButtons.BUTTON_BRIGHT_WHITE.get(),
                ABRCButtons.BUTTON_BRIGHT_ORANGE.get(),
                ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(),
                ABRCButtons.BUTTON_BRIGHT_YELLOW.get(),
                ABRCButtons.BUTTON_BRIGHT_CYAN.get(),
                ABRCButtons.BUTTON_BRIGHT_BLUE.get(),
                ABRCButtons.BUTTON_BRIGHT_GREEN.get(),
                ABRCButtons.BUTTON_BRIGHT_RED.get(),
                ABRCButtons.BUTTON_BRIGHT_BLACK.get(),
                ABRCButtons.BUTTON_WOOL_WHITE.get(),
                ABRCButtons.BUTTON_WOOL_ORANGE.get(),
                ABRCButtons.BUTTON_WOOL_MAGENTA.get(),
                ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(),
                ABRCButtons.BUTTON_WOOL_YELLOW.get(),
                ABRCButtons.BUTTON_WOOL_LIME.get(),
                ABRCButtons.BUTTON_WOOL_PINK.get(),
                ABRCButtons.BUTTON_WOOL_GRAY.get(),
                ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(),
                ABRCButtons.BUTTON_WOOL_CYAN.get(),
                ABRCButtons.BUTTON_WOOL_PURPLE.get(),
                ABRCButtons.BUTTON_WOOL_BLUE.get(),
                ABRCButtons.BUTTON_WOOL_BROWN.get(),
                ABRCButtons.BUTTON_WOOL_GREEN.get(),
                ABRCButtons.BUTTON_WOOL_RED.get(),

                //Pressure Plates
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(),
                ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(),
                ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get()
        );
    }
}
