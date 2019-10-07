package com.array;

import java.util.Scanner;

public class RepeatedNumber {
	public static void numberRepeat(int arr[])
	{
		int len =arr.length;
		for(int i=0;i<len;i++)
		{
			for(int j=i;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Repeated Numbers are :");
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RepeatedNumber number =new RepeatedNumber();
		System.out.println("Enter the numbers in Array:");
		Scanner scan =new Scanner(System.in);
		int num = scan.nextInt();
		int arr[] = new int[num];
		int len =arr.length;
		number.numberRepeat(arr);
		
       
	}

}
