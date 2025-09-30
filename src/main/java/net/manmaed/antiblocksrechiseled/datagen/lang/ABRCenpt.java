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
        add(ABRCBrightColors.BRIGHT_WHITE.get().asItem(), "Shinin' White AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_ORANGE.get().asItem(), "Glowing Orange AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_MAGENTA.get().asItem(), "Flashin' Light Purple AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_YELLOW.get().asItem(), "Blazin' Yellow AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_CYAN.get().asItem(), "Sparklin' Ocean Blue AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLUE.get().asItem(), "Deep Blue AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_GREEN.get().asItem(), "Vibrant Green AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_RED.get().asItem(), "Fiery Scarlet AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLACK.get().asItem(), "Dark Black AntiBlock o' the Seven Seas");
        //Borders
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get().asItem(), "Shinin' White Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get().asItem(), "Glowing Orange Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get().asItem(), "Flashin' Light Purple Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get().asItem(), "Blazin' Yellow Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get().asItem(), "Sparklin' Ocean Blue Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get().asItem(), "Deep Blue Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get().asItem(), "Vibrant Green Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get().asItem(), "Fiery Scarlet Bordered AntiBlock o' the Seven Seas");
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get().asItem(), "Dark Black Bordered AntiBlock o' the Seven Seas");


        //WOOL
        add(ABRCWoolColors.WOOL_WHITE.get().asItem(), "Wooly White AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_ORANGE.get().asItem(), "Wooly Orange AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_MAGENTA.get().asItem(), "Wooly Light Purple AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get().asItem(), "Wooly Light Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_YELLOW.get().asItem(), "Wooly Yellow AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIME.get().asItem(), "Wooly Lime AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PINK.get().asItem(), "Wooly Pink AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GRAY.get().asItem(), "Wooly Gray AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get().asItem(), "Wooly Light Gray AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_CYAN.get().asItem(), "Wooly Ocean Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PURPLE.get().asItem(), "Wooly Purple AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BLUE.get().asItem(), "Wooly Blue AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BROWN.get().asItem(), "Wooly Brown AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GREEN.get().asItem(), "Wooly Green AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_RED.get().asItem(), "Wooly Scarlet AntiBlock o' the High Seas");

        //Borders
        add(ABRCWoolColors.WOOL_WHITE_BORDER.get().asItem(), "Wooly White Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get().asItem(), "Wooly Orange Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get().asItem(), "Wooly Light Purple Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get().asItem(), "Wooly Light Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get().asItem(), "Wooly Yellow Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIME_BORDER.get().asItem(), "Wooly Lime Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PINK_BORDER.get().asItem(), "Wooly Pink Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get().asItem(), "Wooly Gray Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get().asItem(), "Wooly Light Gray Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get().asItem(), "Wooly Ocean Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get().asItem(), "Wooly Purple Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get().asItem(), "Wooly Blue Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get().asItem(), "Wooly Brown Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get().asItem(), "Wooly Green Bordered AntiBlock o' the High Seas");
        add(ABRCWoolColors.WOOL_RED_BORDER.get().asItem(), "Wooly Scarlet Bordered AntiBlock o' the High Seas");



        //SLABS
        add(ABRCSlabs.SLAB_BRIGHT_WHITE.get().asItem(), "Shinin' White AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_BLACK.get().asItem(), "Dark Black AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_ORANGE.get().asItem(), "Glowing Orange AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.get().asItem(), "Flashin' Light Purple AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_YELLOW.get().asItem(), "Blazin' Yellow AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_CYAN.get().asItem(), "Sparklin' Ocean Blue AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_BLUE.get().asItem(), "Deep Blue AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_GREEN.get().asItem(), "Vibrant Green AntiBlock Slab o' the Seven Seas");
        add(ABRCSlabs.SLAB_BRIGHT_RED.get().asItem(), "Fiery Scarlet AntiBlock Slab o' the Seven Seas");

        add(ABRCSlabs.SLAB_WOOL_WHITE.get().asItem(), "Wooly White AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_ORANGE.get().asItem(), "Wooly Orange AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_MAGENTA.get().asItem(), "Wooly Light Purple AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.get().asItem(), "Wooly Light Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_YELLOW.get().asItem(), "Wooly Yellow AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_LIME.get().asItem(), "Wooly Lime AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_PINK.get().asItem(), "Wooly Pink AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_GRAY.get().asItem(), "Wooly Gray AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.get().asItem(), "Wooly Light Gray AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_CYAN.get().asItem(), "Wooly Ocean Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_PURPLE.get().asItem(), "Wooly Purple AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_BLUE.get().asItem(), "Wooly Blue AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_BROWN.get().asItem(), "Wooly Brown AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_GREEN.get().asItem(), "Wooly Green AntiBlock Slab o' the High Seas");
        add(ABRCSlabs.SLAB_WOOL_RED.get().asItem(), "Wooly Scarlet AntiBlock Slab o' the High Seas");


        //Starirs
        add(ABRCStairs.STAIR_BRIGHT_WHITE.get().asItem(), "Shinin’ White AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_BLACK.get().asItem(), "Dark Black AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_ORANGE.get().asItem(), "Glowing Orange AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_MAGENTA.get().asItem(), "Flashin’ Light Purple AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_YELLOW.get().asItem(), "Blazin’ Yellow AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_CYAN.get().asItem(), "Sparklin’ Ocean Blue AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_BLUE.get().asItem(), "Deep Blue AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_GREEN.get().asItem(), "Vibrant Green AntiBlock Stairs o’ the Briny Deep");
        add(ABRCStairs.STAIR_BRIGHT_RED.get().asItem(), "Fiery Scarlet AntiBlock Stairs o’ the Briny Deep");

        add(ABRCStairs.STAIR_WOOL_WHITE.get().asItem(), "Wooly White AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_ORANGE.get().asItem(), "Wooly Orange AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_MAGENTA.get().asItem(), "Wooly Light Purple AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.get().asItem(), "Wooly Light Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_YELLOW.get().asItem(), "Wooly Yellow AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_LIME.get().asItem(), "Wooly Lime AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_PINK.get().asItem(), "Wooly Pink AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_GRAY.get().asItem(), "Wooly Gray AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.get().asItem(), "Wooly Light Gray AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_CYAN.get().asItem(), "Wooly Ocean Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_PURPLE.get().asItem(), "Wooly Purple AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_BLUE.get().asItem(), "Wooly Blue AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_BROWN.get().asItem(), "Wooly Brown AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_GREEN.get().asItem(), "Wooly Green AntiBlock Stairs o’ the High Seas");
        add(ABRCStairs.STAIR_WOOL_RED.get().asItem(), "Wooly Scarlet AntiBlock Stairs o’ the High Seas");

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get().asItem(), "Shinin’ White AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get().asItem(), "Glowing Orange AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get().asItem(), "Flashin’ Light Purple AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get().asItem(), "Blazin’ Yellow AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get().asItem(), "Sparklin’ Ocean Blue AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get().asItem(), "Deep Blue AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get().asItem(), "Vibrant Green AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_RED.get().asItem(), "Fiery Scarlet AntiBlock Knob o’ the Seven Seas");
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get().asItem(), "Dark Black AntiBlock Knob o’ the Seven Seas");

        add(ABRCButtons.BUTTON_WOOL_WHITE.get().asItem(), "Wooly White AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get().asItem(), "Wooly Orange AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get().asItem(), "Wooly Light Purple AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get().asItem(), "Wooly Light Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get().asItem(), "Wooly Yellow AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIME.get().asItem(), "Wooly Lime AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_PINK.get().asItem(), "Wooly Pink AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_GRAY.get().asItem(), "Wooly Gray AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get().asItem(), "Wooly Light Gray AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_CYAN.get().asItem(), "Wooly Ocean Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get().asItem(), "Wooly Purple AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_BLUE.get().asItem(), "Wooly Blue AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_BROWN.get().asItem(), "Wooly Brown AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_GREEN.get().asItem(), "Wooly Green AntiBlock Knob o’ the High Seas");
        add(ABRCButtons.BUTTON_WOOL_RED.get().asItem(), "Wooly Scarlet AntiBlock Knob o’ the High Seas");

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get().asItem(), "Shinin’ White AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get().asItem(), "Glowing Orange AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get().asItem(), "Flashin’ Light Purple AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get().asItem(), "Blazin’ Yellow AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get().asItem(), "Sparklin’ Ocean Blue AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get().asItem(), "Deep Blue AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get().asItem(), "Vibrant Green AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get().asItem(), "Fiery Scarlet AntiBlock Booby trap o’ the Briny Deep");
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get().asItem(), "Dark Black AntiBlock Booby trap o’ the Briny Deep");

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get().asItem(), "Wooly White AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get().asItem(), "Wooly Orange AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get().asItem(), "Wooly Light Purple AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get().asItem(), "Wooly Light Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get().asItem(), "Wooly Yellow AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get().asItem(), "Wooly Lime AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get().asItem(), "Wooly Pink AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get().asItem(), "Wooly Gray AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get().asItem(), "Wooly Light Gray AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get().asItem(), "Wooly Ocean Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get().asItem(), "Wooly Purple AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get().asItem(), "Wooly Blue AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get().asItem(), "Wooly Brown AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get().asItem(), "Wooly Green AntiBlock Booby trap o’ the High Seas");
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get().asItem(), "Wooly Scarlet AntiBlock Booby trap o’ the High Seas");
    }
}
