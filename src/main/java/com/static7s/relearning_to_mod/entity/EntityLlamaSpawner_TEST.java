//package com.static7s.relearning_to_mod.entity;
//
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.IProjectile;
//import net.minecraft.entity.passive.EntityCow;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.nbt.NBTTagCompound;
//import net.minecraft.util.MovingObjectPosition;
//import net.minecraft.world.World;
//
//public class EntityLlamaSpawner_TEST extends Entity implements IProjectile/*, IEntityAdditionalSpawnData*/ {
//        public EntityLlamaSpawner_TEST(World par1World, EntityPlayer par3EntityPlayer){
//        super(par1World);
//        }
////    private final EntityLivingBase thrower;
////    public EntityLlamaSpawner(World par1World, EntityLivingBase par2EntityLivingBase)
////        {
////                super(par1World);
////                this.thrower = par2EntityLivingBase;
////                this.setSize(0.25F, 0.25F);
////                this.setLocationAndAngles(par2EntityLivingBase.posX, par2EntityLivingBase.posY + (double)par2EntityLivingBase.getEyeHeight(), par2EntityLivingBase.posZ, par2EntityLivingBase.rotationYaw, par2EntityLivingBase.rotationPitch);
////                this.posX -= (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float) Math.PI) * 0.16F);
////                this.posY -= 0.10000000149011612D;
////                this.posZ -= (double)(MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * 0.16F);
////                this.setPosition(this.posX, this.posY, this.posZ);
////                this.yOffset = 0.0F;
////                float f = 0.4F;
////                this.motionX = (double)(-MathHelper.sin(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
////                this.motionZ = (double)(MathHelper.cos(this.rotationYaw / 180.0F * (float)Math.PI) * MathHelper.cos(this.rotationPitch / 180.0F * (float)Math.PI) * f);
////                this.motionY = (double)(-MathHelper.sin((this.rotationPitch + this.func_70183_g()) / 180.0F * (float)Math.PI) * f);
////                this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, this.func_70182_d(), 1.0F);
////            }
//
//
//    protected void entityInit() {}
//
//    @Override
//    protected void readEntityFromNBT(NBTTagCompound var1) {
//
//    }
//
//    @Override
//    protected void writeEntityToNBT(NBTTagCompound var1) {
//
//    }
////    @Override
//    protected void onImpact(MovingObjectPosition par1MovingObjectPosition) {
//
//        if (!this.worldObj.isRemote)
//        {
//
//            {//TODO: Replace with the Llama Entity. need to set up rendering stuff for Llama
//                /*ex: https://github.com/SlimeKnights/TinkersConstruct/tree/master/src/main/java/tconstruct/world/model
//https://github.com/SlimeKnights/TinkersConstruct/blob/2501749509be163842e80bfe0ef7cb3ae7fc82e5/src/main/java/tconstruct/world/TinkerWorld.java#L262-L275
//https://github.com/SlimeKnights/TinkersConstruct/blob/master/src/main/java/tconstruct/world/TinkerWorldProxyClient.java#L37-L41
//
//                */
//                EntityCow entityCow = new EntityCow(this.worldObj);
//                //entitychicken.setGrowingAge(24000); IDEA! COW EGG!
//                //entitychicken.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
//                this.worldObj.spawnEntityInWorld(entityCow);
//            }
//        }
//
//        for (int j = 0; j < 8; ++j)
//        {//TODO: choose a different particle
//            this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D);
//        }
//
//        if (!this.worldObj.isRemote)
//        {
//            this.setDead();
//        }
//    }
//
////    @Override
////    public void writeSpawnData(ByteBuf buffer) {
////
////    }
////
////    @Override
////    public void readSpawnData(ByteBuf additionalData) {
////
////    }
//
//    @Override
//    public void setThrowableHeading(double var1, double var3, double var5, float var7, float var8) {
//
//    }
//}
//
