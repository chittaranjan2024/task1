package com.test;

public class Car {
	//fields,instance variables
	String carNo;
	String carColor;
	String carBrand;
	String carModel;
	
	//methods
	void strat()
	{
		System.out.println("Car started..");
	}
	
	void stop()
	{
		System.out.println("Car started..");
	}
	
	void speedUp()
	{
		System.out.println("Car speeding up..");
	}
	
	
	void applyBrake()
	{
		System.out.println("Brake applied..");
	}
	
	
	public static void main(String[] args) {
		
		Car car1=new Car();
		car1.carNo="2ukhkh348";
		car1.carColor="Red";
		car1.carModel="M1";
		car1.carBrand ="Demo";
		car1.strat();
		car1.stop();
		car1.applyBrake();

		
		Car car2=new Car();
		car2.carNo="sdgdsg43543";
		car2.carColor="Black";
		car2.carModel="M2";
		car2.carBrand ="Demo1";
		car2.strat();
		car2.stop();
		car2.applyBrake();

	}

}
