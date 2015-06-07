package zollernextras.events;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import zollernextras.blocks.BlockList;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class BetterGrassHoeEvent {
	
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void UseHoe(UseHoeEvent event) {
		EntityPlayer par2EntityPlayer = event.entityPlayer;
		ItemStack par1ItemStack = par2EntityPlayer.getHeldItem();
		World par3World = event.world;
		int par4 = event.x;
		int par5 = event.y;
		int par6 = event.z;
		int par7 = 1;
		
		if (event.getResult() == Result.ALLOW) {
			par1ItemStack.damageItem(1, par2EntityPlayer);
		}
		
		Block i1 = par3World.getBlock(par4, par5, par6);
		boolean air = par3World.isAirBlock(par4, par5 + 1, par6);
		
		if (par7 != 0 && air && (i1 == BlockList.betterGrass)) {
			Block block = Block.getBlockById(60);
			par3World.playSoundEffect(par4 + 0.5F, par5 + 0.5F, par6 + 0.5F,
					block.stepSound.getBreakSound(),
					(block.stepSound.getVolume() + 1.0F) / 2.0F,
					block.stepSound.getPitch() * 0.8F);
			
			if (!par3World.isRemote) {
				par3World.setBlock(par4, par5, par6, block);
				par1ItemStack.damageItem(1, par2EntityPlayer);
			}
		}
	}
}