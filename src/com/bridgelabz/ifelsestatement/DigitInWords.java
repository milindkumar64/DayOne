package com.bridgelabz.ifelsestatement;

import java.util.Scanner;

public class DigitInWords {
	
	static void printValue(int digit)
	{
		if(digit==0)
			System.out.println("Zero");
		else if(digit==1)
			System.out.println("One");
		else if(digit==2)
			System.out.println("Two");
		else if(digit==3)
			System.out.println("Three");
		else if(digit==4)
			System.out.println("Four");
		else if(digit==5)
			System.out.println("Five");
		else if(digit==6)
			System.out.println("Six");
		else if(digit==7)
			System.out.println("Seven");
		else if(digit==8)
			System.out.println("Eight");
		else if(digit==9)
			System.out.println("Nine");
		else
			System.out.println("Number out of Bound");
		
	}

	public static void main(String[] args) {
		
	
		System.out.println("Enter value to be printed: ");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
	    printValue(digit);	

	}

}
