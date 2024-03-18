package com.java.polymorphism;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add(1.1, 2.3);
		
		

	}
	
	
	public static void add()
	{
		int a=10;
		int b=10;
		int c= a+b;
	}
	
	public static void add(int a, int b)
	{
		int c = a+b;
	}
	
	public static void add(int a, int b,int d)
	{
		int c = a+b+d;
	}
	
	
	public static void add(double a, double b)
	{
		double c = a+b;
		System.out.println(c);
	}

public static void add(int a, double b)
{
	double c = a+b;
}
public static void add(double a, int b)
{
	double c = a+b;
}
}
