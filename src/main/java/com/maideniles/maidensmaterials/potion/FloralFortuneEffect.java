package com.maideniles.maidensmaterials.potion;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectType;
import net.minecraft.util.ResourceLocation;

public class FloralFortuneEffect extends Effect {
    public FloralFortuneEffect() {
        super(EffectType.BENEFICIAL, 7033103);
    }


    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 100 == 0;  // preform effect once every 5 seconds
    }


}