package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.enchant.EnchantmentFloralFeet;
import com.maideniles.maidensmaterials.enchant.EnchantmentFlowerChild;
import net.java.games.input.Component;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Rarity;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEnchantments  {

    public static final Enchantment FLOWER_POWER = new EnchantmentFlowerChild();
    public static final Enchantment FANCY_FEET = new EnchantmentFloralFeet();


    @SubscribeEvent
    public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
        event.getRegistry().registerAll(FLOWER_POWER, FANCY_FEET);

        // DEBUG
        System.out.println("Registering Enchantments");
        ForgeRegistries.ENCHANTMENTS.register(FLOWER_POWER);
        ForgeRegistries.ENCHANTMENTS.register(FANCY_FEET);
    }



}