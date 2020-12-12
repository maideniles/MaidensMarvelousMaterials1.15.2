package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.config.ConfigBuilder;
import com.maideniles.maidensmaterials.world.biomes.*;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.surfacebuilders.*;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {

    public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES,
            MarvelousMaterials.MODID);

    public static final RegistryObject<Biome> ORNAMENTALFOREST_BIOME = BIOMES
            .register("ornamentalforest_biome",
                    () -> new BiomeOrnamentalForest(
                            new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(0.05F).temperature(0.8F)
                                    .waterColor(4159204).waterFogColor(329011)
                                    .surfaceBuilder(
                                            new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
                                                    register("ornamental_surface",
                                                            new BiomeOrnamentalForestSurfaceBuilder(
                                                                    SurfaceBuilderConfig::deserialize)),
                                                    new SurfaceBuilderConfig(Blocks.COARSE_DIRT.getDefaultState(),
                                                            Blocks.DIRT.getDefaultState(),
                                                            Blocks.DIRT.getDefaultState())))
                                    .category(Biome.Category.PLAINS).downfall(0.4F).depth(0.125F).parent(null)));

    public static final RegistryObject<Biome> OASISSHORE_BIOME = BIOMES
            .register("oasisshore_biome",
                    () -> new BiomeOasisShore(
                            new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(0.1F).temperature(0.8F)
                                    .waterColor(4445678).waterFogColor(270131)
                                    .surfaceBuilder(
                                            new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
                                                    register("oasis_surface",
                                                            new BiomeOasisShoreSurfaceBuilder(
                                                                    SurfaceBuilderConfig::deserialize)),
                                                    new SurfaceBuilderConfig(Blocks.SAND.getDefaultState(),
                                                            Blocks.SAND.getDefaultState(),
                                                            Blocks.SAND.getDefaultState())))
                                    .category(Biome.Category.BEACH).downfall(0.4f).depth(0.0f).parent(Biomes.WARM_OCEAN.getParent()))); //Experimental

    public static final RegistryObject<Biome> ORNAMENTAL_ORCHARD_BIOME = BIOMES
            .register("ornamentalorchard_biome",
                    () -> new BiomeOrnamentalOrchard(
                            new Biome.Builder().precipitation(Biome.RainType.RAIN).scale(0.01F).temperature(1.5F)
                                    .waterColor(4159204).waterFogColor(329011)
                                    .surfaceBuilder(
                                            new ConfiguredSurfaceBuilder<SurfaceBuilderConfig>(
                                                    register("ornamental_orchard_surface",
                                                            new BiomeOrnamentalOrchardSurfaceBuilder(
                                                                    SurfaceBuilderConfig::deserialize)),
                                                    new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
                                                            Blocks.GRASS.getDefaultState(),
                                                            Blocks.GRASS.getDefaultState())))
                                    .category(Biome.Category.PLAINS).downfall(0.4f).depth(0.00125F).parent(Biomes.PLAINS.getParent()))); //Experimental


    public static void registerBiomes() {

        registerBiome(ORNAMENTALFOREST_BIOME.get(), Type.PLAINS, Type.OVERWORLD);
        registerBiome(OASISSHORE_BIOME.get(), Type.BEACH, Type.OVERWORLD);
        registerBiome(ORNAMENTAL_ORCHARD_BIOME.get(), Type.PLAINS, Type.OVERWORLD);
    }

    private static void registerBiome(Biome biome, Type... types) {
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(ORNAMENTALFOREST_BIOME.get(), ConfigBuilder.ornamental_forest_biome_chances.get()));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(OASISSHORE_BIOME.get(), ConfigBuilder.oasis_shore_biome_chances.get()));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(ORNAMENTAL_ORCHARD_BIOME.get(), ConfigBuilder.ornamental_orchard_biome_chances.get()));
        BiomeDictionary.addTypes(biome, types);
        BiomeManager.addSpawnBiome(biome);
    }

    @SuppressWarnings("deprecation")
    private static <C extends ISurfaceBuilderConfig, F extends SurfaceBuilder<C>> F register(String key, F builderIn) {
        return (F) (Registry.<SurfaceBuilder<?>>register(Registry.SURFACE_BUILDER, key, builderIn));
    }
}