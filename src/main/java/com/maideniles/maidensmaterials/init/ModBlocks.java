package com.maideniles.maidensmaterials.init;


import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.block.*;

import com.maideniles.maidensmaterials.block.fruit.*;
import com.maideniles.maidensmaterials.block.leaves.*;
import com.maideniles.maidensmaterials.block.tree.CoconutNut;
import com.maideniles.maidensmaterials.block.tree.PalmLeaves;
import com.maideniles.maidensmaterials.block.vase.*;
import com.maideniles.maidensmaterials.util.MaidensTreeColor;
import com.maideniles.maidensmaterials.world.feature.tree.MaidensTrees;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;


public class ModBlocks
{  public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
        MarvelousMaterials.MODID);

    public static List<Item> gatheredOres = new ArrayList<>();
    public static List<String> oresIWant = new ArrayList<>();
    public static List<Block> validBlocks = new ArrayList<>();


    public static final List<Block> GRASS= new ArrayList<Block>();

    private static <B extends Block> RegistryObject<B> createBlockWithItem(String name, Supplier<? extends B> supplier, Supplier<BlockItem> item) {
        ModItems.ITEMS.register(name, item);
        return ModBlocks.BLOCKS.register(name, supplier);
    }

    private static <B extends Block> RegistryObject<B> createBlock(String name, Supplier<? extends B> supplier, @Nullable ItemGroup group) {
        RegistryObject<B> block = ModBlocks.BLOCKS.register(name, supplier);
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(group)));
        return block;
    }




    //LOGS
    public static final RegistryObject<Block> crabappleLog = createBlock("crabapple_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaLog = createBlock( "poinciana_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumLog = createBlock("laburnum_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeLog = createBlock("jade_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaLog = createBlock("paulownia_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaLog = createBlock("wisteria_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaLog = createBlock("jacaranda_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodLog = createBlock("dogwood_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellLog = createBlock("silverbell_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarLog = createBlock("cedar_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> palmLog = createBlock("palm_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //LOGS--STRIPPED//
    public static final RegistryObject<Block>  crabappleStrippedLog = createBlock("crabapple_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaStrippedLog = createBlock( "poinciana_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumStrippedLog = createBlock("laburnum_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeStrippedLog = createBlock("jade_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaStrippedLog = createBlock("paulownia_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaStrippedLog = createBlock("wisteria_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaStrippedLog = createBlock("jacaranda_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodStrippedLog = createBlock("dogwood_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellStrippedLog = createBlock("silverbell_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarStrippedLog = createBlock("cedar_stripped_log",
            () -> new RotatedPillarBlock(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //WOOD
    public static final RegistryObject<Block>  crabappleWood = createBlock("crabapple_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaWood = createBlock( "poinciana_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumWood = createBlock("laburnum_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeWood = createBlock("jade_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaWood = createBlock("paulownia_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaWood = createBlock("wisteria_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaWood = createBlock("jacaranda_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodWood = createBlock("dogwood_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellWood = createBlock("silverbell_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  cedarWood = createBlock("cedar_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //WOOD--STRIPPED//
    public static final RegistryObject<Block>  crabappleStrippedWood = createBlock("crabapple_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaStrippedWood = createBlock( "poinciana_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumStrippedWood = createBlock("laburnum_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeStrippedWood = createBlock("jade_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaStrippedWood = createBlock("paulownia_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaStrippedWood = createBlock("wisteria_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaStrippedWood = createBlock("jacaranda_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodStrippedWood = createBlock("dogwood_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellStrippedWood = createBlock("silverbell_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  cedarStrippedWood = createBlock("cedar_stripped_wood",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //LEAVES
    public static final RegistryObject<Block>  crabappleLeaves = createBlock("crabapple_leaves",
            () -> new BlockCrabappleLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaLeaves = createBlock( "poinciana_leaves",
            () -> new BlockPoincianaLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumLeaves = createBlock("laburnum_leaves",
            () -> new BlockLaburnumLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeLeaves = createBlock("jade_leaves",
            () -> new BlockJadeLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaLeaves = createBlock("paulownia_leaves",
            () -> new BlockPaulowniaLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaLeaves = createBlock("wisteria_leaves",
            () -> new BlockWisteriaLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaLeaves = createBlock("jacaranda_leaves",
            () -> new BlockJacarandaLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodLeaves = createBlock("dogwood_leaves",
            () -> new BlockDogwoodLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellLeaves = createBlock("silverbell_leaves",
            () -> new BlockSilverbellLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   cedarLeaves = createBlock("cedar_leaves",
            () -> new LeavesBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   appleLeaves = createBlock("apple_leaves",
            () -> new GrowingAppleBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>   grapefruitLeaves = createBlock("grapefruit_leaves",
            () -> new GrowingGrapefruitBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   limeLeaves = createBlock("lime_leaves",
            () -> new GrowingLimeBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   orangeLeaves = createBlock("orange_leaves",
            () -> new GrowingOrangeBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   lemonLeaves = createBlock("lemon_leaves",
            () -> new GrowingLemonBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   peachLeaves = createBlock("peach_leaves",
            () -> new GrowingPeachBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   pearLeaves = createBlock("pear_leaves",
            () -> new GrowingPearBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   plumLeaves = createBlock("plum_leaves",
            () -> new GrowingPlumBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   cherryLeaves = createBlock("cherry_leaves",
            () -> new GrowingCherryBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>   palmLeaves = createBlock("palm_leaves",
            () -> new PalmLeaves(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.5F, 2.0F).sound(SoundType.PLANT)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //PLANKS--TREES//
    public static final RegistryObject<Block>  crabapplePlanks = createBlock("crabapple_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaPlanks = createBlock( "poinciana_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumPlanks = createBlock("laburnum_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadePlanks = createBlock("jade_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaPlanks = createBlock("paulownia_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaPlanks = createBlock("wisteria_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaPlanks = createBlock("jacaranda_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodPlanks = createBlock("dogwood_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellPlanks = createBlock("silverbell_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   cedarPlanks = createBlock("cedar_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);




    //PLANKS--STAINED//
    public static final RegistryObject<Block> redStainedPlanks = createBlock(  "red_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedPlanks = createBlock(  "orange_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedPlanks = createBlock(  "yellow_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedPlanks = createBlock(  "lime_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedPlanks = createBlock(  "green_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedPlanks = createBlock(  "cyan_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedPlanks = createBlock(  "light_blue_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedPlanks = createBlock(  "blue_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedPlanks = createBlock(  "purple_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedPlanks = createBlock(  "magenta_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedPlanks = createBlock(  "pink_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedPlanks = createBlock(  "white_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedPlanks = createBlock(  "light_gray_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedPlanks = createBlock(  "gray_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedPlanks = createBlock(  "black_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedPlanks = createBlock(  "brown_stained_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //SAPLINGS
    public static final RegistryObject<Block> crabappleSapling = createBlock("crabapple_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.RED)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumSapling = createBlock("laburnum_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.YELLOW)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaSapling = createBlock("poinciana_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.ORANGE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSapling = createBlock("jade_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.GREEN)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaSapling = createBlock("paulownia_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.TEAL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaSapling = createBlock("wisteria_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.BLUE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaSapling = createBlock("jacaranda_sapling",
            () ->  new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PURPLE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodSapling = createBlock("dogwood_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PINK)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellSapling = createBlock("silverbell_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.WHITE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarSapling = createBlock("cedar_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.CEDAR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> appleSapling = createBlock("apple_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.APPLE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grapefruitSapling = createBlock("grapefruit_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.GRAPEFRUIT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeSapling = createBlock("orange_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.ORANGE_FRUIT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lemonSapling = createBlock("lemon_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.LEMON)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeSapling = createBlock("lime_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.LIME)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> peachSapling = createBlock("peach_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PEACH)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pearSapling = createBlock("pear_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PEAR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> plumSapling = createBlock("plum_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PLUM)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cherrySapling = createBlock("cherry_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.CHERRY)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> palmSapling = createBlock("palm_sapling",
            () -> new CustomSaplingBlock(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT), new MaidensTrees(MaidensTreeColor.PALM)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //VINES
    public static final RegistryObject<Block>  crabappleVine = createBlock("crabapple_vine",
            () -> new
                    CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  poincianaVine = createBlock("poinciana_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumVine = createBlock("laburnum_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeVine = createBlock("jade_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaVine = createBlock("paulownia_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  wisteriaVine = createBlock("wisteria_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jacarandaVine = createBlock("jacaranda_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodVine = createBlock("dogwood_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellVine = createBlock("silverbell_vine",
            () -> new CustomVineBlock(Block.Properties.create(Material.TALL_PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.2F).sound(SoundType.PLANT)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //MUSHROOM//
    public static final RegistryObject<Block> fairyGlowCup = createBlock( "fairy_glow_cup",
            () ->  new FairyGlowCup(Block.Properties.create(Material.PLANTS).lightValue(15).doesNotBlockMovement().hardnessAndResistance(0.2F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> coconutNut = createBlock( "coconutnut",
            () ->  new CoconutNut(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.2F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //ORE BLOCKS//
    public static final RegistryObject<Block>amethystOre = createBlock( "amethyst_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>aventurineOre = createBlock( "aventurine_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>carnelianOre = createBlock( "carnelian_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>chalcopyriteOre = createBlock( "chalcopyrite_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>citrineOre = createBlock( "citrine_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jadeOre = createBlock( "jade_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jasperOre = createBlock( "jasper_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>labradoriteOre = createBlock( "labradorite_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>micaOre = createBlock( "mica_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>moonstoneOre = createBlock( "moonstone_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>roseQuartzOre = createBlock( "rose_quartz_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>sodaliteOre = createBlock( "sodalite_ore",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>amethystOreNether = createBlock( "amethyst_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>aventurineOreNether = createBlock( "aventurine_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>carnelianOreNether = createBlock( "carnelian_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>chalcopyriteOreNether = createBlock( "chalcopyrite_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>citrineOreNether = createBlock( "citrine_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jadeOreNether = createBlock( "jade_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jasperOreNether = createBlock( "jasper_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>labradoriteOreNether = createBlock( "labradorite_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>micaOreNether = createBlock( "mica_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>moonstoneOreNether = createBlock( "moonstone_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>roseQuartzOreNether = createBlock( "rose_quartz_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>sodaliteOreNether = createBlock( "sodalite_ore_nether",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block>amethystOreEnd = createBlock( "amethyst_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>aventurineOreEnd = createBlock( "aventurine_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>carnelianOreEnd = createBlock( "carnelian_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>chalcopyriteOreEnd = createBlock( "chalcopyrite_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>citrineOreEnd = createBlock( "citrine_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jadeOreEnd = createBlock( "jade_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>jasperOreEnd = createBlock( "jasper_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>labradoriteOreEnd = createBlock( "labradorite_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>micaOreEnd = createBlock( "mica_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>moonstoneOreEnd = createBlock( "moonstone_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>roseQuartzOreEnd = createBlock( "rose_quartz_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>sodaliteOreEnd = createBlock( "sodalite_ore_end",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GEM BLOCKS//

    public static final RegistryObject<Block> amethystBlock = createBlock(  "amethyst_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineBlock = createBlock(  "aventurine_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianBlock = createBlock(  "carnelian_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteBlock = createBlock(  "chalcopyrite_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineBlock = createBlock(  "citrine_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeBlock = createBlock(  "jade_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperBlock = createBlock(  "jasper_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteBlock = createBlock(  "labradorite_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaBlock = createBlock(  "mica_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneBlock = createBlock(  "moonstone_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzBlock = createBlock(  "rose_quartz_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteBlock = createBlock(  "sodalite_block",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> whiteWashedPlanks = createBlock(  "whitewashed_planks",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteWashedStairs = createBlock( "whitewashed_stairs",
            () -> new StairsBlock(() -> ModBlocks.whiteWashedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteWashedSlab = createBlock("whitewashed_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.whiteWashedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteWashedFence = createBlock("whitewashed_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> whiteWashedFenceGate = createBlock(  "whitewashed_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 1//
    public static final RegistryObject<Block> amethystTile1 = createBlock(  "amethyst_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile1 = createBlock(  "aventurine_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile1 = createBlock(  "carnelian_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile1 = createBlock(  "chalcopyrite_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile1 = createBlock(  "citrine_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile1 = createBlock(  "jade_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile1 = createBlock(  "jasper_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile1 = createBlock(  "labradorite_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile1 = createBlock(  "mica_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile1 = createBlock(  "moonstone_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile1 = createBlock(  "rose_quartz_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile1 = createBlock(  "sodalite_tile_1",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 2//
    public static final RegistryObject<Block> amethystTile2 = createBlock(  "amethyst_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile2 = createBlock(  "aventurine_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile2 = createBlock(  "carnelian_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile2 = createBlock(  "chalcopyrite_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile2 = createBlock(  "citrine_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile2 = createBlock(  "jade_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile2 = createBlock(  "jasper_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile2 = createBlock(  "labradorite_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile2 = createBlock(  "mica_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile2 = createBlock(  "moonstone_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile2 = createBlock(  "rose_quartz_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile2 = createBlock(  "sodalite_tile_2",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 3//
    public static final RegistryObject<Block> amethystTile3 = createBlock(  "amethyst_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile3 = createBlock(  "aventurine_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile3 = createBlock(  "carnelian_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile3 = createBlock(  "chalcopyrite_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile3 = createBlock(  "citrine_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile3 = createBlock(  "jade_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile3 = createBlock(  "jasper_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile3 = createBlock(  "labradorite_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile3 = createBlock(  "mica_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile3 = createBlock(  "moonstone_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile3 = createBlock(  "rose_quartz_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile3 = createBlock(  "sodalite_tile_3",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 4//
    public static final RegistryObject<Block> amethystTile4 = createBlock(  "amethyst_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile4 = createBlock(  "aventurine_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile4 = createBlock(  "carnelian_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile4 = createBlock(  "chalcopyrite_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile4 = createBlock(  "citrine_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile4 = createBlock(  "jade_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile4 = createBlock(  "jasper_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile4 = createBlock(  "labradorite_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile4 = createBlock(  "mica_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile4 = createBlock(  "moonstone_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile4 = createBlock(  "rose_quartz_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile4 = createBlock(  "sodalite_tile_4",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 5//
    public static final RegistryObject<Block> amethystTile5 = createBlock(  "amethyst_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile5 = createBlock(  "aventurine_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile5 = createBlock(  "carnelian_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile5 = createBlock(  "chalcopyrite_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile5 = createBlock(  "citrine_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile5 = createBlock(  "jade_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile5 = createBlock(  "jasper_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile5 = createBlock(  "labradorite_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile5 = createBlock(  "mica_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile5 = createBlock(  "moonstone_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile5 = createBlock(  "rose_quartz_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile5 = createBlock(  "sodalite_tile_5",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM TILES--TILE 6//
    public static final RegistryObject<Block> amethystTile6 = createBlock(  "amethyst_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile6 = createBlock(  "aventurine_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile6 = createBlock(  "carnelian_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile6 = createBlock(  "chalcopyrite_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile6 = createBlock(  "citrine_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile6 = createBlock(  "jade_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile6 = createBlock(  "jasper_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile6 = createBlock(  "labradorite_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile6 = createBlock(  "mica_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile6 = createBlock(  "moonstone_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile6 = createBlock(  "rose_quartz_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile6 = createBlock(  "sodalite_tile_6",
            () -> new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2.0f, 15.0f).sound(SoundType.STONE)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //CLAY BLOCKS//
    public static final RegistryObject<Block> redClayBlock = createBlock("red_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeClayBlock = createBlock("orange_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowClayBlock = createBlock("yellow_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeClayBlock = createBlock("lime_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenClayBlock = createBlock("green_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanClayBlock = createBlock("cyan_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueClayBlock = createBlock("light_blue_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueClayBlock = createBlock("blue_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleClayBlock = createBlock("purple_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaClayBlock = createBlock("magenta_clay_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkClayBlock = createBlock("pink_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteClayBlock = createBlock("white_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayClayBlock = createBlock("light_gray_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayClayBlock = createBlock("gray_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackClayBlock = createBlock("black_clay_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownClayBlock = createBlock("brown_clay_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //BRICK BLOCKS//
    public static final RegistryObject<Block> redBrickBlock = createBlock("red_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeBrickBlock = createBlock("orange_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowBrickBlock = createBlock("yellow_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeBrickBlock = createBlock("lime_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenBrickBlock = createBlock("green_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanBrickBlock = createBlock("cyan_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueBrickBlock = createBlock("light_blue_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueBrickBlock = createBlock("blue_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleBrickBlock = createBlock("purple_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaBrickBlock = createBlock("magenta_brick_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkBrickBlock = createBlock("pink_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteBrickBlock = createBlock("white_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayBrickBlock = createBlock("light_gray_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayBrickBlock = createBlock("gray_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackBrickBlock = createBlock("black_brick_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownBrickBlock = createBlock("brown_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //LARGE BRICK BLOCKS//
    public static final RegistryObject<Block> redLargeBrickBlock = createBlock("red_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeLargeBrickBlock = createBlock("orange_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowLargeBrickBlock = createBlock("yellow_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeLargeBrickBlock = createBlock("lime_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenLargeBrickBlock = createBlock("green_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanLargeBrickBlock = createBlock("cyan_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueLargeBrickBlock = createBlock("light_blue_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueLargeBrickBlock = createBlock("blue_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleLargeBrickBlock = createBlock("purple_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaLargeBrickBlock = createBlock("magenta_large_brick_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkLargeBrickBlock = createBlock("pink_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteLargeBrickBlock = createBlock("white_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayLargeBrickBlock = createBlock("light_gray_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayLargeBrickBlock = createBlock("gray_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackLargeBrickBlock = createBlock("black_large_brick_block",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownLargeBrickBlock = createBlock("brown_large_brick_block",
            () ->  new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //VINE COVERED COBBLESTONE//
    public static final RegistryObject<Block>  crabappleCobblestone = createBlock("crabapple_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaCobblestone = createBlock( "poinciana_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumCobblestone = createBlock("laburnum_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeCobblestone = createBlock("jade_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaCobblestone = createBlock("paulownia_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaCobblestone = createBlock("wisteria_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaCobblestone = createBlock("jacaranda_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodCobblestone = createBlock("dogwood_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellCobblestone = createBlock("silverbell_cobblestone",
            () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GRASS,FLOWER,PATH,ESSENCES//
    public static final RegistryObject<Block> ornamentalGrass = createBlock("ornamental_grass",
            () -> new BlockOrnamentalGrass(BlockOrnamentalGrass.Properties.create(Material.ORGANIC).hardnessAndResistance(1.0F, 1.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> walkFlowers = createBlock("flower_grass",
            () -> new BlockFlowerGrass(BlockFlowerGrass.Properties.create(Material.PLANTS)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ornamentalMushroom = createBlock("ornamental_mushroom",
            () -> new OrnamentalMushroomBlock(Effects.NIGHT_VISION, 6,Block.Properties.create(Material.PLANTS)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> ornamentalPath = createBlock( "ornamental_path",
            () -> new BlockPrettyPath(BlockPrettyPath.Properties.create(Material.PLANTS).hardnessAndResistance(1.0F, 1.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> earthenEssenceBlock = createBlock( "earthen_essence_block",
            () -> new Block(Block.Properties.create(Material.PLANTS).hardnessAndResistance(1.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> floralEssenceBlock = createBlock( "floral_essence_block",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> vineTie = createBlock( "vine_tie",
            () -> new BlockVineTie(Block.Properties.create(Material.WEB).doesNotBlockMovement().hardnessAndResistance(0.2F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sparklingSand = createBlock("sparkling_sand",
            () -> new SparklingSand(14406560, Block.Properties.create(Material.SAND, MaterialColor.QUARTZ).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //STAIRS--WOOD--STAINED//
    public static final RegistryObject<Block> crabappleStairs = createBlock( "crabapple_stairs",
            () -> new StairsBlock(() -> ModBlocks.crabapplePlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaStairs = createBlock( "poinciana_stairs",
            () -> new StairsBlock(() -> ModBlocks.poincianaPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumStairs = createBlock( "laburnum_stairs",
            () -> new StairsBlock(() -> ModBlocks.laburnumPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeStairs = createBlock( "jade_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadePlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaStairs = createBlock( "paulownia_stairs",
            () -> new StairsBlock(() -> ModBlocks.paulowniaPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaStairs = createBlock( "wisteria_stairs",
            () -> new StairsBlock(() -> ModBlocks.wisteriaPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaStairs = createBlock( "jacaranda_stairs",
            () -> new StairsBlock(() -> ModBlocks.jacarandaPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodStairs = createBlock( "dogwood_stairs",
            () -> new StairsBlock(() -> ModBlocks.dogwoodPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellStairs = createBlock( "silverbell_stairs",
            () -> new StairsBlock(() -> ModBlocks.silverbellPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarStairs = createBlock( "cedar_stairs",
            () -> new StairsBlock(() -> ModBlocks.cedarPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //STAIRS--WOOD--STAINED//
    public static final RegistryObject<Block> redStainedStairs = createBlock( "red_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.redStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedStairs = createBlock( "orange_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.orangeStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedStairs = createBlock( "yellow_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.yellowStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedStairs = createBlock( "lime_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.limeStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedStairs = createBlock( "green_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.greenStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedStairs = createBlock( "cyan_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.cyanStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedStairs = createBlock( "light_blue_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightBlueStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> blueStainedStairs = createBlock( "blue_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.blueStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedStairs = createBlock( "purple_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.purpleStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedStairs = createBlock( "magenta_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.magentaStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedStairs = createBlock( "pink_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.pinkStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedStairs = createBlock( "white_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.whiteStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedStairs = createBlock( "light_gray_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightGrayStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedStairs = createBlock( "gray_stained_stairs" ,
            () -> new StairsBlock(() -> ModBlocks.grayStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedStairs = createBlock( "black_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.blackStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedStairs = createBlock( "brown_stained_stairs",
            () -> new StairsBlock(() -> ModBlocks.brownStainedPlanks.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //STAIRS--CLAY//
    public static final RegistryObject<Block> redClayStairs = createBlock( "red_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.redClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeClayStairs = createBlock( "orange_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.orangeClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowClayStairs = createBlock( "yellow_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.yellowClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeClayStairs = createBlock( "lime_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.limeClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenClayStairs = createBlock( "green_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.greenClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanClayStairs = createBlock( "cyan_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.cyanClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueClayStairs = createBlock( "light_blue_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightBlueClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> blueClayStairs = createBlock( "blue_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.blueClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleClayStairs = createBlock( "purple_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.purpleClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaClayStairs = createBlock( "magenta_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.magentaClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkClayStairs = createBlock( "pink_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.pinkClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteClayStairs = createBlock( "white_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.whiteClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayClayStairs = createBlock( "light_gray_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightGrayClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayClayStairs = createBlock( "gray_clay_stairs" ,
            () -> new StairsBlock(() -> ModBlocks.grayClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackClayStairs = createBlock( "black_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.blackClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownClayStairs = createBlock( "brown_clay_stairs",
            () -> new StairsBlock(() -> ModBlocks.brownClayBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //STAIRS--BRICK//
    public static final RegistryObject<Block> redBrickStairs = createBlock( "red_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.redBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeBrickStairs = createBlock( "orange_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.orangeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowBrickStairs = createBlock( "yellow_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.yellowBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeBrickStairs = createBlock( "lime_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.limeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenBrickStairs = createBlock( "green_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.greenBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanBrickStairs = createBlock( "cyan_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.cyanBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueBrickStairs = createBlock( "light_blue_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightBlueBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> blueBrickStairs = createBlock( "blue_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.blueBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleBrickStairs = createBlock( "purple_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.purpleBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaBrickStairs = createBlock( "magenta_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.magentaBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkBrickStairs = createBlock( "pink_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.pinkBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteBrickStairs = createBlock( "white_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.whiteBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayBrickStairs = createBlock( "light_gray_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightGrayBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayBrickStairs = createBlock( "gray_brick_stairs" ,
            () -> new StairsBlock(() -> ModBlocks.grayBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackBrickStairs = createBlock( "black_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.blackBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownBrickStairs = createBlock( "brown_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.brownBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);




    //STAIRS--LARGE BRICK//
    public static final RegistryObject<Block> redLargeBrickStairs = createBlock( "red_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.redLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeLargeBrickStairs = createBlock( "orange_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.orangeLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowLargeBrickStairs = createBlock( "yellow_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.yellowLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeLargeBrickStairs = createBlock( "lime_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.limeLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenLargeBrickStairs = createBlock( "green_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.greenLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanLargeBrickStairs = createBlock( "cyan_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.cyanLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueLargeBrickStairs = createBlock( "light_blue_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightBlueLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    public static final RegistryObject<Block> blueLargeBrickStairs = createBlock( "blue_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.blueLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleLargeBrickStairs = createBlock( "purple_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.purpleLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaLargeBrickStairs = createBlock( "magenta_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.magentaLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkLargeBrickStairs = createBlock( "pink_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.pinkLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteLargeBrickStairs = createBlock( "white_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.whiteLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayLargeBrickStairs = createBlock( "light_gray_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.lightGrayLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayLargeBrickStairs = createBlock( "gray_large_brick_stairs" ,
            () -> new StairsBlock(() -> ModBlocks.grayLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackLargeBrickStairs = createBlock( "black_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.blackLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownLargeBrickStairs = createBlock( "brown_large_brick_stairs",
            () -> new StairsBlock(() -> ModBlocks.brownLargeBrickBlock.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //GEM STAIRS-- TILE 1//
    public static final RegistryObject<Block> amethystTile1Stairs = createBlock( "amethyst_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile1Stairs = createBlock( "aventurine_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile1Stairs = createBlock( "carnelian_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile1Stairs = createBlock( "chalcopyrite_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile1Stairs = createBlock( "citrine_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile1Stairs = createBlock("jade_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile1Stairs = createBlock( "jasper_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile1Stairs = createBlock( "labradorite_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile1Stairs = createBlock( "mica_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile1Stairs = createBlock( "moonstone_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile1Stairs = createBlock( "rose_quartz_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile1Stairs = createBlock( "sodalite_tile_1_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile1.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS-- TILE 2//
    public static final RegistryObject<Block> amethystTile2Stairs = createBlock( "amethyst_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile2Stairs = createBlock( "aventurine_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile2Stairs = createBlock( "carnelian_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile2Stairs = createBlock( "chalcopyrite_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile2Stairs = createBlock( "citrine_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile2Stairs = createBlock("jade_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile2Stairs = createBlock( "jasper_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile2Stairs = createBlock( "labradorite_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile2Stairs = createBlock( "mica_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile2Stairs = createBlock( "moonstone_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile2Stairs = createBlock( "rose_quartz_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile2Stairs = createBlock( "sodalite_tile_2_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile2.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS-- TILE 3//
    public static final RegistryObject<Block> amethystTile3Stairs = createBlock( "amethyst_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile3Stairs = createBlock( "aventurine_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile3Stairs = createBlock( "carnelian_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile3Stairs = createBlock( "chalcopyrite_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile3Stairs = createBlock( "citrine_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile3Stairs = createBlock("jade_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile3Stairs = createBlock( "jasper_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile3Stairs = createBlock( "labradorite_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile3Stairs = createBlock( "mica_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile3Stairs = createBlock( "moonstone_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile3Stairs = createBlock( "rose_quartz_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile3Stairs = createBlock( "sodalite_tile_3_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile3.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS-- TILE 4//
    public static final RegistryObject<Block> amethystTile4Stairs = createBlock( "amethyst_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile4Stairs = createBlock( "aventurine_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile4Stairs = createBlock( "carnelian_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile4Stairs = createBlock( "chalcopyrite_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile4Stairs = createBlock( "citrine_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile4Stairs = createBlock("jade_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile4Stairs = createBlock( "jasper_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile4Stairs = createBlock( "labradorite_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile4Stairs = createBlock( "mica_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile4Stairs = createBlock( "moonstone_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile4Stairs = createBlock( "rose_quartz_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile4Stairs = createBlock( "sodalite_tile_4_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile4.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS-- TILE 5//
    public static final RegistryObject<Block> amethystTile5Stairs = createBlock( "amethyst_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile5Stairs = createBlock( "aventurine_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile5Stairs = createBlock( "carnelian_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile5Stairs = createBlock( "chalcopyrite_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile5Stairs = createBlock( "citrine_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile5Stairs = createBlock("jade_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile5Stairs = createBlock( "jasper_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile5Stairs = createBlock( "labradorite_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile5Stairs = createBlock( "mica_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile5Stairs = createBlock( "moonstone_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile5Stairs = createBlock( "rose_quartz_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile5Stairs = createBlock( "sodalite_tile_5_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile5.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM STAIRS-- TILE 6//
    public static final RegistryObject<Block> amethystTile6Stairs = createBlock( "amethyst_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.amethystTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineTile6Stairs = createBlock( "aventurine_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.aventurineTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianTile6Stairs = createBlock( "carnelian_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.carnelianTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteTile6Stairs = createBlock( "chalcopyrite_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.chalcopyriteTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineTile6Stairs = createBlock( "citrine_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.citrineTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeTile6Stairs = createBlock("jade_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.jadeTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperTile6Stairs = createBlock( "jasper_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.jasperTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteTile6Stairs = createBlock( "labradorite_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.labradoriteTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaTile6Stairs = createBlock( "mica_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.micaTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneTile6Stairs = createBlock( "moonstone_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.moonstoneTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzTile6Stairs = createBlock( "rose_quartz_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.roseQuartzTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteTile6Stairs = createBlock( "sodalite_tile_6_stairs",
            () -> new StairsBlock(() -> ModBlocks.sodaliteTile6.get().getDefaultState(), Block.Properties.create(Material.ROCK, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    ///////////////////////////////////END STAIRS///////////////////////////////////

    //SLABS//


    //GEM SLABS--TILE 1//
    public static final RegistryObject<Block> amethystSlab1 = createBlock("amethyst_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab1 = createBlock("aventurine_tile_1_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab1 = createBlock("carnelian_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab1 = createBlock("chalcopyrite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab1 = createBlock("citrine_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab1 = createBlock("jade_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab1 = createBlock("jasper_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab1 = createBlock("labradorite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab1 = createBlock("mica_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab1 = createBlock( "moonstone_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab1 = createBlock("rose_quartz_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab1 = createBlock("sodalite_tile_1_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile1.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM SLABS--TILE 2//
    public static final RegistryObject<Block> amethystSlab2 = createBlock("amethyst_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab2 = createBlock("aventurine_tile_2_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab2 = createBlock("carnelian_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab2 = createBlock("chalcopyrite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab2 = createBlock("citrine_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab2 = createBlock("jade_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab2 = createBlock("jasper_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab2 = createBlock("labradorite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab2 = createBlock("mica_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab2 = createBlock( "moonstone_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab2 = createBlock("rose_quartz_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab2 = createBlock("sodalite_tile_2_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile2.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM SLABS--TILE 3//
    public static final RegistryObject<Block> amethystSlab3 = createBlock("amethyst_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab3 = createBlock("aventurine_tile_3_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab3 = createBlock("carnelian_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab3 = createBlock("chalcopyrite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab3 = createBlock("citrine_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab3 = createBlock("jade_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab3 = createBlock("jasper_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab3 = createBlock("labradorite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab3 = createBlock("mica_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab3 = createBlock( "moonstone_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab3 = createBlock("rose_quartz_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab3 = createBlock("sodalite_tile_3_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile3.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM SLABS--TILE 4//
    public static final RegistryObject<Block> amethystSlab4 = createBlock("amethyst_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab4 = createBlock("aventurine_tile_4_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab4 = createBlock("carnelian_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab4 = createBlock("chalcopyrite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab4 = createBlock("citrine_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab4 = createBlock("jade_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab4 = createBlock("jasper_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab4 = createBlock("labradorite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab4 = createBlock("mica_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab4 = createBlock( "moonstone_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab4 = createBlock("rose_quartz_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab4 = createBlock("sodalite_tile_4_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile4.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM SLABS--TILE 5//
    public static final RegistryObject<Block> amethystSlab5 = createBlock("amethyst_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab5 = createBlock("aventurine_tile_5_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab5 = createBlock("carnelian_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab5 = createBlock("chalcopyrite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab5 = createBlock("citrine_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab5 = createBlock("jade_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab5 = createBlock("jasper_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab5 = createBlock("labradorite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab5 = createBlock("mica_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab5 = createBlock( "moonstone_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab5 = createBlock("rose_quartz_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab5 = createBlock("sodalite_tile_5_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile5.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //GEM SLABS--TILE 6//
    public static final RegistryObject<Block> amethystSlab6 = createBlock("amethyst_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.amethystTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> aventurineSlab6 = createBlock("aventurine_tile_6_slab" ,
            () ->new SlabBlock(Block.Properties.from(ModBlocks.aventurineTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> carnelianSlab6 = createBlock("carnelian_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.carnelianTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> chalcopyriteSlab6 = createBlock("chalcopyrite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.chalcopyriteTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> citrineSlab6 = createBlock("citrine_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.citrineTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab6 = createBlock("jade_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jadeTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jasperSlab6 = createBlock("jasper_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.jasperTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> labradoriteSlab6 = createBlock("labradorite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.labradoriteTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> micaSlab6 = createBlock("mica_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.micaTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> moonstoneSlab6 = createBlock( "moonstone_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.moonstoneTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> roseQuartzSlab6 = createBlock("rose_quartz_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.roseQuartzTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sodaliteSlab6 = createBlock("sodalite_tile_6_slab",
            () ->new SlabBlock(Block.Properties.from(ModBlocks.sodaliteTile6.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //SLABS--CLAY//
    public static final RegistryObject<Block> redClaySlab = createBlock( "red_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.redClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeClaySlab = createBlock("orange_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.orangeClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> yellowClaySlab = createBlock("yellow_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.yellowClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeClaySlab = createBlock("lime_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.limeClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenClaySlab = createBlock("green_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.greenClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanClaySlab = createBlock("cyan_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.cyanClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueClaySlab = createBlock("light_blue_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightBlueClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueClaySlab = createBlock("blue_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blueClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleClaySlab = createBlock("purple_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.purpleClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaClaySlab = createBlock("magenta_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.magentaClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkClaySlab = createBlock("pink_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.pinkClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteClaySlab = createBlock("white_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.whiteClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayClaySlab = createBlock("light_gray_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightGrayClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayClaySlab = createBlock("gray_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.grayClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackClaySlab = createBlock("black_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blackClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownClaySlab = createBlock("brown_clay_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.brownClayBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //SLABS--BRICK//
    public static final RegistryObject<Block> redBrickSlab = createBlock( "red_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.redBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeBrickSlab = createBlock("orange_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.orangeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> yellowBrickSlab = createBlock("yellow_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.yellowBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeBrickSlab = createBlock("lime_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.limeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenBrickSlab = createBlock("green_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.greenBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanBrickSlab = createBlock("cyan_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.cyanBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueBrickSlab = createBlock("light_blue_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightBlueBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueBrickSlab = createBlock("blue_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blueBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleBrickSlab = createBlock("purple_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.purpleBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaBrickSlab = createBlock("magenta_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.magentaBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkBrickSlab = createBlock("pink_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.pinkBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteBrickSlab = createBlock("white_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.whiteBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayBrickSlab = createBlock("light_gray_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightGrayBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayBrickSlab = createBlock("gray_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.grayBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackBrickSlab = createBlock("black_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blackBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownBrickSlab = createBlock("brown_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.brownBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //SLABS--LARGE BRICK//
    public static final RegistryObject<Block> redLargeBrickSlab = createBlock( "red_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.redLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeLargeBrickSlab = createBlock("orange_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.orangeLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> yellowLargeBrickSlab = createBlock("yellow_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.yellowLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeLargeBrickSlab = createBlock("lime_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.limeLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenLargeBrickSlab = createBlock("green_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.greenLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanLargeBrickSlab = createBlock("cyan_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.cyanLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueLargeBrickSlab = createBlock("light_blue_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightBlueLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueLargeBrickSlab = createBlock("blue_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blueLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleLargeBrickSlab = createBlock("purple_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.purpleLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaLargeBrickSlab = createBlock("magenta_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.magentaLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkLargeBrickSlab = createBlock("pink_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.pinkLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteLargeBrickSlab = createBlock("white_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.whiteLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayLargeBrickSlab = createBlock("light_gray_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightGrayLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayLargeBrickSlab = createBlock("gray_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.grayLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackLargeBrickSlab = createBlock("black_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blackLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownLargeBrickSlab = createBlock("brown_large_brick_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.brownLargeBrickBlock.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //SLABS--WOOD//
    public static final RegistryObject<Block> crabappleSlab = createBlock( "crabapple_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.crabapplePlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaSlab = createBlock("poinciana_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.poincianaPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumSlab = createBlock("laburnum_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.laburnumPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeSlab = createBlock("jade_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.jadePlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaSlab = createBlock("paulownia_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.paulowniaPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaSlab = createBlock("wisteria_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.wisteriaPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaSlab = createBlock("jacaranda_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.jacarandaPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodSlab = createBlock("dogwood_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.dogwoodPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellSlab = createBlock("silverbell_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.silverbellPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarSlab = createBlock("cedar_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.cedarPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //SLABS--STAINED//
    public static final RegistryObject<Block> redStainedSlab = createBlock( "red_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.redStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedSlab = createBlock("orange_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.orangeStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> yellowStainedSlab = createBlock("yellow_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.yellowStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedSlab = createBlock("lime_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.limeStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedSlab = createBlock("green_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.greenStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedSlab = createBlock("cyan_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.cyanStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedSlab = createBlock("light_blue_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightBlueStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedSlab = createBlock("blue_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blueStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedSlab = createBlock("purple_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.purpleStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedSlab = createBlock("magenta_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.magentaStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedSlab = createBlock("pink_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.pinkStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedSlab = createBlock("white_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.whiteStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedSlab = createBlock("light_gray_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.lightGrayStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedSlab = createBlock("gray_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.grayStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedSlab = createBlock("black_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.blackStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedSlab = createBlock("brown_stained_slab",
            () -> new SlabBlock(Block.Properties.from(ModBlocks.brownStainedPlanks.get()).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  acaciaBookshelf = createBlock("acacia_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   birchBookshelf = createBlock( "birch_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   oakBookshelf = createBlock("oak_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  dark_oakBookshelf = createBlock("dark_oak_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   spruceBookshelf = createBlock("spruce_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jungleBookshelf = createBlock("jungle_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //BOOKSHELVES--TREES//
    public static final RegistryObject<Block>  crabappleBookshelf = createBlock("crabapple_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   poincianaBookshelf = createBlock( "poinciana_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   laburnumBookshelf = createBlock("laburnum_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>  jadeBookshelf = createBlock("jade_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   paulowniaBookshelf = createBlock("paulownia_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   wisteriaBookshelf = createBlock("wisteria_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   jacarandaBookshelf = createBlock("jacaranda_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   dogwoodBookshelf = createBlock("dogwood_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   silverbellBookshelf = createBlock("silverbell_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block>   cedarBookshelf = createBlock("cedar_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)) , ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //BOOKSHELVES--STAINED//
    public static final RegistryObject<Block> redStainedBookshelf = createBlock(  "red_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedBookshelf = createBlock(  "orange_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedBookshelf = createBlock(  "yellow_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedBookshelf = createBlock(  "lime_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedBookshelf = createBlock(  "green_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedBookshelf = createBlock(  "cyan_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedBookshelf = createBlock(  "light_blue_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedBookshelf = createBlock(  "blue_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedBookshelf = createBlock(  "purple_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedBookshelf = createBlock(  "magenta_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedBookshelf = createBlock(  "pink_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedBookshelf = createBlock(  "white_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedBookshelf = createBlock(  "light_gray_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedBookshelf = createBlock(  "gray_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedBookshelf = createBlock(  "black_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedBookshelf = createBlock(  "brown_stained_bookshelf",
            () -> new Block(Block.Properties.create(Material.WOOD).hardnessAndResistance(1.5F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //FENCE--WOOD//
    public static final RegistryObject<Block> crabappleFence = createBlock("crabapple_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaFence = createBlock("poinciana_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumFence = createBlock("laburnum_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeFence = createBlock("jade_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaFence = createBlock("paulownia_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaFence = createBlock("wisteria_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaFence = createBlock("jacaranda_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodFence = createBlock("dogwood_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellFence = createBlock("silverbell_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarFence = createBlock("cedar_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //FENCE--STAINED//
    public static final RegistryObject<Block> redStainedFence = createBlock(  "red_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedFence = createBlock(  "orange_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedFence = createBlock(  "yellow_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedFence = createBlock(  "lime_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedFence = createBlock(  "green_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedFence = createBlock(  "cyan_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedFence = createBlock(  "light_blue_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedFence = createBlock(  "blue_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedFence = createBlock(  "purple_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedFence = createBlock(  "magenta_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedFence = createBlock(  "pink_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedFence = createBlock(  "white_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedFence = createBlock(  "light_gray_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedFence = createBlock(  "gray_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedFence = createBlock(  "black_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedFence = createBlock(  "brown_stained_fence",
            () -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //FENCE GATE--WOOD//
    public static final RegistryObject<Block> crabappleFenceGate = createBlock("crabapple_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaFenceGate = createBlock("poinciana_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumFenceGate = createBlock("laburnum_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeFenceGate = createBlock("jade_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaFenceGate = createBlock("paulownia_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaFenceGate = createBlock("wisteria_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaFenceGate = createBlock("jacaranda_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodFenceGate = createBlock("dogwood_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellFenceGate = createBlock("silverbell_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarFenceGate = createBlock("cedar_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //FENCE GATE--STAINED//
    public static final RegistryObject<Block> redStainedFenceGate = createBlock(  "red_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedFenceGate = createBlock(  "orange_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedFenceGate = createBlock(  "yellow_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedFenceGate = createBlock(  "lime_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedFenceGate = createBlock(  "green_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedFenceGate = createBlock(  "cyan_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedFenceGate = createBlock(  "light_blue_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedFenceGate = createBlock(  "blue_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedFenceGate = createBlock(  "purple_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedFenceGate = createBlock(  "magenta_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedFenceGate = createBlock(  "pink_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedFenceGate = createBlock(  "white_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedFenceGate = createBlock(  "light_gray_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedFenceGate = createBlock(  "gray_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedFenceGate = createBlock(  "black_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedFenceGate = createBlock(  "brown_stained_fence_gate",
            () -> new FenceGateBlock(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(1.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //BUTTON--WOOD//
    public static final RegistryObject<Block> crabappleButton = createBlock("crabapple_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaButton = createBlock("poinciana_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumButton = createBlock("laburnum_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeButton = createBlock("jade_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaButton = createBlock("paulownia_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaButton = createBlock("wisteria_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaButton = createBlock("jacaranda_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodButton = createBlock("dogwood_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellButton = createBlock("silverbell_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarButton = createBlock(  "cedar_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //BUTTON--STAINED//
    public static final RegistryObject<Block> redStainedButton = createBlock(  "red_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedButton = createBlock(  "orange_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedButton = createBlock(  "yellow_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedButton = createBlock(  "lime_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedButton = createBlock(  "green_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedButton = createBlock(  "cyan_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedButton = createBlock(  "light_blue_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedButton = createBlock(  "blue_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedButton = createBlock(  "purple_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedButton = createBlock(  "magenta_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedButton = createBlock(  "pink_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedButton = createBlock(  "white_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedButton = createBlock(  "light_gray_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedButton = createBlock(  "gray_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedButton = createBlock(  "black_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedButton = createBlock(  "brown_stained_button",
            () -> new CustomWoodButton(Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //PRESSURE_PLATE--WOOD//
    public static final RegistryObject<Block> crabapplePressurePlate = createBlock("crabapple_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaPressurePlate = createBlock("poinciana_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumPressurePlate = createBlock("laburnum_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadePressurePlate = createBlock("jade_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaPressurePlate = createBlock("paulownia_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaPressurePlate = createBlock("wisteria_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaPressurePlate = createBlock("jacaranda_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodPressurePlate = createBlock("dogwood_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellPressurePlate = createBlock("silverbell_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarPressurePlate = createBlock("cedar_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //PRESSURE_PLATE--STAINED//
    public static final RegistryObject<Block> redStainedPressurePlate = createBlock(  "red_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedPressurePlate = createBlock(  "orange_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedPressurePlate = createBlock(  "yellow_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedPressurePlate = createBlock(  "lime_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedPressurePlate = createBlock(  "green_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedPressurePlate = createBlock(  "cyan_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedPressurePlate = createBlock(  "light_blue_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedPressurePlate = createBlock(  "blue_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedPressurePlate = createBlock(  "purple_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedPressurePlate = createBlock(  "magenta_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedPressurePlate = createBlock(  "pink_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedPressurePlate = createBlock(  "white_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedPressurePlate = createBlock(  "light_gray_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedPressurePlate = createBlock(  "gray_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedPressurePlate = createBlock(  "black_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedPressurePlate = createBlock(  "brown_stained_pressure_plate",
            () -> new CustomPressurePlate(PressurePlateBlock.Sensitivity.EVERYTHING,Block.Properties.create(Material.WOOD, MaterialColor.GOLD).hardnessAndResistance(0.5F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    /*
        //WALL--WOOD//
        public static final RegistryObject<Block> crabappleWall = createBlock("crabapple_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> poincianaWall = createBlock("poinciana_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> laburnumWall = createBlock("laburnum_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> jadeWall = createBlock("jade_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> paulowniaWall = createBlock("paulownia_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> wisteriaWall = createBlock("wisteria_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> jacarandaWall = createBlock("jacaranda_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> dogwoodWall = createBlock("dogwood_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> silverbellWall = createBlock("silverbell_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        //WALL--STAINED//
        public static final RegistryObject<Block> redStainedWall = createBlock(  "red_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> orangeStainedWall = createBlock(  "orange_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> yellowStainedWall = createBlock(  "yellow_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> limeStainedWall = createBlock(  "lime_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> greenStainedWall = createBlock(  "green_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> cyanStainedWall = createBlock(  "cyan_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> lightBlueStainedWall = createBlock(  "light_blue_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> blueStainedWall = createBlock(  "blue_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> purpleStainedWall = createBlock(  "purple_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> magentaStainedWall = createBlock(  "magenta_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> pinkStainedWall = createBlock(  "pink_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> whiteStainedWall = createBlock(  "white_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> lightGrayStainedWall = createBlock(  "light_gray_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> grayStainedWall = createBlock(  "gray_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> blackStainedWall = createBlock(  "black_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

        public static final RegistryObject<Block> brownStainedWall = createBlock(  "brown_stained_wall",
                () -> new WallBlock(Block.Properties.from(Blocks.BRICK_WALL)), ModItemGroups.MAIDENS_BLOCKS_GROUP);
    */
    //DOOR1--WOOD//
    public static final RegistryObject<Block> crabappleDoor1 = createBlock("crabapple_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor1 = createBlock("poinciana_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor1 = createBlock("laburnum_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor1 = createBlock("jade_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor1 = createBlock("paulownia_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor1 = createBlock("wisteria_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor1 = createBlock("jacaranda_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor1 = createBlock("dogwood_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor1 = createBlock("silverbell_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR1--WOOD//
    public static final RegistryObject<Block> acaciaDoor1 = createBlock("acacia_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor1 = createBlock("birch_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor1 = createBlock("oak_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> darkOakDoor1 = createBlock("dark_oak_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor1 = createBlock("spruce_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor1 = createBlock("jungle_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor1 = createBlock("cedar_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //DOOR1--STAINED//
    public static final RegistryObject<Block> redStainedDoor1 = createBlock(  "red_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor1 = createBlock(  "orange_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor1 = createBlock(  "yellow_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor1 = createBlock(  "lime_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor1 = createBlock(  "green_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor1 = createBlock(  "cyan_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor1 = createBlock(  "light_blue_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor1 = createBlock(  "blue_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor1 = createBlock(  "purple_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor1 = createBlock(  "magenta_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor1 = createBlock(  "pink_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor1 = createBlock(  "white_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor1 = createBlock(  "light_gray_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor1 = createBlock(  "gray_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor1 = createBlock(  "black_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor1 = createBlock(  "brown_stained_door_1",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR2--WOOD//
    public static final RegistryObject<Block> crabappleDoor2 = createBlock("crabapple_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor2 = createBlock("poinciana_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor2 = createBlock("laburnum_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor2 = createBlock("jade_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor2 = createBlock("paulownia_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor2 = createBlock("wisteria_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor2 = createBlock("jacaranda_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor2 = createBlock("dogwood_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor2 = createBlock("silverbell_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciaDoor2 = createBlock("acacia_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor2 = createBlock("birch_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor2 = createBlock("oak_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oakDoor2 = createBlock("dark_oak_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor2 = createBlock("spruce_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor2 = createBlock("jungle_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor2 = createBlock("cedar_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR2--STAINED//
    public static final RegistryObject<Block> redStainedDoor2 = createBlock(  "red_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor2 = createBlock(  "orange_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor2 = createBlock(  "yellow_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor2 = createBlock(  "lime_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor2 = createBlock(  "green_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor2 = createBlock(  "cyan_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor2 = createBlock(  "light_blue_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor2 = createBlock(  "blue_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor2 = createBlock(  "purple_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor2 = createBlock(  "magenta_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor2 = createBlock(  "pink_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor2 = createBlock(  "white_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor2 = createBlock(  "light_gray_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor2 = createBlock(  "gray_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor2 = createBlock(  "black_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor2 = createBlock(  "brown_stained_door_2",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR3--WOOD//
    public static final RegistryObject<Block> crabappleDoor3 = createBlock("crabapple_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor3 = createBlock("poinciana_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor3 = createBlock("laburnum_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor3 = createBlock("jade_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor3 = createBlock("paulownia_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor3 = createBlock("wisteria_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor3 = createBlock("jacaranda_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor3 = createBlock("dogwood_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor3 = createBlock("silverbell_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> acaciaDoor3 = createBlock("acacia_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor3 = createBlock("birch_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor3 = createBlock("oak_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oakDoor3 = createBlock("dark_oak_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor3 = createBlock("spruce_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor3 = createBlock("jungle_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor3 = createBlock("cedar_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR3--STAINED//
    public static final RegistryObject<Block> redStainedDoor3 = createBlock(  "red_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor3 = createBlock(  "orange_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor3 = createBlock(  "yellow_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor3 = createBlock(  "lime_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor3 = createBlock(  "green_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor3 = createBlock(  "cyan_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor3 = createBlock(  "light_blue_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor3 = createBlock(  "blue_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor3 = createBlock(  "purple_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor3 = createBlock(  "magenta_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor3 = createBlock(  "pink_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor3 = createBlock(  "white_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor3 = createBlock(  "light_gray_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor3 = createBlock(  "gray_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor3 = createBlock(  "black_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor3 = createBlock(  "brown_stained_door_3",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR4--WOOD//
    public static final RegistryObject<Block> crabappleDoor4 = createBlock("crabapple_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor4 = createBlock("poinciana_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor4 = createBlock("laburnum_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor4 = createBlock("jade_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor4 = createBlock("paulownia_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor4 = createBlock("wisteria_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor4 = createBlock("jacaranda_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor4 = createBlock("dogwood_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor4 = createBlock("silverbell_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    public static final RegistryObject<Block> acaciaDoor4 = createBlock("acacia_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor4 = createBlock("birch_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor4 = createBlock("oak_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oakDoor4 = createBlock("dark_oak_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor4 = createBlock("spruce_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor4 = createBlock("jungle_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor4 = createBlock("cedar_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR4--STAINED//
    public static final RegistryObject<Block> redStainedDoor4 = createBlock(  "red_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor4 = createBlock(  "orange_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor4 = createBlock(  "yellow_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor4 = createBlock(  "lime_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor4 = createBlock(  "green_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor4 = createBlock(  "cyan_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor4 = createBlock(  "light_blue_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor4 = createBlock(  "blue_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor4 = createBlock(  "purple_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor4 = createBlock(  "magenta_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor4 = createBlock(  "pink_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor4 = createBlock(  "white_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor4 = createBlock(  "light_gray_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor4 = createBlock(  "gray_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor4 = createBlock(  "black_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor4 = createBlock(  "brown_stained_door_4",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR5--WOOD//
    public static final RegistryObject<Block> crabappleDoor5 = createBlock("crabapple_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor5 = createBlock("poinciana_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor5 = createBlock("laburnum_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor5 = createBlock("jade_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor5 = createBlock("paulownia_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor5 = createBlock("wisteria_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor5 = createBlock("jacaranda_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor5 = createBlock("dogwood_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor5 = createBlock("silverbell_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciaDoor5 = createBlock("acacia_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor5 = createBlock("birch_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor5 = createBlock("oak_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oakDoor5 = createBlock("dark_oak_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor5 = createBlock("spruce_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor5 = createBlock("jungle_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor5 = createBlock("cedar_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //DOOR5--STAINED//
    public static final RegistryObject<Block> redStainedDoor5 = createBlock(  "red_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor5 = createBlock(  "orange_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor5 = createBlock(  "yellow_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor5 = createBlock(  "lime_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor5 = createBlock(  "green_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor5 = createBlock(  "cyan_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor5 = createBlock(  "light_blue_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor5 = createBlock(  "blue_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor5 = createBlock(  "purple_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor5 = createBlock(  "magenta_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor5 = createBlock(  "pink_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor5 = createBlock(  "white_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor5 = createBlock(  "light_gray_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor5 = createBlock(  "gray_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor5 = createBlock(  "black_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor5 = createBlock(  "brown_stained_door_5",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR6--WOOD//
    public static final RegistryObject<Block> crabappleDoor6 = createBlock("crabapple_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianaDoor6 = createBlock("poinciana_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumDoor6 = createBlock("laburnum_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadeDoor6 = createBlock("jade_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniaDoor6 = createBlock("paulownia_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriaDoor6 = createBlock("wisteria_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandaDoor6 = createBlock("jacaranda_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodDoor6 = createBlock("dogwood_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbellDoor6 = createBlock("silverbell_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciaDoor6 = createBlock("acacia_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchDoor6 = createBlock("birch_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oakDoor6 = createBlock("oak_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oakDoor6 = createBlock("dark_oak_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> spruceDoor6 = createBlock("spruce_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungleDoor6 = createBlock("jungle_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedarDoor6 = createBlock("cedar_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //DOOR6--STAINED//
    public static final RegistryObject<Block> redStainedDoor6 = createBlock(  "red_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedDoor6 = createBlock(  "orange_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedDoor6 = createBlock(  "yellow_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedDoor6 = createBlock(  "lime_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedDoor6 = createBlock(  "green_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedDoor6 = createBlock(  "cyan_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedDoor6 = createBlock(  "light_blue_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedDoor6 = createBlock(  "blue_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedDoor6 = createBlock(  "purple_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedDoor6 = createBlock(  "magenta_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedDoor6 = createBlock(  "pink_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedDoor6 = createBlock(  "white_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedDoor6 = createBlock(  "light_gray_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedDoor6 = createBlock(  "gray_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedDoor6 = createBlock(  "black_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedDoor6 = createBlock(  "brown_stained_door_6",
            () -> new CustomDoorBlock(Block.Properties.from(Blocks.OAK_DOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);



    //TRAPDOORS//


    //TRAPDOOR1--WOOD//
    public static final RegistryObject<Block> crabappletrapDoor1 = createBlock("crabapple_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianatrapDoor1 = createBlock("poinciana_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumtrapDoor1 = createBlock("laburnum_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadetrapDoor1 = createBlock("jade_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniatrapDoor1 = createBlock("paulownia_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriatrapDoor1 = createBlock("wisteria_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandatrapDoor1 = createBlock("jacaranda_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodtrapDoor1 = createBlock("dogwood_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbelltrapDoor1 = createBlock("silverbell_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR1--WOOD//
    public static final RegistryObject<Block> acaciatrapDoor1 = createBlock("acacia_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchtrapDoor1 = createBlock("birch_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oaktrapDoor1 = createBlock("oak_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> darkOaktrapDoor1 = createBlock("dark_oak_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sprucetrapDoor1 = createBlock("spruce_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungletrapDoor1 = createBlock("jungle_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedartrapDoor1 = createBlock("cedar_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR1--STAINED//
    public static final RegistryObject<Block> redStainedtrapDoor1 = createBlock(  "red_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedtrapDoor1 = createBlock(  "orange_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedtrapDoor1 = createBlock(  "yellow_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedtrapDoor1 = createBlock(  "lime_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedtrapDoor1 = createBlock(  "green_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedtrapDoor1 = createBlock(  "cyan_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedtrapDoor1 = createBlock(  "light_blue_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedtrapDoor1 = createBlock(  "blue_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedtrapDoor1 = createBlock(  "purple_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedtrapDoor1 = createBlock(  "magenta_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedtrapDoor1 = createBlock(  "pink_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedtrapDoor1 = createBlock(  "white_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedtrapDoor1 = createBlock(  "light_gray_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedtrapDoor1 = createBlock(  "gray_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedtrapDoor1 = createBlock(  "black_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedtrapDoor1 = createBlock(  "brown_stained_trapdoor_1",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR2--WOOD//
    public static final RegistryObject<Block> crabappletrapDoor2 = createBlock("crabapple_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianatrapDoor2 = createBlock("poinciana_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumtrapDoor2 = createBlock("laburnum_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadetrapDoor2 = createBlock("jade_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniatrapDoor2 = createBlock("paulownia_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriatrapDoor2 = createBlock("wisteria_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandatrapDoor2 = createBlock("jacaranda_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodtrapDoor2 = createBlock("dogwood_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbelltrapDoor2 = createBlock("silverbell_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciatrapDoor2 = createBlock("acacia_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchtrapDoor2 = createBlock("birch_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oaktrapDoor2 = createBlock("oak_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oaktrapDoor2 = createBlock("dark_oak_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sprucetrapDoor2 = createBlock("spruce_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungletrapDoor2 = createBlock("jungle_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedartrapDoor2 = createBlock("cedar_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //TRAPDOOR2--STAINED//
    public static final RegistryObject<Block> redStainedtrapDoor2 = createBlock(  "red_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedtrapDoor2 = createBlock(  "orange_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedtrapDoor2 = createBlock(  "yellow_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedtrapDoor2 = createBlock(  "lime_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedtrapDoor2 = createBlock(  "green_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedtrapDoor2 = createBlock(  "cyan_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedtrapDoor2 = createBlock(  "light_blue_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedtrapDoor2 = createBlock(  "blue_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedtrapDoor2 = createBlock(  "purple_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedtrapDoor2 = createBlock(  "magenta_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedtrapDoor2 = createBlock(  "pink_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedtrapDoor2 = createBlock(  "white_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedtrapDoor2 = createBlock(  "light_gray_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedtrapDoor2 = createBlock(  "gray_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedtrapDoor2 = createBlock(  "black_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedtrapDoor2 = createBlock(  "brown_stained_trapdoor_2",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR3--WOOD//
    public static final RegistryObject<Block> crabappletrapDoor3 = createBlock("crabapple_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianatrapDoor3 = createBlock("poinciana_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumtrapDoor3 = createBlock("laburnum_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadetrapDoor3 = createBlock("jade_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniatrapDoor3 = createBlock("paulownia_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriatrapDoor3 = createBlock("wisteria_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandatrapDoor3 = createBlock("jacaranda_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodtrapDoor3 = createBlock("dogwood_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbelltrapDoor3 = createBlock("silverbell_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciatrapDoor3 = createBlock("acacia_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchtrapDoor3 = createBlock("birch_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oaktrapDoor3 = createBlock("oak_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oaktrapDoor3 = createBlock("dark_oak_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sprucetrapDoor3 = createBlock("spruce_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungletrapDoor3 = createBlock("jungle_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedartrapDoor3 = createBlock("cedar_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //TRAPDOOR3--STAINED//
    public static final RegistryObject<Block> redStainedtrapDoor3 = createBlock(  "red_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedtrapDoor3 = createBlock(  "orange_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedtrapDoor3 = createBlock(  "yellow_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedtrapDoor3 = createBlock(  "lime_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedtrapDoor3 = createBlock(  "green_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedtrapDoor3 = createBlock(  "cyan_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedtrapDoor3 = createBlock(  "light_blue_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedtrapDoor3 = createBlock(  "blue_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedtrapDoor3 = createBlock(  "purple_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedtrapDoor3 = createBlock(  "magenta_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedtrapDoor3 = createBlock(  "pink_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedtrapDoor3 = createBlock(  "white_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedtrapDoor3 = createBlock(  "light_gray_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedtrapDoor3 = createBlock(  "gray_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedtrapDoor3 = createBlock(  "black_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedtrapDoor3 = createBlock(  "brown_stained_trapdoor_3",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR4--WOOD//
    public static final RegistryObject<Block> crabappletrapDoor4 = createBlock("crabapple_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> poincianatrapDoor4 = createBlock("poinciana_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> laburnumtrapDoor4 = createBlock("laburnum_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jadetrapDoor4 = createBlock("jade_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> paulowniatrapDoor4 = createBlock("paulownia_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> wisteriatrapDoor4 = createBlock("wisteria_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jacarandatrapDoor4 = createBlock("jacaranda_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dogwoodtrapDoor4 = createBlock("dogwood_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> silverbelltrapDoor4 = createBlock("silverbell_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> acaciatrapDoor4 = createBlock("acacia_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> birchtrapDoor4 = createBlock("birch_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> oaktrapDoor4 = createBlock("oak_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> dark_oaktrapDoor4 = createBlock("dark_oak_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> sprucetrapDoor4 = createBlock("spruce_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> jungletrapDoor4 = createBlock("jungle_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cedartrapDoor4 = createBlock("cedar_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    //TRAPDOOR4--STAINED//
    public static final RegistryObject<Block> redStainedtrapDoor4 = createBlock(  "red_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeStainedtrapDoor4 = createBlock(  "orange_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowStainedtrapDoor4 = createBlock(  "yellow_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeStainedtrapDoor4 = createBlock(  "lime_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenStainedtrapDoor4 = createBlock(  "green_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanStainedtrapDoor4 = createBlock(  "cyan_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueStainedtrapDoor4 = createBlock(  "light_blue_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueStainedtrapDoor4 = createBlock(  "blue_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleStainedtrapDoor4 = createBlock(  "purple_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaStainedtrapDoor4 = createBlock(  "magenta_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkStainedtrapDoor4 = createBlock(  "pink_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteStainedtrapDoor4 = createBlock(  "white_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayStainedtrapDoor4 = createBlock(  "light_gray_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayStainedtrapDoor4 = createBlock(  "gray_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackStainedtrapDoor4 = createBlock(  "black_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownStainedtrapDoor4 = createBlock(  "brown_stained_trapdoor_4",
            () -> new CustomTrapDoorBlock(Block.Properties.from(Blocks.OAK_TRAPDOOR)), ModItemGroups.MAIDENS_BLOCKS_GROUP);


    //VASES-NO FLOWERS//
    public static final RegistryObject<Block> RedVaseNoFlower = createBlock( "red_vase_no_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.ROCK).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> orangeVaseNoFlower = createBlock( "orange_vase_no_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> yellowVaseNoFlower = createBlock( "yellow_vase_no_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> limeVaseNoFlower = createBlock( "lime_vase_no_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> greenVaseNoFlower = createBlock( "green_vase_no_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> cyanVaseNoFlower = createBlock( "cyan_vase_no_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightBlueVaseNoFlower = createBlock( "light_blue_vase_no_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blueVaseNoFlower = createBlock( "blue_vase_no_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> purpleVaseNoFlower = createBlock( "purple_vase_no_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> magentaVaseNoFlower = createBlock( "magenta_vase_no_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> pinkVaseNoFlower = createBlock( "pink_vase_no_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> whiteVaseNoFlower = createBlock( "white_vase_no_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> lightGrayVaseNoFlower = createBlock( "light_gray_vase_no_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> grayVaseNoFlower = createBlock( "gray_vase_no_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> blackVaseNoFlower = createBlock( "black_vase_no_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

    public static final RegistryObject<Block> brownVaseNoFlower = createBlock( "brown_vase_no_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)), ModItemGroups.MAIDENS_BLOCKS_GROUP);

//TODO
//----------------------------------VASES - NO TABS----------------------------------//


    //RED VASE
    public static final RegistryObject<Block> RedVaseRedFlower = BLOCKS.register( "red_vase_red_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseOrangeFlower = BLOCKS.register( "red_vase_orange_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseYellowFlower = BLOCKS.register( "red_vase_yellow_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseGreenFlower = BLOCKS.register( "red_vase_green_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseCyanFlower = BLOCKS.register( "red_vase_cyan_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseBlueFlower = BLOCKS.register( "red_vase_blue_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVasePurpleFlower = BLOCKS.register( "red_vase_purple_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVasePinkFlower = BLOCKS.register( "red_vase_pink_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseWhiteFlower = BLOCKS.register( "red_vase_white_flower",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseRedSapling = BLOCKS.register( "red_vase_red_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseOrangeSapling = BLOCKS.register( "red_vase_orange_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseYellowSapling = BLOCKS.register( "red_vase_yellow_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseGreenSapling = BLOCKS.register( "red_vase_green_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseCyanSapling = BLOCKS.register( "red_vase_cyan_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseBlueSapling = BLOCKS.register( "red_vase_blue_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVasePurpleSapling = BLOCKS.register( "red_vase_purple_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVasePinkSapling = BLOCKS.register( "red_vase_pink_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> RedVaseWhiteSapling = BLOCKS.register( "red_vase_white_sapling",
            () -> new BlockClayVaseRed(BlockClayVaseRed.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //ORANGE VASE
    public static final RegistryObject<Block> OrangeVaseRedFlower = BLOCKS.register( "orange_vase_red_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseOrangeFlower = BLOCKS.register( "orange_vase_orange_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseYellowFlower = BLOCKS.register( "orange_vase_yellow_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseGreenFlower = BLOCKS.register( "orange_vase_green_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseCyanFlower = BLOCKS.register( "orange_vase_cyan_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseBlueFlower = BLOCKS.register( "orange_vase_blue_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVasePurpleFlower = BLOCKS.register( "orange_vase_purple_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVasePinkFlower = BLOCKS.register( "orange_vase_pink_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseWhiteFlower = BLOCKS.register( "orange_vase_white_flower",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseRedSapling = BLOCKS.register( "orange_vase_red_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseOrangeSapling = BLOCKS.register( "orange_vase_orange_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseYellowSapling = BLOCKS.register( "orange_vase_yellow_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseGreenSapling = BLOCKS.register( "orange_vase_green_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseCyanSapling = BLOCKS.register( "orange_vase_cyan_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseBlueSapling = BLOCKS.register( "orange_vase_blue_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVasePurpleSapling = BLOCKS.register( "orange_vase_purple_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVasePinkSapling = BLOCKS.register( "orange_vase_pink_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> OrangeVaseWhiteSapling = BLOCKS.register( "orange_vase_white_sapling",
            () -> new BlockClayVaseOrange(BlockClayVaseOrange.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //YELLOW VASE
    public static final RegistryObject<Block> YellowVaseRedFlower = BLOCKS.register( "yellow_vase_red_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseOrangeFlower = BLOCKS.register( "yellow_vase_orange_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseYellowFlower = BLOCKS.register( "yellow_vase_yellow_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseGreenFlower = BLOCKS.register( "yellow_vase_green_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseCyanFlower = BLOCKS.register( "yellow_vase_cyan_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseBlueFlower = BLOCKS.register( "yellow_vase_blue_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVasePurpleFlower = BLOCKS.register( "yellow_vase_purple_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVasePinkFlower = BLOCKS.register( "yellow_vase_pink_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseWhiteFlower = BLOCKS.register( "yellow_vase_white_flower",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseRedSapling = BLOCKS.register( "yellow_vase_red_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseOrangeSapling = BLOCKS.register( "yellow_vase_orange_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseYellowSapling = BLOCKS.register( "yellow_vase_yellow_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseGreenSapling = BLOCKS.register( "yellow_vase_green_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseCyanSapling = BLOCKS.register( "yellow_vase_cyan_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseBlueSapling = BLOCKS.register( "yellow_vase_blue_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVasePurpleSapling = BLOCKS.register( "yellow_vase_purple_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVasePinkSapling = BLOCKS.register( "yellow_vase_pink_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> YellowVaseWhiteSapling = BLOCKS.register( "yellow_vase_white_sapling",
            () -> new BlockClayVaseYellow(BlockClayVaseYellow.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //LIME VASE
    public static final RegistryObject<Block> LimeVaseRedFlower = BLOCKS.register( "lime_vase_red_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseOrangeFlower = BLOCKS.register( "lime_vase_orange_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseYellowFlower = BLOCKS.register( "lime_vase_yellow_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseGreenFlower = BLOCKS.register( "lime_vase_green_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseCyanFlower = BLOCKS.register( "lime_vase_cyan_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseBlueFlower = BLOCKS.register( "lime_vase_blue_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVasePurpleFlower = BLOCKS.register( "lime_vase_purple_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVasePinkFlower = BLOCKS.register( "lime_vase_pink_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseWhiteFlower = BLOCKS.register( "lime_vase_white_flower",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseRedSapling = BLOCKS.register( "lime_vase_red_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseOrangeSapling = BLOCKS.register( "lime_vase_orange_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseYellowSapling = BLOCKS.register( "lime_vase_yellow_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseGreenSapling = BLOCKS.register( "lime_vase_green_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseCyanSapling = BLOCKS.register( "lime_vase_cyan_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseBlueSapling = BLOCKS.register( "lime_vase_blue_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVasePurpleSapling = BLOCKS.register( "lime_vase_purple_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVasePinkSapling = BLOCKS.register( "lime_vase_pink_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LimeVaseWhiteSapling = BLOCKS.register( "lime_vase_white_sapling",
            () -> new BlockClayVaseLime(BlockClayVaseLime.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //GREEN VASE
    public static final RegistryObject<Block> GreenVaseRedFlower = BLOCKS.register( "green_vase_red_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseOrangeFlower = BLOCKS.register( "green_vase_orange_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseYellowFlower = BLOCKS.register( "green_vase_yellow_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseGreenFlower = BLOCKS.register( "green_vase_green_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseCyanFlower = BLOCKS.register( "green_vase_cyan_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseBlueFlower = BLOCKS.register( "green_vase_blue_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVasePurpleFlower = BLOCKS.register( "green_vase_purple_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVasePinkFlower = BLOCKS.register( "green_vase_pink_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseWhiteFlower = BLOCKS.register( "green_vase_white_flower",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseRedSapling = BLOCKS.register( "green_vase_red_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseOrangeSapling = BLOCKS.register( "green_vase_orange_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseYellowSapling = BLOCKS.register( "green_vase_yellow_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseGreenSapling = BLOCKS.register( "green_vase_green_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseCyanSapling = BLOCKS.register( "green_vase_cyan_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseBlueSapling = BLOCKS.register( "green_vase_blue_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVasePurpleSapling = BLOCKS.register( "green_vase_purple_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVasePinkSapling = BLOCKS.register( "green_vase_pink_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GreenVaseWhiteSapling = BLOCKS.register( "green_vase_white_sapling",
            () -> new BlockClayVaseGreen(BlockClayVaseGreen.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //CYAN VASE
    public static final RegistryObject<Block> CyanVaseRedFlower = BLOCKS.register( "cyan_vase_red_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseOrangeFlower = BLOCKS.register( "cyan_vase_orange_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseYellowFlower = BLOCKS.register( "cyan_vase_yellow_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseGreenFlower = BLOCKS.register( "cyan_vase_green_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseCyanFlower = BLOCKS.register( "cyan_vase_cyan_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseBlueFlower = BLOCKS.register( "cyan_vase_blue_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVasePurpleFlower = BLOCKS.register( "cyan_vase_purple_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVasePinkFlower = BLOCKS.register( "cyan_vase_pink_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseWhiteFlower = BLOCKS.register( "cyan_vase_white_flower",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseRedSapling = BLOCKS.register( "cyan_vase_red_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseOrangeSapling = BLOCKS.register( "cyan_vase_orange_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseYellowSapling = BLOCKS.register( "cyan_vase_yellow_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseGreenSapling = BLOCKS.register( "cyan_vase_green_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseCyanSapling = BLOCKS.register( "cyan_vase_cyan_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseBlueSapling = BLOCKS.register( "cyan_vase_blue_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVasePurpleSapling = BLOCKS.register( "cyan_vase_purple_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVasePinkSapling = BLOCKS.register( "cyan_vase_pink_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> CyanVaseWhiteSapling = BLOCKS.register( "cyan_vase_white_sapling",
            () -> new BlockClayVaseCyan(BlockClayVaseCyan.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //LIGHT BLUE VASE
    public static final RegistryObject<Block> LightBlueVaseRedFlower = BLOCKS.register( "light_blue_vase_red_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseOrangeFlower = BLOCKS.register( "light_blue_vase_orange_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseYellowFlower = BLOCKS.register( "light_blue_vase_yellow_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseGreenFlower = BLOCKS.register( "light_blue_vase_green_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseCyanFlower = BLOCKS.register( "light_blue_vase_cyan_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseBlueFlower = BLOCKS.register( "light_blue_vase_blue_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVasePurpleFlower = BLOCKS.register( "light_blue_vase_purple_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVasePinkFlower = BLOCKS.register( "light_blue_vase_pink_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseWhiteFlower = BLOCKS.register( "light_blue_vase_white_flower",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseRedSapling = BLOCKS.register( "light_blue_vase_red_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseOrangeSapling = BLOCKS.register( "light_blue_vase_orange_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseYellowSapling = BLOCKS.register( "light_blue_vase_yellow_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseGreenSapling = BLOCKS.register( "light_blue_vase_green_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseCyanSapling = BLOCKS.register( "light_blue_vase_cyan_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseBlueSapling = BLOCKS.register( "light_blue_vase_blue_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVasePurpleSapling = BLOCKS.register( "light_blue_vase_purple_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVasePinkSapling = BLOCKS.register( "light_blue_vase_pink_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightBlueVaseWhiteSapling = BLOCKS.register( "light_blue_vase_white_sapling",
            () -> new BlockClayVaseLightBlue(BlockClayVaseLightBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));


    //BLUE VASE
    public static final RegistryObject<Block> BlueVaseRedFlower = BLOCKS.register( "blue_vase_red_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseOrangeFlower = BLOCKS.register( "blue_vase_orange_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseYellowFlower = BLOCKS.register( "blue_vase_yellow_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseGreenFlower = BLOCKS.register( "blue_vase_green_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseCyanFlower = BLOCKS.register( "blue_vase_cyan_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseBlueFlower = BLOCKS.register( "blue_vase_blue_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVasePurpleFlower = BLOCKS.register( "blue_vase_purple_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVasePinkFlower = BLOCKS.register( "blue_vase_pink_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseWhiteFlower = BLOCKS.register( "blue_vase_white_flower",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseRedSapling = BLOCKS.register( "blue_vase_red_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseOrangeSapling = BLOCKS.register( "blue_vase_orange_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseYellowSapling = BLOCKS.register( "blue_vase_yellow_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseGreenSapling = BLOCKS.register( "blue_vase_green_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseCyanSapling = BLOCKS.register( "blue_vase_cyan_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseBlueSapling = BLOCKS.register( "blue_vase_blue_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVasePurpleSapling = BLOCKS.register( "blue_vase_purple_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVasePinkSapling = BLOCKS.register( "blue_vase_pink_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlueVaseWhiteSapling = BLOCKS.register( "blue_vase_white_sapling",
            () -> new BlockClayVaseBlue(BlockClayVaseBlue.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //PURPLE VASE
    public static final RegistryObject<Block> PurpleVaseRedFlower = BLOCKS.register( "purple_vase_red_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseOrangeFlower = BLOCKS.register( "purple_vase_orange_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseYellowFlower = BLOCKS.register( "purple_vase_yellow_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseGreenFlower = BLOCKS.register( "purple_vase_green_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseCyanFlower = BLOCKS.register( "purple_vase_cyan_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseBlueFlower = BLOCKS.register( "purple_vase_blue_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVasePurpleFlower = BLOCKS.register( "purple_vase_purple_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVasePinkFlower = BLOCKS.register( "purple_vase_pink_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseWhiteFlower = BLOCKS.register( "purple_vase_white_flower",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseRedSapling = BLOCKS.register( "purple_vase_red_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseOrangeSapling = BLOCKS.register( "purple_vase_orange_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseYellowSapling = BLOCKS.register( "purple_vase_yellow_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseGreenSapling = BLOCKS.register( "purple_vase_green_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseCyanSapling = BLOCKS.register( "purple_vase_cyan_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseBlueSapling = BLOCKS.register( "purple_vase_blue_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVasePurpleSapling = BLOCKS.register( "purple_vase_purple_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVasePinkSapling = BLOCKS.register( "purple_vase_pink_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PurpleVaseWhiteSapling = BLOCKS.register( "purple_vase_white_sapling",
            () -> new BlockClayVasePurple(BlockClayVasePurple.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //MAGENTA VASE
    public static final RegistryObject<Block> MagentaVaseRedFlower = BLOCKS.register( "magenta_vase_red_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseOrangeFlower = BLOCKS.register( "magenta_vase_orange_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseYellowFlower = BLOCKS.register( "magenta_vase_yellow_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseGreenFlower = BLOCKS.register( "magenta_vase_green_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseCyanFlower = BLOCKS.register( "magenta_vase_cyan_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseBlueFlower = BLOCKS.register( "magenta_vase_blue_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVasePurpleFlower = BLOCKS.register( "magenta_vase_purple_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVasePinkFlower = BLOCKS.register( "magenta_vase_pink_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseWhiteFlower = BLOCKS.register( "magenta_vase_white_flower",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseRedSapling = BLOCKS.register( "magenta_vase_red_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseOrangeSapling = BLOCKS.register( "magenta_vase_orange_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseYellowSapling = BLOCKS.register( "magenta_vase_yellow_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseGreenSapling = BLOCKS.register( "magenta_vase_green_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseCyanSapling = BLOCKS.register( "magenta_vase_cyan_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseBlueSapling = BLOCKS.register( "magenta_vase_blue_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVasePurpleSapling = BLOCKS.register( "magenta_vase_purple_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVasePinkSapling = BLOCKS.register( "magenta_vase_pink_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> MagentaVaseWhiteSapling = BLOCKS.register( "magenta_vase_white_sapling",
            () -> new BlockClayVaseMagenta(BlockClayVaseMagenta.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //PINK VASE
    public static final RegistryObject<Block> PinkVaseRedFlower = BLOCKS.register( "pink_vase_red_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseOrangeFlower = BLOCKS.register( "pink_vase_orange_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseYellowFlower = BLOCKS.register( "pink_vase_yellow_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseGreenFlower = BLOCKS.register( "pink_vase_green_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseCyanFlower = BLOCKS.register( "pink_vase_cyan_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseBlueFlower = BLOCKS.register( "pink_vase_blue_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVasePurpleFlower = BLOCKS.register( "pink_vase_purple_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVasePinkFlower = BLOCKS.register( "pink_vase_pink_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseWhiteFlower = BLOCKS.register( "pink_vase_white_flower",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseRedSapling = BLOCKS.register( "pink_vase_red_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseOrangeSapling = BLOCKS.register( "pink_vase_orange_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseYellowSapling = BLOCKS.register( "pink_vase_yellow_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseGreenSapling = BLOCKS.register( "pink_vase_green_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseCyanSapling = BLOCKS.register( "pink_vase_cyan_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseBlueSapling = BLOCKS.register( "pink_vase_blue_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVasePurpleSapling = BLOCKS.register( "pink_vase_purple_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVasePinkSapling = BLOCKS.register( "pink_vase_pink_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> PinkVaseWhiteSapling = BLOCKS.register( "pink_vase_white_sapling",
            () -> new BlockClayVasePink(BlockClayVasePink.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //WHITE VASE
    public static final RegistryObject<Block> WhiteVaseRedFlower = BLOCKS.register( "white_vase_red_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseOrangeFlower = BLOCKS.register( "white_vase_orange_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseYellowFlower = BLOCKS.register( "white_vase_yellow_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseGreenFlower = BLOCKS.register( "white_vase_green_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseCyanFlower = BLOCKS.register( "white_vase_cyan_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseBlueFlower = BLOCKS.register( "white_vase_blue_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVasePurpleFlower = BLOCKS.register( "white_vase_purple_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVasePinkFlower = BLOCKS.register( "white_vase_pink_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseWhiteFlower = BLOCKS.register( "white_vase_white_flower",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseRedSapling = BLOCKS.register( "white_vase_red_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseOrangeSapling = BLOCKS.register( "white_vase_orange_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseYellowSapling = BLOCKS.register( "white_vase_yellow_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseGreenSapling = BLOCKS.register( "white_vase_green_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseCyanSapling = BLOCKS.register( "white_vase_cyan_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseBlueSapling = BLOCKS.register( "white_vase_blue_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVasePurpleSapling = BLOCKS.register( "white_vase_purple_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVasePinkSapling = BLOCKS.register( "white_vase_pink_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> WhiteVaseWhiteSapling = BLOCKS.register( "white_vase_white_sapling",
            () -> new BlockClayVaseWhite(BlockClayVaseWhite.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //LIGHT GRAY VASE
    public static final RegistryObject<Block> LightGrayVaseRedFlower = BLOCKS.register( "light_gray_vase_red_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseOrangeFlower = BLOCKS.register( "light_gray_vase_orange_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseYellowFlower = BLOCKS.register( "light_gray_vase_yellow_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseGreenFlower = BLOCKS.register( "light_gray_vase_green_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseCyanFlower = BLOCKS.register( "light_gray_vase_cyan_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseBlueFlower = BLOCKS.register( "light_gray_vase_blue_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVasePurpleFlower = BLOCKS.register( "light_gray_vase_purple_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVasePinkFlower = BLOCKS.register( "light_gray_vase_pink_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseWhiteFlower = BLOCKS.register( "light_gray_vase_white_flower",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseRedSapling = BLOCKS.register( "light_gray_vase_red_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseOrangeSapling = BLOCKS.register( "light_gray_vase_orange_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseYellowSapling = BLOCKS.register( "light_gray_vase_yellow_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseGreenSapling = BLOCKS.register( "light_gray_vase_green_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseCyanSapling = BLOCKS.register( "light_gray_vase_cyan_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseBlueSapling = BLOCKS.register( "light_gray_vase_blue_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVasePurpleSapling = BLOCKS.register( "light_gray_vase_purple_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVasePinkSapling = BLOCKS.register( "light_gray_vase_pink_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> LightGrayVaseWhiteSapling = BLOCKS.register( "light_gray_vase_white_sapling",
            () -> new BlockClayVaseLightGray(BlockClayVaseLightGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //GRAY VASE
    public static final RegistryObject<Block> GrayVaseRedFlower = BLOCKS.register( "gray_vase_red_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseOrangeFlower = BLOCKS.register( "gray_vase_orange_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseYellowFlower = BLOCKS.register( "gray_vase_yellow_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseGreenFlower = BLOCKS.register( "gray_vase_green_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseCyanFlower = BLOCKS.register( "gray_vase_cyan_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseBlueFlower = BLOCKS.register( "gray_vase_blue_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVasePurpleFlower = BLOCKS.register( "gray_vase_purple_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVasePinkFlower = BLOCKS.register( "gray_vase_pink_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseWhiteFlower = BLOCKS.register( "gray_vase_white_flower",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseRedSapling = BLOCKS.register( "gray_vase_red_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseOrangeSapling = BLOCKS.register( "gray_vase_orange_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseYellowSapling = BLOCKS.register( "gray_vase_yellow_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseGreenSapling = BLOCKS.register( "gray_vase_green_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseCyanSapling = BLOCKS.register( "gray_vase_cyan_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseBlueSapling = BLOCKS.register( "gray_vase_blue_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVasePurpleSapling = BLOCKS.register( "gray_vase_purple_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVasePinkSapling = BLOCKS.register( "gray_vase_pink_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> GrayVaseWhiteSapling = BLOCKS.register( "gray_vase_white_sapling",
            () -> new BlockClayVaseGray(BlockClayVaseGray.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //BLACK VASE
    public static final RegistryObject<Block> BlackVaseRedFlower = BLOCKS.register( "black_vase_red_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseOrangeFlower = BLOCKS.register( "black_vase_orange_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseYellowFlower = BLOCKS.register( "black_vase_yellow_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseGreenFlower = BLOCKS.register( "black_vase_green_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseCyanFlower = BLOCKS.register( "black_vase_cyan_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseBlueFlower = BLOCKS.register( "black_vase_blue_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVasePurpleFlower = BLOCKS.register( "black_vase_purple_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVasePinkFlower = BLOCKS.register( "black_vase_pink_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseWhiteFlower = BLOCKS.register( "black_vase_white_flower",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseRedSapling = BLOCKS.register( "black_vase_red_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseOrangeSapling = BLOCKS.register( "black_vase_orange_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseYellowSapling = BLOCKS.register( "black_vase_yellow_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseGreenSapling = BLOCKS.register( "black_vase_green_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseCyanSapling = BLOCKS.register( "black_vase_cyan_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseBlueSapling = BLOCKS.register( "black_vase_blue_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVasePurpleSapling = BLOCKS.register( "black_vase_purple_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVasePinkSapling = BLOCKS.register( "black_vase_pink_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BlackVaseWhiteSapling = BLOCKS.register( "black_vase_white_sapling",
            () -> new BlockClayVaseBlack(BlockClayVaseBlack.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    //BROWN VASE
    public static final RegistryObject<Block> BrownVaseRedFlower = BLOCKS.register( "brown_vase_red_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseOrangeFlower = BLOCKS.register( "brown_vase_orange_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseYellowFlower = BLOCKS.register( "brown_vase_yellow_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseGreenFlower = BLOCKS.register( "brown_vase_green_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseCyanFlower = BLOCKS.register( "brown_vase_cyan_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseBlueFlower = BLOCKS.register( "brown_vase_blue_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVasePurpleFlower = BLOCKS.register( "brown_vase_purple_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVasePinkFlower = BLOCKS.register( "brown_vase_pink_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseWhiteFlower = BLOCKS.register( "brown_vase_white_flower",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseRedSapling = BLOCKS.register( "brown_vase_red_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseOrangeSapling = BLOCKS.register( "brown_vase_orange_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseYellowSapling = BLOCKS.register( "brown_vase_yellow_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseGreenSapling = BLOCKS.register( "brown_vase_green_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseCyanSapling = BLOCKS.register( "brown_vase_cyan_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseBlueSapling = BLOCKS.register( "brown_vase_blue_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVasePurpleSapling = BLOCKS.register( "brown_vase_purple_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVasePinkSapling = BLOCKS.register( "brown_vase_pink_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));

    public static final RegistryObject<Block> BrownVaseWhiteSapling = BLOCKS.register( "brown_vase_white_sapling",
            () -> new BlockClayVaseBrown(BlockClayVaseBrown.Properties.create(Material.CLAY).hardnessAndResistance(2.0F, 2.0F)));
















}












