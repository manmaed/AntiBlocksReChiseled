package net.manmaed.antiblocksrechiseled.items;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class AntiBlockItem extends BlockItem {
    public AntiBlockItem(Block block) {
        super(block, new Properties().tab(AntiBlocksReChiseled.itemGroup));
    }
}