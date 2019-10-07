package recursion;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="RACECAR";
		String temp =str;
		String reverse =reverse(str);
		System.out.println("THE PALINDROME IS :" + reverse);

	}

	private static String reverse(String str) {
		Object reverse="";
		Object temp="";
		// TODO Auto-generated method stub
		if(reverse.equals(temp))
			return str;
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
