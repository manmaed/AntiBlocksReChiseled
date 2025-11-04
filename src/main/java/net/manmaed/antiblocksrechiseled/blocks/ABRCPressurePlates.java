package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiPressurePlate;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCPressurePlates {

    public static void init(IEventBus e) {
        BLOCKS.register(e);
        ITEMS.register(e);
    }

    public static DeferredRegister<Block> getBlocks() {
        return BLOCKS;
    }

    public static DeferredRegister<Item> getItems() {
        return ITEMS;
    }

    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_WHITE = BLOCKS.register("pressure_plate_bright_white", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_ORANGE = BLOCKS.register("pressure_plate_bright_orange", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_MAGENTA = BLOCKS.register("pressure_plate_bright_magenta", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_YELLOW = BLOCKS.register("pressure_plate_bright_yellow", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_CYAN = BLOCKS.register("pressure_plate_bright_cyan", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_BLUE = BLOCKS.register("pressure_plate_bright_blue", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_GREEN = BLOCKS.register("pressure_plate_bright_green", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_RED = BLOCKS.register("pressure_plate_bright_red", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_BLACK = BLOCKS.register("pressure_plate_bright_black", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_WHITE = BLOCKS.register("pressure_plate_wool_white", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_ORANGE = BLOCKS.register("pressure_plate_wool_orange", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_MAGENTA = BLOCKS.register("pressure_plate_wool_magenta", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIGHT_BLUE = BLOCKS.register("pressure_plate_wool_light_blue", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_YELLOW = BLOCKS.register("pressure_plate_wool_yellow", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIME = BLOCKS.register("pressure_plate_wool_lime", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_PINK = BLOCKS.register("pressure_plate_wool_pink", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_GRAY = BLOCKS.register("pressure_plate_wool_gray", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIGHT_GRAY = BLOCKS.register("pressure_plate_wool_light_gray", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_CYAN = BLOCKS.register("pressure_plate_wool_cyan", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_PURPLE = BLOCKS.register("pressure_plate_wool_purple", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_BLUE = BLOCKS.register("pressure_plate_wool_blue", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_BROWN = BLOCKS.register("pressure_plate_wool_brown", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_GREEN = BLOCKS.register("pressure_plate_wool_green", AntiPressurePlate::new);
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_RED = BLOCKS.register("pressure_plate_wool_red", AntiPressurePlate::new);

    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_WHITE_ITEM = ITEMS.register("pressure_plate_bright_white", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_WHITE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_ORANGE_ITEM = ITEMS.register("pressure_plate_bright_orange", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_ORANGE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM = ITEMS.register("pressure_plate_bright_magenta", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_MAGENTA.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_YELLOW_ITEM = ITEMS.register("pressure_plate_bright_yellow", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_YELLOW.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_CYAN_ITEM = ITEMS.register("pressure_plate_bright_cyan", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_CYAN.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_BLUE_ITEM = ITEMS.register("pressure_plate_bright_blue", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLUE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_GREEN_ITEM = ITEMS.register("pressure_plate_bright_green", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_GREEN.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_RED_ITEM = ITEMS.register("pressure_plate_bright_red", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_RED.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_BLACK_ITEM = ITEMS.register("pressure_plate_bright_black", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLACK.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_WHITE_ITEM = ITEMS.register("pressure_plate_wool_white", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_WHITE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_ORANGE_ITEM = ITEMS.register("pressure_plate_wool_orange", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_ORANGE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_MAGENTA_ITEM = ITEMS.register("pressure_plate_wool_magenta", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_MAGENTA.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("pressure_plate_wool_light_blue", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_BLUE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_YELLOW_ITEM = ITEMS.register("pressure_plate_wool_yellow", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_YELLOW.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIME_ITEM = ITEMS.register("pressure_plate_wool_lime", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIME.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_PINK_ITEM = ITEMS.register("pressure_plate_wool_pink", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_PINK.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_GRAY_ITEM = ITEMS.register("pressure_plate_wool_gray", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_GRAY.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("pressure_plate_wool_light_gray", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_GRAY.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_CYAN_ITEM = ITEMS.register("pressure_plate_wool_cyan", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_CYAN.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_PURPLE_ITEM = ITEMS.register("pressure_plate_wool_purple", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_PURPLE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_BLUE_ITEM = ITEMS.register("pressure_plate_wool_blue", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_BLUE.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_BROWN_ITEM = ITEMS.register("pressure_plate_wool_brown", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_BROWN.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_GREEN_ITEM = ITEMS.register("pressure_plate_wool_green", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_GREEN.get()));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_RED_ITEM = ITEMS.register("pressure_plate_wool_red", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_RED.get()));
}
