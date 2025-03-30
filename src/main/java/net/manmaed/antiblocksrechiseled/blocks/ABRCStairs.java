package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiStairBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCStairs {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    /*
     * Block:     public static final DeferredBlock<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
     * BlockItem: public static final DeferredItem<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
     */

    //Blocks

    //--Bright
    public static final DeferredBlock<Block> STAIR_BRIGHT_WHITE = BLOCKS.register("stair_bright_white", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_WHITE.get().defaultBlockState(), "stair_bright_white"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_BLACK = BLOCKS.register("stair_bright_black", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_BLACK.get().defaultBlockState(), "stair_bright_black"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_ORANGE = BLOCKS.register("stair_bright_orange", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_ORANGE.get().defaultBlockState(), "stair_bright_orange"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_MAGENTA = BLOCKS.register("stair_bright_magenta", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_MAGENTA.get().defaultBlockState(), "stair_bright_magenta"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_YELLOW = BLOCKS.register("stair_bright_yellow", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_YELLOW.get().defaultBlockState(), "stair_bright_yellow"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_CYAN = BLOCKS.register("stair_bright_cyan", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_CYAN.get().defaultBlockState(), "stair_bright_cyan"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_BLUE = BLOCKS.register("stair_bright_blue", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_BLUE.get().defaultBlockState(), "stair_bright_blue"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_GREEN = BLOCKS.register("stair_bright_green", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_GREEN.get().defaultBlockState(), "stair_bright_green"));
    public static final DeferredBlock<Block> STAIR_BRIGHT_RED = BLOCKS.register("stair_bright_red", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_RED.get().defaultBlockState(), "stair_bright_red"));

    //--Wool
    public static final DeferredBlock<Block> STAIR_WOOL_WHITE = BLOCKS.register("stair_wool_white", () -> new AntiStairBlock(ABRCWoolColors.WOOL_WHITE.get().defaultBlockState(), "stair_wool_white"));
    public static final DeferredBlock<Block> STAIR_WOOL_ORANGE = BLOCKS.register("stair_wool_orange", () -> new AntiStairBlock(ABRCWoolColors.WOOL_ORANGE.get().defaultBlockState(), "stair_wool_orange"));
    public static final DeferredBlock<Block> STAIR_WOOL_MAGENTA = BLOCKS.register("stair_wool_magenta", () -> new AntiStairBlock(ABRCWoolColors.WOOL_MAGENTA.get().defaultBlockState(), "stair_wool_magenta"));
    public static final DeferredBlock<Block> STAIR_WOOL_LIGHT_BLUE = BLOCKS.register("stair_wool_light_blue", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_BLUE.get().defaultBlockState(), "stair_wool_light_blue"));
    public static final DeferredBlock<Block> STAIR_WOOL_YELLOW = BLOCKS.register("stair_wool_yellow", () -> new AntiStairBlock(ABRCWoolColors.WOOL_YELLOW.get().defaultBlockState(), "stair_wool_yellow"));
    public static final DeferredBlock<Block> STAIR_WOOL_LIME = BLOCKS.register("stair_wool_lime", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIME.get().defaultBlockState(), "stair_wool_lime"));
    public static final DeferredBlock<Block> STAIR_WOOL_PINK = BLOCKS.register("stair_wool_pink", () -> new AntiStairBlock(ABRCWoolColors.WOOL_PINK.get().defaultBlockState(), "stair_wool_pink"));
    public static final DeferredBlock<Block> STAIR_WOOL_GRAY = BLOCKS.register("stair_wool_gray", () -> new AntiStairBlock(ABRCWoolColors.WOOL_GRAY.get().defaultBlockState(), "stair_wool_gray"));
    public static final DeferredBlock<Block> STAIR_WOOL_LIGHT_GRAY = BLOCKS.register("stair_wool_light_gray", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_GRAY.get().defaultBlockState(), "stair_wool_light_gray"));
    public static final DeferredBlock<Block> STAIR_WOOL_CYAN = BLOCKS.register("stair_wool_cyan", () -> new AntiStairBlock(ABRCWoolColors.WOOL_CYAN.get().defaultBlockState(), "stair_wool_cyan"));
    public static final DeferredBlock<Block> STAIR_WOOL_PURPLE = BLOCKS.register("stair_wool_purple", () -> new AntiStairBlock(ABRCWoolColors.WOOL_PURPLE.get().defaultBlockState(), "stair_wool_purple"));
    public static final DeferredBlock<Block> STAIR_WOOL_BLUE = BLOCKS.register("stair_wool_blue", () -> new AntiStairBlock(ABRCWoolColors.WOOL_BLUE.get().defaultBlockState(), "stair_wool_blue"));
    public static final DeferredBlock<Block> STAIR_WOOL_BROWN = BLOCKS.register("stair_wool_brown", () -> new AntiStairBlock(ABRCWoolColors.WOOL_BROWN.get().defaultBlockState(), "stair_wool_brown"));
    public static final DeferredBlock<Block> STAIR_WOOL_GREEN = BLOCKS.register("stair_wool_green", () -> new AntiStairBlock(ABRCWoolColors.WOOL_GREEN.get().defaultBlockState(), "stair_wool_green"));
    public static final DeferredBlock<Block> STAIR_WOOL_RED = BLOCKS.register("stair_wool_red", () -> new AntiStairBlock(ABRCWoolColors.WOOL_RED.get().defaultBlockState(), "stair_wool_red"));
    //BLock Items

    //--Bright
    public static final DeferredItem<Item> STAIR_BRIGHT_WHITE_ITEM = ITEMS.register("stair_bright_white", () -> new AntiBlockItem(STAIR_BRIGHT_WHITE.get(), "stair_bright_white"));
    public static final DeferredItem<Item> STAIR_BRIGHT_BLACK_ITEM = ITEMS.register("stair_bright_black", () -> new AntiBlockItem(STAIR_BRIGHT_BLACK.get(), "stair_bright_black"));
    public static final DeferredItem<Item> STAIR_BRIGHT_ORANGE_ITEM = ITEMS.register("stair_bright_orange", () -> new AntiBlockItem(STAIR_BRIGHT_ORANGE.get(), "stair_bright_orange"));
    public static final DeferredItem<Item> STAIR_BRIGHT_MAGENTA_ITEM = ITEMS.register("stair_bright_magenta", () -> new AntiBlockItem(STAIR_BRIGHT_MAGENTA.get(), "stair_bright_magenta"));
    public static final DeferredItem<Item> STAIR_BRIGHT_YELLOW_ITEM = ITEMS.register("stair_bright_yellow", () -> new AntiBlockItem(STAIR_BRIGHT_YELLOW.get(), "stair_bright_yellow"));
    public static final DeferredItem<Item> STAIR_BRIGHT_CYAN_ITEM = ITEMS.register("stair_bright_cyan", () -> new AntiBlockItem(STAIR_BRIGHT_CYAN.get(), "stair_bright_cyan"));
    public static final DeferredItem<Item> STAIR_BRIGHT_BLUE_ITEM = ITEMS.register("stair_bright_blue", () -> new AntiBlockItem(STAIR_BRIGHT_BLUE.get(), "stair_bright_blue"));
    public static final DeferredItem<Item> STAIR_BRIGHT_GREEN_ITEM = ITEMS.register("stair_bright_green", () -> new AntiBlockItem(STAIR_BRIGHT_GREEN.get(), "stair_bright_green"));
    public static final DeferredItem<Item> STAIR_BRIGHT_RED_ITEM = ITEMS.register("stair_bright_red", () -> new AntiBlockItem(STAIR_BRIGHT_RED.get(), "stair_bright_red"));

   //--Wool
    public static final DeferredItem<Item> STAIR_WOOL_WHITE_ITEM = ITEMS.register("stair_wool_white", () -> new AntiBlockItem(STAIR_WOOL_WHITE.get(), "stair_wool_white"));
    public static final DeferredItem<Item> STAIR_WOOL_ORANGE_ITEM = ITEMS.register("stair_wool_orange", () -> new AntiBlockItem(STAIR_WOOL_ORANGE.get(), "stair_wool_orange"));
    public static final DeferredItem<Item> STAIR_WOOL_MAGENTA_ITEM = ITEMS.register("stair_wool_magenta", () -> new AntiBlockItem(STAIR_WOOL_MAGENTA.get(), "stair_wool_magenta"));
    public static final DeferredItem<Item> STAIR_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("stair_wool_light_blue", () -> new AntiBlockItem(STAIR_WOOL_LIGHT_BLUE.get(), "stair_wool_light_blue"));
    public static final DeferredItem<Item> STAIR_WOOL_YELLOW_ITEM = ITEMS.register("stair_wool_yellow", () -> new AntiBlockItem(STAIR_WOOL_YELLOW.get(), "stair_wool_yellow"));
    public static final DeferredItem<Item> STAIR_WOOL_LIME_ITEM = ITEMS.register("stair_wool_lime", () -> new AntiBlockItem(STAIR_WOOL_LIME.get(), "stair_wool_lime"));
    public static final DeferredItem<Item> STAIR_WOOL_PINK_ITEM = ITEMS.register("stair_wool_pink", () -> new AntiBlockItem(STAIR_WOOL_PINK.get(), "stair_wool_pink"));
    public static final DeferredItem<Item> STAIR_WOOL_GRAY_ITEM = ITEMS.register("stair_wool_gray", () -> new AntiBlockItem(STAIR_WOOL_GRAY.get(), "stair_wool_gray"));
    public static final DeferredItem<Item> STAIR_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("stair_wool_light_gray", () -> new AntiBlockItem(STAIR_WOOL_LIGHT_GRAY.get(), "stair_wool_light_gray"));
    public static final DeferredItem<Item> STAIR_WOOL_CYAN_ITEM = ITEMS.register("stair_wool_cyan", () -> new AntiBlockItem(STAIR_WOOL_CYAN.get(), "stair_wool_cyan"));
    public static final DeferredItem<Item> STAIR_WOOL_PURPLE_ITEM = ITEMS.register("stair_wool_purple", () -> new AntiBlockItem(STAIR_WOOL_PURPLE.get(), "stair_wool_purple"));
    public static final DeferredItem<Item> STAIR_WOOL_BLUE_ITEM = ITEMS.register("stair_wool_blue", () -> new AntiBlockItem(STAIR_WOOL_BLUE.get(), "stair_wool_blue"));
    public static final DeferredItem<Item> STAIR_WOOL_BROWN_ITEM = ITEMS.register("stair_wool_brown", () -> new AntiBlockItem(STAIR_WOOL_BROWN.get(), "stair_wool_brown"));
    public static final DeferredItem<Item> STAIR_WOOL_GREEN_ITEM = ITEMS.register("stair_wool_green", () -> new AntiBlockItem(STAIR_WOOL_GREEN.get(), "stair_wool_green"));
    public static final DeferredItem<Item> STAIR_WOOL_RED_ITEM = ITEMS.register("stair_wool_red", () -> new AntiBlockItem(STAIR_WOOL_RED.get(), "stair_wool_red"));
}
