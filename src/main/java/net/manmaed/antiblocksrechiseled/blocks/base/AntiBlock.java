package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class AntiBlock extends Block {
    public AntiBlock(String name) {
        super(Properties.of().mapColor(MapColor.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }).setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name))));
    }

}
