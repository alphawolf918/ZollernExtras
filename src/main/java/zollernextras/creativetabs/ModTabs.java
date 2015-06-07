package zollernextras.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModTabs {
	public static CreativeTabs zTab;

	public static void init() {
		zTab = new ZollernTab("Zollern Extras");
	}
}