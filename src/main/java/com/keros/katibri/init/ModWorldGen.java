package com.keros.katibri.init;

import cpw.mods.fml.common.IWorldGenerator;
import com.keros.katibri.worldgen.WorldGenBazaar;
import com.keros.katibri.reference.Reference;
import com.keros.katibri.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModWorldGen{
  public static final IWorldGenerator bazaar = new WorldGenBazaar();
  public static void init(){
    GameRegistry.registerWorldGenerator(bazaar,500);
  }
}
