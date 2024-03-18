package com.java.method;

public class MethodTest {

	int h = 10; // instance variable
	static int d = 9; //static variable
	
	int c;
	
	int f;
	String test;
	char t;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add();
		sub();
		div();
		mul();
		MethodTest obj = new MethodTest();
		System.out.println("value of f="+obj.f);
		System.out.println("value of String="+obj.test);
		System.out.println("value of char="+obj.t);
		
		System.out.println(addition()*subtract());

	}
	
	public static void add()
	{
		int a = 10;
		int b = 7;
		System.out.println(a+b);
	}

	
	public static int addition()
	{
		int a = 10;
		int b = 7;
		int c = a+b;
		return c;
	}
	
	public static int subtract()
	{
		int a = 10;
		int b = 7;
		int c = a-b;
		return c;
	}
	private static void sub()
	{
		int a = 10;
		int b = 7; //local variable
		System.out.println(a-b);
	}
	
	protected static void mul()
	{
		int a = 10;
		int b = 7;
		System.out.println(a*b);
	}
	
	static void div()
	{

		int a = 10;
		int b = 7;
		System.out.println(a/b);
	}
}
