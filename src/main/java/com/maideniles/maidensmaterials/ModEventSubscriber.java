package com.maideniles.maidensmaterials;

import com.maideniles.maidensmaterials.potion.MaidensPotions;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@EventBusSubscriber(modid = MarvelousMaterials.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {

    private static final Logger LOGGER = LogManager.getLogger(MarvelousMaterials.MODID + " Mod Event Subscriber");

    @SubscribeEvent
    public static void onRegisterItems(RegistryEvent.Register<Potion> event) {
        MaidensPotions.addPotionRecipes();
    }

}










