package com.maideniles.maidensmaterials.util;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.block.ComposterBlock;
import net.minecraft.util.IItemProvider;

public class CompostingUtil {

    public static void setup(){

        registerCompostable(0.5F, ModBlocks.fairyGlowCup.get());
        registerCompostable(0.5F, ModBlocks.ornamentalMushroom.get());

        registerCompostable(0.5F, ModBlocks.crabappleVine.get());
        registerCompostable(0.5F, ModBlocks.poincianaVine.get());
        registerCompostable(0.5F, ModBlocks.laburnumVine.get());
        registerCompostable(0.5F, ModBlocks.jadeVine.get());
        registerCompostable(0.5F, ModBlocks.paulowniaVine.get());
        registerCompostable(0.5F, ModBlocks.wisteriaVine.get());
        registerCompostable(0.5F, ModBlocks.jacarandaVine.get());
        registerCompostable(0.5F, ModBlocks.dogwoodVine.get());
        registerCompostable(0.5F, ModBlocks.silverbellVine.get());
        registerCompostable(0.5F, ModBlocks.cedarVine.get());

        registerCompostable(0.5F, ModBlocks.crabappleSapling.get());
        registerCompostable(0.5F, ModBlocks.poincianaSapling.get());
        registerCompostable(0.5F, ModBlocks.laburnumSapling.get());
        registerCompostable(0.5F, ModBlocks.jadeSapling.get());
        registerCompostable(0.5F, ModBlocks.paulowniaSapling.get());
        registerCompostable(0.5F, ModBlocks.wisteriaSapling.get());
        registerCompostable(0.5F, ModBlocks.jacarandaSapling.get());
        registerCompostable(0.5F, ModBlocks.dogwoodSapling.get());
        registerCompostable(0.5F, ModBlocks.silverbellSapling.get());
        registerCompostable(0.5F, ModBlocks.cedarSapling.get());
        registerCompostable(0.5F, ModBlocks.palmSapling.get());

        registerCompostable(0.5F, ModBlocks.appleSapling.get());
        registerCompostable(0.5F, ModBlocks.pearSapling.get());
        registerCompostable(0.5F, ModBlocks.peachSapling.get());
        registerCompostable(0.5F, ModBlocks.plumSapling.get());
        registerCompostable(0.5F, ModBlocks.orangeSapling.get());
        registerCompostable(0.5F, ModBlocks.grapefruitSapling.get());
        registerCompostable(0.5F, ModBlocks.lemonSapling.get());
        registerCompostable(0.5F, ModBlocks.limeSapling.get());
        registerCompostable(0.5F, ModBlocks.cherrySapling.get());

        registerCompostable(0.5F, ModBlocks.crabappleLeaves.get());
        registerCompostable(0.5F, ModBlocks.poincianaLeaves.get());
        registerCompostable(0.5F, ModBlocks.laburnumLeaves.get());
        registerCompostable(0.5F, ModBlocks.jadeLeaves.get());
        registerCompostable(0.5F, ModBlocks.paulowniaLeaves.get());
        registerCompostable(0.5F, ModBlocks.wisteriaLeaves.get());
        registerCompostable(0.5F, ModBlocks.jacarandaLeaves.get());
        registerCompostable(0.5F, ModBlocks.dogwoodLeaves.get());
        registerCompostable(0.5F, ModBlocks.silverbellLeaves.get());
        registerCompostable(0.5F, ModBlocks.cedarLeaves.get());
        registerCompostable(0.5F, ModBlocks.palmLeaves.get());

        registerCompostable(0.5F, ModBlocks.growingAppleLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingPearLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingPeachLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingPlumLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingOrangeLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingGrapefruitLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingLemonLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingLimeLeaves.get());
        registerCompostable(0.5F, ModBlocks.growingCherryLeaves.get());

        registerCompostable(0.5F, ModItems.CRABAPPLE_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.POINCIANA_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.LABURNUM_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.JADE_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.PAULOWNIA_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.WISTERIA_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.JACARANDA_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.DOGWOOD_BLOSSOMS.get());
        registerCompostable(0.5F, ModItems.SILVERBELL_BLOSSOMS.get());

        registerCompostable(0.5F, ModItems.PEAR.get());
        registerCompostable(0.5F, ModItems.PEACH.get());
        registerCompostable(0.5F, ModItems.PLUM.get());
        registerCompostable(0.5F, ModItems.ORANGE.get());
        registerCompostable(0.5F, ModItems.GRAPEFRUIT.get());
        registerCompostable(0.5F, ModItems.LEMON.get());
        registerCompostable(0.5F, ModItems.LIME.get());
        registerCompostable(0.5F, ModItems.CHERRIES.get());
        registerCompostable(0.5F, ModItems.COCONUT.get());

        registerCompostable(1.0F, ModItems.FLORAL_ESSENCE.get());
        registerCompostable(1.0F, ModItems.EARTHEN_ESSENCE.get());

    }

    public static void registerCompostable(float chance, IItemProvider itemIn) {
        ComposterBlock.CHANCES.put(itemIn.asItem(), chance);
    }
}
