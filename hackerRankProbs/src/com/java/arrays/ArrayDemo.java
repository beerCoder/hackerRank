package com.java.arrays;
import java.util.Arrays;

public class ArrayDemo {

   public static void main(String[] args) {
    
   // initializing int array
   int arr[] = new int[] {1, 6, 3, 2, 9};
    
   // let us print the values
   System.out.println("Actual values: ");
   for (int value : arr) {
   System.out.println("Value = " + value);
   }

   // using fill for placing 18
   Arrays.fill(arr, 0,5,0);

   // let us print the values
   System.out.println("New values after using fill() method: ");
   for (int value : arr) {
   System.out.println("Value = " + value);
   }
   }
} 