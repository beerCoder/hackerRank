package com.java.demoPrograms;
public class Hi extends Greeting{
    
    
    Hi(){this("Hello");}
 
    Hi(String s){super(s);}
    
    public static void main(String[] args) {
       
       new Hi();
       new Hi("Hi");
   }
}

 class Greeting {
   
   Greeting(String s)
   { System.out.print(s);}
}