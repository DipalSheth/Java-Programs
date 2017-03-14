package com.sheth.collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {
	
	public void treesetExample(){
		
		Set<String> set = new TreeSet<String>();
		set.add("a1");
		set.add("a2");
		set.add("a3");
		set.add("a4");
		set.add("a5");
		set.add("an");
		set.add("a1");
		set.add("b1");
		set.add("b2");
		set.add("b3");
		set.add("b4");
		set.add("b5");
		set.add("bn");
		
		System.out.println(set);
		
		for(String s : set){
			System.out.println(s);
		}
		
		
	}

	public static void main(String[] args) {
		TreeSetTest obj = new TreeSetTest();
		obj.treesetExample();
	}

}
