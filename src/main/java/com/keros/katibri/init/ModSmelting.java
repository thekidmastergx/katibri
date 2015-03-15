package com.keros.katibri.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ModSmelting{
  public static void init(){
    GameRegistry.addSmelting(ModBlocks.oreCopper,new ItemStack(ModItems.ingotCopper),1.0f);
    GameRegistry.addSmelting(ModBlocks.oreZinc,new ItemStack(ModItems.ingotZinc),2.0f);
    GameRegistry.addSmelting(ModBlocks.oreSilver,new ItemStack(ModItems.ingotSilver),4.0f);
  }
}
