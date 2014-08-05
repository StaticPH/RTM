package com.static7s.relearning_to_mod.utility;

import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }
    public static void ALL (Object object)
    {
        log(Level.ALL, object);
    }
    public static void DEBUG (Object object)
    {
        log(Level.DEBUG, object);
    }
    public static void ERROR (Object object)
    {
        log(Level.ERROR, object);
    }
    public static void FATAL (Object object)
    {
        log(Level.FATAL, object);
    }
    public static void INFO (Object object)
    {
        log(Level.INFO, object);
    }
    public static void OFF (Object object)
    {
        log(Level.OFF, object);
    }
    public static void TRACE (Object object)
    {
        log(Level.TRACE, object);
    }
    public static void WARN (Object object)
    {
        log(Level.WARN, object);
    }
}
