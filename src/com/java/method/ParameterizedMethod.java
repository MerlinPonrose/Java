package com.java.method;

public class ParameterizedMethod {
	
	double width;
	double height;
	double depth;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParameterizedMethod obj = new ParameterizedMethod();
		obj.addition(10, 4);
		System.out.println(obj.name("Merlin"));
		
	
	}

	public void volume()
	{
		System.out.println(width*height*depth);
	}
	
	public double volume1()
	{
		return width*height*depth;
	}
	
	public void volume2(double width, double height, double depth)
	{
		System.out.println(width*height*depth);
	}
	
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	
	public String name(String namee)
	{
	return namee;
		
	}
}
