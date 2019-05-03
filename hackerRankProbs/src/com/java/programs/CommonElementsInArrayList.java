package com.java.programs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CommonElementsInArrayList
{

   public static void main(String[] args)
   {
      // Create two collections:
      LinkedList<String> lList =  new LinkedList<String>();
      ArrayList<String> aList =  new ArrayList<String>();

      // Add some elements to lList:
      lList.add("Isabella");
      lList.add("Angelina");
      lList.add("Pille");
      lList.add("Hazem");

      // Add some elements to aList:
      aList.add("Isabella");
      aList.add("Angelina");
      aList.add("Bianca");

      // Display the two collections before:
      System.out.println("The aList collection before: " + aList);
      System.out.println("The lList collection before: " + lList);

      // Delete the elements lList that are not in aList:
      lList.retainAll(aList);
      //if you want to avoid that changes are being affected
      List<String> common = new ArrayList<String>(aList);
      common.retainAll(lList);


      // Display the collection after:
      // Display the two collections before retaining all:
      System.out.println("The aList collection after: " + aList);
      System.out.println("The lList collection after: " + lList);
      System.out.println("The common collection after: " + common);


  }

   }

