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


            //AI Tweaks
            playersScareOcelots = configuration.get("Ocelots","playersScareOcelots",true,"Do Ocelots run away from players").getBoolean(true);
            ocelotsHateChickens = configuration.get("Ocelots", "ocelotsHateChickens", true, "Do Ocelots attack chickens. For some reason this doesn't seem to work very well").getBoolean(true);

            //TODO: Find a way to do these without replacing vanilla classes or dealing with bytecode
            scaredyHorses = configuration.get("Horses","scaredyHorses",true,"Do Horses run all over the place when hit").getBoolean(true);
            scaredyCows = configuration.get("Cows and Mooshrooms","scaredyCows",true,"Do Cows and Mooshrooms run all over the place when hit").getBoolean(true);
            chickenChickens = configuration.get("Chickens","chickenChickens",true,"Do Chickens run all over the place when hit").getBoolean(true);
            scaredySheep = configuration.get("Sheep","scaredySheep",true,"Do Sheep run all over the place when hit").getBoolean(true);
            scaredyPigs = configuration.get("Pigs","scaredyPigs",true,"Do Pigs run all over the place when hit").getBoolean(true);

            //Disable Animal Sounds
            //Pigs
            pigAliveNoises = configuration.get("Pigs","pigNormalSounds",true,"Do Pigs make noises periodically").getBoolean(true);
            pigHurtNoises = configuration.get("Pigs","pigDamagedSound",true,"Do Pigs make noise when they take damage").getBoolean(true);
            pigDeathNoises = configuration.get("Pigs","pigDeathSqueal",true,"Do Pigs squeal when killed").getBoolean(true);
            shutupPigs = (float)configuration.get("Pigs","pigVolume",0.5,"Control the volume for all Pig noises. (0.0 - 1.0, defaults to 0.5)").setMaxValue(1).setMinValue(0).getDouble(0.5);
            //Cows
            cowAliveNoises = configuration.get("Cows and Mooshrooms","cowNormalSounds",true,"Do Cows and Mooshrooms make noises periodically").getBoolean(true);
            cowHurtNoises = configuration.get("Cows and Mooshrooms","cowDamagedSound",true,"Do Cows and Mooshrooms make noise when they take damage").getBoolean(true);
            cowDeathNoises = configuration.get("Cows and Mooshrooms","cowDeathSound",true,"Do Cows and Mooshrooms make noise when killed").getBoolean(true);
            shutupCows = (float)configuration.get("Cows and Mooshrooms","bovineVolume",0.5,"Control the volume for all Cow and Mooshroom noises. (0.0 - 1.0, defaults to 0.5)").setMaxValue(1).setMinValue(0).getDouble(0.5);
            //Sheep
            sheepAliveNoises = configuration.get("Sheep","sheepNormalSounds",true,"Do Sheep make noises periodically").getBoolean(true);
            sheepHurtNoises = configuration.get("Sheep","sheepDamagedSound",true,"Do Sheep make noise when they take damage").getBoolean(true);
            sheepDeathNoises = configuration.get("Sheep","sheepDeathSound",true,"Do Sheep make noise when killed").getBoolean(true);
            shutupSheep = (float)configuration.get("Sheep","sheepVolume",0.5,"Control the volume for all Sheep noises. (0.0 - 1.0, defaults to 0.5)").setMaxValue(1).setMinValue(0).getDouble(0.5);

            //Chickens
            chickenAliveNoises = configuration.get("Chickens","chickenNormalSounds",true,"Do Chickens make noises periodically").getBoolean(true);
            chickenHurtNoises = configuration.get("Chickens","chickenDamagedSound",true,"Do Chickens make noise when they take damage").getBoolean(true);
            chickenDeathNoises = configuration.get("Chickens","chickenDeathSound",true,"Do Chickens make noise when killed").getBoolean(true);
            shutupChickens = (float)configuration.get("Chickens","MAKE THE CLUCKY BASTARDS SHUT UP",0.5,"Control the volume for all Chicken noises. (0.0 - 1.0, defaults to 0.5)").setMaxValue(1).setMinValue(0).getDouble(0.5);//Don't use F here because of the getDouble

            //Ocelots
            catAliveNoises = configuration.get("Ocelots","catNormalSounds",true,"Do Ocelots make noises periodically").getBoolean(true);
            catHurtNoises = configuration.get("Ocelots","catDamagedSound",true,"Do Ocelots make noise when they take damage").getBoolean(true);
            catDeathNoises = configuration.get("Ocelots","catDeathSound",true,"Do Ocelots make noise when killed").getBoolean(true);
            shutupCats = (float)configuration.get("Ocelots","felineVolume",0.5,"Control the volume for all Ocelot noises. (0.0 - 1.0, defaults to 0.5)").setMaxValue(1).setMinValue(0).getDouble(0.5);

            //Horses
//            horseAliveNoises = configuration.get("Horses","horseNormalSounds",true,"Do Horses make noises periodically").getBoolean(true);
//            horseHurtNoises = configuration.get("Horses","horseDamagedSound",true,"Do Horses make noise when they take damage").getBoolean(true);
//            horseDeathNoises = configuration.get("Horses","horseDeathSound",true,"Do Horses make noise when killed").getBoolean(true);
            shutupHorses = (float)configuration.get("Horses","horseVolume",0.8,"Control the volume for all Horse noises. (0.0 - 1.0, defaults to 0.8)").setMaxValue(1).setMinValue(0).getDouble(0.8);

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
    public static boolean playersScareOcelots = true;
    public static boolean ocelotsHateChickens = true;
    public static float shutupChickens = 0.5F;//Use the F here because its a float
    public static float shutupPigs = 0.5F;
    public static float shutupSheep = 0.5F;
    public static float shutupCows = 0.5F;
    public static float shutupCats = 0.5F;
    public static float shutupHorses = 0.8F;

    public static boolean scaredyCows = true;
    public static boolean scaredySheep = true;
    public static boolean scaredyPigs = true;
    public static boolean scaredyHorses = true;
    public static boolean chickenChickens = true;

    public static boolean pigAliveNoises = true;
    public static boolean pigHurtNoises = true;
    public static boolean pigDeathNoises = true;

    public static boolean cowAliveNoises = true;
    public static boolean cowHurtNoises = true;
    public static boolean cowDeathNoises = true;

    public static boolean sheepAliveNoises = true;
    public static boolean sheepHurtNoises = true;
    public static boolean sheepDeathNoises = true;

    public static boolean chickenAliveNoises = true;
    public static boolean chickenHurtNoises = true;
    public static boolean chickenDeathNoises = true;

    public static boolean catAliveNoises = true;
    public static boolean catHurtNoises = true;
    public static boolean catDeathNoises = true;


}