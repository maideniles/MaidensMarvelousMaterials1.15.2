package com.maideniles.maidensmaterials.block.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class CustomWoodBlock extends Block {
    public CustomWoodBlock(Properties properties) {
        super(properties);
    }
    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack axe = player.getHeldItem(handIn);
        BlockState log = worldIn.getBlockState(pos);

        if (!worldIn.isRemote() && player.getHeldItem(handIn).toString().toLowerCase().contains("axe")) {


            if (log.getBlock() == ModBlocks.crabappleWood.get()) {

System.out.print("get wood!");
                worldIn.setBlockState(pos, ModBlocks.crabappleStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.poincianaWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.poincianaStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.laburnumWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.laburnumStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.jadeWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.jadeStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.paulowniaWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.paulowniaStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.wisteriaWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.wisteriaStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.jacarandaWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.jacarandaStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.dogwoodWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.dogwoodStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.silverbellWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.silverbellStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.cedarWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.cedarStrippedWood.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.palmWood.get()) {


                worldIn.setBlockState(pos, ModBlocks.palmStrippedWood.get().getDefaultState());
            }


        }

        return ActionResultType.FAIL;
    }

}
