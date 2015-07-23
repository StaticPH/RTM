package com.static7s.relearning_to_mod.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {

    public static void init(File configFile)
    {

        //create the configuration object from the given config file
        Configuration configuration = new Configuration(configFile);

        try
        {
            //load the configuration file
            configuration.load();

            //read in properties from config
//            configValue = configuration.get("Config Test","configValue",true,"Test config value").getBoolean(true);//leftovers from initial testing
// the output of getBoolean must be the same as the boolean value given as the third parameter
            tooltipSnowballStick = configuration.get("Tooltips","tooltipSnowballStick",true,"Does the Snowball Stick have a tooltip").getBoolean(true);
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
    public static boolean tooltipSnowballStick = true; // need to do this in order to be able to do ConfigurationHandler.tooltipSnowballStick
    //    public static boolean configValue;  //leftovers from initial testing
}