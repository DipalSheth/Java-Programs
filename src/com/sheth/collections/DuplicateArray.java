package com.sheth.collections;

import java.util.HashSet;

public class DuplicateArray {
	
	public void findDuplicateArray(String[] strArray){
		
		HashSet<String> set = new HashSet<String>();
		
		for(String arrayelement : strArray){ //using enhance for loop
			if(!set.add(arrayelement)){
				System.out.println("Duplicate Elements are: " + arrayelement );
			}
		}
	}

	public static void main(String[] args) {
		DuplicateArray obj = new DuplicateArray();
		String[] straarray = {"rose","lily","apple blossom","rose","jasmine","null","marigolds","jasmine"};
	   obj.findDuplicateArray(straarray);
	}

}
