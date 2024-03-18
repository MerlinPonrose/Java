package com.java.string;

public class String_ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "ghgjTYUO2478!@#%";
		
		
		System.out.println(a.replaceAll("[a-z-A-Z]", ""));
		
		System.out.println(a.replaceAll("[^a-z-A-Z]", ""));
		
		System.out.println(a.replaceAll("[0-9]", "0"));
		
		System.out.println(a.replaceAll("[^a-z-A-Z-0-9]", ""));

	}

}
