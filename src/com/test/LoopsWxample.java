package com.test;

public class LoopsWxample {

	public static void main(String[] args) {
		//Entry controlled loop
		for(long i=1;i<=100;i+=2) //iteration
		{
			System.out.println(i );
		}
		
		for(float i=1.5f;i<=10.5;i+=1) //iteration
		{
			System.out.println(i );
		}
		
		int i=1;
		while(i<=100)
		{
			System.out.println(i );
			i+=2;
		}
		
		
		int a=5,b=10;
		while(a>b)
		{
			System.out.println("inside the body");
		}
		
		
		
		do
		{
			System.out.println("inside the body");
		}
		while(a>b);
		
		//iteration 1: i=1; 1<=10  = 1
		//iteration 2: i=2; 2<=10  = 2
		//iteration 3: i=3; 3<=10  = 3
		//iteration 4: i=4; 4<=10  = 4
		//iteration 5: i=5; 5<=10  = 5
		//iteration 6: i=6; 6<=10  = 6
		//iteration 7: i=7; 7<=10  = 7
		//iteration 8: i=8; 8<=10  = 8
		//iteration 9: i=9; 19<=10  = 9
		//iteration 10: i=10; 10<=10  = 10
		//iteration 1: i=11; 11<=10   false
	

	}

}
