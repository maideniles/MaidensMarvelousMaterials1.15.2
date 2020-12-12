package com.maideniles.maidensmaterials.block.tree;

import com.maideniles.maidensmaterials.world.feature.MaidensFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class CrabappleTree extends Tree
{
    @Nullable
    @Override
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random)
    {
        return (AbstractTreeFeature<NoFeatureConfig>)(random.nextInt(10) == 0 ? MaidensFeatures.CRABAPPLE_TREE_VINES : MaidensFeatures.CRABAPPLE_TREE);
    }
}