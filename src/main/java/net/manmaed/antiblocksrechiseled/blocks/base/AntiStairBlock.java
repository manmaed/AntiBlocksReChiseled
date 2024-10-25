package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.StairsBlock;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class AntiStairBlock extends StairsBlock {
    public AntiStairBlock(BlockState baseBlockState, String name) {
        super(baseBlockState, Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .strength(3.0F, 5.0F)
                .requiresTool()
                .luminance(light -> 15)
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name))));
    }
}
