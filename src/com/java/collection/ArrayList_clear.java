package com.java.collection;

import java.util.ArrayList;

public class ArrayList_clear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<Integer> list = new ArrayList<>();
			
			list.add(100);
			list.add(200);
			list.add(300);
			list.add(400);
			list.add(500);
			
			list.clear();
			
			System.out.println(list.isEmpty());
		
	}

}
