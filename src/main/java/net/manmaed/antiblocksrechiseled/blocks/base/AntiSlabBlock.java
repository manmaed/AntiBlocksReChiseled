package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.MapColor;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class AntiSlabBlock extends SlabBlock {
    public AntiSlabBlock(String name) {
        super(Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .strength(2.0F, 6.0F)
                .luminance(light -> 15).registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name))));
    }
}
