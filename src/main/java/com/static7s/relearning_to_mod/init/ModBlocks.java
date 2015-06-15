package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.block.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import com.static7s.relearning_to_mod.block.BlockPressureSensor;
import net.minecraft.block.material.Material;

public class ModBlocks
{
    public static final BlockRTM goldenAppleBlock = new BlockGoldenAppleBlock();
    public static final BlockRTM stickySoulSand = new BlockStickySoulSand();
    public static final BlockRTM blindingSand = new BlockBlindingSand();
    public static final Block pressureSensor = new BlockPressureSensor("BlockPressureSensor",Material.rock, BlockPressureSensor.Sensitivity.everything);
    public static final BlockRTM pressureBlock =new BlockPressureBlock();
    public static final BlockRTM redstoneWireBlock = new BlockRedstoneWireBlock();
    public static final BlockRTM blastGlass = new BlockBlastProofGlass(CustomMaterial.blastglass);

    public static void init()
    {
        GameRegistry.registerBlock(goldenAppleBlock, "goldenAppleBlock");
        GameRegistry.registerBlock(stickySoulSand, "stickySoulSand");
        GameRegistry.registerBlock(blindingSand, "blindingSand");
        GameRegistry.registerBlock(pressureSensor, "pressureSensor");
        GameRegistry.registerBlock(pressureBlock,"pressureBlock");
        GameRegistry.registerBlock(redstoneWireBlock,"redstoneWireBlock");
        GameRegistry.registerBlock(blastGlass, "blastGlass");

    }
}
