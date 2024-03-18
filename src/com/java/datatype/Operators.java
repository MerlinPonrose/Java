package com.java.datatype;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a = 10;
		int b = 100;
		
	int c =	a+b;
	
	System.out.println(a++); //10
	System.out.println(a); //11
	System.out.println(++a); //12
	System.out.println(a--);
	System.out.println(--a);
	
	System.out.println("********");	
	
	//a= a+b;
	a+=b;
/*	a-=b;
	a*=b;
	a/=b;*/
	System.out.println(a);
	
	System.out.println("******");
	
	System.out.println(c);
		System.out.println(a+b);
		
		System.out.println(a-b);
		
		System.out.println(a*b);
		
		System.out.println(a/b);
		
		System.out.println(a%b);

		System.out.println(a<b);
		System.out.println(a>b);
		
		System.out.println(a<=b);
		
		System.out.println(a>=b);
		
		System.out.println(a==b);
		
		System.out.println(a!=b);
		
		System.out.println((a<b)&&(a==b));
		System.out.println(!(a<b)||(a==b));
		
	System.out.println("*******");
	
	System.out.println(a);
	System.out.println((a>b)?"A is greater than B":"B greater than A");
	

	}

}
