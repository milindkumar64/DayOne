package com.bridgelabz.dayoneproblems;

public class StaticDemo {
	
	static String name;
	
	static {
	      System.out.println("inside static block");	
	}
	
	static String Display(String name)
	{
		String name1 = name;
		System.out.println("Inside Static method");
	    return name1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		StaticDemo obj1 =  new StaticDemo();
		
		obj1.name = "Saras";
		
		System.out.println(obj1.name);
		
		StaticDemo.name="Milind";
		
		System.out.println(name);
		
		//static method call
		String result = Display("Prabhat");
		System.out.println(result);
		
		
	}

}
