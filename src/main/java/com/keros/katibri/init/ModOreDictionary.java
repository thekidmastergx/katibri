package com.keros.katibri.init;

import net.minecraftforge.oredict.OreDictionary;

public class ModOreDictionary{
  public static void init(){
    OreDictionary.registerOre("ingotCopper",ModItems.ingotCopper);
    OreDictionary.registerOre("ingotZinc",ModItems.ingotZinc);
    OreDictionary.registerOre("ingotSilver",ModItems.ingotSilver);
    OreDictionary.registerOre("ingotBrass",ModItems.ingotBrass);
    OreDictionary.registerOre("ingotSteel",ModItems.ingotSteel);

    OreDictionary.registerOre("oreCopper",ModBlocks.oreCopper);
    OreDictionary.registerOre("oreZinc",ModBlocks.oreZinc);
    OreDictionary.registerOre("oreSilver",ModBlocks.oreSilver);

    OreDictionary.registerOre("blockCopper",ModBlocks.metalCopper);
    OreDictionary.registerOre("blockZinc",ModBlocks.metalZinc);
    OreDictionary.registerOre("blockSilver",ModBlocks.metalSilver);
    OreDictionary.registerOre("blockBrass",ModBlocks.metalBrass);
    OreDictionary.registerOre("blockSteel",ModBlocks.metalSteel);
  }
}
