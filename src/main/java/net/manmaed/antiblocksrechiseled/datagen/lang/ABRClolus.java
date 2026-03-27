package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ABRClolus extends LanguageProvider {

 public ABRClolus(PackOutput output) {
  super(output, AntiBlocksReChiseled.MOD_ID, "lol_us");
 }

 @Override
 protected void addTranslations() {
  add("a.lang.file.name", "LOLCAT (Kingdom of Cats)");
  add("a.lang.author.name", "ChatGPT");
  add("itemGroup.antiblocksrechiseled", "Antibawks ReChiseledz");

  //Bright
  add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "Britee Whytez Antibawk");
  add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "Britee Oranjz Antibawk");
  add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "Britee Magentz Antibawk");
  add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "Britee Yellerz Antibawk");
  add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "Britee Syanz Antibawk");
  add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "Britee Bluuz Antibawk");
  add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "Britee Greenz Antibawk");
  add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "Britee Reddz Antibawk");
  add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "Britee Blakkz Antibawk");

  //Borders
  add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get().asItem(), "Britee Whytez Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get().asItem(), "Britee Oranjz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get().asItem(), "Britee Magentz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get().asItem(), "Britee Yellerz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get().asItem(), "Britee Syanz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get().asItem(), "Britee Bluuz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get().asItem(), "Britee Greenz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_RED_BORDER.get().asItem(), "Britee Reddz Bordurz Antibawk");
  add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get().asItem(), "Britee Blakkz Bordurz Antibawk");


  //WOOL
  add(ABRCWoolColors.WOOL_WHITE.get().asItem(), "Floof Whyte Antibawk");
  add(ABRCWoolColors.WOOL_ORANGE.get().asItem(), "Floof Oranjz Antibawk");
  add(ABRCWoolColors.WOOL_MAGENTA.get().asItem(), "Floof Magentz Antibawk");
  add(ABRCWoolColors.WOOL_LIGHT_BLUE.get().asItem(), "Floof Lite Bluuz Antibawk");
  add(ABRCWoolColors.WOOL_YELLOW.get().asItem(), "Floof Yellerz Antibawk");
  add(ABRCWoolColors.WOOL_LIME.get().asItem(), "Floof Laim Antibawk");
  add(ABRCWoolColors.WOOL_PINK.get().asItem(), "Floof Pinkz Antibawk");
  add(ABRCWoolColors.WOOL_GRAY.get().asItem(), "Floof Gray Antibawk");
  add(ABRCWoolColors.WOOL_LIGHT_GRAY.get().asItem(), "Floof Lite Gray Antibawk");
  add(ABRCWoolColors.WOOL_CYAN.get().asItem(), "Floof Syanz Antibawk");
  add(ABRCWoolColors.WOOL_PURPLE.get().asItem(), "Floof Purplz Antibawk");
  add(ABRCWoolColors.WOOL_BLUE.get().asItem(), "Floof Bluuz Antibawk");
  add(ABRCWoolColors.WOOL_BROWN.get().asItem(), "Floof Brownz Antibawk");
  add(ABRCWoolColors.WOOL_GREEN.get().asItem(), "Floof Greenz Antibawk");
  add(ABRCWoolColors.WOOL_RED.get().asItem(), "Floof Reddz Antibawk");
  //Borders
  add(ABRCWoolColors.WOOL_WHITE_BORDER.get().asItem(), "Floof Whyte Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_ORANGE_BORDER.get().asItem(), "Floof Oranjz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get().asItem(), "Floof Magentz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get().asItem(), "Floof Lite Bluuz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_YELLOW_BORDER.get().asItem(), "Floof Yellerz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_LIME_BORDER.get().asItem(), "Floof Laim Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_PINK_BORDER.get().asItem(), "Floof Pinkz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_GRAY_BORDER.get().asItem(), "Floof Gray Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get().asItem(), "Floof Lite Gray Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_CYAN_BORDER.get().asItem(), "Floof Syanz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_PURPLE_BORDER.get().asItem(), "Floof Purplz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_BLUE_BORDER.get().asItem(), "Floof Bluuz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_BROWN_BORDER.get().asItem(), "Floof Brownz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_GREEN_BORDER.get().asItem(), "Floof Greenz Bordurz Antibawk");
  add(ABRCWoolColors.WOOL_RED_BORDER.get().asItem(), "Floof Reddz Bordurz Antibawk");

  //SLABS
  add(ABRCSlabs.SLAB_BRIGHT_WHITE.get().asItem(), "Britee Whytez Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_BLACK.get().asItem(), "Britee Blakkz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_ORANGE.get().asItem(), "Britee Oranjz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get().asItem(), "Britee Magentz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_YELLOW.get().asItem(), "Britee Yellerz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_CYAN.get().asItem(), "Britee Syanz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_BLUE.get().asItem(), "Britee Bluuz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_GREEN.get().asItem(), "Britee Greenz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_BRIGHT_RED.get().asItem(), "Britee Reddz Antibawk Clawwed Half Bloc");

  add(ABRCSlabs.SLAB_WOOL_WHITE.get().asItem(), "Floof Whyte Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_ORANGE.get().asItem(), "Floof Oranjz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_MAGENTA.get().asItem(), "Floof Magentz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get().asItem(), "Floof Lite Bluuz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_YELLOW.get().asItem(), "Floof Yellerz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_LIME.get().asItem(), "Floof Laim Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_PINK.get().asItem(), "Floof Pinkz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_GRAY.get().asItem(), "Floof Gray Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get().asItem(), "Floof Lite Gray Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_CYAN.get().asItem(), "Floof Syanz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_PURPLE.get().asItem(), "Floof Purplz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_BLUE.get().asItem(), "Floof Bluuz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_BROWN.get().asItem(), "Floof Brownz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_GREEN.get().asItem(), "Floof Greenz Antibawk Clawwed Half Bloc");
  add(ABRCSlabs.SLAB_WOOL_RED.get().asItem(), "Floof Reddz Antibawk Clawwed Half Bloc");

  //Starirs
  add(ABRCStairs.STAIR_BRIGHT_WHITE.get().asItem(), "Britee Whytez Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_BLACK.get().asItem(), "Britee Blakkz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_ORANGE.get().asItem(), "Britee Oranjz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_MAGENTA.get().asItem(), "Britee Magentz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_YELLOW.get().asItem(), "Britee Yellerz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_CYAN.get().asItem(), "Britee Syanz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_BLUE.get().asItem(), "Britee Bluuz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_GREEN.get().asItem(), "Britee Greenz Antibawk Stepz");
  add(ABRCStairs.STAIR_BRIGHT_RED.get().asItem(), "Britee Reddz Antibawk Stepz");

  add(ABRCStairs.STAIR_WOOL_WHITE.get().asItem(), "Floof Whyte Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_ORANGE.get().asItem(), "Floof Oranjz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_MAGENTA.get().asItem(), "Floof Magentz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get().asItem(), "Floof Lite Bluuz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_YELLOW.get().asItem(), "Floof Yellerz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_LIME.get().asItem(), "Floof Laim Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_PINK.get().asItem(), "Floof Pinkz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_GRAY.get().asItem(), "Floof Gray Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get().asItem(), "Floof Lite Gray Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_CYAN.get().asItem(), "Floof Syanz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_PURPLE.get().asItem(), "Floof Purplz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_BLUE.get().asItem(), "Floof Bluuz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_BROWN.get().asItem(), "Floof Brownz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_GREEN.get().asItem(), "Floof Greenz Antibawk Stepz");
  add(ABRCStairs.STAIR_WOOL_RED.get().asItem(), "Floof Reddz Antibawk Stepz");

  //Buttons
  add(ABRCButtons.BUTTON_BRIGHT_WHITE.get().asItem(), "Britee Whytez Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get().asItem(), "Britee Oranjz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get().asItem(), "Britee Magentz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get().asItem(), "Britee Yellerz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_CYAN.get().asItem(), "Britee Syanz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_BLUE.get().asItem(), "Britee Bluuz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_GREEN.get().asItem(), "Britee Greenz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_RED.get().asItem(), "Britee Reddz Antibawk Buttun");
  add(ABRCButtons.BUTTON_BRIGHT_BLACK.get().asItem(), "Britee Blakkz Antibawk Buttun");

  add(ABRCButtons.BUTTON_WOOL_WHITE.get().asItem(), "Floof Whyte Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_ORANGE.get().asItem(), "Floof Oranjz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_MAGENTA.get().asItem(), "Floof Magentz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get().asItem(), "Floof Lite Bluuz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_YELLOW.get().asItem(), "Floof Yellerz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_LIME.get().asItem(), "Floof Laim Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_PINK.get().asItem(), "Floof Pinkz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_GRAY.get().asItem(), "Floof Gray Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get().asItem(), "Floof Lite Gray Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_CYAN.get().asItem(), "Floof Syanz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_PURPLE.get().asItem(), "Floof Purplz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_BLUE.get().asItem(), "Floof Bluuz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_BROWN.get().asItem(), "Floof Brownz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_GREEN.get().asItem(), "Floof Greenz Antibawk Buttun");
  add(ABRCButtons.BUTTON_WOOL_RED.get().asItem(), "Floof Reddz Antibawk Buttun");

  //Plates
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get().asItem(), "Britee Whytez Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get().asItem(), "Britee Oranjz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get().asItem(), "Britee Magentz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get().asItem(), "Britee Yellerz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get().asItem(), "Britee Syanz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get().asItem(), "Britee Bluuz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get().asItem(), "Britee Greenz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get().asItem(), "Britee Reddz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get().asItem(), "Britee Blakkz Antibawk Purrssure Purrlate");

  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get().asItem(), "Floof Whyte Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get().asItem(), "Floof Oranjz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get().asItem(), "Floof Magentz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get().asItem(), "Floof Lite Bluuz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get().asItem(), "Floof Yellerz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get().asItem(), "Floof Laim Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get().asItem(), "Floof Pinkz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get().asItem(), "Floof Gray Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get().asItem(), "Floof Lite Gray Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get().asItem(), "Floof Syanz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get().asItem(), "Floof Purplz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get().asItem(), "Floof Bluuz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get().asItem(), "Floof Brownz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get().asItem(), "Floof Greenz Antibawk Purrssure Purrlate");
  add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get().asItem(), "Floof Reddz Antibawk Purrssure Purrlate");

 }
}
