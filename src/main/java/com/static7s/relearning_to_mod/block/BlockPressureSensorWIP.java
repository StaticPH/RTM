package com.static7s.relearning_to_mod.block;
//TODO: figure out what the problem is with this class
import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBasePressurePlate;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;




import java.util.Iterator;
import java.util.List;
import java.lang.String;

public class BlockPressureSensorWIP extends BlockBasePressurePlate {
    public BlockPressureSensorWIP.Sensitivity field_150069_a;


    public BlockPressureSensorWIP(String p_i45418_1_, Material p_i45418_2_, BlockPressureSensorWIP.Sensitivity p_i45418_3_) {
        super(p_i45418_1_, p_i45418_2_);
        this.field_150069_a = p_i45418_3_;
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
//        this.setTickRandomly(true);
        this.setBlockName("pressureSensor");
        this.setBlockTextureName("pressureSensor");
        this.setStepSound(null);
        /**
         * Sets the bounds of the block.  minX, minY, minZ, maxX, maxY, maxZ
         */
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
    public int func_150066_d(int p_150066_1_) {
        return p_150066_1_ > 0 ? 1 : 0;
    }

    public int func_150060_c(int p_150060_1_) {
        return p_150060_1_ == 1 ? 15 : 0;
    }

    public int func_150065_e(World p_150065_1_, int p_150065_2_, int p_150065_3_, int p_150065_4_) {
        List list = null;

        if (this.field_150069_a == BlockPressureSensorWIP.Sensitivity.everything) {
            list = p_150065_1_.getEntitiesWithinAABBExcludingEntity((Entity) null, this.func_150061_a(p_150065_2_, p_150065_3_, p_150065_4_));
        }

        if (this.field_150069_a == BlockPressureSensorWIP.Sensitivity.mobs) {
            list = p_150065_1_.getEntitiesWithinAABB(EntityLivingBase.class, this.func_150061_a(p_150065_2_, p_150065_3_, p_150065_4_));
        }

        if (this.field_150069_a == BlockPressureSensorWIP.Sensitivity.players) {
            list = p_150065_1_.getEntitiesWithinAABB(EntityPlayer.class, this.func_150061_a(p_150065_2_, p_150065_3_, p_150065_4_));
        }

        if (list != null && !list.isEmpty()) {
            Iterator iterator = list.iterator();

            while (iterator.hasNext()) {
                Entity entity = (Entity) iterator.next();

                if (!entity.doesEntityNotTriggerPressurePlate()) {
                    return 15;
                }
            }
        }

        return 0;
    }

    public static enum Sensitivity {
        everything,
        mobs,
        players;

        private static final String __OBFID = "CL_00000290";
    }

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    @Override
    public boolean isOpaqueCube() {
        return true;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    @Override
    public boolean renderAsNormalBlock() {
        return true;
    }
    /**
     * Sets the block's bounds for rendering it as an item
     */
    @Override
    public void setBlockBoundsForItemRender()
    {
        float f = 0.5F;
        float f1 = 0.125F;
        float f2 = 0.5F;
        this.setBlockBounds(0.5F - f, 0.5F - f1, 0.5F - f2, 0.5F + f, 0.5F + f1, 0.5F + f2);
    }

    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
    @Override
    public void breakBlock(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, Block p_149749_5_, int p_149749_6_)
    {
        if (this.func_150060_c(p_149749_6_) > 0)
        {
            this.func_150064_a_(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_);
        }

        super.breakBlock(p_149749_1_, p_149749_2_, p_149749_3_, p_149749_4_, p_149749_5_, p_149749_6_);
    }
    /**
     * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
     */
    public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
    {
        return World.doesBlockHaveSolidTopSurface(p_149742_1_, p_149742_2_, p_149742_3_ - 1, p_149742_4_) || BlockFence.func_149825_a(p_149742_1_.getBlock(p_149742_2_, p_149742_3_ - 1, p_149742_4_));
    }
    /**
     * Sets the bounds of the block.  minX, minY, minZ, maxX, maxY, maxZ
     */
    protected void func_150063_b(int p_150063_1_)
    {
        boolean flag = this.func_150060_c(p_150063_1_) > 0;
        //float f = 0.0625F;

        if (flag)
        {
            this.setBlockBounds(1.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F);
        }
        else
        {
            this.setBlockBounds(1.0F, 1.0F, 1.0F, 1.0F , 1.0F, 1.0F );
        }
    }


    protected void func_150062_a(World p_150062_1_, int p_150062_2_, int p_150062_3_, int p_150062_4_, int p_150062_5_) {
        int i1 = this.func_150065_e(p_150062_1_, p_150062_2_, p_150062_3_, p_150062_4_);
        //boolean flag = p_150062_5_ > 0;
        boolean flag1 = i1 > 0;

        if (p_150062_5_ != i1) {
            p_150062_1_.setBlockMetadataWithNotify(p_150062_2_, p_150062_3_, p_150062_4_, this.func_150066_d(i1), 2);
            this.func_150064_a_(p_150062_1_, p_150062_2_, p_150062_3_, p_150062_4_);
            p_150062_1_.markBlockRangeForRenderUpdate(p_150062_2_, p_150062_3_, p_150062_4_, p_150062_2_, p_150062_3_, p_150062_4_);
        }

        /*if (!flag1 && flag)
        {
            p_150062_1_.playSoundEffect((double)p_150062_2_ + 0.5D, (double)p_150062_3_ + 0.1D, (double)p_150062_4_ + 0.5D, "step.stone", 0.3F, 0.5F);
        }
        else if (flag1 && !flag)
        {
            p_150062_1_.playSoundEffect((double)p_150062_2_ + 0.5D, (double)p_150062_3_ + 0.1D, (double)p_150062_4_ + 0.5D, "step.stone", 0.3F, 0.6F);
        }*/

        if (flag1) {
            p_150062_1_.scheduleBlockUpdate(p_150062_2_, p_150062_3_, p_150062_4_, this, this.tickRate(p_150062_1_));
        }
    }
    protected AxisAlignedBB func_150061_a(int p_150061_1_, int p_150061_2_, int p_150061_3_)
    {
        float f = 0.125F;
        return AxisAlignedBB.getBoundingBox((double)((float)p_150061_1_ + f), (double)p_150061_2_, (double)((float)p_150061_3_ + f), (double)((float)(p_150061_1_ + 1) - f), (double)p_150061_2_ + 0.25D, (double)((float)(p_150061_3_ + 1) - f));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("relearning_to_mod:PressureSensor");
    }
    }
