package com.java.demoPrograms;

public class MethodHiding
{
   public static void main(String[] args)
   {
      Abc ab = new Xyz();
      ab.display();
   }

}


class Xyz extends Abc {
   
   
   public static int x = 11;
   
   public static void display(){
      System.out.println(x);
   }
   
}

abstract class Abc{   
   
   public static int x = 10;
   
   public static void display(){
      System.out.println(x);
   }
   
}