package com.test;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);//input stream to take input
		System.out.println("Please enter a number:"); //123 ->321
		int n=scanner.nextInt();
		
		int rem=0, rev=0;
		while(n>0)           //123>0            12>0            1>0        0>0
		{
			rem=n%10;        //rem=123%10=3     rem=12%10=2    rem=1%10=1
			rev=rev*10+rem;  //sum=0*10+3=3	    sum=3*10+2=32  sum=32*10+1=321
			n=n/10;          //n=123/10=12       n=12/10=1     n=1/10=0        
		}
		
		System.out.println(rev);


	}

}
