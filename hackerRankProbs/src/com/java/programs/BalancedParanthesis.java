package com.java.programs;
import java.util.*;

class BalancedParanthesis {

    static boolean check(String str) {
    Stack<Character> stack  = new Stack<Character>();
    String s = str; 
     for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;

            }else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;

            }else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            }

        }
        return stack.isEmpty();
    
    }
    
    public static void main(String[] args){
       //BalancedParanthesis b = new BalancedParanthesis();
       System.out.println(check("[{()}]"));
       
    }

}
