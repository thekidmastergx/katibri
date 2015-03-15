package com.keros.katibri.worldgen;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

import com.keros.katibri.init.ModBlocks;

public class WorldGenOre implements IWorldGenerator{
  public void generate(Random r, int chunkX, int chunkZ,World w,IChunkProvider gen, IChunkProvider pro){
    int randX1 = chunkX *16 + r.nextInt(16);
    int randY1 = r.nextInt(60);
    int randZ1 = chunkX *16 + r.nextInt(16);
    int randX2 = chunkX *16 + r.nextInt(16);
    int randY2 = r.nextInt(60);
    int randZ2 = chunkX *16 + r.nextInt(16);
    int randX3 = chunkX *16 + r.nextInt(16);
    int randY3 = r.nextInt(60);
    int randZ3 = chunkX *16 + r.nextInt(16);
    for(int i = 0; i < 16; i++){
      (new WorldGenMinable(ModBlocks.oreCopper,12)).generate(w,r,randX1,randY1,randZ1);
      (new WorldGenMinable(ModBlocks.oreZinc,12)).generate(w,r,randX2,randY2,randZ2);
      (new WorldGenMinable(ModBlocks.oreSilver,12)).generate(w,r,randX3,randY3,randZ3);
    }
  }
}
