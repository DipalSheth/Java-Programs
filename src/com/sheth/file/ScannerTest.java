package com.sheth.file;

import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
	
	public void Addition(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st NUmber: ");
		int firstNumber = sc.nextInt();
		System.out.println("Enter 2nd NUmber: ");
		int secondNumber = sc.nextInt();
		int sum = firstNumber + secondNumber;
		System.out.println("Addition of FirstNumber and SecondNumber: " + sum);

	}
	

	public static void main(String[] args) throws IOException, Exception {
		ScannerTest t = new ScannerTest();
		t.Addition();
		
	}

}
