package com.bridgelabz.dayoneproblems;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a yaer");
		Scanner scn = new Scanner(System.in);
		int year = scn.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				System.out.println("Leap year");
				else
				System.out.println("Not a leap Year");
			}
			else {
				System.out.println("Leap Year");
			}
		}
		else {
			System.out.println("Not a leap Year");
		}
	}

}
