package com.java.encapsulation;

public class Test extends Encapsulation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation encap = new Encapsulation();
		System.out.println(encap.getamount());
		
		encap.setAmount(2000);
		
		System.out.println(encap.getamount());
		
		System.out.println(encap.getAge());
		
		encap.setAge(17);
		
		System.out.println(encap.getAge());
		
		


	}

}
