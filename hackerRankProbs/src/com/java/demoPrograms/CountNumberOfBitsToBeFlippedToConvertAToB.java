package com.java.demoPrograms;
public class CountNumberOfBitsToBeFlippedToConvertAToB {
 
 public static void main(String[] args) {
  int a = 6;
  int b = 8;
 
  System.out.println(countBitToFlipToConvertAToB(a,b));
 }
  
 private static int countBitToFlipToConvertAToB(int a, int b){
  
  //Find number of bits that differ between A and B.
  int c = a ^ b; 
   
  //Count number of SET bits in "c"
  int count=0;
   
  while(c!=0){
   c = c &(c-1);
   count++;
  }
  return count;
 }
}