package com.java.datastructure;

import java.util.Comparator;
import java.util.Stack;

public class SortAStack 
{

   public static Stack<Integer> sortStack (Stack<Integer> stack){
      
      stack.sort(new Comparator<Integer>(){

         @Override
         public int compare(Integer o1, Integer o2)
         {
           
            return o1.compareTo(o2);
         }
         
      });
      
      return stack;
      
   }
   
   public static void main(String[] args)
   {
      Stack<Integer> input = new Stack<Integer>();
      input.push(9);
      input.push(4);
      input.push(96);
      input.push(98);
      input.push(29);
      input.push(93);
      
      System.out.println(sortStack(input));

   }

   

}
