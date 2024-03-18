package com.java.conditionstatement;

public class NestedIfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 13;
		int weight = 47;
		
		if(age>=18)
		{
			System.out.println("Eligible to check weight");
			if(weight>=50)
			{
				System.out.println("Eligible to donate");
			}
			else
			{
				System.out.println("Not eligible to donate");
			}
		}
		else
		{
			System.out.println("Not eligible to donate");
		}
	}

}
