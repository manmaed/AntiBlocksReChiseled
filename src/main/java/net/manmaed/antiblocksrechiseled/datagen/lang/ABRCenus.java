package net.manmaed.antiblocksrechiseled.datagen.lang;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

/**
 * Made by manmaed on 01/10/2025
 */

public class ABRCenus extends FabricLanguageProvider {
    public ABRCenus(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translation) {
            translation.add("a.lang.file.name", "English US");
            translation.add("a.lang.author.name", "manmaed");
            translation.add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled");

        //Bright
            translation.add(ABRCBrightColors.BRIGHT_WHITE.asItem(), "Bright White AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_ORANGE.asItem(), "Bright Orange AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), "Bright Magenta AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_YELLOW.asItem(), "Bright Yellow AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_CYAN.asItem(), "Bright Cyan AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_BLUE.asItem(), "Bright Blue AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_GREEN.asItem(), "Bright Green AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_RED.asItem(), "Bright Red AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_BLACK.asItem(), "Bright Black AntiBlock");
        //Borders
            translation.add(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), "Bright White Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), "Bright Orange Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), "Bright Magenta Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), "Bright Yellow Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), "Bright Cyan Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), "Bright Blue Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), "Bright Green Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), "Bright Red Bordered AntiBlock");
            translation.add(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), "Bright Black Bordered AntiBlock");

        //Wool
            translation.add(ABRCWoolColors.WOOL_WHITE.asItem(), "Wool White AntiBlock");
            translation.add(ABRCWoolColors.WOOL_ORANGE.asItem(), "Wool Orange AntiBlock");
            translation.add(ABRCWoolColors.WOOL_MAGENTA.asItem(), "Wool Magenta AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), "Wool Light Blue AntiBlock");
            translation.add(ABRCWoolColors.WOOL_YELLOW.asItem(), "Wool Yellow AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIME.asItem(), "Wool Lime AntiBlock");
            translation.add(ABRCWoolColors.WOOL_PINK.asItem(), "Wool Pink AntiBlock");
            translation.add(ABRCWoolColors.WOOL_GRAY.asItem(), "Wool Gray AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), "Wool Light Gray AntiBlock");
            translation.add(ABRCWoolColors.WOOL_CYAN.asItem(), "Wool Cyan AntiBlock");
            translation.add(ABRCWoolColors.WOOL_PURPLE.asItem(), "Wool Purple AntiBlock");
            translation.add(ABRCWoolColors.WOOL_BLUE.asItem(), "Wool Blue AntiBlock");
            translation.add(ABRCWoolColors.WOOL_BROWN.asItem(), "Wool Brown AntiBlock");
            translation.add(ABRCWoolColors.WOOL_GREEN.asItem(), "Wool Green AntiBlock");
            translation.add(ABRCWoolColors.WOOL_RED.asItem(), "Wool Red AntiBlock");
        //Borders
            translation.add(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), "Wool White Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), "Wool Orange Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), "Wool Magenta Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), "Wool Light Blue Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), "Wool Yellow Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), "Wool Lime Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), "Wool Pink Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), "Wool Gray Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), "Wool Light Gray Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), "Wool Cyan Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), "Wool Purple Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), "Wool Blue Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), "Wool Brown Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), "Wool Green Bordered AntiBlock");
            translation.add(ABRCWoolColors.WOOL_RED_BORDER.asItem(), "Wool Red Bordered AntiBlock");

        //Slabs
            translation.add(ABRCSlabs.SLAB_BRIGHT_WHITE.asItem(), "Bright White AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_BLACK.asItem(), "Bright Black AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_ORANGE.asItem(), "Bright Orange AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.asItem(), "Bright Magenta AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_YELLOW.asItem(), "Bright Yellow AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_CYAN.asItem(), "Bright Cyan AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_BLUE.asItem(), "Bright Blue AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_GREEN.asItem(), "Bright Green AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_BRIGHT_RED.asItem(), "Bright Red AntiBlock Slab");

            translation.add(ABRCSlabs.SLAB_WOOL_WHITE.asItem(), "Wool White AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_ORANGE.asItem(), "Wool Orange AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_MAGENTA.asItem(), "Wool Magenta AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.asItem(), "Wool Light Blue AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_YELLOW.asItem(), "Wool Yellow AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_LIME.asItem(), "Wool Lime AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_PINK.asItem(), "Wool Pink AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_GRAY.asItem(), "Wool Gray AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.asItem(), "Wool Light Gray AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_CYAN.asItem(), "Wool Cyan AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_PURPLE.asItem(), "Wool Purple AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_BLUE.asItem(), "Wool Blue AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_BROWN.asItem(), "Wool Brown AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_GREEN.asItem(), "Wool Green AntiBlock Slab");
            translation.add(ABRCSlabs.SLAB_WOOL_RED.asItem(), "Wool Red AntiBlock Slab");

        //Starirs
            translation.add(ABRCStairs.STAIR_BRIGHT_WHITE.asItem(), "Bright White AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_BLACK.asItem(), "Bright Black AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_ORANGE.asItem(), "Bright Orange AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_MAGENTA.asItem(), "Bright Magenta AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_YELLOW.asItem(), "Bright Yellow AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_CYAN.asItem(), "Bright Cyan AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_BLUE.asItem(), "Bright Blue AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_GREEN.asItem(), "Bright Green AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_BRIGHT_RED.asItem(), "Bright Red AntiBlock Stairs");

            translation.add(ABRCStairs.STAIR_WOOL_WHITE.asItem(), "Wool White AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_ORANGE.asItem(), "Wool Orange AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_MAGENTA.asItem(), "Wool Magenta AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.asItem(), "Wool Light Blue AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_YELLOW.asItem(), "Wool Yellow AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_LIME.asItem(), "Wool Lime AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_PINK.asItem(), "Wool Pink AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_GRAY.asItem(), "Wool Gray AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.asItem(), "Wool Light Gray AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_CYAN.asItem(), "Wool Cyan AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_PURPLE.asItem(), "Wool Purple AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_BLUE.asItem(), "Wool Blue AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_BROWN.asItem(), "Wool Brown AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_GREEN.asItem(), "Wool Green AntiBlock Stairs");
            translation.add(ABRCStairs.STAIR_WOOL_RED.asItem(), "Wool Red AntiBlock Stairs");

        //Buttons
            translation.add(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), "Bright White AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), "Bright Orange AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), "Bright Magenta AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), "Bright Yellow AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), "Bright Cyan AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), "Bright Blue AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), "Bright Green AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), "Bright Red AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), "Bright Black AntiBlock Button");

            translation.add(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), "Wool White AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), "Wool Orange AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), "Wool Magenta AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), "Wool Light Blue AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), "Wool Yellow AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_LIME.asItem(), "Wool Lime AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_PINK.asItem(), "Wool Pink AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), "Wool Gray AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), "Wool Light Gray AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), "Wool Cyan AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), "Wool Purple AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), "Wool Blue AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), "Wool Brown AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), "Wool Green AntiBlock Button");
            translation.add(ABRCButtons.BUTTON_WOOL_RED.asItem(), "Wool Red AntiBlock Button");

        //Plates
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), "Bright White AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), "Bright Orange AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), "Bright Magenta AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), "Bright Yellow AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), "Bright Cyan AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), "Bright Blue AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), "Bright Green AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), "Bright Red AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), "Bright Black AntiBlock Pressure Plate");

            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), "Wool White AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), "Wool Orange AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), "Wool Magenta AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), "Wool Light Blue AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), "Wool Yellow AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), "Wool Lime AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), "Wool Pink AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), "Wool Gray AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), "Wool Light Gray AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), "Wool Cyan AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), "Wool Purple AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), "Wool Blue AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), "Wool Brown AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), "Wool Green AntiBlock Pressure Plate");
            translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), "Wool Red AntiBlock Pressure Plate");
    }
}
