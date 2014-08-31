package com.static7s.relearning_to_mod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    public static void init(File configFile)
    {

        //create the configuration object from the given config file
        Configuration configuration = new Configuration(configFile);
        boolean configValue;

        try
        {
            //load the configuration file
            configuration.load();

            //read in properties from config
            configValue = configuration.get("Config Test","configValue",true,"Test config value").getBoolean(true);
        }
            catch(Exception e)
            {
            //log the exception
        }
        finally
        {
            configuration.save();//save the config file
        }
    }
}
