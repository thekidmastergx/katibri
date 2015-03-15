package com.keros.katibri.init;

import cpw.mods.fml.common.registry.GameRegistry;

import com.keros.katibri.reference.Reference;
import com.keros.katibri.reference.Names;
import com.keros.katibri.block.BlockBasic;
import com.keros.katibri.block.BlockDustBrick;
import com.keros.katibri.block.BlockOreCopper;
import com.keros.katibri.block.BlockOreZinc;
import com.keros.katibri.block.BlockOreSilver;
import com.keros.katibri.block.BlockMetalCopper;
import com.keros.katibri.block.BlockMetalZinc;
import com.keros.katibri.block.BlockMetalSilver;
import com.keros.katibri.block.BlockMetalBrass;
import com.keros.katibri.block.BlockMetalSteel;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks{
  public static final BlockBasic dustBrick = new BlockDustBrick();

  public static final BlockBasic oreCopper = new BlockOreCopper();
  public static final BlockBasic oreZinc = new BlockOreZinc();
  public static final BlockBasic oreSilver = new BlockOreSilver();

  public static final BlockBasic metalCopper = new BlockMetalCopper();
  public static final BlockBasic metalZinc = new BlockMetalZinc();
  public static final BlockBasic metalSilver = new BlockMetalSilver();
  public static final BlockBasic metalBrass = new BlockMetalBrass();
  public static final BlockBasic metalSteel = new BlockMetalSteel();

  public static void init(){
    GameRegistry.registerBlock(dustBrick,Names.Blocks.DUST_BRICK);

    GameRegistry.registerBlock(oreCopper,Names.Blocks.ORE_COPPER);
    GameRegistry.registerBlock(oreZinc,Names.Blocks.ORE_ZINC);
    GameRegistry.registerBlock(oreSilver,Names.Blocks.ORE_SILVER);

    GameRegistry.registerBlock(metalCopper,Names.Blocks.METAL_COPPER);
    GameRegistry.registerBlock(metalZinc,Names.Blocks.METAL_ZINC);
    GameRegistry.registerBlock(metalSilver,Names.Blocks.METAL_SILVER);
    GameRegistry.registerBlock(metalBrass,Names.Blocks.METAL_BRASS);
    GameRegistry.registerBlock(metalSteel,Names.Blocks.METAL_STEEL);
  }
}
