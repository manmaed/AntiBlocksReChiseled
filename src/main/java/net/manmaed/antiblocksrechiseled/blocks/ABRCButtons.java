package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiButton;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCButtons {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredBlock<Block> BUTTON_BRIGHT_WHITE = BLOCKS.register("button_bright_white", () -> new AntiButton("button_bright_white"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_ORANGE = BLOCKS.register("button_bright_orange", () -> new AntiButton("button_bright_orange"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_MAGENTA = BLOCKS.register("button_bright_magenta", () -> new AntiButton("button_bright_magenta"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_YELLOW = BLOCKS.register("button_bright_yellow", () -> new AntiButton("button_bright_yellow"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_CYAN = BLOCKS.register("button_bright_cyan", () -> new AntiButton("button_bright_cyan"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_BLUE = BLOCKS.register("button_bright_blue", () -> new AntiButton("button_bright_blue"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_GREEN = BLOCKS.register("button_bright_green", () -> new AntiButton("button_bright_green"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_RED = BLOCKS.register("button_bright_red", () -> new AntiButton("button_bright_red"));
    public static final DeferredBlock<Block> BUTTON_BRIGHT_BLACK = BLOCKS.register("button_bright_black", () -> new AntiButton("button_bright_black"));
    public static final DeferredBlock<Block> BUTTON_WOOL_WHITE = BLOCKS.register("button_wool_white", () -> new AntiButton("button_wool_white"));
    public static final DeferredBlock<Block> BUTTON_WOOL_ORANGE = BLOCKS.register("button_wool_orange", () -> new AntiButton("button_wool_orange"));
    public static final DeferredBlock<Block> BUTTON_WOOL_MAGENTA = BLOCKS.register("button_wool_magenta", () -> new AntiButton("button_wool_magenta"));
    public static final DeferredBlock<Block> BUTTON_WOOL_LIGHT_BLUE = BLOCKS.register("button_wool_light_blue", () -> new AntiButton("button_wool_light_blue"));
    public static final DeferredBlock<Block> BUTTON_WOOL_YELLOW = BLOCKS.register("button_wool_yellow", () -> new AntiButton("button_wool_yellow"));
    public static final DeferredBlock<Block> BUTTON_WOOL_LIME = BLOCKS.register("button_wool_lime", () -> new AntiButton("button_wool_lime"));
    public static final DeferredBlock<Block> BUTTON_WOOL_PINK = BLOCKS.register("button_wool_pink", () -> new AntiButton("button_wool_pink"));
    public static final DeferredBlock<Block> BUTTON_WOOL_GRAY = BLOCKS.register("button_wool_gray", () -> new AntiButton("button_wool_gray"));
    public static final DeferredBlock<Block> BUTTON_WOOL_LIGHT_GRAY = BLOCKS.register("button_wool_light_gray", () -> new AntiButton("button_wool_light_gray"));
    public static final DeferredBlock<Block> BUTTON_WOOL_CYAN = BLOCKS.register("button_wool_cyan", () -> new AntiButton("button_wool_cyan"));
    public static final DeferredBlock<Block> BUTTON_WOOL_PURPLE = BLOCKS.register("button_wool_purple", () -> new AntiButton("button_wool_purple"));
    public static final DeferredBlock<Block> BUTTON_WOOL_BLUE = BLOCKS.register("button_wool_blue", () -> new AntiButton("button_wool_blue"));
    public static final DeferredBlock<Block> BUTTON_WOOL_BROWN = BLOCKS.register("button_wool_brown", () -> new AntiButton("button_wool_brown"));
    public static final DeferredBlock<Block> BUTTON_WOOL_GREEN = BLOCKS.register("button_wool_green", () -> new AntiButton("button_wool_green"));
    public static final DeferredBlock<Block> BUTTON_WOOL_RED = BLOCKS.register("button_wool_red", () -> new AntiButton("button_wool_red"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_WHITE_ITEM = ITEMS.register("button_bright_white", () -> new AntiBlockItem(BUTTON_BRIGHT_WHITE.get(), "button_bright_white"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_ORANGE_ITEM = ITEMS.register("button_bright_orange", () -> new AntiBlockItem(BUTTON_BRIGHT_ORANGE.get(), "button_bright_orange"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_MAGENTA_ITEM = ITEMS.register("button_bright_magenta", () -> new AntiBlockItem(BUTTON_BRIGHT_MAGENTA.get(), "button_bright_magenta"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_YELLOW_ITEM = ITEMS.register("button_bright_yellow", () -> new AntiBlockItem(BUTTON_BRIGHT_YELLOW.get(), "button_bright_yellow"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_CYAN_ITEM = ITEMS.register("button_bright_cyan", () -> new AntiBlockItem(BUTTON_BRIGHT_CYAN.get(), "button_bright_cyan"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_BLUE_ITEM = ITEMS.register("button_bright_blue", () -> new AntiBlockItem(BUTTON_BRIGHT_BLUE.get(), "button_bright_blue"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_GREEN_ITEM = ITEMS.register("button_bright_green", () -> new AntiBlockItem(BUTTON_BRIGHT_GREEN.get(), "button_bright_green"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_RED_ITEM = ITEMS.register("button_bright_red", () -> new AntiBlockItem(BUTTON_BRIGHT_RED.get(), "button_bright_red"));
    public static final DeferredItem<Item> BUTTON_BRIGHT_BLACK_ITEM = ITEMS.register("button_bright_black", () -> new AntiBlockItem(BUTTON_BRIGHT_BLACK.get(), "button_bright_black"));
    public static final DeferredItem<Item> BUTTON_WOOL_WHITE_ITEM = ITEMS.register("button_wool_white", () -> new AntiBlockItem(BUTTON_WOOL_WHITE.get(), "button_wool_white"));
    public static final DeferredItem<Item> BUTTON_WOOL_ORANGE_ITEM = ITEMS.register("button_wool_orange", () -> new AntiBlockItem(BUTTON_WOOL_ORANGE.get(), "button_wool_orange"));
    public static final DeferredItem<Item> BUTTON_WOOL_MAGENTA_ITEM = ITEMS.register("button_wool_magenta", () -> new AntiBlockItem(BUTTON_WOOL_MAGENTA.get(), "button_wool_magenta"));
    public static final DeferredItem<Item> BUTTON_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("button_wool_light_blue", () -> new AntiBlockItem(BUTTON_WOOL_LIGHT_BLUE.get(), "button_wool_light_blue"));
    public static final DeferredItem<Item> BUTTON_WOOL_YELLOW_ITEM = ITEMS.register("button_wool_yellow", () -> new AntiBlockItem(BUTTON_WOOL_YELLOW.get(), "button_wool_yellow"));
    public static final DeferredItem<Item> BUTTON_WOOL_LIME_ITEM = ITEMS.register("button_wool_lime", () -> new AntiBlockItem(BUTTON_WOOL_LIME.get(), "button_wool_lime"));
    public static final DeferredItem<Item> BUTTON_WOOL_PINK_ITEM = ITEMS.register("button_wool_pink", () -> new AntiBlockItem(BUTTON_WOOL_PINK.get(), "button_wool_pink"));
    public static final DeferredItem<Item> BUTTON_WOOL_GRAY_ITEM = ITEMS.register("button_wool_gray", () -> new AntiBlockItem(BUTTON_WOOL_GRAY.get(), "button_wool_gray"));
    public static final DeferredItem<Item> BUTTON_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("button_wool_light_gray", () -> new AntiBlockItem(BUTTON_WOOL_LIGHT_GRAY.get(), "button_wool_light_gray"));
    public static final DeferredItem<Item> BUTTON_WOOL_CYAN_ITEM = ITEMS.register("button_wool_cyan", () -> new AntiBlockItem(BUTTON_WOOL_CYAN.get(), "button_wool_cyan"));
    public static final DeferredItem<Item> BUTTON_WOOL_PURPLE_ITEM = ITEMS.register("button_wool_purple", () -> new AntiBlockItem(BUTTON_WOOL_PURPLE.get(), "button_wool_purple"));
    public static final DeferredItem<Item> BUTTON_WOOL_BLUE_ITEM = ITEMS.register("button_wool_blue", () -> new AntiBlockItem(BUTTON_WOOL_BLUE.get(), "button_wool_blue"));
    public static final DeferredItem<Item> BUTTON_WOOL_BROWN_ITEM = ITEMS.register("button_wool_brown", () -> new AntiBlockItem(BUTTON_WOOL_BROWN.get(), "button_wool_brown"));
    public static final DeferredItem<Item> BUTTON_WOOL_GREEN_ITEM = ITEMS.register("button_wool_green", () -> new AntiBlockItem(BUTTON_WOOL_GREEN.get(), "button_wool_green"));
    public static final DeferredItem<Item> BUTTON_WOOL_RED_ITEM = ITEMS.register("button_wool_red", () -> new AntiBlockItem(BUTTON_WOOL_RED.get(), "button_wool_red"));

}
