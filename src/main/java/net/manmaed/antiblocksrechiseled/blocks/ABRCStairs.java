package net.manmaed.antiblocksrechiseled.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiStairBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ABRCStairs {
    public static final Block STAIR_WHITE_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_WHITE.getDefaultState(), "stair_white_bright");
    public static final Block STAIR_BLACK = new AntiStairBlock(ABRCBrightColors.BRIGHT_BLACK.getDefaultState(), "stair_black");
    public static final Block STAIR_ORANGE_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_ORANGE.getDefaultState(), "stair_orange_bright");
    public static final Block STAIR_MAGENTA_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_MAGENTA.getDefaultState(), "stair_magenta_bright");
    public static final Block STAIR_YELLOW_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_YELLOW.getDefaultState(), "stair_yellow_bright");
    public static final Block STAIR_CYAN_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_CYAN.getDefaultState(), "stair_cyan_bright");
    public static final Block STAIR_BLUE_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_BLUE.getDefaultState(), "stair_blue_bright");
    public static final Block STAIR_GREEN_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_GREEN.getDefaultState(), "stair_green_bright");
    public static final Block STAIR_RED_BRIGHT = new AntiStairBlock(ABRCBrightColors.BRIGHT_RED.getDefaultState(), "stair_red_bright");
    public static final Block STAIR_WHITE_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_WHITE.getDefaultState(), "stair_white_wool");
    public static final Block STAIR_ORANGE_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_ORANGE.getDefaultState(), "stair_orange_wool");
    public static final Block STAIR_MAGENTA_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_MAGENTA.getDefaultState(), "stair_magenta_wool");
    public static final Block STAIR_LIGHT_BLUE_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_BLUE.getDefaultState(), "stair_light_blue_wool");
    public static final Block STAIR_YELLOW_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_YELLOW.getDefaultState(), "stair_yellow_wool");
    public static final Block STAIR_LIME_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_LIME.getDefaultState(), "stair_lime_wool");
    public static final Block STAIR_PINK_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_PINK.getDefaultState(), "stair_pink_wool");
    public static final Block STAIR_GRAY_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_GRAY.getDefaultState(), "stair_gray_wool");
    public static final Block STAIR_LIGHT_GRAY_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_GRAY.getDefaultState(), "stair_light_gray_wool");
    public static final Block STAIR_CYAN_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_CYAN.getDefaultState(), "stair_cyan_wool");
    public static final Block STAIR_PURPLE_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_PURPLE.getDefaultState(), "stair_purple_wool");
    public static final Block STAIR_BLUE_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_BLUE.getDefaultState(), "stair_blue_wool");
    public static final Block STAIR_BROWN_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_BROWN.getDefaultState(), "stair_brown_wool");
    public static final Block STAIR_GREEN_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_GREEN.getDefaultState(), "stair_green_wool");
    public static final Block STAIR_RED_WOOL = new AntiStairBlock(ABRCWoolColors.WOOL_RED.getDefaultState(), "stair_red_wool");
    //Items
    public static final Item STAIR_WHITE_BRIGHT_ITEM = new AntiBlockItem(STAIR_WHITE_BRIGHT, "stair_white_bright");
    public static final Item STAIR_BLACK_ITEM = new AntiBlockItem(STAIR_BLACK, "stair_black");
    public static final Item STAIR_ORANGE_BRIGHT_ITEM = new AntiBlockItem(STAIR_ORANGE_BRIGHT, "stair_orange_bright");
    public static final Item STAIR_MAGENTA_BRIGHT_ITEM = new AntiBlockItem(STAIR_MAGENTA_BRIGHT, "stair_magenta_bright");
    public static final Item STAIR_YELLOW_BRIGHT_ITEM = new AntiBlockItem(STAIR_YELLOW_BRIGHT, "stair_yellow_bright");
    public static final Item STAIR_CYAN_BRIGHT_ITEM = new AntiBlockItem(STAIR_CYAN_BRIGHT, "stair_cyan_bright");
    public static final Item STAIR_BLUE_BRIGHT_ITEM = new AntiBlockItem(STAIR_BLUE_BRIGHT, "stair_blue_bright");
    public static final Item STAIR_GREEN_BRIGHT_ITEM = new AntiBlockItem(STAIR_GREEN_BRIGHT, "stair_green_bright");
    public static final Item STAIR_RED_BRIGHT_ITEM = new AntiBlockItem(STAIR_RED_BRIGHT, "stair_red_bright");
    public static final Item STAIR_WHITE_WOOL_ITEM = new AntiBlockItem(STAIR_WHITE_WOOL, "stair_white_wool");
    public static final Item STAIR_ORANGE_WOOL_ITEM = new AntiBlockItem(STAIR_ORANGE_WOOL, "stair_orange_wool");
    public static final Item STAIR_MAGENTA_WOOL_ITEM = new AntiBlockItem(STAIR_MAGENTA_WOOL, "stair_magenta_wool");
    public static final Item STAIR_LIGHT_BLUE_WOOL_ITEM = new AntiBlockItem(STAIR_LIGHT_BLUE_WOOL, "stair_light_blue_wool");
    public static final Item STAIR_YELLOW_WOOL_ITEM = new AntiBlockItem(STAIR_YELLOW_WOOL, "stair_yellow_wool");
    public static final Item STAIR_LIME_WOOL_ITEM = new AntiBlockItem(STAIR_LIME_WOOL, "stair_lime_wool");
    public static final Item STAIR_PINK_WOOL_ITEM = new AntiBlockItem(STAIR_PINK_WOOL, "stair_pink_wool");
    public static final Item STAIR_GRAY_WOOL_ITEM = new AntiBlockItem(STAIR_GRAY_WOOL, "stair_gray_wool");
    public static final Item STAIR_LIGHT_GRAY_WOOL_ITEM = new AntiBlockItem(STAIR_LIGHT_GRAY_WOOL, "stair_light_gray_wool");
    public static final Item STAIR_CYAN_WOOL_ITEM = new AntiBlockItem(STAIR_CYAN_WOOL, "stair_cyan_wool");
    public static final Item STAIR_PURPLE_WOOL_ITEM = new AntiBlockItem(STAIR_PURPLE_WOOL, "stair_purple_wool");
    public static final Item STAIR_BLUE_WOOL_ITEM = new AntiBlockItem(STAIR_BLUE_WOOL, "stair_blue_wool");
    public static final Item STAIR_BROWN_WOOL_ITEM = new AntiBlockItem(STAIR_BROWN_WOOL, "stair_brown_wool");
    public static final Item STAIR_GREEN_WOOL_ITEM = new AntiBlockItem(STAIR_GREEN_WOOL, "stair_green_wool");
    public static final Item STAIR_RED_WOOL_ITEM = new AntiBlockItem(STAIR_RED_WOOL, "stair_red_wool");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    private static void doBlockItemRegistery() {
        Registry.register(Registries.BLOCK, getId("stair_white_bright"), STAIR_WHITE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_black"), STAIR_BLACK);
        Registry.register(Registries.BLOCK, getId("stair_orange_bright"), STAIR_ORANGE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_magenta_bright"), STAIR_MAGENTA_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_yellow_bright"), STAIR_YELLOW_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_cyan_bright"), STAIR_CYAN_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_blue_bright"), STAIR_BLUE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_green_bright"), STAIR_GREEN_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_red_bright"), STAIR_RED_BRIGHT);
        Registry.register(Registries.BLOCK, getId("stair_white_wool"), STAIR_WHITE_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_orange_wool"), STAIR_ORANGE_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_magenta_wool"), STAIR_MAGENTA_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_light_blue_wool"), STAIR_LIGHT_BLUE_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_yellow_wool"), STAIR_YELLOW_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_lime_wool"), STAIR_LIME_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_pink_wool"), STAIR_PINK_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_gray_wool"), STAIR_GRAY_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_light_gray_wool"), STAIR_LIGHT_GRAY_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_cyan_wool"), STAIR_CYAN_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_purple_wool"), STAIR_PURPLE_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_blue_wool"), STAIR_BLUE_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_brown_wool"), STAIR_BROWN_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_green_wool"), STAIR_GREEN_WOOL);
        Registry.register(Registries.BLOCK, getId("stair_red_wool"), STAIR_RED_WOOL);
    }

    private static void doBlockRegistery() {
        registerItem("stair_white_bright", STAIR_WHITE_BRIGHT_ITEM);
        registerItem("stair_black", STAIR_BLACK_ITEM);
        registerItem("stair_orange_bright", STAIR_ORANGE_BRIGHT_ITEM);
        registerItem("stair_magenta_bright", STAIR_MAGENTA_BRIGHT_ITEM);
        registerItem("stair_yellow_bright", STAIR_YELLOW_BRIGHT_ITEM);
        registerItem("stair_cyan_bright", STAIR_CYAN_BRIGHT_ITEM);
        registerItem("stair_blue_bright", STAIR_BLUE_BRIGHT_ITEM);
        registerItem("stair_green_bright", STAIR_GREEN_BRIGHT_ITEM);
        registerItem("stair_red_bright", STAIR_RED_BRIGHT_ITEM);
        registerItem("stair_white_wool", STAIR_WHITE_WOOL_ITEM);
        registerItem("stair_orange_wool", STAIR_ORANGE_WOOL_ITEM);
        registerItem("stair_magenta_wool", STAIR_MAGENTA_WOOL_ITEM);
        registerItem("stair_light_blue_wool", STAIR_LIGHT_BLUE_WOOL_ITEM);
        registerItem("stair_yellow_wool", STAIR_YELLOW_WOOL_ITEM);
        registerItem("stair_lime_wool", STAIR_LIME_WOOL_ITEM);
        registerItem("stair_pink_wool", STAIR_PINK_WOOL_ITEM);
        registerItem("stair_gray_wool", STAIR_GRAY_WOOL_ITEM);
        registerItem("stair_light_gray_wool", STAIR_LIGHT_GRAY_WOOL_ITEM);
        registerItem("stair_cyan_wool", STAIR_CYAN_WOOL_ITEM);
        registerItem("stair_purple_wool", STAIR_PURPLE_WOOL_ITEM);
        registerItem("stair_blue_wool", STAIR_BLUE_WOOL_ITEM);
        registerItem("stair_brown_wool", STAIR_BROWN_WOOL_ITEM);
        registerItem("stair_green_wool", STAIR_GREEN_WOOL_ITEM);
        registerItem("stair_red_wool", STAIR_RED_WOOL_ITEM);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }

    private static Identifier getId(String name) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, name);
    }
}
