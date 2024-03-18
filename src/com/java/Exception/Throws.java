package com.java.Exception;

public class Throws {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		Thread.sleep(2000);
		
		
		int age = 17;
		
		if(age<18)
		{
			throw new ArithmeticException("Invalid age");
		}

	}

}
