package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiscountCalculation {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		float amount=0,payableAmount=0;
		System.out.println("Enter the shopping amount:");
		amount=Float.parseFloat(bufferedReader.readLine());
		
		
		if(amount<=800)
		{
			payableAmount=amount;
		}
		else if(amount>800 && amount<=1500)
		{
			payableAmount=amount - ((amount*10)/100);
		}
		else if(amount>1500 && amount<=2500)
		{
			payableAmount=amount - ((amount*15)/100);
		}
		else if(amount>2500 && amount<=5000)
		{
			payableAmount=amount - ((amount*20)/100);
		}
		else if(amount>5000)
		{		
			payableAmount=amount - ((amount*30)/100);
	
		}
		
		System.out.println("Payable amount:"+payableAmount);
		System.err.print("Error occurred");

	}

}
