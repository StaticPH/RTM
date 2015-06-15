package com.static7s.relearning_to_mod.item;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemBlindingPowder extends ItemRTM{
    public ItemBlindingPowder(){
        super();
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.maxStackSize = 64;
        this.setUnlocalizedName("blindingPowder");
        this.setTextureName("blindingPowder");// redundancy
    }
//TODO: Figure out why localization isn't working
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons (IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:blindingPowder");
    }
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3list, boolean par4) {
        par3list.add(StatCollector.translateToLocal("RTMtooltips.blindingPowder"));
    }
}
