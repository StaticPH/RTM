package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import com.static7s.relearning_to_mod.block.BlockRTM;
import com.static7s.relearning_to_mod.block.BlockGoldenAppleBlock;
import com.static7s.relearning_to_mod.block.BlockStickySoulSand;
import com.static7s.relearning_to_mod.block.BlockBlindingSand;

public class ModBlocks
{
    public static final BlockRTM goldenAppleBlock = new BlockGoldenAppleBlock();
    public static final BlockRTM stickySoulSand = new BlockStickySoulSand();
    public static final BlockRTM blindingSand = new BlockBlindingSand();
    public static void init()
    {
        GameRegistry.registerBlock(goldenAppleBlock, "goldenAppleBlock");
        GameRegistry.registerBlock(stickySoulSand, "stickySoulSand");
        GameRegistry.registerBlock(blindingSand, "blindingSand");
    }
}
