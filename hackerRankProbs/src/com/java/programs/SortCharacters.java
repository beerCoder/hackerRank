package com.java.programs;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortCharacters
{

   public static void main(String[] args)
   {
      String input = "hello";
      char[] charArray = input.toCharArray();
      Arrays.sort(charArray);      
      //String sorted = new String(charArray);
      System.out.println(charArray);
      
      
     /* int length = charArray.length;
      char[] arr = null;
      for(int i=0;i<length;i++){
         for(int j=i+1;j<length  ;j++){
            if (charArray[j] < charArray[i]) {
                char temp = charArray[i];                
                charArray[i]=arr[j];
                charArray[j]=temp;
            }
         }
      }*/
      
    // System.out.println(charArray);

   }

}
