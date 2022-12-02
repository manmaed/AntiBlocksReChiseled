package net.manmaed.antiblocksrechiseled.blocks;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.items.AnitBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ABRCWoolColors {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AntiBlocksReChiseled.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AntiBlocksReChiseled.MOD_ID);
    //Wool Colors Pure
    public static final RegistryObject<Block> WOOL_WHITE = BLOCKS.register("wool_white", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_ORANGE = BLOCKS.register("wool_orange", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_MAGENTA = BLOCKS.register("wool_magenta", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_BLUE = BLOCKS.register("wool_light_blue", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_YELLOW = BLOCKS.register("wool_yellow", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIME = BLOCKS.register("wool_lime", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PINK = BLOCKS.register("wool_pink", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GRAY = BLOCKS.register("wool_gray", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_GRAY = BLOCKS.register("wool_light_gray", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_CYAN = BLOCKS.register("wool_cyan", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PURPLE = BLOCKS.register("wool_purple", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BLUE = BLOCKS.register("wool_blue", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BROWN = BLOCKS.register("wool_brown", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GREEN = BLOCKS.register("wool_green", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_RED = BLOCKS.register("wool_red", AntiBlock::new);

    //Wool Colors Borderd
    public static final RegistryObject<Block> WOOL_WHITE_BORDER = BLOCKS.register("wool_white_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_ORANGE_BORDER = BLOCKS.register("wool_orange_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_MAGENTA_BORDER = BLOCKS.register("wool_magenta_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_BLUE_BORDER = BLOCKS.register("wool_light_blue_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_YELLOW_BORDER = BLOCKS.register("wool_yellow_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIME_BORDER = BLOCKS.register("wool_lime_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PINK_BORDER = BLOCKS.register("wool_pink_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GRAY_BORDER = BLOCKS.register("wool_gray_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_LIGHT_GRAY_BORDER = BLOCKS.register("wool_light_gray_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_CYAN_BORDER = BLOCKS.register("wool_cyan_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_PURPLE_BORDER = BLOCKS.register("wool_purple_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BLUE_BORDER = BLOCKS.register("wool_blue_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_BROWN_BORDER = BLOCKS.register("wool_brown_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_GREEN_BORDER = BLOCKS.register("wool_green_border", AntiBlock::new);
    public static final RegistryObject<Block> WOOL_RED_BORDER = BLOCKS.register("wool_red_border", AntiBlock::new);

    //Wool Colors BlockItems

    public static final RegistryObject<Item> WOOL_WHITE_ITEM = ITEMS.register("wool/white", () -> new AnitBlockItem(WOOL_WHITE.get()));
    public static final RegistryObject<Item> WOOL_ORANGE_ITEM = ITEMS.register("wool/orange", () -> new AnitBlockItem(WOOL_ORANGE.get()));
    public static final RegistryObject<Item> WOOL_MAGENTA_ITEM = ITEMS.register("wool/magenta", () -> new AnitBlockItem(WOOL_MAGENTA.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_BLUE_ITEM = ITEMS.register("wool/light_blue", () -> new AnitBlockItem(WOOL_LIGHT_BLUE.get()));
    public static final RegistryObject<Item> WOOL_YELLOW_ITEM = ITEMS.register("wool/yellow", () -> new AnitBlockItem(WOOL_YELLOW.get()));
    public static final RegistryObject<Item> WOOL_LIME_ITEM = ITEMS.register("wool/lime", () -> new AnitBlockItem(WOOL_LIME.get()));
    public static final RegistryObject<Item> WOOL_PINK_ITEM = ITEMS.register("wool/pink", () -> new AnitBlockItem(WOOL_PINK.get()));
    public static final RegistryObject<Item> WOOL_GRAY_ITEM = ITEMS.register("wool/gray", () -> new AnitBlockItem(WOOL_GRAY.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_GRAY_ITEM = ITEMS.register("wool/light_gray", () -> new AnitBlockItem(WOOL_LIGHT_GRAY.get()));
    public static final RegistryObject<Item> WOOL_CYAN_ITEM = ITEMS.register("wool/cyan", () -> new AnitBlockItem(WOOL_CYAN.get()));
    public static final RegistryObject<Item> WOOL_PURPLE_ITEM = ITEMS.register("wool/purple", () -> new AnitBlockItem(WOOL_PURPLE.get()));
    public static final RegistryObject<Item> WOOL_BLUE_ITEM = ITEMS.register("wool/blue", () -> new AnitBlockItem(WOOL_BLUE.get()));
    public static final RegistryObject<Item> WOOL_BROWN_ITEM = ITEMS.register("wool/brown", () -> new AnitBlockItem(WOOL_BROWN.get()));
    public static final RegistryObject<Item> WOOL_GREEN_ITEM = ITEMS.register("wool/green", () -> new AnitBlockItem(WOOL_GREEN.get()));
    public static final RegistryObject<Item> WOOL_RED_ITEM = ITEMS.register("wool/red", () -> new AnitBlockItem(WOOL_RED.get()));

    //Wool Colors Borderd
    public static final RegistryObject<Item> WOOL_WHITE_BORDER_ITEM = ITEMS.register("wool/white_border", () -> new AnitBlockItem(WOOL_WHITE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_ORANGE_BORDER_ITEM = ITEMS.register("wool/orange_border", () -> new AnitBlockItem(WOOL_ORANGE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_MAGENTA_BORDER_ITEM = ITEMS.register("wool/magenta_border", () -> new AnitBlockItem(WOOL_MAGENTA_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_BLUE_BORDER_ITEM = ITEMS.register("wool/light_blue_border", () -> new AnitBlockItem(WOOL_LIGHT_BLUE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_YELLOW_BORDER_ITEM = ITEMS.register("wool/yellow_border", () -> new AnitBlockItem(WOOL_YELLOW_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIME_BORDER_ITEM = ITEMS.register("wool/lime_border", () -> new AnitBlockItem(WOOL_LIME_BORDER.get()));
    public static final RegistryObject<Item> WOOL_PINK_BORDER_ITEM = ITEMS.register("wool/pink_border", () -> new AnitBlockItem(WOOL_PINK_BORDER.get()));
    public static final RegistryObject<Item> WOOL_GRAY_BORDER_ITEM = ITEMS.register("wool/gray_border", () -> new AnitBlockItem(WOOL_GRAY_BORDER.get()));
    public static final RegistryObject<Item> WOOL_LIGHT_GRAY_BORDER_ITEM = ITEMS.register("wool/light_gray_border", () -> new AnitBlockItem(WOOL_LIGHT_GRAY_BORDER.get()));
    public static final RegistryObject<Item> WOOL_CYAN_BORDER_ITEM = ITEMS.register("wool/cyan_border", () -> new AnitBlockItem(WOOL_CYAN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_PURPLE_BORDER_ITEM = ITEMS.register("wool/purple_border", () -> new AnitBlockItem(WOOL_PURPLE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_BLUE_BORDER_ITEM = ITEMS.register("wool/blue_border", () -> new AnitBlockItem(WOOL_BLUE_BORDER.get()));
    public static final RegistryObject<Item> WOOL_BROWN_BORDER_ITEM = ITEMS.register("wool/brown_border", () -> new AnitBlockItem(WOOL_BROWN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_GREEN_BORDER_ITEM = ITEMS.register("wool/green_border", () -> new AnitBlockItem(WOOL_GREEN_BORDER.get()));
    public static final RegistryObject<Item> WOOL_RED_BORDER_ITEM = ITEMS.register("wool/red_border", () -> new AnitBlockItem(WOOL_RED_BORDER.get()));

}
