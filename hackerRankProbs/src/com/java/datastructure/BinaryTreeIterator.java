package com.java.datastructure;

public class BinaryTreeIterator
{

   public static int binarySearch(int[] array,int x){
      
      int low = 0;
      int high = array.length-1;
      int mid = low + (high-low)/2;
      
      while(low < high){
         
         if(x == array[mid]){
            return mid;
         }
         else if(x > array[mid]){
            low = mid+1;
         }
         else {
            high = mid-1;
         }
      }
      
      return -1;   
      
   }
   
   public static void main(String[] args)
   {
      int[] array = {2,4,5,7,13,15,16};  
      
      int index = binarySearch(array,5);
      System.out.println(index);

   }

}
