package com.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayListDimondTest
{

   public static void main(String[] args)
   {
     List list = new ArrayList<Integer>();
     List<? extends Number> llist = new LinkedList<Integer>();
     list.add(1);
     list.add("aa");    
     list.add("aaq");   
     System.out.println(list);
     
     for(Object ch: list){
        System.out.println(ch);
     }
     
     Map map = new HashMap<Integer,Integer>();
     map.put("Pravir", "Ghosh");
     map.put("Pravir", "Kumar1");
     map.put("sdfs", "Kumar");
     System.out.println(map);
     
     for(Object ch: map.keySet()){
        //System.out.println(ch);
        System.out.println(map.get(ch));
     }
     System.out.println("");
     Set mapset = map.keySet();
     Iterator itr = mapset.iterator();
     while(itr.hasNext()){
        //System.out.println(itr.next());
        String key = (String)itr.next();
        System.out.println("key =" +key +" value ="+ map.get(key) );
        
     }
     
   }

}
