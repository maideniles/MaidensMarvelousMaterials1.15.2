package com.maideniles.maidensmaterials.event;

import java.util.Random;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import com.maideniles.maidensmaterials.potion.MaidensPotions;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MarvelousMaterials.MODID)
public class MaidensEventHandler {

    private static final Random rand = new Random();

    //ADD EARTHEN ESSENCE DROPS TO ORE AND WOOD BLOCKS//  //this is now useless in 1.14  :(  //



    @SubscribeEvent
    public static void onBlockBreakEvent3(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();

        if(!player.isCreative())
        if (ModBlocks.validBlocks.contains(event.getState().getBlock())) {
            if (rand.nextInt(10) ==0) {
                ItemEntity item = new ItemEntity(event.getWorld().getWorld(), event.getPos().getX()+0.5,
                        event.getPos().getY(), event.getPos().getZ()+0.5, new ItemStack((ModItems.EARTHEN_ESSENCE.get()), 1));
                if (!event.getWorld().isRemote()) {
                    item.setPickupDelay(40); // To Set a Small Pickup Delay

                        event.getWorld().addEntity(item);
                    item.addVelocity(0, 0.01d, 0);
                }
            }
        }
    }

//GATHERER'S GLEE POTION--GET EXTRA DROPS  1 IN 20 CHANCE OF DOUBLING ORE//
    @SubscribeEvent
    public static void onBlockBreak(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();

        if (!player.isCreative() && player.isPotionActive(MaidensPotions.GATHERERS_GLEE_EFFECT.get())) {

            if (ModBlocks.validBlocks.contains(event.getState().getBlock())) {

                ItemEntity item = new ItemEntity(event.getWorld().getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(event.getState().getBlock(), 1));

                if (!event.getWorld().isRemote()) {
                    item.setPickupDelay(40); // To Set a Small Pickup Delay
                    if (rand.nextInt(20) ==0)  //set 1 in 20 chance?// {
                        event.getWorld().addEntity(item);
                    }
                }
            }
        }


//MAKE ORNAMENTAL GRASS DROP WHILE POTION ACTIVE
    @SubscribeEvent
    public static void onBlockBreak2(BlockEvent.BreakEvent event) {
        PlayerEntity player = event.getPlayer();
        if (!player.isCreative() && player.isPotionActive(MaidensPotions.FLORAL_FORTUNE_EFFECT.get())) {

            if (ModBlocks.GRASS.contains(event.getState().getBlock())) {

                ItemEntity item = new ItemEntity(event.getWorld().getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Item.getItemFromBlock(ModBlocks.ornamentalGrass.get()), 1));

                if (!event.getWorld().isRemote()) {
                    item.setPickupDelay(40); // To Set a Small Pickup Delay
                    event.getWorld().addEntity(item);
                }
            }
        }

    }






}
