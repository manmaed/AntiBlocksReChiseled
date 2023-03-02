package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.CraftingMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.CraftingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.BlockHitResult;

public class AntiCraftingTable extends CraftingTableBlock {

    private static final Component CONTAINER_TITLE = Component.translatable("container.crafting");
    public AntiCraftingTable() {
        super(Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos blockPos, Player sully, InteractionHand interactionHand, BlockHitResult blockHitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        } else {
            sully.openMenu(blockState.getMenuProvider(level, blockPos));
            sully.awardStat(Stats.INTERACT_WITH_CRAFTING_TABLE);
            return InteractionResult.CONSUME;
        }
        //return super.use(p_52233_, p_52234_, p_52235_, p_52236_, p_52237_, p_52238_);
    }

    @Override
    public MenuProvider getMenuProvider(BlockState p_52240_, Level p_52241_, BlockPos p_52242_) {
        return new SimpleMenuProvider((p_52229_, p_52230_, p_52231_) -> {
            return new CraftingMenu(p_52229_, p_52230_, ContainerLevelAccess.create(p_52241_, p_52242_));
        }, CONTAINER_TITLE);
    }
}
