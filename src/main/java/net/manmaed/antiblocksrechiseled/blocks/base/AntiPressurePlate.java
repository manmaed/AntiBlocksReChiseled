package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class AntiPressurePlate extends BasePressurePlateBlock {

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    private final Sensitivity sensitivity;

    public AntiPressurePlate() {
        super(Properties.of(Material.STONE).strength(3.0F, 5.0F).requiresCorrectToolForDrops().lightLevel((light) -> {
            return 15;
        }));
        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, Boolean.valueOf(false)));
        this.sensitivity = Sensitivity.PLAYERS;
    }

    @Override
    protected int getSignalForState(BlockState blockState) {
        return blockState.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected BlockState setSignalForState(BlockState blockState, int power) {
        return blockState.setValue(POWERED, Boolean.valueOf(power > 0));
    }

    @Override
    protected void playOnSound(LevelAccessor level, BlockPos blockPos) {
        level.playSound((Player) null, blockPos, SoundEvents.STONE_PRESSURE_PLATE_CLICK_ON, SoundSource.BLOCKS, 0.3F, 0.6F);
    }

    @Override
    protected void playOffSound(LevelAccessor level, BlockPos blockPo) {
        level.playSound((Player) null, blockPo, SoundEvents.STONE_PRESSURE_PLATE_CLICK_OFF, SoundSource.BLOCKS, 0.3F, 0.5F);
    }

    @Override
    protected int getSignalStrength(Level level, BlockPos blockPos) {
        AABB aabb = TOUCH_AABB.move(blockPos);
        List<? extends Entity> list;
        switch (this.sensitivity) {
            case EVERYTHING:
                list = level.getEntities((Entity) null, aabb);
                break;
            case MOBS:
                list = level.getEntitiesOfClass(LivingEntity.class, aabb);
                break;
            case PLAYERS:
                list = level.getEntitiesOfClass(Player.class, aabb);
                break;
            default:
                return 0;
        }
        if(!list.isEmpty()) {
            for (Entity entity : list) {
                if(!entity.isIgnoringBlockTriggers()) {
                    return 15;
                }
            }
        }
        return 0;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(POWERED);
    }

    public static enum Sensitivity {
        EVERYTHING,
        PLAYERS,
        MOBS;
    }
}
