package com.maideniles.maidensmaterials.client;

import com.maideniles.maidensmaterials.init.ModBlocks;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class RenderLayers {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        // Set the render layer of blocks that need transparency here
        RenderTypeLookup.setRenderLayer(ModBlocks.palmSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.crabappleSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.crabappleVine.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.palmLeaves.get(), RenderType.getCutoutMipped());
    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}
