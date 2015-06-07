package zollernextras.handlers;

import zollernextras.events.EventHandler;
import zollernextras.managers.EventManager;
import cpw.mods.fml.common.registry.GameRegistry;

public class Handlers {
	public static void init() {
		GameRegistry.registerFuelHandler(new FuelHandlers());
		GameRegistry.registerWorldGenerator(new EventManager(), 60);
		EventHandler.init();
	}
}