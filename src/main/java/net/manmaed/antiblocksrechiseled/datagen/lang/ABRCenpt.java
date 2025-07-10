package net.manmaed.antiblocksrechiseled.datagen.lang;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ABRCenpt extends LanguageProvider {

    public ABRCenpt(PackOutput output) {
        super(output, AntiBlocksReChiseled.MOD_ID, "en_pt");
    }

    @Override
    protected void addTranslations() {
        add("a.lang.file.name", "Pirate Speak (The Seven Seas)");
        add("a.lang.author.name", "ChatGPT");
        add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled — Yarrr!");

        //Bright
        add(ABRCBrightColors.BRIGHT_WHITE.get(), "Shinin' White AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_ORANGE.get(), "Glowing Orange AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get(), "Flashin' Light Purple AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_YELLOW.get(), "Blazin' Yellow AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_CYAN.get(), "Sparklin' Ocean Blue AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLUE.get(), "Deep Blue AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_GREEN.get(), "Vibrant Green AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_RED.get(), "Fiery Scarlet AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLACK.get(), "Dark Black AntiBlock o' the Seven Seas");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), "Shinin' White Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), "Glowing Orange Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), "Flashin' Light Purple Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), "Blazin' Yellow Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), "Sparklin' Ocean Blue Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), "Deep Blue Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), "Vibrant Green Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get(), "Fiery Scarlet Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), "Dark Black Bordered AntiBlock o' the Seven Seas");


        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get(), "Wooly White AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_ORANGE.get(), "Wooly Orange AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_MAGENTA.get(), "Wooly Light Purple AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), "Wooly Light Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_YELLOW.get(), "Wooly Yellow AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIME.get(), "Wooly Lime AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PINK.get(), "Wooly Pink AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GRAY.get(), "Wooly Gray AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), "Wooly Light Gray AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_CYAN.get(), "Wooly Ocean Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PURPLE.get(), "Wooly Purple AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BLUE.get(), "Wooly Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BROWN.get(), "Wooly Brown AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GREEN.get(), "Wooly Green AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_RED.get(), "Wooly Scarlet AntiBlock o' the High Seas");

        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get(), "Wooly White Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), "Wooly Orange Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), "Wooly Light Purple Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), "Wooly Light Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), "Wooly Yellow Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get(), "Wooly Lime Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get(), "Wooly Pink Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get(), "Wooly Gray Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), "Wooly Light Gray Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get(), "Wooly Ocean Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), "Wooly Purple Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get(), "Wooly Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get(), "Wooly Brown Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get(), "Wooly Green Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_RED_BORDER.get(), "Wooly Scarlet Bordered AntiBlock o' the High Seas");



        //SLABS
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), "Shinin' White AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BLACK.get(), "Dark Black AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), "Glowing Orange AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), "Flashin' Light Purple AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), "Blazin' Yellow AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), "Sparklin' Ocean Blue AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), "Deep Blue AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), "Vibrant Green AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_RED_BRIGHT.get(), "Fiery Scarlet AntiBlock Slab o' the Seven Seas");

        add(ABRCSlabs.SLAB_WHITE_WOOL.get(), "Wooly White AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get(), "Wooly Orange AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), "Wooly Light Purple AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), "Wooly Light Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get(), "Wooly Yellow AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_LIME_WOOL.get(), "Wooly Lime AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_PINK_WOOL.get(), "Wooly Pink AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_GRAY_WOOL.get(), "Wooly Gray AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), "Wooly Light Gray AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_CYAN_WOOL.get(), "Wooly Ocean Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get(), "Wooly Purple AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_BLUE_WOOL.get(), "Wooly Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_BROWN_WOOL.get(), "Wooly Brown AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_GREEN_WOOL.get(), "Wooly Green AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_RED_WOOL.get(), "Wooly Scarlet AntiBlock Slab o' the High Seas");


        //Starirs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get(), "Shinin’ White AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BLACK.get(), "Dark Black AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), "Glowing Orange AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), "Flashin’ Light Purple AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), "Blazin’ Yellow AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get(), "Sparklin’ Ocean Blue AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get(), "Deep Blue AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get(), "Vibrant Green AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_RED_BRIGHT.get(), "Fiery Scarlet AntiBlock Stairs o’ the Briny Deep");

        add(ABRCStairs.STAIR_WHITE_WOOL.get(), "Wooly White AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_ORANGE_WOOL.get(), "Wooly Orange AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get(), "Wooly Light Purple AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), "Wooly Light Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_YELLOW_WOOL.get(), "Wooly Yellow AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_LIME_WOOL.get(), "Wooly Lime AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_PINK_WOOL.get(), "Wooly Pink AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_GRAY_WOOL.get(), "Wooly Gray AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), "Wooly Light Gray AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_CYAN_WOOL.get(), "Wooly Ocean Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_PURPLE_WOOL.get(), "Wooly Purple AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_BLUE_WOOL.get(), "Wooly Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_BROWN_WOOL.get(), "Wooly Brown AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_GREEN_WOOL.get(), "Wooly Green AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_RED_WOOL.get(), "Wooly Scarlet AntiBlock Stairs o’ the High Seas");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), "Shinin’ White AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), "Glowing Orange AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), "Flashin’ Light Purple AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), "Blazin’ Yellow AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), "Sparklin’ Ocean Blue AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), "Deep Blue AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), "Vibrant Green AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get(), "Fiery Scarlet AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), "Dark Black AntiBlock Knob o’ the Seven Seas");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get(), "Wooly White AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get(), "Wooly Orange AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), "Wooly Light Purple AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), "Wooly Light Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get(), "Wooly Yellow AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIME.get(), "Wooly Lime AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_PINK.get(), "Wooly Pink AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get(), "Wooly Gray AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), "Wooly Light Gray AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get(), "Wooly Ocean Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get(), "Wooly Purple AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get(), "Wooly Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get(), "Wooly Brown AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get(), "Wooly Green AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_RED.get(), "Wooly Scarlet AntiBlock Knob o’ the High Seas");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), "Shinin’ White AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), "Glowing Orange AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "Flashin’ Light Purple AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), "Blazin’ Yellow AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), "Sparklin’ Ocean Blue AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), "Deep Blue AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), "Vibrant Green AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), "Fiery Scarlet AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), "Dark Black AntiBlock Booby trap o’ the Briny Deep");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), "Wooly White AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), "Wooly Orange AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), "Wooly Light Purple AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "Wooly Light Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), "Wooly Yellow AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), "Wooly Lime AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), "Wooly Pink AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), "Wooly Gray AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "Wooly Light Gray AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), "Wooly Ocean Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), "Wooly Purple AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), "Wooly Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), "Wooly Brown AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), "Wooly Green AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), "Wooly Scarlet AntiBlock Booby trap o’ the High Seas");

    }
}
