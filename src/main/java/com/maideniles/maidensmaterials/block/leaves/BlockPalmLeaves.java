package com.maideniles.maidensmaterials.block.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IShearable;

public class BlockPalmLeaves extends Block implements IShearable {
    private static final VoxelShape SHAPE = Block.makeCuboidShape(0.0, 0, 0.0, 16.0, 16.0, 16.0);


    public BlockPalmLeaves(Properties properties) {
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

    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return  type == EntityType.PARROT;
    }



}