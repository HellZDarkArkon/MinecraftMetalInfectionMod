package org.net.nanophage.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class SkeletonBlock extends Block {
    public SkeletonBlock(Properties prop) {
        super(prop);
    }

    //register in PhageBlocks.class

    @Override
    public InteractionResult use(BlockState pState, Level lv, BlockPos pos, Player pPlayer,
                                 InteractionHand hand, BlockHitResult hit) {
        return InteractionResult.SUCCESS;
    }
}
