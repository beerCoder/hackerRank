package com.java.demoPrograms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

class Emp { 
    public Emp(String s) {

    }
}

public class Testing { 
    public static void main(String[] args) { 
        Emp e1 = new Emp("hello"); 
        Emp e2 = new Emp("hello"); 
        System.out.println(e1 == e2); 
        System.out.println(e1.equals(e2));

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        
        
        LinkedHashMap<Integer,List<String>> lmap = new LinkedHashMap<>();
        
        List<String> arlist = new ArrayList<>();
        arlist.add("p");
        arlist.add("k");
        arlist.add("h");
        arlist.add("2");
        
        lmap.put(1, arlist);
        lmap.put(2, arlist);
        
       
        
        System.out.println(lmap);
        
        
    }

}