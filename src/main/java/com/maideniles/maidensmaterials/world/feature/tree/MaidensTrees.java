package com.maideniles.maidensmaterials.world.feature.tree;

import java.util.Random;

import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
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

        case ORANGE:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.POINCIANA_TREE.base : ModConfiguredFeatures.POINCIANA_TREE.vines;

        case YELLOW:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.LABURNUM_TREE.base : ModConfiguredFeatures.LABURNUM_TREE.vines;

        case GREEN:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.JADE_TREE.base : ModConfiguredFeatures.JADE_TREE.vines;

        case CYAN:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.PAULOWNIA_TREE.base : ModConfiguredFeatures.PAULOWNIA_TREE.vines;

        case BLUE:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.WISTERIA_TREE.base : ModConfiguredFeatures.WISTERIA_TREE.vines;

        case PURPLE:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.JACARANDA_TREE.base : ModConfiguredFeatures.JACARANDA_TREE.vines;

        case PINK:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.DOGWOOD_TREE.base : ModConfiguredFeatures.DOGWOOD_TREE.vines;

        case WHITE:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.SILVERBELL_TREE.base : ModConfiguredFeatures.SILVERBELL_TREE.vines;

        case CEDAR:
            return random.nextInt(6) == 0 ? ModConfiguredFeatures.CEDAR_TREE.base: ModConfiguredFeatures.CEDAR_TREE.vines ;



                /*    case PEAR:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case PEACH:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case PLUM:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case ORANGE_FRUIT:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case GRAPEFRUIT:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case LEMON:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case LIME:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
            case CHERRY:
                return random.nextInt(6) == 0 ? ModConfiguredFeatures.APPLE_TREE.base: ModConfiguredFeatures.APPLE_TREE.vines ;
*/


            case PALM:
            return ModConfiguredFeatures.PALM_TREE.base;
        default:
            return null;
        }
    }
    
}
