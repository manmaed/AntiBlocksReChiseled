package net.manmaed.antiblocksrechiseled.items;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

public class AntiBlockItem extends BlockItem {
    public AntiBlockItem(Block block, String name) {
        super(block, new Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name))));
    }
}
