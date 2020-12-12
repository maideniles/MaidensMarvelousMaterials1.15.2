package com.maideniles.maidensmaterials.init;

import com.maideniles.maidensmaterials.MarvelousMaterials;
import com.maideniles.maidensmaterials.item.GuideBookItem;
import com.maideniles.maidensmaterials.item.MortarNPestleItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ObjectHolder;


public class ModItems {


	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, MarvelousMaterials.MODID);

	public static final RegistryObject<Item> FLORAL_ESSENCE = ITEMS.register("floral_essence",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item> EARTHEN_ESSENCE = ITEMS.register("earthen_essence",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item> GROUT = ITEMS.register("grout",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item> DARK_IRON_MIX = ITEMS.register("dark_iron_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item> DARK_IRON_INGOT = ITEMS.register("dark_iron_ingot",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item> DARK_IRON_INLAY = ITEMS.register("dark_iron_inlay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>RED_CLAY = ITEMS.register("red_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ORANGE_CLAY = ITEMS.register("orange_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>YELLOW_CLAY = ITEMS.register("yellow_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIME_CLAY = ITEMS.register("lime_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GREEN_CLAY = ITEMS.register("green_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CYAN_CLAY = ITEMS.register("cyan_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_BLUE_CLAY = ITEMS.register("light_blue_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLUE_CLAY = ITEMS.register("blue_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PURPLE_CLAY = ITEMS.register("purple_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MAGENTA_CLAY = ITEMS.register("magenta_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PINK_CLAY = ITEMS.register("pink_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>WHITE_CLAY = ITEMS.register("white_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_GRAY_CLAY = ITEMS.register("light_gray_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GRAY_CLAY = ITEMS.register("gray_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLACK_CLAY = ITEMS.register("black_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BROWN_CLAY = ITEMS.register("brown_clay",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


	public static final RegistryObject<Item>RED_CLAY_MIX = ITEMS.register("red_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ORANGE_CLAY_MIX = ITEMS.register("orange_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>YELLOW_CLAY_MIX = ITEMS.register("yellow_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIME_CLAY_MIX = ITEMS.register("lime_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GREEN_CLAY_MIX = ITEMS.register("green_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CYAN_CLAY_MIX = ITEMS.register("cyan_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_BLUE_CLAY_MIX = ITEMS.register("light_blue_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLUE_CLAY_MIX = ITEMS.register("blue_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PURPLE_CLAY_MIX = ITEMS.register("purple_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MAGENTA_CLAY_MIX = ITEMS.register("magenta_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PINK_CLAY_MIX = ITEMS.register("pink_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>WHITE_CLAY_MIX = ITEMS.register("white_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_GRAY_CLAY_MIX = ITEMS.register("light_gray_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GRAY_CLAY_MIX = ITEMS.register("gray_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLACK_CLAY_MIX = ITEMS.register("black_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BROWN_CLAY_MIX = ITEMS.register("brown_clay_mix",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>RED_BRICK = ITEMS.register("red_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ORANGE_BRICK = ITEMS.register("orange_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>YELLOW_BRICK = ITEMS.register("yellow_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIME_BRICK = ITEMS.register("lime_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GREEN_BRICK = ITEMS.register("green_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CYAN_BRICK = ITEMS.register("cyan_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_BLUE_BRICK = ITEMS.register("light_blue_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLUE_BRICK = ITEMS.register("blue_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PURPLE_BRICK = ITEMS.register("purple_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MAGENTA_BRICK = ITEMS.register("magenta_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PINK_BRICK = ITEMS.register("pink_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>WHITE_BRICK = ITEMS.register("white_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIGHT_GRAY_BRICK = ITEMS.register("light_gray_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>GRAY_BRICK = ITEMS.register("gray_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BLACK_BRICK = ITEMS.register("black_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>BROWN_BRICK = ITEMS.register("brown_brick",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


	public static final RegistryObject<Item>CLAY_VASE_RED = ITEMS.register("clay_vase_red",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_ORANGE = ITEMS.register("clay_vase_orange",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_YELLOW = ITEMS.register("clay_vase_yellow",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_LIME = ITEMS.register("clay_vase_lime",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_GREEN = ITEMS.register("clay_vase_green",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_CYAN = ITEMS.register("clay_vase_cyan",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_LIGHT_BLUE = ITEMS.register("clay_vase_light_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_BLUE = ITEMS.register("clay_vase_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_PURPLE = ITEMS.register("clay_vase_purple",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_MAGENTA = ITEMS.register("clay_vase_magenta",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_PINK = ITEMS.register("clay_vase_pink",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_WHITE = ITEMS.register("clay_vase_white",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_LIGHT_GRAY = ITEMS.register("clay_vase_light_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_GRAY = ITEMS.register("clay_vase_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_BLACK = ITEMS.register("clay_vase_black",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CLAY_VASE_BROWN = ITEMS.register("clay_vase_brown",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


	public static final RegistryObject<Item>MICA_CHUNK = ITEMS.register("mica_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MICA_FRAGMENTS = ITEMS.register("mica_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MICA_POWDER = ITEMS.register("mica_powder",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PRUNING_SHEARS = ITEMS.register("pruning_shears",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MORTAR_N_PESTLE = ITEMS.register("mortar_and_pestle",
			() -> new MortarNPestleItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(1)));


	public static final RegistryObject<Item>GUIDE_BOOK = ITEMS.register("guide_book",
			() -> new GuideBookItem(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(1)));



	public static final RegistryObject<Item>AMETHYST_FRAGMENTS = ITEMS.register("amethyst_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>AVENTURINE_FRAGMENTS = ITEMS.register("aventurine_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CARNELIAN_FRAGMENTS = ITEMS.register("carnelian_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CHALCOPYRITE_FRAGMENTS = ITEMS.register("chalcopyrite_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CITRINE_FRAGMENTS = ITEMS.register("citrine_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JADE_FRAGMENTS = ITEMS.register("jade_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JASPER_FRAGMENTS = ITEMS.register("jasper_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LABRADORITE_FRAGMENTS = ITEMS.register("labradorite_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MOONSTONE_FRAGMENTS = ITEMS.register("moonstone_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ROSE_QUARTZ_FRAGMENTS = ITEMS.register("rose_quartz_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>SODALITE_FRAGMENTS = ITEMS.register("sodalite_fragments",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>AMETHYST_CHUNK = ITEMS.register("amethyst_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>AVENTURINE_CHUNK = ITEMS.register("aventurine_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CARNELIAN_CHUNK = ITEMS.register("carnelian_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CHALCOPYRITE_CHUNK = ITEMS.register("chalcopyrite_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CITRINE_CHUNK = ITEMS.register("citrine_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JADE_CHUNK = ITEMS.register("jade_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JASPER_CHUNK = ITEMS.register("jasper_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LABRADORITE_CHUNK = ITEMS.register("labradorite_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>MOONSTONE_CHUNK = ITEMS.register("moonstone_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ROSE_QUARTZ_CHUNK = ITEMS.register("rose_quartz_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>SODALITE_CHUNK = ITEMS.register("sodalite_chunk",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));





	public static final RegistryObject<Item>DOOR_PLANS_1 = ITEMS.register("door_plans_1",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOOR_PLANS_2 = ITEMS.register("door_plans_2",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOOR_PLANS_3 = ITEMS.register("door_plans_3",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOOR_PLANS_4 = ITEMS.register("door_plans_4",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOOR_PLANS_5 = ITEMS.register("door_plans_5",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOOR_PLANS_6 = ITEMS.register("door_plans_6",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


	public static final RegistryObject<Item>CRABAPPLE_BLOSSOMS = ITEMS.register("crabapple_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>POINCIANA_BLOSSOMS = ITEMS.register("poinciana_blossoms",

			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LABURNUM_BLOSSOMS = ITEMS.register("laburnum_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JADE_BLOSSOMS = ITEMS.register("jade_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PAULOWNIA_BLOSSOMS = ITEMS.register("paulownia_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>WISTERIA_BLOSSOMS = ITEMS.register("wisteria_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>JACARANDA_BLOSSOMS = ITEMS.register("jacaranda_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DOGWOOD_BLOSSOMS = ITEMS.register("dogwood_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>SILVERBELL_BLOSSOMS = ITEMS.register("silverbell_blossoms",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


	public static final RegistryObject<Item>PULVERIZED_RED = ITEMS.register("pulverized_red",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_ORANGE = ITEMS.register("pulverized_orange",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_YELLOW = ITEMS.register("pulverized_yellow",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_LIME = ITEMS.register("pulverized_lime",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_GREEN = ITEMS.register("pulverized_green",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_CYAN = ITEMS.register("pulverized_cyan",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_LIGHT_BLUE = ITEMS.register("pulverized_light_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_BLUE = ITEMS.register("pulverized_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_PURPLE = ITEMS.register("pulverized_purple",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_MAGENTA = ITEMS.register("pulverized_magenta",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_PINK = ITEMS.register("pulverized_pink",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_WHITE = ITEMS.register("pulverized_white",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_LIGHT_GRAY = ITEMS.register("pulverized_light_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_GRAY = ITEMS.register("pulverized_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_BLACK = ITEMS.register("pulverized_black",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PULVERIZED_BROWN = ITEMS.register("pulverized_brown",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>WHITEwash = ITEMS.register("whitewash",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_RED = ITEMS.register("dye_bath_red",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_ORANGE = ITEMS.register("dye_bath_orange",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_YELLOW = ITEMS.register("dye_bath_yellow",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_LIME = ITEMS.register("dye_bath_lime",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_GREEN = ITEMS.register("dye_bath_green",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_CYAN = ITEMS.register("dye_bath_cyan",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_LIGHT_BLUE = ITEMS.register("dye_bath_light_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_BLUE = ITEMS.register("dye_bath_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_PURPLE = ITEMS.register("dye_bath_purple",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_MAGENTA = ITEMS.register("dye_bath_magenta",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_PINK = ITEMS.register("dye_bath_pink",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_WHITE = ITEMS.register("dye_bath_white",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_LIGHT_GRAY = ITEMS.register("dye_bath_light_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_GRAY = ITEMS.register("dye_bath_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_BLACK = ITEMS.register("dye_bath_black",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>DYE_BATH_BROWN = ITEMS.register("dye_bath_brown",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_RED = ITEMS.register("stain_red",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_ORANGE = ITEMS.register("stain_orange",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_YELLOW = ITEMS.register("stain_yellow",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_LIME = ITEMS.register("stain_lime",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_GREEN = ITEMS.register("stain_green",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_CYAN = ITEMS.register("stain_cyan",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_LIGHT_BLUE = ITEMS.register("stain_light_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_BLUE = ITEMS.register("stain_blue",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_PURPLE = ITEMS.register("stain_purple",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_MAGENTA = ITEMS.register("stain_magenta",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_PINK = ITEMS.register("stain_pink",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_WHITE = ITEMS.register("stain_white",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_LIGHT_GRAY = ITEMS.register("stain_light_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_GRAY = ITEMS.register("stain_gray",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_BLACK = ITEMS.register("stain_black",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>STAIN_BROWN = ITEMS.register("stain_brown",
			() -> new Item(new Item.Properties().group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

//FRUITS//
	public static final RegistryObject<Item>GRAPEFRUIT = ITEMS.register("grapefruit",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>ORANGE = ITEMS.register("orange",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LEMON = ITEMS.register("lemon",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>LIME = ITEMS.register("lime",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PEACH = ITEMS.register("peach",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PEAR = ITEMS.register("pear",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>PLUM = ITEMS.register("plum",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>CHERRIES = ITEMS.register("cherries",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));

	public static final RegistryObject<Item>COCONUT = ITEMS.register("coconut",
			() -> new Item(new Item.Properties().food(Foods.APPLE).group(ModItemGroups.MAIDENS_ITEMS_GROUP).maxStackSize(64)));


}