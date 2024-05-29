package com.test;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		//Scanner or BufferedReader
		
		Scanner  scanner=new Scanner(System.in);//input stream to take input
		System.out.println("Please enter a number:");
		int n=scanner.nextInt();
		
		int rem=0, sum=0;
		while(n>0)           //123>0            12>0            1>0        0>0
		{
			rem=n%10;        //rem=123%10=3     rem=12%10=2    rem=1%10=1
			sum=sum+rem;     //sum=0+3=3	    sum=3+2=5	   sum=5+1=6
			n=n/10;          //n=123/10=12       n=12/10=1     n=1/10=0        
		}
		
		System.out.println(sum);

	}

}
