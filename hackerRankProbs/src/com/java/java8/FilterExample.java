package com.java.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(20);
		list.add(15);
		
		System.out.println(list);
		List<Integer> list2 = list.stream().filter(i-> i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
	}

}

