package com.junittest;

public class firstJUnitprac {
	public static String sum( int i) {
		if(i>=35) {
			System.out.println("Successfully recharge");
			return "success";
		}
		else {
			System.out.println("Not recahrged successfully");
			return "failed";
			//throw new ArithmeticException("Enter amount more than or equal to 35");
			
		}
	}
// public static void main(String [] args) {
//	 sum(40);
 //}
}