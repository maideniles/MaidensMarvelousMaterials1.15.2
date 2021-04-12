package com.maideniles.maidensmaterials;


import com.maideniles.maidensmaterials.world.gen.decorator.tree.MaidensTreeDecoratorTypes;
import com.maideniles.maidensmaterials.world.gen.decorator.tree.trunk.CrabappleTrunkVineTreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecorator;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.maideniles.maidensmaterials.client.RenderLayers;
import com.maideniles.maidensmaterials.config.Config;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModFeatures;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.potion.MaidensPotions;
import com.maideniles.maidensmaterials.world.gen.OreGen;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.Feature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;

@Mod(MarvelousMaterials.MODID)
@Mod.EventBusSubscriber(modid = MarvelousMaterials.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class MarvelousMaterials {

    public static MarvelousMaterials instance;

    public static final String MODID = "maidensmaterials";

    public static final Logger LOGGER = LogManager.getLogger(MODID);





    public MarvelousMaterials() {

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);

        LOGGER.debug("Hello from Maiden's Materials!");

        MaidensPotions.EFFECTS.register(modEventBus);
        LOGGER.debug("Effects Registered!");
        MaidensPotions.POTIONS.register(modEventBus);
        LOGGER.debug("Potions Registered!");


        ModBlocks.BLOCKS.register(modEventBus);
        LOGGER.debug("Blocks Registered!");
        ModItems.ITEMS.register(modEventBus);
        LOGGER.debug("Items Registered!");

        BiomeInit.BIOMES.register(modEventBus);
        LOGGER.debug("Biomes Registered!");


        instance = this;

        Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("maidensmaterials-client.toml").toString());
        Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("maidensmaterials-server.toml").toString());
        LOGGER.debug("Config Loaded!");

        MinecraftForge.EVENT_BUS.register(this);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, () -> RenderLayers::safeRunClient);
    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }

    @SubscribeEvent
    public static void onRegisterFeatures(final RegistryEvent.Register<Feature<?>> event) {

        ModFeatures.registerFeatures(event.getRegistry());
    }

    @SubscribeEvent
    public void registerTreeDecoratorTypes(RegistryEvent.Register<TreeDecoratorType<?>> event) {

        event.getRegistry().register(MaidensTreeDecoratorTypes.MAIDENS_TRUNK_VINE.setRegistryName("maidens_trunk_vine_decorator"));
        event.getRegistry().register(MaidensTreeDecoratorTypes.MAIDENS_LEAF_VINE.setRegistryName("maidens_leaf_vine_decorator"));
        event.getRegistry().register(MaidensTreeDecoratorTypes.MAIDENS_MUSHROOM.setRegistryName("maidens_mushroom_decorator"));
    }

    public void setup(final FMLCommonSetupEvent event) {// K9#8016
        OreGen.setupOreGen();
        LOGGER.debug("Oregen Registered!");
        ModBlocks.registerFlammables();
    }

}