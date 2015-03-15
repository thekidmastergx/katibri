package com.keros.katibri.creative;

import com.keros.katibri.init.ModItems;
import com.keros.katibri.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabBase{
  public static final CreativeTabs TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()){
    @Override
    public Item getTabIconItem(){
      return ModItems.spice;
    }
  };
}
