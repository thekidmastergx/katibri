package com.keros.katibri.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModCrafting{
  public static void init(){
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.metalCopper),"iii","iii","iii",'i',"ingotCopper"));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.metalZinc),"iii","iii","iii",'i',"ingotZinc"));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.metalSilver),"iii","iii","iii",'i',"ingotSilver"));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.metalBrass),"iii","iii","iii",'i',"ingotBrass"));
    GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModBlocks.metalSteel),"iii","iii","iii",'i',"ingotSteel"));
  }
}
