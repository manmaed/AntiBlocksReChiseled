package net.manmaed.antiblocksrechiseled.blocks;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiStairBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.manmaed.antiblocksrechiseled.utils.ABRCUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ABRCStairs {
    public static final Block STAIR_BRIGHT_WHITE = new AntiStairBlock(ABRCBrightColors.BRIGHT_WHITE.defaultBlockState(), "stair_bright_white");
    public static final Block STAIR_BRIGHT_BLACK = new AntiStairBlock(ABRCBrightColors.BRIGHT_BLACK.defaultBlockState(), "stair_bright_black");
    public static final Block STAIR_BRIGHT_ORANGE = new AntiStairBlock(ABRCBrightColors.BRIGHT_ORANGE.defaultBlockState(), "stair_bright_orange");
    public static final Block STAIR_BRIGHT_MAGENTA = new AntiStairBlock(ABRCBrightColors.BRIGHT_MAGENTA.defaultBlockState(), "stair_bright_magenta");
    public static final Block STAIR_BRIGHT_YELLOW = new AntiStairBlock(ABRCBrightColors.BRIGHT_YELLOW.defaultBlockState(), "stair_bright_yellow");
    public static final Block STAIR_BRIGHT_CYAN = new AntiStairBlock(ABRCBrightColors.BRIGHT_CYAN.defaultBlockState(), "stair_bright_cyan");
    public static final Block STAIR_BRIGHT_BLUE = new AntiStairBlock(ABRCBrightColors.BRIGHT_BLUE.defaultBlockState(), "stair_bright_blue");
    public static final Block STAIR_BRIGHT_GREEN = new AntiStairBlock(ABRCBrightColors.BRIGHT_GREEN.defaultBlockState(), "stair_bright_green");
    public static final Block STAIR_BRIGHT_RED = new AntiStairBlock(ABRCBrightColors.BRIGHT_RED.defaultBlockState(), "stair_bright_red");
    public static final Block STAIR_WOOL_WHITE = new AntiStairBlock(ABRCWoolColors.WOOL_WHITE.defaultBlockState(), "stair_wool_white");
    public static final Block STAIR_WOOL_ORANGE = new AntiStairBlock(ABRCWoolColors.WOOL_ORANGE.defaultBlockState(), "stair_wool_orange");
    public static final Block STAIR_WOOL_MAGENTA = new AntiStairBlock(ABRCWoolColors.WOOL_MAGENTA.defaultBlockState(), "stair_wool_magenta");
    public static final Block STAIR_WOOL_LIGHT_BLUE = new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_BLUE.defaultBlockState(), "stair_wool_light_blue");
    public static final Block STAIR_WOOL_YELLOW = new AntiStairBlock(ABRCWoolColors.WOOL_YELLOW.defaultBlockState(), "stair_wool_yellow");
    public static final Block STAIR_WOOL_LIME = new AntiStairBlock(ABRCWoolColors.WOOL_LIME.defaultBlockState(), "stair_wool_lime");
    public static final Block STAIR_WOOL_PINK = new AntiStairBlock(ABRCWoolColors.WOOL_PINK.defaultBlockState(), "stair_wool_pink");
    public static final Block STAIR_WOOL_GRAY = new AntiStairBlock(ABRCWoolColors.WOOL_GRAY.defaultBlockState(), "stair_wool_gray");
    public static final Block STAIR_WOOL_LIGHT_GRAY = new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_GRAY.defaultBlockState(), "stair_wool_light_gray");
    public static final Block STAIR_WOOL_CYAN = new AntiStairBlock(ABRCWoolColors.WOOL_CYAN.defaultBlockState(), "stair_wool_cyan");
    public static final Block STAIR_WOOL_PURPLE = new AntiStairBlock(ABRCWoolColors.WOOL_PURPLE.defaultBlockState(), "stair_wool_purple");
    public static final Block STAIR_WOOL_BLUE = new AntiStairBlock(ABRCWoolColors.WOOL_BLUE.defaultBlockState(), "stair_wool_blue");
    public static final Block STAIR_WOOL_BROWN = new AntiStairBlock(ABRCWoolColors.WOOL_BROWN.defaultBlockState(), "stair_wool_brown");
    public static final Block STAIR_WOOL_GREEN = new AntiStairBlock(ABRCWoolColors.WOOL_GREEN.defaultBlockState(), "stair_wool_green");
    public static final Block STAIR_WOOL_RED = new AntiStairBlock(ABRCWoolColors.WOOL_RED.defaultBlockState(), "stair_wool_red");
    //Items
    public static final Item STAIR_BRIGHT_WHITE_ITEM = new AntiBlockItem(STAIR_BRIGHT_WHITE, "stair_bright_white");
    public static final Item STAIR_BRIGHT_BLACK_ITEM = new AntiBlockItem(STAIR_BRIGHT_BLACK, "stair_bright_black");
    public static final Item STAIR_BRIGHT_ORANGE_ITEM = new AntiBlockItem(STAIR_BRIGHT_ORANGE, "stair_bright_orange");
    public static final Item STAIR_BRIGHT_MAGENTA_ITEM = new AntiBlockItem(STAIR_BRIGHT_MAGENTA, "stair_bright_magenta");
    public static final Item STAIR_BRIGHT_YELLOW_ITEM = new AntiBlockItem(STAIR_BRIGHT_YELLOW, "stair_bright_yellow");
    public static final Item STAIR_BRIGHT_CYAN_ITEM = new AntiBlockItem(STAIR_BRIGHT_CYAN, "stair_bright_cyan");
    public static final Item STAIR_BRIGHT_BLUE_ITEM = new AntiBlockItem(STAIR_BRIGHT_BLUE, "stair_bright_blue");
    public static final Item STAIR_BRIGHT_GREEN_ITEM = new AntiBlockItem(STAIR_BRIGHT_GREEN, "stair_bright_green");
    public static final Item STAIR_BRIGHT_RED_ITEM = new AntiBlockItem(STAIR_BRIGHT_RED, "stair_bright_red");
    public static final Item STAIR_WOOL_WHITE_ITEM = new AntiBlockItem(STAIR_WOOL_WHITE, "stair_wool_white");
    public static final Item STAIR_WOOL_ORANGE_ITEM = new AntiBlockItem(STAIR_WOOL_ORANGE, "stair_wool_orange");
    public static final Item STAIR_WOOL_MAGENTA_ITEM = new AntiBlockItem(STAIR_WOOL_MAGENTA, "stair_wool_magenta");
    public static final Item STAIR_WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(STAIR_WOOL_LIGHT_BLUE, "stair_wool_light_blue");
    public static final Item STAIR_WOOL_YELLOW_ITEM = new AntiBlockItem(STAIR_WOOL_YELLOW, "stair_wool_yellow");
    public static final Item STAIR_WOOL_LIME_ITEM = new AntiBlockItem(STAIR_WOOL_LIME, "stair_wool_lime");
    public static final Item STAIR_WOOL_PINK_ITEM = new AntiBlockItem(STAIR_WOOL_PINK, "stair_wool_pink");
    public static final Item STAIR_WOOL_GRAY_ITEM = new AntiBlockItem(STAIR_WOOL_GRAY, "stair_wool_gray");
    public static final Item STAIR_WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(STAIR_WOOL_LIGHT_GRAY, "stair_wool_light_gray");
    public static final Item STAIR_WOOL_CYAN_ITEM = new AntiBlockItem(STAIR_WOOL_CYAN, "stair_wool_cyan");
    public static final Item STAIR_WOOL_PURPLE_ITEM = new AntiBlockItem(STAIR_WOOL_PURPLE, "stair_wool_purple");
    public static final Item STAIR_WOOL_BLUE_ITEM = new AntiBlockItem(STAIR_WOOL_BLUE, "stair_wool_blue");
    public static final Item STAIR_WOOL_BROWN_ITEM = new AntiBlockItem(STAIR_WOOL_BROWN, "stair_wool_brown");
    public static final Item STAIR_WOOL_GREEN_ITEM = new AntiBlockItem(STAIR_WOOL_GREEN, "stair_wool_green");
    public static final Item STAIR_WOOL_RED_ITEM = new AntiBlockItem(STAIR_WOOL_RED, "stair_wool_red");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    private static void doBlockItemRegistery() {
        registerBlock("stair_bright_white", STAIR_BRIGHT_WHITE);
        registerBlock("stair_bright_black", STAIR_BRIGHT_BLACK);
        registerBlock("stair_bright_orange", STAIR_BRIGHT_ORANGE);
        registerBlock("stair_bright_magenta", STAIR_BRIGHT_MAGENTA);
        registerBlock("stair_bright_yellow", STAIR_BRIGHT_YELLOW);
        registerBlock("stair_bright_cyan", STAIR_BRIGHT_CYAN);
        registerBlock("stair_bright_blue", STAIR_BRIGHT_BLUE);
        registerBlock("stair_bright_green", STAIR_BRIGHT_GREEN);
        registerBlock("stair_bright_red", STAIR_BRIGHT_RED);
        registerBlock("stair_wool_white", STAIR_WOOL_WHITE);
        registerBlock("stair_wool_orange", STAIR_WOOL_ORANGE);
        registerBlock("stair_wool_magenta", STAIR_WOOL_MAGENTA);
        registerBlock("stair_wool_light_blue", STAIR_WOOL_LIGHT_BLUE);
        registerBlock("stair_wool_yellow", STAIR_WOOL_YELLOW);
        registerBlock("stair_wool_lime", STAIR_WOOL_LIME);
        registerBlock("stair_wool_pink", STAIR_WOOL_PINK);
        registerBlock("stair_wool_gray", STAIR_WOOL_GRAY);
        registerBlock("stair_wool_light_gray", STAIR_WOOL_LIGHT_GRAY);
        registerBlock("stair_wool_cyan", STAIR_WOOL_CYAN);
        registerBlock("stair_wool_purple", STAIR_WOOL_PURPLE);
        registerBlock("stair_wool_blue", STAIR_WOOL_BLUE);
        registerBlock("stair_wool_brown", STAIR_WOOL_BROWN);
        registerBlock("stair_wool_green", STAIR_WOOL_GREEN);
        registerBlock("stair_wool_red", STAIR_WOOL_RED);
    }

    private static void doBlockRegistery() {
        registerItem("stair_bright_white", STAIR_BRIGHT_WHITE_ITEM);
        registerItem("stair_bright_black", STAIR_BRIGHT_BLACK_ITEM);
        registerItem("stair_bright_orange", STAIR_BRIGHT_ORANGE_ITEM);
        registerItem("stair_bright_magenta", STAIR_BRIGHT_MAGENTA_ITEM);
        registerItem("stair_bright_yellow", STAIR_BRIGHT_YELLOW_ITEM);
        registerItem("stair_bright_cyan", STAIR_BRIGHT_CYAN_ITEM);
        registerItem("stair_bright_blue", STAIR_BRIGHT_BLUE_ITEM);
        registerItem("stair_bright_green", STAIR_BRIGHT_GREEN_ITEM);
        registerItem("stair_bright_red", STAIR_BRIGHT_RED_ITEM);
        registerItem("stair_wool_white", STAIR_WOOL_WHITE_ITEM);
        registerItem("stair_wool_orange", STAIR_WOOL_ORANGE_ITEM);
        registerItem("stair_wool_magenta", STAIR_WOOL_MAGENTA_ITEM);
        registerItem("stair_wool_light_blue", STAIR_WOOL_LIGHT_BLUE_ITEM);
        registerItem("stair_wool_yellow", STAIR_WOOL_YELLOW_ITEM);
        registerItem("stair_wool_lime", STAIR_WOOL_LIME_ITEM);
        registerItem("stair_wool_pink", STAIR_WOOL_PINK_ITEM);
        registerItem("stair_wool_gray", STAIR_WOOL_GRAY_ITEM);
        registerItem("stair_wool_light_gray", STAIR_WOOL_LIGHT_GRAY_ITEM);
        registerItem("stair_wool_cyan", STAIR_WOOL_CYAN_ITEM);
        registerItem("stair_wool_purple", STAIR_WOOL_PURPLE_ITEM);
        registerItem("stair_wool_blue", STAIR_WOOL_BLUE_ITEM);
        registerItem("stair_wool_brown", STAIR_WOOL_BROWN_ITEM);
        registerItem("stair_wool_green", STAIR_WOOL_GREEN_ITEM);
        registerItem("stair_wool_red", STAIR_WOOL_RED_ITEM);
    }

    private static void registerItem(String name, Item item) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ABRCUtils.ident(name));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        CreativeModeTabEvents.modifyOutputEvent(AntiBlocksReChiseled.CREATIVE_MODE_TABS)
                .register((tab) -> tab.accept(item));
    }

    private static void registerBlock(String name, Block block) {
        ResourceKey<Block> blockKey = ResourceKey.create(Registries.BLOCK, ABRCUtils.ident(name));
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
}
