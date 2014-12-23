package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.item.*;
import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemPointyThing pointyThing = new ItemPointyThing();
    //public static final ItemRTM catToy = new ItemCatToy(); // No longer used
    public static final ItemCatToy catToy = new ItemCatToy();
    public static final ItemLlamaRing llamaRing = new ItemLlamaRing();
    public static final ItemSnowballStick snowballStick = new ItemSnowballStick();

    public static void init()
    {
        GameRegistry.registerItem(pointyThing, "pointyThing");
        GameRegistry.registerItem(catToy,"catToy");
        GameRegistry.registerItem(llamaRing, "llamaRing");
        GameRegistry.registerItem(snowballStick,"snowballStick");
    }

}