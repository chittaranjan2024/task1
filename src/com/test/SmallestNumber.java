package com.test;

public class SmallestNumber {

	public static void main(String[] args) {
		int a=10, b=15, c=6, d=25;
		
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a+" is the smallest number"); //CONCATENATION OPEARATION
		}
		else if(b>a && b>c && b>d)
		{
			System.out.println(b+" is the smallest number");
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println(c+" is the smallest number");
		}
		else
		{
			System.out.println(d+" is the smallest number");
		}

	}

}
