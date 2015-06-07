package zollernextras.handlers;

import net.minecraft.item.ItemStack;
import zollernextras.items.ItemList;
import cpw.mods.fml.common.IFuelHandler;

public class FuelHandlers implements IFuelHandler {
	
	@Override
	public int getBurnTime(ItemStack fuel) {
		if (fuel.getItem() == ItemList.spcItem) {
			return 102400;
		} else if (fuel.getItem() == ItemList.fuelonite) {
			return 6553600;
		}
		return 0;
	}
}