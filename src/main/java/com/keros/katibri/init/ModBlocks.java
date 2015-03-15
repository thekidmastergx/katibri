package com.keros.katibri.init;

import com.keros.katibri.block.BlockBasic;
import com.keros.katibri.block.BlockDustBrick;
import com.keros.katibri.reference.Reference;
import com.keros.katibri.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
  public static final BlockBasic dustBrick = new BlockDustBrick();
  public static void init(){
    GameRegistry.registerBlock(dustBrick,Names.Blocks.DUST_BRICK);
  }
}
