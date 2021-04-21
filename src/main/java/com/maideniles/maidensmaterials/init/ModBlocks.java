package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {


//COLORED CLAY BLOCKS//
    public static final RegistryObject<Block> RED_CLAY_BLOCK = register("red_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_CLAY_BLOCK = register("orange_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_CLAY_BLOCK = register("yellow_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_CLAY_BLOCK = register("lime_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_CLAY_BLOCK = register("green_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_CLAY_BLOCK = register("cyan_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_CLAY_BLOCK = register("light_blue_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_CLAY_BLOCK = register("blue_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_CLAY_BLOCK = register("purple_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_CLAY_BLOCK = register("magenta_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_CLAY_BLOCK = register("pink_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_CLAY_BLOCK = register("white_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_CLAY_BLOCK = register("light_gray_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_CLAY_BLOCK = register("gray_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_CLAY_BLOCK = register("black_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_CLAY_BLOCK = register("brown_clay_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//COLORED BRICK BLOCKS//
public static final RegistryObject<Block> RED_BRICK_BLOCK = register("red_brick_block",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_BRICK_BLOCK = register("orange_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_BRICK_BLOCK = register("yellow_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_BRICK_BLOCK = register("lime_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_BRICK_BLOCK = register("green_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_BRICK_BLOCK = register("cyan_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_BRICK_BLOCK = register("light_blue_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_BRICK_BLOCK = register("blue_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_BRICK_BLOCK = register("purple_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_BRICK_BLOCK = register("magenta_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_BRICK_BLOCK = register("pink_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_BRICK_BLOCK = register("white_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_BRICK_BLOCK = register("light_gray_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_BRICK_BLOCK = register("gray_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_BRICK_BLOCK = register("black_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_BRICK_BLOCK = register("brown_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//LARGE BRICK BLOCKS//
public static final RegistryObject<Block> RED_LARGE_BRICK_BLOCK = register("red_large_brick_block",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_LARGE_BRICK_BLOCK = register("orange_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_LARGE_BRICK_BLOCK = register("yellow_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_LARGE_BRICK_BLOCK = register("lime_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_LARGE_BRICK_BLOCK = register("green_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_LARGE_BRICK_BLOCK = register("cyan_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_LARGE_BRICK_BLOCK = register("light_blue_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_LARGE_BRICK_BLOCK = register("blue_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_LARGE_BRICK_BLOCK = register("purple_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_LARGE_BRICK_BLOCK = register("magenta_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_LARGE_BRICK_BLOCK = register("pink_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_LARGE_BRICK_BLOCK = register("white_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_LARGE_BRICK_BLOCK = register("light_gray_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_LARGE_BRICK_BLOCK = register("gray_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_LARGE_BRICK_BLOCK = register("black_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_LARGE_BRICK_BLOCK = register("brown_large_brick_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE BLOCKS//

    public static final RegistryObject<Block> JASPER_BLOCK = register("jasper_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_BLOCK = register("carnelian_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_BLOCK = register("citrine_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_BLOCK = register("aventurine_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_BLOCK = register("jade_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_BLOCK = register("chalcopyrite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_BLOCK = register("labradorite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_BLOCK = register("moonstone_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_BLOCK = register("sodalite_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_BLOCK = register("amethyst_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_BLOCK = register("rose_quartz_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE BLOCKS//
//GEMSTONE TILE 1//
    public static final RegistryObject<Block> JASPER_TILE_1 = register("jasper_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_1 = register("carnelian_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_1 = register("citrine_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_1 = register("aventurine_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_1 = register("jade_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_1 = register("chalcopyrite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_1 = register("labradorite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_1 = register("moonstone_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_1 = register("sodalite_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_1 = register("amethyst_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_1 = register("rose_quartz_tile_1",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE 2//
public static final RegistryObject<Block> JASPER_TILE_2 = register("jasper_tile_2",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_2 = register("carnelian_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_2 = register("citrine_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_2 = register("aventurine_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_2 = register("jade_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_2 = register("chalcopyrite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_2 = register("labradorite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_2 = register("moonstone_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_2 = register("sodalite_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_2 = register("amethyst_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_2 = register("rose_quartz_tile_2",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE 3//
public static final RegistryObject<Block> JASPER_TILE_3 = register("jasper_tile_3",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_3 = register("carnelian_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_3 = register("citrine_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_3 = register("aventurine_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_3 = register("jade_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_3 = register("chalcopyrite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_3 = register("labradorite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_3 = register("moonstone_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_3 = register("sodalite_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_3 = register("amethyst_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_3 = register("rose_quartz_tile_3",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE 4//
public static final RegistryObject<Block> JASPER_TILE_4 = register("jasper_tile_4",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_4 = register("carnelian_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_4 = register("citrine_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_4 = register("aventurine_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_4 = register("jade_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_4 = register("chalcopyrite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_4 = register("labradorite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_4 = register("moonstone_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_4 = register("sodalite_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_4 = register("amethyst_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_4 = register("rose_quartz_tile_4",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE 5//
public static final RegistryObject<Block> JASPER_TILE_5 = register("jasper_tile_5",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_5 = register("carnelian_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_5 = register("citrine_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_5 = register("aventurine_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_5 = register("jade_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_5 = register("chalcopyrite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_5 = register("labradorite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_5 = register("moonstone_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_5 = register("sodalite_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_5 = register("amethyst_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_5 = register("rose_quartz_tile_5",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//GEMSTONE TILE 6//
public static final RegistryObject<Block> JASPER_TILE_6 = register("jasper_tile_6",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CARNELIAN_TILE_6 = register("carnelian_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CITRINE_TILE_6 = register("citrine_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AVENTURINE_TILE_6 = register("aventurine_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_TILE_6 = register("jade_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CHALCOPYRITE_TILE_6 = register("chalcopyrite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABRADORITE_TILE_6 = register("labradorite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MOONSTONE_TILE_6 = register("moonstone_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SODALITE_TILE_6 = register("sodalite_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> AMETHYST_TILE_6 = register("amethyst_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ROSE_QUARTZ_TILE_6 = register("rose_quartz_tile_6",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//ESSENCE BLOCKS//
public static final RegistryObject<Block> EARTHEN_ESSENCE_BLOCK = register("earthen_essence_block",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> FLORAL_ESSENCE_BLOCK = register("floral_essence_block",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));


//STAINED PLANKS//

    public static final RegistryObject<Block> RED_STAINED_PLANKS = register("red_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> ORANGE_STAINED_PLANKS = register("orange_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> YELLOW_STAINED_PLANKS = register("yellow_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIME_STAINED_PLANKS = register("lime_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GREEN_STAINED_PLANKS = register("green_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CYAN_STAINED_PLANKS = register("cyan_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_BLUE_STAINED_PLANKS = register("light_blue_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLUE_STAINED_PLANKS = register("blue_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PURPLE_STAINED_PLANKS = register("purple_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> MAGENTA_STAINED_PLANKS = register("magenta_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PINK_STAINED_PLANKS = register("pink_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WHITE_STAINED_PLANKS = register("white_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LIGHT_GRAY_STAINED_PLANKS = register("light_gray_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> GRAY_STAINED_PLANKS = register("gray_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BLACK_STAINED_PLANKS = register("black_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> BROWN_STAINED_PLANKS = register("brown_stained_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//WOODS//
public static final RegistryObject<Block> CRABAPPLE_WOOD = register("crabapple_wood",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_WOOD = register("poinciana_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_WOOD = register("laburnum_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_WOOD = register("jade_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_WOOD = register("paulownia_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_WOOD = register("wisteria_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_WOOD = register("jacaranda_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_WOOD = register("dogwood_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_WOOD = register("silverbell_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_WOOD = register("cedar_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PALM_WOOD = register("palm_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//STRIPPED WOODS//
public static final RegistryObject<Block> CRABAPPLE_STRIPPED_WOOD = register("crabapple_stripped_wood",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_STRIPPED_WOOD = register("poinciana_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_STRIPPED_WOOD = register("laburnum_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_STRIPPED_WOOD = register("jade_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_STRIPPED_WOOD = register("paulownia_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_STRIPPED_WOOD = register("wisteria_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_STRIPPED_WOOD = register("jacaranda_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_STRIPPED_WOOD = register("dogwood_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_STRIPPED_WOOD = register("silverbell_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_STRIPPED_WOOD = register("cedar_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PALM_STRIPPED_WOOD = register("palm_stripped_wood",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    //WOOD PLANKS//
public static final RegistryObject<Block> CRABAPPLE_PLANKS = register("crabapple_planks",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_PLANKS = register("poinciana_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_PLANKS = register("laburnum_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_PLANKS = register("jade_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_PLANKS = register("paulownia_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_PLANKS = register("wisteria_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_PLANKS = register("jacaranda_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_PLANKS = register("dogwood_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_PLANKS = register("silverbell_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> CEDAR_PLANKS = register("cedar_planks",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//    public static final RegistryObject<Block> PALM_PLANKS = register("palm_planks",
 //           ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

//VINED COBBLE BLOCKS//
public static final RegistryObject<Block> CRABAPPLE_COBBLESTONE = register("crabapple_cobblestone",
        ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> POINCIANA_COBBLESTONE = register("poinciana_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> LABURNUM_COBBLESTONE = register("laburnum_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JADE_COBBLESTONE = register("jade_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> PAULOWNIA_COBBLESTONE = register("paulownia_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> WISTERIA_COBBLESTONE = register("wisteria_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> JACARANDA_COBBLESTONE = register("jacaranda_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> DOGWOOD_COBBLESTONE = register("dogwood_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

    public static final RegistryObject<Block> SILVERBELL_COBBLESTONE = register("silverbell_cobblestone",
            ()-> new Block(AbstractBlock.Properties.create(Material.CLAY).hardnessAndResistance(1.0f, 1.0f)));

















































    public static void register(){};

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block){

        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, ()-> new BlockItem(toReturn.get(),
                new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
        return toReturn;
    }

}
