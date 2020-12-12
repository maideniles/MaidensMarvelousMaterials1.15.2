package com.maideniles.maidensmaterials.item;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MortarNPestleItem extends Item {

    private Item containerItem;

    public MortarNPestleItem(Properties properties) {
        super(properties.maxStackSize(1).maxDamage(64));
    }

    @Override
    public boolean hasContainerItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getContainerItem(ItemStack itemStack) {
        ItemStack ret = new ItemStack(this);
        ret.setDamage(itemStack.getDamage() + 1);
        return ret;
    }
}