package net.manmaed.antiblocksrechiseled.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiPressurePlate;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ABRCPressurePlates {


    public static final Block PRESSURE_PLATE_BRIGHT_WHITE = new AntiPressurePlate("pressure_plate_bright_white");
    public static final Block PRESSURE_PLATE_BRIGHT_ORANGE = new AntiPressurePlate("pressure_plate_bright_orange");
    public static final Block PRESSURE_PLATE_BRIGHT_MAGENTA = new AntiPressurePlate("pressure_plate_bright_magenta");
    public static final Block PRESSURE_PLATE_BRIGHT_YELLOW = new AntiPressurePlate("pressure_plate_bright_yellow");
    public static final Block PRESSURE_PLATE_BRIGHT_CYAN = new AntiPressurePlate("pressure_plate_bright_cyan");
    public static final Block PRESSURE_PLATE_BRIGHT_BLUE = new AntiPressurePlate("pressure_plate_bright_blue");
    public static final Block PRESSURE_PLATE_BRIGHT_GREEN = new AntiPressurePlate("pressure_plate_bright_green");
    public static final Block PRESSURE_PLATE_BRIGHT_RED = new AntiPressurePlate("pressure_plate_bright_red");
    public static final Block PRESSURE_PLATE_BRIGHT_BLACK = new AntiPressurePlate("pressure_plate_bright_black");
    public static final Block PRESSURE_PLATE_WOOL_WHITE = new AntiPressurePlate("pressure_plate_wool_white");
    public static final Block PRESSURE_PLATE_WOOL_ORANGE = new AntiPressurePlate("pressure_plate_wool_orange");
    public static final Block PRESSURE_PLATE_WOOL_MAGENTA = new AntiPressurePlate("pressure_plate_wool_magenta");
    public static final Block PRESSURE_PLATE_WOOL_LIGHT_BLUE = new AntiPressurePlate("pressure_plate_wool_light_blue");
    public static final Block PRESSURE_PLATE_WOOL_YELLOW = new AntiPressurePlate("pressure_plate_wool_yellow");
    public static final Block PRESSURE_PLATE_WOOL_LIME = new AntiPressurePlate("pressure_plate_wool_lime");
    public static final Block PRESSURE_PLATE_WOOL_PINK = new AntiPressurePlate("pressure_plate_wool_pink");
    public static final Block PRESSURE_PLATE_WOOL_GRAY = new AntiPressurePlate("pressure_plate_wool_gray");
    public static final Block PRESSURE_PLATE_WOOL_LIGHT_GRAY = new AntiPressurePlate("pressure_plate_wool_light_gray");
    public static final Block PRESSURE_PLATE_WOOL_CYAN = new AntiPressurePlate("pressure_plate_wool_cyan");
    public static final Block PRESSURE_PLATE_WOOL_PURPLE = new AntiPressurePlate("pressure_plate_wool_purple");
    public static final Block PRESSURE_PLATE_WOOL_BLUE = new AntiPressurePlate("pressure_plate_wool_blue");
    public static final Block PRESSURE_PLATE_WOOL_BROWN = new AntiPressurePlate("pressure_plate_wool_brown");
    public static final Block PRESSURE_PLATE_WOOL_GREEN = new AntiPressurePlate("pressure_plate_wool_green");
    public static final Block PRESSURE_PLATE_WOOL_RED = new AntiPressurePlate("pressure_plate_wool_red");

    //Item
    public static final Item PRESSURE_PLATE_BRIGHT_WHITE_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_WHITE, "pressure_plate_bright_white");
    public static final Item PRESSURE_PLATE_BRIGHT_ORANGE_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_ORANGE, "pressure_plate_bright_orange");
    public static final Item PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_MAGENTA, "pressure_plate_bright_magenta");
    public static final Item PRESSURE_PLATE_BRIGHT_YELLOW_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_YELLOW, "pressure_plate_bright_yellow");
    public static final Item PRESSURE_PLATE_BRIGHT_CYAN_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_CYAN, "pressure_plate_bright_cyan");
    public static final Item PRESSURE_PLATE_BRIGHT_BLUE_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLUE, "pressure_plate_bright_blue");
    public static final Item PRESSURE_PLATE_BRIGHT_GREEN_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_GREEN, "pressure_plate_bright_green");
    public static final Item PRESSURE_PLATE_BRIGHT_RED_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_RED, "pressure_plate_bright_red");
    public static final Item PRESSURE_PLATE_BRIGHT_BLACK_ITEM = new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLACK, "pressure_plate_bright_black");
    public static final Item PRESSURE_PLATE_WOOL_WHITE_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_WHITE, "pressure_plate_wool_white");
    public static final Item PRESSURE_PLATE_WOOL_ORANGE_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_ORANGE, "pressure_plate_wool_orange");
    public static final Item PRESSURE_PLATE_WOOL_MAGENTA_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_MAGENTA, "pressure_plate_wool_magenta");
    public static final Item PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_BLUE, "pressure_plate_wool_light_blue");
    public static final Item PRESSURE_PLATE_WOOL_YELLOW_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_YELLOW, "pressure_plate_wool_yellow");
    public static final Item PRESSURE_PLATE_WOOL_LIME_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_LIME, "pressure_plate_wool_lime");
    public static final Item PRESSURE_PLATE_WOOL_PINK_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_PINK, "pressure_plate_wool_pink");
    public static final Item PRESSURE_PLATE_WOOL_GRAY_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_GRAY, "pressure_plate_wool_gray");
    public static final Item PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_GRAY, "pressure_plate_wool_light_gray");
    public static final Item PRESSURE_PLATE_WOOL_CYAN_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_CYAN, "pressure_plate_wool_cyan");
    public static final Item PRESSURE_PLATE_WOOL_PURPLE_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_PURPLE, "pressure_plate_wool_purple");
    public static final Item PRESSURE_PLATE_WOOL_BLUE_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_BLUE, "pressure_plate_wool_blue");
    public static final Item PRESSURE_PLATE_WOOL_BROWN_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_BROWN, "pressure_plate_wool_brown");
    public static final Item PRESSURE_PLATE_WOOL_GREEN_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_GREEN, "pressure_plate_wool_green");
    public static final Item PRESSURE_PLATE_WOOL_RED_ITEM = new AntiBlockItem(PRESSURE_PLATE_WOOL_RED, "pressure_plate_wool_red");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    private static void doBlockItemRegistery() {
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_white"), PRESSURE_PLATE_BRIGHT_WHITE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_orange"), PRESSURE_PLATE_BRIGHT_ORANGE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_magenta"), PRESSURE_PLATE_BRIGHT_MAGENTA);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_yellow"), PRESSURE_PLATE_BRIGHT_YELLOW);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_cyan"), PRESSURE_PLATE_BRIGHT_CYAN);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_blue"), PRESSURE_PLATE_BRIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_green"), PRESSURE_PLATE_BRIGHT_GREEN);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_red"), PRESSURE_PLATE_BRIGHT_RED);
        Registry.register(Registries.BLOCK, getId("pressure_plate_bright_black"), PRESSURE_PLATE_BRIGHT_BLACK);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_white"), PRESSURE_PLATE_WOOL_WHITE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_orange"), PRESSURE_PLATE_WOOL_ORANGE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_magenta"), PRESSURE_PLATE_WOOL_MAGENTA);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_light_blue"), PRESSURE_PLATE_WOOL_LIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_yellow"), PRESSURE_PLATE_WOOL_YELLOW);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_lime"), PRESSURE_PLATE_WOOL_LIME);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_pink"), PRESSURE_PLATE_WOOL_PINK);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_gray"), PRESSURE_PLATE_WOOL_GRAY);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_light_gray"), PRESSURE_PLATE_WOOL_LIGHT_GRAY);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_cyan"), PRESSURE_PLATE_WOOL_CYAN);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_purple"), PRESSURE_PLATE_WOOL_PURPLE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_blue"), PRESSURE_PLATE_WOOL_BLUE);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_brown"), PRESSURE_PLATE_WOOL_BROWN);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_green"), PRESSURE_PLATE_WOOL_GREEN);
        Registry.register(Registries.BLOCK, getId("pressure_plate_wool_red"), PRESSURE_PLATE_WOOL_RED);
    }

    private static void doBlockRegistery() {
        registerItem("pressure_plate_bright_white", PRESSURE_PLATE_BRIGHT_WHITE_ITEM);
        registerItem("pressure_plate_bright_orange", PRESSURE_PLATE_BRIGHT_ORANGE_ITEM);
        registerItem("pressure_plate_bright_magenta", PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM);
        registerItem("pressure_plate_bright_yellow", PRESSURE_PLATE_BRIGHT_YELLOW_ITEM);
        registerItem("pressure_plate_bright_cyan", PRESSURE_PLATE_BRIGHT_CYAN_ITEM);
        registerItem("pressure_plate_bright_blue", PRESSURE_PLATE_BRIGHT_BLUE_ITEM);
        registerItem("pressure_plate_bright_green", PRESSURE_PLATE_BRIGHT_GREEN_ITEM);
        registerItem("pressure_plate_bright_red", PRESSURE_PLATE_BRIGHT_RED_ITEM);
        registerItem("pressure_plate_bright_black", PRESSURE_PLATE_BRIGHT_BLACK_ITEM);
        registerItem("pressure_plate_wool_white", PRESSURE_PLATE_WOOL_WHITE_ITEM);
        registerItem("pressure_plate_wool_orange", PRESSURE_PLATE_WOOL_ORANGE_ITEM);
        registerItem("pressure_plate_wool_magenta", PRESSURE_PLATE_WOOL_MAGENTA_ITEM);
        registerItem("pressure_plate_wool_light_blue", PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM);
        registerItem("pressure_plate_wool_yellow", PRESSURE_PLATE_WOOL_YELLOW_ITEM);
        registerItem("pressure_plate_wool_lime", PRESSURE_PLATE_WOOL_LIME_ITEM);
        registerItem("pressure_plate_wool_pink", PRESSURE_PLATE_WOOL_PINK_ITEM);
        registerItem("pressure_plate_wool_gray", PRESSURE_PLATE_WOOL_GRAY_ITEM);
        registerItem("pressure_plate_wool_light_gray", PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM);
        registerItem("pressure_plate_wool_cyan", PRESSURE_PLATE_WOOL_CYAN_ITEM);
        registerItem("pressure_plate_wool_purple", PRESSURE_PLATE_WOOL_PURPLE_ITEM);
        registerItem("pressure_plate_wool_blue", PRESSURE_PLATE_WOOL_BLUE_ITEM);
        registerItem("pressure_plate_wool_brown", PRESSURE_PLATE_WOOL_BROWN_ITEM);
        registerItem("pressure_plate_wool_green", PRESSURE_PLATE_WOOL_GREEN_ITEM);
        registerItem("pressure_plate_wool_red", PRESSURE_PLATE_WOOL_RED_ITEM);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }

    private static Identifier getId(String name) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, name);
    }
}
