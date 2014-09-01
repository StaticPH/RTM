package com.static7s.relearning_to_mod.item;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
//import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.EnumAction;
//import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import java.util.List;

public class ItemPointyThing extends ItemSword {
    public ItemPointyThing() {
        super(ToolMaterial.STONE);
        this.setMaxDamage(0);
        this.maxStackSize = 1;
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setUnlocalizedName("pointyThing");

}
    public int getItemEnchantability()
    {
        return 22;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons (IIconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:pointyThing");
    }
    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {}


}