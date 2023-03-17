package com.bridgelabz.forloop;

import java.util.Scanner;

public class PalindromeNumber {
	
	
	 static int reverse(int num)
     {
	    int rev=0;
     int rem;
     while(num>0)
     {
     	rem=num%10;
     	rev = (rev*10)+rem;
     	num=num/10;
     }
     return rev;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = reverse(num);
        
		System.out.println("Reversed number is :"+rev);
        if(rev == num)
        {
        	System.out.println("This is a Palindrome Number");
        }	
        else
        {
        	System.out.println("Not a Palindrom Number");
        }
	}

}