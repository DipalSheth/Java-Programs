package com.sheth.collections;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class HashMapTest {
	
	public void hashmapExample(int searchkey){
		
		Map<Integer,String> hm = new HashMap<Integer,String>();
		//creating map
		hm.put(1, "Dipal");
		hm.put(2, "Sheth");
		hm.put(3, "Java");
		hm.put(4, "Collections");
		
		//searching a key in map and returning its value
		
		if(hm.containsKey(searchkey)){
			System.out.println("Value of Search key is: " + hm.get(searchkey));
		}else{
			System.out.println("Key not found in HashMap");
		}
		
		/*Set<Integer> keys = hm.keySet();
		for(Integer key : keys){
			System.out.println("Keys: " + key + " Value: " + hm.get(key));
		}*/
	}

	public static void main(String[] args) {
		HashMapTest obj = new HashMapTest();
		obj.hashmapExample(2);

	}

}
