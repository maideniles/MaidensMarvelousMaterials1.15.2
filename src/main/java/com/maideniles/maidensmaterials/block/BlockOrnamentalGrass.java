package com.maideniles.maidensmaterials.block;


import com.maideniles.maidensmaterials.init.ModBlocks;
//import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

public class BlockOrnamentalGrass extends GrassBlock implements IGrowable {
    public BlockOrnamentalGrass(Properties properties) {

        super(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT));

    }


    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }





    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }




}









