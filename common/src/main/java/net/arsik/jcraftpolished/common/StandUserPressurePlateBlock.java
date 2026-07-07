package net.arsik.jcraftpolished.common;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BasePressurePlateBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.AABB;
import net.arna.jcraft.platform.JComponentPlatformUtils;

public class StandUserPressurePlateBlock extends BasePressurePlateBlock {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public StandUserPressurePlateBlock(Properties properties, BlockSetType blockSetType) {
        super(properties, blockSetType);
        registerDefaultState(stateDefinition.any().setValue(POWERED, false));
    }
    //vanilla pressure plate stuff
    @Override
    protected int getSignalStrength(Level level, BlockPos blockPos) {
        return getStandUserCount(level, TOUCH_AABB.move(blockPos));
    }

    @Override
    protected int getSignalForState(BlockState blockState) {
        return blockState.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected BlockState setSignalForState(BlockState blockState, int i) {
        return blockState.setValue(POWERED, i > 0);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(POWERED);
    }
    //my own stuff
    protected static int getStandUserCount(Level level, AABB aABB) {
        return level.getEntitiesOfClass(LivingEntity.class, aABB,
                EntitySelector.NO_SPECTATORS
                        .and(entity -> !entity.isIgnoringBlockTriggers())
                        .and(entity -> {
                            var standComponent = JComponentPlatformUtils.getStandComponent((LivingEntity) entity);
                            return standComponent != null && standComponent.getType() != null;
                        })).size();
    }
}
