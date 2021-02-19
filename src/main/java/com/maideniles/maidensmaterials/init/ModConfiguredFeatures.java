package com.maideniles.maidensmaterials.init;

import com.google.common.collect.ImmutableList;

import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TrunkVineTreeDecorator;

// Heads Up: Worldgen configured features will need to be registered in 1.16
public class ModConfiguredFeatures {
    public static final ConfiguredFeature<TreeFeatureConfig, ?> CRABAPPLE_TREE = ModFeatures.MAIDENS_TREE.withConfiguration(
            new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.crabappleLog.get().getDefaultState()),
                    new SimpleBlockStateProvider(ModBlocks.crabappleLeaves.get().getDefaultState()),
                    new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(4)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling(ModBlocks.crabappleSapling.get())
            .build());

    public static final ConfiguredFeature<TreeFeatureConfig, ?> CRABAPPLE_TREE_VINES = ModFeatures.MAIDENS_TREE.withConfiguration(
            new TreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(ModBlocks.crabappleLog.get().getDefaultState()),
                    new SimpleBlockStateProvider(ModBlocks.crabappleLeaves.get().getDefaultState()),
                    new BlobFoliagePlacer(2, 0))
            .baseHeight(5)
            .heightRandA(4)
            .foliageHeight(3)
            .ignoreVines()
            .setSapling(ModBlocks.crabappleSapling.get())
            .decorators(ImmutableList.of(new TrunkVineTreeDecorator(), new LeaveVineTreeDecorator()))
            .build());

    public static final ConfiguredFeature<?, ?> CRABAPPLE_TREE_WORLDGEN = CRABAPPLE_TREE.withPlacement(
            Placement.COUNT_EXTRA_HEIGHTMAP.configure(new AtSurfaceWithExtraConfig(7,
                    0.1f, 1)));
}
