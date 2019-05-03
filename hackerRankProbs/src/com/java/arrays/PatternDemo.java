package com.java.arrays;

public class PatternDemo
{

   public static void main(String[] args)
   {
      // TODO Auto-generated method stub
      /*
       
      1 
      1 2 
      1 2 3 
      1 2 3 4 
      1 2 3 4 5 
   
       * */
      
      for(int i=1; i<6; i++){
        
         for(int j=1; j<=i; j++){
            System.out.print(j+" ");
         }
         System.out.println();
            
      }
      
      System.out.println();   
      /*
      
      1 
      2 3 
      3 4 5 
      4 5 6 7 
      5 6 7 8 9 
       
       * */
      for(int i=1; i<6; i++){
         int num = i;
         
         for(int j=1;j<=i; j++){
            System.out.print(num+" ");  
            num++;
         }
         
         System.out.println();         
         
      }
      System.out.println();   
      /*
      1 
      2 2 
      3 3 3 
      4 4 4 4 
      5 5 5 5 5 
      
      */
      for(int i=1; i<6; i++){
         int num = i;
         
         for(int j=1;j<=i; j++){
            System.out.print(i+" ");  
            num++;
         }
         
         System.out.println();         
         
      }

   }

}
