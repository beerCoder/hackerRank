package com.java.concurrent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;   
public class FailFastExample
{
    
    
    public static void main(String[] args)
    {
      Map<String,String> premiumPhone = new HashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");  
        premiumPhone.put("Samsung","S5");
        
        Iterator iterator = premiumPhone.keySet().iterator();
        
        /*while (iterator.hasNext())
        {
           premiumPhone.put("Sony", "Xperia Z"); 
           System.out.println(premiumPhone.get(iterator.next()));
            
        }*/
        
        System.out.println("========================");
        ConcurrentHashMap<String,String> premiumPhone1 = 
        new ConcurrentHashMap<String,String>();
        premiumPhone1.put("Apple", "iPhone");
        premiumPhone1.put("HTC", "HTC one");
        premiumPhone1.put("Samsung","S5");

        Iterator iterator1 = premiumPhone1.keySet().iterator();

        while (iterator1.hasNext())
        {
           System.out.println(premiumPhone1.get(iterator1.next()));
           premiumPhone1.put("Sony", "Xperia Z");
           premiumPhone1.remove("HTC", "HTC one");
           iterator1.remove();
           
        }
        
    }
    
}
