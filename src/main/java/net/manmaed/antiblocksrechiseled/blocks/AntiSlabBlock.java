package net.manmaed.antiblocksrechiseled.blocks;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.material.Material;

public class AntiSlabBlock extends SlabBlock {
    public AntiSlabBlock() {
        super(Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }
}
