package com.java.arrays;

public class Largest_Number 
{
    public static void main(String[] args) 
    {
        int n = 0, max,min;
        int[] a = {1,2,5,8,9,15,-1};
        
        max = a[0];
        min = a[0];
        
        for(int i = 0; i < a.length  ; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
            
           if(min > a[i])
            {
               min = a[i];
            }
        }
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);
    }
}