package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList list1 = new ArrayList<>();
		
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		
		
		Iterator iterator = list1.iterator();
		
	System.out.println(	list.size());
		
		System.out.println(list.get(2));
		
		System.out.println(list);
		
	for(int i=0;i<list.size();i++)
	{
		System.out.println(list.get(i));
	}
	
	System.out.println("********");
	
	for(int a:list)
	{
		System.out.println(a);
	}
	
	}

}
