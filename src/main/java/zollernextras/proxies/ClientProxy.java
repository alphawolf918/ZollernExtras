package zollernextras.proxies;

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
import zollernextras.mobs.models.ModelBabyDragon;
import zollernextras.mobs.models.ModelDuck;
import zollernextras.mobs.models.ModelFish;
import zollernextras.mobs.models.ModelJellyfish;
import zollernextras.mobs.models.ModelMegaCreeper;
import zollernextras.mobs.models.ModelMummy;
import zollernextras.mobs.models.ModelPigshroom;
import zollernextras.mobs.models.ModelScorpion;
import zollernextras.mobs.models.ModelShadowSkeleton;
import zollernextras.mobs.models.ModelShrimp;
import zollernextras.mobs.renders.RenderBabyDragon;
import zollernextras.mobs.renders.RenderDuck;
import zollernextras.mobs.renders.RenderFish;
import zollernextras.mobs.renders.RenderJellyfish;
import zollernextras.mobs.renders.RenderMegaCreeper;
import zollernextras.mobs.renders.RenderMummy;
import zollernextras.mobs.renders.RenderPigshroom;
import zollernextras.mobs.renders.RenderScorpion;
import zollernextras.mobs.renders.RenderShadowSkeleton;
import zollernextras.mobs.renders.RenderShrimp;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void initRenderers() {
		RenderingRegistry.registerEntityRenderingHandler(EntityFish.class,
				new RenderFish(new ModelFish(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				EntityMegaCreeper.class, new RenderMegaCreeper(
						new ModelMegaCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class,
				new RenderScorpion(new ModelScorpion(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityJellyfish.class,
				new RenderJellyfish(new ModelJellyfish(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityShrimp.class,
				new RenderShrimp(new ModelShrimp(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				EntityBabyDragon.class, new RenderBabyDragon(
						new ModelBabyDragon(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDuck.class,
				new RenderDuck(new ModelDuck(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPigshroom.class,
				new RenderPigshroom(new ModelPigshroom(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(
				EntityShadowSkeleton.class, new RenderShadowSkeleton(
						new ModelShadowSkeleton(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class,
				new RenderMummy(new ModelMummy(), 0.5F));
	}
}