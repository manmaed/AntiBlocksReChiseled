package net.manmaed.antiblocksrechiseled.blocks;


import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiSlabBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.manmaed.antiblocksrechiseled.utils.ABRCUtils;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ABRCSlabs {

    public static final Block SLAB_BRIGHT_WHITE = new AntiSlabBlock("slab_bright_white");
    public static final Block SLAB_BRIGHT_BLACK = new AntiSlabBlock("slab_bright_black");
    public static final Block SLAB_BRIGHT_ORANGE = new AntiSlabBlock("slab_bright_orange");
    public static final Block SLAB_BRIGHT_MAGENTA = new AntiSlabBlock("slab_bright_magenta");
    public static final Block SLAB_BRIGHT_YELLOW = new AntiSlabBlock("slab_bright_yellow");
    public static final Block SLAB_BRIGHT_CYAN = new AntiSlabBlock("slab_bright_cyan");
    public static final Block SLAB_BRIGHT_BLUE = new AntiSlabBlock("slab_bright_blue");
    public static final Block SLAB_BRIGHT_GREEN = new AntiSlabBlock("slab_bright_green");
    public static final Block SLAB_BRIGHT_RED = new AntiSlabBlock("slab_bright_red");
    public static final Block SLAB_WOOL_WHITE = new AntiSlabBlock("slab_wool_white");
    public static final Block SLAB_WOOL_ORANGE = new AntiSlabBlock("slab_wool_orange");
    public static final Block SLAB_WOOL_MAGENTA = new AntiSlabBlock("slab_wool_magenta");
    public static final Block SLAB_WOOL_LIGHT_BLUE = new AntiSlabBlock("slab_wool_light_blue");
    public static final Block SLAB_WOOL_YELLOW = new AntiSlabBlock("slab_wool_yellow");
    public static final Block SLAB_WOOL_LIME = new AntiSlabBlock("slab_wool_lime");
    public static final Block SLAB_WOOL_PINK = new AntiSlabBlock("slab_wool_pink");
    public static final Block SLAB_WOOL_GRAY = new AntiSlabBlock("slab_wool_gray");
    public static final Block SLAB_WOOL_LIGHT_GRAY = new AntiSlabBlock("slab_wool_light_gray");
    public static final Block SLAB_WOOL_CYAN = new AntiSlabBlock("slab_wool_cyan");
    public static final Block SLAB_WOOL_PURPLE = new AntiSlabBlock("slab_wool_purple");
    public static final Block SLAB_WOOL_BLUE = new AntiSlabBlock("slab_wool_blue");
    public static final Block SLAB_WOOL_BROWN = new AntiSlabBlock("slab_wool_brown");
    public static final Block SLAB_WOOL_GREEN = new AntiSlabBlock("slab_wool_green");
    public static final Block SLAB_WOOL_RED = new AntiSlabBlock("slab_wool_red");

    //Items
    public static final Item SLAB_BRIGHT_WHITE_ITEM = new AntiBlockItem(SLAB_BRIGHT_WHITE, "slab_bright_white");
    public static final Item SLAB_BRIGHT_BLACK_ITEM = new AntiBlockItem(SLAB_BRIGHT_BLACK, "slab_bright_black");
    public static final Item SLAB_BRIGHT_ORANGE_ITEM = new AntiBlockItem(SLAB_BRIGHT_ORANGE, "slab_bright_orange");
    public static final Item SLAB_BRIGHT_MAGENTA_ITEM = new AntiBlockItem(SLAB_BRIGHT_MAGENTA, "slab_bright_magenta");
    public static final Item SLAB_BRIGHT_YELLOW_ITEM = new AntiBlockItem(SLAB_BRIGHT_YELLOW, "slab_bright_yellow");
    public static final Item SLAB_BRIGHT_CYAN_ITEM = new AntiBlockItem(SLAB_BRIGHT_CYAN, "slab_bright_cyan");
    public static final Item SLAB_BRIGHT_BLUE_ITEM = new AntiBlockItem(SLAB_BRIGHT_BLUE, "slab_bright_blue");
    public static final Item SLAB_BRIGHT_GREEN_ITEM = new AntiBlockItem(SLAB_BRIGHT_GREEN, "slab_bright_green");
    public static final Item SLAB_BRIGHT_RED_ITEM = new AntiBlockItem(SLAB_BRIGHT_RED, "slab_bright_red");
    public static final Item SLAB_WOOL_WHITE_ITEM = new AntiBlockItem(SLAB_WOOL_WHITE, "slab_wool_white");
    public static final Item SLAB_WOOL_ORANGE_ITEM = new AntiBlockItem(SLAB_WOOL_ORANGE, "slab_wool_orange");
    public static final Item SLAB_WOOL_MAGENTA_ITEM = new AntiBlockItem(SLAB_WOOL_MAGENTA, "slab_wool_magenta");
    public static final Item SLAB_WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(SLAB_WOOL_LIGHT_BLUE, "slab_wool_light_blue");
    public static final Item SLAB_WOOL_YELLOW_ITEM = new AntiBlockItem(SLAB_WOOL_YELLOW, "slab_wool_yellow");
    public static final Item SLAB_WOOL_LIME_ITEM = new AntiBlockItem(SLAB_WOOL_LIME, "slab_wool_lime");
    public static final Item SLAB_WOOL_PINK_ITEM = new AntiBlockItem(SLAB_WOOL_PINK, "slab_wool_pink");
    public static final Item SLAB_WOOL_GRAY_ITEM = new AntiBlockItem(SLAB_WOOL_GRAY, "slab_wool_gray");
    public static final Item SLAB_WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(SLAB_WOOL_LIGHT_GRAY, "slab_wool_light_gray");
    public static final Item SLAB_WOOL_CYAN_ITEM = new AntiBlockItem(SLAB_WOOL_CYAN, "slab_wool_cyan");
    public static final Item SLAB_WOOL_PURPLE_ITEM = new AntiBlockItem(SLAB_WOOL_PURPLE, "slab_wool_purple");
    public static final Item SLAB_WOOL_BLUE_ITEM = new AntiBlockItem(SLAB_WOOL_BLUE, "slab_wool_blue");
    public static final Item SLAB_WOOL_BROWN_ITEM = new AntiBlockItem(SLAB_WOOL_BROWN, "slab_wool_brown");
    public static final Item SLAB_WOOL_GREEN_ITEM = new AntiBlockItem(SLAB_WOOL_GREEN, "slab_wool_green");
    public static final Item SLAB_WOOL_RED_ITEM = new AntiBlockItem(SLAB_WOOL_RED, "slab_wool_red");

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }

    private static void doBlockItemRegistery() {
        registerBlock("slab_bright_white", SLAB_BRIGHT_WHITE);
        registerBlock("slab_bright_black", SLAB_BRIGHT_BLACK);
        registerBlock("slab_bright_orange", SLAB_BRIGHT_ORANGE);
        registerBlock("slab_bright_magenta", SLAB_BRIGHT_MAGENTA);
        registerBlock("slab_bright_yellow", SLAB_BRIGHT_YELLOW);
        registerBlock("slab_bright_cyan", SLAB_BRIGHT_CYAN);
        registerBlock("slab_bright_blue", SLAB_BRIGHT_BLUE);
        registerBlock("slab_bright_green", SLAB_BRIGHT_GREEN);
        registerBlock("slab_bright_red", SLAB_BRIGHT_RED);
        registerBlock("slab_wool_white", SLAB_WOOL_WHITE);
        registerBlock("slab_wool_orange", SLAB_WOOL_ORANGE);
        registerBlock("slab_wool_magenta", SLAB_WOOL_MAGENTA);
        registerBlock("slab_wool_light_blue", SLAB_WOOL_LIGHT_BLUE);
        registerBlock("slab_wool_yellow", SLAB_WOOL_YELLOW);
        registerBlock("slab_wool_lime", SLAB_WOOL_LIME);
        registerBlock("slab_wool_pink", SLAB_WOOL_PINK);
        registerBlock("slab_wool_gray", SLAB_WOOL_GRAY);
        registerBlock("slab_wool_light_gray", SLAB_WOOL_LIGHT_GRAY);
        registerBlock("slab_wool_cyan", SLAB_WOOL_CYAN);
        registerBlock("slab_wool_purple", SLAB_WOOL_PURPLE);
        registerBlock("slab_wool_blue", SLAB_WOOL_BLUE);
        registerBlock("slab_wool_brown", SLAB_WOOL_BROWN);
        registerBlock("slab_wool_green", SLAB_WOOL_GREEN);
        registerBlock("slab_wool_red", SLAB_WOOL_RED);
    }

    private static void doBlockRegistery() {
        registerItem("slab_bright_white", SLAB_BRIGHT_WHITE_ITEM);
        registerItem("slab_bright_black", SLAB_BRIGHT_BLACK_ITEM);
        registerItem("slab_bright_orange", SLAB_BRIGHT_ORANGE_ITEM);
        registerItem("slab_bright_magenta", SLAB_BRIGHT_MAGENTA_ITEM);
        registerItem("slab_bright_yellow", SLAB_BRIGHT_YELLOW_ITEM);
        registerItem("slab_bright_cyan", SLAB_BRIGHT_CYAN_ITEM);
        registerItem("slab_bright_blue", SLAB_BRIGHT_BLUE_ITEM);
        registerItem("slab_bright_green", SLAB_BRIGHT_GREEN_ITEM);
        registerItem("slab_bright_red", SLAB_BRIGHT_RED_ITEM);
        registerItem("slab_wool_white", SLAB_WOOL_WHITE_ITEM);
        registerItem("slab_wool_orange", SLAB_WOOL_ORANGE_ITEM);
        registerItem("slab_wool_magenta", SLAB_WOOL_MAGENTA_ITEM);
        registerItem("slab_wool_light_blue", SLAB_WOOL_LIGHT_BLUE_ITEM);
        registerItem("slab_wool_yellow", SLAB_WOOL_YELLOW_ITEM);
        registerItem("slab_wool_lime", SLAB_WOOL_LIME_ITEM);
        registerItem("slab_wool_pink", SLAB_WOOL_PINK_ITEM);
        registerItem("slab_wool_gray", SLAB_WOOL_GRAY_ITEM);
        registerItem("slab_wool_light_gray", SLAB_WOOL_LIGHT_GRAY_ITEM);
        registerItem("slab_wool_cyan", SLAB_WOOL_CYAN_ITEM);
        registerItem("slab_wool_purple", SLAB_WOOL_PURPLE_ITEM);
        registerItem("slab_wool_blue", SLAB_WOOL_BLUE_ITEM);
        registerItem("slab_wool_brown", SLAB_WOOL_BROWN_ITEM);
        registerItem("slab_wool_green", SLAB_WOOL_GREEN_ITEM);
        registerItem("slab_wool_red", SLAB_WOOL_RED_ITEM);
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
