package com.maideniles.maidensmaterials.block;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.common.property.Properties;

import java.util.Random;
import java.util.function.Function;

public class OrnamentalMushroomFeature extends FlowersFeature {


    public OrnamentalMushroomFeature(Function<Dynamic<?>, ? extends NoFeatureConfig> p_i49876_1_) {
        super(p_i49876_1_);
    }


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
}




