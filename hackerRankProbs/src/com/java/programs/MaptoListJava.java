package com.java.programs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *Converting HashMap into ArrayList in Java
 */
public class MaptoListJava {

    public static void main(String... args) {
        HashMap<String, String> personalLoanOffers = new HashMap<String, String>();
        // preparing hashmap with keys and values
        personalLoanOffers.put("personal loan by DBS", "Interest rate low");
        personalLoanOffers.put("personal loan by Standard Charted", "Interest rate low");
        personalLoanOffers.put("HSBC personal loan by DBS", "14%");
        personalLoanOffers.put("Bankd of America Personal loan", "11%");
      
        System.out.println("Size of personalLoanOffers Map: " + personalLoanOffers.size());
      
        //Converting HashMap keys into ArrayList
       // List<String> keyList = new ArrayList<String>(personalLoanOffers.keySet());
       // System.out.println("Size of Key list from Map: " + keyList.size());
      
        //Converting HashMap Values into ArrayList
       // List<String> valueList = new ArrayList<String>(personalLoanOffers.values());
       // System.out.println("Size of Value list from Map: " + valueList.size());
      
        List<Entry> entryList = new ArrayList<Entry>(personalLoanOffers.entrySet());
        System.out.println("Size of Entry list from Map: " + entryList.size());
        for(Entry entry:entryList){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
        
        HashMap<String, Integer> desc = new HashMap<>();
        desc.put("Red", 5);
        desc.put("Blue", 4);
        desc.put("Green", 6);
        desc.put("Purple", 1);
        
        //Set<Entry<String, Integer>> set = desc.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(desc.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
           {
              public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
              {
                 return (o1.getValue()).compareTo( o2.getValue());
              }
           } 
        ); 
           for(Map.Entry<String, Integer> entry:list){
              System.out.println(entry.getKey()+" ==== "+entry.getValue());
            }
        
        
        
        
        
        
    }
}
