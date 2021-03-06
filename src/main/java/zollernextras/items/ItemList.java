package zollernextras.items;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import zollernextras.blocks.BlockList;
import zollernextras.creativetabs.ModTabs;
import zollernextras.items.armor.ArmorMaterials;
import zollernextras.items.armor.amaranth.AmaranthArmor;
import zollernextras.items.armor.zollernium.ZollerniumArmor;
import zollernextras.items.crops.SeedFood;
import zollernextras.items.dust.AmaranthDust;
import zollernextras.items.dust.Shinedust;
import zollernextras.items.dust.ZincDust;
import zollernextras.items.dust.ZollerniumDust;
import zollernextras.items.food.CookedFood;
import zollernextras.items.food.RawFood;
import zollernextras.items.ingots.AmaranthIngot;
import zollernextras.items.ingots.FueltoniumIngot;
import zollernextras.items.ingots.Gem;
import zollernextras.items.ingots.ItemIngot;
import zollernextras.items.ingots.ShinestoneIngot;
import zollernextras.items.ingots.ZincIngot;
import zollernextras.items.ingots.ZollerniumIngot;
import zollernextras.items.swords.EnderSword;
import zollernextras.items.swords.IceSword;
import zollernextras.items.swords.NetherSword;
import zollernextras.items.swords.ThunderSword;
import zollernextras.items.tools.ToolMaterials;
import zollernextras.items.tools.amaranth.AmaranthAxe;
import zollernextras.items.tools.amaranth.AmaranthHoe;
import zollernextras.items.tools.amaranth.AmaranthPickaxe;
import zollernextras.items.tools.amaranth.AmaranthShovel;
import zollernextras.items.tools.amaranth.AmaranthSword;
import zollernextras.items.tools.zollernium.ZollerniumAxe;
import zollernextras.items.tools.zollernium.ZollerniumHoe;
import zollernextras.items.tools.zollernium.ZollerniumPickaxe;
import zollernextras.items.tools.zollernium.ZollerniumShovel;
import zollernextras.items.tools.zollernium.ZollerniumSword;
import zollernextras.lib.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemList {
	
	public static Item spcItem = new SuperChargedCoal();
	public static Item shinedust = new Shinedust();
	public static Item fuelonite = new Fuelonite();
	public static Item ingotFueltonium = new FueltoniumIngot();
	public static Item enderShard = new EnderShard();
	public static Item amaranthIngot = new AmaranthIngot();
	public static Item amaranthDust = new AmaranthDust();
	public static Item amaranthPickaxe = new AmaranthPickaxe(
			ToolMaterials.AMARANTH);
	public static Item amaranthSword = new AmaranthSword(ToolMaterials.AMARANTH);
	public static Item amaranthAxe = new AmaranthAxe(ToolMaterials.AMARANTH);
	public static Item amaranthShovel = new AmaranthShovel(
			ToolMaterials.AMARANTH);
	public static Item amaranthHoe = new AmaranthHoe(ToolMaterials.AMARANTH);
	public static Item amaranthHelmet = new AmaranthArmor(
			ArmorMaterials.AMARANTH, "amaranthhelmet", 0);
	public static Item amaranthChestplate = new AmaranthArmor(
			ArmorMaterials.AMARANTH, "amaranthchestplate", 1);
	public static Item amaranthLeggings = new AmaranthArmor(
			ArmorMaterials.AMARANTH, "amaranthleggings", 2);
	public static Item amaranthBoots = new AmaranthArmor(
			ArmorMaterials.AMARANTH, "amaranthboots", 3);
	public static Item swampClayBall = new SwampClayBall();
	public static Item zincIngot = new ZincIngot();
	public static Item zincDust = new ZincDust();
	public static Item zollerniumIngot = new ZollerniumIngot();
	public static Item zollerniumDust = new ZollerniumDust();
	public static Item zollerniumPickaxe = new ZollerniumPickaxe(
			ToolMaterials.ZOLLERNIUM);
	public static Item zollerniumAxe = new ZollerniumAxe(
			ToolMaterials.ZOLLERNIUM);
	public static Item zollerniumHoe = new ZollerniumHoe(
			ToolMaterials.ZOLLERNIUM);
	public static Item zollerniumShovel = new ZollerniumShovel(
			ToolMaterials.ZOLLERNIUM);
	public static Item zollerniumSword = new ZollerniumSword(
			ToolMaterials.ZOLLERNIUM);
	public static Item zollerniumHelmet = new ZollerniumArmor(
			ArmorMaterials.ZOLLERNIUM, "zollerniumhelmet", 0);
	public static Item zollerniumChestplate = new ZollerniumArmor(
			ArmorMaterials.ZOLLERNIUM, "zollerniumchestplate", 1);
	public static Item zollerniumLeggings = new ZollerniumArmor(
			ArmorMaterials.ZOLLERNIUM, "zollerniumleggings", 2);
	public static Item zollerniumBoots = new ZollerniumArmor(
			ArmorMaterials.ZOLLERNIUM, "zollerniumboots", 3);
	public static Item shinestoneIngot = new ShinestoneIngot();
	public static Item shiniumIngot = new ItemIngot("shinium");
	public static Item shiniumDust = new ItemIngot("shiniumdust");
	public static Item flour = new Flour();
	public static Item heartForce = new ItemHeartForce();
	public static Item heart = new ItemHeart();
	public static Item amber = new Gem("amber");
	public static Item staticAmber = new Gem("staticamber");
	public static Item azurite = new Gem("azurite");
	public static Item aquamarine = new Gem("aquamarine");
	public static Item icyAqua = new Gem("icyaqua");
	public static Item garnet = new Gem("garnet");
	public static Item fireGarnet = new Gem("firegarnet");
	public static Item topaz = new Gem("topaz");
	public static Item opal = new Gem("opal");
	public static Item enderOpal = new Gem("enderopal");
	public static Item enderite = new Gem("enderite");
	public static Item lapisIngot = new Gem("lapisingot");
	public static Item thorSword = new ThunderSword(ToolMaterials.POWER);
	public static Item enderSword = new EnderSword(ToolMaterials.POWER);
	public static Item diabloSword = new NetherSword(ToolMaterials.POWER);
	public static Item iceSword = new IceSword(ToolMaterials.POWER);
	public static Item rawShrimp = new RawFood("rawshrimp");
	public static Item cookedShrimp = new CookedFood("cookedshrimp");
	public static Item rawDuck = new RawFood("rawduck");
	public static Item cookedDuck = new CookedFood("cookedduck");
	public static Item boiledEgg = new CookedFood("boiledegg");
	public static Item duckEgg = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_" + "duckegg")
			.setTextureName(Reference.MODID + ":duckegg"));
	public static Item duckFeather = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_" + "duckfeather")
			.setTextureName(Reference.MODID + ":duckfeather"));
	public static Item shadowBone = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_shadowbone")
			.setTextureName(Reference.MODID + ":shadowbone"));
	public static Item marbleStick = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_marblestick")
			.setTextureName(Reference.MODID + ":marblestick"));
	public static Item blackMarbleStick = (new Item().setCreativeTab(
			ModTabs.zTab).setUnlocalizedName(
			Reference.MODID + "_blackmarblestick")
			.setTextureName(Reference.MODID + ":blackmarblestick"));
	public static Item lapisStick = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_lapisstick")
			.setTextureName(Reference.MODID + ":lapisstick"));
	public static Item powerStick = (new Item().setCreativeTab(ModTabs.zTab)
			.setUnlocalizedName(Reference.MODID + "_powerrod")
			.setTextureName(Reference.MODID + ":powerrod"));
	// public static Item quiver = new ItemQuiver();
	public static Item goldenAnvil = new ItemGoldAnvilBlock(
			BlockList.goldenAnvil);
	public static Item blueberry = new SeedFood(6, 0.8F, BlockList.blueberry,
			Blocks.farmland, "blueberry");
	public static Item blackberry = new SeedFood(6, 0.8F, BlockList.blackberry,
			Blocks.farmland, "blackberry");
	public static Item grape = new SeedFood(6, 0.8F, BlockList.grape,
			Blocks.farmland, "grape");
	public static Item strawberry = new SeedFood(8, 0.9F, Blocks.farmland,
			BlockList.strawberry, "strawberry");
	
	public static void init() {
		addItem(spcItem, "Super Charged Coal");
		addItem(shinedust, "Shinedust");
		addItem(fuelonite, "Fuelonite");
		addItem(ingotFueltonium, "Fueltonium Ingot");
		addItem(enderShard, "Ender Shard");
		addItem(amaranthIngot, "Amaranth Ingot");
		addItem(amaranthDust, "Amaranth Dust");
		addItem(amaranthPickaxe, "Amaranth Pickaxe");
		addItem(amaranthSword, "Amaranth Sword");
		addItem(amaranthAxe, "Amaranth Axe");
		addItem(amaranthShovel, "Amaranth Shovel");
		addItem(amaranthHoe, "Amaranth Hoe");
		addItem(amaranthHelmet, "Amaranth Helmet");
		addItem(amaranthChestplate, "Amaranth Chestplate");
		addItem(amaranthLeggings, "Amaranth Leggings");
		addItem(amaranthBoots, "Amaranth Boots");
		addItem(swampClayBall, "Swamp Clay Ball");
		addItem(zincIngot, "Zinc Ingot");
		addItem(zincDust, "Zinc Dust");
		addItem(zollerniumIngot, "Zollernium Ingot");
		addItem(zollerniumDust, "Zollernium Dust");
		addItem(zollerniumPickaxe, "Zollernium Pickaxe");
		addItem(zollerniumAxe, "Zollernium Axe");
		addItem(zollerniumShovel, "Zollernium Shovel");
		addItem(zollerniumHoe, "Zollernium Hoe");
		addItem(zollerniumSword, "Zollernium Sword");
		addItem(zollerniumHelmet, "Zollernium Helmet");
		addItem(zollerniumChestplate, "Zollernium Chestplate");
		addItem(zollerniumLeggings, "Zollernium Leggings");
		addItem(zollerniumBoots, "Zollernium Boots");
		addItem(shinestoneIngot, "Shinestone Ingot");
		addItem(shiniumIngot, "Shinium Ingot");
		addItem(shiniumDust, "Precious Shinium");
		addItem(flour, "Flour");
		addItem(heart, "Healing Heart");
		addItem(heartForce, "Health Upgrade");
		addItem(amber, "Amber");
		addItem(staticAmber, "Static Amber");
		addItem(azurite, "Azurite");
		addItem(aquamarine, "Aquamarine");
		addItem(icyAqua, "Icy Aqua");
		addItem(garnet, "Garnet");
		addItem(fireGarnet, "Fire Garnet");
		addItem(topaz, "Topaz");
		addItem(opal, "Opal");
		addItem(enderOpal, "Ender Opal");
		addItem(enderite, "Enderite");
		addItem(lapisIngot, "Lapis Ingot");
		addItem(thorSword, "Thunder Sword");
		addItem(enderSword, "Ender Sword");
		addItem(diabloSword, "Nether Sword");
		addItem(iceSword, "Ice Sword");
		addItem(rawShrimp, "Raw Shrimp");
		addItem(cookedShrimp, "Cooked Shrimp");
		addItem(rawDuck, "Raw Duck");
		addItem(cookedDuck, "Cooked Duck");
		addItem(duckEgg, "Duck Egg");
		addItem(duckFeather, "Duck Feather");
		addItem(shadowBone, "Shadow Bone");
		addItem(marbleStick, "White Cave Marble Stick");
		addItem(blackMarbleStick, "Black Cave Marble Stick");
		addItem(lapisStick, "Lapis Stick");
		addItem(powerStick, "Power Stick");
		// addItem(quiver, "Quiver");
		addItem(blueberry, "Blueberry");
		addItem(blackberry, "Blackberry");
		addItem(grape, "Grape");
		addItem(strawberry, "Strawberry");
	}
	
	public static void addItem(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}
}