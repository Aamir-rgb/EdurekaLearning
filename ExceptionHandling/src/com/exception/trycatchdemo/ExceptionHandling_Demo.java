package com.exception.trycatchdemo;

public class ExceptionHandling_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		int  b = 0;
	    int c = 1/b;
		
		} 
		catch(Exception e) {
			System.out.println("Inside Exception Block");
		}
		finally {
			System.out.println("Inside Finally Block");
		}

	}

}
