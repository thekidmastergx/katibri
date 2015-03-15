package com.keros.katibri.block;

import com.keros.katibri.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockBasic extends Block{
  public BlockBasic(Material material){
    super(material);
  }
  public BlockBasic(){
    this(Material.rock);
  }

  @Override
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister)
  {
    blockIcon = iconRegister.registerIcon(Reference.MOD_ID+":"+this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));;
  }
}
