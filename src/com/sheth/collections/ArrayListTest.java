package com.sheth.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public void arrayElements(){
		
		//creating arraylist
		List<String> arr = new ArrayList<String>();
		//add elements
		arr.add("Amar");
		arr.add("Akbar");
		arr.add("Anthony");
		arr.add(null);
		arr.add("Amar");
		
		//search for an element in the list
		if(arr.contains("Akbar")){
			System.out.println("Index of given element: "+ arr.contains("Akbar"));
		}
		
		//print the elements using iterator
		Iterator<String> itr = arr.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		//print the elements in reverse order
		ListIterator<String> itr1 = arr.listIterator(arr.size());
		System.out.println("Reversing elements");
		while(itr1.hasPrevious()){
			System.out.println(itr1.previous());
		}
	}

	public static void main(String[] args) {
		ArrayListTest obj = new ArrayListTest();
		obj.arrayElements();

	}

}
