package zollernextras.biomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;

public class Biomes {
	
	public static int biomeColor = 1204859;
	
	public static BiomeGenBase icyDesert = new BiomeGenIcyDesert(67);
	public static BiomeGenBase slimeLands = new BiomeGenSlimeLands(68);
	public static BiomeGenBase redShroomPlains = new BiomeGenRedshroomPlains(69);
	public static BiomeGenBase redRockMountains = new BiomeGenRedRockMountains(
			70);
	public static BiomeGenBase mushroomForest = new BiomeGenMushroomForest(71);
	public static BiomeGenBase mudSwamp = new BiomeGenMudSwamp(72);
	public static BiomeGenBase floweryField = new BiomeGenFloweryField(73);
	public static BiomeGenBase grandCanyon = new BiomeGenGrandCanyon(74);
	public static BiomeGenBase iceMountains = new BiomeGenIceMountains(75);
	public static BiomeGenBase coalHills = new BiomeGenCoalHills(76);
	public static BiomeGenBase badLands = new BiomeGenBadLands(77);
	
	public static void init() {
		addBiome(icyDesert, BiomeType.ICY, 64);
		addBiome(slimeLands, BiomeType.WARM, 32);
		addBiome(redShroomPlains, BiomeType.WARM, 34);
		addBiome(redRockMountains, BiomeType.WARM, 84);
		addBiome(mushroomForest, BiomeType.COOL, 14);
		addBiome(mudSwamp, BiomeType.WARM, 52);
		addBiome(floweryField, BiomeType.WARM, 71);
		addBiome(grandCanyon, BiomeType.DESERT, 22);
		addBiome(iceMountains, BiomeType.ICY, 45);
		addBiome(coalHills, BiomeType.WARM, 10);
		addBiome(badLands, BiomeType.DESERT, 47);
	}
	
	public static void addBiome(BiomeGenBase biome, BiomeType biomeType,
			int biomeWeight) {
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, biomeWeight));
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addVillageBiome(biome, true);
		BiomeManager.addStrongholdBiome(biome);
	}
}