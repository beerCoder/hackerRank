package com.java.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
   public static void main(String[] args) {
      
		/*
		 * // create an empty array list with an initial capacity ArrayList<Integer>
		 * arrlist = new ArrayList<Integer>(5);
		 * 
		 * // use add() method to add elements in the list arrlist.add(15);
		 * arrlist.add(25);
		 * 
		 * // let us print all the elements available in list ListIterator<Integer> itr
		 * = arrlist.listIterator(); //arrlist.remove(0); System.out.println("start");
		 * while(itr.hasNext()){ itr.add(0); System.out.println(itr.next()+ "===");
		 * 
		 * } System.out.println("end");
		 * 
		 * System.out.println(arrlist);
		 */
      Thread t1 = new Thread(new A());
      Thread t2 = new Thread(new A());
      t1.start();
      t2.start();
   }
} 

class A implements Runnable{

   volatile int i=10;
   @Override
   public  void run()
   {
      while(i>0)
      {
         System.out.println(i + " " + Thread.currentThread().getName());
			/*
			 * try { Thread.sleep(200); } catch (InterruptedException e) { // TODO
			 * Auto-generated catch block e.printStackTrace(); }
			 */
         i--;
      }
   }
   
}