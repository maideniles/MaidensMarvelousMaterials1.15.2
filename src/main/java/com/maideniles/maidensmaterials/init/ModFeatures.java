package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.world.feature.tree.CrabappleTreeFeature;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.AbstractTreeFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFeatures {

    public static final Feature<NoFeatureConfig> CRABAPPLE_TREE = new CrabappleTreeFeature(NoFeatureConfig::deserialize);

    @SubscribeEvent
    public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
        if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
            return;
        registerGen(CRABAPPLE_TREE, "crabapple_tree");

    }

    public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
        // unused
    }

    public static Feature<?> registerGen(Feature<?> feature, String name) {
        feature.setRegistryName(new ResourceLocation(MarvelousMaterials.MODID, name));
        ForgeRegistries.FEATURES.register(feature);

        return feature;
    }
}
