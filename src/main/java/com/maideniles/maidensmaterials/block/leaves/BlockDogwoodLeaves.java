package com.maideniles.maidensmaterials.block.leaves;

import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.init.ItemInit;

import com.maideniles.maidensmaterials.potion.MaidensPotions;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public class BlockDogwoodLeaves extends LeavesBlock {
    public BlockDogwoodLeaves(Properties properties) {
        super(Block.Properties.create(Material.LEAVES).hardnessAndResistance(2.5F).sound(SoundType.PLANT));
        ;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack shears = player.getHeldItem(handIn);


        if (!worldIn.isRemote()) {

            if (shears.getItem() == ModItems.PRUNING_SHEARS.get()|| player.isPotionActive(MaidensPotions.FLORAL_FORTUNE_EFFECT.get())) {


                ItemEntity blossom = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.DOGWOOD_BLOSSOMS.get(), 1));
                worldIn.addEntity(blossom);


                shears.damageItem(1, player, (p_220045_0_) -> {
                    p_220045_0_.sendBreakAnimation(EquipmentSlotType.MAINHAND);
                });
                System.out.println("Damaged Shears!");


                if ((new Random().nextInt(100) + 1) < 10) {
                    ItemEntity itemessence = new ItemEntity(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ModItems.FLORAL_ESSENCE.get(), 1));
                    itemessence.setPickupDelay(0);
                    worldIn.addEntity(itemessence);
                }

            }


        }

        return true;
    }



}


