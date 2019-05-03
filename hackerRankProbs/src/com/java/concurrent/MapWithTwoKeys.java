package com.java.concurrent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithTwoKeys {
	
	private static final Map<MapKey, List<Object>> mapWithTwoKeys = new HashMap<MapKey, List<Object>>();

	public static void main(String[] args) {

		// Create first map entry with key <A,B>.
		MapKey mapKey1 = new MapKey();
		mapKey1.setKey1("A");
		mapKey1.setKey2("B");

		List<Object> list1 = new ArrayList<Object>();
		list1.add("List1 Entry");

		mapWithTwoKeys.put(mapKey1, list1);

		// Create second map entry with key <A,B>, append value.
		MapKey mapKey2 = new MapKey();
		mapKey2.setKey1("A");
		mapKey2.setKey2("B");

		List<Object> list2 = new ArrayList<Object>();
		list2.add("List2 Entry");

		mapWithTwoKeys.put(mapKey2, list2);

		// Create third map entry with key <A,>.
		MapKey mapKey3 = new MapKey();
		mapKey3.setKey1("A");
		mapKey3.setKey2("");

		List<Object> list3 = new ArrayList<Object>();
		list3.add("List3 Entry");

		mapWithTwoKeys.put(mapKey3, list3);

		// Create forth map entry with key <,>.
		MapKey mapKey4 = new MapKey();
		mapKey4.setKey1("");
		mapKey4.setKey2("");

		List<Object> list4 = new ArrayList<Object>();
		list4.add("List4 Entry");

		mapWithTwoKeys.put(mapKey4, list4);

		// Create forth map entry with key <,B>.
		MapKey mapKey5 = new MapKey();
		mapKey5.setKey1("");
		mapKey5.setKey2("B");

		List<Object> list5 = new ArrayList<Object>();
		list5.add("List5 Entry");

		mapWithTwoKeys.put(mapKey5, list5);

		for (Map.Entry<MapKey, List<Object>> entry : mapWithTwoKeys.entrySet()) {
			System.out.println("MapKey Key: <" + entry.getKey().getKey1() + ","
					+ entry.getKey().getKey2() + ">");
			System.out.println("Value: " + entry.getValue());
			System.out.println("---------------------------------------");
		}
	}

}
