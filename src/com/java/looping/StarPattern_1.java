package com.java.looping;

public class StarPattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=5;col++)
			{
				if((row%2==0 && col%2==0) || (row%2!=0 && col%2!=0))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
