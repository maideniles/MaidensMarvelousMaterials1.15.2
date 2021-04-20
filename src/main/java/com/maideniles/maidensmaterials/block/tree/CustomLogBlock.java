package com.maideniles.maidensmaterials.block.tree;

import com.maideniles.maidensmaterials.init.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.LogBlock;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class CustomLogBlock extends RotatedPillarBlock {


    public CustomLogBlock(Properties properties) {
        super(properties);
    }


    @Override
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack axe = player.getHeldItem(handIn);
        BlockState log = worldIn.getBlockState(pos);

        if (!worldIn.isRemote() && player.getHeldItem(handIn).toString().toLowerCase().contains("axe")) {


            if (log.getBlock() == ModBlocks.crabappleLog.get()) {

System.out.print("TESTING WOOD STRIPPING");
                worldIn.setBlockState(pos, ModBlocks.crabappleStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.poincianaLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.poincianaStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.laburnumLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.laburnumStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.jadeLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.jadeStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.paulowniaLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.paulowniaStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.wisteriaLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.wisteriaStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.jacarandaLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.jacarandaStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.dogwoodLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.dogwoodStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.silverbellLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.silverbellStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.cedarLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.cedarStrippedLog.get().getDefaultState());
            }

            if (log.getBlock() == ModBlocks.palmLog.get()) {


                worldIn.setBlockState(pos, ModBlocks.palmStrippedLog.get().getDefaultState());
            }


        }

        return ActionResultType.FAIL;
    }



}
