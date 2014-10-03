package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.item.ItemRTM;
import com.static7s.relearning_to_mod.item.ItemPointyThing;
import com.static7s.relearning_to_mod.item.ItemCatToy;
import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemPointyThing pointyThing = new ItemPointyThing();
    //public static final ItemRTM catToy = new ItemCatToy(); // No longer used
    public static final ItemCatToy catToy = new ItemCatToy();


    public static void init()
    {
        GameRegistry.registerItem(pointyThing, "pointyThing");
        GameRegistry.registerItem(catToy,"catToy");
    }

}