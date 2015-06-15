//IN THE WORKS

package com.static7s.relearning_to_mod.item;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ItemCatToyWIP extends Item {
    @SideOnly(Side.CLIENT)
    private IIcon theIcon;
    private static final String __OBFID = "CL_00000034";

    public ItemCatToyWIP()
    {
        super();
        this.setUnlocalizedName("catToy");
        this.setMaxStackSize(1);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
    }

    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    @SideOnly(Side.CLIENT)
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns true if this item should be rotated by 180 degrees around the Y axis when being held in an entities
     * hands.
     */
    @SideOnly(Side.CLIENT)
    public boolean shouldRotateAroundWhenRendering()
    {
        return true;
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        if (par3EntityPlayer.fishEntity != null)
        {
            int i = par3EntityPlayer.fishEntity.func_146034_e();
            par1ItemStack.damageItem(i, par3EntityPlayer);
            par3EntityPlayer.swingItem();
        }
        else
        {
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(new EntityFishHook(par2World, par3EntityPlayer));
            }

            par3EntityPlayer.swingItem();
        }

        return par1ItemStack;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister par1IconRegister)
    {
//        this.itemIcon = par1IconRegister.registerIcon(this.getIconString() + "_uncast");      //Doesn't work
//        this.theIcon = par1IconRegister.registerIcon(this.getIconString() + "_cast");        //Doesn't work
//        this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:" + "_uncast");  //Doesn't work
//        this.theIcon = par1IconRegister.registerIcon("relearning_to_mod:" + "_cast");    //Doesn't work
        //this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:catToy");
        this.itemIcon = par1IconRegister.registerIcon("relearning_to_mod:catToy_uncast");
        this.theIcon = par1IconRegister.registerIcon("relearning_to_mod:catToy_cast");

    }

    @SideOnly(Side.CLIENT)
    public IIcon func_94597_g()
    {
        return this.theIcon;
    }

    /**
     * Checks isDamagable and if it cannot be stacked
     */
    public boolean isItemTool(ItemStack par1ItemStack)
    {
        return super.isItemTool(par1ItemStack);
    }
}
//TODO: FINISH; IDEA?
//     https://github.com/SlimeKnights/TinkersConstruct/blob/22e6378e16fbc9429fd901056602f4e7158a8c2b/src/main/java/tconstruct/world/TinkerWorldEvents.java