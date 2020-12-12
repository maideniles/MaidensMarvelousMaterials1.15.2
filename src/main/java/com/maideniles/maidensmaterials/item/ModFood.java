package com.maideniles.maidensmaterials.item;


import com.google.common.collect.Lists;
import com.maideniles.maidensmaterials.init.ModItemGroups;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

public class ModFood {
    private final int value;
    private final float saturation;
    private final boolean meat;
    private final boolean canEatWhenFull;
    private final boolean fastToEat;
    private final List<Pair<EffectInstance, Float>> effects;

    public ModFood(int healing, float saturationIn, boolean isMeat, boolean alwaysEdible, boolean fastEdible, List<Pair<EffectInstance, Float>> effectsIn ) {
        this.value = healing;
        this.saturation = saturationIn;
        this.meat = isMeat;
        this.canEatWhenFull = alwaysEdible;
        this.fastToEat = fastEdible;
        this.effects = effectsIn;

    }

    public int getHealing() {
        return this.value;
    }

    public float getSaturation() {
        return this.saturation;
    }

    public boolean isMeat() {
        return this.meat;
    }

    public boolean canEatWhenFull() {
        return this.canEatWhenFull;
    }

    public boolean isFastEating() {
        return this.fastToEat;
    }

    public List<Pair<EffectInstance, Float>> getEffects() {
        return this.effects;
    }

    public static class Builder {
        private int value;
        private float saturation;
        private boolean meat;
        private boolean alwaysEdible;
        private boolean fastToEat;
        private final List<Pair<EffectInstance, Float>> effects = Lists.newArrayList();

        public Builder hunger(int hungerIn) {
            this.value = hungerIn;
            return this;
        }

        public Builder saturation(float saturationIn) {
            this.saturation = saturationIn;
            return this;
        }

        public Builder meat() {
            this.meat = true;
            return this;
        }

        public Builder setAlwaysEdible() {
            this.alwaysEdible = true;
            return this;
        }

        public Builder fastToEat() {
            this.fastToEat = true;
            return this;
        }

        public Builder effect(EffectInstance effectIn, float probability) {
            this.effects.add(Pair.of(effectIn, probability));
            return this;
        }

        public ModFood build() {
            return new ModFood(this.value, this.saturation, this.meat, this.alwaysEdible, this.fastToEat, this.effects);
        }
    }
}
