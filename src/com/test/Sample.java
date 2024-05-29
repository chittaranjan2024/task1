package com.test;

public class Sample {

	public static void main(String[] args) {
		
		int x=10, y=20, z=30;
		
		if(x<y) // 10<20
		{
			System.out.println("hi");
		}		
		else if(z>x)//30>10
		{
			System.out.println("hello");
		}
		else if(y<z)//20<30
		{
			System.out.println("welcome");
		}
		else
		{
			System.out.println("Bye");
		}
	}

}
