package com.java.algorithms;

// Time complexity = O(logn )
//Iterative process
public class BinarySearchAlgo {
	
	static int a[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
			41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};	
	
	public static void main(String[] args) {
		
		int low = 0;
		int high = a.length-1;
		int key = 73;
		
		System.out.println(BinarySearchAlgo.binarySearch(low,high,key));
			
		
	}
	
	static int binarySearch(int low,int high,int key)
	{
	   	 while(low<=high)
			   {
			     int mid=(low+high)/2;
			     if(a[mid]<key)
			     {
			         low=mid+1;
			     }
			     else if(a[mid]>key)
			     {
			         high=mid-1;
			     }
			     else
			     {
			         return mid;
			     }
			   }
			   return -1;                //key not found
	}

}

/*
// Binary search recursive method
Algo BinarySearchRecursive (l, h, mid){
	
	if(l==h){
		
		if(A[l]== key){
			return l;
		}else{
			return 0;
		}
	}else{
		
		mid = (l+h)/2;
		if(key ==A[mid] ){
			return mid;			
		}
		if(key < A[mid]){
			return BinarySearchRecursive(l,mid-1,key);
		}else{
			return BinarySearchRecursive(mid+1,h,key);
		}
	}
	
	
}
*/