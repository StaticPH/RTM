package com.static7s.relearning_to_mod.block;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockGoldenAppleBlock extends BlockRTM
{
    public BlockGoldenAppleBlock()
    {
        super(Material.tnt);
        this.setBlockName("goldenAppleBlock");
        this.setBlockTextureName("goldenAppleBlock");
        this.setHardness(0.0F);
        this.setLightLevel(1.0F);
        this.setResistance(6000000.0F);
        this.setStepSound(soundTypeMetal);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);

    }
        /**
         * Returns the quantity of items to drop on block destruction.
         */
        public int quantityDropped(Random p_149745_1_)
        {
            return 9;
        }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.golden_apple;
    }
    public int damageDropped(int meta)
    {
        return (1);
    }
    public MapColor getMapColor(int p_149728_1_)
    {
        return MapColor.goldColor;
    }
}

