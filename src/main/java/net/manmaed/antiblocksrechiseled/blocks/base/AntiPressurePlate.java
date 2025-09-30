package net.manmaed.antiblocksrechiseled.blocks.base;

import net.manmaed.antiblocksrechiseled.AntiBlocksReChiseled;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PressurePlateBlock;
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

public class AntiPressurePlate extends PressurePlateBlock {

    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    private final AntiPressurePlate.Sensitivity sensitivity;

    public AntiPressurePlate(String name) {
        super(BlockSetType.STONE, Properties.of().mapColor(MapColor.STONE).forceSolidOn().instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().noCollision().strength(0.5F).pushReaction(PushReaction.DESTROY).lightLevel((light) -> {
            return 15;
        }).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AntiBlocksReChiseled.MOD_ID, name))));
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
