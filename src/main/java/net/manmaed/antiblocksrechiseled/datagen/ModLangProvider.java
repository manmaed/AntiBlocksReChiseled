package net.manmaed.antiblocksrechiseled.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLangProvider extends FabricLanguageProvider {
    protected ModLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private String getMain(String type, String color, Boolean bordered) {
        if (bordered) {
            return type + " " + color + " Bordered AntiBlock";
        } else {
            return type + " " + color + " AntiBlock";

        }
    }

    private String getOther(String typeOfBlock, String color, String typeOfColor) {
        String space = " ";
        return typeOfColor + space + color + space + "AntiBlock " + typeOfBlock;
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("a.lang.file.name", "English US");
        translationBuilder.add("a.lang.author.name", "manmaed");
        translationBuilder.add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled");

        translationBuilder.add(ABRCBrightColors.BRIGHT_WHITE, getMain("Bright", "White", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_ORANGE, getMain("Bright", "Orange", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_MAGENTA, getMain("Bright", "Magenta", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_YELLOW, getMain("Bright", "Yellow", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_CYAN, getMain("Bright", "Cyan", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLUE, getMain("Bright", "Blue", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_GREEN, getMain("Bright", "Green", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_RED, getMain("Bright", "Red", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLACK, getMain("Bright", "Black", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_WHITE_BORDER, getMain("Bright", "White", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER, getMain("Bright", "Orange", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER, getMain("Bright", "Magenta", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER, getMain("Bright", "Yellow", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_CYAN_BORDER, getMain("Bright", "Cyan", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLUE_BORDER, getMain("Bright", "Blue", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_GREEN_BORDER, getMain("Bright", "Green", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_RED_BORDER, getMain("Bright", "Red", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLACK_BORDER, getMain("Bright", "Black", true));

        translationBuilder.add(ABRCBrightColors.BRIGHT_WHITE_ITEM, getMain("Bright", "White", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_ORANGE_ITEM, getMain("Bright", "Orange", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_MAGENTA_ITEM, getMain("Bright", "Magenta", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_YELLOW_ITEM, getMain("Bright", "Yellow", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_CYAN_ITEM, getMain("Bright", "Cyan", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLUE_ITEM, getMain("Bright", "Blue", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_GREEN_ITEM, getMain("Bright", "Green", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_RED_ITEM, getMain("Bright", "Red", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLACK_ITEM, getMain("Bright", "Black", false));
        translationBuilder.add(ABRCBrightColors.BRIGHT_WHITE_BORDER_ITEM, getMain("Bright", "White", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_ORANGE_BORDER_ITEM, getMain("Bright", "Orange", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER_ITEM, getMain("Bright", "Magenta", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_YELLOW_BORDER_ITEM, getMain("Bright", "Yellow", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_CYAN_BORDER_ITEM, getMain("Bright", "Cyan", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLUE_BORDER_ITEM, getMain("Bright", "Blue", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_GREEN_BORDER_ITEM, getMain("Bright", "Green", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_RED_BORDER_ITEM, getMain("Bright", "Red", true));
        translationBuilder.add(ABRCBrightColors.BRIGHT_BLACK_BORDER_ITEM, getMain("Bright", "Black", true));

//WOOL
        translationBuilder.add(ABRCWoolColors.WOOL_WHITE, getMain("Wool", "White", false));
        translationBuilder.add(ABRCWoolColors.WOOL_ORANGE, getMain("Wool", "Orange", false));
        translationBuilder.add(ABRCWoolColors.WOOL_MAGENTA, getMain("Wool", "Magenta", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_BLUE, getMain("Wool", "Light Blue", false));
        translationBuilder.add(ABRCWoolColors.WOOL_YELLOW, getMain("Wool", "Yellow", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIME, getMain("Wool", "Lime", false));
        translationBuilder.add(ABRCWoolColors.WOOL_PINK, getMain("Wool", "Pink", false));
        translationBuilder.add(ABRCWoolColors.WOOL_GRAY, getMain("Wool", "Gray", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_GRAY, getMain("Wool", "Light Gray", false));
        translationBuilder.add(ABRCWoolColors.WOOL_CYAN, getMain("Wool", "Cyan", false));
        translationBuilder.add(ABRCWoolColors.WOOL_PURPLE, getMain("Wool", "Purple", false));
        translationBuilder.add(ABRCWoolColors.WOOL_BLUE, getMain("Wool", "Blue", false));
        translationBuilder.add(ABRCWoolColors.WOOL_BROWN, getMain("Wool", "Brown", false));
        translationBuilder.add(ABRCWoolColors.WOOL_GREEN, getMain("Wool", "Green", false));
        translationBuilder.add(ABRCWoolColors.WOOL_RED, getMain("Wool", "Red", false));

        translationBuilder.add(ABRCWoolColors.WOOL_WHITE_BORDER, getMain("Wool", "White", true));
        translationBuilder.add(ABRCWoolColors.WOOL_ORANGE_BORDER, getMain("Wool", "Orange", true));
        translationBuilder.add(ABRCWoolColors.WOOL_MAGENTA_BORDER, getMain("Wool", "Magenta", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER, getMain("Wool", "Light Blue", true));
        translationBuilder.add(ABRCWoolColors.WOOL_YELLOW_BORDER, getMain("Wool", "Yellow", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIME_BORDER, getMain("Wool", "Lime", true));
        translationBuilder.add(ABRCWoolColors.WOOL_PINK_BORDER, getMain("Wool", "Pink", true));
        translationBuilder.add(ABRCWoolColors.WOOL_GRAY_BORDER, getMain("Wool", "Gray", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER, getMain("Wool", "Light Gray", true));
        translationBuilder.add(ABRCWoolColors.WOOL_CYAN_BORDER, getMain("Wool", "Cyan", true));
        translationBuilder.add(ABRCWoolColors.WOOL_PURPLE_BORDER, getMain("Wool", "Purple", true));
        translationBuilder.add(ABRCWoolColors.WOOL_BLUE_BORDER, getMain("Wool", "Blue", true));
        translationBuilder.add(ABRCWoolColors.WOOL_BROWN_BORDER, getMain("Wool", "Brown", true));
        translationBuilder.add(ABRCWoolColors.WOOL_GREEN_BORDER, getMain("Wool", "Green", true));
        translationBuilder.add(ABRCWoolColors.WOOL_RED_BORDER, getMain("Wool", "Red", true));

        translationBuilder.add(ABRCWoolColors.WOOL_WHITE_ITEM, getMain("Wool", "White", false));
        translationBuilder.add(ABRCWoolColors.WOOL_ORANGE_ITEM, getMain("Wool", "Orange", false));
        translationBuilder.add(ABRCWoolColors.WOOL_MAGENTA_ITEM, getMain("Wool", "Magenta", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_BLUE_ITEM, getMain("Wool", "Light Blue", false));
        translationBuilder.add(ABRCWoolColors.WOOL_YELLOW_ITEM, getMain("Wool", "Yellow", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIME_ITEM, getMain("Wool", "Lime", false));
        translationBuilder.add(ABRCWoolColors.WOOL_PINK_ITEM, getMain("Wool", "Pink", false));
        translationBuilder.add(ABRCWoolColors.WOOL_GRAY_ITEM, getMain("Wool", "Gray", false));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_GRAY_ITEM, getMain("Wool", "Light Gray", false));
        translationBuilder.add(ABRCWoolColors.WOOL_CYAN_ITEM, getMain("Wool", "Cyan", false));
        translationBuilder.add(ABRCWoolColors.WOOL_PURPLE_ITEM, getMain("Wool", "Purple", false));
        translationBuilder.add(ABRCWoolColors.WOOL_BLUE_ITEM, getMain("Wool", "Blue", false));
        translationBuilder.add(ABRCWoolColors.WOOL_BROWN_ITEM, getMain("Wool", "Brown", false));
        translationBuilder.add(ABRCWoolColors.WOOL_GREEN_ITEM, getMain("Wool", "Green", false));
        translationBuilder.add(ABRCWoolColors.WOOL_RED_ITEM, getMain("Wool", "Red", false));
        translationBuilder.add(ABRCWoolColors.WOOL_WHITE_BORDER_ITEM, getMain("Wool", "White", true));
        translationBuilder.add(ABRCWoolColors.WOOL_ORANGE_BORDER_ITEM, getMain("Wool", "Orange", true));
        translationBuilder.add(ABRCWoolColors.WOOL_MAGENTA_BORDER_ITEM, getMain("Wool", "Magenta", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER_ITEM, getMain("Wool", "Light Blue", true));
        translationBuilder.add(ABRCWoolColors.WOOL_YELLOW_BORDER_ITEM, getMain("Wool", "Yellow", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIME_BORDER_ITEM, getMain("Wool", "Lime", true));
        translationBuilder.add(ABRCWoolColors.WOOL_PINK_BORDER_ITEM, getMain("Wool", "Pink", true));
        translationBuilder.add(ABRCWoolColors.WOOL_GRAY_BORDER_ITEM, getMain("Wool", "Gray", true));
        translationBuilder.add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER_ITEM, getMain("Wool", "Light Gray", true));
        translationBuilder.add(ABRCWoolColors.WOOL_CYAN_BORDER_ITEM, getMain("Wool", "Cyan", true));
        translationBuilder.add(ABRCWoolColors.WOOL_PURPLE_BORDER_ITEM, getMain("Wool", "Purple", true));
        translationBuilder.add(ABRCWoolColors.WOOL_BLUE_BORDER_ITEM, getMain("Wool", "Blue", true));
        translationBuilder.add(ABRCWoolColors.WOOL_BROWN_BORDER_ITEM, getMain("Wool", "Brown", true));
        translationBuilder.add(ABRCWoolColors.WOOL_GREEN_BORDER_ITEM, getMain("Wool", "Green", true));
        translationBuilder.add(ABRCWoolColors.WOOL_RED_BORDER_ITEM, getMain("Wool", "Red", true));

//SLABS
        translationBuilder.add(ABRCSlabs.SLAB_WHITE_BRIGHT, getOther("Slab", "White", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_BLACK, getOther("Slab", "Black", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_ORANGE_BRIGHT, getOther("Slab", "Orange", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_MAGENTA_BRIGHT, getOther("Slab", "Magenta", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_YELLOW_BRIGHT, getOther("Slab", "Yellow", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_CYAN_BRIGHT, getOther("Slab", "Cyan", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_BLUE_BRIGHT, getOther("Slab", "Blue", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_GREEN_BRIGHT, getOther("Slab", "Green", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_RED_BRIGHT, getOther("Slab", "Red", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_WHITE_WOOL, getOther("Slab", "White", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_ORANGE_WOOL, getOther("Slab", "Orange", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_MAGENTA_WOOL, getOther("Slab", "Magenta", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL, getOther("Slab", "Light Blue", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_YELLOW_WOOL, getOther("Slab", "Yellow", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIME_WOOL, getOther("Slab", "Lime", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_PINK_WOOL, getOther("Slab", "Pink", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_GRAY_WOOL, getOther("Slab", "Gray", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL, getOther("Slab", "Light Gray", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_CYAN_WOOL, getOther("Slab", "Cyan", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_PURPLE_WOOL, getOther("Slab", "Purple", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_BLUE_WOOL, getOther("Slab", "Blue", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_BROWN_WOOL, getOther("Slab", "Brown", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_GREEN_WOOL, getOther("Slab", "Green", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_RED_WOOL, getOther("Slab", "Red", "Wool"));

        translationBuilder.add(ABRCSlabs.SLAB_WHITE_BRIGHT_ITEM, getOther("Slab", "White", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_BLACK_ITEM, getOther("Slab", "Black", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_ORANGE_BRIGHT_ITEM, getOther("Slab", "Orange", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_MAGENTA_BRIGHT_ITEM, getOther("Slab", "Magenta", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_YELLOW_BRIGHT_ITEM, getOther("Slab", "Yellow", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_CYAN_BRIGHT_ITEM, getOther("Slab", "Cyan", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_BLUE_BRIGHT_ITEM, getOther("Slab", "Blue", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_GREEN_BRIGHT_ITEM, getOther("Slab", "Green", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_RED_BRIGHT_ITEM, getOther("Slab", "Red", "Bright"));
        translationBuilder.add(ABRCSlabs.SLAB_WHITE_WOOL_ITEM, getOther("Slab", "White", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_ORANGE_WOOL_ITEM, getOther("Slab", "Orange", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_MAGENTA_WOOL_ITEM, getOther("Slab", "Magenta", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL_ITEM, getOther("Slab", "Light Blue", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_YELLOW_WOOL_ITEM, getOther("Slab", "Yellow", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIME_WOOL_ITEM, getOther("Slab", "Lime", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_PINK_WOOL_ITEM, getOther("Slab", "Pink", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_GRAY_WOOL_ITEM, getOther("Slab", "Gray", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL_ITEM, getOther("Slab", "Light Gray", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_CYAN_WOOL_ITEM, getOther("Slab", "Cyan", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_PURPLE_WOOL_ITEM, getOther("Slab", "Purple", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_BLUE_WOOL_ITEM, getOther("Slab", "Blue", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_BROWN_WOOL_ITEM, getOther("Slab", "Brown", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_GREEN_WOOL_ITEM, getOther("Slab", "Green", "Wool"));
        translationBuilder.add(ABRCSlabs.SLAB_RED_WOOL_ITEM, getOther("Slab", "Red", "Wool"));

//Starirs
        translationBuilder.add(ABRCStairs.STAIR_WHITE_BRIGHT, getOther("Stair", "White", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_BLACK, getOther("Stair", "Black", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_ORANGE_BRIGHT, getOther("Stair", "Orange", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_MAGENTA_BRIGHT, getOther("Stair", "Magenta", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_YELLOW_BRIGHT, getOther("Stair", "Yellow", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_CYAN_BRIGHT, getOther("Stair", "Cyan", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_BLUE_BRIGHT, getOther("Stair", "Blue", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_GREEN_BRIGHT, getOther("Stair", "Green", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_RED_BRIGHT, getOther("Stair", "Red", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_WHITE_WOOL, getOther("Stair", "White", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_ORANGE_WOOL, getOther("Stair", "Orange", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_MAGENTA_WOOL, getOther("Stair", "Magenta", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL, getOther("Stair", "Light Blue", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_YELLOW_WOOL, getOther("Stair", "Yellow", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIME_WOOL, getOther("Stair", "Lime", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_PINK_WOOL, getOther("Stair", "Pink", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_GRAY_WOOL, getOther("Stair", "Gray", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL, getOther("Stair", "Light Gray", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_CYAN_WOOL, getOther("Stair", "Cyan", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_PURPLE_WOOL, getOther("Stair", "Purple", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_BLUE_WOOL, getOther("Stair", "Blue", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_BROWN_WOOL, getOther("Stair", "Brown", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_GREEN_WOOL, getOther("Stair", "Green", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_RED_WOOL, getOther("Stair", "Red", "Wool"));

        translationBuilder.add(ABRCStairs.STAIR_WHITE_BRIGHT_ITEM, getOther("Stair", "White", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_BLACK_ITEM, getOther("Stair", "Black", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_ORANGE_BRIGHT_ITEM, getOther("Stair", "Orange", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_MAGENTA_BRIGHT_ITEM, getOther("Stair", "Magenta", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_YELLOW_BRIGHT_ITEM, getOther("Stair", "Yellow", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_CYAN_BRIGHT_ITEM, getOther("Stair", "Cyan", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_BLUE_BRIGHT_ITEM, getOther("Stair", "Blue", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_GREEN_BRIGHT_ITEM, getOther("Stair", "Green", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_RED_BRIGHT_ITEM, getOther("Stair", "Red", "Bright"));
        translationBuilder.add(ABRCStairs.STAIR_WHITE_WOOL_ITEM, getOther("Stair", "White", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_ORANGE_WOOL_ITEM, getOther("Stair", "Orange", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_MAGENTA_WOOL_ITEM, getOther("Stair", "Magenta", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL_ITEM, getOther("Stair", "Light Blue", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_YELLOW_WOOL_ITEM, getOther("Stair", "Yellow", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIME_WOOL_ITEM, getOther("Stair", "Lime", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_PINK_WOOL_ITEM, getOther("Stair", "Pink", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_GRAY_WOOL_ITEM, getOther("Stair", "Gray", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL_ITEM, getOther("Stair", "Light Gray", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_CYAN_WOOL_ITEM, getOther("Stair", "Cyan", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_PURPLE_WOOL_ITEM, getOther("Stair", "Purple", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_BLUE_WOOL_ITEM, getOther("Stair", "Blue", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_BROWN_WOOL_ITEM, getOther("Stair", "Brown", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_GREEN_WOOL_ITEM, getOther("Stair", "Green", "Wool"));
        translationBuilder.add(ABRCStairs.STAIR_RED_WOOL_ITEM, getOther("Stair", "Red", "Wool"));

        //Buttons
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_WHITE, getOther("Button", "White", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_ORANGE, getOther("Button", "Orange", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA, getOther("Button", "Magenta", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_YELLOW, getOther("Button", "Yellow", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_CYAN, getOther("Button", "Cyan", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_BLUE, getOther("Button", "Blue", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_GREEN, getOther("Button", "Green", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_RED, getOther("Button", "Red", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_BLACK, getOther("Button", "Black", "Bright"));

        translationBuilder.add(ABRCButtons.BUTTON_WOOL_WHITE, getOther("Button", "White", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_ORANGE, getOther("Button", "Orange", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_MAGENTA, getOther("Button", "Magenta", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE, getOther("Button", "Light Blue", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_YELLOW, getOther("Button", "Yellow", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIME, getOther("Button", "Lime", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_PINK, getOther("Button", "Pink", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_GRAY, getOther("Button", "Gray", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY, getOther("Button", "Light Gray", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_CYAN, getOther("Button", "Cyan", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_PURPLE, getOther("Button", "Purple", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_BLUE, getOther("Button", "Blue", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_BROWN, getOther("Button", "Brown", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_GREEN, getOther("Button", "Green", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_RED, getOther("Button", "Red", "Wool"));

        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_WHITE_ITEM, getOther("Button", "White", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_ORANGE_ITEM, getOther("Button", "Orange", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_MAGENTA_ITEM, getOther("Button", "Magenta", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_YELLOW_ITEM, getOther("Button", "Yellow", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_CYAN_ITEM, getOther("Button", "Cyan", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_BLUE_ITEM, getOther("Button", "Blue", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_GREEN_ITEM, getOther("Button", "Green", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_RED_ITEM, getOther("Button", "Red", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_BRIGHT_BLACK_ITEM, getOther("Button", "Black", "Bright"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_WHITE_ITEM, getOther("Button", "White", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_ORANGE_ITEM, getOther("Button", "Orange", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_MAGENTA_ITEM, getOther("Button", "Magenta", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE_ITEM, getOther("Button", "Light Blue", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_YELLOW_ITEM, getOther("Button", "Yellow", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIME_ITEM, getOther("Button", "Lime", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_PINK_ITEM, getOther("Button", "Pink", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_GRAY_ITEM, getOther("Button", "Gray", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY_ITEM, getOther("Button", "Light Gray", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_CYAN_ITEM, getOther("Button", "Cyan", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_PURPLE_ITEM, getOther("Button", "Purple", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_BLUE_ITEM, getOther("Button", "Blue", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_BROWN_ITEM, getOther("Button", "Brown", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_GREEN_ITEM, getOther("Button", "Green", "Wool"));
        translationBuilder.add(ABRCButtons.BUTTON_WOOL_RED_ITEM, getOther("Button", "Red", "Wool"));

        //Plates
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE, getOther("Pressure Plate", "White", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE, getOther("Pressure Plate", "Orange", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA, getOther("Pressure Plate", "Magenta", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW, getOther("Pressure Plate", "Yellow", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN, getOther("Pressure Plate", "Cyan", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE, getOther("Pressure Plate", "Blue", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN, getOther("Pressure Plate", "Green", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED, getOther("Pressure Plate", "Red", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK, getOther("Pressure Plate", "Black", "Bright"));

        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE, getOther("Pressure Plate", "White", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE, getOther("Pressure Plate", "Orange", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA, getOther("Pressure Plate", "Magenta", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE, getOther("Pressure Plate", "Light Blue", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW, getOther("Pressure Plate", "Yellow", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME, getOther("Pressure Plate", "Lime", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK, getOther("Pressure Plate", "Pink", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY, getOther("Pressure Plate", "Gray", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY, getOther("Pressure Plate", "Light Gray", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN, getOther("Pressure Plate", "Cyan", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE, getOther("Pressure Plate", "Purple", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE, getOther("Pressure Plate", "Blue", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN, getOther("Pressure Plate", "Brown", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN, getOther("Pressure Plate", "Green", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED, getOther("Pressure Plate", "Red", "Wool"));

        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE_ITEM, getOther("Pressure Plate", "White", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE_ITEM, getOther("Pressure Plate", "Orange", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM, getOther("Pressure Plate", "Magenta", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW_ITEM, getOther("Pressure Plate", "Yellow", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN_ITEM, getOther("Pressure Plate", "Cyan", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE_ITEM, getOther("Pressure Plate", "Blue", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN_ITEM, getOther("Pressure Plate", "Green", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED_ITEM, getOther("Pressure Plate", "Red", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK_ITEM, getOther("Pressure Plate", "Black", "Bright"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE_ITEM, getOther("Pressure Plate", "White", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE_ITEM, getOther("Pressure Plate", "Orange", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA_ITEM, getOther("Pressure Plate", "Magenta", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM, getOther("Pressure Plate", "Light Blue", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW_ITEM, getOther("Pressure Plate", "Yellow", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME_ITEM, getOther("Pressure Plate", "Lime", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK_ITEM, getOther("Pressure Plate", "Pink", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY_ITEM, getOther("Pressure Plate", "Gray", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM, getOther("Pressure Plate", "Light Gray", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN_ITEM, getOther("Pressure Plate", "Cyan", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE_ITEM, getOther("Pressure Plate", "Purple", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE_ITEM, getOther("Pressure Plate", "Blue", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN_ITEM, getOther("Pressure Plate", "Brown", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN_ITEM, getOther("Pressure Plate", "Green", "Wool"));
        translationBuilder.add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED_ITEM, getOther("Pressure Plate", "Red", "Wool"));
    }
}
