package net.manmaed.antiblocksrechiseled.datagen.lang;


import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ABRCenpt extends FabricLanguageProvider {

    public ABRCenpt(FabricPackOutput packOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(packOutput, "en_pt", registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translation) {
        translation.add("a.lang.file.name", "Pirate Speak (The Seven Seas)");
        translation.add("a.lang.author.name", "ChatGPT");
        translation.add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled — Yarrr!");

        //Bright
        translation.add(ABRCBrightColors.BRIGHT_WHITE.asItem(), "Shinin' White AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE.asItem(), "Glowing Orange AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA.asItem(), "Flashin' Light Purple AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW.asItem(), "Blazin' Yellow AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_CYAN.asItem(), "Sparklin' Ocean Blue AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_BLUE.asItem(), "Deep Blue AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_GREEN.asItem(), "Vibrant Green AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_RED.asItem(), "Fiery Scarlet AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_BLACK.asItem(), "Dark Black AntiBlock o' the Seven Seas");
        //Borders
        translation.add(ABRCBrightColors.BRIGHT_WHITE_BORDER.asItem(), "Shinin' White Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.asItem(), "Glowing Orange Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.asItem(), "Flashin' Light Purple Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.asItem(), "Blazin' Yellow Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_CYAN_BORDER.asItem(), "Sparklin' Ocean Blue Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_BLUE_BORDER.asItem(), "Deep Blue Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_GREEN_BORDER.asItem(), "Vibrant Green Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_RED_BORDER.asItem(), "Fiery Scarlet Bordered AntiBlock o' the Seven Seas");
        translation.add(ABRCBrightColors.BRIGHT_BLACK_BORDER.asItem(), "Dark Black Bordered AntiBlock o' the Seven Seas");


        //WOOL
        translation.add(ABRCWoolColors.WOOL_WHITE.asItem(), "Wooly White AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_ORANGE.asItem(), "Wooly Orange AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_MAGENTA.asItem(), "Wooly Light Purple AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE.asItem(), "Wooly Light Blue AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_YELLOW.asItem(), "Wooly Yellow AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIME.asItem(), "Wooly Lime AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_PINK.asItem(), "Wooly Pink AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_GRAY.asItem(), "Wooly Gray AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY.asItem(), "Wooly Light Gray AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_CYAN.asItem(), "Wooly Ocean Blue AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_PURPLE.asItem(), "Wooly Purple AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_BLUE.asItem(), "Wooly Blue AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_BROWN.asItem(), "Wooly Brown AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_GREEN.asItem(), "Wooly Green AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_RED.asItem(), "Wooly Scarlet AntiBlock o' the High Seas");

        //Borders
        translation.add(ABRCWoolColors.WOOL_WHITE_BORDER.asItem(), "Wooly White Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_ORANGE_BORDER.asItem(), "Wooly Orange Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_MAGENTA_BORDER.asItem(), "Wooly Light Purple Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.asItem(), "Wooly Light Blue Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_YELLOW_BORDER.asItem(), "Wooly Yellow Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIME_BORDER.asItem(), "Wooly Lime Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_PINK_BORDER.asItem(), "Wooly Pink Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_GRAY_BORDER.asItem(), "Wooly Gray Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.asItem(), "Wooly Light Gray Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_CYAN_BORDER.asItem(), "Wooly Ocean Blue Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_PURPLE_BORDER.asItem(), "Wooly Purple Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_BLUE_BORDER.asItem(), "Wooly Blue Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_BROWN_BORDER.asItem(), "Wooly Brown Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_GREEN_BORDER.asItem(), "Wooly Green Bordered AntiBlock o' the High Seas");
        translation.add(ABRCWoolColors.WOOL_RED_BORDER.asItem(), "Wooly Scarlet Bordered AntiBlock o' the High Seas");



        //SLABS
        translation.add(ABRCSlabs.SLAB_BRIGHT_WHITE.asItem(), "Shinin' White AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLACK.asItem(), "Dark Black AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_ORANGE.asItem(), "Glowing Orange AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_MAGENTA.asItem(), "Flashin' Light Purple AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_YELLOW.asItem(), "Blazin' Yellow AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_CYAN.asItem(), "Sparklin' Ocean Blue AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_BLUE.asItem(), "Deep Blue AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_GREEN.asItem(), "Vibrant Green AntiBlock Slab o' the Seven Seas");
        translation.add(ABRCSlabs.SLAB_BRIGHT_RED.asItem(), "Fiery Scarlet AntiBlock Slab o' the Seven Seas");

        translation.add(ABRCSlabs.SLAB_WOOL_WHITE.asItem(), "Wooly White AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_ORANGE.asItem(), "Wooly Orange AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_MAGENTA.asItem(), "Wooly Light Purple AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_BLUE.asItem(), "Wooly Light Blue AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_YELLOW.asItem(), "Wooly Yellow AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_LIME.asItem(), "Wooly Lime AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_PINK.asItem(), "Wooly Pink AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_GRAY.asItem(), "Wooly Gray AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_LIGHT_GRAY.asItem(), "Wooly Light Gray AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_CYAN.asItem(), "Wooly Ocean Blue AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_PURPLE.asItem(), "Wooly Purple AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_BLUE.asItem(), "Wooly Blue AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_BROWN.asItem(), "Wooly Brown AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_GREEN.asItem(), "Wooly Green AntiBlock Slab o' the High Seas");
        translation.add(ABRCSlabs.SLAB_WOOL_RED.asItem(), "Wooly Scarlet AntiBlock Slab o' the High Seas");


        //Starirs
        translation.add(ABRCStairs.STAIR_BRIGHT_WHITE.asItem(), "Shinin’ White AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLACK.asItem(), "Dark Black AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_ORANGE.asItem(), "Glowing Orange AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_MAGENTA.asItem(), "Flashin’ Light Purple AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_YELLOW.asItem(), "Blazin’ Yellow AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_CYAN.asItem(), "Sparklin’ Ocean Blue AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_BLUE.asItem(), "Deep Blue AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_GREEN.asItem(), "Vibrant Green AntiBlock Stairs o’ the Briny Deep");
        translation.add(ABRCStairs.STAIR_BRIGHT_RED.asItem(), "Fiery Scarlet AntiBlock Stairs o’ the Briny Deep");

        translation.add(ABRCStairs.STAIR_WOOL_WHITE.asItem(), "Wooly White AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_ORANGE.asItem(), "Wooly Orange AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_MAGENTA.asItem(), "Wooly Light Purple AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_BLUE.asItem(), "Wooly Light Blue AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_YELLOW.asItem(), "Wooly Yellow AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_LIME.asItem(), "Wooly Lime AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_PINK.asItem(), "Wooly Pink AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_GRAY.asItem(), "Wooly Gray AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_LIGHT_GRAY.asItem(), "Wooly Light Gray AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_CYAN.asItem(), "Wooly Ocean Blue AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_PURPLE.asItem(), "Wooly Purple AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_BLUE.asItem(), "Wooly Blue AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_BROWN.asItem(), "Wooly Brown AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_GREEN.asItem(), "Wooly Green AntiBlock Stairs o’ the High Seas");
        translation.add(ABRCStairs.STAIR_WOOL_RED.asItem(), "Wooly Scarlet AntiBlock Stairs o’ the High Seas");

        //Buttons
        translation.add(ABRCButtons.BUTTON_BRIGHT_WHITE.asItem(), "Shinin’ White AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_ORANGE.asItem(), "Glowing Orange AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.asItem(), "Flashin’ Light Purple AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_YELLOW.asItem(), "Blazin’ Yellow AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_CYAN.asItem(), "Sparklin’ Ocean Blue AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLUE.asItem(), "Deep Blue AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_GREEN.asItem(), "Vibrant Green AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_RED.asItem(), "Fiery Scarlet AntiBlock Knob o’ the Seven Seas");
        translation.add(ABRCButtons.BUTTON_BRIGHT_BLACK.asItem(), "Dark Black AntiBlock Knob o’ the Seven Seas");

        translation.add(ABRCButtons.BUTTON_WOOL_WHITE.asItem(), "Wooly White AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_ORANGE.asItem(), "Wooly Orange AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_MAGENTA.asItem(), "Wooly Light Purple AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.asItem(), "Wooly Light Blue AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_YELLOW.asItem(), "Wooly Yellow AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_LIME.asItem(), "Wooly Lime AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_PINK.asItem(), "Wooly Pink AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_GRAY.asItem(), "Wooly Gray AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.asItem(), "Wooly Light Gray AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_CYAN.asItem(), "Wooly Ocean Blue AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_PURPLE.asItem(), "Wooly Purple AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_BLUE.asItem(), "Wooly Blue AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_BROWN.asItem(), "Wooly Brown AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_GREEN.asItem(), "Wooly Green AntiBlock Knob o’ the High Seas");
        translation.add(ABRCButtons.BUTTON_WOOL_RED.asItem(), "Wooly Scarlet AntiBlock Knob o’ the High Seas");

        //Plates
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.asItem(), "Shinin’ White AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.asItem(), "Glowing Orange AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.asItem(), "Flashin’ Light Purple AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.asItem(), "Blazin’ Yellow AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.asItem(), "Sparklin’ Ocean Blue AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.asItem(), "Deep Blue AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.asItem(), "Vibrant Green AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.asItem(), "Fiery Scarlet AntiBlock Booby trap o’ the Briny Deep");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.asItem(), "Dark Black AntiBlock Booby trap o’ the Briny Deep");

        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.asItem(), "Wooly White AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.asItem(), "Wooly Orange AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.asItem(), "Wooly Light Purple AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.asItem(), "Wooly Light Blue AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.asItem(), "Wooly Yellow AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.asItem(), "Wooly Lime AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.asItem(), "Wooly Pink AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.asItem(), "Wooly Gray AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.asItem(), "Wooly Light Gray AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.asItem(), "Wooly Ocean Blue AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.asItem(), "Wooly Purple AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.asItem(), "Wooly Blue AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.asItem(), "Wooly Brown AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.asItem(), "Wooly Green AntiBlock Booby trap o’ the High Seas");
        translation.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.asItem(), "Wooly Scarlet AntiBlock Booby trap o’ the High Seas");
    }
}
