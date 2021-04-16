package com.maideniles.maidensmaterials.block.vase;


import com.maideniles.maidensmaterials.init.ModBlocks;
import com.maideniles.maidensmaterials.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;

import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockClayVasePink extends Block {

    private static final VoxelShape SHAPE = Block.makeCuboidShape(4.8, 0, 4.8, 11.2, 6.0, 11.2);


    public BlockClayVasePink(Properties properties) {
        super(Properties.create(Material.ROCK).hardnessAndResistance(2.5F).sound(SoundType.STONE));
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
    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        ItemStack blossom = player.getHeldItem(handIn);

        if (!worldIn.isRemote()) {



            if (blossom.getItem() == ModItems.CRABAPPLE_BLOSSOMS.get()){

     //           System.out.println("RED FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseRedFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.POINCIANA_BLOSSOMS.get()){

     //           System.out.println("ORANGE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseOrangeFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.LABURNUM_BLOSSOMS.get()){

    //            System.out.println("YELLOW FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseYellowFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JADE_BLOSSOMS.get()){

    //            System.out.println("GREEN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseGreenFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.PAULOWNIA_BLOSSOMS.get()){

     //           System.out.println("CYAN FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseCyanFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.WISTERIA_BLOSSOMS.get()){

     //           System.out.println("BLUE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseBlueFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.JACARANDA_BLOSSOMS.get()){

    //            System.out.println("PURPLE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVasePurpleFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.DOGWOOD_BLOSSOMS.get()){

    //            System.out.println("PINK FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVasePinkFlower.get().getDefaultState());
            }

            if (blossom.getItem() == ModItems.SILVERBELL_BLOSSOMS.get()){

     //           System.out.println("WHITE FLOWER!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseWhiteFlower.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.crabappleSapling.get())){

    //            System.out.println("RED SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseRedSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.poincianaSapling.get())){

    //            System.out.println("ORANGE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseOrangeSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.laburnumSapling.get())){

    //            System.out.println("YELLOW SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseYellowSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jadeSapling.get())){

    //            System.out.println("GREEN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseGreenSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.paulowniaSapling.get())){

   //             System.out.println("CYAN SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseCyanSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.wisteriaSapling.get())){

    //            System.out.println("BLUE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseBlueSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.jacarandaSapling.get())){

    //            System.out.println("PURPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVasePurpleSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.dogwoodSapling.get())){

    //            System.out.println("PINK SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVasePinkSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.silverbellSapling.get())){

   //            System.out.println("WHITE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.PinkVaseWhiteSapling.get().getDefaultState());
            }
            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.appleSapling.get())){

    //            System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseAppleSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.pearSapling.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVasePearSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.peachSapling.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVasePeachSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.plumSapling.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVasePlumSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.orangeSapling.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseOrangeFruitSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.grapefruitSapling.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseGrapeFruitSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.lemonSapling.get())){

       //         System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseLemonSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.limeSapling.get())){

      //          System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseLimeFruitSapling.get().getDefaultState());
            }

            if (blossom.getItem() == Item.getItemFromBlock(ModBlocks.cherrySapling.get())){

        //        System.out.println("APPLE SAPLING!");
                worldIn.setBlockState(pos, ModBlocks.pinkVaseCherrySapling.get().getDefaultState());
            }

        }




        return ActionResultType.SUCCESS;
    }



}


