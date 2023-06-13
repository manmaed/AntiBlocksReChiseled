package net.manmaed.antiblocksrechiseled.blocks.base;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;

public class AntiBlock extends Block {
    public AntiBlock() {
        super(Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .strength(3.0F,5.0F)
                .requiresTool()
                .luminance(light -> 15)
        );
    }
}
