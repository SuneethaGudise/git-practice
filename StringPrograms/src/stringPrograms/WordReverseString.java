package stringPrograms;

import java.util.Scanner;

public class WordReverseString {
	public static String revWord(String str)
	{
		//String spl = str.split("\\s");
		String revstr="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			 ch =str.charAt(i);
			// System.out.println(ch);
			 revstr = revstr+ch;
		}
				return revstr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str1 = scan.nextLine();
		String s ="";
		String strev="";
		String spl[] = str1.split("\\s");
		for(int j=0;j<spl.length;j++)
		{
		  s =spl[j];	
		   strev = strev +" " + revWord(s);
		}
		System.out.println("REVERSE String is :" + strev);
		}
	}


