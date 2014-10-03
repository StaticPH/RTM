package com.static7s.relearning_to_mod.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        // Vanilla Tweaks
                            //5 Stone Bricks yields 5 Cracked Stone Bricks
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 5, 2), "B B", " B ", "B B", 'B',new ItemStack (Blocks.stonebrick, 5, 0));



        // Mod Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f', Items.flint, 's', "stickWood"));
        //GameRegistry.addRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f', new ItemStack(Items.flint), 's', new ItemStack(Items.stick));
    }/*NOTE THAT: GameRegistry.addRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f',
      new ItemStack(Items.flint),'s', new ItemStack(Items.stick)); WORKS JUST AS WELL AS THE SHAPED RECIPE VERSION FOR
      THIS PURPOSE
      */
}

