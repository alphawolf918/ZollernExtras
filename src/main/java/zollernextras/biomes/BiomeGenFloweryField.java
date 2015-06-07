package zollernextras.biomes;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import zollernextras.blocks.BlockList;

public class BiomeGenFloweryField extends BiomeGenBase {
	
	public BiomeGenFloweryField(int par1) {
		super(par1);
		this.waterColorMultiplier = 0x00008b;
		this.temperature = 6F;
		this.setBiomeName("Flowery Field");
		this.setColor(Biomes.biomeColor);
		this.rainfall = 1F;
		this.spawnableCreatureList.clear();
		this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, 9,
				4, 8));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 9,
				4, 8));
		this.spawnableWaterCreatureList.clear();
		this.theBiomeDecorator.flowersPerChunk = 250;
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = -999;
		this.theBiomeDecorator.reedsPerChunk = -999;
		this.theBiomeDecorator.sandPerChunk = -999;
		this.theBiomeDecorator.sandPerChunk2 = -999;
		this.theBiomeDecorator.mushroomsPerChunk = -999;
		this.theBiomeDecorator.clayPerChunk = -999;
		this.theBiomeDecorator.generateLakes = true;
		this.topBlock = Block.getBlockById(2);
		this.fillerBlock = BlockList.betterGrass;
	}
}