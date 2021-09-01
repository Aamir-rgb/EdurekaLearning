package com.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String[] args) throws IOException, InterruptedException {
	
     //Read the data from file
	FileInputStream fin =  new FileInputStream("src\\co\\edureka\\io\\edureka.txt");
//		System.out.println(fin.available());
//		System.out.println((char)fin.read());
//		System.out.println(fin.read());
//        System.out.println(fin.available());
//	
//	//Read The File Byte By Byte
//		int n = fin.read();
//		while(n!=-1) {
//			
//			System.out.print((char)n);
//			n = fin.read();
//			Thread.sleep(100);
//			fin.close();
//		}
//	
//		FileInputStream fin1 =  new FileInputStream("src\\co\\edureka\\io\\edureka.txt");
//
//        byte []b = new byte[fin1.available()];
//	    fin1.read(b);
//	    String data = new String(b);
//	    System.out.println(data);
	    
	    //Read The Data For The File Line By Line
	    //Convert Byte Stream 
	    InputStreamReader src = new InputStreamReader(fin);
	    BufferedReader br = new BufferedReader(src);
	    String line = br.readLine();
	    while(line!=null) {
	    	System.out.println(line);
	    	line = br.readLine();
	    	Thread.sleep(2000);
	    }
	  fin.close();
	  br.close();
	}
	}

