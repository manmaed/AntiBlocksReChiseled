package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

/**
 * Made by manmaed on 01/10/2025
 */

public class ABRCtlhaa extends LanguageProvider {
    public ABRCtlhaa(PackOutput output) {
        super(output, AntiBlocksReChiseled.MOD_ID, "tlh_aa");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "Klingon");
        add("a.lang.author.name", "ChatGPT");
        add("itemGroup.antiblocksrechiseled", "voDngogh botHa’ chu’Haqtaj");

        //Bright
        //Bright AntiBlocks
        add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "voDngogh chIS wov botHa'");
        add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "voDngogh Doq SuD wov botHa'");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "voDngogh Doq SuD qub wov botHa'");
        add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "voDngogh SuD wov botHa'");
        add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "voDngogh SuD watlh wov botHa'");
        add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "voDngogh SuD qargh wov botHa'");
        add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "voDngogh SuD wov botHa'");
        add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "voDngogh Doq wov botHa'");
        add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "voDngogh qIj wov botHa'");

// Bright Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get().asItem(), "voDngogh chIS wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get().asItem(), "voDngogh Doq SuD wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get().asItem(), "voDngogh Doq SuD qub wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get().asItem(), "voDngogh SuD wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get().asItem(), "voDngogh SuD watlh wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get().asItem(), "voDngogh SuD qargh wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get().asItem(), "voDngogh SuD wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get().asItem(), "voDngogh Doq wov joqwI' vegh botHa'");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get().asItem(), "voDngogh qIj wov joqwI' vegh botHa'");

// Wool AntiBlocks
        add(ABRCWoolColors.WOOL_WHITE.get().asItem(), "voDngogh chIS botHa'");
        add(ABRCWoolColors.WOOL_ORANGE.get().asItem(), "voDngogh Doq SuD botHa'");
        add(ABRCWoolColors.WOOL_MAGENTA.get().asItem(), "voDngogh Doq SuD qub botHa'");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get().asItem(), "voDngogh SuD wov qargh botHa'");
        add(ABRCWoolColors.WOOL_YELLOW.get().asItem(), "voDngogh SuD botHa'");
        add(ABRCWoolColors.WOOL_LIME.get().asItem(), "voDngogh SuD wovqu' botHa'");
        add(ABRCWoolColors.WOOL_PINK.get().asItem(), "voDngogh Doq wov botHa'");
        add(ABRCWoolColors.WOOL_GRAY.get().asItem(), "voDngogh qIj wov botHa'");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get().asItem(), "voDngogh qIj wovqu' botHa'");
        add(ABRCWoolColors.WOOL_CYAN.get().asItem(), "voDngogh SuD watlh botHa'");
        add(ABRCWoolColors.WOOL_PURPLE.get().asItem(), "voDngogh Doq SuD qub botHa'");
        add(ABRCWoolColors.WOOL_BLUE.get().asItem(), "voDngogh SuD qargh botHa'");
        add(ABRCWoolColors.WOOL_BROWN.get().asItem(), "voDngogh Doq Hurgh botHa'");
        add(ABRCWoolColors.WOOL_GREEN.get().asItem(), "voDngogh SuD botHa'");
        add(ABRCWoolColors.WOOL_RED.get().asItem(), "voDngogh Doq botHa'");

// Wool Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get().asItem(), "voDngogh chIS joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get().asItem(), "voDngogh Doq SuD joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get().asItem(), "voDngogh Doq SuD qub joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get().asItem(), "voDngogh SuD wov qargh joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get().asItem(), "voDngogh SuD joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get().asItem(), "voDngogh SuD wovqu' joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get().asItem(), "voDngogh Doq wov joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get().asItem(), "voDngogh qIj wov joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get().asItem(), "voDngogh qIj wovqu' joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get().asItem(), "voDngogh SuD watlh joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get().asItem(), "voDngogh Doq SuD qub joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get().asItem(), "voDngogh SuD qargh joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get().asItem(), "voDngogh Doq Hurgh joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get().asItem(), "voDngogh SuD joqwI' vegh botHa'");
        add(ABRCWoolColors.WOOL_RED_BORDER.get().asItem(), "voDngogh Doq joqwI' vegh botHa'");

// Slabs
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get().asItem(), "joqwI' mach chIS wov botHa'");
        add(ABRCSlabs.SLAB_BLACK.get().asItem(), "joqwI' mach qIj wov botHa'");
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get().asItem(), "joqwI' mach Doq SuD wov botHa'");
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get().asItem(), "joqwI' mach Doq SuD qub wov botHa'");
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get().asItem(), "joqwI' mach SuD wov botHa'");
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get().asItem(), "joqwI' mach SuD watlh wov botHa'");
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get().asItem(), "joqwI' mach SuD qargh wov botHa'");
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get().asItem(), "joqwI' mach SuD wov botHa'");
        add(ABRCSlabs.SLAB_RED_BRIGHT.get().asItem(), "joqwI' mach Doq wov botHa'");

        add(ABRCSlabs.SLAB_WHITE_WOOL.get().asItem(), "joqwI' mach voDngogh chIS botHa'");
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get().asItem(), "joqwI' mach voDngogh Doq SuD botHa'");
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get().asItem(), "joqwI' mach voDngogh Doq SuD qub botHa'");
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get().asItem(), "joqwI' mach voDngogh SuD wov qargh botHa'");
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get().asItem(), "joqwI' mach voDngogh SuD botHa'");
        add(ABRCSlabs.SLAB_LIME_WOOL.get().asItem(), "joqwI' mach voDngogh SuD wovqu' botHa'");
        add(ABRCSlabs.SLAB_PINK_WOOL.get().asItem(), "joqwI' mach voDngogh Doq wov botHa'");
        add(ABRCSlabs.SLAB_GRAY_WOOL.get().asItem(), "joqwI' mach voDngogh qIj wov botHa'");
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get().asItem(), "joqwI' mach voDngogh qIj wovqu' botHa'");
        add(ABRCSlabs.SLAB_CYAN_WOOL.get().asItem(), "joqwI' mach voDngogh SuD watlh botHa'");
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get().asItem(), "joqwI' mach voDngogh Doq SuD qub botHa'");
        add(ABRCSlabs.SLAB_BLUE_WOOL.get().asItem(), "joqwI' mach voDngogh SuD qargh botHa'");
        add(ABRCSlabs.SLAB_BROWN_WOOL.get().asItem(), "joqwI' mach voDngogh Doq Hurgh botHa'");
        add(ABRCSlabs.SLAB_GREEN_WOOL.get().asItem(), "joqwI' mach voDngogh SuD botHa'");
        add(ABRCSlabs.SLAB_RED_WOOL.get().asItem(), "joqwI' mach voDngogh Doq botHa'");

// Stairs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get().asItem(), "letlh chIS wov botHa'");
        add(ABRCStairs.STAIR_BLACK.get().asItem(), "letlh qIj wov botHa'");
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get().asItem(), "letlh Doq SuD wov botHa'");
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get().asItem(), "letlh Doq SuD qub wov botHa'");
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get().asItem(), "letlh SuD wov botHa'");
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get().asItem(), "letlh SuD watlh wov botHa'");
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get().asItem(), "letlh SuD qargh wov botHa'");
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get().asItem(), "letlh SuD wov botHa'");
        add(ABRCStairs.STAIR_RED_BRIGHT.get().asItem(), "letlh Doq wov botHa'");

        add(ABRCStairs.STAIR_WHITE_WOOL.get().asItem(), "letlh voDngogh chIS botHa'");
        add(ABRCStairs.STAIR_ORANGE_WOOL.get().asItem(), "letlh voDngogh Doq SuD botHa'");
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get().asItem(), "letlh voDngogh Doq SuD qub botHa'");
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get().asItem(), "letlh voDngogh SuD wov qargh botHa'");
        add(ABRCStairs.STAIR_YELLOW_WOOL.get().asItem(), "letlh voDngogh SuD botHa'");
        add(ABRCStairs.STAIR_LIME_WOOL.get().asItem(), "letlh voDngogh SuD wovqu' botHa'");
        add(ABRCStairs.STAIR_PINK_WOOL.get().asItem(), "letlh voDngogh Doq wov botHa'");
        add(ABRCStairs.STAIR_GRAY_WOOL.get().asItem(), "letlh voDngogh qIj wov botHa'");
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get().asItem(), "letlh voDngogh qIj wovqu' botHa'");
        add(ABRCStairs.STAIR_CYAN_WOOL.get().asItem(), "letlh voDngogh SuD watlh botHa'");
        add(ABRCStairs.STAIR_PURPLE_WOOL.get().asItem(), "letlh voDngogh Doq SuD qub botHa'");
        add(ABRCStairs.STAIR_BLUE_WOOL.get().asItem(), "letlh voDngogh SuD qargh botHa'");
        add(ABRCStairs.STAIR_BROWN_WOOL.get().asItem(), "letlh voDngogh Doq Hurgh botHa'");
        add(ABRCStairs.STAIR_GREEN_WOOL.get().asItem(), "letlh voDngogh SuD botHa'");
        add(ABRCStairs.STAIR_RED_WOOL.get().asItem(), "letlh voDngogh Doq botHa'");

// Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get().asItem(), "chuyDaH chIS wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get().asItem(), "chuyDaH Doq SuD wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get().asItem(), "chuyDaH Doq SuD qub wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get().asItem(), "chuyDaH SuD wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get().asItem(), "chuyDaH SuD watlh wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get().asItem(), "chuyDaH SuD qargh wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get().asItem(), "chuyDaH SuD wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get().asItem(), "chuyDaH Doq wov botHa'");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get().asItem(), "chuyDaH qIj wov botHa'");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get().asItem(), "chuyDaH voDngogh chIS botHa'");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get().asItem(), "chuyDaH voDngogh Doq SuD botHa'");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get().asItem(), "chuyDaH voDngogh Doq SuD qub botHa'");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get().asItem(), "chuyDaH voDngogh SuD wov qargh botHa'");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get().asItem(), "chuyDaH voDngogh SuD botHa'");
        add(ABRCButtons.BUTTON_WOOL_LIME.get().asItem(), "chuyDaH voDngogh SuD wovqu' botHa'");
        add(ABRCButtons.BUTTON_WOOL_PINK.get().asItem(), "chuyDaH voDngogh Doq wov botHa'");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get().asItem(), "chuyDaH voDngogh qIj wov botHa'");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get().asItem(), "chuyDaH voDngogh qIj wovqu' botHa'");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get().asItem(), "chuyDaH voDngogh SuD watlh botHa'");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get().asItem(), "chuyDaH voDngogh Doq SuD qub botHa'");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get().asItem(), "chuyDaH voDngogh SuD qargh botHa'");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get().asItem(), "chuyDaH voDngogh Doq Hurgh botHa'");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get().asItem(), "chuyDaH voDngogh SuD botHa'");
        add(ABRCButtons.BUTTON_WOOL_RED.get().asItem(), "chuyDaH voDngogh Doq botHa'");

// Pressure Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get().asItem(), "ngaQ joqwI' chIS wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get().asItem(), "ngaQ joqwI' Doq SuD wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get().asItem(), "ngaQ joqwI' Doq SuD qub wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get().asItem(), "ngaQ joqwI' SuD wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get().asItem(), "ngaQ joqwI' SuD watlh wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get().asItem(), "ngaQ joqwI' SuD qargh wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get().asItem(), "ngaQ joqwI' SuD wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get().asItem(), "ngaQ joqwI' Doq wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get().asItem(), "ngaQ joqwI' qIj wov botHa'");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get().asItem(), "ngaQ joqwI' voDngogh chIS botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get().asItem(), "ngaQ joqwI' voDngogh Doq SuD botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get().asItem(), "ngaQ joqwI' voDngogh Doq SuD qub botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get().asItem(), "ngaQ joqwI' voDngogh SuD wov qargh botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get().asItem(), "ngaQ joqwI' voDngogh SuD botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get().asItem(), "ngaQ joqwI' voDngogh SuD wovqu' botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get().asItem(), "ngaQ joqwI' voDngogh Doq wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get().asItem(), "ngaQ joqwI' voDngogh qIj wov botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get().asItem(), "ngaQ joqwI' voDngogh qIj wovqu' botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get().asItem(), "ngaQ joqwI' voDngogh SuD watlh botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get().asItem(), "ngaQ joqwI' voDngogh Doq SuD qub botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get().asItem(), "ngaQ joqwI' voDngogh SuD qargh botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get().asItem(), "ngaQ joqwI' voDngogh Doq Hurgh botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get().asItem(), "ngaQ joqwI' voDngogh SuD botHa'");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get().asItem(), "ngaQ joqwI' voDngogh Doq botHa'");

    }
}
