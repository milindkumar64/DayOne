package com.bridgelabz.ifelsestatement;

import java.util.Scanner;

public class DisplayUnits {

	static void printValue(int digit)
	{
		if(digit==1)
			System.out.println("Unit");
		else if(digit==10)
			System.out.println("Tens");
		else if(digit==100)
		    System.out.println("Hundreds");
		else if(digit==1000)
			System.out.println("Thousands");
		else 
			System.out.println("Given Number is not a Units");
	}
	public static void main(String[] args) {
		System.out.println("Enter value to be printed: ");
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
	    printValue(digit);

	}

}
