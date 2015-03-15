package com.keros.katibri.util;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
public class Paint{
  public static class Point{
    int x; int y; int z;
    public Point(int i, int j,int k){
      x = i; y = j; z = k;
    }
  }

  public static void paintPrism(World w, Block b, Point p, Point d){
    for(int i = p.x; i < p.x+d.x; i++){
      for(int j = p.y; j < p.y+d.y; i++){
        for(int k = p.z; k < p.z+d.z; i++){
          w.setBlock(i,j,k,b);
        }
      }
    }
  }
  public static void paintRingedPrism(World w, Block b1,Block b2, Point p, Point d,int r){
    Point innerPrism = new Point(p.x+r,p.y, p.z+r);
    Point innerDimen = new Point(d.x-2*r,d.y,d.z-2*r);
    paintPrism(w,b1,p,d);
    paintPrism(w,b2,innerPrism,innerDimen);
  }
  public static void paintFloor(World w, Block b, Point p, int x, int y){
    paintPrism(w,b,p,new Point(x,y,1));
  }
  public static void paintRingedFloor(World w, Block b1, Block b2, Point p, int x, int y,int r){
    paintRingedPrism(w,b1,b2,p,new Point(x,y,1),r);
  }
  public static void paintPoint(World w, Block b, Point p){
    paintPrism(w,b,p,new Point(1,1,1));
  }
}
