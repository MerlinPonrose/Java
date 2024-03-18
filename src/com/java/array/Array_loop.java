package com.java.array;

public class Array_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String arr[] = {"apple","banana","grape","orange"};
		
	int count =	arr.length;
	
	System.out.println(count);
	/*	
		for(int i=0;i<count;i++)
		{
			System.out.println(arr[i]);
		}*/
		
		for(String b:arr)
		{
		System.out.println(b);
		}
	}

}
