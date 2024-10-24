package net.manmaed.antiblocksrechiseled.datagen;


import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.*;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModLangProvider extends LanguageProvider {
    public ModLangProvider(PackOutput packOutput) {
        super(packOutput, AntiBlocksReChiseled.MOD_ID, "en_us");
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
    protected void addTranslations() {

        boolean addedTop = false;
        if (!addedTop) {
            add("a.lang.file.name", "English US");
            add("a.lang.author.name", "manmaed");
            add("itemGroup.antiblocksrechiseled", "AntiBlocks ReChiseled");
            addedTop = true;

        }
        add(ABRCBrightColors.BRIGHT_WHITE.get(), getMain("Bright", "White", false));
        add(ABRCBrightColors.BRIGHT_ORANGE.get(), getMain("Bright", "Orange", false));
        add(ABRCBrightColors.BRIGHT_MAGENTA.get(), getMain("Bright", "Magenta", false));
        add(ABRCBrightColors.BRIGHT_YELLOW.get(), getMain("Bright", "Yellow", false));
        add(ABRCBrightColors.BRIGHT_CYAN.get(), getMain("Bright", "Cyan", false));
        add(ABRCBrightColors.BRIGHT_BLUE.get(), getMain("Bright", "Blue", false));
        add(ABRCBrightColors.BRIGHT_GREEN.get(), getMain("Bright", "Green", false));
        add(ABRCBrightColors.BRIGHT_RED.get(), getMain("Bright", "Red", false));
        add(ABRCBrightColors.BRIGHT_BLACK.get(), getMain("Bright", "Black", false));
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER.get(), getMain("Bright", "White", true));
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER.get(), getMain("Bright", "Orange", true));
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER.get(), getMain("Bright", "Magenta", true));
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER.get(), getMain("Bright", "Yellow", true));
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER.get(), getMain("Bright", "Cyan", true));
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER.get(), getMain("Bright", "Blue", true));
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER.get(), getMain("Bright", "Green", true));
        add(ABRCBrightColors.BRIGHT_RED_BORDER.get(), getMain("Bright", "Red", true));
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER.get(), getMain("Bright", "Black", true));

        add(ABRCBrightColors.BRIGHT_WHITE_ITEM.get(), getMain("Bright", "White", false));
        add(ABRCBrightColors.BRIGHT_ORANGE_ITEM.get(), getMain("Bright", "Orange", false));
        add(ABRCBrightColors.BRIGHT_MAGENTA_ITEM.get(), getMain("Bright", "Magenta", false));
        add(ABRCBrightColors.BRIGHT_YELLOW_ITEM.get(), getMain("Bright", "Yellow", false));
        add(ABRCBrightColors.BRIGHT_CYAN_ITEM.get(), getMain("Bright", "Cyan", false));
        add(ABRCBrightColors.BRIGHT_BLUE_ITEM.get(), getMain("Bright", "Blue", false));
        add(ABRCBrightColors.BRIGHT_GREEN_ITEM.get(), getMain("Bright", "Green", false));
        add(ABRCBrightColors.BRIGHT_RED_ITEM.get(), getMain("Bright", "Red", false));
        add(ABRCBrightColors.BRIGHT_BLACK_ITEM.get(), getMain("Bright", "Black", false));
        add(ABRCBrightColors.BRIGHT_WHITE_BORDER_ITEM.get(), getMain("Bright", "White", true));
        add(ABRCBrightColors.BRIGHT_ORANGE_BORDER_ITEM.get(), getMain("Bright", "Orange", true));
        add(ABRCBrightColors.BRIGHT_MAGENTA_BORDER_ITEM.get(), getMain("Bright", "Magenta", true));
        add(ABRCBrightColors.BRIGHT_YELLOW_BORDER_ITEM.get(), getMain("Bright", "Yellow", true));
        add(ABRCBrightColors.BRIGHT_CYAN_BORDER_ITEM.get(), getMain("Bright", "Cyan", true));
        add(ABRCBrightColors.BRIGHT_BLUE_BORDER_ITEM.get(), getMain("Bright", "Blue", true));
        add(ABRCBrightColors.BRIGHT_GREEN_BORDER_ITEM.get(), getMain("Bright", "Green", true));
        add(ABRCBrightColors.BRIGHT_RED_BORDER_ITEM.get(), getMain("Bright", "Red", true));
        add(ABRCBrightColors.BRIGHT_BLACK_BORDER_ITEM.get(), getMain("Bright", "Black", true));

//WOOL
        add(ABRCWoolColors.WOOL_WHITE.get(), getMain("Wool", "White", false));
        add(ABRCWoolColors.WOOL_ORANGE.get(), getMain("Wool", "Orange", false));
        add(ABRCWoolColors.WOOL_MAGENTA.get(), getMain("Wool", "Magenta", false));
        add(ABRCWoolColors.WOOL_LIGHT_BLUE.get(), getMain("Wool", "Light Blue", false));
        add(ABRCWoolColors.WOOL_YELLOW.get(), getMain("Wool", "Yellow", false));
        add(ABRCWoolColors.WOOL_LIME.get(), getMain("Wool", "Lime", false));
        add(ABRCWoolColors.WOOL_PINK.get(), getMain("Wool", "Pink", false));
        add(ABRCWoolColors.WOOL_GRAY.get(), getMain("Wool", "Gray", false));
        add(ABRCWoolColors.WOOL_LIGHT_GRAY.get(), getMain("Wool", "Light Gray", false));
        add(ABRCWoolColors.WOOL_CYAN.get(), getMain("Wool", "Cyan", false));
        add(ABRCWoolColors.WOOL_PURPLE.get(), getMain("Wool", "Purple", false));
        add(ABRCWoolColors.WOOL_BLUE.get(), getMain("Wool", "Blue", false));
        add(ABRCWoolColors.WOOL_BROWN.get(), getMain("Wool", "Brown", false));
        add(ABRCWoolColors.WOOL_GREEN.get(), getMain("Wool", "Green", false));
        add(ABRCWoolColors.WOOL_RED.get(), getMain("Wool", "Red", false));

        add(ABRCWoolColors.WOOL_WHITE_BORDER.get(), getMain("Wool", "White", true));
        add(ABRCWoolColors.WOOL_ORANGE_BORDER.get(), getMain("Wool", "Orange", true));
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER.get(), getMain("Wool", "Magenta", true));
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER.get(), getMain("Wool", "Light Blue", true));
        add(ABRCWoolColors.WOOL_YELLOW_BORDER.get(), getMain("Wool", "Yellow", true));
        add(ABRCWoolColors.WOOL_LIME_BORDER.get(), getMain("Wool", "Lime", true));
        add(ABRCWoolColors.WOOL_PINK_BORDER.get(), getMain("Wool", "Pink", true));
        add(ABRCWoolColors.WOOL_GRAY_BORDER.get(), getMain("Wool", "Gray", true));
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER.get(), getMain("Wool", "Light Gray", true));
        add(ABRCWoolColors.WOOL_CYAN_BORDER.get(), getMain("Wool", "Cyan", true));
        add(ABRCWoolColors.WOOL_PURPLE_BORDER.get(), getMain("Wool", "Purple", true));
        add(ABRCWoolColors.WOOL_BLUE_BORDER.get(), getMain("Wool", "Blue", true));
        add(ABRCWoolColors.WOOL_BROWN_BORDER.get(), getMain("Wool", "Brown", true));
        add(ABRCWoolColors.WOOL_GREEN_BORDER.get(), getMain("Wool", "Green", true));
        add(ABRCWoolColors.WOOL_RED_BORDER.get(), getMain("Wool", "Red", true));

        add(ABRCWoolColors.WOOL_WHITE_ITEM.get(), getMain("Wool", "White", false));
        add(ABRCWoolColors.WOOL_ORANGE_ITEM.get(), getMain("Wool", "Orange", false));
        add(ABRCWoolColors.WOOL_MAGENTA_ITEM.get(), getMain("Wool", "Magenta", false));
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_ITEM.get(), getMain("Wool", "Light Blue", false));
        add(ABRCWoolColors.WOOL_YELLOW_ITEM.get(), getMain("Wool", "Yellow", false));
        add(ABRCWoolColors.WOOL_LIME_ITEM.get(), getMain("Wool", "Lime", false));
        add(ABRCWoolColors.WOOL_PINK_ITEM.get(), getMain("Wool", "Pink", false));
        add(ABRCWoolColors.WOOL_GRAY_ITEM.get(), getMain("Wool", "Gray", false));
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_ITEM.get(), getMain("Wool", "Light Gray", false));
        add(ABRCWoolColors.WOOL_CYAN_ITEM.get(), getMain("Wool", "Cyan", false));
        add(ABRCWoolColors.WOOL_PURPLE_ITEM.get(), getMain("Wool", "Purple", false));
        add(ABRCWoolColors.WOOL_BLUE_ITEM.get(), getMain("Wool", "Blue", false));
        add(ABRCWoolColors.WOOL_BROWN_ITEM.get(), getMain("Wool", "Brown", false));
        add(ABRCWoolColors.WOOL_GREEN_ITEM.get(), getMain("Wool", "Green", false));
        add(ABRCWoolColors.WOOL_RED_ITEM.get(), getMain("Wool", "Red", false));
        add(ABRCWoolColors.WOOL_WHITE_BORDER_ITEM.get(), getMain("Wool", "White", true));
        add(ABRCWoolColors.WOOL_ORANGE_BORDER_ITEM.get(), getMain("Wool", "Orange", true));
        add(ABRCWoolColors.WOOL_MAGENTA_BORDER_ITEM.get(), getMain("Wool", "Magenta", true));
        add(ABRCWoolColors.WOOL_LIGHT_BLUE_BORDER_ITEM.get(), getMain("Wool", "Light Blue", true));
        add(ABRCWoolColors.WOOL_YELLOW_BORDER_ITEM.get(), getMain("Wool", "Yellow", true));
        add(ABRCWoolColors.WOOL_LIME_BORDER_ITEM.get(), getMain("Wool", "Lime", true));
        add(ABRCWoolColors.WOOL_PINK_BORDER_ITEM.get(), getMain("Wool", "Pink", true));
        add(ABRCWoolColors.WOOL_GRAY_BORDER_ITEM.get(), getMain("Wool", "Gray", true));
        add(ABRCWoolColors.WOOL_LIGHT_GRAY_BORDER_ITEM.get(), getMain("Wool", "Light Gray", true));
        add(ABRCWoolColors.WOOL_CYAN_BORDER_ITEM.get(), getMain("Wool", "Cyan", true));
        add(ABRCWoolColors.WOOL_PURPLE_BORDER_ITEM.get(), getMain("Wool", "Purple", true));
        add(ABRCWoolColors.WOOL_BLUE_BORDER_ITEM.get(), getMain("Wool", "Blue", true));
        add(ABRCWoolColors.WOOL_BROWN_BORDER_ITEM.get(), getMain("Wool", "Brown", true));
        add(ABRCWoolColors.WOOL_GREEN_BORDER_ITEM.get(), getMain("Wool", "Green", true));
        add(ABRCWoolColors.WOOL_RED_BORDER_ITEM.get(), getMain("Wool", "Red", true));

//SLABS
        add(ABRCSlabs.SLAB_WHITE_BRIGHT.get(), getOther("Slab", "White", "Bright"));
        add(ABRCSlabs.SLAB_BLACK.get(), getOther("Slab", "Black", "Bright"));
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT.get(), getOther("Slab", "Orange", "Bright"));
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT.get(), getOther("Slab", "Magenta", "Bright"));
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT.get(), getOther("Slab", "Yellow", "Bright"));
        add(ABRCSlabs.SLAB_CYAN_BRIGHT.get(), getOther("Slab", "Cyan", "Bright"));
        add(ABRCSlabs.SLAB_BLUE_BRIGHT.get(), getOther("Slab", "Blue", "Bright"));
        add(ABRCSlabs.SLAB_GREEN_BRIGHT.get(), getOther("Slab", "Green", "Bright"));
        add(ABRCSlabs.SLAB_RED_BRIGHT.get(), getOther("Slab", "Red", "Bright"));
        add(ABRCSlabs.SLAB_WHITE_WOOL.get(), getOther("Slab", "White", "Wool"));
        add(ABRCSlabs.SLAB_ORANGE_WOOL.get(), getOther("Slab", "Orange", "Wool"));
        add(ABRCSlabs.SLAB_MAGENTA_WOOL.get(), getOther("Slab", "Magenta", "Wool"));
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL.get(), getOther("Slab", "Light Blue", "Wool"));
        add(ABRCSlabs.SLAB_YELLOW_WOOL.get(), getOther("Slab", "Yellow", "Wool"));
        add(ABRCSlabs.SLAB_LIME_WOOL.get(), getOther("Slab", "Lime", "Wool"));
        add(ABRCSlabs.SLAB_PINK_WOOL.get(), getOther("Slab", "Pink", "Wool"));
        add(ABRCSlabs.SLAB_GRAY_WOOL.get(), getOther("Slab", "Gray", "Wool"));
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL.get(), getOther("Slab", "Light Gray", "Wool"));
        add(ABRCSlabs.SLAB_CYAN_WOOL.get(), getOther("Slab", "Cyan", "Wool"));
        add(ABRCSlabs.SLAB_PURPLE_WOOL.get(), getOther("Slab", "Purple", "Wool"));
        add(ABRCSlabs.SLAB_BLUE_WOOL.get(), getOther("Slab", "Blue", "Wool"));
        add(ABRCSlabs.SLAB_BROWN_WOOL.get(), getOther("Slab", "Brown", "Wool"));
        add(ABRCSlabs.SLAB_GREEN_WOOL.get(), getOther("Slab", "Green", "Wool"));
        add(ABRCSlabs.SLAB_RED_WOOL.get(), getOther("Slab", "Red", "Wool"));

        add(ABRCSlabs.SLAB_WHITE_BRIGHT_ITEM.get(), getOther("Slab", "White", "Bright"));
        add(ABRCSlabs.SLAB_BLACK_ITEM.get(), getOther("Slab", "Black", "Bright"));
        add(ABRCSlabs.SLAB_ORANGE_BRIGHT_ITEM.get(), getOther("Slab", "Orange", "Bright"));
        add(ABRCSlabs.SLAB_MAGENTA_BRIGHT_ITEM.get(), getOther("Slab", "Magenta", "Bright"));
        add(ABRCSlabs.SLAB_YELLOW_BRIGHT_ITEM.get(), getOther("Slab", "Yellow", "Bright"));
        add(ABRCSlabs.SLAB_CYAN_BRIGHT_ITEM.get(), getOther("Slab", "Cyan", "Bright"));
        add(ABRCSlabs.SLAB_BLUE_BRIGHT_ITEM.get(), getOther("Slab", "Blue", "Bright"));
        add(ABRCSlabs.SLAB_GREEN_BRIGHT_ITEM.get(), getOther("Slab", "Green", "Bright"));
        add(ABRCSlabs.SLAB_RED_BRIGHT_ITEM.get(), getOther("Slab", "Red", "Bright"));
        add(ABRCSlabs.SLAB_WHITE_WOOL_ITEM.get(), getOther("Slab", "White", "Wool"));
        add(ABRCSlabs.SLAB_ORANGE_WOOL_ITEM.get(), getOther("Slab", "Orange", "Wool"));
        add(ABRCSlabs.SLAB_MAGENTA_WOOL_ITEM.get(), getOther("Slab", "Magenta", "Wool"));
        add(ABRCSlabs.SLAB_LIGHT_BLUE_WOOL_ITEM.get(), getOther("Slab", "Light Blue", "Wool"));
        add(ABRCSlabs.SLAB_YELLOW_WOOL_ITEM.get(), getOther("Slab", "Yellow", "Wool"));
        add(ABRCSlabs.SLAB_LIME_WOOL_ITEM.get(), getOther("Slab", "Lime", "Wool"));
        add(ABRCSlabs.SLAB_PINK_WOOL_ITEM.get(), getOther("Slab", "Pink", "Wool"));
        add(ABRCSlabs.SLAB_GRAY_WOOL_ITEM.get(), getOther("Slab", "Gray", "Wool"));
        add(ABRCSlabs.SLAB_LIGHT_GRAY_WOOL_ITEM.get(), getOther("Slab", "Light Gray", "Wool"));
        add(ABRCSlabs.SLAB_CYAN_WOOL_ITEM.get(), getOther("Slab", "Cyan", "Wool"));
        add(ABRCSlabs.SLAB_PURPLE_WOOL_ITEM.get(), getOther("Slab", "Purple", "Wool"));
        add(ABRCSlabs.SLAB_BLUE_WOOL_ITEM.get(), getOther("Slab", "Blue", "Wool"));
        add(ABRCSlabs.SLAB_BROWN_WOOL_ITEM.get(), getOther("Slab", "Brown", "Wool"));
        add(ABRCSlabs.SLAB_GREEN_WOOL_ITEM.get(), getOther("Slab", "Green", "Wool"));
        add(ABRCSlabs.SLAB_RED_WOOL_ITEM.get(), getOther("Slab", "Red", "Wool"));

//Starirs
        add(ABRCStairs.STAIR_WHITE_BRIGHT.get(), getOther("Stair", "White", "Bright"));
        add(ABRCStairs.STAIR_BLACK.get(), getOther("Stair", "Black", "Bright"));
        add(ABRCStairs.STAIR_ORANGE_BRIGHT.get(), getOther("Stair", "Orange", "Bright"));
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT.get(), getOther("Stair", "Magenta", "Bright"));
        add(ABRCStairs.STAIR_YELLOW_BRIGHT.get(), getOther("Stair", "Yellow", "Bright"));
        add(ABRCStairs.STAIR_CYAN_BRIGHT.get(), getOther("Stair", "Cyan", "Bright"));
        add(ABRCStairs.STAIR_BLUE_BRIGHT.get(), getOther("Stair", "Blue", "Bright"));
        add(ABRCStairs.STAIR_GREEN_BRIGHT.get(), getOther("Stair", "Green", "Bright"));
        add(ABRCStairs.STAIR_RED_BRIGHT.get(), getOther("Stair", "Red", "Bright"));
        add(ABRCStairs.STAIR_WHITE_WOOL.get(), getOther("Stair", "White", "Wool"));
        add(ABRCStairs.STAIR_ORANGE_WOOL.get(), getOther("Stair", "Orange", "Wool"));
        add(ABRCStairs.STAIR_MAGENTA_WOOL.get(), getOther("Stair", "Magenta", "Wool"));
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL.get(), getOther("Stair", "Light Blue", "Wool"));
        add(ABRCStairs.STAIR_YELLOW_WOOL.get(), getOther("Stair", "Yellow", "Wool"));
        add(ABRCStairs.STAIR_LIME_WOOL.get(), getOther("Stair", "Lime", "Wool"));
        add(ABRCStairs.STAIR_PINK_WOOL.get(), getOther("Stair", "Pink", "Wool"));
        add(ABRCStairs.STAIR_GRAY_WOOL.get(), getOther("Stair", "Gray", "Wool"));
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL.get(), getOther("Stair", "Light Gray", "Wool"));
        add(ABRCStairs.STAIR_CYAN_WOOL.get(), getOther("Stair", "Cyan", "Wool"));
        add(ABRCStairs.STAIR_PURPLE_WOOL.get(), getOther("Stair", "Purple", "Wool"));
        add(ABRCStairs.STAIR_BLUE_WOOL.get(), getOther("Stair", "Blue", "Wool"));
        add(ABRCStairs.STAIR_BROWN_WOOL.get(), getOther("Stair", "Brown", "Wool"));
        add(ABRCStairs.STAIR_GREEN_WOOL.get(), getOther("Stair", "Green", "Wool"));
        add(ABRCStairs.STAIR_RED_WOOL.get(), getOther("Stair", "Red", "Wool"));

        add(ABRCStairs.STAIR_WHITE_BRIGHT_ITEM.get(), getOther("Stair", "White", "Bright"));
        add(ABRCStairs.STAIR_BLACK_ITEM.get(), getOther("Stair", "Black", "Bright"));
        add(ABRCStairs.STAIR_ORANGE_BRIGHT_ITEM.get(), getOther("Stair", "Orange", "Bright"));
        add(ABRCStairs.STAIR_MAGENTA_BRIGHT_ITEM.get(), getOther("Stair", "Magenta", "Bright"));
        add(ABRCStairs.STAIR_YELLOW_BRIGHT_ITEM.get(), getOther("Stair", "Yellow", "Bright"));
        add(ABRCStairs.STAIR_CYAN_BRIGHT_ITEM.get(), getOther("Stair", "Cyan", "Bright"));
        add(ABRCStairs.STAIR_BLUE_BRIGHT_ITEM.get(), getOther("Stair", "Blue", "Bright"));
        add(ABRCStairs.STAIR_GREEN_BRIGHT_ITEM.get(), getOther("Stair", "Green", "Bright"));
        add(ABRCStairs.STAIR_RED_BRIGHT_ITEM.get(), getOther("Stair", "Red", "Bright"));
        add(ABRCStairs.STAIR_WHITE_WOOL_ITEM.get(), getOther("Stair", "White", "Wool"));
        add(ABRCStairs.STAIR_ORANGE_WOOL_ITEM.get(), getOther("Stair", "Orange", "Wool"));
        add(ABRCStairs.STAIR_MAGENTA_WOOL_ITEM.get(), getOther("Stair", "Magenta", "Wool"));
        add(ABRCStairs.STAIR_LIGHT_BLUE_WOOL_ITEM.get(), getOther("Stair", "Light Blue", "Wool"));
        add(ABRCStairs.STAIR_YELLOW_WOOL_ITEM.get(), getOther("Stair", "Yellow", "Wool"));
        add(ABRCStairs.STAIR_LIME_WOOL_ITEM.get(), getOther("Stair", "Lime", "Wool"));
        add(ABRCStairs.STAIR_PINK_WOOL_ITEM.get(), getOther("Stair", "Pink", "Wool"));
        add(ABRCStairs.STAIR_GRAY_WOOL_ITEM.get(), getOther("Stair", "Gray", "Wool"));
        add(ABRCStairs.STAIR_LIGHT_GRAY_WOOL_ITEM.get(), getOther("Stair", "Light Gray", "Wool"));
        add(ABRCStairs.STAIR_CYAN_WOOL_ITEM.get(), getOther("Stair", "Cyan", "Wool"));
        add(ABRCStairs.STAIR_PURPLE_WOOL_ITEM.get(), getOther("Stair", "Purple", "Wool"));
        add(ABRCStairs.STAIR_BLUE_WOOL_ITEM.get(), getOther("Stair", "Blue", "Wool"));
        add(ABRCStairs.STAIR_BROWN_WOOL_ITEM.get(), getOther("Stair", "Brown", "Wool"));
        add(ABRCStairs.STAIR_GREEN_WOOL_ITEM.get(), getOther("Stair", "Green", "Wool"));
        add(ABRCStairs.STAIR_RED_WOOL_ITEM.get(), getOther("Stair", "Red", "Wool"));

        //Buttons
        add(ABRCButtons.BUTTON_BRIGHT_WHITE.get(), getOther("Button", "White", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE.get(), getOther("Button", "Orange", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA.get(), getOther("Button", "Magenta", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW.get(), getOther("Button", "Yellow", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_CYAN.get(), getOther("Button", "Cyan", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_BLUE.get(), getOther("Button", "Blue", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_GREEN.get(), getOther("Button", "Green", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_RED.get(), getOther("Button", "Red", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_BLACK.get(), getOther("Button", "Black", "Bright"));

        add(ABRCButtons.BUTTON_WOOL_WHITE.get(), getOther("Button", "White", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_ORANGE.get(), getOther("Button", "Orange", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_MAGENTA.get(), getOther("Button", "Magenta", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE.get(), getOther("Button", "Light Blue", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_YELLOW.get(), getOther("Button", "Yellow", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIME.get(), getOther("Button", "Lime", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_PINK.get(), getOther("Button", "Pink", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_GRAY.get(), getOther("Button", "Gray", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY.get(), getOther("Button", "Light Gray", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_CYAN.get(), getOther("Button", "Cyan", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_PURPLE.get(), getOther("Button", "Purple", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_BLUE.get(), getOther("Button", "Blue", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_BROWN.get(), getOther("Button", "Brown", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_GREEN.get(), getOther("Button", "Green", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_RED.get(), getOther("Button", "Red", "Wool"));

        add(ABRCButtons.BUTTON_BRIGHT_WHITE_ITEM.get(), getOther("Button", "White", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_ORANGE_ITEM.get(), getOther("Button", "Orange", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_MAGENTA_ITEM.get(), getOther("Button", "Magenta", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_YELLOW_ITEM.get(), getOther("Button", "Yellow", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_CYAN_ITEM.get(), getOther("Button", "Cyan", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_BLUE_ITEM.get(), getOther("Button", "Blue", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_GREEN_ITEM.get(), getOther("Button", "Green", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_RED_ITEM.get(), getOther("Button", "Red", "Bright"));
        add(ABRCButtons.BUTTON_BRIGHT_BLACK_ITEM.get(), getOther("Button", "Black", "Bright"));
        add(ABRCButtons.BUTTON_WOOL_WHITE_ITEM.get(), getOther("Button", "White", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_ORANGE_ITEM.get(), getOther("Button", "Orange", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_MAGENTA_ITEM.get(), getOther("Button", "Magenta", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIGHT_BLUE_ITEM.get(), getOther("Button", "Light Blue", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_YELLOW_ITEM.get(), getOther("Button", "Yellow", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIME_ITEM.get(), getOther("Button", "Lime", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_PINK_ITEM.get(), getOther("Button", "Pink", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_GRAY_ITEM.get(), getOther("Button", "Gray", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_LIGHT_GRAY_ITEM.get(), getOther("Button", "Light Gray", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_CYAN_ITEM.get(), getOther("Button", "Cyan", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_PURPLE_ITEM.get(), getOther("Button", "Purple", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_BLUE_ITEM.get(), getOther("Button", "Blue", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_BROWN_ITEM.get(), getOther("Button", "Brown", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_GREEN_ITEM.get(), getOther("Button", "Green", "Wool"));
        add(ABRCButtons.BUTTON_WOOL_RED_ITEM.get(), getOther("Button", "Red", "Wool"));

        //Plates
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE.get(), getOther("Pressure Plate", "White", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE.get(), getOther("Pressure Plate", "Orange", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA.get(), getOther("Pressure Plate", "Magenta", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW.get(), getOther("Pressure Plate", "Yellow", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN.get(), getOther("Pressure Plate", "Cyan", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE.get(), getOther("Pressure Plate", "Blue", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN.get(), getOther("Pressure Plate", "Green", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED.get(), getOther("Pressure Plate", "Red", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK.get(), getOther("Pressure Plate", "Black", "Bright"));

        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE.get(), getOther("Pressure Plate", "White", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE.get(), getOther("Pressure Plate", "Orange", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA.get(), getOther("Pressure Plate", "Magenta", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), getOther("Pressure Plate", "Light Blue", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW.get(), getOther("Pressure Plate", "Yellow", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME.get(), getOther("Pressure Plate", "Lime", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK.get(), getOther("Pressure Plate", "Pink", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY.get(), getOther("Pressure Plate", "Gray", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), getOther("Pressure Plate", "Light Gray", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN.get(), getOther("Pressure Plate", "Cyan", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE.get(), getOther("Pressure Plate", "Purple", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE.get(), getOther("Pressure Plate", "Blue", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN.get(), getOther("Pressure Plate", "Brown", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN.get(), getOther("Pressure Plate", "Green", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED.get(), getOther("Pressure Plate", "Red", "Wool"));

        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_WHITE_ITEM.get(), getOther("Pressure Plate", "White", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_ORANGE_ITEM.get(), getOther("Pressure Plate", "Orange", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM.get(), getOther("Pressure Plate", "Magenta", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_YELLOW_ITEM.get(), getOther("Pressure Plate", "Yellow", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_CYAN_ITEM.get(), getOther("Pressure Plate", "Cyan", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLUE_ITEM.get(), getOther("Pressure Plate", "Blue", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_GREEN_ITEM.get(), getOther("Pressure Plate", "Green", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_RED_ITEM.get(), getOther("Pressure Plate", "Red", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_BRIGHT_BLACK_ITEM.get(), getOther("Pressure Plate", "Black", "Bright"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_WHITE_ITEM.get(), getOther("Pressure Plate", "White", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_ORANGE_ITEM.get(), getOther("Pressure Plate", "Orange", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_MAGENTA_ITEM.get(), getOther("Pressure Plate", "Magenta", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM.get(), getOther("Pressure Plate", "Light Blue", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_YELLOW_ITEM.get(), getOther("Pressure Plate", "Yellow", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIME_ITEM.get(), getOther("Pressure Plate", "Lime", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PINK_ITEM.get(), getOther("Pressure Plate", "Pink", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GRAY_ITEM.get(), getOther("Pressure Plate", "Gray", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM.get(), getOther("Pressure Plate", "Light Gray", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_CYAN_ITEM.get(), getOther("Pressure Plate", "Cyan", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_PURPLE_ITEM.get(), getOther("Pressure Plate", "Purple", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BLUE_ITEM.get(), getOther("Pressure Plate", "Blue", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_BROWN_ITEM.get(), getOther("Pressure Plate", "Brown", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_GREEN_ITEM.get(), getOther("Pressure Plate", "Green", "Wool"));
        add(ABRCPressurePlates.PRESSURE_PLATE_WOOL_RED_ITEM.get(), getOther("Pressure Plate", "Red", "Wool"));


    }
}
