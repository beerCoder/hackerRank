package com.java.concurrent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleWithLambda {

	public static void main(String[] args) {
		
		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++) myList.add(i);
		System.out.println(StreamExampleWithLambda.sumStream(myList));
		
		
		

	}
	
	private static int sumStream(List<Integer>myList) {
      return myList.stream().filter(i -> i < 10).mapToInt(i -> i).sum();
   }

}
