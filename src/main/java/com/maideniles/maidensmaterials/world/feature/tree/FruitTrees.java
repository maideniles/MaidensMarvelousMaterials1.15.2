package com.maideniles.maidensmaterials.world.feature.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;

import javax.annotation.Nullable;
import java.util.Random;

public class FruitTrees extends Tree {

    public FruitTrees(MaidensTreeColor color) {
        this.color = color;
    }

    private final MaidensTreeColor color;

    TreeFeatureConfig APPLE_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingAppleLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.appleSapling.get()).build();

    TreeFeatureConfig PEAR_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingPearLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.pearSapling.get()).build();

    TreeFeatureConfig PEACH_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingPeachLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.peachSapling.get()).build();

    TreeFeatureConfig PLUM_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingPlumLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.plumSapling.get()).build();

    TreeFeatureConfig GRAPEFRUIT_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingGrapefruitLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.grapefruitSapling.get()).build();

    TreeFeatureConfig ORANGE_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingOrangeLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.orangeSapling.get()).build();

    TreeFeatureConfig LEMON_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingLemonLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.lemonSapling.get()).build();

    TreeFeatureConfig LIME_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingLimeLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.limeSapling.get()).build();

    TreeFeatureConfig CHERRY_TREE = new TreeFeatureConfig.Builder(
            new SimpleBlockStateProvider(ModBlocks.cedarLog.get().getDefaultState()),
            new SimpleBlockStateProvider(ModBlocks.growingCherryLeaves.get().getDefaultState()),
            new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(9 - 5)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling((net.minecraftforge.common.IPlantable) ModBlocks.cherrySapling.get()).build();


    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {

        switch (this.color) {
            case APPLE:
                return Feature.FANCY_TREE.withConfiguration(APPLE_TREE);
            case PEAR:
                return Feature.FANCY_TREE.withConfiguration(PEAR_TREE);
            case PEACH:
                return Feature.FANCY_TREE.withConfiguration(PEACH_TREE);
            case PLUM:
                return Feature.FANCY_TREE.withConfiguration(PLUM_TREE);
            case ORANGE_FRUIT:
                return Feature.FANCY_TREE.withConfiguration(ORANGE_TREE);
            case GRAPEFRUIT:
                return Feature.FANCY_TREE.withConfiguration(GRAPEFRUIT_TREE);
            case LEMON:
                return Feature.FANCY_TREE.withConfiguration(LEMON_TREE);
            case LIME:
                return Feature.FANCY_TREE.withConfiguration(LIME_TREE);

            case CHERRY:
                return Feature.FANCY_TREE.withConfiguration(CHERRY_TREE);
            default:
                return null; // TODO other trees
        }
    }
}