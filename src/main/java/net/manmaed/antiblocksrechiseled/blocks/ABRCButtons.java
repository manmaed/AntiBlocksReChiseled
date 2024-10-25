package net.manmaed.antiblocksrechiseled.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiButton;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

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
        Registry.register(Registries.BLOCK, getId("button_bright_white"), BUTTON_BRIGHT_WHITE);
        Registry.register(Registries.BLOCK, getId("button_bright_orange"), BUTTON_BRIGHT_ORANGE);
        Registry.register(Registries.BLOCK, getId("button_bright_magenta"), BUTTON_BRIGHT_MAGENTA);
        Registry.register(Registries.BLOCK, getId("button_bright_yellow"), BUTTON_BRIGHT_YELLOW);
        Registry.register(Registries.BLOCK, getId("button_bright_cyan"), BUTTON_BRIGHT_CYAN);
        Registry.register(Registries.BLOCK, getId("button_bright_blue"), BUTTON_BRIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("button_bright_green"), BUTTON_BRIGHT_GREEN);
        Registry.register(Registries.BLOCK, getId("button_bright_red"), BUTTON_BRIGHT_RED);
        Registry.register(Registries.BLOCK, getId("button_bright_black"), BUTTON_BRIGHT_BLACK);
        Registry.register(Registries.BLOCK, getId("button_wool_white"), BUTTON_WOOL_WHITE);
        Registry.register(Registries.BLOCK, getId("button_wool_orange"), BUTTON_WOOL_ORANGE);
        Registry.register(Registries.BLOCK, getId("button_wool_magenta"), BUTTON_WOOL_MAGENTA);
        Registry.register(Registries.BLOCK, getId("button_wool_light_blue"), BUTTON_WOOL_LIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("button_wool_yellow"), BUTTON_WOOL_YELLOW);
        Registry.register(Registries.BLOCK, getId("button_wool_lime"), BUTTON_WOOL_LIME);
        Registry.register(Registries.BLOCK, getId("button_wool_pink"), BUTTON_WOOL_PINK);
        Registry.register(Registries.BLOCK, getId("button_wool_gray"), BUTTON_WOOL_GRAY);
        Registry.register(Registries.BLOCK, getId("button_wool_light_gray"), BUTTON_WOOL_LIGHT_GRAY);
        Registry.register(Registries.BLOCK, getId("button_wool_cyan"), BUTTON_WOOL_CYAN);
        Registry.register(Registries.BLOCK, getId("button_wool_purple"), BUTTON_WOOL_PURPLE);
        Registry.register(Registries.BLOCK, getId("button_wool_blue"), BUTTON_WOOL_BLUE);
        Registry.register(Registries.BLOCK, getId("button_wool_brown"), BUTTON_WOOL_BROWN);
        Registry.register(Registries.BLOCK, getId("button_wool_green"), BUTTON_WOOL_GREEN);
        Registry.register(Registries.BLOCK, getId("button_wool_red"), BUTTON_WOOL_RED);
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

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }

    private static Identifier getId(String name) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, name);
    }
}
