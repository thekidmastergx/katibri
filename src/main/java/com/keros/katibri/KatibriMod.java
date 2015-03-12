package com.keros.katibri;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = KatibriMod.MODID, version = KatibriMod.VERSION)
public class KatibriMod
{
    public static final String MODID = "katibri";
    public static final String VERSION = "1.7.10-0.0.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("DIRT BLOCK >> "+Blocks.sand.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        System.out.println("DIRT BLOCK >> "+Blocks.stone.getUnlocalizedName());
    }
}
