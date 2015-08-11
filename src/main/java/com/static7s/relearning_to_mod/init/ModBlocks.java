package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import com.static7s.relearning_to_mod.block.BlockPressureSensorWIP;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final BlockRTM goldenAppleBlock = new BlockGoldenAppleBlock();
    public static final BlockRTM stickySoulSand = new BlockStickySoulSand();
    public static final BlockRTM blindingSand = new BlockBlindingSand();
    public static final Block pressureSensor = new BlockPressureSensorWIP("BlockPressureSensorWIP",Material.rock, BlockPressureSensorWIP.Sensitivity.everything);
    public static final BlockRTM pressureBlock =new BlockPressureBlockWIP();
    public static final BlockRTM redstoneWireBlock = new BlockRedstoneWireBlockWIP();
    public static final BlockRTM blastGlass = new BlockBlastProofGlass(CustomMaterial.blastglass);
    public static final BlockRTM verticalLauncher = new BlockVerticalLauncher();
    public static final BlockRTM springBoard = new BlockSpringBoard();



    public static void init()
    {
        GameRegistry.registerBlock(goldenAppleBlock, "goldenAppleBlock");
        GameRegistry.registerBlock(stickySoulSand, "stickySoulSand");
        GameRegistry.registerBlock(blindingSand, "blindingSand");
        GameRegistry.registerBlock(pressureSensor, "pressureSensor");
        GameRegistry.registerBlock(pressureBlock,"pressureBlock");
        GameRegistry.registerBlock(redstoneWireBlock,"redstoneWireBlock");
        GameRegistry.registerBlock(blastGlass, "blastGlass");
        GameRegistry.registerBlock(verticalLauncher, "verticalLauncher");
        GameRegistry.registerBlock(springBoard, "springBoard");



    }
}
