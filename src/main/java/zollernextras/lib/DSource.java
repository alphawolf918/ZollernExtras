package zollernextras.lib;

import net.minecraft.util.DamageSource;

public class DSource extends DamageSource {
	
	public static DSource deathJellyfish = new DSource("jellyfishsting");
	
	public DSource(String par1) {
		super(par1);
	}
}