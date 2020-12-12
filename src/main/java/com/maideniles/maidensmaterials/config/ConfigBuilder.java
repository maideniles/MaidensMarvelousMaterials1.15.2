package com.maideniles.maidensmaterials.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigBuilder {

    public static ForgeConfigSpec.IntValue amethyst_chance;
    public static ForgeConfigSpec.IntValue amethyst_nether_chance;
    public static ForgeConfigSpec.IntValue aventurine_chance;
    public static ForgeConfigSpec.IntValue aventurine_nether_chance;
    public static ForgeConfigSpec.IntValue carnelian_chance;
    public static ForgeConfigSpec.IntValue carnelian_nether_chance;
    public static ForgeConfigSpec.IntValue chalcopyrite_chance;
    public static ForgeConfigSpec.IntValue chalcopyrite_nether_chance;
    public static ForgeConfigSpec.IntValue citrine_chance;
    public static ForgeConfigSpec.IntValue citrine_nether_chance;
    public static ForgeConfigSpec.IntValue jade_chance;
    public static ForgeConfigSpec.IntValue jade_nether_chance;
    public static ForgeConfigSpec.IntValue jasper_chance;
    public static ForgeConfigSpec.IntValue jasper_nether_chance;
    public static ForgeConfigSpec.IntValue labradorite_chance;
    public static ForgeConfigSpec.IntValue labradorite_nether_chance;
    public static ForgeConfigSpec.IntValue mica_chance;
    public static ForgeConfigSpec.IntValue mica_nether_chance;
    public static ForgeConfigSpec.IntValue moonstone_chance;
    public static ForgeConfigSpec.IntValue moonstone_nether_chance;
    public static ForgeConfigSpec.IntValue rosequartz_chance;
    public static ForgeConfigSpec.IntValue rosequartz_nether_chance;
    public static ForgeConfigSpec.IntValue sodalite_chance;
    public static ForgeConfigSpec.IntValue sodalite_nether_chance;
    public static ForgeConfigSpec.BooleanValue generate_overworld;

    public static ForgeConfigSpec.IntValue ornamental_forest_biome_chances;
    public static ForgeConfigSpec.IntValue oasis_shore_biome_chances;
    public static ForgeConfigSpec.IntValue ornamental_orchard_biome_chances;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("Oregen Config");

        generate_overworld = server
                .comment("Decide if you want Marvelous Material ores to generate")
                .define("oregen.generate_overworld", true);

        amethyst_chance = server
                .comment("Maximum number of ore veins of the amethyst ore that can spawn in one chunk.")
                .defineInRange("oregen.amethyst_chance", 17, 1, 1000000);

        amethyst_nether_chance = server
                .comment("Maximum number of ore veins of the amethyst nether ore that can spawn in one chunk.")
                .defineInRange("oregen.amethyst_nether_chance", 17, 1, 1000000);

        aventurine_chance = server
                .comment("Maximum number of ore veins of the aventurine ore that can spawn in one chunk.")
                .defineInRange("oregen.aventurine_chance", 17, 1, 1000000);

        aventurine_nether_chance = server
                .comment("Maximum number of ore veins of the aventurine nether ore that can spawn in one chunk.")
                .defineInRange("oregen.aventurine_nether_chance", 17, 1, 1000000);

        carnelian_chance = server
                .comment("Maximum number of ore veins of the carnelian ore that can spawn in one chunk.")
                .defineInRange("oregen.carnelian_chance", 17, 1, 1000000);

        carnelian_nether_chance = server
                .comment("Maximum number of ore veins of the carnelian nether ore that can spawn in one chunk.")
                .defineInRange("oregen.carnelian_nether_chance", 17, 1, 1000000);

        chalcopyrite_chance = server
                .comment("Maximum number of ore veins of the chalcopyrite  ore that can spawn in one chunk.")
                .defineInRange("oregen.chalcopyrite_chance", 17, 1, 1000000);

        chalcopyrite_nether_chance = server
                .comment("Maximum number of ore veins of the chalcopyrite nether ore that can spawn in one chunk.")
                .defineInRange("oregen.chalcopyrite_nether_chance", 17, 1, 1000000);

        citrine_chance = server
                .comment("Maximum number of ore veins of the citrine  ore that can spawn in one chunk.")
                .defineInRange("oregen.citrine_chance", 17, 1, 1000000);

        citrine_nether_chance = server
                .comment("Maximum number of ore veins of the citrine nether ore that can spawn in one chunk.")
                .defineInRange("oregen.citrine_nether_chance", 17, 1, 1000000);

        jade_chance = server
                .comment("Maximum number of ore veins of the jade ore that can spawn in one chunk.")
                .defineInRange("oregen.jade_chance", 17, 1, 1000000);

        jade_nether_chance = server
                .comment("Maximum number of ore veins of the jade nether ore that can spawn in one chunk.")
                .defineInRange("oregen.jade_nether_chance", 17, 1, 1000000);

        jasper_chance = server
                .comment("Maximum number of ore veins of the jasper ore that can spawn in one chunk.")
                .defineInRange("oregen.jasper_chance", 17, 1, 1000000);

        jasper_nether_chance = server
                .comment("Maximum number of ore veins of the jasper nether ore that can spawn in one chunk.")
                .defineInRange("oregen.jasper_nether_chance", 17, 1, 1000000);

        labradorite_chance = server
                .comment("Maximum number of ore veins of the labradorite ore that can spawn in one chunk.")
                .defineInRange("oregen.labradorite_chance", 17, 1, 1000000);

        labradorite_nether_chance = server
                .comment("Maximum number of ore veins of the labradorite nether ore that can spawn in one chunk.")
                .defineInRange("oregen.labradorite_nether_chance", 17, 1, 1000000);

        mica_chance = server
                .comment("Maximum number of ore veins of the mica ore that can spawn in one chunk.")
                .defineInRange("oregen.mica_chance", 17, 1, 1000000);

        mica_nether_chance = server
                .comment("Maximum number of ore veins of the mica nether ore that can spawn in one chunk.")
                .defineInRange("oregen.mica_nether_chance", 17, 1, 1000000);

        moonstone_chance = server
                .comment("Maximum number of ore veins of the moonstone ore that can spawn in one chunk.")
                .defineInRange("oregen.moonstone_chance", 17, 1, 1000000);

        moonstone_nether_chance = server
                .comment("Maximum number of ore veins of the moonstone nether ore that can spawn in one chunk.")
                .defineInRange("oregen.moonstone_nether_chance", 17, 1, 1000000);

        rosequartz_chance = server
                .comment("Maximum number of ore veins of the rosequartz ore that can spawn in one chunk.")
                .defineInRange("oregen.rosequartz_chance", 17, 1, 1000000);

        rosequartz_nether_chance = server
                .comment("Maximum number of ore veins of the rosequartz nether ore that can spawn in one chunk.")
                .defineInRange("oregen.rosequartz_nether_chance", 17, 1, 1000000);

        sodalite_chance = server
                .comment("Maximum number of ore veins of the sodalite ore that can spawn in one chunk.")
                .defineInRange("oregen.sodalite_chance", 17, 1, 1000000);

        sodalite_nether_chance = server
                .comment("Maximum number of ore veins of the sodalite nether ore that can spawn in one chunk.")
                .defineInRange("oregen.sodalite_nether_chance", 17, 1, 1000000);



        server.comment("Biome Config");

        ornamental_forest_biome_chances = server
                .comment("Ornamental forest biome chance. Range  1 ~ 100")
                .defineInRange("biome.ornamental_forest_biome_chances", 5, 1, 100);

        oasis_shore_biome_chances = server
                .comment("Oasis Shore biome chance. Range  1 ~ 100")
                .defineInRange("biome.oasis_shore_biome_chances", 5, 1, 100);

        ornamental_orchard_biome_chances = server
                .comment("Ornamental Orchard biome chance. Range  1 ~ 100")
                .defineInRange("biome.ornamental_orchard_biome_chances", 2, 1, 100);

    }
}
