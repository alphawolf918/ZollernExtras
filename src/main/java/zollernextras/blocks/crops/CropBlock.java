package zollernextras.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import zollernextras.items.ItemList;
import zollernextras.lib.M;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CropBlock extends BlockCrops {
	@SideOnly(Side.CLIENT)
	private IIcon[] field_149868_a;
	
	public CropBlock(String strTexture) {
		M.setName(this, strTexture);
		M.setTexture(this, strTexture);
	}
	
	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		if (p_149691_2_ < 7) {
			if (p_149691_2_ == 6) {
				p_149691_2_ = 5;
			}
			
			return this.field_149868_a[p_149691_2_ >> 1];
		} else {
			return this.field_149868_a[3];
		}
	}
	
	@Override
	protected Item func_149866_i() {
		return ItemList.blueberry;
	}
	
	@Override
	protected Item func_149865_P() {
		return ItemList.blueberry;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		this.field_149868_a = new IIcon[4];
		
		for (int i = 0; i < this.field_149868_a.length; ++i) {
			this.field_149868_a[i] = p_149651_1_.registerIcon(this
					.getTextureName() + "_stage_" + i);
		}
	}
}