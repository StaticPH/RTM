package com.static7s.relearning_to_mod.block;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public class BlockBlastProofGlass extends BlockRTM {
    public BlockBlastProofGlass(CustomMaterial custommaterial){
        super(CustomMaterial.blastglass);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setBlockName("blastGlass");
        this.setBlockTextureName("blastGlass");
        this.setHardness(1.5F);
        this.setResistance(6000000.0F);
        this.setStepSound(soundTypeGlass);

    }


    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityWither)
        {
            return false;
        }
        else if (entity instanceof EntityDragon)
        {
            return false;
        }

        return false;
    }

    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }
    public boolean isOpaqueCube(){return false;}
    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered (IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        Block i1 = par1IBlockAccess.getBlock(par2, par3, par4);
        return i1 == (Block) this ? false : super.shouldSideBeRendered(par1IBlockAccess, par2, par3, par4, par5);
    }

    /*This function is already covered in BlockBlastProofGlass method*/
//    @Override
//    @SideOnly(Side.CLIENT)
//    public void registerBlockIcons (IIconRegister par1IconRegister)
//    {
//        this.blockIcon = par1IconRegister.registerIcon("relearning_to_mod:Blastglass");
//    }
}
