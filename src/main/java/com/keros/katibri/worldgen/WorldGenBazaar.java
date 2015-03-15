package com.keros.katibri.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import com.keros.katibri.init.ModBlocks;
import net.minecraft.world.chunk.IChunkProvider;
import java.util.Random;
import java.util.ArrayList;

import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
// import com.keros.katibri.util.Paint;

public class WorldGenBazaar implements IWorldGenerator{
  public void generate(Random r, int chunkX, int chunkZ,World w,IChunkProvider gen, IChunkProvider pro){
    int x = chunkX * 16 + r.nextInt(16);
    int z = chunkZ * 16 + r.nextInt(16);
    int length = r.nextInt(4)+12;
    int width = r.nextInt(4)+12;

    if(r.nextInt(100) < 99) {
      for(int i = 0; i < length+1; i++){
        for( int j = 0; j < width+1; j++){
          if( i == 0 || j == 0 || i == length || j == width){
            w.setBlock(x+i,w.getHeightValue(x,z)+1,z+j,Blocks.fence);
            w.setBlock(x+i,w.getHeightValue(x,z),z+j,Blocks.stonebrick);
            for( int k = -4; k < 0; k++){
              w.setBlock(x+i,w.getHeightValue(x,z)+k,z+j,Blocks.iron_bars);
            }
          }else{
            w.setBlock(x+i,w.getHeightValue(x,z),z+j,Blocks.sandstone);
          }
        }
      }
    }
  }
}
