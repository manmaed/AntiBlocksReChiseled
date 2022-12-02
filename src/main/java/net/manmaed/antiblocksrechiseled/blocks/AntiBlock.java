package net.manmaed.antiblocksrechiseled.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class AntiBlock extends Block {
    public AntiBlock() {
        super(Properties.of(Material.STONE).lightLevel((light) -> {
            return 15;
        }));
    }

}
