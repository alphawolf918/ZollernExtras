package zollernextras.biomes;

import net.minecraft.block.Block;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.world.biome.BiomeGenBase;
import zollernextras.blocks.BlockList;

public class BiomeGenMushroomForest extends BiomeGenBase {
	
	public BiomeGenMushroomForest(int par1) {
		super(par1);
		this.waterColorMultiplier = 0x00008b;
		this.temperature = 4F;
		this.setBiomeName("Mushroom Forest");
		this.setColor(Biomes.biomeColor);
		this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 2,
				0, 1));
		this.spawnableCreatureList.add(new SpawnListEntry(
				EntityMooshroom.class, 4, 2, 6));
		this.rainfall = 1F;
		this.theBiomeDecorator.flowersPerChunk = 4;
		this.theBiomeDecorator.treesPerChunk = 6;
		this.theBiomeDecorator.grassPerChunk = 5;
		this.theBiomeDecorator.reedsPerChunk = 2;
		this.theBiomeDecorator.sandPerChunk = -999;
		this.theBiomeDecorator.sandPerChunk2 = -999;
		this.theBiomeDecorator.mushroomsPerChunk = 100;
		this.theBiomeDecorator.bigMushroomsPerChunk = 80;
		this.theBiomeDecorator.clayPerChunk = 2;
		this.theBiomeDecorator.generateLakes = true;
		this.topBlock = BlockList.betterGrass;
		this.fillerBlock = Block.getBlockById(3);
	}
	
	@Override
	public int getBiomeGrassColor(int par1, int par2, int par3) {
		return 0x2e0854;
	}
	
	@Override
	public int getBiomeFoliageColor(int original, int par2, int par3) {
		return 0x2e0854;
	}
}