package zollernextras.items.food;

import net.minecraft.item.ItemFood;
import zollernextras.lib.M;

public class CookedFood extends ItemFood {
	public CookedFood(String strTexture) {
		super(10, 10F, false);
		M.setTab(this);
		M.setNameAndTexture(this, strTexture);
		this.setMaxStackSize(16);
	}
}