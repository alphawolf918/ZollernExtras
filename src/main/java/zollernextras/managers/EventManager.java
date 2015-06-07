package zollernextras.managers;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import zollernextras.biomes.Biomes;
import zollernextras.blocks.BlockList;
import zollernextras.worldgen.WorldGenEnderMinable;
import zollernextras.worldgen.WorldGenNetherMinable;
import zollernextras.worldgen.WorldGenSeaLamp;
import zollernextras.worldgen.WorldGenSwampClay;
import zollernextras.worldgen.WorldGenTreasureChest;
import cpw.mods.fml.common.IWorldGenerator;

public class EventManager implements IWorldGenerator {
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
			case -1:
				this.generateNether(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 0:
			case 7:
				this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
				break;
			case 1:
				this.generateEnd(world, random, chunkX * 16, chunkZ * 16);
				break;
		}
	}
	
	private void generateSurface(World world, Random random, int x, int z) {
		// Super Charged Coal Ore
		this.addOreSpawn(BlockList.spcOre, world, random, x, z, 16, 16,
				4 + random.nextInt(10), 6, 4, 22);
		
		// Shinestone
		this.addOreSpawn(BlockList.shinestone, world, random, x, z, 16, 16,
				5 + random.nextInt(10), 14, 14, 32);
		
		// Cave Marble
		this.addOreSpawn(BlockList.caveMarbleWhite, world, random, x, z, 16,
				16, 5 + random.nextInt(10), 15, 14, 26);
		
		// Fueltonium
		this.addOreSpawn(BlockList.fueltonium, world, random, x, z, 16, 16,
				6 + random.nextInt(8), 14, 2, 10);
		
		// Shard Ore
		this.addOreSpawn(BlockList.enderShardOre, world, random, x, z, 16, 16,
				2 + random.nextInt(2), 4, 6, 48);
		
		// Amaranth Ore
		this.addOreSpawn(BlockList.amaranthOre, world, random, x, z, 16, 16,
				1 + random.nextInt(4), 10, 2, 22);
		
		// Zinc Ore
		this.addOreSpawn(BlockList.zincOre, world, random, x, z, 16, 16,
				2 + random.nextInt(2), 11, 6, 18);
		
		// Diamond Ore
		this.addOreSpawn(Block.getBlockById(56), world, random, x, z, 16, 16,
				2 + random.nextInt(2), 13, 6, 18);
		
		// Opal Ore
		this.addOreSpawn(BlockList.opalOre, world, random, x, z, 16, 16,
				2 + random.nextInt(3), 4, 12, 16);
		// Amber Ore
		this.addOreSpawn(BlockList.amberOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		// Garnet Ore
		this.addOreSpawn(BlockList.garnetOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		// Aquamarine Ore
		this.addOreSpawn(BlockList.aquamarineOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		// Topaz Ore
		this.addOreSpawn(BlockList.topazOre, world, random, x, z, 16, 16,
				3 + random.nextInt(3), 4, 12, 16);
		
		// Grab Biome
		BiomeGenBase currentBiome = world.getBiomeGenForCoords(x, z);
		int y = world.getHeightValue(x, z);
		
		// Swamp Clay
		if (currentBiome.equals(BiomeGenBase.swampland)) {
			this.addBlockSpawn(BlockList.swampClay, world, random, x, z, 16,
					16, 1 + random.nextInt(8), 20, 59, 68);
		}
		
		// Sea Lamp
		if (currentBiome.equals(BiomeGenBase.river)
				|| currentBiome.equals(BiomeGenBase.ocean)
				|| currentBiome.equals(BiomeGenBase.deepOcean)) {
			this.addBlockSpawn(BlockList.seaLamp, world, random, x, z, 16, 16,
					4 + random.nextInt(4), 40, 24, 68);
		}
		
		if (currentBiome.equals(Biomes.badLands)) {
			this.spawnStructure(8, 10, world, random, x, y, z,
					new WorldGenLakes(Block.getBlockById(11)));
		}
		
		if (currentBiome.equals(Biomes.mudSwamp)) {
			this.spawnStructure(5, 10, world, random, x, y, z,
					new WorldGenLakes(Block.getBlockById(3)));
		}
		
		// Treasure Chests
		if ((currentBiome.equals(BiomeGenBase.deepOcean) || currentBiome
				.equals(BiomeGenBase.ocean)) && y <= 32) {
			this.spawnStructure(4, 20, world, random, x, y, z,
					(new WorldGenTreasureChest()));
		}
	}
	
	private void generateNether(World world, Random random, int x, int z) {
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(128);
		int Zcoord = z + random.nextInt(16);
		
		// Nether Super Coal Ore
		new WorldGenNetherMinable(BlockList.spcNetherOre, 2, 4).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		// Nether Fueltonium Ore
		new WorldGenNetherMinable(BlockList.fuelNetherOre, 2, 4).generate(
				world, random, Xcoord, Ycoord, Zcoord);
		
		// Nether Amaranth Ore
		new WorldGenNetherMinable(BlockList.amaranthNetherOre, 1, 5).generate(
				world, random, Xcoord, Ycoord, Zcoord);
		
		// Nether Zinc Ore
		new WorldGenNetherMinable(BlockList.zincNetherOre, 1, 5).generate(
				world, random, Xcoord, Ycoord, Zcoord);
		
		// Nether Ender Shard Ore
		new WorldGenNetherMinable(BlockList.enderShardNetherOre, 1, 5)
				.generate(world, random, Xcoord, Ycoord, Zcoord);
		
		// Azurite
		(new WorldGenNetherMinable(BlockList.azuriteOre, 4, 30)).generate(
				world, random, Xcoord, Ycoord, Zcoord);
		
		// Nether Dirt
		new WorldGenNetherMinable(BlockList.netherDirt, 10, 25).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		// Brimstone
		new WorldGenNetherMinable(BlockList.brimStone, 20, 45).generate(world,
				random, Xcoord, Ycoord, Zcoord);
	}
	
	private void generateEnd(World world, Random random, int x, int z) {
		
		int Xcoord = x + random.nextInt(16);
		int Ycoord = 10 + random.nextInt(80);
		int Zcoord = z + random.nextInt(16);
		
		// Ender Super Coal Ore
		new WorldGenEnderMinable(BlockList.enderSpcOre, 1, 4).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		// Ender Fueltonium Ore
		new WorldGenEnderMinable(BlockList.enderFnOre, 1, 2).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		// Ender Amaranth Ore
		new WorldGenEnderMinable(BlockList.enderAmaranthOre, 1, 2).generate(
				world, random, Xcoord, Ycoord, Zcoord);
		
		// Ender Zinc Ore
		new WorldGenEnderMinable(BlockList.enderZincOre, 1, 2).generate(world,
				random, Xcoord, Ycoord, Zcoord);
		
		// Ender Ore
		(new WorldGenEnderMinable(BlockList.enderiteOre, 4, 25)).generate(
				world, random, Xcoord, Ycoord, Zcoord);
	}
	
	/**
	 * Spawns a structure in the world
	 *
	 * @author Zollern Wolf
	 * @param minChance
	 *            The minimum chance that the structure has to spawn.
	 * @param maxChance
	 *            The maximum chance that the structure has to spawn.
	 * @param world
	 *            The world for the structure to spawn in.
	 * @param random
	 *            Needed for randomization and comparison.
	 * @param x
	 *            The X coordinate to spawn in at.
	 * @param y
	 *            The Y coordinate to spawn in at.
	 * @param z
	 * @param wg
	 *            The structure.
	 */
	public static void spawnStructure(int minChance, int maxChance,
			World world, Random random, int x, int y, int z, WorldGenerator wg) {
		if (random.nextInt(maxChance) == minChance) {
			wg.generate(world, random, x, y, z);
		}
	}
	
	public void addBlockSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		WorldGenerator wg = null;
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			if (block.equals(BlockList.swampClay)
					|| block.equals(BlockList.betterGrass)) {
				wg = new WorldGenSwampClay(block, maxVeinSize);
			} else if (block.equals(BlockList.seaLamp)) {
				wg = new WorldGenSeaLamp(block, maxVeinSize);
			} else {
				wg = new WorldGenMinable(block, maxVeinSize);
			}
			wg.generate(world, random, posX, posY, posZ);
		}
	}
	
	public void addOreSpawn(Block block, World world, Random random,
			int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize,
			int chancesToSpawn, int minY, int maxY) {
		int maxPossY = minY + maxY - 1;
		assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
		assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
		assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
		assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
		assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";
		
		int diffBtwnMinMaxY = maxY - minY;
		for (int x = 0; x < chancesToSpawn; x++) {
			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(diffBtwnMinMaxY);
			int posZ = blockZPos + random.nextInt(maxZ);
			new WorldGenMinable(block, maxVeinSize).generate(world, random,
					posX, posY, posZ);
		}
	}
}