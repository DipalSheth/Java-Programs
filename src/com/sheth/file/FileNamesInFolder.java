package com.sheth.file;

import java.io.File;

public class FileNamesInFolder {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\Dipan\\Downloads\\Desktop\\Java Books");
		File[] arr = f.listFiles();
		for(File a : arr){
			System.out.println(a.getName());
		}
	}

}
