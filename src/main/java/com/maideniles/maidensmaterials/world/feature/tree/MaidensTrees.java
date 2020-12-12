package com.maideniles.maidensmaterials.world.feature.tree;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;

import net.minecraft.block.Blocks;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.JungleTreeFeature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class MaidensTrees extends Tree {
    private MaidensTreeColor color;

    public MaidensTrees(MaidensTreeColor colorIn) {
        color = colorIn;

        }


    @Nullable
    protected AbstractTreeFeature<NoFeatureConfig> getTreeFeature(Random random) {

        switch (color) {
            case RED:

                 return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.crabappleLog.get().getDefaultState(), ModBlocks.crabappleLeaves.get().getDefaultState(), ModBlocks.crabappleVine.get().getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.crabappleLog.get().getDefaultState(), ModBlocks.crabappleLeaves.get().getDefaultState()));

            case ORANGE:

                return  (random.nextInt(3) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.poincianaLog.get().getDefaultState(), ModBlocks.poincianaLeaves.get().getDefaultState(), ModBlocks.poincianaVine.get().getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.poincianaLog.get().getDefaultState(), ModBlocks.poincianaLeaves.get().getDefaultState()));

            case YELLOW: return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.laburnumLog.get().getDefaultState(), ModBlocks.laburnumLeaves.get().getDefaultState(), ModBlocks.laburnumVine.get().getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.laburnumLog.get().getDefaultState(), ModBlocks.laburnumLeaves.get().getDefaultState()));

            case GREEN:

                return  (random.nextInt(5) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jadeLog.get().getDefaultState(), ModBlocks.jadeLeaves.get().getDefaultState(), ModBlocks.jadeVine.get().getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jadeLog.get().getDefaultState(), ModBlocks.jadeLeaves.get().getDefaultState()));

            case TEAL: return  (random.nextInt(5) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.paulowniaLog.get().getDefaultState(), ModBlocks.paulowniaLeaves.get().getDefaultState(), ModBlocks.paulowniaVine.get().getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.paulowniaLog.get().getDefaultState(), ModBlocks.paulowniaLeaves.get().getDefaultState()));


            case BLUE: return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.wisteriaLog.get().getDefaultState(), ModBlocks.wisteriaLeaves.get().getDefaultState(), ModBlocks.wisteriaVine.get().getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.wisteriaLog.get().getDefaultState(), ModBlocks.wisteriaLeaves.get().getDefaultState()));


            case PURPLE:

                return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jacarandaLog.get().getDefaultState(), ModBlocks.jacarandaLeaves.get().getDefaultState(), ModBlocks.jacarandaVine.get().getDefaultState(), true)):
                        new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.jacarandaLog.get().getDefaultState(), ModBlocks.jacarandaLeaves.get().getDefaultState()));


            case PINK:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.dogwoodLog.get().getDefaultState(), ModBlocks.dogwoodLeaves.get().getDefaultState(), ModBlocks.dogwoodVine.get().getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.dogwoodLog.get().getDefaultState(), ModBlocks.dogwoodLeaves.get().getDefaultState()));


            case WHITE:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeatureVines(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.silverbellLog.get().getDefaultState(), ModBlocks.silverbellLeaves.get().getDefaultState(), ModBlocks.silverbellVine.get().getDefaultState(), true)):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.silverbellLog.get().getDefaultState(), ModBlocks.silverbellLeaves.get().getDefaultState()));

            case CEDAR:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.cedarLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.cedarLeaves.get().getDefaultState()));

            case APPLE:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.appleLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.appleLeaves.get().getDefaultState()));


            case GRAPEFRUIT:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.grapefruitLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.grapefruitLeaves.get().getDefaultState()));

            case ORANGE_FRUIT:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.orangeLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.orangeLeaves.get().getDefaultState()));

            case LEMON:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.lemonLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.lemonLeaves.get().getDefaultState()));

            case LIME:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.limeLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.limeLeaves.get().getDefaultState()));

            case PEACH:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.peachLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.peachLeaves.get().getDefaultState()));

            case PEAR:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.pearLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.pearLeaves.get().getDefaultState()));

            case PLUM:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.plumLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.plumLeaves.get().getDefaultState()));

            case CHERRY:  return  (random.nextInt(6) == 0 ? (new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.cherryLeaves.get().getDefaultState())):
                    new MaidensTreeFeature(NoFeatureConfig::deserialize, true, 4, false, ModBlocks.cedarLog.get().getDefaultState(), ModBlocks.cherryLeaves.get().getDefaultState()));

            case PALM:  return  (random.nextInt(6) == 0 ? (new PalmTreeFeature1(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.palmLog.get().getDefaultState(), ModBlocks.palmLeaves.get().getDefaultState())):
                    new PalmTreeFeature1(NoFeatureConfig::deserialize, true, 4, true, ModBlocks.palmLog.get().getDefaultState(), ModBlocks.palmLeaves.get().getDefaultState()));


        }

        return getTreeFeature(random);
    }
}