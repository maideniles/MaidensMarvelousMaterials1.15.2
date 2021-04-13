package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeCategory;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

// Heads Up: Configured features will need to be registered in 1.16
public class ModConfiguredFeatures {

    private static final BlockState mushroom = ModBlocks.ornamentalMushroom.get().getDefaultState();

    public static final MaidensTreeCategory CRABAPPLE_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.crabappleLog.get().getDefaultState(),
            ModBlocks.crabappleLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.crabappleSapling.get());

    public static final MaidensTreeCategory POINCIANA_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.poincianaLog.get().getDefaultState(),
            ModBlocks.poincianaLeaves.get().getDefaultState(),
            8,
    15,
    7.1f,
    true,
    ModBlocks.poincianaSapling.get());

    public static final MaidensTreeCategory LABURNUM_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.laburnumLog.get().getDefaultState(),
            ModBlocks.laburnumLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.laburnumSapling.get());

    public static final MaidensTreeCategory JADE_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.jadeLog.get().getDefaultState(),
            ModBlocks.jadeLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.jadeSapling.get());

    public static final MaidensTreeCategory PAULOWNIA_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.paulowniaLog.get().getDefaultState(),
            ModBlocks.paulowniaLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.paulowniaSapling.get());

    public static final MaidensTreeCategory WISTERIA_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.wisteriaLog.get().getDefaultState(),
            ModBlocks.wisteriaLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.wisteriaSapling.get());

    public static final MaidensTreeCategory JACARANDA_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.jacarandaLog.get().getDefaultState(),
            ModBlocks.jacarandaLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.jacarandaSapling.get());

    public static final MaidensTreeCategory DOGWOOD_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.dogwoodLog.get().getDefaultState(),
            ModBlocks.dogwoodLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.dogwoodSapling.get());

    public static final MaidensTreeCategory SILVERBELL_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.silverbellLog.get().getDefaultState(),
            ModBlocks.silverbellLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            true,
            ModBlocks.silverbellSapling.get());

    public static final MaidensTreeCategory CEDAR_TREE = new MaidensTreeCategory(
            ModFeatures.MAIDENS_TREE,
            ModBlocks.cedarLog.get().getDefaultState(),
            ModBlocks.cedarLeaves.get().getDefaultState(),
            8,
            15,
            7.1f,
            false,
            ModBlocks.cedarSapling.get());




    public static final MaidensTreeCategory PALM_TREE = new MaidensTreeCategory(
            ModFeatures.PALM_TREE,
            ModBlocks.palmLog.get().getDefaultState(),
            ModBlocks.palmLeaves.get().getDefaultState(),
            5,
            9,
            0.5f,
            false,
            ModBlocks.palmSapling.get());

    public static final BlockClusterFeatureConfig ORNAMENTAL_MUSHROOM_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(mushroom), new SimpleBlockPlacer())).tries(64).build();
}
