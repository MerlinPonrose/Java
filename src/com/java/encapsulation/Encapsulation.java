package com.java.encapsulation;

public class Encapsulation {

private	int amount = 5000;
	
private int age; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	public int getamount()
	{
		return amount;
	}
	
	
	public void setAmount(int amount)
	{
		this.amount = amount;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		
		if(age>=18)
		{
			this.age = age;
		}
		else
		{
			System.out.println("not eligible");
		}
	}

}
