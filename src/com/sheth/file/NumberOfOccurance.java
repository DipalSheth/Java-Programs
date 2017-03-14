package com.sheth.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class NumberOfOccurance {
	
	public static void countSubString(String s){
		BufferedReader br;
		try{
			br =  new BufferedReader(new FileReader("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions.txt"));
			int count = 0;
			String str = br.readLine();
			while(str != null){
				if(str.contains(s)){
					count++;
				}
				str = br.readLine();
			}
			System.out.println(count);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		countSubString("is");

	}

}
