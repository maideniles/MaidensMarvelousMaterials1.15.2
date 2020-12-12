package com.maideniles.maidensmaterials.enchant;

import com.maideniles.maidensmaterials.MarvelousMaterials;

import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModEnchantments;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MarvelousMaterials.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EnchantmentFloralFeet extends Enchantment{

    public EnchantmentFloralFeet() {
        super(Enchantment.Rarity.VERY_RARE, EnchantmentType.ARMOR_FEET, new EquipmentSlotType[] {EquipmentSlotType.FEET});

        this.setRegistryName("fancy_feet");
        ModBlocks.GRASS.add(ModBlocks.ornamentalGrass.get());
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }


    @Override
    public int getMinEnchantability(int enchantmentLevel) {
        return 1 + 10 * (enchantmentLevel - 1);
    }

    @Override
    public int getMaxEnchantability(int enchantmentLevel) {
        return super.getMinEnchantability(enchantmentLevel) + 15;
    }

    @Override
    public boolean canApply(ItemStack stack) {
        return stack.getItem()instanceof ArmorItem  && ((ArmorItem) stack.getItem()).getEquipmentSlot()== (EquipmentSlotType.FEET) ;
    }

    @Override
    public boolean canApplyTogether(Enchantment ench)
    {
        return super.canApplyTogether(ench)
                || ench == Enchantments.DEPTH_STRIDER
                || ench == Enchantments.FROST_WALKER
                || ench == Enchantments.FEATHER_FALLING
                || ench == Enchantments.PROTECTION
                || ench == Enchantments.FIRE_PROTECTION
                || ench == Enchantments.THORNS
                || ench == Enchantments.MENDING
                || ench == Enchantments.BLAST_PROTECTION;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return canApply(stack);
    }

    @SubscribeEvent
    public static void growFlowersUnderFeet(LivingEvent.LivingUpdateEvent event) {
        if (!event.getEntity().world.isRemote) {
            int level = EnchantmentHelper.getMaxEnchantmentLevel(ModEnchantments.FANCY_FEET,
                    event.getEntityLiving());

            if (level >0 && event.getEntityLiving().onGround) {
                Entity entity = event.getEntity();
                if (entity instanceof PlayerEntity && ((PlayerEntity) entity).isSpectator()) {
                    return;
                }

                World world = entity.world;
                int r = level + 1;
                BlockPos pos = entity.getPosition();
                for (int x = -r; x <= r; x++) {
                    for (int z = -r; z <= r; z++) {
                        BlockPos blockpos = pos.add(x, -1, z);
                        if (blockpos.distanceSq(pos) > r * r) {
                            continue;
                        }

                        BlockState iblockstate = world.getBlockState(blockpos);

                        if (iblockstate.getBlock() == Blocks.GRASS

                                || iblockstate.getBlock().toString().toLowerCase().contains("grass")){
                            if(world.getBlockState(entity.getPosition()).getBlock() != Blocks.SNOW) {
                                if(ModBlocks.walkFlowers.get().isValidPosition(iblockstate, world, pos)) {
                                    world.setBlockState(pos, ModBlocks.walkFlowers.get().getDefaultState());
                                   //Debug System.out.println("GROW FLOWERS!");
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    }



