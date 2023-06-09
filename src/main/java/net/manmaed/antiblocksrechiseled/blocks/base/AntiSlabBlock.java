package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;

public class AntiSlabBlock extends SlabBlock {
    public AntiSlabBlock() {
        super(Properties.of().mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(2.0F, 6.0F).lightLevel((light) -> {
            return 15;
        }));
    }
}
