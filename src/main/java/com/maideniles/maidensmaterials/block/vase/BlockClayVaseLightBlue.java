package com.maideniles.maidensmaterials.block.vase;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import java.util.Random;

public class BlockClayVaseLightBlue extends Block {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(4.8, 0, 4.8, 11.2, 6.0, 11.2);


    public BlockClayVaseLightBlue(Properties properties) {
        super(Block.Properties.create(Material.ROCK).hardnessAndResistance(2.5F).sound(SoundType.STONE));
        this.setDefaultState(this.getDefaultState());
    }



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext selectionContext)
    {  return SHAPE;

    }

    @Override
    public VoxelShape getRenderShape(BlockState state, IBlockReader reader, BlockPos pos)
    {
        return SHAPE;
    }

    @Override
    public boolean onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack blossom = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {



            if (blossom.getItem() == ModItems.CRABAPPLE_BLOSSOMS.get()){

                System.out.println("RED FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseRedFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.POINCIANA_BLOSSOMS.get()){

                System.out.println("ORANGE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseOrangeFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.LABURNUM_BLOSSOMS.get()){

                System.out.println("YELLOW FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseYellowFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JADE_BLOSSOMS.get()){

                System.out.println("GREEN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseGreenFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.PAULOWNIA_BLOSSOMS.get()){

                System.out.println("CYAN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseCyanFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.WISTERIA_BLOSSOMS.get()){

                System.out.println("BLUE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseBlueFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JACARANDA_BLOSSOMS.get()){

                System.out.println("PURPLE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVasePurpleFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.DOGWOOD_BLOSSOMS.get()){

                System.out.println("PINK FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVasePinkFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()){

                System.out.println("WHITE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseWhiteFlower.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.crabappleSapling.get())){

                System.out.println("RED SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseRedSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.poincianaSapling.get())){

                System.out.println("ORANGE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseOrangeSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.laburnumSapling.get())){

                System.out.println("YELLOW SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseYellowSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jadeSapling.get())){

                System.out.println("GREEN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseGreenSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.paulowniaSapling.get())){

                System.out.println("CYAN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseCyanSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.wisteriaSapling.get())){

                System.out.println("BLUE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseBlueSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jacarandaSapling.get())){

                System.out.println("PURPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVasePurpleSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.dogwoodSapling.get())){

                System.out.println("PINK SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVasePinkSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.silverbellSapling.get())){

                System.out.println("WHITE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.LightBlueVaseWhiteSapling.get().getDefaultState());
            }

        }




        return true;
    }

    public BlockRenderLayer getRenderLayer() {
        return BlockRenderLayer.CUTOUT;
    }

}


