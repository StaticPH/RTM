package com.static7s.relearning_to_mod.init;

import com.static7s.relearning_to_mod.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import com.static7s.relearning_to_mod.block.BlockRTM;
import com.static7s.relearning_to_mod.block.BlockGoldenAppleBlock;

public class ModBlocks
{
    public static final BlockRTM goldenAppleBlock = new BlockGoldenAppleBlock();

    public static void init()
    {
        GameRegistry.registerBlock(goldenAppleBlock, "goldenAppleBlock");
    }
}
