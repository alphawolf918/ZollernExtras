package zollernextras.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import zollernextras.creativetabs.ModTabs;
import zollernextras.items.ItemList;
import zollernextras.lib.Reference;

public class Shinestone extends Block {
	public Shinestone() {
		super(Material.glass);
		this.setCreativeTab(ModTabs.zTab);
		this.setBlockName(Reference.MODID + "_shinestone");
		this.setHardness(0.6F);
		this.setResistance(2.0F);
		this.setLightLevel(1.0F);
		this.setStepSound(this.soundTypeGlass);
		this.setBlockTextureName(Reference.MODID + ":" + "shinestone");
	}

	@Override
	public boolean canSilkHarvest() {
		return true;
	}

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_,
			int p_149650_3_) {
		return ItemList.shinedust;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		int r = par1Random.nextInt(4);
		r = (r == 0) ? 1 : r;
		return r;
	}
}