package com.bridgelabz.dayoneproblems;

public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
        int sum =0;		
		for(String x1 : args)
		{
			sum = sum + Integer.parseInt(x1);
		}
		
		System.out.println("sum of the values :"+sum);
   }

}
