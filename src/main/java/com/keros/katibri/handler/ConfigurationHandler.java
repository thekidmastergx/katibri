package com.keros.katibri.handler;

import com.keros.katibri.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler{
  public static Configuration config;
  public static boolean testValue = false;

  public static void init(File configFile){
    if (config == null){
      config = new Configuration(configFile);
      loadData();
    }
  }

  private static void loadData(){
    testValue = config.getBoolean("configValue", Configuration.CATEGORY_GENERAL, false, "This is an example configuration value");
    if (config.hasChanged()){
      config.save();
    }
  }

  @SubscribeEvent
  public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event){
    if (event.modID.equalsIgnoreCase(Reference.MOD_ID)){
      loadData();
    }
  }
}
