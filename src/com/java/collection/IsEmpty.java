package com.java.collection;

import java.util.ArrayList;

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
	
		
		
		System.out.println(list.isEmpty());
		
		if(list.isEmpty())
		{
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			
			System.out.println(list);
		}
		
		else
		{
			System.out.println("List has some value");
		}

	}

}
