package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
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
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = new DeferredRegister<>(
            ForgeRegistries.ENCHANTMENTS, MarvelousMaterials.MODID);

    public static final RegistryObject<Enchantment> FLOWER_CHILD = ENCHANTMENTS.register("flower_child",
            () -> new EnchantmentFlowerChild());

    public static final RegistryObject<Enchantment> FANCY_FEET = ENCHANTMENTS.register("fancy_feet",
            () -> new EnchantmentFloralFeet());
}
