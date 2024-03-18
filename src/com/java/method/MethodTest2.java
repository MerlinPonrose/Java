package com.java.method;

public class MethodTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
	
		MethodTest2 obj = new MethodTest2();
		obj.test1();
		obj.test3();
	}
	
	
	public void test1()
	{
		test2();
		System.out.println("sampletest");
	}
	
	public static void test2()
	{
		System.out.println("sample test2");
	}
	
	public void test3()
	{
		test1();
	}

}
