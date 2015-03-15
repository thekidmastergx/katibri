package com.keros.katibri;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.FMLCommonHandler;

import com.keros.katibri.handler.ConfigurationHandler;
import com.keros.katibri.reference.Reference;
import com.keros.katibri.proxy.IProxy;
import com.keros.katibri.util.LogHelper;

import com.keros.katibri.init.ModItems;
import com.keros.katibri.init.ModBlocks;
import com.keros.katibri.init.ModCrafting;
import com.keros.katibri.init.ModSmelting;
import com.keros.katibri.init.ModOreDictionary;
import com.keros.katibri.init.ModWorldGen;

@Mod(modid = Reference.MOD_ID,name=Reference.MOD_NAME, version = Reference.VERSION)
public class KatibriMod{
  public static final String MODID = "katibri";
  public static final String VERSION = "1.7.10-0.0.0";

  @Mod.Instance(Reference.MOD_ID)
  public static KatibriMod instance;

  @SidedProxy(clientSide = Reference.CLIENT_PROXY , serverSide = Reference.SERVER_PROXY)
  public static IProxy proxy;

  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event){
    ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
    
    ModWorldGen.init();
    ModItems.init();
    ModBlocks.init();
  }

  @Mod.EventHandler
  public void init(FMLInitializationEvent event){
    ModOreDictionary.init();
    ModCrafting.init();
    ModSmelting.init();
  }

  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event){
  }
}
