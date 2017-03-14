package com.sheth.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileIntoAnother {
	
	public static void main(String[] args) {
	try{
	BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions.txt"));
	PrintWriter pw = new PrintWriter("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions2.txt");
	String line = br.readLine();
	
	while(line != null){
		pw.println(line);
		pw.flush();
		line = br.readLine();
	}
	br.close();
	pw.close();
	
	}catch(FileNotFoundException e){
		e.printStackTrace();
	}catch(IOException exp){
		exp.printStackTrace();		
	}

	
	

	}

}
