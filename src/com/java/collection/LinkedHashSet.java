package com.java.collection;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		java.util.LinkedHashSet set = new java.util.LinkedHashSet<>();
		set.add("Red");
		set.add("Bue");
		set.add("Pink");
		set.add("Red");
		set.add("Green");
		set.add("Bue");
		set.add("Black");
		set.add(null);

		
		System.out.println(set);
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
		{
		Object a =	it.next();
			System.out.println(a);
		}
	}

		
	}

