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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;




import java.util.Random;

public class BlockPressureBlockWIP extends BlockRTM
{
    public BlockPressureBlockWIP()
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
        this.setTickRandomly(true);
        this.setBlockName("pressureBlock");
        this.setBlockTextureName("pressureBlock");
        this.setStepSound(null);
    }
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
        float f = 0.125F;
        return AxisAlignedBB.getAABBPool().getAABB((double) p_149668_2_, (double) p_149668_3_, (double) p_149668_4_, (double) (p_149668_2_ + 1), (double) ((float) (p_149668_3_ + 1) - f), (double) (p_149668_4_ + 1));
    }
    /**
     * How many world ticks before ticking
     */
    @Override
    public int tickRate(World p_149738_1_)
    {
        return 20;
    }
   @Override
    public int isProvidingWeakPower(IBlockAccess block, int x, int y, int z, int side)
    {
//       return this.func_150060_c(block.getBlockMetadata(x, p_149709_3_, z));
    return block.getBlockMetadata(x, x, z) == 1 ? 15 : 0;
    }
    @Override
    public int isProvidingStrongPower(IBlockAccess block, int x, int y, int z, int side)
    {
//        return side == 1 ? this.func_150060_c(block.getBlockMetadata(x, y, z)) : 0;
        if (block.getBlockMetadata(x, y, z) == 1 && side == 1) {
            return 15;
        } else {
            return 0;
        }
    }

    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }
    /**
     * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
     * and stop pistons
     */
    public int getMobilityFlag()
    {
        return 1;
    }
    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor Block
     */
    public void onNeighborBlockChange(World world, int x, int y, int z, Block p_149695_5_)
    {
        boolean flag = false;

        if (!World.doesBlockHaveSolidTopSurface(world, x, y - 1, z) && !BlockFence.func_149825_a(world.getBlock(x, y - 1, z)))
        {
            flag = true;
        }

        if (flag)
        {
            this.dropBlockAsItem(world, x, y, z, world.getBlockMetadata(x, y, z), 0);
            world.setBlockToAir(x, y, z);
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (!world.isRemote)
        {
//            int l = this.func_150060_c(world.getBlockMetadata(x, y, z));
//
//            if (l > 0)
//            {
//                this.func_150062_a(world, x, y, z, l);
//            }
            if (world.getBlockMetadata(x, y, z) != 1) {
                this.setBlockState(world, x, y, z);
            }
        }
    }
    public void func_150062_a(World p_150062_1_, int p_150062_2_, int p_150062_3_, int p_150062_4_, int p_150062_5_)
    {
//        int i1 = this.func_150065_e(p_150062_1_, p_150062_2_, p_150062_3_, p_150062_4_);
//        boolean flag = i1 > 0;

//        if (p_150062_5_ != i1)
//        {
//            p_150062_1_.setBlockMetadataWithNotify(p_150062_2_, p_150062_3_, p_150062_4_, this.func_150066_d(i1), 2);
//            this.func_150064_a_(p_150062_1_, p_150062_2_, p_150062_3_, p_150062_4_);
//            p_150062_1_.markBlockRangeForRenderUpdate(p_150062_2_, p_150062_3_, p_150062_4_, p_150062_2_, p_150062_3_, p_150062_4_);
//        }

//        if (flag)
//        {
            p_150062_1_.scheduleBlockUpdate(p_150062_2_, p_150062_3_, p_150062_4_, this, this.tickRate(p_150062_1_));
//        }
    }
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
@Override
    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity par5Entity) {
        par5Entity.motionX *= 0.4D;
        par5Entity.motionZ *= 0.4D;
        if ((par5Entity instanceof EntityPlayer)) {
            if (world.getBlockMetadata(x, y, z) != 1) {
                this.setBlockState(world, x, y, z);
            }
//            int l = this.func_150060_c(world.getBlockMetadata(x, y, z));
//
//            if (l == 0)
//            {
//                this.func_150062_a(world, x, y, z, l);
//            }
        }
    }
    public void setBlockState(World world, int x, int y, int z) {
        boolean alreadyPressed = world.getBlockMetadata(x, y, z) == 1;
        boolean currentlyPressed = false;
        float i = 0.125F;

        if (currentlyPressed && !alreadyPressed) {
            world.setBlockMetadataWithNotify(x, y, z, 1, 2);
            world.notifyBlocksOfNeighborChange(x, y, z, this);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
        }
        if (!currentlyPressed && alreadyPressed) {
            world.setBlockMetadataWithNotify(x, y, z, 0, 2);
            world.notifyBlocksOfNeighborChange(x, y, z, this);
            world.notifyBlocksOfNeighborChange(x, y - 1, z, this);
        }
        if (currentlyPressed) {
            world.scheduleBlockUpdate(x, y, z, this, this.tickRate(world));
        }
    }
    public void setBlockBoundsBasedOnState(IBlockAccess block, int x, int y, int z) {
        boolean on = block.getBlockMetadata(x, y, z) == 1;
        float height = 1.0F;
        if (on) {
           height = 1.0F;
        }
        float dim1 = 1.0F;
        float dim2 = 1.0F;
        float dim3 = 1.0F;
        float dim4 = 1.0F;
        if (block.getBlock(x, y, z - 1) == block) {
            dim2 = 1.0F;
        }
        if (block.getBlock(x, y, z + 1) == block) {
            dim4 = 1.0F;
        }
        if (block.getBlock(x - 1, y, z) == block) {
            dim1 = 1.0F;
        }
        if (block.getBlock(x + 1, y, z) == block) {
            dim3 = 1.0F;
        }
        setBlockBounds(dim1, 1.0F, dim2, dim3, height, dim4);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("relearning_to_mod:PressureSensor");
    }
}