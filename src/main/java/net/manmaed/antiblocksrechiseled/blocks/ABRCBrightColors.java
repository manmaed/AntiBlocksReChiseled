package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCBrightColors {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);

    //Pue
    public static final DeferredBlock<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_ORANGE = BLOCKS.register("bright_orange", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_MAGENTA = BLOCKS.register("bright_magenta", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_YELLOW = BLOCKS.register("bright_yellow", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_CYAN = BLOCKS.register("bright_cyan", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_BLUE = BLOCKS.register("bright_blue", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_GREEN = BLOCKS.register("bright_green", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_RED = BLOCKS.register("bright_red", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_BLACK = BLOCKS.register("bright_black", AntiBlock::new);

    //Border
    public static final DeferredBlock<Block> BRIGHT_WHITE_BORDER = BLOCKS.register("bright_white_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_ORANGE_BORDER = BLOCKS.register("bright_orange_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_MAGENTA_BORDER = BLOCKS.register("bright_magenta_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_YELLOW_BORDER = BLOCKS.register("bright_yellow_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_CYAN_BORDER = BLOCKS.register("bright_cyan_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_BLUE_BORDER = BLOCKS.register("bright_blue_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_GREEN_BORDER = BLOCKS.register("bright_green_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_RED_BORDER = BLOCKS.register("bright_red_border", AntiBlock::new);
    public static final DeferredBlock<Block> BRIGHT_BLACK_BORDER = BLOCKS.register("bright_black_border", AntiBlock::new);

    //BlockItems
    //Bright Pure
    public static final DeferredItem<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
    public static final DeferredItem<Item> BRIGHT_ORANGE_ITEM = ITEMS.register("bright_orange", () -> new AntiBlockItem(BRIGHT_ORANGE.get()));
    public static final DeferredItem<Item> BRIGHT_MAGENTA_ITEM = ITEMS.register("bright_magenta", () -> new AntiBlockItem(BRIGHT_MAGENTA.get()));
    public static final DeferredItem<Item> BRIGHT_YELLOW_ITEM = ITEMS.register("bright_yellow", () -> new AntiBlockItem(BRIGHT_YELLOW.get()));
    public static final DeferredItem<Item> BRIGHT_CYAN_ITEM = ITEMS.register("bright_cyan", () -> new AntiBlockItem(BRIGHT_CYAN.get()));
    public static final DeferredItem<Item> BRIGHT_BLUE_ITEM = ITEMS.register("bright_blue", () -> new AntiBlockItem(BRIGHT_BLUE.get()));
    public static final DeferredItem<Item> BRIGHT_GREEN_ITEM = ITEMS.register("bright_green", () -> new AntiBlockItem(BRIGHT_GREEN.get()));
    public static final DeferredItem<Item> BRIGHT_RED_ITEM = ITEMS.register("bright_red", () -> new AntiBlockItem(BRIGHT_RED.get()));
    public static final DeferredItem<Item> BRIGHT_BLACK_ITEM = ITEMS.register("bright_black", () -> new AntiBlockItem(BRIGHT_BLACK.get()));

    //Bright Border
    public static final DeferredItem<Item> BRIGHT_WHITE_BORDER_ITEM = ITEMS.register("bright_white_border", () -> new AntiBlockItem(BRIGHT_WHITE_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_ORANGE_BORDER_ITEM = ITEMS.register("bright_orange_border", () -> new AntiBlockItem(BRIGHT_ORANGE_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_MAGENTA_BORDER_ITEM = ITEMS.register("bright_magenta_border", () -> new AntiBlockItem(BRIGHT_MAGENTA_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_YELLOW_BORDER_ITEM = ITEMS.register("bright_yellow_border", () -> new AntiBlockItem(BRIGHT_YELLOW_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_CYAN_BORDER_ITEM = ITEMS.register("bright_cyan_border", () -> new AntiBlockItem(BRIGHT_CYAN_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_BLUE_BORDER_ITEM = ITEMS.register("bright_blue_border", () -> new AntiBlockItem(BRIGHT_BLUE_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_GREEN_BORDER_ITEM = ITEMS.register("bright_green_border", () -> new AntiBlockItem(BRIGHT_GREEN_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_RED_BORDER_ITEM = ITEMS.register("bright_red_border", () -> new AntiBlockItem(BRIGHT_RED_BORDER.get()));
    public static final DeferredItem<Item> BRIGHT_BLACK_BORDER_ITEM = ITEMS.register("bright_black_border", () -> new AntiBlockItem(BRIGHT_BLACK_BORDER.get()));
}
