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
        //Vanilla Tweaks
                            //5 Stone Bricks yields 5 Cracked Stone Bricks
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stonebrick, 5, 2), "B B", " B ", "B B", 'B', new ItemStack(Blocks.stonebrick, 5, 0));
                            //9 String yields one Cobweb
        GameRegistry.addRecipe(new ItemStack(Blocks.web, 1), "SSS", "SSS", "SSS", 'S', new ItemStack(Items.string, 9));
                            //6 Leather and 1 Iron Ingot yields 1 saddle
        GameRegistry.addShapedRecipe(new ItemStack(Items.saddle,1),"LLL"," L ","LIL", 'L', new ItemStack(Items.leather,6), 'I', new ItemStack(Items.iron_ingot,1));
        /*It seems that it is not necessary to include the "new ItemStack(" or ",6)" in
        "new ItemStack(Items.Leather,6)" as the recipe seems to work perfectly fine without*/

            //Slab Uncrafting
                            //6 Stone Slabs yields 3 Stone
        GameRegistry.addRecipe(new ItemStack(Blocks.stone,3),"SSS", "SSS",'S', new ItemStack(Blocks.stone_slab,6,0));
                            //6 Sandstone Slabs yields 3 Sandstone
        GameRegistry.addRecipe(new ItemStack(Blocks.sandstone,3,0),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,1));
                            //6 Cobblestone Slabs yields 3 Cobblestone
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone,3),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,3));
                            //6 Bricks Slabs yields 3 Bricks
        GameRegistry.addRecipe(new ItemStack(Blocks.brick_block,3),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,4));
                            //6 Stone Brick Slabs yields 3 Stone Bricks
        GameRegistry.addRecipe(new ItemStack(Blocks.stonebrick,3,0),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,5));
                            //6 Nether Brick Slabs yields 3 Nether Brick
        GameRegistry.addRecipe(new ItemStack(Blocks.nether_brick,3),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,6));
                            //6 Quartz Slabs yields 3 Blocks of Quartz
        GameRegistry.addRecipe(new ItemStack(Blocks.quartz_block,3,0),"SSS", "SSS", 'S', new ItemStack(Blocks.stone_slab,6,7));


        //Vanilla Tweaks (Shapeless)

                            //1 Glowstone block yields 4 Glowstone Dust
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), new ItemStack(Blocks.glowstone, 1));
                            //1 Block of Quartz yields 4 Nether Quartz
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1));
                            //1 Quartz Pillar yields 2 Blocks of Quartz
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block,2,0), new ItemStack(Blocks.quartz_block,1,2));
                            //1 Chiseled Quartz Block yields 2 Quartz Slabs
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone_slab,2,7), new ItemStack(Blocks.quartz_block,1,1));
                            //1 Clay yields 4 Clay
        GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball,4), new ItemStack(Blocks.clay,1));
                            //1 Sandstone yields 4 Sand
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand,4), new ItemStack(Blocks.sandstone,1,0));
                            //1 Chiseled Sandstone yields 2 Sandstone Slabs
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone_slab,2,1), new ItemStack(Blocks.sandstone,1,1));
                            //1 Smooth Sandstone yields 1 Sandstone
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone,1,0), new ItemStack(Blocks.sandstone,1,2));

                            //4 Smooth Sandstone yields 4 Sandstone DOESNT WORK
//        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sandstone,4,0), new ItemStack(Blocks.sandstone,4,2));
//        GameRegistry.addRecipe(new ItemStack(Blocks.sandstone,4,0), "SS", "SS", 'S', new ItemStack(Blocks.sandstone,4,2));


        // Mod Recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f', Items.flint, 's', "stickWood"));
        //GameRegistry.addRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f', new ItemStack(Items.flint), 's', new ItemStack(Items.stick));// Not OreDict
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blastGlass,1), new ItemStack(Blocks.glass,1), new ItemStack(Blocks.obsidian,1));
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blastGlass, 8), new Object[] {Blocks.glass, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, Blocks.obsidian, });
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blindingPowder, 8), new Object[] {Items.golden_carrot, Items.fermented_spider_eye, Blocks.sand});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blindingSand,8), new Object[] {ModItems.blindingPowder, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand, Blocks.sand});
    }/*NOTE THAT: GameRegistry.addRecipe(new ItemStack(ModItems.pointyThing), "f","s",'f',
      new ItemStack(Items.flint),'s', new ItemStack(Items.stick)); WORKS JUST AS WELL AS THE SHAPED RECIPE VERSION FOR
      THIS PURPOSE
      */
}

