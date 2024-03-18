package com.java.Exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		
		Thread.sleep(3000);
		
		File f = new File("");
		FileInputStream fis = new FileInputStream(f);
	}

}
