package com.sheth.collections;

//import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {
	
	public void sortmapExample(){
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(4, "Collections");
		hm.put(1, "Dipal");
		hm.put(3, "Java");
		hm.put(2, "Sheth");
		hm.put(5, "HashMap");
		
		System.out.println(hm);
		
		Map<Integer,String> tm = new TreeMap<Integer,String>();
		tm.putAll(hm);;
		
	}

	public static void main(String[] args) {
		SortMapByValue obj = new SortMapByValue();
		obj.sortmapExample();
		

	}

}
