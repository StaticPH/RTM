package com.static7s.relearning_to_mod.block;

import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockBlindingSand extends BlockRTM {
	public BlockBlindingSand() {
		super(Material.sand);
		this.setCreativeTab(CreativeTabRTM.RTM_TAB);
		this.setBlockName("blindingSand");
		this.setBlockTextureName("blindingSand");
		this.setHardness(1.5F);
	}
	/**
	* Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	* cleared to be reused)
	*/
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
		float f = 0.125F;
		return AxisAlignedBB.getBoundingBox((double) p_149668_2_, (double) p_149668_3_, (double) p_149668_4_, (double) (p_149668_2_ + 1), (double) ((float) (p_149668_3_ + 1) - f), (double) (p_149668_4_ + 1));
	}
/**
* Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
*/

	public void onEntityCollidedWithBlock(World p_149670_1_, int p_149670_2_, int p_149670_3_, int p_149670_4_, Entity par5Entity) {
	par5Entity.motionX *= 0.4D;
	par5Entity.motionZ *= 0.4D;
	if ((par5Entity instanceof EntityPlayer)) {
		PotionEffect poorSight = new PotionEffect(15, 21, 50, false);
		((EntityPlayer)par5Entity).addPotionEffect(poorSight);
		}
	}
}