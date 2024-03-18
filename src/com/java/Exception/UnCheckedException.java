package com.java.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class UnCheckedException {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		int a =10;
		/*
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);*/
		
		System.out.println(a/2);
		
		
		int arr[] = {10,20};
		System.out.println(arr[3]);
 
	}

}
