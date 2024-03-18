package com.java.looping;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fact = 1;
		for(int i=5; i>=1;i--)
		{
			fact*=i;
		}

		System.out.println(fact);
	}

}
