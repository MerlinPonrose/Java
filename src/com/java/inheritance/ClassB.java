package com.java.inheritance;
             //child class  parent class
public class ClassB extends ClassA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		testt();
		
		add();
		
	
		
	ClassB obj1 = new ClassB();
	obj1.mango();
	

	}
	
	
	public ClassB()
	{
		super("Parent");
		System.out.println("in child class");
	}
	
	public static void testt()
	{
		System.out.println("hiii");
	}

	
	public void mango()
	{
		System.out.println("mango");
		
		System.out.println(super.a);
	}
}
