package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.world.feature.tree.MaidensTreeFeature;
import com.maideniles.maidensmaterials.world.feature.tree.PalmTreeFeature;

import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.CrabappleTrunkVineTreeDecorator;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;

public class ModFeatures {
    public static final Feature<TreeFeatureConfig> MAIDENS_TREE = new MaidensTreeFeature();
    public static final Feature<TreeFeatureConfig> PALM_TREE = new PalmTreeFeature();





    public static void registerFeatures(IForgeRegistry<Feature<?>> features) {
        features.register(MAIDENS_TREE.setRegistryName("maidens_tree"));
        features.register(PALM_TREE.setRegistryName("palm_tree"));










    }


}
