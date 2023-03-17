package com.bridgelabz.operatorprograms;


public class SpringSeason {

	public static void main(String[] args) {
		// Give Values of months and days from Command Line
         
		int m =Integer.parseInt(args[0]);
		int d = Integer.parseInt(args[1]);
		
	if(m>=3 && m <= 6)
	{
		if(d>=20 && m==3 || d<=20 && m==6 )
		{
			System.out.println("true");
		}
	}
	else
		System.out.println("false");
			
	}

}
