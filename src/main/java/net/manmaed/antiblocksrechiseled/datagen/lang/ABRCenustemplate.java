package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ABRCenustemplate extends LanguageProvider {

    public ABRCenustemplate(PackOutput output) {
        super(output, AntiBlocksReChiseled.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "English US");
        add("a.lang.author.name", "manmaed");
        add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled");

        //Bright
        add(ABRCBrightColors.BRIGHT_WHITE.get(), "Bright White AntiBlock");
        add(ABRCBrightColors.BRIGHT_ORANGE.get(), "Bright Orange AntiBlock");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get(), "Bright Magenta AntiBlock");
        add(ABRCBrightColors.BRIGHT_YELLOW.get(), "Bright Yellow AntiBlock");
        add(ABRCBrightColors.BRIGHT_CYAN.get(), "Bright Cyan AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLUE.get(), "Bright Blue AntiBlock");
        add(ABRCBrightColors.BRIGHT_GREEN.get(), "Bright Green AntiBlock");
        add(ABRCBrightColors.BRIGHT_RED.get(), "Bright Red AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLACK.get(), "Bright Black AntiBlock");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), "Bright White Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), "Bright Orange Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), "Bright Magenta Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), "Bright Yellow Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), "Bright Cyan Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), "Bright Blue Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), "Bright Green Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get(), "Bright Red Bordered AntiBlock");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), "Bright Black Bordered AntiBlock");

        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get(), "Wool White AntiBlock");
        add(ABRCWoolColors.WOOL_ORANGE.get(), "Wool Orange AntiBlock");
        add(ABRCWoolColors.WOOL_MAGENTA.get(), "Wool Magenta AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), "Wool Light Blue AntiBlock");
        add(ABRCWoolColors.WOOL_YELLOW.get(), "Wool Yellow AntiBlock");
        add(ABRCWoolColors.WOOL_LIME.get(), "Wool Lime AntiBlock");
        add(ABRCWoolColors.WOOL_PINK.get(), "Wool Pink AntiBlock");
        add(ABRCWoolColors.WOOL_GRAY.get(), "Wool Gray AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), "Wool Light Gray AntiBlock");
        add(ABRCWoolColors.WOOL_CYAN.get(), "Wool Cyan AntiBlock");
        add(ABRCWoolColors.WOOL_PURPLE.get(), "Wool Purple AntiBlock");
        add(ABRCWoolColors.WOOL_BLUE.get(), "Wool Blue AntiBlock");
        add(ABRCWoolColors.WOOL_BROWN.get(), "Wool Brown AntiBlock");
        add(ABRCWoolColors.WOOL_GREEN.get(), "Wool Green AntiBlock");
        add(ABRCWoolColors.WOOL_RED.get(), "Wool Red AntiBlock");
        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get(), "Wool White Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), "Wool Orange Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), "Wool Magenta Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), "Wool Light Blue Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), "Wool Yellow Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get(), "Wool Lime Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get(), "Wool Pink Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get(), "Wool Gray Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), "Wool Light Gray Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get(), "Wool Cyan Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), "Wool Purple Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get(), "Wool Blue Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get(), "Wool Brown Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get(), "Wool Green Bordered AntiBlock");
        add(ABRCWoolColors.WOOL_RED_BORDER.get(), "Wool Red Bordered AntiBlock");

        //SLABS
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), "Bright White AntiBlock Slab");
        add(ABRCSlabs.SLAB_BLACK.get(), "Bright Black AntiBlock Slab");
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), "Bright Orange AntiBlock Slab");
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), "Bright Magenta AntiBlock Slab");
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), "Bright Yellow AntiBlock Slab");
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), "Bright Cyan AntiBlock Slab");
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), "Bright Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), "Bright Green AntiBlock Slab");
        add(ABRCSlabs.SLAB_RED_BRIGHT.get(), "Bright Red AntiBlock Slab");

        add(ABRCSlabs.SLAB_WHITE_WOOL.get(), "Wool White AntiBlock Slab");
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get(), "Wool Orange AntiBlock Slab");
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), "Wool Magenta AntiBlock Slab");
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), "Wool Light Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get(), "Wool Yellow AntiBlock Slab");
        add(ABRCSlabs.SLAB_LIME_WOOL.get(), "Wool Lime AntiBlock Slab");
        add(ABRCSlabs.SLAB_PINK_WOOL.get(), "Wool Pink AntiBlock Slab");
        add(ABRCSlabs.SLAB_GRAY_WOOL.get(), "Wool Gray AntiBlock Slab");
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), "Wool Light Gray AntiBlock Slab");
        add(ABRCSlabs.SLAB_CYAN_WOOL.get(), "Wool Cyan AntiBlock Slab");
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get(), "Wool Purple AntiBlock Slab");
        add(ABRCSlabs.SLAB_BLUE_WOOL.get(), "Wool Blue AntiBlock Slab");
        add(ABRCSlabs.SLAB_BROWN_WOOL.get(), "Wool Brown AntiBlock Slab");
        add(ABRCSlabs.SLAB_GREEN_WOOL.get(), "Wool Green AntiBlock Slab");
        add(ABRCSlabs.SLAB_RED_WOOL.get(), "Wool Red AntiBlock Slab");

        //Starirs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get(), "Bright White AntiBlock Stairs");
        add(ABRCStairs.STAIR_BLACK.get(), "Bright Black AntiBlock Stairs");
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), "Bright Orange AntiBlock Stairs");
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), "Bright Magenta AntiBlock Stairs");
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), "Bright Yellow AntiBlock Stairs");
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get(), "Bright Cyan AntiBlock Stairs");
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get(), "Bright Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get(), "Bright Green AntiBlock Stairs");
        add(ABRCStairs.STAIR_RED_BRIGHT.get(), "Bright Red AntiBlock Stairs");

        add(ABRCStairs.STAIR_WHITE_WOOL.get(), "Wool White AntiBlock Stairs");
        add(ABRCStairs.STAIR_ORANGE_WOOL.get(), "Wool Orange AntiBlock Stairs");
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get(), "Wool Magenta AntiBlock Stairs");
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), "Wool Light Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_YELLOW_WOOL.get(), "Wool Yellow AntiBlock Stairs");
        add(ABRCStairs.STAIR_LIME_WOOL.get(), "Wool Lime AntiBlock Stairs");
        add(ABRCStairs.STAIR_PINK_WOOL.get(), "Wool Pink AntiBlock Stairs");
        add(ABRCStairs.STAIR_GRAY_WOOL.get(), "Wool Gray AntiBlock Stairs");
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), "Wool Light Gray AntiBlock Stairs");
        add(ABRCStairs.STAIR_CYAN_WOOL.get(), "Wool Cyan AntiBlock Stairs");
        add(ABRCStairs.STAIR_PURPLE_WOOL.get(), "Wool Purple AntiBlock Stairs");
        add(ABRCStairs.STAIR_BLUE_WOOL.get(), "Wool Blue AntiBlock Stairs");
        add(ABRCStairs.STAIR_BROWN_WOOL.get(), "Wool Brown AntiBlock Stairs");
        add(ABRCStairs.STAIR_GREEN_WOOL.get(), "Wool Green AntiBlock Stairs");
        add(ABRCStairs.STAIR_RED_WOOL.get(), "Wool Red AntiBlock Stairs");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), "Bright White AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), "Bright Orange AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), "Bright Magenta AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), "Bright Yellow AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), "Bright Cyan AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), "Bright Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), "Bright Green AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get(), "Bright Red AntiBlock Button");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), "Bright Black AntiBlock Button");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get(), "Wool White AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get(), "Wool Orange AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), "Wool Magenta AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), "Wool Light Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get(), "Wool Yellow AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIME.get(), "Wool Lime AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_PINK.get(), "Wool Pink AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get(), "Wool Gray AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), "Wool Light Gray AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get(), "Wool Cyan AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get(), "Wool Purple AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get(), "Wool Blue AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get(), "Wool Brown AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get(), "Wool Green AntiBlock Button");
        add(ABRCButtons.BUTTON_WOOL_RED.get(), "Wool Red AntiBlock Button");


        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), "Bright White AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), "Bright Orange AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "Bright Magenta AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), "Bright Yellow AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), "Bright Cyan AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), "Bright Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), "Bright Green AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), "Bright Red AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), "Bright Black AntiBlock Pressure Plate");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), "Wool White AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), "Wool Orange AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), "Wool Magenta AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "Wool Light Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), "Wool Yellow AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), "Wool Lime AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), "Wool Pink AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), "Wool Gray AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "Wool Light Gray AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), "Wool Cyan AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), "Wool Purple AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), "Wool Blue AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), "Wool Brown AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), "Wool Green AntiBlock Pressure Plate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), "Wool Red AntiBlock Pressure Plate");

    }
}
