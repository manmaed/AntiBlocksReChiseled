package net.manmaed.antiblocksrechiseled.blocks.base;

import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AntiPressurePlate extends PressurePlateBlock {


    public static final BooleanProperty POWERED = Properties.POWERED;
    private final AntiPressurePlate.ActivationRule activationRule;
    public AntiPressurePlate() {
        super(BlockSetType.STONE ,Settings.create()
                .mapColor(MapColor.STONE_GRAY)
                .solid()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .requiresTool()
                .noCollision()
                .strength(0.5F)
                .pistonBehavior(PistonBehavior.DESTROY)
                .luminance(light -> 15));
        this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(POWERED, false));
        this.activationRule = ActivationRule.PLAYERS;
        ;
    }

    @Override
    protected int getRedstoneOutput(BlockState state) {
        return state.get(POWERED) ? 15 : 0;
    }

    @Override
    protected BlockState setRedstoneOutput(BlockState state, int rsOut) {
        return (BlockState)state.with(POWERED, rsOut > 0) ;
    }


    @Override
    protected int getRedstoneOutput(World world, BlockPos pos) {
        Class var10000;
        switch (this.activationRule) {
            case EVERYTHING:
                var10000 = Entity.class;
                break;
            case MOBS:
                var10000 = LivingEntity.class;
                break;
            case PLAYERS:
                var10000 = PlayerEntity.class;
                break;
            default:
                throw new IncompatibleClassChangeError();
        }

        Class class_ = var10000;
        return getEntityCount(world, BOX.offset(pos), class_) > 0 ? 15 : 0;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }

    public static enum ActivationRule {
        EVERYTHING,
        MOBS,
        PLAYERS;
        private ActivationRule() {}
    }
}
