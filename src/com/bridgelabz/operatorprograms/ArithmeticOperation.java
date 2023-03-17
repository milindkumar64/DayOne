package com.bridgelabz.operatorprograms;

import java.util.Scanner;

public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		float a = sc.nextInt();
		
		System.out.println("Enter b: ");
		float b = sc.nextInt();
		
		System.out.println("Enter c: ");
		float c = sc.nextInt();
		
		float result1= a+b*c;
		float result2= c+a/b;
		float result3= a%b+c;
		float result4= a*b+c;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	
		    //finding max value
		
			float temp1 = (result1>result2)?result1:result2;
			float temp2 = (temp1>result3)?temp1:result3;
			float temp3= (temp2>result4)?temp2:result4;
			
			System.out.println("Max value is :"+temp3);
	   
			//finding min value		
		
			 temp1 = (result1<result2)?result1:result2;
			 temp2 = (temp1<result3)?temp1:result3;
			 temp3= (temp2<result4)?temp2:result4;
			 
			 System.out.println("Min value is :"+temp3);
			 
			
	
			
		
	}
	

}
