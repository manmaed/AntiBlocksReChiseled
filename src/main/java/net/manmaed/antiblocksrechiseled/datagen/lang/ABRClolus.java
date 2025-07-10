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
        add(ABRCBrightColors.BRIGHT_WHITE.get(), "Britee Whytez Antibawk");
        add(ABRCBrightColors.BRIGHT_ORANGE.get(), "Britee Oranjz Antibawk");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get(), "Britee Magentz Antibawk");
        add(ABRCBrightColors.BRIGHT_YELLOW.get(), "Britee Yellerz Antibawk");
        add(ABRCBrightColors.BRIGHT_CYAN.get(), "Britee Syanz Antibawk");
        add(ABRCBrightColors.BRIGHT_BLUE.get(), "Britee Bluuz Antibawk");
        add(ABRCBrightColors.BRIGHT_GREEN.get(), "Britee Greenz Antibawk");
        add(ABRCBrightColors.BRIGHT_RED.get(), "Britee Reddz Antibawk");
        add(ABRCBrightColors.BRIGHT_BLACK.get(), "Britee Blakkz Antibawk");

        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), "Britee Whytez Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), "Britee Oranjz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), "Britee Magentz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), "Britee Yellerz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), "Britee Syanz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), "Britee Bluuz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), "Britee Greenz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get(), "Britee Reddz Bordurz Antibawk");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), "Britee Blakkz Bordurz Antibawk");


        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get(), "Floof Whyte Antibawk");
        add(ABRCWoolColors.WOOL_ORANGE.get(), "Floof Oranjz Antibawk");
        add(ABRCWoolColors.WOOL_MAGENTA.get(), "Floof Magentz Antibawk");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), "Floof Lite Bluuz Antibawk");
        add(ABRCWoolColors.WOOL_YELLOW.get(), "Floof Yellerz Antibawk");
        add(ABRCWoolColors.WOOL_LIME.get(), "Floof Laim Antibawk");
        add(ABRCWoolColors.WOOL_PINK.get(), "Floof Pinkz Antibawk");
        add(ABRCWoolColors.WOOL_GRAY.get(), "Floof Gray Antibawk");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), "Floof Lite Gray Antibawk");
        add(ABRCWoolColors.WOOL_CYAN.get(), "Floof Syanz Antibawk");
        add(ABRCWoolColors.WOOL_PURPLE.get(), "Floof Purplz Antibawk");
        add(ABRCWoolColors.WOOL_BLUE.get(), "Floof Bluuz Antibawk");
        add(ABRCWoolColors.WOOL_BROWN.get(), "Floof Brownz Antibawk");
        add(ABRCWoolColors.WOOL_GREEN.get(), "Floof Greenz Antibawk");
        add(ABRCWoolColors.WOOL_RED.get(), "Floof Reddz Antibawk");
        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get(), "Floof Whyte Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), "Floof Oranjz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), "Floof Magentz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), "Floof Lite Bluuz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), "Floof Yellerz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get(), "Floof Laim Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get(), "Floof Pinkz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get(), "Floof Gray Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), "Floof Lite Gray Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get(), "Floof Syanz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), "Floof Purplz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get(), "Floof Bluuz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get(), "Floof Brownz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get(), "Floof Greenz Bordurz Antibawk");
        add(ABRCWoolColors.WOOL_RED_BORDER.get(), "Floof Reddz Bordurz Antibawk");

        //SLABS
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), "Britee Whytez Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_BLACK.get(), "Britee Blakkz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), "Britee Oranjz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), "Britee Magentz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), "Britee Yellerz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), "Britee Syanz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), "Britee Bluuz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), "Britee Greenz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_RED_BRIGHT.get(), "Britee Reddz Antibawk Clawwed Half Bloc");

        add(ABRCSlabs.SLAB_WHITE_WOOL.get(), "Floof Whyte Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get(), "Floof Oranjz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), "Floof Magentz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), "Floof Lite Bluuz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get(), "Floof Yellerz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_LIME_WOOL.get(), "Floof Laim Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_PINK_WOOL.get(), "Floof Pinkz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_GRAY_WOOL.get(), "Floof Gray Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), "Floof Lite Gray Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_CYAN_WOOL.get(), "Floof Syanz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get(), "Floof Purplz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_BLUE_WOOL.get(), "Floof Bluuz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_BROWN_WOOL.get(), "Floof Brownz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_GREEN_WOOL.get(), "Floof Greenz Antibawk Clawwed Half Bloc");
        add(ABRCSlabs.SLAB_RED_WOOL.get(), "Floof Reddz Antibawk Clawwed Half Bloc");

        //Starirs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get(), "Britee Whytez Antibawk Stepz");
        add(ABRCStairs.STAIR_BLACK.get(), "Britee Blakkz Antibawk Stepz");
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), "Britee Oranjz Antibawk Stepz");
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), "Britee Magentz Antibawk Stepz");
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), "Britee Yellerz Antibawk Stepz");
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get(), "Britee Syanz Antibawk Stepz");
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get(), "Britee Bluuz Antibawk Stepz");
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get(), "Britee Greenz Antibawk Stepz");
        add(ABRCStairs.STAIR_RED_BRIGHT.get(), "Britee Reddz Antibawk Stepz");

        add(ABRCStairs.STAIR_WHITE_WOOL.get(), "Floof Whyte Antibawk Stepz");
        add(ABRCStairs.STAIR_ORANGE_WOOL.get(), "Floof Oranjz Antibawk Stepz");
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get(), "Floof Magentz Antibawk Stepz");
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), "Floof Lite Bluuz Antibawk Stepz");
        add(ABRCStairs.STAIR_YELLOW_WOOL.get(), "Floof Yellerz Antibawk Stepz");
        add(ABRCStairs.STAIR_LIME_WOOL.get(), "Floof Laim Antibawk Stepz");
        add(ABRCStairs.STAIR_PINK_WOOL.get(), "Floof Pinkz Antibawk Stepz");
        add(ABRCStairs.STAIR_GRAY_WOOL.get(), "Floof Gray Antibawk Stepz");
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), "Floof Lite Gray Antibawk Stepz");
        add(ABRCStairs.STAIR_CYAN_WOOL.get(), "Floof Syanz Antibawk Stepz");
        add(ABRCStairs.STAIR_PURPLE_WOOL.get(), "Floof Purplz Antibawk Stepz");
        add(ABRCStairs.STAIR_BLUE_WOOL.get(), "Floof Bluuz Antibawk Stepz");
        add(ABRCStairs.STAIR_BROWN_WOOL.get(), "Floof Brownz Antibawk Stepz");
        add(ABRCStairs.STAIR_GREEN_WOOL.get(), "Floof Greenz Antibawk Stepz");
        add(ABRCStairs.STAIR_RED_WOOL.get(), "Floof Reddz Antibawk Stepz");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), "Britee Whytez Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), "Britee Oranjz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), "Britee Magentz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), "Britee Yellerz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), "Britee Syanz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), "Britee Bluuz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), "Britee Greenz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get(), "Britee Reddz Antibawk Buttun");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), "Britee Blakkz Antibawk Buttun");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get(), "Floof Whyte Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get(), "Floof Oranjz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), "Floof Magentz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), "Floof Lite Bluuz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get(), "Floof Yellerz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_LIME.get(), "Floof Laim Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_PINK.get(), "Floof Pinkz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get(), "Floof Gray Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), "Floof Lite Gray Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get(), "Floof Syanz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get(), "Floof Purplz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get(), "Floof Bluuz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get(), "Floof Brownz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get(), "Floof Greenz Antibawk Buttun");
        add(ABRCButtons.BUTTON_WOOL_RED.get(), "Floof Reddz Antibawk Buttun");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), "Britee Whytez Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), "Britee Oranjz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "Britee Magentz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), "Britee Yellerz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), "Britee Syanz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), "Britee Bluuz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), "Britee Greenz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), "Britee Reddz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), "Britee Blakkz Antibawk Purrssure Purrlate");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), "Floof Whyte Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), "Floof Oranjz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), "Floof Magentz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "Floof Lite Bluuz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), "Floof Yellerz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), "Floof Laim Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), "Floof Pinkz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), "Floof Gray Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "Floof Lite Gray Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), "Floof Syanz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), "Floof Purplz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), "Floof Bluuz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), "Floof Brownz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), "Floof Greenz Antibawk Purrssure Purrlate");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), "Floof Reddz Antibawk Purrssure Purrlate");

    }
}
