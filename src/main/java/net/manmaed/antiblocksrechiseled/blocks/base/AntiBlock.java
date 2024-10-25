package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class AntiBlock extends Block {
    public AntiBlock(String name) {
        super(Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .strength(3.0F,5.0F)
                .requiresTool()
                .luminance(light -> 15)
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name)))
                //.registryKey(RegistryKeys.BLOCK.(RegistryKeys.BLOCK, Identifier.of(AntiBlocksReChiseled.MOD_ID, name))
        );
    }
}
