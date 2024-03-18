package com.java.method;

public class ReturnType_Void {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(addition()*subtraction());
	}
	
	
	public static void add()
	{
		int a = 10;
		int b = 7;
		System.out.println(a+b);
	}

	public static void sub()
	{
		int a = 10;
		int b = 7;
		System.out.println(a-b);
	}
	
	
	public static int addition()
	{
		int a = 10;
		int b = 7;
		int c = a+b;
		return c;
	}
	
	public static int subtraction()
	{
		int a = 10;
		int b = 7;
		int c = a-b;
		return c;
	}

}
