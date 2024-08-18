package net.manmaed.antiblocksrechiseled.tag;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ABRCTags {

    public static final TagKey<Block> ANTIBLOCK_WITHOUT_BORDERS = create("antiblock_without_borders");
    public static final TagKey<Block> ANTIBLOCK_WITH_BORDERS = create("antiblock_with_borders");

    public static final TagKey<Block> ANTIBLOCK_BRIGHT_COLORS = create("antiblock_bright_colors");
    public static final TagKey<Block> ANTIBLOCK_WOOL_COLORS= create("antiblock_wool_colors");


    private static TagKey<Block> create(String name) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name));
    }
}
