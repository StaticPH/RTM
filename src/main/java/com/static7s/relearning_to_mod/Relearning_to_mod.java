package com.static7s.relearning_to_mod;

import com.static7s.relearning_to_mod.handler.ConfigurationHandler;
import com.static7s.relearning_to_mod.init.ModBlocks;
import com.static7s.relearning_to_mod.init.ModItems;
import com.static7s.relearning_to_mod.entity.ModEntities;
//import com.static7s.relearning_to_mod.entity.*;
import com.static7s.relearning_to_mod.init.Recipes;
import com.static7s.relearning_to_mod.reference.Reference;
import com.static7s.relearning_to_mod.proxy.IProxy;
import com.static7s.relearning_to_mod.utility.LogHelper;
import com.static7s.relearning_to_mod.proxy.CommonProxy;
//import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Level;


//version="1.7.2 - 1.0"
@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)

/*you can use the Reference classes to avoid having to write the actual values for things which are used many times.
Instead, you can just reference a variable stored in Reference which contains the actual value.
It also means that if you want to change the value, you only need to change it in the Reference and it will push the
change to the rest of the mod*/

public class Relearning_to_mod {//constructor

    //public static final Logger logger = LogManager.getLogger("relearning_to_mod"); //unnecessary. just using to confirm that the mod has been loaded

    @Mod.Instance(Reference.MOD_ID)//important. used as a reference point to refer back to this class in the future when needed
    public static Relearning_to_mod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
//    public static IProxy proxy;
    public static CommonProxy proxy;
    /*proxies are uses when dealing with GUIs, registering textures, and other things that only need to take place on
    either the client side or the server side, not both*/

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)//Configs should be loaded here
    {//method
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());

        ModItems.init();
        ModBlocks.init();
        ModEntities.init();
        proxy.initRenderers();
        LogHelper.INFO("Pre Initialization Complete!");
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
//        registerEntities();
        LogHelper.INFO("Initialization Complete!");
    }
//    public void registerEntities ()
//    {
//        EntityRegistry.registerModEntity(EntityLlamaSpawner.class,"Llama Spawner", 0, instance, 32, 5, false);
//    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.INFO("Post Initialization Complete!");
        LogHelper.INFO(Reference.MOD_NAME + " has been loaded");
    }
//    static {
//        logger.info("RELEARNING_TO_MOD HAS LOADED");
//    }    //unnecessary. just using to confirm that the mod has been loaded

}
//Logger logger = LogManager.getLogger("Mod name"); logger.info("Message");
