package com.keros.katibri.item;

import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.keros.katibri.reference.Reference;

public class ItemBasic extends Item{
  public ItemBasic(){
    super();
  }
  @Override
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister)
  {
    itemIcon = iconRegister.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
  }
}
