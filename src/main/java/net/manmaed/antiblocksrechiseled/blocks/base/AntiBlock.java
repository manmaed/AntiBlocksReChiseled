package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;

public class AntiBlock extends Block {
    public AntiBlock() {
        super(Properties.of().mapColor(MapColor.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }

}
