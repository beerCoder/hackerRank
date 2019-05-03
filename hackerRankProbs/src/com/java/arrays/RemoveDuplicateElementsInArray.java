package com.java.arrays;
public class RemoveDuplicateElementsInArray {
 
    public static int[] removeDuplicates(int[] input){
         
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }
         
        return output;
    }
    //this is the easiest and correct one
    public static void removeElement(){
      
       int[] input = new int[]{1, 1, 3,5, 7, 7, 8, 9, 9, 9, 10};
       int current = input[0];
       boolean found = false;

       for (int i = 0; i < input.length; i++) {
          if (current == input[i] && !found) {
               found = true;
           } else if (current != input[i]) {
               System.out.print(current+" ");
               current = input[i];
               found = false;
           }
       }
       
      //System.out.println("== " + current);
      //System.out.println("");
      
       
       
    }
    
     
    public static void main(String a[]){
        //int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        //int[] output = removeDuplicates(input1);
        RemoveDuplicateElementsInArray n = new RemoveDuplicateElementsInArray();
        n.removeElement();
       /* for(int i:output){
            System.out.print(i+" ");
        }*/
    }
}