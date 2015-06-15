package com.static7s.relearning_to_mod.item;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
//import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import com.static7s.relearning_to_mod.reference.Reference;

import java.util.List;

public class ItemSnowballStick extends ItemRTM{
    public ItemSnowballStick(){
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setUnlocalizedName("snowballStick");
    }
    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
//        if (!par3EntityPlayer.capabilities.isCreativeMode)
//        {
//            --par1ItemStack.stackSize;
//        }

        par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!par2World.isRemote)
        {
            par2World.spawnEntityInWorld(new EntitySnowball(par2World, par3EntityPlayer));
        }

        return par1ItemStack;
    }
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons (IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:snowballStick");
    }
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {}

}
