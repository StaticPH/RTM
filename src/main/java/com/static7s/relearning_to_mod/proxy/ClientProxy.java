package com.static7s.relearning_to_mod.proxy;

import com.static7s.relearning_to_mod.entity.EntityLlamaSpawnerWIP;
import com.static7s.relearning_to_mod.init.ModItems;
import com.static7s.relearning_to_mod.renderer.RendererLlamaSpawnerWIP;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
    @Override
    public void initRenderers() {
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCapsule.class, new RendererMankiniCapsule(ModItems.itemMankiniCapsule));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCreeper.class, new RendererMankiniCreeper(new ModelCreeper(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLlamaSpawnerWIP.class, new RendererLlamaSpawnerWIP(ModItems.llamaRing));
    }
}
