package com.java.arrays;

import java.util.ArrayList;

public class ReverseAString {
    public String reverseWords(String s) {
        String words[] = split(s);
        String res = "";
        for (String word: words)
            res += reverse(word) + " ";
        return res.trim();
    }
    public String[] split(String s) {
        ArrayList < String > words = new ArrayList < > ();
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(word);
                word = "";
            } else
                word += s.charAt(i);
        }
        words.add(word);
        return words.toArray(new String[words.size()]);
    }
    public String reverse(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++)
            res = s.charAt(i) + res;
        return res;
    }
    
    public void reverseString(String s) {
       String res = "";
       for (int i = s.length(); i > 0; i--){
         System.out.println(i);
    }
          
       //return res;
   }
    
    public static void main(String[] arg){
       ReverseAString rs = new ReverseAString();
       System.out.println(rs.reverseWords("Pravir ghosh"));
       
       String s = "ghosh Pravir";
       //String res = "";
       for (int i = s.length()-1; i >= 0; i--){
         System.out.print(s.charAt(i)+" ");
       }
       
       
    }
}