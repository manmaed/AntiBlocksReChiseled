package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCBrightColors {

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

    //Pue
    public static final DeferredBlock<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", () -> new AntiBlock("bright_white"));
    public static final DeferredBlock<Block> BRIGHT_ORANGE = BLOCKS.register("bright_orange", () -> new AntiBlock("bright_orange"));
    public static final DeferredBlock<Block> BRIGHT_MAGENTA = BLOCKS.register("bright_magenta", () -> new AntiBlock("bright_magenta"));
    public static final DeferredBlock<Block> BRIGHT_YELLOW = BLOCKS.register("bright_yellow", () -> new AntiBlock("bright_yellow"));
    public static final DeferredBlock<Block> BRIGHT_CYAN = BLOCKS.register("bright_cyan", () -> new AntiBlock("bright_cyan"));
    public static final DeferredBlock<Block> BRIGHT_BLUE = BLOCKS.register("bright_blue", () -> new AntiBlock("bright_blue"));
    public static final DeferredBlock<Block> BRIGHT_GREEN = BLOCKS.register("bright_green", () -> new AntiBlock("bright_green"));
    public static final DeferredBlock<Block> BRIGHT_RED = BLOCKS.register("bright_red", () -> new AntiBlock("bright_red"));
    public static final DeferredBlock<Block> BRIGHT_BLACK = BLOCKS.register("bright_black", () -> new AntiBlock("bright_black"));

    //Border
    public static final DeferredBlock<Block> BRIGHT_WHITE_BORDER = BLOCKS.register("bright_white_border", () -> new AntiBlock("bright_white_border"));
    public static final DeferredBlock<Block> BRIGHT_ORANGE_BORDER = BLOCKS.register("bright_orange_border", () -> new AntiBlock("bright_orange_border"));
    public static final DeferredBlock<Block> BRIGHT_MAGENTA_BORDER = BLOCKS.register("bright_magenta_border", () -> new AntiBlock("bright_magenta_border"));
    public static final DeferredBlock<Block> BRIGHT_YELLOW_BORDER = BLOCKS.register("bright_yellow_border", () -> new AntiBlock("bright_yellow_border"));
    public static final DeferredBlock<Block> BRIGHT_CYAN_BORDER = BLOCKS.register("bright_cyan_border", () -> new AntiBlock("bright_cyan_border"));
    public static final DeferredBlock<Block> BRIGHT_BLUE_BORDER = BLOCKS.register("bright_blue_border", () -> new AntiBlock("bright_blue_border"));
    public static final DeferredBlock<Block> BRIGHT_GREEN_BORDER = BLOCKS.register("bright_green_border", () -> new AntiBlock("bright_green_border"));
    public static final DeferredBlock<Block> BRIGHT_RED_BORDER = BLOCKS.register("bright_red_border", () -> new AntiBlock("bright_red_border"));
    public static final DeferredBlock<Block> BRIGHT_BLACK_BORDER = BLOCKS.register("bright_black_border", () -> new AntiBlock("bright_black_border"));

    //BlockItems
    //Bright Pure
    public static final DeferredItem<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get(), "bright_white"));
    public static final DeferredItem<Item> BRIGHT_ORANGE_ITEM = ITEMS.register("bright_orange", () -> new AntiBlockItem(BRIGHT_ORANGE.get(), "bright_orange"));
    public static final DeferredItem<Item> BRIGHT_MAGENTA_ITEM = ITEMS.register("bright_magenta", () -> new AntiBlockItem(BRIGHT_MAGENTA.get(), "bright_magenta"));
    public static final DeferredItem<Item> BRIGHT_YELLOW_ITEM = ITEMS.register("bright_yellow", () -> new AntiBlockItem(BRIGHT_YELLOW.get(), "bright_yellow"));
    public static final DeferredItem<Item> BRIGHT_CYAN_ITEM = ITEMS.register("bright_cyan", () -> new AntiBlockItem(BRIGHT_CYAN.get(), "bright_cyan"));
    public static final DeferredItem<Item> BRIGHT_BLUE_ITEM = ITEMS.register("bright_blue", () -> new AntiBlockItem(BRIGHT_BLUE.get(), "bright_blue"));
    public static final DeferredItem<Item> BRIGHT_GREEN_ITEM = ITEMS.register("bright_green", () -> new AntiBlockItem(BRIGHT_GREEN.get(), "bright_green"));
    public static final DeferredItem<Item> BRIGHT_RED_ITEM = ITEMS.register("bright_red", () -> new AntiBlockItem(BRIGHT_RED.get(), "bright_red"));
    public static final DeferredItem<Item> BRIGHT_BLACK_ITEM = ITEMS.register("bright_black", () -> new AntiBlockItem(BRIGHT_BLACK.get(), "bright_black"));

    // Bright Border
    public static final DeferredItem<Item> BRIGHT_WHITE_BORDER_ITEM = ITEMS.register("bright_white_border", () -> new AntiBlockItem(BRIGHT_WHITE_BORDER.get(), "bright_white_border"));
    public static final DeferredItem<Item> BRIGHT_ORANGE_BORDER_ITEM = ITEMS.register("bright_orange_border", () -> new AntiBlockItem(BRIGHT_ORANGE_BORDER.get(), "bright_orange_border"));
    public static final DeferredItem<Item> BRIGHT_MAGENTA_BORDER_ITEM = ITEMS.register("bright_magenta_border", () -> new AntiBlockItem(BRIGHT_MAGENTA_BORDER.get(), "bright_magenta_border"));
    public static final DeferredItem<Item> BRIGHT_YELLOW_BORDER_ITEM = ITEMS.register("bright_yellow_border", () -> new AntiBlockItem(BRIGHT_YELLOW_BORDER.get(), "bright_yellow_border"));
    public static final DeferredItem<Item> BRIGHT_CYAN_BORDER_ITEM = ITEMS.register("bright_cyan_border", () -> new AntiBlockItem(BRIGHT_CYAN_BORDER.get(), "bright_cyan_border"));
    public static final DeferredItem<Item> BRIGHT_BLUE_BORDER_ITEM = ITEMS.register("bright_blue_border", () -> new AntiBlockItem(BRIGHT_BLUE_BORDER.get(), "bright_blue_border"));
    public static final DeferredItem<Item> BRIGHT_GREEN_BORDER_ITEM = ITEMS.register("bright_green_border", () -> new AntiBlockItem(BRIGHT_GREEN_BORDER.get(), "bright_green_border"));
    public static final DeferredItem<Item> BRIGHT_RED_BORDER_ITEM = ITEMS.register("bright_red_border", () -> new AntiBlockItem(BRIGHT_RED_BORDER.get(), "bright_red_border"));
    public static final DeferredItem<Item> BRIGHT_BLACK_BORDER_ITEM = ITEMS.register("bright_black_border", () -> new AntiBlockItem(BRIGHT_BLACK_BORDER.get(), "bright_black_border"));

}
