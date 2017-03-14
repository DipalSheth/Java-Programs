package com.sheth.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReplaceStringInFile {
	
	public static void replaceString(String str, String rep){
		BufferedReader br;
		String newline = null;
		try{
			br = new BufferedReader(new FileReader("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions.txt"));
			PrintWriter pw = new PrintWriter("C:\\Users\\Dipan\\Downloads\\Desktop\\Questions1.txt");
			String line = br.readLine();
			while(line != null){
				newline = line.replaceAll(str, rep);
				pw.println(newline);
				pw.flush();
				line = br.readLine();
			}
			br.close();
			pw.close();
			
		
		
	
	}catch(FileNotFoundException e){
		
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}
}

	public static void main(String[] args) {
		replaceString("testing","test");
	}

}
