package net.manmaed.antiblocksrechiseled.tag;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ABRCTags {

    public static final TagKey<Block> ANTIBLOCK_WITHOUT_BORDERS = createBlockTag("antiblock_without_borders");
    public static final TagKey<Block> ANTIBLOCK_WITH_BORDERS = createBlockTag("antiblock_with_borders");

    public static final TagKey<Block> ANTIBLOCK_BRIGHT_COLORS = createBlockTag("antiblock_bright_colors");
    public static final TagKey<Block> ANTIBLOCK_WOOL_COLORS = createBlockTag("antiblock_wool_colors");

    public static final TagKey<Block> ANTIBLOCK_BUTTONS = createBlockTag("antiblock_buttons");
    public static final TagKey<Block> ANTIBLOCK_STAIRS = createBlockTag("antiblock_stairs");
    public static final TagKey<Block> ANTIBLOCK_SLABS = createBlockTag("antiblock_slabs");
    public static final TagKey<Block> ANTIBLOCK_PRESSURE_PLATES = createBlockTag("antiblock_pressure_plates");

    //Item
    public static final TagKey<Item> ANTIBLOCK_WITHOUT_BORDERS_ITEM = createItemTag("antiblock_without_borders");
    public static final TagKey<Item> ANTIBLOCK_WITH_BORDERS_ITEM = createItemTag("antiblock_with_borders");

    public static final TagKey<Item> ANTIBLOCK_BRIGHT_COLORS_ITEM = createItemTag("antiblock_bright_colors");
    public static final TagKey<Item> ANTIBLOCK_WOOL_COLORS_ITEM = createItemTag("antiblock_wool_colors");

    public static final TagKey<Item> ANTIBLOCK_BUTTONS_ITEM = createItemTag("antiblock_buttons");
    public static final TagKey<Item> ANTIBLOCK_STAIRS_ITEM = createItemTag("antiblock_stairs");
    public static final TagKey<Item> ANTIBLOCK_SLABS_ITEM = createItemTag("antiblock_slabs");
    public static final TagKey<Item> ANTIBLOCK_PRESSURE_PLATES_ITEM = createItemTag("antiblock_pressure_plates");
    private static TagKey<Block> createBlockTag(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation(AntiBlocksReChiseled.MOD_ID, name));
    }
    private static TagKey<Item> createItemTag(String name) {
        return TagKey.create(BuiltInRegistries.ITEM.key(), new ResourceLocation(AntiBlocksReChiseled.MOD_ID, name));
    }
}
