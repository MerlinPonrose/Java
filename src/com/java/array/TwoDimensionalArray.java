package com.java.array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object a[][] = {{"Name","Age","City"},{"xx",18,"chennai"},{"yy",22,"Madurai"},{"zz",26,"Tiruchi"}};
		
		System.out.println(a[2][1]);
		
		System.out.println(a[1][2]);

		//to retrieve row count
		int row_count =	a.length;
		System.out.println(row_count);
		

		//col count
		int col_count = 	a[0].length;
		System.out.println(col_count);
		
		
		for(int i=0;i<row_count;i++)
		{
			for(int j=0;j<col_count;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		
	}

}
