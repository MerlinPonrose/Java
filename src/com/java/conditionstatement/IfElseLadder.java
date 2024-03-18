package com.java.conditionstatement;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 2450;
		
		if(num>=0 && num<10)
		{
			System.out.println("Single digit number");
		}
		else if(num>=10 && num<100)
		{
			System.out.println("Double digit number");
		}
		else if(num>=100 && num<1000)
		{
			System.out.println("Triple digit number");
		}
		else
		{
			System.out.println("Invalid Number");
		}

	}

}
