package com.java.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


// different 
public class HashMapIterator
{

   public static void main(String[] args)
   {
      HashMap<String, String> loans = new HashMap<String, String>();
      loans.put("home loan", "citibank");
      loans.put("personal loan", "Wells Fargo");
      
      

      //Iterating or looping map using Java5 foreach loop
      for (String key : loans.keySet()) {
         System.out.println("------------------------------------------------");
         System.out.println("Iterating or looping map using java5 foreach loop");
         System.out.println("key: " + key + " value: " + loans.get(key));
      }


     //Iterating Map in Java using KeySet Iterator
      Set<String> keySet = loans.keySet();
      Iterator<String> keySetIterator = keySet.iterator();
      while (keySetIterator.hasNext()) {
         System.out.println("------------------------------------------------");
         System.out.println("Iterating Map in Java using KeySet Iterator");
         String key = keySetIterator.next();
         System.out.println("key: " + key + " value: " + loans.get(key));
      }


      //Looping HashMap in Java using EntrySet and Java 5 for loop
     // Set<Map.Entry<String, String>> entrySet = loans.entrySet();
      for (Entry entry : loans.entrySet()) {
         System.out.println("------------------------------------------------");
         System.out.println("looping HashMap in Java using EntrySet and java5 for loop");
         System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
      }
      
      //Iterating HashMap in Java using EntrySet and Java iterator
      Set<Map.Entry<String, String>> entrySet1 = loans.entrySet();
      Iterator<Entry<String, String>> entrySetIterator = loans.entrySet().iterator();
      while (entrySetIterator.hasNext()) {
         System.out.println("------------------------------------------------");
         System.out.println("Iterating HashMap in Java using EntrySet and Java iterator");
         Entry entry = entrySetIterator.next();
         System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
      }


      
   }

}
