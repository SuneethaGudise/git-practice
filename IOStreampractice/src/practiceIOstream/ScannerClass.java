package practiceIOstream;

import java.util.Scanner;

//WAP USING SCANNER CLASS TO INPUT 2 INTEGER NUMBERS AND SUM THEM
public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter Two Numbers :" );
		System.out.print("n =");
		int n = scan.nextInt();
		System.out.print("m =");
		int m =scan.nextInt();
		
		int x = n+ m;
		System.out.println("the sum of two numbers :" + x);

	}

}
