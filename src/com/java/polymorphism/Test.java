package com.java.polymorphism;

public class Test extends MethodOverriding{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*MethodOverriding override 		= new Test();
override.add();
*/

/*est t = new Test();
t.show();*/

		
		/*MethodOverriding override = new MethodOverriding();
		override.add();
		*/
		
		/*Test t = new Test();
		t.add();*/
		
		MethodOverriding obj = new Test();
		obj.add();
	}
	
public void show()
{
	super.add();
}
	
	public static void add()
	{
		
		System.out.println("Addition of three number");
	}
}
