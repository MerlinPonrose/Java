package com.java.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("xx", null);
		map.put("yy", 50);
		map.put("zz", 70);
		map.put("aa", null);
		map.put("rr", 70);
		map.put(null, 70);
		map.put("jj", 70);
		map.put(null, 170);
		
		map.put(null, 270);
		System.out.println(map.get("zz"));

		
		
		System.out.println(map.keySet());
		
		System.out.println(map.values());
	/*	
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while(it.hasNext())
		{
		String a =	it.next();
		System.out.println(a+"="+map.get(a));
		}
		*/
		
		//System.out.println(map.entrySet());
	/*	
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
	
		for(Entry<String, Integer> a:entrySet)
		{
			System.out.println(a.getKey()+":"+a.getValue());
		}
		
	}

}
