package com.java.datastructure.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortFruitObject{

	public static void main(String args[]){

		Fruit[] fruits = new Fruit[5];

		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",120);
		Fruit apple = new Fruit("Apple", "Apple description",40);
		Fruit apple2 = new Fruit("Apple", "Apple description",50);
		Fruit orange = new Fruit("Orange", "Orange description",80);
		Fruit banana = new Fruit("Banana", "Banana description",90);

		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		fruits[4]=apple2;

		Arrays.sort(fruits);
		/*Arrays.sort(fruits, new Comparator<Fruit>() {

	      public int compare(Fruit fruit1, Fruit fruit2) {
	      
	         String fruitName1 = fruit1.getFruitName().toUpperCase();
	         String fruitName2 = fruit2.getFruitName().toUpperCase();
	         
	         int result = fruitName1.compareTo(fruitName2);
	         if(result == 0){
	            return fruit1.getQuantity() - fruit2.getQuantity();
	         }
	         //ascending order
	         return fruitName1.compareTo(fruitName2);
	         
	         //descending order
	         //return fruitName2.compareTo(fruitName1);
	     
	      
	    }); }*/
		
		

		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() +
			", Quantity : " + temp.getQuantity());
		}
		
		

	}
}