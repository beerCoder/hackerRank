package com.java.arrays;

public class FindSecondLargestNumber {
	
	public static void main(String[] args) {
		
		int array[] = {1,34,52,84,13,25};
		printSecondLargestNumber(array, array.length);
		
	}
	
	public static void printSecondLargestNumber(int arr[], int arr_size){
		
		int i, first , second;
		
		if(arr_size< 2){
			System.out.println("invalid input");
			return;			
		}
		
		first = second = Integer.MIN_VALUE;
		for(i=0; i < arr_size; i++){
			
			if(arr[i] > first){
				second = first;
				first = arr[i];
			}else if(arr[i] > second && second != first){
				second = arr[i];
			}
			
		}	
		
		System.out.println(second);
		
	}

}
