package com.sheth.collections;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<String> {

	public MapComparator(Map<Integer, String> hm) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2);
	}

}
