package com.maideniles.maidensmaterials.block;


import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SaplingBlock;
import net.minecraft.block.trees.Tree;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class CustomSaplingBlock extends SaplingBlock {


    protected CustomSaplingBlock(Tree treeIn, Properties properties) {
        super(treeIn, properties);
    }

    @Override
    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        Block block = state.getBlock();
        return block == Blocks.GRASS_BLOCK || block == Blocks.DIRT || block == Blocks.COARSE_DIRT
                || block == Blocks.PODZOL || block == Blocks.FARMLAND || block == ModBlocks.ornamentalGrass.get()
                || block == Blocks.SAND;
    }
}
