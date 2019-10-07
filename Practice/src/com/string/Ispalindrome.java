package com.string;

import java.util.Scanner;

public class Ispalindrome {
	public static boolean isPalindrome(String str) {
		String palind = "";
	 int len = str.length();
	 for(int i =len-1;i>=0;i--) {
		 char ch =str.charAt(i);
		palind =palind+Character.toString(ch); 
	 }
	 System.out.println(palind);
	 if(palind.equals(str))
	 {
	System.out.println("String is palindrome");
	 }
	else
		
       System.out.println("Not palindrome");
	return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan =new Scanner(System.in);
     System.out.println("Enter the String :");
     String str = scan.nextLine();
     boolean res = isPalindrome(str);
	}
}
