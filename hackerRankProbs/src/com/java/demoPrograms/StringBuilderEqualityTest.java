package com.java.demoPrograms;
public class StringBuilderEqualityTest {
 
    public static void main(String[] args) {
 
        String s = "";
        
        StringBuffer sb1 = new StringBuffer("Hi");
        StringBuffer sb2 = new StringBuffer("Hi");
        StringBuffer sb3 = new StringBuffer(sb2);
        StringBuffer sb4 = sb3;
       
        
        System.out.println(sb1.equals(sb2));
        System.out.println(sb2.equals(sb3));
        System.out.println(sb3.equals(sb4));
        
        System.out.println("  ====");
        
        
        System.out.println(sb1 == sb2);
        System.out.println(sb2 == sb3);
        System.out.println(sb3 == sb4);
        
        
        if(sb1.equals(sb2)) s += "1";
        if(sb2.equals(sb3)) s += "2";
        if(sb3.equals(sb4)) s += "3";
        
                
        String s1 = "Hi";
        String s2 = "Hi";
        String s3 = s2;
        
        if(s1.equals(s2)) s += "4";
        if(s2.equals(s3)) s += "5";
        
        System.out.println(s);
        
        System.out.println("  <<<====>>>");
        //----------------
        String a1 = "Pravir";
        String a2 = new String("Pravir");
        //String a3 = "Pravir";
        //String a4 = new String("Pravir");
        
        //System.out.println(a1==a3);
        System.out.println(a1==a2);
        //System.out.println(a2==a4);
        System.out.println("  <<====>>");
        System.out.println(a1.equals(a2));
        //System.out.println(a1.equals(a3));
        //System.out.println(a2.equals(a4));
       // System.out.println(a1.compareTo(a3));
        
        a1=a1.concat("Ghosh");
        System.out.println(a1);
        
        System.out.println("  ====");
        
        String t1 = "Test";
        String t2 = new String("Test");
        t1.intern();
        System.out.println(t1==t2);
        System.out.println(t1.equals(t2));
       
        
        
    }
 
}