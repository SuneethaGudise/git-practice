package com.array;
//WAP TO FIND SECOND LARGEST ELEMENT IN AN ARRAY OF INTEGERS
public class SecondLargeNumber {
	public static int secondLarge(int arr[])
	{    
		int len =arr.length;
		int max=arr[0];
		for(int i=0;i<len;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {12,31,54,81,56,23};
      // int len =arr.length;
       int maxnum = secondLarge(arr);
       
	}

}
