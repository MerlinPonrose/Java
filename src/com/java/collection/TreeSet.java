package com.java.collection;



public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.TreeSet set = new java.util.TreeSet<>();
		
		set.add("Red");
		set.add("Bue");
		set.add("Pink");
		set.add("Red");
		set.add("Green");
		set.add("Bue");
		set.add("Back");
		set.add(null);
		
		java.util.TreeSet set1 = new java.util.TreeSet<>();
		set1.add(170);
		set1.add(100);
		set1.add(700);
		set1.add(400);
		set1.add(1);
		set1.add(10);
		set1.add(700);
		set1.add(170);
		
		
		for(Object a:set)
		{
			System.out.println(a);
		}
		
System.out.println(set1);
	}

}
