package com.keros.katibri.block;

import com.keros.katibri.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.keros.katibri.creative.CreativeTabBase;

public class BlockBasic extends Block{
  public BlockBasic(Material material){
    super(material);
    this.setCreativeTab(CreativeTabBase.TAB);
  }
  public BlockBasic(){
    this(Material.rock);
  }

  @Override
  @SideOnly(Side.CLIENT)
  public void registerBlockIcons(IIconRegister iconRegister){
    String blockName = this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1);
    blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":"+ blockName);
  }
}
