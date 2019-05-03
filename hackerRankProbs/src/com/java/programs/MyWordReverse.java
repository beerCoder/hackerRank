package com.java.programs;

import java.util.Stack;

public class MyWordReverse {
 
   //Reverse a word using a stack 
   public String reverseWord(String word){
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        int size = word.length();
        //StackImpl stack = new StackImpl(size);
        for(int i=0;i<size;i++){
            stack.push(word.charAt(i));
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
     
    public static void main(String a[]){
        MyWordReverse mwr = new MyWordReverse();
        System.out.println("Java2Novice == "+mwr.reverseWord("Java2Novice"));
        System.out.println("Java == "+mwr.reverseWord("Java Program"));
        System.out.println("program == "+mwr.reverseWord("program yyprogram"));
    }
}
 
