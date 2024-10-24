package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiPressurePlate;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
public class ABRCPressurePlates {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AntiBlocksReChiseled.MOD_ID);
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_WHITE = BLOCKS.register("pressure_plate_bright_white", () -> new AntiPressurePlate("pressure_plate_bright_white"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_ORANGE = BLOCKS.register("pressure_plate_bright_orange", () -> new AntiPressurePlate("pressure_plate_bright_orange"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_MAGENTA = BLOCKS.register("pressure_plate_bright_magenta", () -> new AntiPressurePlate("pressure_plate_bright_magenta"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_YELLOW = BLOCKS.register("pressure_plate_bright_yellow", () -> new AntiPressurePlate("pressure_plate_bright_yellow"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_CYAN = BLOCKS.register("pressure_plate_bright_cyan", () -> new AntiPressurePlate("pressure_plate_bright_cyan"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_BLUE = BLOCKS.register("pressure_plate_bright_blue", () -> new AntiPressurePlate("pressure_plate_bright_blue"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_GREEN = BLOCKS.register("pressure_plate_bright_green", () -> new AntiPressurePlate("pressure_plate_bright_green"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_RED = BLOCKS.register("pressure_plate_bright_red", () -> new AntiPressurePlate("pressure_plate_bright_red"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_BRIGHT_BLACK = BLOCKS.register("pressure_plate_bright_black", () -> new AntiPressurePlate("pressure_plate_bright_black"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_WHITE = BLOCKS.register("pressure_plate_wool_white", () -> new AntiPressurePlate("pressure_plate_wool_white"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_ORANGE = BLOCKS.register("pressure_plate_wool_orange", () -> new AntiPressurePlate("pressure_plate_wool_orange"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_MAGENTA = BLOCKS.register("pressure_plate_wool_magenta", () -> new AntiPressurePlate("pressure_plate_wool_magenta"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIGHT_BLUE = BLOCKS.register("pressure_plate_wool_light_blue", () -> new AntiPressurePlate("pressure_plate_wool_light_blue"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_YELLOW = BLOCKS.register("pressure_plate_wool_yellow", () -> new AntiPressurePlate("pressure_plate_wool_yellow"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIME = BLOCKS.register("pressure_plate_wool_lime", () -> new AntiPressurePlate("pressure_plate_wool_lime"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_PINK = BLOCKS.register("pressure_plate_wool_pink", () -> new AntiPressurePlate("pressure_plate_wool_pink"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_GRAY = BLOCKS.register("pressure_plate_wool_gray", () -> new AntiPressurePlate("pressure_plate_wool_gray"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_LIGHT_GRAY = BLOCKS.register("pressure_plate_wool_light_gray", () -> new AntiPressurePlate("pressure_plate_wool_light_gray"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_CYAN = BLOCKS.register("pressure_plate_wool_cyan", () -> new AntiPressurePlate("pressure_plate_wool_cyan"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_PURPLE = BLOCKS.register("pressure_plate_wool_purple", () -> new AntiPressurePlate("pressure_plate_wool_purple"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_BLUE = BLOCKS.register("pressure_plate_wool_blue", () -> new AntiPressurePlate("pressure_plate_wool_blue"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_BROWN = BLOCKS.register("pressure_plate_wool_brown", () -> new AntiPressurePlate("pressure_plate_wool_brown"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_GREEN = BLOCKS.register("pressure_plate_wool_green", () -> new AntiPressurePlate("pressure_plate_wool_green"));
    public static final DeferredBlock<Block> PRESSURE_PLATE_WOOL_RED = BLOCKS.register("pressure_plate_wool_red", () -> new AntiPressurePlate("pressure_plate_wool_red"));


    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_WHITE_ITEM = ITEMS.register("pressure_plate_bright_white", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_WHITE.get(), "pressure_plate_bright_white"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_ORANGE_ITEM = ITEMS.register("pressure_plate_bright_orange", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_ORANGE.get(), "pressure_plate_bright_orange"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_MAGENTA_ITEM = ITEMS.register("pressure_plate_bright_magenta", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_MAGENTA.get(), "pressure_plate_bright_magenta"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_YELLOW_ITEM = ITEMS.register("pressure_plate_bright_yellow", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_YELLOW.get(), "pressure_plate_bright_yellow"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_CYAN_ITEM = ITEMS.register("pressure_plate_bright_cyan", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_CYAN.get(), "pressure_plate_bright_cyan"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_BLUE_ITEM = ITEMS.register("pressure_plate_bright_blue", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLUE.get(), "pressure_plate_bright_blue"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_GREEN_ITEM = ITEMS.register("pressure_plate_bright_green", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_GREEN.get(), "pressure_plate_bright_green"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_RED_ITEM = ITEMS.register("pressure_plate_bright_red", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_RED.get(), "pressure_plate_bright_red"));
    public static final DeferredItem<Item> PRESSURE_PLATE_BRIGHT_BLACK_ITEM = ITEMS.register("pressure_plate_bright_black", () -> new AntiBlockItem(PRESSURE_PLATE_BRIGHT_BLACK.get(), "pressure_plate_bright_black"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_WHITE_ITEM = ITEMS.register("pressure_plate_wool_white", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_WHITE.get(), "pressure_plate_wool_white"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_ORANGE_ITEM = ITEMS.register("pressure_plate_wool_orange", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_ORANGE.get(), "pressure_plate_wool_orange"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_MAGENTA_ITEM = ITEMS.register("pressure_plate_wool_magenta", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_MAGENTA.get(), "pressure_plate_wool_magenta"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIGHT_BLUE_ITEM = ITEMS.register("pressure_plate_wool_light_blue", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_BLUE.get(), "pressure_plate_wool_light_blue"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_YELLOW_ITEM = ITEMS.register("pressure_plate_wool_yellow", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_YELLOW.get(), "pressure_plate_wool_yellow"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIME_ITEM = ITEMS.register("pressure_plate_wool_lime", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIME.get(), "pressure_plate_wool_lime"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_PINK_ITEM = ITEMS.register("pressure_plate_wool_pink", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_PINK.get(), "pressure_plate_wool_pink"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_GRAY_ITEM = ITEMS.register("pressure_plate_wool_gray", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_GRAY.get(), "pressure_plate_wool_gray"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_LIGHT_GRAY_ITEM = ITEMS.register("pressure_plate_wool_light_gray", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_LIGHT_GRAY.get(), "pressure_plate_wool_light_gray"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_CYAN_ITEM = ITEMS.register("pressure_plate_wool_cyan", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_CYAN.get(), "pressure_plate_wool_cyan"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_PURPLE_ITEM = ITEMS.register("pressure_plate_wool_purple", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_PURPLE.get(), "pressure_plate_wool_purple"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_BLUE_ITEM = ITEMS.register("pressure_plate_wool_blue", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_BLUE.get(), "pressure_plate_wool_blue"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_BROWN_ITEM = ITEMS.register("pressure_plate_wool_brown", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_BROWN.get(), "pressure_plate_wool_brown"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_GREEN_ITEM = ITEMS.register("pressure_plate_wool_green", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_GREEN.get(), "pressure_plate_wool_green"));
    public static final DeferredItem<Item> PRESSURE_PLATE_WOOL_RED_ITEM = ITEMS.register("pressure_plate_wool_red", () -> new AntiBlockItem(PRESSURE_PLATE_WOOL_RED.get(), "pressure_plate_wool_red"));

}
