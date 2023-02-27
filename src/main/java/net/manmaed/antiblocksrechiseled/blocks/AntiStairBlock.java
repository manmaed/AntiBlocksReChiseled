package net.manmaed.antiblocksrechiseled.blocks;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class AntiStairBlock extends StairBlock {
    public AntiStairBlock(BlockState defaultState) {
        super(defaultState ,Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }
}
