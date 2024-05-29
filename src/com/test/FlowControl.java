package com.test;

public class FlowControl {

	public static void main(String[] args) {
		
		int a=10, b=20;
		
		if(a>b && a>0 && b>0) //false && true  && true
			//false && true
			//false
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(a+b);
		}
		else
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(a-b);
		}

	}

}
