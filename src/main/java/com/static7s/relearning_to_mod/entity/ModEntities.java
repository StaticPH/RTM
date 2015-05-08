package com.static7s.relearning_to_mod.entity;

import java.util.Random;

import net.minecraft.entity.EntityList;
import cpw.mods.fml.common.registry.EntityRegistry;
import com.static7s.relearning_to_mod.Relearning_to_mod;

public class ModEntities {
    public static void registerEntity(Class entityClass, String name)
    {
        int entityID = EntityRegistry.findGlobalUniqueEntityId();
        long seed = name.hashCode();
        Random rand = new Random(seed);
        int primaryColor = rand.nextInt() * 16777215;
        int secondaryColor = rand.nextInt() * 16777215;
        EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
        EntityRegistry.registerModEntity(entityClass, name, entityID, Relearning_to_mod.instance, 64, 1, true);
        EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
    }
    public static void init() {
//        EntityRegistry.registerModEntity(EntityMankiniCapsule.class, "MankiniCapsule", 0, Relearning_to_mod.instance, 64, 10, true);
//        registerEntity(EntityMankiniCreeper.class, "Mankini Creeper");
        EntityRegistry.registerModEntity(EntityLlamaSpawner.class, "LlamaSpawner",0,Relearning_to_mod.instance,64,10,true);
//        registerEntity(EntityName.class, "Entity Name"); //TODO
    }
}

