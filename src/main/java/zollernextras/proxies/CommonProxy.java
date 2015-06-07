package zollernextras.proxies;


public class CommonProxy /* implements IGuiHandler */{
	public void initRenderers() {
		
	}
	
	public void initSounds() {
		
	}
	
	/*
	 * @Override public Object getServerGuiElement(int guiId, EntityPlayer
	 * player, World world, int x, int y, int z) { if (guiId ==
	 * ZollernExtrasMod.guiIndex) { // Use the player's held item to create the
	 * inventory return new ContainerQuiver(player, player.inventory, new
	 * InventoryQuiver(player.getHeldItem())); } return null; }
	 * 
	 * @Override public Object getClientGuiElement(int guiId, EntityPlayer
	 * player, World world, int x, int y, int z) { if (guiId ==
	 * ZollernExtrasMod.guiIndex) { // We have to cast the new container as our
	 * custom class // and pass in currently held item for the inventory return
	 * new GuiQuiver(new ContainerQuiver(player, player.inventory, new
	 * InventoryQuiver(player.getHeldItem()))); } return null; }
	 */
}