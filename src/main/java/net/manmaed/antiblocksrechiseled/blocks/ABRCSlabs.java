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

    //Blocks

    //--Bright
    public static final DeferredBlock<Block> SLAB_BRIGHT_WHITE = BLOCKS.register("slab_bright_white", () -> new AntiSlabBlock("slab_bright_white"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_BLACK = BLOCKS.register("slab_bright_black", () -> new AntiSlabBlock("slab_bright_black"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_ORANGE = BLOCKS.register("slab_bright_orange", () -> new AntiSlabBlock("slab_bright_orange"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_MAGENTA = BLOCKS.register("slab_bright_magenta", () -> new AntiSlabBlock("slab_bright_magenta"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_YELLOW = BLOCKS.register("slab_bright_yellow", () -> new AntiSlabBlock("slab_bright_yellow"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_CYAN = BLOCKS.register("slab_bright_cyan", () -> new AntiSlabBlock("slab_bright_cyan"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_BLUE = BLOCKS.register("slab_bright_blue", () -> new AntiSlabBlock("slab_bright_blue"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_GREEN = BLOCKS.register("slab_bright_green", () -> new AntiSlabBlock("slab_bright_green"));
    public static final DeferredBlock<Block> SLAB_BRIGHT_RED = BLOCKS.register("slab_bright_red", () -> new AntiSlabBlock("slab_bright_red"));

    //--Wool
    public static final DeferredBlock<Block> SLAB_WOOL_WHITE = BLOCKS.register("slab_wool_white", () -> new AntiSlabBlock("slab_wool_white"));
    public static final DeferredBlock<Block> SLAB_WOOL_ORANGE = BLOCKS.register("slab_wool_orange", () -> new AntiSlabBlock("slab_wool_orange"));
    public static final DeferredBlock<Block> SLAB_WOOL_MAGENTA = BLOCKS.register("slab_wool_magenta", () -> new AntiSlabBlock("slab_wool_magenta"));
    public static final DeferredBlock<Block> SLAB_WOOL_LIGHT_BLUE = BLOCKS.register("slab_wool_light_blue", () -> new AntiSlabBlock("slab_wool_light_blue"));
    public static final DeferredBlock<Block> SLAB_WOOL_YELLOW = BLOCKS.register("slab_wool_yellow", () -> new AntiSlabBlock("slab_wool_yellow"));
    public static final DeferredBlock<Block> SLAB_WOOL_LIME = BLOCKS.register("slab_wool_lime", () -> new AntiSlabBlock("slab_wool_lime"));
    public static final DeferredBlock<Block> SLAB_WOOL_PINK = BLOCKS.register("slab_wool_pink", () -> new AntiSlabBlock("slab_wool_pink"));
    public static final DeferredBlock<Block> SLAB_WOOL_GRAY = BLOCKS.register("slab_wool_gray", () -> new AntiSlabBlock("slab_wool_gray"));
    public static final DeferredBlock<Block> SLAB_WOOL_LIGHT_GRAY = BLOCKS.register("slab_wool_light_gray", () -> new AntiSlabBlock("slab_wool_light_gray"));
    public static final DeferredBlock<Block> SLAB_WOOL_CYAN = BLOCKS.register("slab_wool_cyan", () -> new AntiSlabBlock("slab_wool_cyan"));
    public static final DeferredBlock<Block> SLAB_WOOL_PURPLE = BLOCKS.register("slab_wool_purple", () -> new AntiSlabBlock("slab_wool_purple"));
    public static final DeferredBlock<Block> SLAB_WOOL_BLUE = BLOCKS.register("slab_wool_blue", () -> new AntiSlabBlock("slab_wool_blue"));
    public static final DeferredBlock<Block> SLAB_WOOL_BROWN = BLOCKS.register("slab_wool_brown", () -> new AntiSlabBlock("slab_wool_brown"));
    public static final DeferredBlock<Block> SLAB_WOOL_GREEN = BLOCKS.register("slab_wool_green", () -> new AntiSlabBlock("slab_wool_green"));
    public static final DeferredBlock<Block> SLAB_WOOL_RED = BLOCKS.register("slab_wool_red", () -> new AntiSlabBlock("slab_wool_red"));

    //BlockItems

    //--Bright
    public static final DeferredItem<Item> SLAB_BRIGHT_WHITE_ITEM = ITEMS.register("slab_bright_white", () -> new AntiBlockItem(SLAB_BRIGHT_WHITE.get(), "slab_bright_white"));
    public static final DeferredItem<Item> SLAB_BRIGHT_BLACK_ITEM = ITEMS.register("slab_bright_black", () -> new AntiBlockItem(SLAB_BRIGHT_BLACK.get(), "slab_bright_black"));
    public static final DeferredItem<Item> SLAB_BRIGHT_ORANGE_ITEM = ITEMS.register("slab_bright_orange", () -> new AntiBlockItem(SLAB_BRIGHT_ORANGE.get(), "slab_bright_orange"));
    public static final DeferredItem<Item> SLAB_BRIGHT_MAGENTA_ITEM = ITEMS.register("slab_bright_magenta", () -> new AntiBlockItem(SLAB_BRIGHT_MAGENTA.get(), "slab_bright_magenta"));
    public static final DeferredItem<Item> SLAB_BRIGHT_YELLOW_ITEM = ITEMS.register("slab_bright_yellow", () -> new AntiBlockItem(SLAB_BRIGHT_YELLOW.get(), "slab_bright_yellow"));
    public static final DeferredItem<Item> SLAB_BRIGHT_CYAN_ITEM = ITEMS.register("slab_bright_cyan", () -> new AntiBlockItem(SLAB_BRIGHT_CYAN.get(), "slab_bright_cyan"));
    public static final DeferredItem<Item> SLAB_BRIGHT_BLUE_ITEM = ITEMS.register("slab_bright_blue", () -> new AntiBlockItem(SLAB_BRIGHT_BLUE.get(), "slab_bright_blue"));
    public static final DeferredItem<Item> SLAB_BRIGHT_GREEN_ITEM = ITEMS.register("slab_bright_green", () -> new AntiBlockItem(SLAB_BRIGHT_GREEN.get(), "slab_bright_green"));
    public static final DeferredItem<Item> SLAB_BRIGHT_RED_ITEM = ITEMS.register("slab_bright_red", () -> new AntiBlockItem(SLAB_BRIGHT_RED.get(), "slab_bright_red"));

    //--Wool
    public static final DeferredItem<Item> SLAB_WOOL_WHITE_ITEM = ITEMS.register("slab_wool_white", () -> new AntiBlockItem(SLAB_WOOL_WHITE.get(), "slab_wool_white"));
    public static final DeferredItem<Item> SLAB_WOOL_ORANGE_ITEM = ITEMS.register("slab_wool_orange", () -> new AntiBlockItem(SLAB_WOOL_ORANGE.get(), "slab_wool_orange"));
    public static final DeferredItem<Item> SLAB_WOOL_MAGENTA_ITEM = ITEMS.register("slab_wool_magenta", () -> new AntiBlockItem(SLAB_WOOL_MAGENTA.get(), "slab_wool_magenta"));
    public static final DeferredItem<Item> SLAB_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("slab_wool_light_blue", () -> new AntiBlockItem(SLAB_WOOL_LIGHT_BLUE.get(), "slab_wool_light_blue"));
    public static final DeferredItem<Item> SLAB_WOOL_YELLOW_ITEM = ITEMS.register("slab_wool_yellow", () -> new AntiBlockItem(SLAB_WOOL_YELLOW.get(), "slab_wool_yellow"));
    public static final DeferredItem<Item> SLAB_WOOL_LIME_ITEM = ITEMS.register("slab_wool_lime", () -> new AntiBlockItem(SLAB_WOOL_LIME.get(), "slab_wool_lime"));
    public static final DeferredItem<Item> SLAB_WOOL_PINK_ITEM = ITEMS.register("slab_wool_pink", () -> new AntiBlockItem(SLAB_WOOL_PINK.get(), "slab_wool_pink"));
    public static final DeferredItem<Item> SLAB_WOOL_GRAY_ITEM = ITEMS.register("slab_wool_gray", () -> new AntiBlockItem(SLAB_WOOL_GRAY.get(), "slab_wool_gray"));
    public static final DeferredItem<Item> SLAB_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("slab_wool_light_gray", () -> new AntiBlockItem(SLAB_WOOL_LIGHT_GRAY.get(), "slab_wool_light_gray"));
    public static final DeferredItem<Item> SLAB_WOOL_CYAN_ITEM = ITEMS.register("slab_wool_cyan", () -> new AntiBlockItem(SLAB_WOOL_CYAN.get(), "slab_wool_cyan"));
    public static final DeferredItem<Item> SLAB_WOOL_PURPLE_ITEM = ITEMS.register("slab_wool_purple", () -> new AntiBlockItem(SLAB_WOOL_PURPLE.get(), "slab_wool_purple"));
    public static final DeferredItem<Item> SLAB_WOOL_BLUE_ITEM = ITEMS.register("slab_wool_blue", () -> new AntiBlockItem(SLAB_WOOL_BLUE.get(), "slab_wool_blue"));
    public static final DeferredItem<Item> SLAB_WOOL_BROWN_ITEM = ITEMS.register("slab_wool_brown", () -> new AntiBlockItem(SLAB_WOOL_BROWN.get(), "slab_wool_brown"));
    public static final DeferredItem<Item> SLAB_WOOL_GREEN_ITEM = ITEMS.register("slab_wool_green", () -> new AntiBlockItem(SLAB_WOOL_GREEN.get(), "slab_wool_green"));
    public static final DeferredItem<Item> SLAB_WOOL_RED_ITEM = ITEMS.register("slab_wool_red", () -> new AntiBlockItem(SLAB_WOOL_RED.get(), "slab_wool_red"));

}
