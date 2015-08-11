package com.static7s.relearning_to_mod.block;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class BlockVerticalLauncher extends BlockRTM{
    public BlockVerticalLauncher (){
        super(Material.cloth);
        this.setHardness(1.0F);
        this.setBlockName("verticalLauncher");
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
    }
    //ONLY WORKS IF MOVING AND NOT SNEAKING
    public void onEntityWalking(World world, int p_149724_2_, int p_149724_3_, int p_149724_4_, Entity entity){
        if (!entity.isSneaking()){
            entity.addVelocity(0,2,0);
        }
    }
    //negates fall damage when landing on this block
    public void onFallenUpon(World world, int p_149746_2_, int p_149746_3_, int p_149746_4_, Entity entity, float p_149746_6_) {
        entity.fallDistance = 0;
    }

//TODO: Figure out how to set fall damage to zero when launched from this block
//TODO: Make multisided texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister par1IconRegister){
        this.blockIcon = par1IconRegister.registerIcon("relearning_to_mod:verticalLauncher");
    }
}
