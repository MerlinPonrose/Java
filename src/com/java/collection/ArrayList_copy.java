package com.java.collection;

import java.util.ArrayList;

public class ArrayList_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(200);
		list.add(200);
		list.add(200);
		list.add(200);
		list.add(500);
		
		ArrayList list1 = list; //copy
		
		System.out.println(list1);
	
		
		list.remove(1);
		

		System.out.println(list1);
		
		System.out.println("*******");
		
		System.out.println(list1);
		
		list1.add("heloo");
		
		
		
	}

}
