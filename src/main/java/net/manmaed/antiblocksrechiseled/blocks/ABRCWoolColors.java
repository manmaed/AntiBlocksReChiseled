package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ABRCWoolColors {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    //Wool Colors Pure
    public static final DeferredBlock<Block> WOOL_WHITE = BLOCKS.register("wool_white", () -> new AntiBlock("wool_white"));
    public static final DeferredBlock<Block> WOOL_ORANGE = BLOCKS.register("wool_orange", () -> new AntiBlock("wool_orange"));
    public static final DeferredBlock<Block> WOOL_MAGENTA = BLOCKS.register("wool_magenta", () -> new AntiBlock("wool_magenta"));
    public static final DeferredBlock<Block> WOOL_LIGHT_BLUE = BLOCKS.register("wool_light_blue", () -> new AntiBlock("wool_light_blue"));
    public static final DeferredBlock<Block> WOOL_YELLOW = BLOCKS.register("wool_yellow", () -> new AntiBlock("wool_yellow"));
    public static final DeferredBlock<Block> WOOL_LIME = BLOCKS.register("wool_lime", () -> new AntiBlock("wool_lime"));
    public static final DeferredBlock<Block> WOOL_PINK = BLOCKS.register("wool_pink", () -> new AntiBlock("wool_pink"));
    public static final DeferredBlock<Block> WOOL_GRAY = BLOCKS.register("wool_gray", () -> new AntiBlock("wool_gray"));
    public static final DeferredBlock<Block> WOOL_LIGHT_GRAY = BLOCKS.register("wool_light_gray", () -> new AntiBlock("wool_light_gray"));
    public static final DeferredBlock<Block> WOOL_CYAN = BLOCKS.register("wool_cyan", () -> new AntiBlock("wool_cyan"));
    public static final DeferredBlock<Block> WOOL_PURPLE = BLOCKS.register("wool_purple", () -> new AntiBlock("wool_purple"));
    public static final DeferredBlock<Block> WOOL_BLUE = BLOCKS.register("wool_blue", () -> new AntiBlock("wool_blue"));
    public static final DeferredBlock<Block> WOOL_BROWN = BLOCKS.register("wool_brown", () -> new AntiBlock("wool_brown"));
    public static final DeferredBlock<Block> WOOL_GREEN = BLOCKS.register("wool_green", () -> new AntiBlock("wool_green"));
    public static final DeferredBlock<Block> WOOL_RED = BLOCKS.register("wool_red", () -> new AntiBlock("wool_red"));

    //Wool Colors Borderd
    public static final DeferredBlock<Block> WOOL_WHITE_BORDER = BLOCKS.register("wool_white_border", () -> new AntiBlock("wool_white_border"));
    public static final DeferredBlock<Block> WOOL_ORANGE_BORDER = BLOCKS.register("wool_orange_border", () -> new AntiBlock("wool_orange_border"));
    public static final DeferredBlock<Block> WOOL_MAGENTA_BORDER = BLOCKS.register("wool_magenta_border", () -> new AntiBlock("wool_magenta_border"));
    public static final DeferredBlock<Block> WOOL_LIGHT_BLUE_BORDER = BLOCKS.register("wool_light_blue_border", () -> new AntiBlock("wool_light_blue_border"));
    public static final DeferredBlock<Block> WOOL_YELLOW_BORDER = BLOCKS.register("wool_yellow_border", () -> new AntiBlock("wool_yellow_border"));
    public static final DeferredBlock<Block> WOOL_LIME_BORDER = BLOCKS.register("wool_lime_border", () -> new AntiBlock("wool_lime_border"));
    public static final DeferredBlock<Block> WOOL_PINK_BORDER = BLOCKS.register("wool_pink_border", () -> new AntiBlock("wool_pink_border"));
    public static final DeferredBlock<Block> WOOL_GRAY_BORDER = BLOCKS.register("wool_gray_border", () -> new AntiBlock("wool_gray_border"));
    public static final DeferredBlock<Block> WOOL_LIGHT_GRAY_BORDER = BLOCKS.register("wool_light_gray_border", () -> new AntiBlock("wool_light_gray_border"));
    public static final DeferredBlock<Block> WOOL_CYAN_BORDER = BLOCKS.register("wool_cyan_border", () -> new AntiBlock("wool_cyan_border"));
    public static final DeferredBlock<Block> WOOL_PURPLE_BORDER = BLOCKS.register("wool_purple_border", () -> new AntiBlock("wool_purple_border"));
    public static final DeferredBlock<Block> WOOL_BLUE_BORDER = BLOCKS.register("wool_blue_border", () -> new AntiBlock("wool_blue_border"));
    public static final DeferredBlock<Block> WOOL_BROWN_BORDER = BLOCKS.register("wool_brown_border", () -> new AntiBlock("wool_brown_border"));
    public static final DeferredBlock<Block> WOOL_GREEN_BORDER = BLOCKS.register("wool_green_border", () -> new AntiBlock("wool_green_border"));
    public static final DeferredBlock<Block> WOOL_RED_BORDER = BLOCKS.register("wool_red_border", () -> new AntiBlock("wool_red_border"));

    //Wool Colors BlockItems

    public static final DeferredItem<Item> WOOL_WHITE_ITEM = ITEMS.register("wool_white", () -> new AntiBlockItem(WOOL_WHITE.get(), "wool_white"));
    public static final DeferredItem<Item> WOOL_ORANGE_ITEM = ITEMS.register("wool_orange", () -> new AntiBlockItem(WOOL_ORANGE.get(), "wool_orange"));
    public static final DeferredItem<Item> WOOL_MAGENTA_ITEM = ITEMS.register("wool_magenta", () -> new AntiBlockItem(WOOL_MAGENTA.get(), "wool_magenta"));
    public static final DeferredItem<Item> WOOL_LIGHT_BLUE_ITEM = ITEMS.register("wool_light_blue", () -> new AntiBlockItem(WOOL_LIGHT_BLUE.get(), "wool_light_blue"));
    public static final DeferredItem<Item> WOOL_YELLOW_ITEM = ITEMS.register("wool_yellow", () -> new AntiBlockItem(WOOL_YELLOW.get(), "wool_yellow"));
    public static final DeferredItem<Item> WOOL_LIME_ITEM = ITEMS.register("wool_lime", () -> new AntiBlockItem(WOOL_LIME.get(), "wool_lime"));
    public static final DeferredItem<Item> WOOL_PINK_ITEM = ITEMS.register("wool_pink", () -> new AntiBlockItem(WOOL_PINK.get(), "wool_pink"));
    public static final DeferredItem<Item> WOOL_GRAY_ITEM = ITEMS.register("wool_gray", () -> new AntiBlockItem(WOOL_GRAY.get(), "wool_gray"));
    public static final DeferredItem<Item> WOOL_LIGHT_GRAY_ITEM = ITEMS.register("wool_light_gray", () -> new AntiBlockItem(WOOL_LIGHT_GRAY.get(), "wool_light_gray"));
    public static final DeferredItem<Item> WOOL_CYAN_ITEM = ITEMS.register("wool_cyan", () -> new AntiBlockItem(WOOL_CYAN.get(), "wool_cyan"));
    public static final DeferredItem<Item> WOOL_PURPLE_ITEM = ITEMS.register("wool_purple", () -> new AntiBlockItem(WOOL_PURPLE.get(), "wool_purple"));
    public static final DeferredItem<Item> WOOL_BLUE_ITEM = ITEMS.register("wool_blue", () -> new AntiBlockItem(WOOL_BLUE.get(), "wool_blue"));
    public static final DeferredItem<Item> WOOL_BROWN_ITEM = ITEMS.register("wool_brown", () -> new AntiBlockItem(WOOL_BROWN.get(), "wool_brown"));
    public static final DeferredItem<Item> WOOL_GREEN_ITEM = ITEMS.register("wool_green", () -> new AntiBlockItem(WOOL_GREEN.get(), "wool_green"));
    public static final DeferredItem<Item> WOOL_RED_ITEM = ITEMS.register("wool_red", () -> new AntiBlockItem(WOOL_RED.get(), "wool_red"));

    // Wool Colors Bordered
    public static final DeferredItem<Item> WOOL_WHITE_BORDER_ITEM = ITEMS.register("wool_white_border", () -> new AntiBlockItem(WOOL_WHITE_BORDER.get(), "wool_white_border"));
    public static final DeferredItem<Item> WOOL_ORANGE_BORDER_ITEM = ITEMS.register("wool_orange_border", () -> new AntiBlockItem(WOOL_ORANGE_BORDER.get(), "wool_orange_border"));
    public static final DeferredItem<Item> WOOL_MAGENTA_BORDER_ITEM = ITEMS.register("wool_magenta_border", () -> new AntiBlockItem(WOOL_MAGENTA_BORDER.get(), "wool_magenta_border"));
    public static final DeferredItem<Item> WOOL_LIGHT_BLUE_BORDER_ITEM = ITEMS.register("wool_light_blue_border", () -> new AntiBlockItem(WOOL_LIGHT_BLUE_BORDER.get(), "wool_light_blue_border"));
    public static final DeferredItem<Item> WOOL_YELLOW_BORDER_ITEM = ITEMS.register("wool_yellow_border", () -> new AntiBlockItem(WOOL_YELLOW_BORDER.get(), "wool_yellow_border"));
    public static final DeferredItem<Item> WOOL_LIME_BORDER_ITEM = ITEMS.register("wool_lime_border", () -> new AntiBlockItem(WOOL_LIME_BORDER.get(), "wool_lime_border"));
    public static final DeferredItem<Item> WOOL_PINK_BORDER_ITEM = ITEMS.register("wool_pink_border", () -> new AntiBlockItem(WOOL_PINK_BORDER.get(), "wool_pink_border"));
    public static final DeferredItem<Item> WOOL_GRAY_BORDER_ITEM = ITEMS.register("wool_gray_border", () -> new AntiBlockItem(WOOL_GRAY_BORDER.get(), "wool_gray_border"));
    public static final DeferredItem<Item> WOOL_LIGHT_GRAY_BORDER_ITEM = ITEMS.register("wool_light_gray_border", () -> new AntiBlockItem(WOOL_LIGHT_GRAY_BORDER.get(), "wool_light_gray_border"));
    public static final DeferredItem<Item> WOOL_CYAN_BORDER_ITEM = ITEMS.register("wool_cyan_border", () -> new AntiBlockItem(WOOL_CYAN_BORDER.get(), "wool_cyan_border"));
    public static final DeferredItem<Item> WOOL_PURPLE_BORDER_ITEM = ITEMS.register("wool_purple_border", () -> new AntiBlockItem(WOOL_PURPLE_BORDER.get(), "wool_purple_border"));
    public static final DeferredItem<Item> WOOL_BLUE_BORDER_ITEM = ITEMS.register("wool_blue_border", () -> new AntiBlockItem(WOOL_BLUE_BORDER.get(), "wool_blue_border"));
    public static final DeferredItem<Item> WOOL_BROWN_BORDER_ITEM = ITEMS.register("wool_brown_border", () -> new AntiBlockItem(WOOL_BROWN_BORDER.get(), "wool_brown_border"));
    public static final DeferredItem<Item> WOOL_GREEN_BORDER_ITEM = ITEMS.register("wool_green_border", () -> new AntiBlockItem(WOOL_GREEN_BORDER.get(), "wool_green_border"));
    public static final DeferredItem<Item> WOOL_RED_BORDER_ITEM = ITEMS.register("wool_red_border", () -> new AntiBlockItem(WOOL_RED_BORDER.get(), "wool_red_border"));
}
