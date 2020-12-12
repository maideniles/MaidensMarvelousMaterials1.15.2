package com.maideniles.maidensmaterials.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WoodButtonBlock;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;

public class CustomWoodButton extends WoodButtonBlock {
    public CustomWoodButton(Properties sound) {
        super(Block.Properties.create(Material.WOOD).hardnessAndResistance(2.5F).sound(SoundType.WOOD));
    }



}
