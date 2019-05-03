package com.java.programs;


public class ClosetToZero
{
    
    public static void main (String[] args)
    {
      

        int [] data = { -10, -9, -5, 8, 1, 2, 7, -11,};
        int nearZero = 0;
        int temp = 0;
        int temp2 = data[0];

        for (int i = 0; i < data.length; i++)
        {
            temp = Math.abs (data[i]);
            nearZero = temp2;   
            if (temp < temp2)
            {
                temp2 = temp;
                nearZero = data[i];
            }


        }

        System.out.println ("The number closest to zero is: " + nearZero);

        // Place your program here.  'c' is the output console
    } // main method
} // Ass_1_B_3 class