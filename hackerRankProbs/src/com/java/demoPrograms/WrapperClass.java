package com.java.demoPrograms;

//WrapperClass Immuteablity test
public class WrapperClass
{
   public static void main(String[] args) {
      Integer i = new Integer(5);  //assign new integer to i
      Integer b = new Integer(5); ;   //b refences same integer as i
     // i = 6;//modify i
     // System.out.println(i +"!="+b);
      int a = 10;
      int z = 10;
     // System.out.println(a==z);
      
     
      
      String s1 = new String("pravir");
      s1.intern();
      String s = "pravir";
      //s = "kunal";
      System.out.println(s.equals(s1));
      System.out.println("-------");
      System.out.println(s + "+" +s1);
      
      
      
      String ss1 = "abc";
      StringBuffer ss2 = new StringBuffer(s1);
      System.out.println(ss1.equals(ss2));
      //System.out.println(ss1==ss2);
      
      String st1 = "abc";
      String st2 = new String("abc");
      st2 = st2.intern();
      System.out.println("testing--->");
      System.out.println(st1 ==st2);
      System.out.println(st1.equals(st1));
      
      
   }
  
}

