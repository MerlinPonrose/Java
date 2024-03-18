package com.java.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Catch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		
		try
		{
			int a =10;
			System.out.println(a/0);
	
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		

		catch(Exception e)
		{
			System.out.println("Inside catchhhhh");
		}
	
		
		
	}

}
