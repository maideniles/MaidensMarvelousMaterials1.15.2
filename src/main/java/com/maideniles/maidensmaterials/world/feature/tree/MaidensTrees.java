package com.maideniles.maidensmaterials.world.feature.tree;

import java.util.Random;

import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

public class MaidensTrees extends Tree {
    public MaidensTrees(MaidensTreeColor color) {
        this.color = color;
    }
    
    private final MaidensTreeColor color;

    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean var2) {
        switch (this.color) {
        case RED:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.CRABAPPLE_TREE.base : ModConfiguredFeatures.CRABAPPLE_TREE.vines;
        case PALM:
            return ModConfiguredFeatures.PALM_TREE.base;
        default:
            return null; // TODO other trees
        }
    }
    
}
