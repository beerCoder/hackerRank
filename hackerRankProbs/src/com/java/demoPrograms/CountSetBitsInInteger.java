package com.java.demoPrograms;
public class CountSetBitsInInteger {
 
 public static void main(String[] args) {
  int n = 13;
  System.out.println(countSetBit(n));
  
  int a = 60; /* 60 = 0011 1100 */
  int b = 13; /* 13 = 0000 1101 */
  int c = 0;

  c = a & b;        /* 12 = 0000 1100 */
  System.out.println("a & b = " + c );

  c = a | b;        /* 61 = 0011 1101 */
  System.out.println("a | b = " + c );

  c = a ^ b;        /* 49 = 0011 0001 */
  System.out.println("a ^ b = " + c );

  c = ~a;           /*-61 = 1100 0011 */
  System.out.println("~a = " + c );

  c = a << 2;       /* 240 = 1111 0000 */
  System.out.println("a << 2 = " + c );

  c = a >> 2;       /* 15 = 1111 */
  System.out.println("a >> 2  = " + c );

  c = a >>> 2;      /* 15 = 0000 1111 */
  System.out.println("a >>> 2 = " + c );
 }
  
 private static int countSetBit(int number){
  int counter = 0;
   
  while(number>0){
   if(number%2 == 1){
    counter++;
   }
   number = number/2; 
   //or number = number >> 1
  }
  return counter;
 } 
}

// 1101