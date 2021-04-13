package com.maideniles.maidensmaterials.block.tree;

import net.minecraft.block.*;

import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IShearable;


public class PalmLeaves extends Block implements IShearable {
    private static final VoxelShape SHAPE = Block.makeCuboidShape(0.0, 0, 0.0, 16.0, 16.0, 16.0);


    public PalmLeaves(Properties properties) {
        super(Block.Properties.create(Material.LEAVES).notSolid().hardnessAndResistance(2.5F).sound(SoundType.PLANT));
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
