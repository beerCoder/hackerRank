package com.java.datastructure;
import java.util.Stack;

public class StactTest
{
        public static void main(String args[])
        {
                // Create a new, empty stack
                Stack lifo = new Stack();
                String name = "Pravir";
               
                
                // Let's add some items to it
                for (int i = 1; i <= 10; i++)
                {
                        lifo.push ( (i) );
                }
                System.out.println(lifo);
                // Last in first out means reverse order
                while ( !lifo.empty() )
                {
                        System.out.print ( lifo.pop() );
                        System.out.print ( ',' );
                }

                // Empty, let's lift off!
                System.out.println (" LIFT-OFF!");
        }

}