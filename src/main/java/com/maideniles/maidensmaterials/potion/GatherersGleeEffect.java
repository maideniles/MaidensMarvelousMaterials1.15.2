package com.maideniles.maidensmaterials.potion;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;

public class GatherersGleeEffect extends Effect {
    protected GatherersGleeEffect() {
        super(EffectType.BENEFICIAL, 7033103);

        //ADD BLOCKS TO ORE LIST//
        ModBlocks.validBlocks.add(Blocks.GLOWSTONE);
        ModBlocks.validBlocks.add(Blocks.COAL_ORE);
        ModBlocks.validBlocks.add(Blocks.IRON_ORE);
        ModBlocks.validBlocks.add(Blocks.GOLD_ORE);
        ModBlocks.validBlocks.add(Blocks.EMERALD_ORE);
        ModBlocks.validBlocks.add(Blocks.REDSTONE_ORE);
        ModBlocks.validBlocks.add(Blocks.LAPIS_ORE);
        ModBlocks.validBlocks.add(Blocks.DIAMOND_ORE);
        ModBlocks.validBlocks.add(Blocks.NETHER_QUARTZ_ORE);
        ModBlocks.validBlocks.add(ModBlocks.amethystOre.get());
        ModBlocks.validBlocks.add(ModBlocks.aventurineOre.get());
        ModBlocks.validBlocks.add(ModBlocks.carnelianOre.get());
        ModBlocks.validBlocks.add(ModBlocks.chalcopyriteOre.get());
        ModBlocks.validBlocks.add(ModBlocks.citrineOre.get());
        ModBlocks.validBlocks.add(ModBlocks.jadeOre.get());
        ModBlocks.validBlocks.add(ModBlocks.jasperOre.get());
        ModBlocks.validBlocks.add(ModBlocks.labradoriteOre.get());
        ModBlocks.validBlocks.add(ModBlocks.micaOre.get());
        ModBlocks.validBlocks.add(ModBlocks.moonstoneOre.get());
        ModBlocks.validBlocks.add(ModBlocks.roseQuartzOre.get());
        ModBlocks.validBlocks.add(ModBlocks.sodaliteOre.get());

        //ADD BLOCKS TO WOOD LIST//
        ModBlocks.validBlocks.add(Blocks.ACACIA_LOG);
        ModBlocks.validBlocks.add(Blocks.BIRCH_LOG);
        ModBlocks.validBlocks.add(Blocks.OAK_LOG);
        ModBlocks.validBlocks.add(Blocks.DARK_OAK_LOG);
        ModBlocks.validBlocks.add(Blocks.SPRUCE_LOG);
        ModBlocks.validBlocks.add(Blocks.JUNGLE_LOG);
        ModBlocks.validBlocks.add(ModBlocks.cedarLog.get());
        ModBlocks.validBlocks.add(ModBlocks.crabappleLog.get());
        ModBlocks.validBlocks.add(ModBlocks.poincianaLog.get());
        ModBlocks.validBlocks.add(ModBlocks.laburnumLog.get());
        ModBlocks.validBlocks.add(ModBlocks.jadeLog.get());
        ModBlocks.validBlocks.add(ModBlocks.paulowniaLog.get());
        ModBlocks.validBlocks.add(ModBlocks.wisteriaLog.get());
        ModBlocks.validBlocks.add(ModBlocks.jacarandaLog.get());
        ModBlocks.validBlocks.add(ModBlocks.dogwoodLog.get());
        ModBlocks.validBlocks.add(ModBlocks.silverbellLog.get());

    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 100 == 0;  // preform effect once every 5 seconds
    }
}
