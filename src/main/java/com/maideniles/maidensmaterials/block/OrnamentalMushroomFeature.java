package com.maideniles.maidensmaterials.block;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.property.Properties;

import java.util.Random;
import java.util.function.Function;

public class OrnamentalMushroomFeature extends FlowersFeature {


    public OrnamentalMushroomFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49876_1_) {
        super(p_i49876_1_);
    }

/*
    @Override
    public BlockState getRandomFlower(Random random, BlockPos pos) {

        int j = random.nextInt(3);
        switch(j)
        {
            case 0:
                return ModBlocks.ornamentalMushroom.get().getDefaultState();
            case 1:
                return Blocks.POPPY.getDefaultState();
            case 2:
            default:
                return Blocks.DANDELION.getDefaultState();
        }
    }
*/
    @Override
    public boolean func_225559_a_(IWorld p_225559_1_, BlockPos p_225559_2_, IFeatureConfig p_225559_3_) {
        return false;
    }

    @Override
    public int func_225560_a_(IFeatureConfig p_225560_1_) {
        return 0;
    }

    @Override
    public BlockPos getNearbyPos(Random p_225561_1_, BlockPos p_225561_2_, IFeatureConfig p_225561_3_) {
        return null;
    }

    @Override
    public BlockState getFlowerToPlace(Random p_225562_1_, BlockPos p_225562_2_, IFeatureConfig p_225562_3_) {
        return null;
    }
}




