package zollernextras.lib.recipes;

import net.minecraft.item.ItemStack;
import zollernextras.blocks.BlockList;
import zollernextras.items.ItemList;
import zollernextras.lib.modhelper.MekanismHelper;

public class CrusherRecipes {
	public static void init() {
		// Amaranth
		MekanismHelper.addMekanismCrusherRecipe(new ItemStack(
				BlockList.amaranthOre, 1), new ItemStack(ItemList.amaranthDust, 2));
		// Zinc
		MekanismHelper.addMekanismCrusherRecipe(
				new ItemStack(BlockList.zincOre, 1), new ItemStack(ItemList.zincDust,
						2));
		// Fueltonium
		MekanismHelper.addMekanismCrusherRecipe(new ItemStack(
				BlockList.fueltonium, 1), new ItemStack(ItemList.fuelonite, 2));
		
		// Super Charged Coal
		MekanismHelper.addMekanismCrusherRecipe(
				new ItemStack(BlockList.spcOre, 1),
				new ItemStack(ItemList.spcItem, 2));
	}
}