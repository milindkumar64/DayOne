package com.bridgelabz.operatorprograms;

import java.util.Scanner;
import java.lang.Math;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a");
		Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.println("Enter b");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        System.out.println("Enter c");
        Scanner sc3 = new Scanner(System.in);
        int c = sc3.nextInt();
			
        int delta =b*b-4*a*c;

        float root1 = (float) ((-b + Math.sqrt(delta))/(2*a));
        float root2 = (float) ((-b - Math.sqrt(delta))/(2*a));
	
        System.out.println("Roots are "+ root1 +" and " + root2);        
	}
}
