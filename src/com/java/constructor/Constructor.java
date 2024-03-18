package com.java.constructor;

public class Constructor {
	
	int a;



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Constructor obj = new Constructor(80);
		obj.testmethod();
		

	}
	
	
	public Constructor()
	{
		//a=100;
		System.out.println("In constructor");
	}

	public Constructor(int a)
	{
		this.a =a;
	}
	public  void testmethod()
	{
		System.out.println(a);
	}
}
