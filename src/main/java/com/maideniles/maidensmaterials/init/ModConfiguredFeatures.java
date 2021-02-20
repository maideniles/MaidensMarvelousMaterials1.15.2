package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeCategory;

// Heads Up: Configured features will need to be registered in 1.16
public class ModConfiguredFeatures {
    public static final MaidensTreeCategory CRABAPPLE_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.crabappleLog.get().getDefaultState(),
            ModBlocks.crabappleLeaves.get().getDefaultState(),
            5,
            9,
            7.1f,
            true,
            ModBlocks.crabappleSapling.get());

    public static final MaidensTreeCategory PALM_TREE = new MaidensTreeCategory(
            ModFeatures.PALM_TREE,
            ModBlocks.palmLog.get().getDefaultState(),
            ModBlocks.palmLeaves.get().getDefaultState(),
            5,
            9,
            0.5f,
            false,
            ModBlocks.palmSapling.get());
}
