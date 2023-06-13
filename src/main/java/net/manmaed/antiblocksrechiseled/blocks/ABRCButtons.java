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

    public static final Block BUTTON_BRIGHT_WHITE = new AntiButton();
    public static final Block BUTTON_BRIGHT_ORANGE = new AntiButton();
    public static final Block BUTTON_BRIGHT_MAGENTA = new AntiButton();
    public static final Block BUTTON_BRIGHT_YELLOW = new AntiButton();
    public static final Block BUTTON_BRIGHT_CYAN = new AntiButton();
    public static final Block BUTTON_BRIGHT_BLUE = new AntiButton();
    public static final Block BUTTON_BRIGHT_GREEN = new AntiButton();
    public static final Block BUTTON_BRIGHT_RED = new AntiButton();
    public static final Block BUTTON_BRIGHT_BLACK = new AntiButton();
    public static final Block BUTTON_WOOL_WHITE = new AntiButton();
    public static final Block BUTTON_WOOL_ORANGE = new AntiButton();
    public static final Block BUTTON_WOOL_MAGENTA = new AntiButton();
    public static final Block BUTTON_WOOL_LIGHT_BLUE = new AntiButton();
    public static final Block BUTTON_WOOL_YELLOW = new AntiButton();
    public static final Block BUTTON_WOOL_LIME = new AntiButton();
    public static final Block BUTTON_WOOL_PINK = new AntiButton();
    public static final Block BUTTON_WOOL_GRAY = new AntiButton();
    public static final Block BUTTON_WOOL_LIGHT_GRAY = new AntiButton();
    public static final Block BUTTON_WOOL_CYAN = new AntiButton();
    public static final Block BUTTON_WOOL_PURPLE = new AntiButton();
    public static final Block BUTTON_WOOL_BLUE = new AntiButton();
    public static final Block BUTTON_WOOL_BROWN = new AntiButton();
    public static final Block BUTTON_WOOL_GREEN = new AntiButton();
    public static final Block BUTTON_WOOL_RED = new AntiButton();

    //ITEM
    public static final Item BUTTON_BRIGHT_WHITE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_WHITE);
    public static final Item BUTTON_BRIGHT_ORANGE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_ORANGE);
    public static final Item BUTTON_BRIGHT_MAGENTA_ITEM = new AntiBlockItem(BUTTON_BRIGHT_MAGENTA);
    public static final Item BUTTON_BRIGHT_YELLOW_ITEM = new AntiBlockItem(BUTTON_BRIGHT_YELLOW);
    public static final Item BUTTON_BRIGHT_CYAN_ITEM = new AntiBlockItem(BUTTON_BRIGHT_CYAN);
    public static final Item BUTTON_BRIGHT_BLUE_ITEM = new AntiBlockItem(BUTTON_BRIGHT_BLUE);
    public static final Item BUTTON_BRIGHT_GREEN_ITEM = new AntiBlockItem(BUTTON_BRIGHT_GREEN);
    public static final Item BUTTON_BRIGHT_RED_ITEM = new AntiBlockItem(BUTTON_BRIGHT_RED);
    public static final Item BUTTON_BRIGHT_BLACK_ITEM = new AntiBlockItem(BUTTON_BRIGHT_BLACK);
    public static final Item BUTTON_WOOL_WHITE_ITEM = new AntiBlockItem(BUTTON_WOOL_WHITE);
    public static final Item BUTTON_WOOL_ORANGE_ITEM = new AntiBlockItem(BUTTON_WOOL_ORANGE);
    public static final Item BUTTON_WOOL_MAGENTA_ITEM = new AntiBlockItem(BUTTON_WOOL_MAGENTA);
    public static final Item BUTTON_WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(BUTTON_WOOL_LIGHT_BLUE);
    public static final Item BUTTON_WOOL_YELLOW_ITEM = new AntiBlockItem(BUTTON_WOOL_YELLOW);
    public static final Item BUTTON_WOOL_LIME_ITEM = new AntiBlockItem(BUTTON_WOOL_LIME);
    public static final Item BUTTON_WOOL_PINK_ITEM = new AntiBlockItem(BUTTON_WOOL_PINK);
    public static final Item BUTTON_WOOL_GRAY_ITEM = new AntiBlockItem(BUTTON_WOOL_GRAY);
    public static final Item BUTTON_WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(BUTTON_WOOL_LIGHT_GRAY);
    public static final Item BUTTON_WOOL_CYAN_ITEM = new AntiBlockItem(BUTTON_WOOL_CYAN);
    public static final Item BUTTON_WOOL_PURPLE_ITEM = new AntiBlockItem(BUTTON_WOOL_PURPLE);
    public static final Item BUTTON_WOOL_BLUE_ITEM = new AntiBlockItem(BUTTON_WOOL_BLUE);
    public static final Item BUTTON_WOOL_BROWN_ITEM = new AntiBlockItem(BUTTON_WOOL_BROWN);
    public static final Item BUTTON_WOOL_GREEN_ITEM = new AntiBlockItem(BUTTON_WOOL_GREEN);
    public static final Item BUTTON_WOOL_RED_ITEM = new AntiBlockItem(BUTTON_WOOL_RED);

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
        return new Identifier(AntiBlocksReChiseled.MOD_ID, name);
    }
}
