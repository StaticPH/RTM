package com.static7s.relearning_to_mod.block;


import com.static7s.relearning_to_mod.creativetab.CreativeTabRTM;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockRTM extends Block
{
    public BlockRTM(Material material)
    {
        super(material);
    }
    public BlockRTM(String p_i45387_1_, Material p_i45387_2_)
    {
        super(Material.rock);
        this.setCreativeTab(CreativeTabRTM.RTM_TAB);

    }



    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

