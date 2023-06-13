package net.manmaed.antiblocksrechiseled.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class AntiBlockItem extends BlockItem {
    public AntiBlockItem(Block block) {
        super(block, new FabricItemSettings());
    }
}
