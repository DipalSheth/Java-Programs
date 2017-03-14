package com.sheth.loops;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerExample {

	
	public static void main(String[] args) throws IOException{
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new InputStreamReader(System.in));
		System.out.println("reading input from console using scanner in Java");
		System.out.println("Please entor your input ");
		String input = scanner.nextLine();
		System.out.println("User Input from console" + input);
		int number = scanner.nextInt();
		System.out.println("Integer input " + number);

	}

}
