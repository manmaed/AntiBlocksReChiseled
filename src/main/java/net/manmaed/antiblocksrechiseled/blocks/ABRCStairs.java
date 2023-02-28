package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCStairs {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    /*
     * Block:     public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
     * BlockItem: public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright_white", () -> new AntiBlockItem(BRIGHT_WHITE.get()));
     */

    public static final RegistryObject<Block> STAIR_WHITE_BRIGHT = BLOCKS.register("stair_white_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_WHITE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_BLACK = BLOCKS.register("stair_black", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_BLACK.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_ORANGE_BRIGHT = BLOCKS.register("stair_orange_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_ORANGE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_MAGENTA_BRIGHT = BLOCKS.register("stair_magenta_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_MAGENTA.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_YELLOW_BRIGHT = BLOCKS.register("stair_yellow_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_YELLOW.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_CYAN_BRIGHT = BLOCKS.register("stair_cyan_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_CYAN.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_BLUE_BRIGHT = BLOCKS.register("stair_blue_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_BLUE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_GREEN_BRIGHT = BLOCKS.register("stair_green_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_GREEN.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_RED_BRIGHT = BLOCKS.register("stair_red_bright", () -> new AntiStairBlock(ABRCBrightColors.BRIGHT_YELLOW.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_WHITE_WOOL = BLOCKS.register("stair_white_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_WHITE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_ORANGE_WOOL = BLOCKS.register("stair_orange_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_ORANGE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_MAGENTA_WOOL = BLOCKS.register("stair_magenta_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_MAGENTA.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_LIGHT_BLUE_WOOL = BLOCKS.register("stair_light_blue_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_BLUE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_YELLOW_WOOL = BLOCKS.register("stair_yellow_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_YELLOW.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_LIME_WOOL = BLOCKS.register("stair_lime_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIME.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_PINK_WOOL = BLOCKS.register("stair_pink_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_PINK.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_GRAY_WOOL = BLOCKS.register("stair_gray_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_GRAY.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_LIGHT_GRAY_WOOL = BLOCKS.register("stair_light_gray_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_LIGHT_GRAY.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_CYAN_WOOL = BLOCKS.register("stair_cyan_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_CYAN.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_PURPLE_WOOL = BLOCKS.register("stair_purple_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_PURPLE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_BLUE_WOOL = BLOCKS.register("stair_blue_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_BLUE.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_BROWN_WOOL = BLOCKS.register("stair_brown_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_BROWN.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_GREEN_WOOL = BLOCKS.register("stair_green_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_GREEN.get().defaultBlockState()));
    public static final RegistryObject<Block> STAIR_RED_WOOL = BLOCKS.register("stair_red_wool", () -> new AntiStairBlock(ABRCWoolColors.WOOL_RED.get().defaultBlockState()));
    public static final RegistryObject<Item> STAIR_WHITE_BRIGHT_ITEM = ITEMS.register("stair_white", () -> new AntiBlockItem(STAIR_WHITE_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_BLACK_ITEM = ITEMS.register("stair_black", () -> new AntiBlockItem(STAIR_BLACK.get()));
    public static final RegistryObject<Item> STAIR_ORANGE_BRIGHT_ITEM = ITEMS.register("stair_orange_bright", () -> new AntiBlockItem(STAIR_ORANGE_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_MAGENTA_BRIGHT_ITEM = ITEMS.register("stair_magenta_bright", () -> new AntiBlockItem(STAIR_MAGENTA_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_YELLOW_BRIGHT_ITEM = ITEMS.register("stair_yellow_bright", () -> new AntiBlockItem(STAIR_YELLOW_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_CYAN_BRIGHT_ITEM = ITEMS.register("stair_cyan_bright", () -> new AntiBlockItem(STAIR_CYAN_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_BLUE_BRIGHT_ITEM = ITEMS.register("stair_blue_bright", () -> new AntiBlockItem(STAIR_BLUE_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_GREEN_BRIGHT_ITEM = ITEMS.register("stair_green_bright", () -> new AntiBlockItem(STAIR_GREEN_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_RED_BRIGHT_ITEM = ITEMS.register("stair_red_bright", () -> new AntiBlockItem(STAIR_RED_BRIGHT.get()));
    public static final RegistryObject<Item> STAIR_WHITE_WOOL_ITEM = ITEMS.register("stair_white_wool", () -> new AntiBlockItem(STAIR_WHITE_WOOL.get()));
    public static final RegistryObject<Item> STAIR_ORANGE_WOOL_ITEM = ITEMS.register("stair_orange_wool", () -> new AntiBlockItem(STAIR_ORANGE_WOOL.get()));
    public static final RegistryObject<Item> STAIR_MAGENTA_WOOL_ITEM = ITEMS.register("stair_magenta_wool", () -> new AntiBlockItem(STAIR_MAGENTA_WOOL.get()));
    public static final RegistryObject<Item> STAIR_LIGHT_BLUE_WOOL_ITEM = ITEMS.register("stair_light_blue_wool", () -> new AntiBlockItem(STAIR_LIGHT_BLUE_WOOL.get()));
    public static final RegistryObject<Item> STAIR_YELLOW_WOOL_ITEM = ITEMS.register("stair_yellow_wool", () -> new AntiBlockItem(STAIR_YELLOW_WOOL.get()));
    public static final RegistryObject<Item> STAIR_LIME_WOOL_ITEM = ITEMS.register("stair_lime_wool", () -> new AntiBlockItem(STAIR_LIME_WOOL.get()));
    public static final RegistryObject<Item> STAIR_PINK_WOOL_ITEM = ITEMS.register("stair_pink_wool", () -> new AntiBlockItem(STAIR_PINK_WOOL.get()));
    public static final RegistryObject<Item> STAIR_GRAY_WOOL_ITEM = ITEMS.register("stair_gray_wool", () -> new AntiBlockItem(STAIR_GRAY_WOOL.get()));
    public static final RegistryObject<Item> STAIR_LIGHT_GRAY_WOOL_ITEM = ITEMS.register("stair_light_gray_wool", () -> new AntiBlockItem(STAIR_LIGHT_GRAY_WOOL.get()));
    public static final RegistryObject<Item> STAIR_CYAN_WOOL_ITEM = ITEMS.register("stair_cyan_wool", () -> new AntiBlockItem(STAIR_CYAN_WOOL.get()));
    public static final RegistryObject<Item> STAIR_PURPLE_WOOL_ITEM = ITEMS.register("stair_purple_wool", () -> new AntiBlockItem(STAIR_PURPLE_WOOL.get()));
    public static final RegistryObject<Item> STAIR_BLUE_WOOL_ITEM = ITEMS.register("stair_blue_wool", () -> new AntiBlockItem(STAIR_BLUE_WOOL.get()));
    public static final RegistryObject<Item> STAIR_BROWN_WOOL_ITEM = ITEMS.register("stair_brown_wool", () -> new AntiBlockItem(STAIR_BROWN_WOOL.get()));
    public static final RegistryObject<Item> STAIR_GREEN_WOOL_ITEM = ITEMS.register("stair_green_wool", () -> new AntiBlockItem(STAIR_GREEN_WOOL.get()));
    public static final RegistryObject<Item> STAIR_RED_WOOL_ITEM = ITEMS.register("stair_red_wool", () -> new AntiBlockItem(STAIR_RED_WOOL.get()));
}
