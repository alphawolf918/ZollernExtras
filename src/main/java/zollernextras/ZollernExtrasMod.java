package zollernextras;

import zollernextras.biomes.Biomes;
import zollernextras.blocks.BlockList;
import zollernextras.creativetabs.ModTabs;
import zollernextras.handlers.Handlers;
import zollernextras.items.ItemList;
import zollernextras.lib.OreDict;
import zollernextras.lib.Recipes;
import zollernextras.lib.Reference;
import zollernextras.mobs.Mobs;
import zollernextras.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, version = Reference.VERSION)
public class ZollernExtrasMod {
	
	@Instance(Reference.MODID)
	public static ZollernExtrasMod INSTANCE;
	
	@SidedProxy(clientSide = Reference.PROXY_LOCATION + ".ClientProxy",
			serverSide = Reference.PROXY_LOCATION + ".CommonProxy")
	public static CommonProxy proxy;
	
	// public static int modGuiIndex = 0;
	// public static final int guiIndex = modGuiIndex++;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// KeyBindings.init();
		// FMLCommonHandler.instance().bus().register(new KeyInputHandler());
		ItemList.init();
		BlockList.init();
		Mobs.init();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.initRenderers();
		ModTabs.init();
		Biomes.init();
		Recipes.init();
		Handlers.init();
		OreDict.init();
		// NetworkRegistry.INSTANCE.registerGuiHandler(this, proxy);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}