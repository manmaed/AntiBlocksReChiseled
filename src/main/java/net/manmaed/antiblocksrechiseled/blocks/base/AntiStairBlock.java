package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
public class AntiStairBlock extends StairBlock {
    public AntiStairBlock(BlockState defaultState, String name) {
        super(defaultState, Properties.of().mapColor(MapColor.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name))));
    }
}
