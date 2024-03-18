package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
	
		
		Iterator<Integer> it = list.iterator();
	
		
	
		while(it.hasNext())
		{
			int value = it.next();
			System.out.println(value);
		}
		
	

	}

}
