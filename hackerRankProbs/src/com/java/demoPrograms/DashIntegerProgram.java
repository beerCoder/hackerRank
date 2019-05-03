package com.java.demoPrograms;

import java.util.Scanner;

public class DashIntegerProgram
{

   public static void main(String[] args) throws Exception {
      Scanner kbd = new Scanner(System.in);
      System.out.println("Enter the numbers: ");
      String myString = kbd.nextLine();
      char[] numbers = myString.toCharArray();

      String result = "";
      for(int i = 0; i < numbers.length; i++) {
          int value1 = Character.getNumericValue(numbers[i]);
          int value2 = i + 1 < numbers.length 
                  ? Character.getNumericValue(numbers[i + 1]) 
                  : 0;

          if(value1 % 2 != 0 && value2 % 2 != 0) {
              result += numbers[i] + "-";
          } else {
             // result += numbers[i];
              result += numbers[i] + "*";
          }
      }
      System.out.println(result);
  }

}
