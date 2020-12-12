package com.maideniles.maidensmaterials.block.tree;

import com.maideniles.maidensmaterials.block.fruit.GrowingAppleBlock;
import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;


public class PalmLeaves extends GlassBlock {
    private static final VoxelShape SHAPE = Block.makeCuboidShape(0.0, 0, 0.0, 16.0, 16.0, 16.0);


    public PalmLeaves(Properties properties) {
        super(properties);
    }


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public boolean isNormalCube(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return false;
    }


    public BlockRenderLayer getBlockLayer() {
        return BlockRenderLayer.CUTOUT_MIPPED;
    }
}
