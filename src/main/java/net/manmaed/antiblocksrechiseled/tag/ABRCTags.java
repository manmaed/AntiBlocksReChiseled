package net.manmaed.antiblocksrechiseled.tag;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.Block;
import net.minecraft.registry.BuiltinRegistries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ABRCTags {

    public static final TagKey<Block> ANTIBLOCK_WITHOUT_BORDERS = create("antiblock_without_borders");
    public static final TagKey<Block> ANTIBLOCK_WITH_BORDERS = create("antiblock_with_borders");
    public static final TagKey<Block> ANTIBLOCK_BRIGHT_COLORS = create("antiblock_bright_colors");
    public static final TagKey<Block> ANTIBLOCK_WOOL_COLORS= create("antiblock_wool_colors");
    private static TagKey<Block> create(String name) {
        return TagKey.of(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name));
    }
}
