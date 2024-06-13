package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.NoteBlockInstrument;

public class AntiSlabBlock extends SlabBlock {
    public AntiSlabBlock() {
        super(Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(2.0F, 6.0F)
                .luminance(light -> 15));
    }
}
