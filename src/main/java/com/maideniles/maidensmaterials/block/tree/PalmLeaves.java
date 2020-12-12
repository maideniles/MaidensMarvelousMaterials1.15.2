package com.maideniles.maidensmaterials.block.tree;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;

import net.minecraft.block.GlassBlock;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;


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



}
