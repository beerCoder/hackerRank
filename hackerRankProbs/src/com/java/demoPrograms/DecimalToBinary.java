package com.java.demoPrograms;
public class DecimalToBinary {
 
    public void printBinaryFormat(int number){
        int binary[] = new int[25];
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
    ///This method is the easiest one
    public String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
   }

     
    public static void main(String a[]){
        DecimalToBinary dtb = new DecimalToBinary();
        dtb.printBinaryFormat(25);
        String binary = dtb.toBinary(20);
        System.out.println("");
        System.out.println(binary);
    }
}