package com.static7s.relearning_to_mod.item;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import java.util.List;

public class ItemRTM extends Item
{
    public ItemRTM()
    {
        super();
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setTextureName(getUnlocalizedName());//Testing to find quicker method of setting/registering item texture
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

//  **Testing a thing**
//    @SideOnly(Side.CLIENT)
//    public void iconName(IIconRegister iconRegister, String iconName) {
//        {
//            itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
//        }
//    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
//        itemIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
        itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + getUnlocalizedName()); // performs same function as above
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
//    /**
//     * allows items to add custom lines of information to the mouseover description
//     */
//    @SideOnly(Side.CLIENT)
//    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3list, boolean par4) {
//        par3list.add(StatCollector.translateToLocal("RTMtooltips."+ getUnlocalizedName()));
//    }
}