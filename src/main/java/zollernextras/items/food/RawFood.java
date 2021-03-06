package zollernextras.items.food;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import zollernextras.lib.M;

public class RawFood extends ItemFood {
	public RawFood(String strTexture) {
		super(5, 5F, false);
		M.setTab(this);
		M.setNameAndTexture(this, strTexture);
		this.setMaxStackSize(16);
		this.setPotionEffect(Potion.hunger.id, 30, 0, 0.3F);
	}
}