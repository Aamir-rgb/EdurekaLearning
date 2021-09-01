package com.file.io;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		
		File f = new File("D:\\Eclipse\\Edureka\\FileReadingEdureka\\src\\com\\file\\io\\stock.txt");
		
		try {
			f.createNewFile();
			
		} catch(IOException e) {
			
			System.out.println("File has not been created");
		}
          System.out.println("Path of the created file is "+f.getPath());
	}

}
