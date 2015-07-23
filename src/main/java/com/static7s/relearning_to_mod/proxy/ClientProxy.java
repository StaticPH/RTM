package com.static7s.relearning_to_mod.proxy;

import com.static7s.relearning_to_mod.entity.EntityLlamaSpawnerWIP;
//import com.static7s.relearning_to_mod.handler.EntityJoinHandler;
import com.static7s.relearning_to_mod.init.ModItems;
import com.static7s.relearning_to_mod.renderer.RendererLlamaSpawnerWIP;
//import com.static7s.relearning_to_mod.tweaks.entity.passive.ChickenTweaks;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy{
    @Override
    public ClientProxy getClientProxy(){
        return this;
    }

    @Override
    public void initRenders (){
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCapsule.class, new RendererMankiniCapsule(ModItems.itemMankiniCapsule));
//        RenderingRegistry.registerEntityRenderingHandler(EntityMankiniCreeper.class, new RendererMankiniCreeper(new ModelCreeper(), 0.5F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLlamaSpawnerWIP.class, new RendererLlamaSpawnerWIP(ModItems.llamaRing));
    }
    @Override
    public void registerKeyBindings(){

    }
//    @Override
//    public void registerClientEvents()
//    {
//        MinecraftForge.EVENT_BUS.register(new EntityJoinHandler());
//    }

}
