package com.static7s.relearning_to_mod.proxy;

import com.static7s.relearning_to_mod.entity.EntityLlamaSpawner;
import com.static7s.relearning_to_mod.init.ModItems;
import com.static7s.relearning_to_mod.renderer.RendererLlamaSpawner;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.model.ModelHorse;

public class ClientProxy extends CommonProxy{
    @Override
    public void initRenderers() {
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCapsule.class, new RendererMankiniCapsule(ModItems.itemMankiniCapsule));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCreeper.class, new RendererMankiniCreeper(new ModelCreeper(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLlamaSpawner.class, new RendererLlamaSpawner(ModItems.llamaRing));
    }
}
