package com.sheth.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTest {

    public void Subtract() throws Exception, IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1st NUmber: ");
		int firstNumber = Integer.parseInt(br.readLine());
		System.out.println("Enter 2nd NUmber: ");
		int secondNumber = Integer.parseInt(br.readLine());
		int sub = firstNumber - secondNumber;
		System.out.println("Subtraction of FirstNumber and SecondNumber: " + sub);
	}

	public static void main(String[] args) throws IOException, Exception {
		BufferedReaderTest t = new BufferedReaderTest();
		t.Subtract();
	}

}
