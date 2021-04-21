package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.util.Registration;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

//TOOLS//
public static final RegistryObject<Item> MORTAR_AND_PESTLE = Registration.ITEMS.register("mortar_and_pestle",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PRUNING_SHEARS = Registration.ITEMS.register("pruning_shears",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//ESSENCES//
    public static final RegistryObject<Item> EARTHEN_ESSENCE = Registration.ITEMS.register("earthen_essence",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> FLORAL_ESSENCE = Registration.ITEMS.register("floral_essence",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//HIDDEN--FOR BOOK PURPOSES//
    public static final RegistryObject<Item> EARTHEN_POTION_ITEM = Registration.ITEMS.register("earthen_potion_item",
            ()-> new Item(new Item.Properties().group(null)));

    public static final RegistryObject<Item> FLORAL_POTION_ITEM = Registration.ITEMS.register("floral_potion_item",
            ()-> new Item(new Item.Properties().group(null)));

//BLOSSOMS//
    public static final RegistryObject<Item> CRABAPPLE_BLOSSOMS = Registration.ITEMS.register("crabapple_blossoms",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> POINCIANA_BLOSSOMS = Registration.ITEMS.register("poinciana_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LABURNUM_BLOSSOMS = Registration.ITEMS.register("laburnum_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JADE_BLOSSOMS = Registration.ITEMS.register("jade_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PAULOWNIA_BLOSSOMS = Registration.ITEMS.register("paulownia_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WISTERIA_BLOSSOMS = Registration.ITEMS.register("wisteria_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JACARANDA_BLOSSOMS = Registration.ITEMS.register("jacaranda_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOGWOOD_BLOSSOMS = Registration.ITEMS.register("dogwood_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SILVERBELL_BLOSSOMS = Registration.ITEMS.register("silverbell_blossoms",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED PIGMENTS//

    public static final RegistryObject<Item> RED_PIGMENT = Registration.ITEMS.register("red_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_PIGMENT = Registration.ITEMS.register("orange_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_PIGMENT = Registration.ITEMS.register("yellow_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LIME_PIGMENT = Registration.ITEMS.register("lime_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_PIGMENT = Registration.ITEMS.register("green_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_PIGMENT = Registration.ITEMS.register("cyan_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_PIGMENT = Registration.ITEMS.register("light_blue_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_PIGMENT = Registration.ITEMS.register("blue_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_PIGMENT = Registration.ITEMS.register("purple_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_PIGMENT = Registration.ITEMS.register("magenta_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_PIGMENT = Registration.ITEMS.register("pink_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_PIGMENT = Registration.ITEMS.register("white_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_PIGMENT = Registration.ITEMS.register("light_gray_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_PIGMENT = Registration.ITEMS.register("gray_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_PIGMENT = Registration.ITEMS.register("black_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_PIGMENT = Registration.ITEMS.register("brown_pigment",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED CLAY//
    public static final RegistryObject<Item> RED_CLAY = Registration.ITEMS.register("red_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_CLAY = Registration.ITEMS.register("orange_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_CLAY = Registration.ITEMS.register("yellow_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LIME_CLAY = Registration.ITEMS.register("lime_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_CLAY = Registration.ITEMS.register("green_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_CLAY = Registration.ITEMS.register("cyan_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY = Registration.ITEMS.register("light_blue_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_CLAY = Registration.ITEMS.register("blue_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_CLAY = Registration.ITEMS.register("purple_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_CLAY = Registration.ITEMS.register("magenta_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_CLAY = Registration.ITEMS.register("pink_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_CLAY = Registration.ITEMS.register("white_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY = Registration.ITEMS.register("light_gray_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_CLAY = Registration.ITEMS.register("gray_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_CLAY = Registration.ITEMS.register("black_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_CLAY = Registration.ITEMS.register("brown_clay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED CLAY BRICKS//
       public static final RegistryObject<Item> RED_BRICK = Registration.ITEMS.register("red_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_BRICK = Registration.ITEMS.register("orange_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_BRICK = Registration.ITEMS.register("yellow_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LIME_BRICK = Registration.ITEMS.register("lime_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_BRICK = Registration.ITEMS.register("green_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_BRICK = Registration.ITEMS.register("cyan_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_BRICK = Registration.ITEMS.register("light_blue_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_BRICK = Registration.ITEMS.register("blue_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_BRICK = Registration.ITEMS.register("purple_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_BRICK = Registration.ITEMS.register("magenta_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_BRICK = Registration.ITEMS.register("pink_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_BRICK = Registration.ITEMS.register("white_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_BRICK = Registration.ITEMS.register("light_gray_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_BRICK = Registration.ITEMS.register("gray_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_BRICK = Registration.ITEMS.register("black_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_BRICK = Registration.ITEMS.register("brown_brick",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED CLAY MIX//
public static final RegistryObject<Item> RED_CLAY_MIX = Registration.ITEMS.register("red_clay_mix",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_CLAY_MIX = Registration.ITEMS.register("orange_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_CLAY_MIX = Registration.ITEMS.register("yellow_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIME_CLAY_MIX = Registration.ITEMS.register("lime_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_CLAY_MIX = Registration.ITEMS.register("green_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_CLAY_MIX = Registration.ITEMS.register("cyan_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_MIX = Registration.ITEMS.register("light_blue_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_CLAY_MIX = Registration.ITEMS.register("blue_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_CLAY_MIX = Registration.ITEMS.register("purple_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_CLAY_MIX = Registration.ITEMS.register("magenta_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_CLAY_MIX = Registration.ITEMS.register("pink_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_CLAY_MIX = Registration.ITEMS.register("white_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_MIX = Registration.ITEMS.register("light_gray_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_CLAY_MIX = Registration.ITEMS.register("gray_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_CLAY_MIX = Registration.ITEMS.register("black_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_CLAY_MIX = Registration.ITEMS.register("brown_clay_mix",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED CLAY VASES//
public static final RegistryObject<Item> RED_CLAY_VASE = Registration.ITEMS.register("red_clay_vase",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_CLAY_VASE = Registration.ITEMS.register("orange_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_CLAY_VASE = Registration.ITEMS.register("yellow_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIME_CLAY_VASE = Registration.ITEMS.register("lime_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_CLAY_VASE = Registration.ITEMS.register("green_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_CLAY_VASE = Registration.ITEMS.register("cyan_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_CLAY_VASE = Registration.ITEMS.register("light_blue_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_CLAY_VASE = Registration.ITEMS.register("blue_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_CLAY_VASE = Registration.ITEMS.register("purple_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_CLAY_VASE = Registration.ITEMS.register("magenta_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_CLAY_VASE = Registration.ITEMS.register("pink_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_CLAY_VASE = Registration.ITEMS.register("white_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_CLAY_VASE = Registration.ITEMS.register("light_gray_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_CLAY_VASE = Registration.ITEMS.register("gray_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_CLAY_VASE = Registration.ITEMS.register("black_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_CLAY_VASE = Registration.ITEMS.register("brown_clay_vase",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED DYE BATHS//

    public static final RegistryObject<Item> RED_DYE_BATH = Registration.ITEMS.register("red_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_DYE_BATH = Registration.ITEMS.register("orange_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_DYE_BATH = Registration.ITEMS.register("yellow_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIME_DYE_BATH = Registration.ITEMS.register("lime_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_DYE_BATH = Registration.ITEMS.register("green_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_DYE_BATH = Registration.ITEMS.register("cyan_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_DYE_BATH = Registration.ITEMS.register("light_blue_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_DYE_BATH = Registration.ITEMS.register("blue_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_DYE_BATH = Registration.ITEMS.register("purple_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_DYE_BATH = Registration.ITEMS.register("magenta_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_DYE_BATH = Registration.ITEMS.register("pink_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_DYE_BATH = Registration.ITEMS.register("white_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_DYE_BATH = Registration.ITEMS.register("light_gray_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_DYE_BATH = Registration.ITEMS.register("gray_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_DYE_BATH = Registration.ITEMS.register("black_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_DYE_BATH = Registration.ITEMS.register("brown_dye_bath",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//WHITEWASH//
    public static final RegistryObject<Item> WHITEWASH = Registration.ITEMS.register("whitewash",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//COLORED STAINS//

    public static final RegistryObject<Item> RED_STAIN = Registration.ITEMS.register("red_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE_STAIN = Registration.ITEMS.register("orange_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> YELLOW_STAIN = Registration.ITEMS.register("yellow_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIME_STAIN = Registration.ITEMS.register("lime_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GREEN_STAIN = Registration.ITEMS.register("green_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CYAN_STAIN = Registration.ITEMS.register("cyan_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_BLUE_STAIN = Registration.ITEMS.register("light_blue_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLUE_STAIN = Registration.ITEMS.register("blue_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PURPLE_STAIN = Registration.ITEMS.register("purple_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MAGENTA_STAIN = Registration.ITEMS.register("magenta_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PINK_STAIN = Registration.ITEMS.register("pink_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> WHITE_STAIN = Registration.ITEMS.register("white_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIGHT_GRAY_STAIN = Registration.ITEMS.register("light_gray_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAY_STAIN = Registration.ITEMS.register("gray_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BLACK_STAIN = Registration.ITEMS.register("black_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> BROWN_STAIN = Registration.ITEMS.register("brown_stain",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//DOOR BLUEPRINTS//

    public static final RegistryObject<Item> DOOR_PLANS_1 = Registration.ITEMS.register("door_plans_1",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOOR_PLANS_2 = Registration.ITEMS.register("door_plans_2",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOOR_PLANS_3 = Registration.ITEMS.register("door_plans_3",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOOR_PLANS_4 = Registration.ITEMS.register("door_plans_4",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOOR_PLANS_5 = Registration.ITEMS.register("door_plans_5",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DOOR_PLANS_6 = Registration.ITEMS.register("door_plans_6",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//DARK IRON//
public static final RegistryObject<Item> DARK_IRON_MIX = Registration.ITEMS.register("dark_iron_mix",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DARK_IRON_INGOT = Registration.ITEMS.register("dark_iron_ingot",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> DARK_IRON_INLAY = Registration.ITEMS.register("dark_iron_inlay",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//FRUITS//

    public static final RegistryObject<Item> PEAR = Registration.ITEMS.register("pear",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PEACH = Registration.ITEMS.register("peach",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> PLUM = Registration.ITEMS.register("plum",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ORANGE = Registration.ITEMS.register("orange",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> GRAPEFRUIT = Registration.ITEMS.register("grapefruit",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LEMON = Registration.ITEMS.register("lemon",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LIME = Registration.ITEMS.register("lime",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHERRIES = Registration.ITEMS.register("cherries",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> COCONUT = Registration.ITEMS.register("coconut",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//GROUT//
    public static final RegistryObject<Item> GROUT = Registration.ITEMS.register("grout",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//MICA POWDER//
    public static final RegistryObject<Item> MICA_POWDER = Registration.ITEMS.register("mica_powder",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//GEMSTONES//
public static final RegistryObject<Item> JASPER_CHUNK = Registration.ITEMS.register("jasper_chunk",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CARNELIAN_CHUNK = Registration.ITEMS.register("carnelian_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CITRINE_CHUNK = Registration.ITEMS.register("citrine_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AVENTURINE_CHUNK = Registration.ITEMS.register("aventurine_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JADE_CHUNK = Registration.ITEMS.register("jade_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHALCOPYRITE_CHUNK = Registration.ITEMS.register("chalcopyrite_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LABRADORITE_CHUNK = Registration.ITEMS.register("labradorite_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MOONSTONE_CHUNK = Registration.ITEMS.register("moonstone_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SODALITE_CHUNK = Registration.ITEMS.register("sodalite_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_CHUNK = Registration.ITEMS.register("amethyst_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ROSE_QUARTZ_CHUNK = Registration.ITEMS.register("rose_quartz_chunk",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

//FRAGMENTS//
public static final RegistryObject<Item> JASPER_FRAGMENTS = Registration.ITEMS.register("jasper_fragments",
        ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CARNELIAN_FRAGMENTS = Registration.ITEMS.register("carnelian_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CITRINE_FRAGMENTS = Registration.ITEMS.register("citrine_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AVENTURINE_FRAGMENTS = Registration.ITEMS.register("aventurine_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> JADE_FRAGMENTS = Registration.ITEMS.register("jade_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> CHALCOPYRITE_FRAGMENTS = Registration.ITEMS.register("chalcopyrite_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> LABRADORITE_FRAGMENTS = Registration.ITEMS.register("labradorite_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> MOONSTONE_FRAGMENTS = Registration.ITEMS.register("moonstone_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> SODALITE_FRAGMENTS = Registration.ITEMS.register("sodalite_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> AMETHYST_FRAGMENTS = Registration.ITEMS.register("amethyst_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    public static final RegistryObject<Item> ROSE_QUARTZ_FRAGMENTS = Registration.ITEMS.register("rose_quartz_fragments",
            ()-> new Item(new Item.Properties().group(ItemGroup.MATERIALS)));


    public static void register(){


    }
}
