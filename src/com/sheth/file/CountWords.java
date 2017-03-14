package com.sheth.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions.txt"));
			String str = br.readLine(); 			
			int count =0;
			
			while(str!=null){
				String[] array = str.split(" ");
				for(String word : array){
					count++;
				}
				str = br.readLine();
			}
			System.out.println("Number of Words in a file: " + count);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
