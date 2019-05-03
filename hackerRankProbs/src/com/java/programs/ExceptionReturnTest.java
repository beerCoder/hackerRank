package com.java.programs;
class ExceptionReturnTest
{
    public static void main(String args[]) 
    { 
        System.out.println(ExceptionReturnTest.test()); 
    }

    public static String test()
    {
        try {
            System.out.println("try");
            return "try";
           
        } catch(Exception e) {
            //System.out.println("catch");
            return "return"; 
        } finally {  
            //System.out.println("finally");
            return "return in finally"; 
        }
    }
}