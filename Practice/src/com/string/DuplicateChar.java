package com.string;

import java.util.Scanner;

//WAP TO PRINT DUPLICATE CHARACTERS FROM THE STRING
public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=  "Java Programming";
		int len =str.length();
		int count=0;
		char dupchar=0;
		
		boolean counted = false;
		for(int i =0;i<len;i++)
		{
			char c =str.charAt(i);
			count=1;
			counted = false;
			for(int k=i-1;k>=0;k--)
			{
				if (c == str.charAt(k))
					counted = true;
			}
			if (counted == false)
			{
				for(int j=i+1;j<len;j++)
				{
					char ch =str.charAt(j);
					if(c==ch)
					{
						 count++;	
						 dupchar = c;
					}
					
				}
			}
			
			if(count>1)
			System.out.println(dupchar +"="+count);
		}
		
	}
}