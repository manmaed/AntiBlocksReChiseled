package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/**
 * Made by manmaed on 01/10/2025
 */

public class ABRCenus extends LanguageProvider {
    public ABRCenus(PackOutput output) {
        super(output, AntiBlocksReChiseled.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "English US");
        add("a.lang.author.name", "manmaed");
        add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled");

        //Bright
        add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock");
        add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock");
        add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock");
        add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock");
        add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock");
        add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "Bright Red AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get().asItem(), "Bright White Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get().asItem(), "Bright Orange Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get().asItem(), "Bright Magenta Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get().asItem(), "Bright Yellow Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get().asItem(), "Bright Cyan Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get().asItem(), "Bright Blue Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get().asItem(), "Bright Green Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get().asItem(), "Bright Red Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get().asItem(), "Bright Black Bordered AntiBlock");

        //Wool
        add(ABRCWoolColors.WOOL_WHITE.get().asItem(), "Wool White AntiBlock");
        add(ABRCWoolColors.WOOL_ORANGE.get().asItem(), "Wool Orange AntiBlock");
        add(ABRCWoolColors.WOOL_MAGENTA.get().asItem(), "Wool Magenta AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get().asItem(), "Wool Light Blue AntiBlock");
        add(ABRCWoolColors.WOOL_YELLOW.get().asItem(), "Wool Yellow AntiBlock");
        add(ABRCWoolColors.WOOL_LIME.get().asItem(), "Wool Lime AntiBlock");
        add(ABRCWoolColors.WOOL_PINK.get().asItem(), "Wool Pink AntiBlock");
        add(ABRCWoolColors.WOOL_GRAY.get().asItem(), "Wool Gray AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get().asItem(), "Wool Light Gray AntiBlock");
        add(ABRCWoolColors.WOOL_CYAN.get().asItem(), "Wool Cyan AntiBlock");
        add(ABRCWoolColors.WOOL_PURPLE.get().asItem(), "Wool Purple AntiBlock");
        add(ABRCWoolColors.WOOL_BLUE.get().asItem(), "Wool Blue AntiBlock");
        add(ABRCWoolColors.WOOL_BROWN.get().asItem(), "Wool Brown AntiBlock");
        add(ABRCWoolColors.WOOL_GREEN.get().asItem(), "Wool Green AntiBlock");
        add(ABRCWoolColors.WOOL_RED.get().asItem(), "Wool Red AntiBlock");
        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get().asItem(), "Wool White Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get().asItem(), "Wool Orange Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get().asItem(), "Wool Magenta Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get().asItem(), "Wool Light Blue Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get().asItem(), "Wool Yellow Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get().asItem(), "Wool Lime Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get().asItem(), "Wool Pink Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get().asItem(), "Wool Gray Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get().asItem(), "Wool Light Gray Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get().asItem(), "Wool Cyan Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get().asItem(), "Wool Purple Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get().asItem(), "Wool Blue Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get().asItem(), "Wool Brown Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get().asItem(), "Wool Green Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_RED_BORDER.get().asItem(), "Wool Red Bordered AntiBlock");

        //Slabs
        add(ABRCSlabs.SLAB_BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock Slab");
        add(ABRCSlabs.SLAB_BRIGHT_RED.get().asItem(), "Bright Red AntiBlock Slab");

        add(ABRCSlabs.SLAB_WOOL_WHITE.get().asItem(), "Wool White AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_ORANGE.get().asItem(), "Wool Orange AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_MAGENTA.get().asItem(), "Wool Magenta AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get().asItem(), "Wool Light Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_YELLOW.get().asItem(), "Wool Yellow AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_LIME.get().asItem(), "Wool Lime AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_PINK.get().asItem(), "Wool Pink AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_GRAY.get().asItem(), "Wool Gray AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get().asItem(), "Wool Light Gray AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_CYAN.get().asItem(), "Wool Cyan AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_PURPLE.get().asItem(), "Wool Purple AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_BLUE.get().asItem(), "Wool Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_BROWN.get().asItem(), "Wool Brown AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_GREEN.get().asItem(), "Wool Green AntiBlock Slab");
        add(ABRCSlabs.SLAB_WOOL_RED.get().asItem(), "Wool Red AntiBlock Slab");

        //Starirs
        add(ABRCStairs.STAIR_BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock Stairs");
        add(ABRCStairs.STAIR_BRIGHT_RED.get().asItem(), "Bright Red AntiBlock Stairs");

        add(ABRCStairs.STAIR_WOOL_WHITE.get().asItem(), "Wool White AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_ORANGE.get().asItem(), "Wool Orange AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_MAGENTA.get().asItem(), "Wool Magenta AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get().asItem(), "Wool Light Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_YELLOW.get().asItem(), "Wool Yellow AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_LIME.get().asItem(), "Wool Lime AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_PINK.get().asItem(), "Wool Pink AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_GRAY.get().asItem(), "Wool Gray AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get().asItem(), "Wool Light Gray AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_CYAN.get().asItem(), "Wool Cyan AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_PURPLE.get().asItem(), "Wool Purple AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_BLUE.get().asItem(), "Wool Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_BROWN.get().asItem(), "Wool Brown AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_GREEN.get().asItem(), "Wool Green AntiBlock Stairs");
        add(ABRCStairs.STAIR_WOOL_RED.get().asItem(), "Wool Red AntiBlock Stairs");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get().asItem(), "Bright Red AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock Button");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get().asItem(), "Wool White AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get().asItem(), "Wool Orange AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get().asItem(), "Wool Magenta AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get().asItem(), "Wool Light Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get().asItem(), "Wool Yellow AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIME.get().asItem(), "Wool Lime AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_PINK.get().asItem(), "Wool Pink AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get().asItem(), "Wool Gray AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get().asItem(), "Wool Light Gray AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get().asItem(), "Wool Cyan AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get().asItem(), "Wool Purple AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get().asItem(), "Wool Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get().asItem(), "Wool Brown AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get().asItem(), "Wool Green AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_RED.get().asItem(), "Wool Red AntiBlock Button");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get().asItem(), "Bright White AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get().asItem(), "Bright Orange AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get().asItem(), "Bright Magenta AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get().asItem(), "Bright Yellow AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get().asItem(), "Bright Cyan AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get().asItem(), "Bright Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get().asItem(), "Bright Green AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get().asItem(), "Bright Red AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get().asItem(), "Bright Black AntiBlock Pressure Plate");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get().asItem(), "Wool White AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get().asItem(), "Wool Orange AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get().asItem(), "Wool Magenta AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get().asItem(), "Wool Light Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get().asItem(), "Wool Yellow AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get().asItem(), "Wool Lime AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get().asItem(), "Wool Pink AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get().asItem(), "Wool Gray AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get().asItem(), "Wool Light Gray AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get().asItem(), "Wool Cyan AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get().asItem(), "Wool Purple AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get().asItem(), "Wool Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get().asItem(), "Wool Brown AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get().asItem(), "Wool Green AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get().asItem(), "Wool Red AntiBlock Pressure Plate");
    }
}
