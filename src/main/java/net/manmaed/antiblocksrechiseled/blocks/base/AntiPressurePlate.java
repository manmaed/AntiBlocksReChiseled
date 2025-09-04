package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.AABB;

import java.util.List;

public class AntiPressurePlate extends BasePressurePlateBlock {

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    private final AntiPressurePlate.Sensitivity sensitivity;

    public AntiPressurePlate() {
        super(Properties.of().mapColor(MapColor.STONE).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollission().strength(0.5F).pushReaction(PushReaction.DESTROY).lightLevel((light) -> {
            return 15;
        }), BlockSetType.STONE);
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
    protected int getSignalStrength(Level level, BlockPos blockPos) {
        Class<? extends Entity> list;
        switch (this.sensitivity) {
            case EVERYTHING:
                list = Entity.class;
                break;
            case MOBS:
                list = LivingEntity.class;
                break;
            case PLAYERS:
                list = Player.class;
                break;
            default:
                return 0;
        }
        Class oclass = list;
        return getEntityCount(level, TOUCH_AABB.move(blockPos), oclass) > 0 ? 15 : 0;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(POWERED);
    }

    public enum Sensitivity {
        EVERYTHING,
        PLAYERS,
        MOBS
    }
}
