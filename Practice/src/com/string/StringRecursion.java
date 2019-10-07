package com.string;

import java.util.Scanner;

public class StringRecursion {
	public static String reverseString(String str)
	{
		if(str.isEmpty()) 
		{
			return str;
		}
			return reverseString(str.substring(1)) + str.charAt(0);
		
		//return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String: ");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String revstr = reverseString(str);
		System.out.println("Reversed String is: " + revstr);
		
		
		

	}

}
