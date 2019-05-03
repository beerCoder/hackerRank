package com.java.concurrent;

import java.util.HashMap;
import java.util.Map;

   public class MapCompute {

   public static void main(String[] args){
      // We'll be using this simple map
      // Unfortunately, still no map literals in Java 8..
      
      Map<String, Integer> map = new HashMap<>();
      map.put("A", 1);
      map.put("B", 2);
      map.put("C", 3);
       
      // Compute a new value for the existing key
      System.out.println(map.compute("A", 
                                     (k, v) -> v == null ? 42 : v + 45));
      System.out.println(map);
       
      // This will add a new (key, value) pair
      System.out.println(map.compute("X", 
          (k, v) -> v == null ? 42 : v + 46));
      System.out.println(map);
      
      map.forEach((k, v) -> 
      System.out.println(k + "=" + v));
   }
}