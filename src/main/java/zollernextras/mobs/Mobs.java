package zollernextras.mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityList.EntityEggInfo;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import zollernextras.biomes.Biomes;
import zollernextras.lib.Reference;
import zollernextras.mobs.entities.EntityBabyDragon;
import zollernextras.mobs.entities.EntityDuck;
import zollernextras.mobs.entities.EntityFish;
import zollernextras.mobs.entities.EntityJellyfish;
import zollernextras.mobs.entities.EntityMegaCreeper;
import zollernextras.mobs.entities.EntityMummy;
import zollernextras.mobs.entities.EntityPigshroom;
import zollernextras.mobs.entities.EntityScorpion;
import zollernextras.mobs.entities.EntityShadowSkeleton;
import zollernextras.mobs.entities.EntityShrimp;
import cpw.mods.fml.common.registry.EntityRegistry;

public class Mobs {
	
	static int startEntityId = 300;
	
	public static void init() {
		// Fish
		registerEntity(EntityFish.class, "fish", 0x0099ff, 0x00008b);
		EntityRegistry.addSpawn(EntityFish.class, 70, 10, 20,
				EnumCreatureType.waterCreature, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert,
				BiomeGenBase.extremeHills, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.ocean,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.desertHills, BiomeGenBase.river,
				BiomeGenBase.beach, BiomeGenBase.forestHills,
				BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver,
				BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
				BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore, BiomeGenBase.taigaHills,
				Biomes.icyDesert, Biomes.floweryField, Biomes.iceMountains,
				Biomes.redRockMountains, Biomes.redShroomPlains,
				Biomes.slimeLands, Biomes.coalHills, Biomes.badLands,
				BiomeGenBase.beach, BiomeGenBase.coldBeach,
				BiomeGenBase.mushroomIslandShore, BiomeGenBase.deepOcean);
		
		// Mega Creeper
		registerEntity(EntityMegaCreeper.class, "megacreeper", 0xee00ee,
				0x00ee00);
		EntityRegistry.addSpawn(EntityMegaCreeper.class, 10, 4, 6,
				EnumCreatureType.monster, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert,
				BiomeGenBase.extremeHills, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.ocean,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.desertHills, BiomeGenBase.river,
				BiomeGenBase.beach, BiomeGenBase.forestHills,
				BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver,
				BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
				BiomeGenBase.jungleHills, BiomeGenBase.taigaHills,
				Biomes.icyDesert, Biomes.floweryField, Biomes.iceMountains,
				Biomes.redRockMountains, Biomes.redShroomPlains,
				Biomes.slimeLands, Biomes.coalHills, Biomes.mudSwamp,
				Biomes.grandCanyon, BiomeGenBase.savanna, Biomes.slimeLands,
				BiomeGenBase.birchForest, BiomeGenBase.megaTaiga,
				BiomeGenBase.mesa);
		
		// Scorpion
		registerEntity(EntityScorpion.class, "scorpion", 0xf5eeb3, 0x8b9900);
		EntityRegistry.addSpawn(EntityScorpion.class, 8, 2, 4,
				EnumCreatureType.monster, BiomeGenBase.desert,
				BiomeGenBase.desertHills, Biomes.icyDesert, Biomes.grandCanyon,
				Biomes.badLands, BiomeGenBase.mesa, BiomeGenBase.savanna);
		
		// Jellyfish
		registerEntity(EntityJellyfish.class, "jellyfish", 0xed08b5, 0x9b0476);
		EntityRegistry.addSpawn(EntityJellyfish.class, 45, 5, 10,
				EnumCreatureType.waterCreature, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert,
				BiomeGenBase.extremeHills, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.ocean,
				BiomeGenBase.deepOcean, BiomeGenBase.extremeHills,
				BiomeGenBase.extremeHillsEdge, BiomeGenBase.desertHills,
				BiomeGenBase.river, BiomeGenBase.beach,
				BiomeGenBase.forestHills, BiomeGenBase.frozenOcean,
				BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains,
				BiomeGenBase.icePlains, BiomeGenBase.jungleHills,
				BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore,
				BiomeGenBase.taigaHills, Biomes.icyDesert, Biomes.floweryField,
				Biomes.iceMountains, Biomes.redRockMountains,
				Biomes.redShroomPlains, Biomes.slimeLands,
				BiomeGenBase.deepOcean, BiomeGenBase.river);
		
		// Shrimp
		registerEntity(EntityShrimp.class, "shrimp", 0xef08c5, 0xaf04d6);
		EntityRegistry.addSpawn(EntityShrimp.class, 40, 5, 10,
				EnumCreatureType.waterCreature, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert,
				BiomeGenBase.extremeHills, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.ocean,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.desertHills, BiomeGenBase.river,
				BiomeGenBase.beach, BiomeGenBase.forestHills,
				BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver,
				BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
				BiomeGenBase.jungleHills, BiomeGenBase.mushroomIsland,
				BiomeGenBase.mushroomIslandShore, BiomeGenBase.taigaHills,
				Biomes.icyDesert, Biomes.floweryField, Biomes.iceMountains,
				Biomes.redRockMountains, Biomes.redShroomPlains,
				Biomes.slimeLands, BiomeGenBase.deepOcean);
		
		// Duck
		registerEntity(EntityDuck.class, "duck", 0x008b00, 0x8b2200);
		EntityRegistry.addSpawn(EntityDuck.class, 50, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.extremeHills,
				BiomeGenBase.extremeHillsEdge, BiomeGenBase.taiga,
				BiomeGenBase.ocean, BiomeGenBase.river, Biomes.mudSwamp);
		
		// Pigshroom
		registerEntity(EntityPigshroom.class, "pigshroom", 0x990000, 0xeeeeee);
		EntityRegistry.addSpawn(EntityPigshroom.class, 8, 2, 4,
				EnumCreatureType.creature, BiomeGenBase.mushroomIsland,
				Biomes.redShroomPlains);
		
		// Baby Dragon
		registerEntity(EntityBabyDragon.class, "babydragon", 0x000000, 0x7D26CD);
		
		// Shadow Skeleton
		registerEntity(EntityShadowSkeleton.class, "shadowskeleton", 0xeeeeee,
				0x00009e);
		EntityRegistry.addSpawn(EntityShadowSkeleton.class, 8, 2, 4,
				EnumCreatureType.monster, BiomeGenBase.plains,
				BiomeGenBase.forest, BiomeGenBase.desert,
				BiomeGenBase.extremeHills, BiomeGenBase.jungle,
				BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.ocean,
				BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge,
				BiomeGenBase.desertHills, BiomeGenBase.river,
				BiomeGenBase.beach, BiomeGenBase.forestHills,
				BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver,
				BiomeGenBase.iceMountains, BiomeGenBase.icePlains,
				BiomeGenBase.jungleHills, BiomeGenBase.taigaHills,
				Biomes.icyDesert, Biomes.floweryField, Biomes.iceMountains,
				Biomes.redRockMountains, Biomes.redShroomPlains,
				Biomes.slimeLands, BiomeGenBase.savanna, Biomes.coalHills,
				Biomes.mudSwamp, Biomes.grandCanyon, Biomes.slimeLands);
		
		// Mummy
		registerEntity(EntityMummy.class, "mummy", 0x8b990, 0xf5eeb3);
		EntityRegistry.addSpawn(EntityMummy.class, 6, 2, 4,
				EnumCreatureType.monster, BiomeGenBase.desert,
				BiomeGenBase.desertHills, Biomes.icyDesert, Biomes.badLands,
				Biomes.redRockMountains, BiomeGenBase.mesaPlateau);
	}
	
	public static void registerEntity(Class<? extends Entity> entity,
			String entityName, int entityPrimaryColor, int entitySecondaryColor) {
		int uniqueEntityId = EntityRegistry.findGlobalUniqueEntityId();
		EntityRegistry.registerGlobalEntityID(entity, Reference.MODID + "_"
				+ entityName, uniqueEntityId);
		// EntityRegistry.registerModEntity(entity, entityName, uniqueEntityId,
		// ZollernExtrasMod.INSTANCE, 8, 4, false);
		registerEntityEgg(entity, entityPrimaryColor, entitySecondaryColor);
	}
	
	public static void registerEntityEgg(Class<? extends Entity> entity,
			int primaryColor, int secondaryColor) {
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor,
				secondaryColor));
	}
	
	public static int getUniqueEntityId() {
		do {
			startEntityId++;
		} while (EntityList.getStringFromID(startEntityId) != null);
		return startEntityId;
	}
}