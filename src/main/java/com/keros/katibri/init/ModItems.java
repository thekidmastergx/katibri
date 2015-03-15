package com.keros.katibri.init;

import com.keros.katibri.item.ItemBasic;
import com.keros.katibri.item.ItemSpice;
import com.keros.katibri.item.ItemIngotCopper;
import com.keros.katibri.item.ItemIngotZinc;
import com.keros.katibri.item.ItemIngotSilver;
import com.keros.katibri.item.ItemIngotBrass;
import com.keros.katibri.item.ItemIngotSteel;
import com.keros.katibri.reference.Reference;
import com.keros.katibri.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems{
  public static final ItemBasic spice = new ItemSpice();

  public static final ItemBasic ingotCopper = new ItemIngotCopper();
  public static final ItemBasic ingotZinc = new ItemIngotZinc();
  public static final ItemBasic ingotSilver = new ItemIngotSilver();
  public static final ItemBasic ingotBrass = new ItemIngotBrass();
  public static final ItemBasic ingotSteel = new ItemIngotSteel();

  public static void init(){
    GameRegistry.registerItem(spice,Names.Items.SPICE);

    GameRegistry.registerItem(ingotCopper,Names.Items.INGOT_COPPER);
    GameRegistry.registerItem(ingotZinc,Names.Items.INGOT_ZINC);
    GameRegistry.registerItem(ingotSilver,Names.Items.INGOT_SILVER);
    GameRegistry.registerItem(ingotBrass,Names.Items.INGOT_BRASS);
    GameRegistry.registerItem(ingotSteel,Names.Items.INGOT_STEEL);
  }
}
