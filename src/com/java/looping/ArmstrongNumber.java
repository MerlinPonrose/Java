package com.java.looping;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num = 370;
		int modvalue;
		int total=0;
		
		int n = num;
		
		while(n!=0)
		{
			modvalue = 	n%10;
		
		total = total+	modvalue*modvalue*modvalue;
		n = n/10;
		}
		
		if(total==num)
		{
			System.out.println("It is a armstrong number");
		}
		else
		{
			System.out.println("It is not a armstrong number");
		}

	}

}
