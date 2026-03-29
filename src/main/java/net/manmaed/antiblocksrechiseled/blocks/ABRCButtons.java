package net.manmaed.antiblocksrechiseled.blocks;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiButton;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.manmaed.antiblocksrechiseled.utils.ABRCUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ABRCButtons {

    public static final Block BUTTON_BRIGHT_WHITE = new AntiButton("button_bright_white");
    public static final Block BUTTON_BRIGHT_ORANGE = new AntiButton("button_bright_orange");
    public static final Block BUTTON_BRIGHT_MAGENTA = new AntiButton("button_bright_magenta");
    public static final Block BUTTON_BRIGHT_YELLOW = new AntiButton("button_bright_yellow");
    public static final Block BUTTON_BRIGHT_CYAN = new AntiButton("button_bright_cyan");
    public static final Block BUTTON_BRIGHT_BLUE = new AntiButton("button_bright_blue");
    public static final Block BUTTON_BRIGHT_GREEN = new AntiButton("button_bright_green");
    public static final Block BUTTON_BRIGHT_RED = new AntiButton("button_bright_red");
    public static final Block BUTTON_BRIGHT_BLACK = new AntiButton("button_bright_black");
    public static final Block BUTTON_WOOL_WHITE = new AntiButton("button_wool_white");
    public static final Block BUTTON_WOOL_ORANGE = new AntiButton("button_wool_orange");
    public static final Block BUTTON_WOOL_MAGENTA = new AntiButton("button_wool_magenta");
    public static final Block BUTTON_WOOL_LIGHT_BLUE = new AntiButton("button_wool_light_blue");
    public static final Block BUTTON_WOOL_YELLOW = new AntiButton("button_wool_yellow");
    public static final Block BUTTON_WOOL_LIME = new AntiButton("button_wool_lime");
    public static final Block BUTTON_WOOL_PINK = new AntiButton("button_wool_pink");
    public static final Block BUTTON_WOOL_GRAY = new AntiButton("button_wool_gray");
    public static final Block BUTTON_WOOL_LIGHT_GRAY = new AntiButton("button_wool_light_gray");
    public static final Block BUTTON_WOOL_CYAN = new AntiButton("button_wool_cyan");
    public static final Block BUTTON_WOOL_PURPLE = new AntiButton("button_wool_purple");
    public static final Block BUTTON_WOOL_BLUE = new AntiButton("button_wool_blue");
    public static final Block BUTTON_WOOL_BROWN = new AntiButton("button_wool_brown");
    public static final Block BUTTON_WOOL_GREEN = new AntiButton("button_wool_green");
    public static final Block BUTTON_WOOL_RED = new AntiButton("button_wool_red");

    //ITEM
    public static final Item BUTTON_BRIGHT_WHITE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_WHITE, "button_bright_white");
    public static final Item BUTTON_BRIGHT_ORANGE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_ORANGE, "button_bright_orange");
    public static final Item BUTTON_BRIGHT_MAGENTA_ITEM = new AntiBlockItem(BUTTON_BRIGHT_MAGENTA, "button_bright_magenta");
    public static final Item BUTTON_BRIGHT_YELLOW_ITEM = new AntiBlockItem(BUTTON_BRIGHT_YELLOW, "button_bright_yellow");
    public static final Item BUTTON_BRIGHT_CYAN_ITEM = new AntiBlockItem(BUTTON_BRIGHT_CYAN, "button_bright_cyan");
    public static final Item BUTTON_BRIGHT_BLUE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_BLUE, "button_bright_blue");
    public static final Item BUTTON_BRIGHT_GREEN_ITEM = new AntiBlockItem(BUTTON_BRIGHT_GREEN, "button_bright_green");
    public static final Item BUTTON_BRIGHT_RED_ITEM = new AntiBlockItem(BUTTON_BRIGHT_RED, "button_bright_red");
    public static final Item BUTTON_BRIGHT_BLACK_ITEM = new AntiBlockItem(BUTTON_BRIGHT_BLACK, "button_bright_black");
    public static final Item BUTTON_WOOL_WHITE_ITEM = new AntiBlockItem(BUTTON_WOOL_WHITE, "button_wool_white");
    public static final Item BUTTON_WOOL_ORANGE_ITEM = new AntiBlockItem(BUTTON_WOOL_ORANGE, "button_wool_orange");
    public static final Item BUTTON_WOOL_MAGENTA_ITEM = new AntiBlockItem(BUTTON_WOOL_MAGENTA, "button_wool_magenta");
    public static final Item BUTTON_WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(BUTTON_WOOL_LIGHT_BLUE, "button_wool_light_blue");
    public static final Item BUTTON_WOOL_YELLOW_ITEM = new AntiBlockItem(BUTTON_WOOL_YELLOW, "button_wool_yellow");
    public static final Item BUTTON_WOOL_LIME_ITEM = new AntiBlockItem(BUTTON_WOOL_LIME, "button_wool_lime");
    public static final Item BUTTON_WOOL_PINK_ITEM = new AntiBlockItem(BUTTON_WOOL_PINK, "button_wool_pink");
    public static final Item BUTTON_WOOL_GRAY_ITEM = new AntiBlockItem(BUTTON_WOOL_GRAY, "button_wool_gray");
    public static final Item BUTTON_WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(BUTTON_WOOL_LIGHT_GRAY, "button_wool_light_gray");
    public static final Item BUTTON_WOOL_CYAN_ITEM = new AntiBlockItem(BUTTON_WOOL_CYAN, "button_wool_cyan");
    public static final Item BUTTON_WOOL_PURPLE_ITEM = new AntiBlockItem(BUTTON_WOOL_PURPLE, "button_wool_purple");
    public static final Item BUTTON_WOOL_BLUE_ITEM = new AntiBlockItem(BUTTON_WOOL_BLUE, "button_wool_blue");
    public static final Item BUTTON_WOOL_BROWN_ITEM = new AntiBlockItem(BUTTON_WOOL_BROWN, "button_wool_brown");
    public static final Item BUTTON_WOOL_GREEN_ITEM = new AntiBlockItem(BUTTON_WOOL_GREEN, "button_wool_green");
    public static final Item BUTTON_WOOL_RED_ITEM = new AntiBlockItem(BUTTON_WOOL_RED, "button_wool_red");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    public static void doBlockRegistery() {
        registerBlock("button_bright_white", BUTTON_BRIGHT_WHITE);
        registerBlock("button_bright_orange", BUTTON_BRIGHT_ORANGE);
        registerBlock("button_bright_magenta", BUTTON_BRIGHT_MAGENTA);
        registerBlock("button_bright_yellow", BUTTON_BRIGHT_YELLOW);
        registerBlock("button_bright_cyan", BUTTON_BRIGHT_CYAN);
        registerBlock("button_bright_blue", BUTTON_BRIGHT_BLUE);
        registerBlock("button_bright_green", BUTTON_BRIGHT_GREEN);
        registerBlock("button_bright_red", BUTTON_BRIGHT_RED);
        registerBlock("button_bright_black", BUTTON_BRIGHT_BLACK);
        registerBlock("button_wool_white", BUTTON_WOOL_WHITE);
        registerBlock("button_wool_orange", BUTTON_WOOL_ORANGE);
        registerBlock("button_wool_magenta", BUTTON_WOOL_MAGENTA);
        registerBlock("button_wool_light_blue", BUTTON_WOOL_LIGHT_BLUE);
        registerBlock("button_wool_yellow", BUTTON_WOOL_YELLOW);
        registerBlock("button_wool_lime", BUTTON_WOOL_LIME);
        registerBlock("button_wool_pink", BUTTON_WOOL_PINK);
        registerBlock("button_wool_gray", BUTTON_WOOL_GRAY);
        registerBlock("button_wool_light_gray", BUTTON_WOOL_LIGHT_GRAY);
        registerBlock("button_wool_cyan", BUTTON_WOOL_CYAN);
        registerBlock("button_wool_purple", BUTTON_WOOL_PURPLE);
        registerBlock("button_wool_blue", BUTTON_WOOL_BLUE);
        registerBlock("button_wool_brown", BUTTON_WOOL_BROWN);
        registerBlock("button_wool_green", BUTTON_WOOL_GREEN);
        registerBlock("button_wool_red", BUTTON_WOOL_RED);
    }

    public static void doBlockItemRegistery() {
        registerItem("button_bright_white", BUTTON_BRIGHT_WHITE_ITEM);
        registerItem("button_bright_orange", BUTTON_BRIGHT_ORANGE_ITEM);
        registerItem("button_bright_magenta", BUTTON_BRIGHT_MAGENTA_ITEM);
        registerItem("button_bright_yellow", BUTTON_BRIGHT_YELLOW_ITEM);
        registerItem("button_bright_cyan", BUTTON_BRIGHT_CYAN_ITEM);
        registerItem("button_bright_blue", BUTTON_BRIGHT_BLUE_ITEM);
        registerItem("button_bright_green", BUTTON_BRIGHT_GREEN_ITEM);
        registerItem("button_bright_red", BUTTON_BRIGHT_RED_ITEM);
        registerItem("button_bright_black", BUTTON_BRIGHT_BLACK_ITEM);
        registerItem("button_wool_white", BUTTON_WOOL_WHITE_ITEM);
        registerItem("button_wool_orange", BUTTON_WOOL_ORANGE_ITEM);
        registerItem("button_wool_magenta", BUTTON_WOOL_MAGENTA_ITEM);
        registerItem("button_wool_light_blue", BUTTON_WOOL_LIGHT_BLUE_ITEM);
        registerItem("button_wool_yellow", BUTTON_WOOL_YELLOW_ITEM);
        registerItem("button_wool_lime", BUTTON_WOOL_LIME_ITEM);
        registerItem("button_wool_pink", BUTTON_WOOL_PINK_ITEM);
        registerItem("button_wool_gray", BUTTON_WOOL_GRAY_ITEM);
        registerItem("button_wool_light_gray", BUTTON_WOOL_LIGHT_GRAY_ITEM);
        registerItem("button_wool_cyan", BUTTON_WOOL_CYAN_ITEM);
        registerItem("button_wool_purple", BUTTON_WOOL_PURPLE_ITEM);
        registerItem("button_wool_blue", BUTTON_WOOL_BLUE_ITEM);
        registerItem("button_wool_brown", BUTTON_WOOL_BROWN_ITEM);
        registerItem("button_wool_green", BUTTON_WOOL_GREEN_ITEM);
        registerItem("button_wool_red", BUTTON_WOOL_RED_ITEM);
    }

    private static void registerItem(String name, net.minecraft.world.item.Item item) {
        ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ABRCUtils.ident(name));
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        CreativeModeTabEvents.modifyOutputEvent(AntiBlocksReChiseled.CREATIVE_MODE_TABS)
                .register((tab) -> tab.accept(item));
    }

    private static void registerBlock(String name, net.minecraft.world.level.block.Block block) {
        ResourceKey<net.minecraft.world.level.block.Block> blockKey = ResourceKey.create(Registries.BLOCK, ABRCUtils.ident(name));
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }
}
