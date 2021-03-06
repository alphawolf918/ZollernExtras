package zollernextras.lib;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentText;
import zollernextras.creativetabs.ModTabs;

public class M {
	
	public static void setTab(Block block) {
		block.setCreativeTab(ModTabs.zTab);
	}
	
	public static void setTab(Item item) {
		item.setCreativeTab(ModTabs.zTab);
	}
	
	public static void setName(Block block, String strName) {
		block.setBlockName(Reference.MODID + "_" + strName);
	}
	
	public static void setName(Item item, String strName) {
		item.setUnlocalizedName(Reference.MODID + "_" + strName);
	}
	
	public static void setTexture(Block block, String strTexture) {
		block.setBlockTextureName(Reference.MODID + ":" + strTexture);
	}
	
	public static void setTexture(Item item, String strTexture) {
		item.setTextureName(Reference.MODID + ":" + strTexture);
	}
	
	public static void setNameAndTexture(Block block, String strName,
			String strTexture) {
		setName(block, strName);
		setTexture(block, strTexture);
	}
	
	public static void setNameAndTexture(Item item, String strName,
			String strTexture) {
		setName(item, strName);
		setTexture(item, strTexture);
	}
	
	public static void setNameAndTexture(Block block, String strBoth) {
		setName(block, strBoth);
		setTexture(block, strBoth);
	}
	
	public static void setNameAndTexture(Item item, String strBoth) {
		setName(item, strBoth);
		setTexture(item, strBoth);
	}
	
	public static void addChatMessage(EntityPlayer player, String text) {
		player.addChatMessage(new ChatComponentText(text));
	}
	
	public static void echo(String str) {
		System.out.println(str);
	}
}