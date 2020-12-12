package com.maideniles.maidensmaterials;


import com.maideniles.maidensmaterials.config.Config;
import com.maideniles.maidensmaterials.init.BiomeInit;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.potion.MaidensPotions;
import com.maideniles.maidensmaterials.world.gen.OreGen;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

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
        MaidensPotions.POTIONS.register(modEventBus);



        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);

        BiomeInit.BIOMES.register(modEventBus);


        instance = this;

        Config.loadConfig(Config.CLIENT, FMLPaths.CONFIGDIR.get().resolve("maidensmaterials-client.toml").toString());
        Config.loadConfig(Config.SERVER, FMLPaths.CONFIGDIR.get().resolve("maidensmaterials-server.toml").toString());

        MinecraftForge.EVENT_BUS.register(this);


    }

    @SubscribeEvent
    public static void onRegisterBiomes(final RegistryEvent.Register<Biome> event) {
        BiomeInit.registerBiomes();
    }


    public void setup(final FMLCommonSetupEvent event) {// K9#8016
        OreGen.setupOreGeneration();
    }

}