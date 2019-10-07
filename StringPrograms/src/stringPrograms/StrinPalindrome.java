package stringPrograms;
//WAP TO CHECK FOR PALINDROME STRING
import java.util.Scanner;

public class StrinPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("ENTER THE STRING :");
		String str = scan.nextLine();
		int len =str.length();
		String palind="";
		for(int i = len -1;i>=0;i--) {
			char ch = str.charAt(i);
			palind =palind + Character.toString(ch);
			
		}
		if(palind.equals(str)) {
			System.out.println("the string is Palindrome");
		}
		else
			System.out.println("the given string is not Palindrome");

	}

}
