package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.items.AnitBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCBrightColors {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);

    //Pue
    public static final RegistryObject<Block> BRIGHT_WHITE = BLOCKS.register("bright_white", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_ORANGE = BLOCKS.register("bright_orange", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_MAGENTA = BLOCKS.register("bright_magenta", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_YELLOW = BLOCKS.register("bright_yellow", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_CYAN = BLOCKS.register("bright_cyan", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLUE = BLOCKS.register("bright_blue", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_GREEN = BLOCKS.register("bright_green", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_RED = BLOCKS.register("bright_red", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLACK = BLOCKS.register("bright_black", AntiBlock::new);

    //Border
    public static final RegistryObject<Block> BRIGHT_WHITE_BORDER = BLOCKS.register("bright_white_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_ORANGE_BORDER = BLOCKS.register("bright_orange_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_MAGENTA_BORDER = BLOCKS.register("bright_magenta_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_YELLOW_BORDER = BLOCKS.register("bright_yellow_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_CYAN_BORDER = BLOCKS.register("bright_cyan_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLUE_BORDER = BLOCKS.register("bright_blue_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_GREEN_BORDER = BLOCKS.register("bright_green_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_RED_BORDER = BLOCKS.register("bright_red_border", AntiBlock::new);
    public static final RegistryObject<Block> BRIGHT_BLACK_BORDER = BLOCKS.register("bright_black_border", AntiBlock::new);

    //BlockItems
    //Bright Pure
    public static final RegistryObject<Item> BRIGHT_WHITE_ITEM = ITEMS.register("bright/white", () -> new AnitBlockItem(BRIGHT_WHITE.get()));
    public static final RegistryObject<Item> BRIGHT_ORANGE_ITEM = ITEMS.register("bright/orange", () -> new AnitBlockItem(BRIGHT_ORANGE.get()));
    public static final RegistryObject<Item> BRIGHT_MAGENTA_ITEM = ITEMS.register("bright/magenta", () -> new AnitBlockItem(BRIGHT_MAGENTA.get()));
    public static final RegistryObject<Item> BRIGHT_YELLOW_ITEM = ITEMS.register("bright/yellow", () -> new AnitBlockItem(BRIGHT_YELLOW.get()));
    public static final RegistryObject<Item> BRIGHT_CYAN_ITEM = ITEMS.register("bright/cyan", () -> new AnitBlockItem(BRIGHT_CYAN.get()));
    public static final RegistryObject<Item> BRIGHT_BLUE_ITEM = ITEMS.register("bright/blue", () -> new AnitBlockItem(BRIGHT_BLUE.get()));
    public static final RegistryObject<Item> BRIGHT_GREEN_ITEM = ITEMS.register("bright/green", () -> new AnitBlockItem(BRIGHT_GREEN.get()));
    public static final RegistryObject<Item> BRIGHT_RED_ITEM = ITEMS.register("bright/red", () -> new AnitBlockItem(BRIGHT_RED.get()));
    public static final RegistryObject<Item> BRIGHT_BLACK_ITEM = ITEMS.register("bright/black", () -> new AnitBlockItem(BRIGHT_BLACK.get()));

    //Bright Border
    public static final RegistryObject<Item> BRIGHT_WHITE_BORDER_ITEM = ITEMS.register("bright/white_border", () -> new AnitBlockItem(BRIGHT_WHITE_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_ORANGE_BORDER_ITEM = ITEMS.register("bright/orange_border", () -> new AnitBlockItem(BRIGHT_ORANGE_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_MAGENTA_BORDER_ITEM = ITEMS.register("bright/magenta_border", () -> new AnitBlockItem(BRIGHT_MAGENTA_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_YELLOW_BORDER_ITEM = ITEMS.register("bright/yellow_border", () -> new AnitBlockItem(BRIGHT_YELLOW_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_CYAN_BORDER_ITEM = ITEMS.register("bright/cyan_border", () -> new AnitBlockItem(BRIGHT_CYAN_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_BLUE_BORDER_ITEM = ITEMS.register("bright/blue_border", () -> new AnitBlockItem(BRIGHT_BLUE_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_GREEN_BORDER_ITEM = ITEMS.register("bright/green_border", () -> new AnitBlockItem(BRIGHT_GREEN_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_RED_BORDER_ITEM = ITEMS.register("bright/red_border", () -> new AnitBlockItem(BRIGHT_RED_BORDER.get()));
    public static final RegistryObject<Item> BRIGHT_BLACK_BORDER_ITEM = ITEMS.register("bright/black_border", () -> new AnitBlockItem(BRIGHT_BLACK_BORDER.get()));
}
