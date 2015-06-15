package com.static7s.relearning_to_mod.block;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class BlockStickySoulSand extends BlockRTM{

    public BlockStickySoulSand() {
        super(Material.sand);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setBlockName("stickySoulSand");
        this.setBlockTextureName("stickySoulSand");
        this.setHardness(1.5F);
    }
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double)p_149668_2_, (double)p_149668_3_, (double)p_149668_4_, (double)(p_149668_2_ + 1), (double)((float)(p_149668_3_ + 1) - f), (double)(p_149668_4_ + 1));
    }

    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity p_149670_5_)
    {
        p_149670_5_.motionX *= 0.4D;
        p_149670_5_.motionZ *= 0.4D;
        if(p_149670_5_ instanceof EntityPlayer){
            PotionEffect slowMotion = new PotionEffect(2,0,99,false);
            ((EntityPlayer) p_149670_5_).addPotionEffect(slowMotion);
        }
    }
    //TODO: add tooltip to the item for this block, will likely need to do ItemBlock for it
//    /**
//     * allows items to add custom lines of information to the mouseover description
//     */
//    @SideOnly(Side.CLIENT)
//    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
//        par3List.add(StatCollector.translateToLocal("RTMtooltips.stickySoulSand"));
//
//    }
}
