package com.java.collection;

import java.util.LinkedHashMap;

public class LinkedHashMap_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap map = new LinkedHashMap<>();
		
		map.put("xx", null);
		map.put("yy", 50);
		map.put("zz", 70);
		map.put("aa", null);
		map.put("rr", 70);
		map.put(null, 70);
		map.put("jj", 70);
		map.put(null, 170);
		
		map.put(null, 270);
		
		System.out.println(map);
	}

}
