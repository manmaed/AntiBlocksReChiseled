package net.manmaed.antiblocksrechiseled.blocks;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.manmaed.antiblocksrechiseled.blocks.base.AntiBlock;
import net.manmaed.antiblocksrechiseled.items.AntiBlockItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ABRCBrightColors {

    //Pure
    public static final Block BRIGHT_WHITE = new AntiBlock();//"bright_white";
    public static final Block BRIGHT_ORANGE = new AntiBlock(); //"bright_orange", AntiBlock::new);
    public static final Block BRIGHT_MAGENTA = new AntiBlock(); //"bright_magenta", AntiBlock::new);
    public static final Block BRIGHT_YELLOW = new AntiBlock(); //"bright_yellow", AntiBlock::new);
    public static final Block BRIGHT_CYAN = new AntiBlock(); //"bright_cyan", AntiBlock::new);
    public static final Block BRIGHT_BLUE = new AntiBlock(); //"bright_blue", AntiBlock::new);
    public static final Block BRIGHT_GREEN = new AntiBlock(); //"bright_green", AntiBlock::new);
    public static final Block BRIGHT_RED = new AntiBlock(); //"bright_red", AntiBlock::new);
    public static final Block BRIGHT_BLACK = new AntiBlock(); //"bright_black", AntiBlock::new);

    //Borders

    public static final Block BRIGHT_WHITE_BORDER = new AntiBlock();//"bright_white_border", AntiBlock::new);
    public static final Block BRIGHT_ORANGE_BORDER = new AntiBlock();//"bright_orange_border", AntiBlock::new);
    public static final Block BRIGHT_MAGENTA_BORDER = new AntiBlock();//"bright_magenta_border", AntiBlock::new);
    public static final Block BRIGHT_YELLOW_BORDER = new AntiBlock();//"bright_yellow_border", AntiBlock::new);
    public static final Block BRIGHT_CYAN_BORDER = new AntiBlock();//"bright_cyan_border", AntiBlock::new);
    public static final Block BRIGHT_BLUE_BORDER = new AntiBlock();//"bright_blue_border", AntiBlock::new);
    public static final Block BRIGHT_GREEN_BORDER = new AntiBlock();//"bright_green_border", AntiBlock::new);
    public static final Block BRIGHT_RED_BORDER = new AntiBlock();//"bright_red_border", AntiBlock::new);
    public static final Block BRIGHT_BLACK_BORDER = new AntiBlock();//"bright_black_border", AntiBlock::new);

    //BlockItems
    //Pure
    public static final Item BRIGHT_WHITE_ITEM = new AntiBlockItem(BRIGHT_WHITE);//"bright_white", () -> new AnitBlockItem(BRIGHT_WHITE.get()));
    public static final Item BRIGHT_ORANGE_ITEM = new AntiBlockItem(BRIGHT_ORANGE);//"bright_orange", () -> new AnitBlockItem(BRIGHT_ORANGE.get()));
    public static final Item BRIGHT_MAGENTA_ITEM = new AntiBlockItem(BRIGHT_MAGENTA);//"bright_magenta", () -> new AnitBlockItem(BRIGHT_MAGENTA.get()));
    public static final Item BRIGHT_YELLOW_ITEM = new AntiBlockItem(BRIGHT_YELLOW);//"bright_yellow", () -> new AnitBlockItem(BRIGHT_YELLOW.get()));
    public static final Item BRIGHT_CYAN_ITEM = new AntiBlockItem(BRIGHT_CYAN);//"bright_cyan", () -> new AnitBlockItem(BRIGHT_CYAN.get()));
    public static final Item BRIGHT_BLUE_ITEM = new AntiBlockItem(BRIGHT_BLUE);//"bright_blue", () -> new AnitBlockItem(BRIGHT_BLUE.get()));
    public static final Item BRIGHT_GREEN_ITEM = new AntiBlockItem(BRIGHT_GREEN);//"bright_green", () -> new AnitBlockItem(BRIGHT_GREEN.get()));
    public static final Item BRIGHT_RED_ITEM = new AntiBlockItem(BRIGHT_RED);//"bright_red", () -> new AnitBlockItem(BRIGHT_RED.get()));
    public static final Item BRIGHT_BLACK_ITEM = new AntiBlockItem(BRIGHT_BLACK);//"bright_black", () -> new AnitBlockItem(BRIGHT_BLACK.get()));

    //Border
    public static final Item BRIGHT_WHITE_BORDER_ITEM = new AntiBlockItem(BRIGHT_WHITE_BORDER);//"bright_white_border", () -> new AnitBlockItem(BRIGHT_WHITE_BORDER.get()));
    public static final Item BRIGHT_ORANGE_BORDER_ITEM = new AntiBlockItem(BRIGHT_ORANGE_BORDER);//"bright_orange_border", () -> new AnitBlockItem(BRIGHT_ORANGE_BORDER.get()));
    public static final Item BRIGHT_MAGENTA_BORDER_ITEM = new AntiBlockItem(BRIGHT_MAGENTA_BORDER);//"bright_magenta_border", () -> new AnitBlockItem(BRIGHT_MAGENTA_BORDER.get()));
    public static final Item BRIGHT_YELLOW_BORDER_ITEM = new AntiBlockItem(BRIGHT_YELLOW_BORDER);//"bright_yellow_border", () -> new AnitBlockItem(BRIGHT_YELLOW_BORDER.get()));
    public static final Item BRIGHT_CYAN_BORDER_ITEM = new AntiBlockItem(BRIGHT_CYAN_BORDER);//"bright_cyan_border", () -> new AnitBlockItem(BRIGHT_CYAN_BORDER.get()));
    public static final Item BRIGHT_BLUE_BORDER_ITEM = new AntiBlockItem(BRIGHT_BLUE_BORDER);//"bright_blue_border", () -> new AnitBlockItem(BRIGHT_BLUE_BORDER.get()));
    public static final Item BRIGHT_GREEN_BORDER_ITEM = new AntiBlockItem(BRIGHT_GREEN_BORDER);//"bright_green_border", () -> new AnitBlockItem(BRIGHT_GREEN_BORDER.get()));
    public static final Item BRIGHT_RED_BORDER_ITEM = new AntiBlockItem(BRIGHT_RED_BORDER);//"bright_red_border", () -> new AnitBlockItem(BRIGHT_RED_BORDER.get()));
    public static final Item BRIGHT_BLACK_BORDER_ITEM = new AntiBlockItem(BRIGHT_BLACK_BORDER);//"bright_black_border", () -> new AnitBlockItem(BRIGHT_BLACK_BORDER.get()));


    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }
    private static void doBlockRegistery() {
        Registry.register(Registries.BLOCK, getId("bright_white"), BRIGHT_WHITE);
        Registry.register(Registries.BLOCK, getId("bright_orange"), BRIGHT_ORANGE);
        Registry.register(Registries.BLOCK, getId("bright_magenta"), BRIGHT_MAGENTA);
        Registry.register(Registries.BLOCK, getId("bright_yellow"), BRIGHT_YELLOW);
        Registry.register(Registries.BLOCK, getId("bright_cyan"), BRIGHT_CYAN);
        Registry.register(Registries.BLOCK, getId("bright_blue"), BRIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("bright_green"), BRIGHT_GREEN);
        Registry.register(Registries.BLOCK, getId("bright_red"), BRIGHT_RED);
        Registry.register(Registries.BLOCK, getId("bright_black"), BRIGHT_BLACK);
        Registry.register(Registries.BLOCK, getId("bright_white_border"), BRIGHT_WHITE_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_orange_border"), BRIGHT_ORANGE_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_magenta_border"), BRIGHT_MAGENTA_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_yellow_border"), BRIGHT_YELLOW_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_cyan_border"), BRIGHT_CYAN_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_blue_border"), BRIGHT_BLUE_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_green_border"), BRIGHT_GREEN_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_red_border"), BRIGHT_RED_BORDER);
        Registry.register(Registries.BLOCK, getId("bright_black_border"), BRIGHT_BLACK_BORDER);
    }

    private static void doBlockItemRegistery() {
        registerItem("bright_white", BRIGHT_WHITE_ITEM);
        registerItem("bright_orange", BRIGHT_ORANGE_ITEM);
        registerItem("bright_magenta", BRIGHT_MAGENTA_ITEM);
        registerItem("bright_yellow", BRIGHT_YELLOW_ITEM);
        registerItem("bright_cyan", BRIGHT_CYAN_ITEM);
        registerItem("bright_blue", BRIGHT_BLUE_ITEM);
        registerItem("bright_green", BRIGHT_GREEN_ITEM);
        registerItem("bright_red", BRIGHT_RED_ITEM);
        registerItem("bright_black", BRIGHT_BLACK_ITEM);
        registerItem("bright_white_border", BRIGHT_WHITE_BORDER_ITEM);
        registerItem("bright_orange_border", BRIGHT_ORANGE_BORDER_ITEM);
        registerItem("bright_magenta_border", BRIGHT_MAGENTA_BORDER_ITEM);
        registerItem("bright_yellow_border", BRIGHT_YELLOW_BORDER_ITEM);
        registerItem("bright_cyan_border", BRIGHT_CYAN_BORDER_ITEM);
        registerItem("bright_blue_border", BRIGHT_BLUE_BORDER_ITEM);
        registerItem("bright_green_border", BRIGHT_GREEN_BORDER_ITEM);
        registerItem("bright_red_border", BRIGHT_RED_BORDER_ITEM);
        registerItem("bright_black_border", BRIGHT_BLACK_BORDER_ITEM);


    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }
    private static Identifier getId(String name) {
        return new Identifier(AntiBlocksReChiseled.MOD_ID, name);
    }
}
