package com.bridgelabz.operatorprograms;

public class CalculateDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
	    
		//using Math.pov() function
		
		double distance =Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println(distance);
	}

}
