package net.manmaed.antiblocksrechiseled.datagen.lang;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

/**
 * Made by manmaed on 01/10/2025
 */

public class ABRCtlhaa extends FabricLanguageProvider {
    public ABRCtlhaa(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "tlh_aa", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translation) {
        translation.add("a.lang.file.name", "Klingon");
        translation.add("a.lang.author.name", "ChatGPT");
        translation.add("itemGroup.antiblocksrechiseled", "voDngogh botHa’ chu’Haqtaj");

        //Bright
        //Bright AntiBlocks
        translation.add(ABRCBrightColors.BRIGHT_WHITE.asItem(), "voDngogh chIS wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE.asItem(), "voDngogh Doq SuD wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), "voDngogh Doq SuD qub wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW.asItem(), "voDngogh SuD wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_CYAN.asItem(), "voDngogh SuD watlh wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_BLUE.asItem(), "voDngogh SuD qargh wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_GREEN.asItem(), "voDngogh SuD wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_RED.asItem(), "voDngogh Doq wov botHa'");
        translation.add(ABRCBrightColors.BRIGHT_BLACK.asItem(), "voDngogh qIj wov botHa'");

// Bright Borders
        translation.add(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), "voDngogh chIS wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), "voDngogh Doq SuD wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), "voDngogh Doq SuD qub wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), "voDngogh SuD wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), "voDngogh SuD watlh wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), "voDngogh SuD qargh wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), "voDngogh SuD wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), "voDngogh Doq wov joqwI' vegh botHa'");
        translation.add(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), "voDngogh qIj wov joqwI' vegh botHa'");

// Wool AntiBlocks
        translation.add(ABRCWoolColors.WOOL_WHITE.asItem(), "voDngogh chIS botHa'");
        translation.add(ABRCWoolColors.WOOL_ORANGE.asItem(), "voDngogh Doq SuD botHa'");
        translation.add(ABRCWoolColors.WOOL_MAGENTA.asItem(), "voDngogh Doq SuD qub botHa'");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), "voDngogh SuD wov qargh botHa'");
        translation.add(ABRCWoolColors.WOOL_YELLOW.asItem(), "voDngogh SuD botHa'");
        translation.add(ABRCWoolColors.WOOL_LIME.asItem(), "voDngogh SuD wovqu' botHa'");
        translation.add(ABRCWoolColors.WOOL_PINK.asItem(), "voDngogh Doq wov botHa'");
        translation.add(ABRCWoolColors.WOOL_GRAY.asItem(), "voDngogh qIj wov botHa'");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), "voDngogh qIj wovqu' botHa'");
        translation.add(ABRCWoolColors.WOOL_CYAN.asItem(), "voDngogh SuD watlh botHa'");
        translation.add(ABRCWoolColors.WOOL_PURPLE.asItem(), "voDngogh Doq SuD qub botHa'");
        translation.add(ABRCWoolColors.WOOL_BLUE.asItem(), "voDngogh SuD qargh botHa'");
        translation.add(ABRCWoolColors.WOOL_BROWN.asItem(), "voDngogh Doq Hurgh botHa'");
        translation.add(ABRCWoolColors.WOOL_GREEN.asItem(), "voDngogh SuD botHa'");
        translation.add(ABRCWoolColors.WOOL_RED.asItem(), "voDngogh Doq botHa'");

// Wool Borders
        translation.add(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), "voDngogh chIS joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), "voDngogh Doq SuD joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), "voDngogh Doq SuD qub joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), "voDngogh SuD wov qargh joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), "voDngogh SuD joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), "voDngogh SuD wovqu' joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), "voDngogh Doq wov joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), "voDngogh qIj wov joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), "voDngogh qIj wovqu' joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), "voDngogh SuD watlh joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), "voDngogh Doq SuD qub joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), "voDngogh SuD qargh joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), "voDngogh Doq Hurgh joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), "voDngogh SuD joqwI' vegh botHa'");
        translation.add(ABRCWoolColors.WOOL_RED_BORDER.asItem(), "voDngogh Doq joqwI' vegh botHa'");

// Slabs
        translation.add(ABRCSlabs.SLAB_BRIGHT_WHITE.asItem(), "joqwI' mach chIS wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLACK.asItem(), "joqwI' mach qIj wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_ORANGE.asItem(), "joqwI' mach Doq SuD wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.asItem(), "joqwI' mach Doq SuD qub wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_YELLOW.asItem(), "joqwI' mach SuD wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_CYAN.asItem(), "joqwI' mach SuD watlh wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLUE.asItem(), "joqwI' mach SuD qargh wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_GREEN.asItem(), "joqwI' mach SuD wov botHa'");
        translation.add(ABRCSlabs.SLAB_BRIGHT_RED.asItem(), "joqwI' mach Doq wov botHa'");

        translation.add(ABRCSlabs.SLAB_WOOL_WHITE.asItem(), "joqwI' mach voDngogh chIS botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_ORANGE.asItem(), "joqwI' mach voDngogh Doq SuD botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_MAGENTA.asItem(), "joqwI' mach voDngogh Doq SuD qub botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.asItem(), "joqwI' mach voDngogh SuD wov qargh botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_YELLOW.asItem(), "joqwI' mach voDngogh SuD botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_LIME.asItem(), "joqwI' mach voDngogh SuD wovqu' botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_PINK.asItem(), "joqwI' mach voDngogh Doq wov botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_GRAY.asItem(), "joqwI' mach voDngogh qIj wov botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.asItem(), "joqwI' mach voDngogh qIj wovqu' botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_CYAN.asItem(), "joqwI' mach voDngogh SuD watlh botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_PURPLE.asItem(), "joqwI' mach voDngogh Doq SuD qub botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_BLUE.asItem(), "joqwI' mach voDngogh SuD qargh botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_BROWN.asItem(), "joqwI' mach voDngogh Doq Hurgh botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_GREEN.asItem(), "joqwI' mach voDngogh SuD botHa'");
        translation.add(ABRCSlabs.SLAB_WOOL_RED.asItem(), "joqwI' mach voDngogh Doq botHa'");

// Stairs
        translation.add(ABRCStairs.STAIR_BRIGHT_WHITE.asItem(), "letlh chIS wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLACK.asItem(), "letlh qIj wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_ORANGE.asItem(), "letlh Doq SuD wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_MAGENTA.asItem(), "letlh Doq SuD qub wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_YELLOW.asItem(), "letlh SuD wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_CYAN.asItem(), "letlh SuD watlh wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLUE.asItem(), "letlh SuD qargh wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_GREEN.asItem(), "letlh SuD wov botHa'");
        translation.add(ABRCStairs.STAIR_BRIGHT_RED.asItem(), "letlh Doq wov botHa'");

        translation.add(ABRCStairs.STAIR_WOOL_WHITE.asItem(), "letlh voDngogh chIS botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_ORANGE.asItem(), "letlh voDngogh Doq SuD botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_MAGENTA.asItem(), "letlh voDngogh Doq SuD qub botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.asItem(), "letlh voDngogh SuD wov qargh botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_YELLOW.asItem(), "letlh voDngogh SuD botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_LIME.asItem(), "letlh voDngogh SuD wovqu' botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_PINK.asItem(), "letlh voDngogh Doq wov botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_GRAY.asItem(), "letlh voDngogh qIj wov botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.asItem(), "letlh voDngogh qIj wovqu' botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_CYAN.asItem(), "letlh voDngogh SuD watlh botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_PURPLE.asItem(), "letlh voDngogh Doq SuD qub botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_BLUE.asItem(), "letlh voDngogh SuD qargh botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_BROWN.asItem(), "letlh voDngogh Doq Hurgh botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_GREEN.asItem(), "letlh voDngogh SuD botHa'");
        translation.add(ABRCStairs.STAIR_WOOL_RED.asItem(), "letlh voDngogh Doq botHa'");

// Buttons
        translation.add(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), "chuyDaH chIS wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), "chuyDaH Doq SuD wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), "chuyDaH Doq SuD qub wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), "chuyDaH SuD wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), "chuyDaH SuD watlh wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), "chuyDaH SuD qargh wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), "chuyDaH SuD wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), "chuyDaH Doq wov botHa'");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), "chuyDaH qIj wov botHa'");

        translation.add(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), "chuyDaH voDngogh chIS botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), "chuyDaH voDngogh Doq SuD botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), "chuyDaH voDngogh Doq SuD qub botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), "chuyDaH voDngogh SuD wov qargh botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), "chuyDaH voDngogh SuD botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_LIME.asItem(), "chuyDaH voDngogh SuD wovqu' botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_PINK.asItem(), "chuyDaH voDngogh Doq wov botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), "chuyDaH voDngogh qIj wov botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), "chuyDaH voDngogh qIj wovqu' botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), "chuyDaH voDngogh SuD watlh botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), "chuyDaH voDngogh Doq SuD qub botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), "chuyDaH voDngogh SuD qargh botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), "chuyDaH voDngogh Doq Hurgh botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), "chuyDaH voDngogh SuD botHa'");
        translation.add(ABRCButtons.BUTTON_WOOL_RED.asItem(), "chuyDaH voDngogh Doq botHa'");

// Pressure Plates
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), "ngaQ joqwI' chIS wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), "ngaQ joqwI' Doq SuD wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), "ngaQ joqwI' Doq SuD qub wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), "ngaQ joqwI' SuD wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), "ngaQ joqwI' SuD watlh wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), "ngaQ joqwI' SuD qargh wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), "ngaQ joqwI' SuD wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), "ngaQ joqwI' Doq wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), "ngaQ joqwI' qIj wov botHa'");

        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), "ngaQ joqwI' voDngogh chIS botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), "ngaQ joqwI' voDngogh Doq SuD botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), "ngaQ joqwI' voDngogh Doq SuD qub botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), "ngaQ joqwI' voDngogh SuD wov qargh botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), "ngaQ joqwI' voDngogh SuD botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), "ngaQ joqwI' voDngogh SuD wovqu' botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), "ngaQ joqwI' voDngogh Doq wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), "ngaQ joqwI' voDngogh qIj wov botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), "ngaQ joqwI' voDngogh qIj wovqu' botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), "ngaQ joqwI' voDngogh SuD watlh botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), "ngaQ joqwI' voDngogh Doq SuD qub botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), "ngaQ joqwI' voDngogh SuD qargh botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), "ngaQ joqwI' voDngogh Doq Hurgh botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), "ngaQ joqwI' voDngogh SuD botHa'");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), "ngaQ joqwI' voDngogh Doq botHa'");

    }
}
