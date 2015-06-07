package zollernextras.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import zollernextras.blocks.BlockList;

public class BiomeGenBadLands extends BiomeGenBase {
	public BiomeGenBadLands(int par1) {
		super(par1);
		this.waterColorMultiplier = 0xaa0022;
		this.setColor(Biomes.biomeColor);
		this.setBiomeName("Bad Lands");
		this.temperature = 8F;
		this.setHeight(BiomeGenBase.height_LowHills);
		this.topBlock = BlockList.badStone;
		this.fillerBlock = BlockList.badStone;
	}
}