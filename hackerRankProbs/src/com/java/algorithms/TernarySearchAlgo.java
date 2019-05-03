package com.java.algorithms;

import java.security.AlgorithmParameterGenerator;

public class TernarySearchAlgo {
	
	static int ar[] = {11,12,13,14,15,16,17,18,19};
	
	 static int ternary_search(int l,int r, int x)
	{
	    if(r>=l)
	    {
	        int mid1 = l + (r-l)/3;
	        int mid2 = r -  (r-l)/3;
	        if(ar[mid1] == x)
	            return mid1;
	        if(ar[mid2] == x)
	            return mid2;
	        if(x<ar[mid1])
	            return ternary_search(l,mid1-1,x);
	        else if(x>ar[mid2])
	            return ternary_search(mid2+1,r,x);
	        else
	            return ternary_search(mid1+1,mid2-1,x);

	    }
	    return -1;
	}
	
	public static void main(String[] args) {
		
		//TernarySearchAlgo algo = new TernarySearchAlgo();
		int result = TernarySearchAlgo.ternary_search( 0,9, 15);
		System.out.println(result);
	}

}
