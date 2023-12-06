package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiSlabBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCSlabs {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    /*
    * Block:     public static final DeferredBlock<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
    * BlockItem: public static final DeferredItem<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
     */

    public static final DeferredBlock<Block> SLAB_WHITE_BRIGHT = BLOCKS.register("slab_white_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_BLACK = BLOCKS.register("slab_black", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_ORANGE_BRIGHT = BLOCKS.register("slab_orange_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_MAGENTA_BRIGHT = BLOCKS.register("slab_magenta_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_YELLOW_BRIGHT = BLOCKS.register("slab_yellow_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_CYAN_BRIGHT = BLOCKS.register("slab_cyan_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_BLUE_BRIGHT = BLOCKS.register("slab_blue_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_GREEN_BRIGHT = BLOCKS.register("slab_green_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_RED_BRIGHT = BLOCKS.register("slab_red_bright", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_WHITE_WOOL = BLOCKS.register("slab_white_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_ORANGE_WOOL = BLOCKS.register("slab_orange_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_MAGENTA_WOOL = BLOCKS.register("slab_magenta_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_LIGHT_BLUE_WOOL = BLOCKS.register("slab_light_blue_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_YELLOW_WOOL = BLOCKS.register("slab_yellow_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_LIME_WOOL = BLOCKS.register("slab_lime_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_PINK_WOOL = BLOCKS.register("slab_pink_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_GRAY_WOOL = BLOCKS.register("slab_gray_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_LIGHT_GRAY_WOOL = BLOCKS.register("slab_light_gray_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_CYAN_WOOL = BLOCKS.register("slab_cyan_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_PURPLE_WOOL = BLOCKS.register("slab_purple_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_BLUE_WOOL = BLOCKS.register("slab_blue_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_BROWN_WOOL = BLOCKS.register("slab_brown_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_GREEN_WOOL = BLOCKS.register("slab_green_wool", AntiSlabBlock::new);
    public static final DeferredBlock<Block> SLAB_RED_WOOL = BLOCKS.register("slab_red_wool", AntiSlabBlock::new);
    public static final DeferredItem<Item> SLAB_WHITE_BRIGHT_ITEM = ITEMS.register("slab_white_bright", () -> new AntiBlockItem(SLAB_WHITE_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_BLACK_ITEM = ITEMS.register("slab_black", () -> new AntiBlockItem(SLAB_BLACK.get()));
    public static final DeferredItem<Item> SLAB_ORANGE_BRIGHT_ITEM = ITEMS.register("slab_orange_bright", () -> new AntiBlockItem(SLAB_ORANGE_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_MAGENTA_BRIGHT_ITEM = ITEMS.register("slab_magenta_bright", () -> new AntiBlockItem(SLAB_MAGENTA_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_YELLOW_BRIGHT_ITEM = ITEMS.register("slab_yellow_bright", () -> new AntiBlockItem(SLAB_YELLOW_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_CYAN_BRIGHT_ITEM = ITEMS.register("slab_cyan_bright", () -> new AntiBlockItem(SLAB_CYAN_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_BLUE_BRIGHT_ITEM = ITEMS.register("slab_blue_bright", () -> new AntiBlockItem(SLAB_BLUE_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_GREEN_BRIGHT_ITEM = ITEMS.register("slab_green_bright", () -> new AntiBlockItem(SLAB_GREEN_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_RED_BRIGHT_ITEM = ITEMS.register("slab_red_bright", () -> new AntiBlockItem(SLAB_RED_BRIGHT.get()));
    public static final DeferredItem<Item> SLAB_WHITE_WOOL_ITEM = ITEMS.register("slab_white_wool", () -> new AntiBlockItem(SLAB_WHITE_WOOL.get()));
    public static final DeferredItem<Item> SLAB_ORANGE_WOOL_ITEM = ITEMS.register("slab_orange_wool", () -> new AntiBlockItem(SLAB_ORANGE_WOOL.get()));
    public static final DeferredItem<Item> SLAB_MAGENTA_WOOL_ITEM = ITEMS.register("slab_magenta_wool", () -> new AntiBlockItem(SLAB_MAGENTA_WOOL.get()));
    public static final DeferredItem<Item> SLAB_LIGHT_BLUE_WOOL_ITEM = ITEMS.register("slab_light_blue_wool", () -> new AntiBlockItem(SLAB_LIGHT_BLUE_WOOL.get()));
    public static final DeferredItem<Item> SLAB_YELLOW_WOOL_ITEM = ITEMS.register("slab_yellow_wool", () -> new AntiBlockItem(SLAB_YELLOW_WOOL.get()));
    public static final DeferredItem<Item> SLAB_LIME_WOOL_ITEM = ITEMS.register("slab_lime_wool", () -> new AntiBlockItem(SLAB_LIME_WOOL.get()));
    public static final DeferredItem<Item> SLAB_PINK_WOOL_ITEM = ITEMS.register("slab_pink_wool", () -> new AntiBlockItem(SLAB_PINK_WOOL.get()));
    public static final DeferredItem<Item> SLAB_GRAY_WOOL_ITEM = ITEMS.register("slab_gray_wool", () -> new AntiBlockItem(SLAB_GRAY_WOOL.get()));
    public static final DeferredItem<Item> SLAB_LIGHT_GRAY_WOOL_ITEM = ITEMS.register("slab_light_gray_wool", () -> new AntiBlockItem(SLAB_LIGHT_GRAY_WOOL.get()));
    public static final DeferredItem<Item> SLAB_CYAN_WOOL_ITEM = ITEMS.register("slab_cyan_wool", () -> new AntiBlockItem(SLAB_CYAN_WOOL.get()));
    public static final DeferredItem<Item> SLAB_PURPLE_WOOL_ITEM = ITEMS.register("slab_purple_wool", () -> new AntiBlockItem(SLAB_PURPLE_WOOL.get()));
    public static final DeferredItem<Item> SLAB_BLUE_WOOL_ITEM = ITEMS.register("slab_blue_wool", () -> new AntiBlockItem(SLAB_BLUE_WOOL.get()));
    public static final DeferredItem<Item> SLAB_BROWN_WOOL_ITEM = ITEMS.register("slab_brown_wool", () -> new AntiBlockItem(SLAB_BROWN_WOOL.get()));
    public static final DeferredItem<Item> SLAB_GREEN_WOOL_ITEM = ITEMS.register("slab_green_wool", () -> new AntiBlockItem(SLAB_GREEN_WOOL.get()));
    public static final DeferredItem<Item> SLAB_RED_WOOL_ITEM = ITEMS.register("slab_red_wool", () -> new AntiBlockItem(SLAB_RED_WOOL.get()));
}
