package net.manmaed.antiblocksrechiseled.datagen.lang;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class ABRClolus extends FabricLanguageProvider {

 public ABRClolus(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
  super(packOutput, "lol_us", registryLookup);
 }

 @Override
 public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translation) {
  translation.add("a.lang.file.name", "LOLCAT (Kingdom of Cats)");
  translation.add("a.lang.author.name", "ChatGPT");
  translation.add("itemGroup.antiblocksrechiseled", "Antibawks ReChiseledz");

  //Bright
  translation.add(ABRCBrightColors.BRIGHT_WHITE.asItem(), "Britee Whytez Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_ORANGE.asItem(), "Britee Oranjz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), "Britee Magentz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_YELLOW.asItem(), "Britee Yellerz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_CYAN.asItem(), "Britee Syanz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_BLUE.asItem(), "Britee Bluuz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_GREEN.asItem(), "Britee Greenz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_RED.asItem(), "Britee Reddz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_BLACK.asItem(), "Britee Blakkz Antibawk");

  //Borders
  translation.add(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), "Britee Whytez Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), "Britee Oranjz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), "Britee Magentz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), "Britee Yellerz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), "Britee Syanz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), "Britee Bluuz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), "Britee Greenz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), "Britee Reddz Bordurz Antibawk");
  translation.add(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), "Britee Blakkz Bordurz Antibawk");


  //WOOL
  translation.add(ABRCWoolColors.WOOL_WHITE.asItem(), "Floof Whyte Antibawk");
  translation.add(ABRCWoolColors.WOOL_ORANGE.asItem(), "Floof Oranjz Antibawk");
  translation.add(ABRCWoolColors.WOOL_MAGENTA.asItem(), "Floof Magentz Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), "Floof Lite Bluuz Antibawk");
  translation.add(ABRCWoolColors.WOOL_YELLOW.asItem(), "Floof Yellerz Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIME.asItem(), "Floof Laim Antibawk");
  translation.add(ABRCWoolColors.WOOL_PINK.asItem(), "Floof Pinkz Antibawk");
  translation.add(ABRCWoolColors.WOOL_GRAY.asItem(), "Floof Gray Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), "Floof Lite Gray Antibawk");
  translation.add(ABRCWoolColors.WOOL_CYAN.asItem(), "Floof Syanz Antibawk");
  translation.add(ABRCWoolColors.WOOL_PURPLE.asItem(), "Floof Purplz Antibawk");
  translation.add(ABRCWoolColors.WOOL_BLUE.asItem(), "Floof Bluuz Antibawk");
  translation.add(ABRCWoolColors.WOOL_BROWN.asItem(), "Floof Brownz Antibawk");
  translation.add(ABRCWoolColors.WOOL_GREEN.asItem(), "Floof Greenz Antibawk");
  translation.add(ABRCWoolColors.WOOL_RED.asItem(), "Floof Reddz Antibawk");
  //Borders
  translation.add(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), "Floof Whyte Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), "Floof Oranjz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), "Floof Magentz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), "Floof Lite Bluuz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), "Floof Yellerz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), "Floof Laim Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), "Floof Pinkz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), "Floof Gray Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), "Floof Lite Gray Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), "Floof Syanz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), "Floof Purplz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), "Floof Bluuz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), "Floof Brownz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), "Floof Greenz Bordurz Antibawk");
  translation.add(ABRCWoolColors.WOOL_RED_BORDER.asItem(), "Floof Reddz Bordurz Antibawk");

  //SLABS
  translation.add(ABRCSlabs.SLAB_BRIGHT_WHITE.asItem(), "Britee Whytez Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_BLACK.asItem(), "Britee Blakkz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_ORANGE.asItem(), "Britee Oranjz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.asItem(), "Britee Magentz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_YELLOW.asItem(), "Britee Yellerz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_CYAN.asItem(), "Britee Syanz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_BLUE.asItem(), "Britee Bluuz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_GREEN.asItem(), "Britee Greenz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_BRIGHT_RED.asItem(), "Britee Reddz Antibawk Clawwed Half Bloc");

  translation.add(ABRCSlabs.SLAB_WOOL_WHITE.asItem(), "Floof Whyte Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_ORANGE.asItem(), "Floof Oranjz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_MAGENTA.asItem(), "Floof Magentz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.asItem(), "Floof Lite Bluuz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_YELLOW.asItem(), "Floof Yellerz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_LIME.asItem(), "Floof Laim Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_PINK.asItem(), "Floof Pinkz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_GRAY.asItem(), "Floof Gray Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.asItem(), "Floof Lite Gray Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_CYAN.asItem(), "Floof Syanz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_PURPLE.asItem(), "Floof Purplz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_BLUE.asItem(), "Floof Bluuz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_BROWN.asItem(), "Floof Brownz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_GREEN.asItem(), "Floof Greenz Antibawk Clawwed Half Bloc");
  translation.add(ABRCSlabs.SLAB_WOOL_RED.asItem(), "Floof Reddz Antibawk Clawwed Half Bloc");

  //Starirs
  translation.add(ABRCStairs.STAIR_BRIGHT_WHITE.asItem(), "Britee Whytez Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_BLACK.asItem(), "Britee Blakkz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_ORANGE.asItem(), "Britee Oranjz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_MAGENTA.asItem(), "Britee Magentz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_YELLOW.asItem(), "Britee Yellerz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_CYAN.asItem(), "Britee Syanz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_BLUE.asItem(), "Britee Bluuz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_GREEN.asItem(), "Britee Greenz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_BRIGHT_RED.asItem(), "Britee Reddz Antibawk Stepz");

  translation.add(ABRCStairs.STAIR_WOOL_WHITE.asItem(), "Floof Whyte Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_ORANGE.asItem(), "Floof Oranjz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_MAGENTA.asItem(), "Floof Magentz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.asItem(), "Floof Lite Bluuz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_YELLOW.asItem(), "Floof Yellerz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_LIME.asItem(), "Floof Laim Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_PINK.asItem(), "Floof Pinkz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_GRAY.asItem(), "Floof Gray Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.asItem(), "Floof Lite Gray Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_CYAN.asItem(), "Floof Syanz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_PURPLE.asItem(), "Floof Purplz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_BLUE.asItem(), "Floof Bluuz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_BROWN.asItem(), "Floof Brownz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_GREEN.asItem(), "Floof Greenz Antibawk Stepz");
  translation.add(ABRCStairs.STAIR_WOOL_RED.asItem(), "Floof Reddz Antibawk Stepz");

  //Buttons
  translation.add(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), "Britee Whytez Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), "Britee Oranjz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), "Britee Magentz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), "Britee Yellerz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), "Britee Syanz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), "Britee Bluuz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), "Britee Greenz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), "Britee Reddz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), "Britee Blakkz Antibawk Buttun");

  translation.add(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), "Floof Whyte Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), "Floof Oranjz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), "Floof Magentz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), "Floof Lite Bluuz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), "Floof Yellerz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_LIME.asItem(), "Floof Laim Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_PINK.asItem(), "Floof Pinkz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), "Floof Gray Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), "Floof Lite Gray Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), "Floof Syanz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), "Floof Purplz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), "Floof Bluuz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), "Floof Brownz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), "Floof Greenz Antibawk Buttun");
  translation.add(ABRCButtons.BUTTON_WOOL_RED.asItem(), "Floof Reddz Antibawk Buttun");

  //Plates
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), "Britee Whytez Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), "Britee Oranjz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), "Britee Magentz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), "Britee Yellerz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), "Britee Syanz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), "Britee Bluuz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), "Britee Greenz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), "Britee Reddz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), "Britee Blakkz Antibawk Purrssure Purrlate");

  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), "Floof Whyte Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), "Floof Oranjz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), "Floof Magentz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), "Floof Lite Bluuz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), "Floof Yellerz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), "Floof Laim Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), "Floof Pinkz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), "Floof Gray Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), "Floof Lite Gray Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), "Floof Syanz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), "Floof Purplz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), "Floof Bluuz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), "Floof Brownz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), "Floof Greenz Antibawk Purrssure Purrlate");
  translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), "Floof Reddz Antibawk Purrssure Purrlate");

 }
}
