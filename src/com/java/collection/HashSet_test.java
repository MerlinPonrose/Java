package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet set = new HashSet<>();
		
		set.add("Red");
		set.add("Bue");
		set.add("Pink");
		set.add("Red");
		set.add("Green");
		set.add("Bue");
		set.add("Back");
		set.add(null);

		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
		Object a =	it.next();
		if(a.equals("Red"))
		{
			System.out.println("Color is red is available");
		}
		System.out.println(a);
		}
	}

}
