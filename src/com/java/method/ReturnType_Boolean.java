package com.java.method;

public class ReturnType_Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(oddoreven());

		System.out.println(address());
	}
	
	
	public static boolean oddoreven()
	{
		int num =7;
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	
	public static String address()
	{
		String addr = "Perungudi, Chennai";
		return addr;
	}
}
