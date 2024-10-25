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

public class ABRCWoolColors {

    public static final Block WOOL_WHITE = new AntiBlock("wool_white");//"wool_white", AntiBlock::new);
    public static final Block WOOL_ORANGE = new AntiBlock("wool_orange");//"wool_orange", AntiBlock::new);
    public static final Block WOOL_MAGENTA = new AntiBlock("wool_magenta");//"wool_magenta", AntiBlock::new);
    public static final Block WOOL_LIGHT_BLUE = new AntiBlock("wool_light_blue");//"wool_light_blue", AntiBlock::new);
    public static final Block WOOL_YELLOW = new AntiBlock("wool_yellow");//"wool_yellow", AntiBlock::new);
    public static final Block WOOL_LIME = new AntiBlock("wool_lime");//"wool_lime", AntiBlock::new);
    public static final Block WOOL_PINK = new AntiBlock("wool_pink");//"wool_pink", AntiBlock::new);
    public static final Block WOOL_GRAY = new AntiBlock("wool_gray");//"wool_gray", AntiBlock::new);
    public static final Block WOOL_LIGHT_GRAY = new AntiBlock("wool_light_gray");//"wool_light_gray", AntiBlock::new);
    public static final Block WOOL_CYAN = new AntiBlock("wool_cyan");//"wool_cyan", AntiBlock::new);
    public static final Block WOOL_PURPLE = new AntiBlock("wool_purple");//"wool_purple", AntiBlock::new);
    public static final Block WOOL_BLUE = new AntiBlock("wool_blue");//"wool_blue", AntiBlock::new);
    public static final Block WOOL_BROWN = new AntiBlock("wool_brown");//"wool_brown", AntiBlock::new);
    public static final Block WOOL_GREEN = new AntiBlock("wool_green");//"wool_green", AntiBlock::new);
    public static final Block WOOL_RED = new AntiBlock("wool_red");//"wool_red", AntiBlock::new);

    //Wool Colors Borderd
    public static final Block WOOL_WHITE_BORDER = new AntiBlock("wool_white_border");//"wool_white_border", AntiBlock::new);
    public static final Block WOOL_ORANGE_BORDER = new AntiBlock("wool_orange_border");//"wool_orange_border", AntiBlock::new);
    public static final Block WOOL_MAGENTA_BORDER = new AntiBlock("wool_magenta_border");//"wool_magenta_border", AntiBlock::new);
    public static final Block WOOL_LIGHT_BLUE_BORDER = new AntiBlock("wool_light_blue_border");//"wool_light_blue_border", AntiBlock::new);
    public static final Block WOOL_YELLOW_BORDER = new AntiBlock("wool_yellow_border");//"wool_yellow_border", AntiBlock::new);
    public static final Block WOOL_LIME_BORDER = new AntiBlock("wool_lime_border");//"wool_lime_border", AntiBlock::new);
    public static final Block WOOL_PINK_BORDER = new AntiBlock("wool_pink_border");//"wool_pink_border", AntiBlock::new);
    public static final Block WOOL_GRAY_BORDER = new AntiBlock("wool_gray_border");//"wool_gray_border", AntiBlock::new);
    public static final Block WOOL_LIGHT_GRAY_BORDER = new AntiBlock("wool_light_gray_border");//"wool_light_gray_border", AntiBlock::new);
    public static final Block WOOL_CYAN_BORDER = new AntiBlock("wool_cyan_border");//"wool_cyan_border", AntiBlock::new);
    public static final Block WOOL_PURPLE_BORDER = new AntiBlock("wool_purple_border");//"wool_purple_border", AntiBlock::new);
    public static final Block WOOL_BLUE_BORDER = new AntiBlock("wool_blue_border");//"wool_blue_border", AntiBlock::new);
    public static final Block WOOL_BROWN_BORDER = new AntiBlock("wool_brown_border");//"wool_brown_border", AntiBlock::new);
    public static final Block WOOL_GREEN_BORDER = new AntiBlock("wool_green_border");//"wool_green_border", AntiBlock::new);
    public static final Block WOOL_RED_BORDER = new AntiBlock("wool_red_border");//"wool_red_border", AntiBlock::new);

    //Wool Colors BlockItems

    public static final Item WOOL_WHITE_ITEM = new AntiBlockItem(WOOL_WHITE, "wool_white");//"wool_white", () -> new AnitBlockItem(WOOL_WHITE.get()));
    public static final Item WOOL_ORANGE_ITEM = new AntiBlockItem(WOOL_ORANGE, "wool_orange");//"wool_orange", () -> new AnitBlockItem(WOOL_ORANGE.get()));
    public static final Item WOOL_MAGENTA_ITEM = new AntiBlockItem(WOOL_MAGENTA, "wool_magenta");//"wool_magenta", () -> new AnitBlockItem(WOOL_MAGENTA.get()));
    public static final Item WOOL_LIGHT_BLUE_ITEM = new AntiBlockItem(WOOL_LIGHT_BLUE, "wool_light_blue");//"wool_light_blue", () -> new AnitBlockItem(WOOL_LIGHT_BLUE.get()));
    public static final Item WOOL_YELLOW_ITEM = new AntiBlockItem(WOOL_YELLOW, "wool_yellow");//"wool_yellow", () -> new AnitBlockItem(WOOL_YELLOW.get()));
    public static final Item WOOL_LIME_ITEM = new AntiBlockItem(WOOL_LIME, "wool_lime");//"wool_lime", () -> new AnitBlockItem(WOOL_LIME.get()));
    public static final Item WOOL_PINK_ITEM = new AntiBlockItem(WOOL_PINK, "wool_pink");//"wool_pink", () -> new AnitBlockItem(WOOL_PINK.get()));
    public static final Item WOOL_GRAY_ITEM = new AntiBlockItem(WOOL_GRAY, "wool_gray");//"wool_gray", () -> new AnitBlockItem(WOOL_GRAY.get()));
    public static final Item WOOL_LIGHT_GRAY_ITEM = new AntiBlockItem(WOOL_LIGHT_GRAY, "wool_light_gray");//"wool_light_gray", () -> new AnitBlockItem(WOOL_LIGHT_GRAY.get()));
    public static final Item WOOL_CYAN_ITEM = new AntiBlockItem(WOOL_CYAN, "wool_cyan");//"wool_cyan", () -> new AnitBlockItem(WOOL_CYAN.get()));
    public static final Item WOOL_PURPLE_ITEM = new AntiBlockItem(WOOL_PURPLE, "wool_purple");//"wool_purple", () -> new AnitBlockItem(WOOL_PURPLE.get()));
    public static final Item WOOL_BLUE_ITEM = new AntiBlockItem(WOOL_BLUE, "wool_blue");//"wool_blue", () -> new AnitBlockItem(WOOL_BLUE.get()));
    public static final Item WOOL_BROWN_ITEM = new AntiBlockItem(WOOL_BROWN, "wool_brown");//"wool_brown", () -> new AnitBlockItem(WOOL_BROWN.get()));
    public static final Item WOOL_GREEN_ITEM = new AntiBlockItem(WOOL_GREEN, "wool_green");//"wool_green", () -> new AnitBlockItem(WOOL_GREEN.get()));
    public static final Item WOOL_RED_ITEM = new AntiBlockItem(WOOL_RED, "wool_red");//"wool_red", () -> new AnitBlockItem(WOOL_RED.get()));

    //Wool Colors Borderd
    public static final Item WOOL_WHITE_BORDER_ITEM = new AntiBlockItem(WOOL_WHITE_BORDER, "wool_white_border");//"wool_white_border", () -> new AnitBlockItem(WOOL_WHITE_BORDER.get()));
    public static final Item WOOL_ORANGE_BORDER_ITEM = new AntiBlockItem(WOOL_ORANGE_BORDER, "wool_orange_border");//"wool_orange_border", () -> new AnitBlockItem(WOOL_ORANGE_BORDER.get()));
    public static final Item WOOL_MAGENTA_BORDER_ITEM = new AntiBlockItem(WOOL_MAGENTA_BORDER, "wool_magenta_border");//"wool_magenta_border", () -> new AnitBlockItem(WOOL_MAGENTA_BORDER.get()));
    public static final Item WOOL_LIGHT_BLUE_BORDER_ITEM = new AntiBlockItem(WOOL_LIGHT_BLUE_BORDER, "wool_light_blue_border");//"wool_light_blue_border", () -> new AnitBlockItem(WOOL_LIGHT_BLUE_BORDER.get()));
    public static final Item WOOL_YELLOW_BORDER_ITEM = new AntiBlockItem(WOOL_YELLOW_BORDER, "wool_yellow_border");//"wool_yellow_border", () -> new AnitBlockItem(WOOL_YELLOW_BORDER.get()));
    public static final Item WOOL_LIME_BORDER_ITEM = new AntiBlockItem(WOOL_LIME_BORDER, "wool_lime_border");//"wool_lime_border", () -> new AnitBlockItem(WOOL_LIME_BORDER.get()));
    public static final Item WOOL_PINK_BORDER_ITEM = new AntiBlockItem(WOOL_PINK_BORDER, "wool_pink_border");//"wool_pink_border", () -> new AnitBlockItem(WOOL_PINK_BORDER.get()));
    public static final Item WOOL_GRAY_BORDER_ITEM = new AntiBlockItem(WOOL_GRAY_BORDER, "wool_gray_border");//"wool_gray_border", () -> new AnitBlockItem(WOOL_GRAY_BORDER.get()));
    public static final Item WOOL_LIGHT_GRAY_BORDER_ITEM = new AntiBlockItem(WOOL_LIGHT_GRAY_BORDER, "wool_light_gray_border");//"wool_light_gray_border", () -> new AnitBlockItem(WOOL_LIGHT_GRAY_BORDER.get()));
    public static final Item WOOL_CYAN_BORDER_ITEM = new AntiBlockItem(WOOL_CYAN_BORDER, "wool_cyan_border");//"wool_cyan_border", () -> new AnitBlockItem(WOOL_CYAN_BORDER.get()));
    public static final Item WOOL_PURPLE_BORDER_ITEM = new AntiBlockItem(WOOL_PURPLE_BORDER, "wool_purple_border");//"wool_purple_border", () -> new AnitBlockItem(WOOL_PURPLE_BORDER.get()));
    public static final Item WOOL_BLUE_BORDER_ITEM = new AntiBlockItem(WOOL_BLUE_BORDER, "wool_blue_border");//"wool_blue_border", () -> new AnitBlockItem(WOOL_BLUE_BORDER.get()));
    public static final Item WOOL_BROWN_BORDER_ITEM = new AntiBlockItem(WOOL_BROWN_BORDER, "wool_brown_border");//"wool_brown_border", () -> new AnitBlockItem(WOOL_BROWN_BORDER.get()));
    public static final Item WOOL_GREEN_BORDER_ITEM = new AntiBlockItem(WOOL_GREEN_BORDER, "wool_green_border");//"wool_green_border", () -> new AnitBlockItem(WOOL_GREEN_BORDER.get()));
    public static final Item WOOL_RED_BORDER_ITEM = new AntiBlockItem(WOOL_RED_BORDER, "wool_red_border");//"wool_red_border", () -> new AnitBlockItem(WOOL_RED_BORDER.get()));

    public static void doRegistery() {
        doBlockRegistery();
        doBlockItemRegistery();
    }
    private static void doBlockRegistery() {
        Registry.register(Registries.BLOCK, getId("wool_white"), WOOL_WHITE);
        Registry.register(Registries.BLOCK, getId("wool_orange"), WOOL_ORANGE);
        Registry.register(Registries.BLOCK, getId("wool_magenta"), WOOL_MAGENTA);
        Registry.register(Registries.BLOCK, getId("wool_light_blue"), WOOL_LIGHT_BLUE);
        Registry.register(Registries.BLOCK, getId("wool_yellow"), WOOL_YELLOW);
        Registry.register(Registries.BLOCK, getId("wool_lime"), WOOL_LIME);
        Registry.register(Registries.BLOCK, getId("wool_pink"), WOOL_PINK);
        Registry.register(Registries.BLOCK, getId("wool_gray"), WOOL_GRAY);
        Registry.register(Registries.BLOCK, getId("wool_light_gray"), WOOL_LIGHT_GRAY);
        Registry.register(Registries.BLOCK, getId("wool_cyan"), WOOL_CYAN);
        Registry.register(Registries.BLOCK, getId("wool_purple"), WOOL_PURPLE);
        Registry.register(Registries.BLOCK, getId("wool_blue"), WOOL_BLUE);
        Registry.register(Registries.BLOCK, getId("wool_brown"), WOOL_BROWN);
        Registry.register(Registries.BLOCK, getId("wool_green"), WOOL_GREEN);
        Registry.register(Registries.BLOCK, getId("wool_red"), WOOL_RED);
        Registry.register(Registries.BLOCK, getId("wool_white_border"), WOOL_WHITE_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_orange_border"), WOOL_ORANGE_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_magenta_border"), WOOL_MAGENTA_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_light_blue_border"), WOOL_LIGHT_BLUE_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_yellow_border"), WOOL_YELLOW_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_lime_border"), WOOL_LIME_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_pink_border"), WOOL_PINK_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_gray_border"), WOOL_GRAY_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_light_gray_border"), WOOL_LIGHT_GRAY_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_cyan_border"), WOOL_CYAN_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_purple_border"), WOOL_PURPLE_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_blue_border"), WOOL_BLUE_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_brown_border"), WOOL_BROWN_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_green_border"), WOOL_GREEN_BORDER);
        Registry.register(Registries.BLOCK, getId("wool_red_border"), WOOL_RED_BORDER);
    }

    private static void doBlockItemRegistery() {
        registerItem("wool_white", WOOL_WHITE_ITEM);
        registerItem("wool_orange", WOOL_ORANGE_ITEM);
        registerItem("wool_magenta", WOOL_MAGENTA_ITEM);
        registerItem("wool_light_blue", WOOL_LIGHT_BLUE_ITEM);
        registerItem("wool_yellow", WOOL_YELLOW_ITEM);
        registerItem("wool_lime", WOOL_LIME_ITEM);
        registerItem("wool_pink", WOOL_PINK_ITEM);
        registerItem("wool_gray", WOOL_GRAY_ITEM);
        registerItem("wool_light_gray", WOOL_LIGHT_GRAY_ITEM);
        registerItem("wool_cyan", WOOL_CYAN_ITEM);
        registerItem("wool_purple", WOOL_PURPLE_ITEM);
        registerItem("wool_blue", WOOL_BLUE_ITEM);
        registerItem("wool_brown", WOOL_BROWN_ITEM);
        registerItem("wool_green", WOOL_GREEN_ITEM);
        registerItem("wool_red", WOOL_RED_ITEM);
        registerItem("wool_white_border", WOOL_WHITE_BORDER_ITEM);
        registerItem("wool_orange_border", WOOL_ORANGE_BORDER_ITEM);
        registerItem("wool_magenta_border", WOOL_MAGENTA_BORDER_ITEM);
        registerItem("wool_light_blue_border", WOOL_LIGHT_BLUE_BORDER_ITEM);
        registerItem("wool_yellow_border", WOOL_YELLOW_BORDER_ITEM);
        registerItem("wool_lime_border", WOOL_LIME_BORDER_ITEM);
        registerItem("wool_pink_border", WOOL_PINK_BORDER_ITEM);
        registerItem("wool_gray_border", WOOL_GRAY_BORDER_ITEM);
        registerItem("wool_light_gray_border", WOOL_LIGHT_GRAY_BORDER_ITEM);
        registerItem("wool_cyan_border", WOOL_CYAN_BORDER_ITEM);
        registerItem("wool_purple_border", WOOL_PURPLE_BORDER_ITEM);
        registerItem("wool_blue_border", WOOL_BLUE_BORDER_ITEM);
        registerItem("wool_brown_border", WOOL_BROWN_BORDER_ITEM);
        registerItem("wool_green_border", WOOL_GREEN_BORDER_ITEM);
        registerItem("wool_red_border", WOOL_RED_BORDER_ITEM);
    }

    private static void registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, getId(name), item);
        ItemGroupEvents.modifyEntriesEvent(AntiBlocksReChiseled.itemGroup).register(entries -> entries.add(item));
    }

    private static Identifier getId(String name) {
        return Identifier.of(AntiBlocksReChiseled.MOD_ID, name);
    }
}
