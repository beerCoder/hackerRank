package com.java.demoPrograms;
class ExceptionExample{ 
 
 public static final void main(String[] args) {
  System.out.println(test());
 }
 
 private static String test() {
  try {
   String str = null;
   return str.toString();
   
  }finally {
   return "hello finally";
  }
 } 
}

/*class ExceptionExample {
   public static void main(String[] args) throws Exception {
    test();
   }
   private static void test() throws Exception{
    throw new Exception();
   }
  }*/