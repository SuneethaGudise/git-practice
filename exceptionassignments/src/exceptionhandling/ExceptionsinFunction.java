package exceptionhandling;

import java.util.Scanner;

//WAP CONTAINING A FUNCTION WHICH IS EXPECTED TO THROW ANY KIND OF EXCEPTION
//SAY NULLPOINTEREXCEPTION OR ARITHMETICEXCEPTION ETC 
//AND THEN HANDLE THIS FUNCTION IN THE PARENT FUNCTION WHICHCALLS THIS FUNCTION
public class ExceptionsinFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Number :");
		int x = scan.nextInt();
		System.out.println("Enter the another Number: ");
		int y =scan.nextInt();
	/*	System.out.println("Enter the String :");
		String s =scan.nextLine();*/
		ParentFunctionExcep excep = new ParentFunctionExcep();
		try
		{
			int res = excep.div(x,y);
			System.out.println(res);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception is handled");
		}
		finally
		{
			System.out.println("Finally code is executed");
		}
		System.out.println("Enter the String :");
		String s = null;
		ParentFunctionExcep excep1 =new ParentFunctionExcep();
		try
		{
			String res= excep1.rev(s);
			System.out.println("Both strings are equal ");
		}
		catch(NullPointerException e)
		{
		System.out.println("NullPointer Exception is handled");	
		}

	}

}
