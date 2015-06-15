package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.item.*;
import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemPointyThing pointyThing = new ItemPointyThing();
    //public static final ItemRTM catToy = new ItemCatToyWIP(); // No longer used
    public static final ItemCatToyWIP catToy = new ItemCatToyWIP();
    public static final ItemLlamaRingWIP llamaRing = new ItemLlamaRingWIP();
    public static final ItemSnowballStick snowballStick = new ItemSnowballStick();
    public static final ItemBlindingPowder blindingPowder = new ItemBlindingPowder();


    public static void init()
    {
        GameRegistry.registerItem(pointyThing, "pointyThing");
        GameRegistry.registerItem(catToy,"catToy");
        GameRegistry.registerItem(llamaRing, "llamaRing");
        GameRegistry.registerItem(snowballStick,"snowballStick");
        GameRegistry.registerItem(blindingPowder,"blindingPowder");
    }

}