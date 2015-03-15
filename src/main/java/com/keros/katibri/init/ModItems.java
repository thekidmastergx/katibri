package com.keros.katibri.init;

import com.keros.katibri.item.ItemBasic;
import com.keros.katibri.item.ItemSpice;
import com.keros.katibri.reference.Reference;
import com.keros.katibri.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems{
  public static final ItemBasic spice = new ItemSpice();
  public static void init(){
    GameRegistry.registerItem(spice,Names.Items.SPICE);
  }
}
