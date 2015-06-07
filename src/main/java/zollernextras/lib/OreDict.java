package zollernextras.lib;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import zollernextras.blocks.BlockList;
import zollernextras.items.ItemList;

public class OreDict {
	public static void init() {
		// Better Glass
		OreDictionary.registerOre("glass", new ItemStack(BlockList.betterGlass,
				1));
		OreDictionary.registerOre("blockGlass", new ItemStack(
				BlockList.betterGlass, 1));
		
		// Fueltonium
		OreDictionary.registerOre("ingotUranium", new ItemStack(
				ItemList.ingotFueltonium, 1));
		
		// Shinium
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(
				ItemList.shiniumIngot, 1));
		OreDictionary.registerOre("blockPlatinum", new ItemStack(
				BlockList.shiniumBlock, 1));
		
		// Zinc
		OreDictionary.registerOre("ingotZinc", new ItemStack(
				ItemList.zincIngot, 1));
		OreDictionary.registerOre("oreZinc",
				new ItemStack(BlockList.zincOre, 1));
		
		// Platinum
		OreDictionary.registerOre("ingotPlatinum", new ItemStack(
				ItemList.shiniumIngot, 1));
		OreDictionary.registerOre("dustPlatinum", new ItemStack(
				ItemList.shiniumDust, 1));
		
		// Amaranth
		OreDictionary.registerOre("ingotAmaranth", new ItemStack(
				ItemList.amaranthIngot, 1));
		
		// Super Charged Coal Item
		OreDictionary.registerOre("dustSuperCoal", new ItemStack(
				ItemList.spcItem, 1));
		
		// Fuelonite
		OreDictionary.registerOre("dustFuelCoal", new ItemStack(
				ItemList.fuelonite, 1));
		
		// Amaranth Dust
		OreDictionary.registerOre("dustAmaranth", new ItemStack(
				ItemList.amaranthDust, 1));
		
		// Zollernium Dust
		OreDictionary.registerOre("dustZollernium", new ItemStack(
				ItemList.zollerniumDust, 1));
		
		// Zollernium Ingot
		OreDictionary.registerOre("ingotZollernium", new ItemStack(
				ItemList.zollerniumIngot, 1));
	}
}