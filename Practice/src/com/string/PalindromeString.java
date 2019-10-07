package com.string;

import java.util.Scanner;

public class PalindromeString {

	
		public static boolean palindromeString(String str)
		{
			//if(str.isEmpty()) {
				String palind =(str.substring(1)) + str.charAt(0);
				if(palind.equals(str))
				{
					return true;
				}
				
					//return palindromeString(str.substring(1, str.length()-1));

				return false;
				
		
		}
		public static void main(String[] args) {
			System.out.println("Enter the String:");
			Scanner scan =new Scanner(System.in);
			String str = scan.nextLine();
		if(palindromeString(str)) {
			System.out.println("the string is Palindrome");
		}
		else {
			System.out.println("the given string is not Palindrome");
		}
		
	}

}
