package com.string;
//WAP TO REMOVE THE DUPLICATES
import java.util.Scanner;

public class RemoveDuplchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
      Scanner scan =new Scanner(System.in);
      String str = scan.nextLine();
      int len =str.length();
     // char ch[] = str.toCharArray();
      char ar=0;
      for(int i=0;i<len;i++)
      {
    	  char ch =str.charAt(i);
    	  for(int j=i;j<len;j++)
    	  {
    		  char ch1 =str.charAt(j);
    		  if(ch!=ch1)
    		  {
    			 ar=ch;
    			 break;
    		  }
    		  if(j==i)
    	    	  System.out.println(ch);
    	  }
    	  
 		 
    			  }
    	  
      }
	}


