package com.java.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Try_Finally {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		
		try
		{
			int a =10;
			int b =2;
					System.out.println(a/0);
		 
		}
		
		catch(Exception e)
		
		{
			System.out.println("In catch block");
		}
		finally
		{
			System.out.println("In finally block");
		}
		
                                                                                                    
	}

}
