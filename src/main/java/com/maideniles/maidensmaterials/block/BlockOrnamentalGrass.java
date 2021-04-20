package com.maideniles.maidensmaterials.block;


import com.maideniles.maidensmaterials.init.ModBlocks;
//import com.maideniles.maidensmaterials.init.ModEnchantments;
import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.DecoratedFeatureConfig;
import net.minecraft.world.gen.feature.FlowersFeature;
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

public class BlockOrnamentalGrass extends GrassBlock {
public BlockOrnamentalGrass(Properties properties) {
        super(Properties.create(Material.ORGANIC).tickRandomly().hardnessAndResistance(0.5F).sound(SoundType.PLANT));
        }


/*
 * every tick, it'll attempt to spread normal mycelium instead of itself. If covered, will turn into glowdirt.
 */
@Override
public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!world.isRemote) {
        if (!world.isAreaLoaded(pos, 3))
        return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading

        //block is covered and so will turn into glowdirt
        world.setBlockState(pos, ModBlocks.ornamentalGrass.get().getDefaultState());


        if (world.getLight(pos.up()) >= 9) {
        //attempt to spread grass onto neighboring dirt (glowdirt handles its own conversion)
        BlockState replacementBlock = Blocks.GRASS_BLOCK.getDefaultState();

        for (int i = 0; i < 4; ++i) {
        BlockPos blockpos = pos.add(random.nextInt(3) - 1, random.nextInt(5) - 3, random.nextInt(3) - 1);
        if (world.getBlockState(blockpos).getBlock() == Blocks.DIRT) {
        world.setBlockState(blockpos, replacementBlock.with(SNOWY, world.getBlockState(blockpos.up()).getBlock() == Blocks.SNOW));
        }
        }
        }
        }
        }


    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(player.getHeldItem(handIn).toString().toLowerCase().contains("hoe")) {
            worldIn.setBlockState(pos, Blocks.FARMLAND.getDefaultState());
            worldIn.playSound(player, pos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
        }

        int hasEnchant = EnchantmentHelper.getEnchantmentLevel(
                ModEnchantments.FLOWER_CHILD.get(),
                player.getHeldItem(handIn));
        if (hasEnchant > 0) {

            worldIn.setBlockState(pos, ModBlocks.ornamentalPath.get().getDefaultState());
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    public boolean canEntitySpawn(BlockState state, IBlockReader worldIn, BlockPos pos, EntityType<?> type) {
        return true;
    }
}
