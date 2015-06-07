package zollernextras.items.storage;

import net.minecraft.item.Item;
import zollernextras.lib.M;
import zollernextras.lib.Reference;

public class ItemQuiver extends Item {
	public ItemQuiver() {
		super();
		M.setTab(this);
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Reference.MODID + "_quiver");
		this.setTextureName("quiver");
	}
	
	/*
	 * @Override public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer
	 * par2EntityPlayer, World par3World, int par4, int par5, int par6, int
	 * par7, float par8, float par9, float par10)
	 * 
	 * {
	 * 
	 * // Only Player's will be accessing the GUI
	 * 
	 * if (!par3World.isRemote)
	 * 
	 * {
	 * 
	 * // Cast Entity parameter as an EntityPlayer
	 * 
	 * EntityPlayer player = par2EntityPlayer; // Open the correct GUI for the
	 * player at player's position
	 * 
	 * player.openGui(ZollernExtrasMod.INSTANCE, ZollernExtrasMod.guiIndex,
	 * par3World, (int) player.posX, (int) player.posY, (int) player.posZ);
	 * 
	 * // If our ContainerQuiver is currently open, write contents to NBT //
	 * when needsUpdate is true
	 * 
	 * if (player.openContainer != null && player.openContainer instanceof
	 * ContainerQuiver
	 * 
	 * && ((ContainerQuiver) player.openContainer).needsUpdate)
	 * 
	 * {
	 * 
	 * ((ContainerQuiver) player.openContainer).writeToNBT();
	 * 
	 * // Set needsUpdate back to false so we don't continually write // to NBT
	 * 
	 * ((ContainerQuiver) player.openContainer).needsUpdate = false;
	 * 
	 * } return true; } return false; }
	 */
	
}