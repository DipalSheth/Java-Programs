package com.sheth.collections;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayList {
	
	public void getcopy(){
		
		//creating arraylist
		List<String> arr = new ArrayList<String>();
		//add elements
		arr.add("Amar");
		arr.add("Akbar");
		arr.add("Anthony");
		arr.add(null);
		arr.add("Amar");
		
		System.out.println("Actual ArrayList: " + arr);
		
		String[] str = new String[arr.size()];
		arr.toArray(str);
		
		System.out.println("Created ArrayList: ");
		for(String s : str ){
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		CopyArrayList obj = new CopyArrayList();
		obj.getcopy();

	}

}
