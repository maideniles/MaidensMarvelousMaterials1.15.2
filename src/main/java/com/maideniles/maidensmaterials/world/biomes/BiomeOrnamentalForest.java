package com.maideniles.maidensmaterials.world.biomes;

import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmaterials.init.ModConfiguredFeatures;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.MultipleWithChanceRandomFeatureConfig;
import net.minecraft.world.gen.feature.ProbabilityConfig;
import net.minecraft.world.gen.feature.structure.MineshaftConfig;
import net.minecraft.world.gen.feature.structure.MineshaftStructure;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class BiomeOrnamentalForest extends Biome {

    public BiomeOrnamentalForest(Builder biomeBuilder) {
        super(biomeBuilder);
        this.addSpawn(EntityClassification.MONSTER, new SpawnListEntry(EntityType.ZOMBIE, 10, 2, 5));
        this.addSpawn(EntityClassification.CREATURE, new SpawnListEntry(EntityType.SKELETON, 20, 2, 10));
        this.addCarver(GenerationStage.Carving.AIR,
                Biome.createCarver(WorldCarver.CAVE, new ProbabilityConfig(0.14285715F)));
        this.addStructure(Feature.MINESHAFT.withConfiguration(new MineshaftConfig(0.004D, MineshaftStructure.Type.NORMAL)));




        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.BLUE_ORCHID_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(20))));

        DefaultBiomeFeatures.addMushrooms(this);
        DefaultBiomeFeatures.addDefaultFlowers(this);
        DefaultBiomeFeatures.addExtraDefaultFlowers(this);

        DefaultBiomeFeatures.addDoubleFlowers(this);
        DefaultBiomeFeatures.addSparseGrass(this);


        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.FOREST_FLOWER_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(70))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_RANDOM_SELECTOR.withConfiguration(new MultipleWithChanceRandomFeatureConfig(ImmutableList.of(Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.LILAC_CONFIG), Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.ROSE_BUSH_CONFIG), Feature.RANDOM_PATCH.withConfiguration(DefaultBiomeFeatures.PEONY_CONFIG), Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.LILY_OF_THE_VALLEY_CONFIG)), 3)).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(4))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(DefaultBiomeFeatures.BLUE_ORCHID_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(50))));
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.FLOWER.withConfiguration(ModConfiguredFeatures.ORNAMENTAL_MUSHROOM_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_32.configure(new FrequencyConfig(75))));


        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.CRABAPPLE_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.POINCIANA_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.LABURNUM_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.JADE_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.PAULOWNIA_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.WISTERIA_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.JACARANDA_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.DOGWOOD_TREE.worldgen);
        this.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, ModConfiguredFeatures.CEDAR_TREE.worldgen);

        DefaultBiomeFeatures.addOres(this);

        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.RABBIT, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PARROT, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.FOX, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PIG, 12, 4, 4));
        this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.CHICKEN, 12, 4, 4));


    }


    @Override
    @OnlyIn(Dist.CLIENT)
    public int getGrassColor(double posX, double posZ) {
        return 0x1A937;
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public int getFoliageColor() {
        return 0x1A937;
    }
}