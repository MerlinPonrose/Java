package com.java.method;

public class Test3 extends ParameterizedMethod{
	
	public  int a =100;
	
	public static int b=90;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(b);
		
		ParameterizedMethod method = new ParameterizedMethod();
		method.depth = 10;
		method.height =12;
		method.width = 18.2;
		
		method.volume();
	System.out.println(	method.volume1());
	
	method.volume2(12, 13, 14);
		
		ParameterizedMethod method1 = new ParameterizedMethod();
		method1.width =10.0;
		method1.height =20.0;
		method1.depth =5;
		
		method1.volume();
		
		Test3 test = new Test3();
				test.num();

	}
	
	public void num()
	{
		int f = 200;
		
		System.out.println(this.a);
	}
	

}
