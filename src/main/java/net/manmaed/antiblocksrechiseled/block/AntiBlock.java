package net.manmaed.antiblocksrechiseled.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class AntiBlock extends Block {
    public AntiBlock() {
        super(FabricBlockSettings.of(Material.STONE)
                .strength(3.0F,5.0F)
                .requiresTool()
                .luminance(15)
        );
    }
}
