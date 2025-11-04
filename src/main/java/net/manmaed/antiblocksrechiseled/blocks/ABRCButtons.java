package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiButton;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCButtons {

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
    public static final DeferredBlock<Block> BUTTON_BRIGHT_WHITE = BLOCKS.register("button_bright_white", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_ORANGE = BLOCKS.register("button_bright_orange", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_MAGENTA = BLOCKS.register("button_bright_magenta", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_YELLOW = BLOCKS.register("button_bright_yellow", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_CYAN = BLOCKS.register("button_bright_cyan", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_BLUE = BLOCKS.register("button_bright_blue", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_GREEN = BLOCKS.register("button_bright_green", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_RED = BLOCKS.register("button_bright_red", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_BLACK = BLOCKS.register("button_bright_black", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_WHITE = BLOCKS.register("button_wool_white", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_ORANGE = BLOCKS.register("button_wool_orange", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_MAGENTA = BLOCKS.register("button_wool_magenta", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_LIGHT_BLUE = BLOCKS.register("button_wool_light_blue", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_YELLOW = BLOCKS.register("button_wool_yellow", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_LIME = BLOCKS.register("button_wool_lime", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_PINK = BLOCKS.register("button_wool_pink", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_GRAY = BLOCKS.register("button_wool_gray", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_LIGHT_GRAY = BLOCKS.register("button_wool_light_gray", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_CYAN = BLOCKS.register("button_wool_cyan", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_PURPLE = BLOCKS.register("button_wool_purple", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_BLUE = BLOCKS.register("button_wool_blue", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_BROWN = BLOCKS.register("button_wool_brown", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_GREEN = BLOCKS.register("button_wool_green", AntiButton::new);
    public static final DeferredBlock<Block> BUTTON_WOOL_RED = BLOCKS.register("button_wool_red", AntiButton::new);

    public static final DeferredItem<Item> BUTTON_BRIGHT_WHITE_ITEM = ITEMS.register("button_bright_white", () -> new AntiBlockItem(BUTTON_BRIGHT_WHITE.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_ORANGE_ITEM = ITEMS.register("button_bright_orange", () -> new AntiBlockItem(BUTTON_BRIGHT_ORANGE.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_MAGENTA_ITEM = ITEMS.register("button_bright_magenta", () -> new AntiBlockItem(BUTTON_BRIGHT_MAGENTA.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_YELLOW_ITEM = ITEMS.register("button_bright_yellow", () -> new AntiBlockItem(BUTTON_BRIGHT_YELLOW.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_CYAN_ITEM = ITEMS.register("button_bright_cyan", () -> new AntiBlockItem(BUTTON_BRIGHT_CYAN.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_BLUE_ITEM = ITEMS.register("button_bright_blue", () -> new AntiBlockItem(BUTTON_BRIGHT_BLUE.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_GREEN_ITEM = ITEMS.register("button_bright_green", () -> new AntiBlockItem(BUTTON_BRIGHT_GREEN.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_RED_ITEM = ITEMS.register("button_bright_red", () -> new AntiBlockItem(BUTTON_BRIGHT_RED.get()));
    public static final DeferredItem<Item> BUTTON_BRIGHT_BLACK_ITEM = ITEMS.register("button_bright_black", () -> new AntiBlockItem(BUTTON_BRIGHT_BLACK.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_WHITE_ITEM = ITEMS.register("button_wool_white", () -> new AntiBlockItem(BUTTON_WOOL_WHITE.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_ORANGE_ITEM = ITEMS.register("button_wool_orange", () -> new AntiBlockItem(BUTTON_WOOL_ORANGE.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_MAGENTA_ITEM = ITEMS.register("button_wool_magenta", () -> new AntiBlockItem(BUTTON_WOOL_MAGENTA.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("button_wool_light_blue", () -> new AntiBlockItem(BUTTON_WOOL_LIGHT_BLUE.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_YELLOW_ITEM = ITEMS.register("button_wool_yellow", () -> new AntiBlockItem(BUTTON_WOOL_YELLOW.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_LIME_ITEM = ITEMS.register("button_wool_lime", () -> new AntiBlockItem(BUTTON_WOOL_LIME.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_PINK_ITEM = ITEMS.register("button_wool_pink", () -> new AntiBlockItem(BUTTON_WOOL_PINK.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_GRAY_ITEM = ITEMS.register("button_wool_gray", () -> new AntiBlockItem(BUTTON_WOOL_GRAY.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("button_wool_light_gray", () -> new AntiBlockItem(BUTTON_WOOL_LIGHT_GRAY.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_CYAN_ITEM = ITEMS.register("button_wool_cyan", () -> new AntiBlockItem(BUTTON_WOOL_CYAN.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_PURPLE_ITEM = ITEMS.register("button_wool_purple", () -> new AntiBlockItem(BUTTON_WOOL_PURPLE.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_BLUE_ITEM = ITEMS.register("button_wool_blue", () -> new AntiBlockItem(BUTTON_WOOL_BLUE.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_BROWN_ITEM = ITEMS.register("button_wool_brown", () -> new AntiBlockItem(BUTTON_WOOL_BROWN.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_GREEN_ITEM = ITEMS.register("button_wool_green", () -> new AntiBlockItem(BUTTON_WOOL_GREEN.get()));
    public static final DeferredItem<Item> BUTTON_WOOL_RED_ITEM = ITEMS.register("button_wool_red", () -> new AntiBlockItem(BUTTON_WOOL_RED.get()));
}
