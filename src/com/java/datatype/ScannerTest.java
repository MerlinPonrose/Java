package com.java.datatype;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter two values:");
		
		int a = obj.nextInt();
		int b = obj.nextInt();
		
	
		System.out.println(a+b);
		
		System.out.println("Enter a string value");
		
		
	String c = obj.nextLine();
		
		System.out.println("username:"+c);
		

	}

}
