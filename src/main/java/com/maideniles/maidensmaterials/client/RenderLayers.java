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

        RenderTypeLookup.setRenderLayer(ModBlocks.crabappleSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.poincianaSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.laburnumSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.jadeSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.paulowniaSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.wisteriaSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.jacarandaSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.dogwoodSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.silverbellSapling.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.cedarSapling.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.palmSapling.get(), RenderType.getCutoutMipped());




        RenderTypeLookup.setRenderLayer(ModBlocks.crabappleVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.poincianaVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.laburnumVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.jadeVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.paulowniaVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.wisteriaVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.jacarandaVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.dogwoodVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.silverbellVine.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(ModBlocks.cedarVine.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.ornamentalMushroom.get(), RenderType.getCutoutMipped());




        RenderTypeLookup.setRenderLayer(ModBlocks.fairyGlowCup.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(ModBlocks.palmLeaves.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.crabappleLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.poincianaLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.laburnumLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.jadeLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.paulowniaLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.wisteriaLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.jacarandaLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.dogwoodLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.silverbellLeaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.cedarLeaves.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(ModBlocks.growingAppleLeaves.get(), RenderType.getCutout());




    }

    public static void safeRunClient() {
        final IEventBus eventHandler = FMLJavaModLoadingContext.get().getModEventBus();
        eventHandler.register(RenderLayers.class);
    }
}
