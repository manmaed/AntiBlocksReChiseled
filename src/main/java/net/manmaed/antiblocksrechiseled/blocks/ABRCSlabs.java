package net.manmaed.antiblocksrechiseled.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiSlabBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ABRCSlabs {

    public static final Block SLAB_WHITE_BRIGHT = new AntiSlabBlock("slab_white_bright");
    public static final Block SLAB_BLACK = new AntiSlabBlock("slab_black");
    public static final Block SLAB_ORANGE_BRIGHT = new AntiSlabBlock("slab_orange_bright");
    public static final Block SLAB_MAGENTA_BRIGHT = new AntiSlabBlock("slab_magenta_bright");
    public static final Block SLAB_YELLOW_BRIGHT = new AntiSlabBlock("slab_yellow_bright");
    public static final Block SLAB_CYAN_BRIGHT = new AntiSlabBlock("slab_cyan_bright");
    public static final Block SLAB_BLUE_BRIGHT = new AntiSlabBlock("slab_blue_bright");
    public static final Block SLAB_GREEN_BRIGHT = new AntiSlabBlock("slab_green_bright");
    public static final Block SLAB_RED_BRIGHT = new AntiSlabBlock("slab_red_bright");
    public static final Block SLAB_WHITE_WOOL = new AntiSlabBlock("slab_white_wool");
    public static final Block SLAB_ORANGE_WOOL = new AntiSlabBlock("slab_orange_wool");
    public static final Block SLAB_MAGENTA_WOOL = new AntiSlabBlock("slab_magenta_wool");
    public static final Block SLAB_LIGHT_BLUE_WOOL = new AntiSlabBlock("slab_light_blue_wool");
    public static final Block SLAB_YELLOW_WOOL = new AntiSlabBlock("slab_yellow_wool");
    public static final Block SLAB_LIME_WOOL = new AntiSlabBlock("slab_lime_wool");
    public static final Block SLAB_PINK_WOOL = new AntiSlabBlock("slab_pink_wool");
    public static final Block SLAB_GRAY_WOOL = new AntiSlabBlock("slab_gray_wool");
    public static final Block SLAB_LIGHT_GRAY_WOOL = new AntiSlabBlock("slab_light_gray_wool");
    public static final Block SLAB_CYAN_WOOL = new AntiSlabBlock("slab_cyan_wool");
    public static final Block SLAB_PURPLE_WOOL = new AntiSlabBlock("slab_purple_wool");
    public static final Block SLAB_BLUE_WOOL = new AntiSlabBlock("slab_blue_wool");
    public static final Block SLAB_BROWN_WOOL = new AntiSlabBlock("slab_brown_wool");
    public static final Block SLAB_GREEN_WOOL = new AntiSlabBlock("slab_green_wool");
    public static final Block SLAB_RED_WOOL = new AntiSlabBlock("slab_red_wool");

    //Items
    public static final Item SLAB_WHITE_BRIGHT_ITEM = new AntiBlockItem(SLAB_WHITE_BRIGHT, "slab_white_bright");
    public static final Item SLAB_BLACK_ITEM = new AntiBlockItem(SLAB_BLACK, "slab_black");
    public static final Item SLAB_ORANGE_BRIGHT_ITEM = new AntiBlockItem(SLAB_ORANGE_BRIGHT, "slab_orange_bright");
    public static final Item SLAB_MAGENTA_BRIGHT_ITEM = new AntiBlockItem(SLAB_MAGENTA_BRIGHT, "slab_magenta_bright");
    public static final Item SLAB_YELLOW_BRIGHT_ITEM = new AntiBlockItem(SLAB_YELLOW_BRIGHT, "slab_yellow_bright");
    public static final Item SLAB_CYAN_BRIGHT_ITEM = new AntiBlockItem(SLAB_CYAN_BRIGHT, "slab_cyan_bright");
    public static final Item SLAB_BLUE_BRIGHT_ITEM = new AntiBlockItem(SLAB_BLUE_BRIGHT, "slab_blue_bright");
    public static final Item SLAB_GREEN_BRIGHT_ITEM = new AntiBlockItem(SLAB_GREEN_BRIGHT, "slab_green_bright");
    public static final Item SLAB_RED_BRIGHT_ITEM = new AntiBlockItem(SLAB_RED_BRIGHT, "slab_red_bright");
    public static final Item SLAB_WHITE_WOOL_ITEM = new AntiBlockItem(SLAB_WHITE_WOOL, "slab_white_wool");
    public static final Item SLAB_ORANGE_WOOL_ITEM = new AntiBlockItem(SLAB_ORANGE_WOOL, "slab_orange_wool");
    public static final Item SLAB_MAGENTA_WOOL_ITEM = new AntiBlockItem(SLAB_MAGENTA_WOOL, "slab_magenta_wool");
    public static final Item SLAB_LIGHT_BLUE_WOOL_ITEM = new AntiBlockItem(SLAB_LIGHT_BLUE_WOOL, "slab_light_blue_wool");
    public static final Item SLAB_YELLOW_WOOL_ITEM = new AntiBlockItem(SLAB_YELLOW_WOOL, "slab_yellow_wool");
    public static final Item SLAB_LIME_WOOL_ITEM = new AntiBlockItem(SLAB_LIME_WOOL, "slab_lime_wool");
    public static final Item SLAB_PINK_WOOL_ITEM = new AntiBlockItem(SLAB_PINK_WOOL, "slab_pink_wool");
    public static final Item SLAB_GRAY_WOOL_ITEM = new AntiBlockItem(SLAB_GRAY_WOOL, "slab_gray_wool");
    public static final Item SLAB_LIGHT_GRAY_WOOL_ITEM = new AntiBlockItem(SLAB_LIGHT_GRAY_WOOL, "slab_light_gray_wool");
    public static final Item SLAB_CYAN_WOOL_ITEM = new AntiBlockItem(SLAB_CYAN_WOOL, "slab_cyan_wool");
    public static final Item SLAB_PURPLE_WOOL_ITEM = new AntiBlockItem(SLAB_PURPLE_WOOL, "slab_purple_wool");
    public static final Item SLAB_BLUE_WOOL_ITEM = new AntiBlockItem(SLAB_BLUE_WOOL, "slab_blue_wool");
    public static final Item SLAB_BROWN_WOOL_ITEM = new AntiBlockItem(SLAB_BROWN_WOOL, "slab_brown_wool");
    public static final Item SLAB_GREEN_WOOL_ITEM = new AntiBlockItem(SLAB_GREEN_WOOL, "slab_green_wool");
    public static final Item SLAB_RED_WOOL_ITEM = new AntiBlockItem(SLAB_RED_WOOL, "slab_red_wool");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    private static void doBlockItemRegistery() {
        Registry.register(Registries.BLOCK, getId("slab_white_bright"), SLAB_WHITE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_black"), SLAB_BLACK);
        Registry.register(Registries.BLOCK, getId("slab_orange_bright"), SLAB_ORANGE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_magenta_bright"), SLAB_MAGENTA_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_yellow_bright"), SLAB_YELLOW_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_cyan_bright"), SLAB_CYAN_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_blue_bright"), SLAB_BLUE_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_green_bright"), SLAB_GREEN_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_red_bright"), SLAB_RED_BRIGHT);
        Registry.register(Registries.BLOCK, getId("slab_white_wool"), SLAB_WHITE_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_orange_wool"), SLAB_ORANGE_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_magenta_wool"), SLAB_MAGENTA_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_light_blue_wool"), SLAB_LIGHT_BLUE_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_yellow_wool"), SLAB_YELLOW_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_lime_wool"), SLAB_LIME_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_pink_wool"), SLAB_PINK_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_gray_wool"), SLAB_GRAY_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_light_gray_wool"), SLAB_LIGHT_GRAY_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_cyan_wool"), SLAB_CYAN_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_purple_wool"), SLAB_PURPLE_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_blue_wool"), SLAB_BLUE_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_brown_wool"), SLAB_BROWN_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_green_wool"), SLAB_GREEN_WOOL);
        Registry.register(Registries.BLOCK, getId("slab_red_wool"), SLAB_RED_WOOL);
    }

    private static void doBlockRegistery() {
        registerItem("slab_white_bright", SLAB_WHITE_BRIGHT_ITEM);
        registerItem("slab_black", SLAB_BLACK_ITEM);
        registerItem("slab_orange_bright", SLAB_ORANGE_BRIGHT_ITEM);
        registerItem("slab_magenta_bright", SLAB_MAGENTA_BRIGHT_ITEM);
        registerItem("slab_yellow_bright", SLAB_YELLOW_BRIGHT_ITEM);
        registerItem("slab_cyan_bright", SLAB_CYAN_BRIGHT_ITEM);
        registerItem("slab_blue_bright", SLAB_BLUE_BRIGHT_ITEM);
        registerItem("slab_green_bright", SLAB_GREEN_BRIGHT_ITEM);
        registerItem("slab_red_bright", SLAB_RED_BRIGHT_ITEM);
        registerItem("slab_white_wool", SLAB_WHITE_WOOL_ITEM);
        registerItem("slab_orange_wool", SLAB_ORANGE_WOOL_ITEM);
        registerItem("slab_magenta_wool", SLAB_MAGENTA_WOOL_ITEM);
        registerItem("slab_light_blue_wool", SLAB_LIGHT_BLUE_WOOL_ITEM);
        registerItem("slab_yellow_wool", SLAB_YELLOW_WOOL_ITEM);
        registerItem("slab_lime_wool", SLAB_LIME_WOOL_ITEM);
        registerItem("slab_pink_wool", SLAB_PINK_WOOL_ITEM);
        registerItem("slab_gray_wool", SLAB_GRAY_WOOL_ITEM);
        registerItem("slab_light_gray_wool", SLAB_LIGHT_GRAY_WOOL_ITEM);
        registerItem("slab_cyan_wool", SLAB_CYAN_WOOL_ITEM);
        registerItem("slab_purple_wool", SLAB_PURPLE_WOOL_ITEM);
        registerItem("slab_blue_wool", SLAB_BLUE_WOOL_ITEM);
        registerItem("slab_brown_wool", SLAB_BROWN_WOOL_ITEM);
        registerItem("slab_green_wool", SLAB_GREEN_WOOL_ITEM);
        registerItem("slab_red_wool", SLAB_RED_WOOL_ITEM);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }

    private static Identifier getId(String name) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, name);
    }
}
