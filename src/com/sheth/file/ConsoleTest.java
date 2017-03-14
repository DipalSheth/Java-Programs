package com.sheth.file;

import java.io.Console;

public class ConsoleTest {
	
	public void divide(){
		
		Console t = System.console();
		System.out.println("Enter 1st NUmber: ");
		String fnum = t.readLine();
		System.out.println("Enter 2nd NUmber: ");
		String snum = t.readLine();
		System.out.println(Integer.parseInt(fnum) / Integer.parseInt(snum));
	}

	public static void main(String[] args) {
		ConsoleTest c = new ConsoleTest();
		c.divide();
		
	}

}
