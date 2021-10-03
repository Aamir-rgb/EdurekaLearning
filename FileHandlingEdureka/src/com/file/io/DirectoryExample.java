package com.file.io;

import java.io.File;
import java.io.IOException;

public class DirectoryExample {
	
	static boolean dirFlag = false;

	public static void main(String[] args) {
		//Create A File Object
		File f1 = new File("D:\\Eclipse\\Edureka\\FileReadingEdureka\\src\\com\\file\\io\\dir");
		
		try {
			
			dirFlag = f1.mkdir();
			
		} catch(SecurityException e) {
			
			System.out.println("We have faced error while creating directory");
		}
		
		if(dirFlag) System.out.println("We have successfully created directory");
		
		else {
			System.out.println("We have got error while creating directory");
		}

	}

}
