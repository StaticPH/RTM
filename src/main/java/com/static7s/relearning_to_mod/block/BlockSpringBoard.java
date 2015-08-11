package com.static7s.relearning_to_mod.block;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.*;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSpringBoard extends BlockRTM{
    public BlockSpringBoard (){
        super(Material.cloth);
        this.setHardness(1.0F);
        this.setBlockName("springBoard");
        this.setLightOpacity(255);
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);// Seems to be the same as AxisAlignedBB getCollisionBoundingBoxFromPool
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);
    }

    public void onFallenUpon(World world, int p_149746_2_, int p_149746_3_, int p_149746_4_, Entity entity, float p_149746_6_) {
        entity.fallDistance = 0;
    }

//    public void velocityToAddToEntity(World world, int x, int y, int z, Entity entity, Vec3 p_149640_6_){
//        if(entity instanceof EntityLivingBase && entity.isJumping){
//            //isJumping is protected, so I have to do it with potion effects D:
//        }
//    }

//    public void onEntityWalking(World world, int x, int y, int z, Entity entity) {  //Didnt want it to only work while MOVING
//        if(entity instanceof EntityPlayer && !entity.isSneaking()){
//            PotionEffect jump = new PotionEffect(8,0,15,false);
//            ((EntityPlayer) entity).addPotionEffect(jump);
//        }
//    }

    public void onEntityCollidedWithBlock(World p_149670_1_, int x, int y, int z, Entity entity)
    {
        if(entity instanceof EntityPlayer && !entity.isSneaking()){
            PotionEffect jump = new PotionEffect(8,0,5,false);
            ((EntityPlayer) entity).addPotionEffect(jump);
        }
    }

    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
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

        //TODO: Figure out how to set fall damage to zero when launched from this block
    // TODO: EITHER A) fix derpy lighting with slab   OR B) figure out a way to register the collision without modifying the collision box
    // TODO: Make multisided texture
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons (IIconRegister par1IconRegister){
        this.blockIcon = par1IconRegister.registerIcon("relearning_to_mod:spring_Board"+"_top");
    }
}
