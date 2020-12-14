package com.maideniles.maidensmaterials.world.gen;

import com.maideniles.maidensmaterials.config.ConfigBuilder;
import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGen {


    public static void setupOreGen()
    {
        //Aventurine
        ConfiguredPlacement configAventurine = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.aventurine_chance.get(), 5, 5, 25));
        ConfiguredPlacement configAventurineNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.aventurine_nether_chance.get(), 5, 5, 25));

        //Carnelian
        ConfiguredPlacement configCarnelian = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.carnelian_chance.get(), 5, 5, 25));
        ConfiguredPlacement configCarnelianNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.carnelian_nether_chance.get(), 5, 5, 25));

        //Chalcopyrite
        ConfiguredPlacement configChalcopyrite = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.chalcopyrite_chance.get(), 5, 5, 25));
        ConfiguredPlacement configChalcopyriteNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.chalcopyrite_nether_chance.get(), 5, 5, 25));

        //Citrine
        ConfiguredPlacement configCitrine = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.citrine_chance.get(), 5, 5, 25));
        ConfiguredPlacement configCitrineNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.citrine_nether_chance.get(), 5, 5, 25));

        //Jade
        ConfiguredPlacement configJade = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.jade_chance.get(), 5, 5, 25));
        ConfiguredPlacement configJadeNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.jade_nether_chance.get(), 5, 5, 25));

        //Jasper
        ConfiguredPlacement configJasper = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.jasper_chance.get(), 5, 5, 25));
        ConfiguredPlacement configJasperNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.jasper_nether_chance.get(), 5, 5, 25));

        //Labradorite
        ConfiguredPlacement configLabradorite = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.labradorite_chance.get(), 5, 5, 25));
        ConfiguredPlacement configLabradoriteNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.labradorite_nether_chance.get(), 5, 5, 25));

        //Mica
        ConfiguredPlacement configMica = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.mica_chance.get(), 5, 5, 25));
        ConfiguredPlacement configMicaNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.mica_nether_chance.get(), 5, 5, 25));

        //Moonstone
        ConfiguredPlacement configMoonstone = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.moonstone_chance.get(), 5, 5, 25));
        ConfiguredPlacement configMoonstoneNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.moonstone_nether_chance.get(), 5, 5, 25));

        //Moonstone
        ConfiguredPlacement configRoseQuartz = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.rosequartz_chance.get(), 5, 5, 25));
        ConfiguredPlacement configRoseQuartzNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.rosequartz_nether_chance.get(), 5, 5, 25));

        //Soladite
        ConfiguredPlacement configSodalite = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.sodalite_chance.get(), 5, 5, 25));
        ConfiguredPlacement configSodaliteNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.sodalite_nether_chance.get(), 5, 5, 25));

        //Soladite
        ConfiguredPlacement configAmethyst = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.amethyst_chance.get(), 5, 5, 25));
        ConfiguredPlacement configAmethystNether = Placement.COUNT_RANGE.configure(new CountRangeConfig(ConfigBuilder.amethyst_nether_chance.get(), 5, 5, 25));

        for (Biome biome : ForgeRegistries.BIOMES.getValues())
        {
            if (biome.getCategory() == Biome.Category.THEEND)
            {
                continue;
            }
            else if (biome.getCategory() == Biome.Category.NETHER)
            {
                if (ConfigBuilder.generate_nether.get())
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.aventurineOreNether.get().getDefaultState(), 10))
                            .withPlacement(configAventurineNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.carnelianOreNether.get().getDefaultState(), 10))
                            .withPlacement(configCarnelianNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.chalcopyriteOreNether.get().getDefaultState(), 10))
                            .withPlacement(configChalcopyriteNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.citrineOreNether.get().getDefaultState(), 10))
                            .withPlacement(configCitrineNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.jadeOreNether.get().getDefaultState(), 10))
                            .withPlacement(configJadeNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.jasperOreNether.get().getDefaultState(), 10))
                            .withPlacement(configJasperNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.labradoriteOreNether.get().getDefaultState(), 10))
                            .withPlacement(configLabradoriteNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.micaOreNether.get().getDefaultState(), 10))
                            .withPlacement(configMicaNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.moonstoneOreNether.get().getDefaultState(), 10))
                            .withPlacement(configMoonstoneNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.roseQuartzOreNether.get().getDefaultState(), 10))
                            .withPlacement(configRoseQuartzNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.sodaliteOreNether.get().getDefaultState(), 10))
                            .withPlacement(configSodaliteNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK,
                                    ModBlocks.amethystOreNether.get().getDefaultState(), 10))
                            .withPlacement(configAmethystNether));
                }
            }
            else
            {
                if (ConfigBuilder.generate_overworld.get())
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.aventurineOre.get().getDefaultState(), 10))
                            .withPlacement(configAventurine));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.carnelianOre.get().getDefaultState(), 10))
                            .withPlacement(configCarnelian));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.chalcopyriteOre.get().getDefaultState(), 10))
                            .withPlacement(configChalcopyrite));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.citrineOre.get().getDefaultState(), 10))
                            .withPlacement(configCitrine));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.jadeOre.get().getDefaultState(), 10))
                            .withPlacement(configJade));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.jasperOre.get().getDefaultState(), 10))
                            .withPlacement(configJasper));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.labradoriteOre.get().getDefaultState(), 10))
                            .withPlacement(configLabradoriteNether));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.micaOre.get().getDefaultState(), 10))
                            .withPlacement(configMica));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.moonstoneOre.get().getDefaultState(), 10))
                            .withPlacement(configMoonstone));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.roseQuartzOre.get().getDefaultState(), 10))
                            .withPlacement(configRoseQuartz));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.sodaliteOre.get().getDefaultState(), 10))
                            .withPlacement(configSodalite));

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE
                            .withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
                                    ModBlocks.amethystOre.get().getDefaultState(), 10))
                            .withPlacement(configAmethyst));
                }



            }
        }
    }
}
