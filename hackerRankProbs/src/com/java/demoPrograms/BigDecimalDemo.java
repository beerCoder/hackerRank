package com.java.demoPrograms;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {

   
   public static void main(String[] args) {

      // create a BigDecimal object
      BigDecimal bg, bg2;

      // create a Double Object
      Double d = new Double("123.45678");

      // assign the bigdecimal value of d to bg
      // static method is called using class name
      bg = BigDecimal.valueOf(d);
      //bg.setScale(3);
      bg2 = bg.setScale(3, RoundingMode.FLOOR);
      String str = "The Double After Conversion to BigDecimal is " + bg2.toString();

      // print bg value
      System.out.println( str );
   }
}