package com.test;

public class SwitchCaseExample {

	public static void main(String[] args) {
		
		
		char ch='%';
		//Fall through the execution
		switch(ch)
		{
			case '!': System.out.println("Sunday");break;
			case '@': System.out.println("Monday");break;
			case '#': System.out.println("Tuesday");break;
			case '$': System.out.println("Wednesday");break;
			case '%': System.out.println("Thursday");break;
			case '^': System.out.println("Friday");break;
			case '&': System.out.println("Saturday");break;
			default: System.out.println("No match found!!");
		}
	}

}
