package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.block.StairsBlock;

public class AntiStairBlock extends StairsBlock {
    public AntiStairBlock(BlockState baseBlockState) {
        super(baseBlockState, Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .strength(3.0F, 5.0F)
                .requiresTool()
                .luminance(light -> 15));
    }
}
