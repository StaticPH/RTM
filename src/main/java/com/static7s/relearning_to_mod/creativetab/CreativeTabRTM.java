package com.static7s.relearning_to_mod.creativetab;

import com.static7s.relearning_to_mod.init.ModItems;
import com.static7s.relearning_to_mod.reference.Reference;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabRTM {
    public static final CreativeTabs RTM_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
    public Item getTabIconItem()
        {
            return ModItems.pointyThing;
        }
    };
}
