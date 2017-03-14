package com.sheth.file;

import java.io.DataInputStream;
import java.io.IOException;

public class DateInputStreamTest {
	
   public void Multilpication() throws Exception, IOException{
		
		DataInputStream ds = new DataInputStream(System.in);
		System.out.println("Enter 1st NUmber: ");
		int firstNumber = ((int)ds.readInt());
		System.out.println("Enter 2nd NUmber: ");
		int secondNumber = ((int)ds.readInt());
		int multi = firstNumber * secondNumber;
		System.out.println("Multiplication of FirstNumber and SecondNumber: " + multi);
	}

	public static void main(String[] args) {
		DateInputStreamTest t = new DateInputStreamTest();
		try {
			t.Multilpication();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
