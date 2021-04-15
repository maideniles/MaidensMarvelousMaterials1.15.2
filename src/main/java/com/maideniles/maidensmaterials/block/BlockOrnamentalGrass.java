package com.maideniles.maidensmaterials.block;


import com.maideniles.maidensmaterials.init.ModBlocks;
//import com.maideniles.maidensmaterials.init.ModEnchantments;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tags.FluidTags;
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
import net.minecraft.world.lighting.LightEngine;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.IPlantable;

import java.util.List;
import java.util.Random;

public class BlockOrnamentalGrass extends GrassBlock implements IGrowable {


    private Block spreadsTo;

    public BlockOrnamentalGrass(Properties properties) {

        super(Block.Properties.create(Material.PLANTS).sound(SoundType.PLANT));
        this.spreadsTo = spreadsTo;
    }


    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, BlockState state) {
        return true;
    }



    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand) {
        if (!checkLight(state, world, pos)) {
            if (!world.isAreaLoaded(pos, 3)) {
                return;
            }

            world.setBlockState(pos, this.spreadsTo.getDefaultState());
        } else {
            BlockState ourState = this.getDefaultState();
            BlockState grassState = ModBlocks.ornamentalGrass.get().getDefaultState();

            if (world.getLight(pos.up()) >= 9) {
                for(int i = 0; i < 4; ++i) {
                    BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
                    Block blocc = world.getBlockState(blockpos).getBlock();
                    boolean stone = blocc == this.spreadsTo;
                    boolean dirt = blocc == Blocks.DIRT || blocc == Blocks.COARSE_DIRT;

                    if (stone) {
                        // spreading to stone is 3x rarer.
                        if (rand.nextInt(3) == 0 && checkFluidAndLight(ourState, world, blockpos)) {
                            world.setBlockState(blockpos, ourState);
                        }
                    } else if (dirt) {
                        if (checkFluidAndLight(ourState, world, blockpos)) {
                            world.setBlockState(blockpos, grassState);
                        }
                    }
                }
            }

        }
    }



    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable) {
        return true;
    }

    private static boolean checkFluidAndLight(BlockState state, IWorldReader worldReader, BlockPos pos) {
        BlockPos upPos = pos.up();
        return checkLight(state, worldReader, pos) && !worldReader.getFluidState(upPos).isTagged(FluidTags.WATER);
    }

    private static boolean checkLight(BlockState state, IWorldReader worldReader, BlockPos pos) {
        BlockPos upPos = pos.up();
        BlockState upState = worldReader.getBlockState(upPos);
        int lightLevel = LightEngine.func_215613_a(worldReader, state, pos, upState, upPos, Direction.UP, upState.getOpacity(worldReader, upPos));
        return lightLevel < worldReader.getMaxLightLevel();
    }


    @Override
    public boolean ticksRandomly(BlockState state) {
        return true;
    }

}









