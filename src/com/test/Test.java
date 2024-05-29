package com.test;

public class Test {

	public static void main(String[] args) {
		
      //What are variables
		int a=87,b=78,c=90;
		float b1=10.8f;
		String st="Hello world!!";
		char ch='A';
		boolean status=false;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		a=b;
		a+=b;
		a=a+b;
		a*=b;
		a/=b;
		a%=b;
		
		
		System.out.println(a>b && b>c);
		System.out.println(a>b || b>c);
		System.out.println(!(a>b));
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		
		a=7;
		System.out.println(a>>2);
		System.out.println(a<<2);
		
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(++a);
		
		int result=(a>b)?(a+b):(a-b);
		System.out.println(result);
		
		a=5; //0101
		b=7; //0111  //0111 -> 7
		System.out.println(a|b);
		System.out.println(a&b);//0101 -> 5
		
		
	}

}
