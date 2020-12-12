package com.maideniles.maidensmaterials.world.feature.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.mojang.datafixers.Dynamic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CocoaBlock;
import net.minecraft.block.material.Material;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.gen.IWorldGenerationBaseReader;
import net.minecraft.world.gen.IWorldGenerationReader;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.Set;
import java.util.function.Function;




public class PalmTreeFeature2 extends AbstractTreeFeature<NoFeatureConfig> {
    private static final BlockState DEFAULT_TRUNK = Blocks.OAK_LOG.getDefaultState();
    private static final BlockState DEFAULT_LEAF = Blocks.OAK_LEAVES.getDefaultState();
    private final boolean useExtraRandomHeight;
    private final BlockState trunk;
    private final BlockState leaf;

    public PalmTreeFeature2(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, boolean doBlockNotifyOnPlace, boolean extraRandomHeightIn) {
        this(configFactoryIn, doBlockNotifyOnPlace, 4, true, DEFAULT_TRUNK,  DEFAULT_LEAF);
    }

    public PalmTreeFeature2(Function<Dynamic<?>, ? extends NoFeatureConfig> configFactoryIn, boolean doBlockNotifyOnPlace, int minTreeHeightIn, boolean extraRandomHeightIn, BlockState trunkState, BlockState leafState) {
        super(configFactoryIn, doBlockNotifyOnPlace);

        this.trunk = trunkState;
        this.leaf = leafState;

        this.useExtraRandomHeight = extraRandomHeightIn;

    }

    @Override
    protected boolean place(Set<BlockPos> changedBlocks, IWorldGenerationReader worldIn, Random rand, BlockPos pos, MutableBoundingBox p_208519_5_) {

        //Change k, i, or j to offset the structure
        int k = 0;
        int i = 0;
        int j = 0;
        this.setBlockState(worldIn, pos.add(i + 0, j + 0, k + 0), Blocks.DIRT.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 1, j + 9, k + 1), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 1, j + 10, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 2, j + 7, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 2, j + 10, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 2, j + 10, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 2, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 2, j + 12, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 2, j + 12, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 7, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 8, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 8, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 8, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 9, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 9, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 9, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 10, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 3, j + 11, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 3, j + 12, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 3, j + 12, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());


        this.setBlockState(worldIn, pos.add(i + 4, j + 9, k + 1), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 9, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 10, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 4, j + 10, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 4, j + 10, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 11, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 4, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 12, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 12, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 4, j + 12, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 7, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 8, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 8, k + 5), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 9, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 9, k + 5), Blocks.JUNGLE_LOG.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 9, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 9, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 10, k + 1), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 10, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 10, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 10, k + 5), Blocks.JUNGLE_LOG.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 10, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 11, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 11, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 11, k + 5), Blocks.JUNGLE_LOG.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 11, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 11, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 12, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 13, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 14, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 5, j + 14, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 5, j + 14, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 6, k + 6), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 6, k + 9), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 7, k + 6), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 7, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 8, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 8, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 9, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 9, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 10, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 10, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 10, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 10, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 11, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 11, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 11, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 12, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 12, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 6, j + 12, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 13, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 6, j + 14, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 4, k + 7), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 5, k + 7), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 8, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 9, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 9, k + 6), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 11, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 11, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 12, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 7, j + 13, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 3, k + 8), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 7, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 7, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 8, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 9, k + 1), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 10, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 10, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 10, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 11, k + 2), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 11, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 11, k + 8), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 13, k + 4), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 8, j + 13, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 2, k + 9), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 6, k + 3), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 6, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 9, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 9, k + 9), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 10, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 9, j + 12, k + 7), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 10, j + 1, k + 10), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 10, j + 8, k + 5), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 11, j + 0, k + 12), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 11, j + 1, k + 11), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 11, j + 4, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 11, j + 5, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 0, k + 12), Blocks.JUNGLE_LOG.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 12, j + 0, k + 13), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 1, k + 12), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 2, k + 12), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 3, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 4, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 5, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 6, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 12, j + 7, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 13, j + 3, k + 12), Blocks.JUNGLE_LOG.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 13, j + 4, k + 12), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 13, j + 4, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 13, j + 4, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 13, j + 5, k + 12), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 13, j + 6, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 2, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 2, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 3, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 3, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 4, k + 12), Blocks.JUNGLE_LEAVES.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 14, j + 4, k + 13), Blocks.JUNGLE_LOG.getDefaultState());
        this.setBlockState(worldIn, pos.add(i + 14, j + 4, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 4, k + 16), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 5, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 5, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 6, k + 10), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 6, k + 12), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 6, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 14, j + 7, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 15, j + 4, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 15, j + 5, k + 12), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 15, j + 5, k + 14), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 15, j + 6, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 15, j + 7, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 3, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 3, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 4, k + 11), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 4, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 6, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 16, j + 6, k + 15), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 17, j + 5, k + 13), Blocks.JUNGLE_LEAVES.getDefaultState());

        this.setBlockState(worldIn, pos.add(i + 18, j + 15, k + 17), Blocks.DIRT.getDefaultState());
        return true;

    }

    protected static boolean isAir(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        if (!(worldIn instanceof net.minecraft.world.IBlockReader)) // FORGE: Redirect to state method when possible
            return worldIn.hasBlockState(pos, BlockState::isAir);
        else return worldIn.hasBlockState(pos, state -> state.isAir((net.minecraft.world.IBlockReader)worldIn, pos));
    }

    protected static boolean isDirt(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (p_214590_0_) -> {
            return Block.isDirt(p_214590_0_.getBlock());
        });
    }

    protected static boolean isWater(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (p_214583_0_) -> {
            return p_214583_0_.getBlock() == Blocks.WATER;
        });
    }

    protected static boolean isLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (p_214579_0_) -> {
            return p_214579_0_.isIn(BlockTags.LEAVES);
        });
    }

    protected static boolean isAirOrLeaves(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        if (!(worldIn instanceof net.minecraft.world.IWorldReader)) // FORGE: Redirect to state method when possible
            return worldIn.hasBlockState(pos, (p_214581_0_) -> {
                return p_214581_0_.isAir() || p_214581_0_.isIn(BlockTags.LEAVES);
            });
        else return worldIn.hasBlockState(pos, state -> state.canBeReplacedByLeaves((net.minecraft.world.IWorldReader)worldIn, pos));
    }

    @Deprecated //Forge: moved to isSoil
    protected static boolean isDirtOrGrassBlock(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (p_214582_0_) -> {
            Block block = p_214582_0_.getBlock();
            return Block.isDirt(block) || block == Blocks.GRASS_BLOCK
                    || block == ModBlocks.ornamentalGrass.get() || block == ModBlocks.sparklingSand.get();
        });
    }

    protected static boolean isSoil(IWorldGenerationBaseReader reader, BlockPos pos, net.minecraftforge.common.IPlantable sapling) {
        if (!(reader instanceof net.minecraft.world.IBlockReader) || sapling == null)
            return isDirtOrGrassBlock(reader, pos);
        return reader.hasBlockState(pos, state -> state.canSustainPlant((net.minecraft.world.IBlockReader)reader, pos, Direction.UP, sapling));
    }

    @Deprecated //Forge: moved to isSoilOrFarm
    protected static boolean isDirtOrGrassBlockOrFarmland(IWorldGenerationBaseReader worldIn, BlockPos pos) {
        return worldIn.hasBlockState(pos, (p_214586_0_) -> {
            Block block = p_214586_0_.getBlock();
            return Block.isDirt(block) || block == Blocks.GRASS_BLOCK || block == Blocks.FARMLAND
                    || block == ModBlocks.ornamentalGrass.get() || block == ModBlocks.sparklingSand.get();
        });
    }

    protected static boolean isSoilOrFarm(IWorldGenerationBaseReader reader, BlockPos pos, net.minecraftforge.common.IPlantable sapling) {
        if (!(reader instanceof net.minecraft.world.IBlockReader) || sapling == null)
            return isDirtOrGrassBlockOrFarmland(reader, pos);
        return reader.hasBlockState(pos, state -> state.canSustainPlant((net.minecraft.world.IBlockReader)reader, pos, Direction.UP, sapling));
    }

    protected static boolean func_214576_j(IWorldGenerationBaseReader p_214576_0_, BlockPos p_214576_1_) {
        return p_214576_0_.hasBlockState(p_214576_1_, (p_214588_0_) -> {
            Material material = p_214588_0_.getMaterial();
            return material == Material.TALL_PLANTS;
        });
    }

    @Deprecated //Forge: moved to setDirtAt
    protected void func_214584_a(IWorldGenerationReader p_214584_1_, BlockPos p_214584_2_) {
        if (!isDirt(p_214584_1_, p_214584_2_)) {
            this.setBlockState(p_214584_1_, p_214584_2_, Blocks.DIRT.getDefaultState());
        }


    }

    private void placeCocoa(IWorldGenerationReader worldIn, int age, BlockPos pos, Direction side) {
        this.setBlockState(worldIn, pos, ModBlocks.fairyGlowCup.get().getDefaultState().with(CocoaBlock.AGE, Integer.valueOf(age)).with(CocoaBlock.HORIZONTAL_FACING, side));
    }
}
