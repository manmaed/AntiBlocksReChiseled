package net.manmaed.antiblocksrechiseled.items;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class AntiBlockItem extends BlockItem {
    public AntiBlockItem(Block block, String name) {
        super(block, new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(AntiBlocksReChiseled.MOD_ID, name))));
    }
}
