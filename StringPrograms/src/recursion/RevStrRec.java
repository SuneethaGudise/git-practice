package recursion;

public class RevStrRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="WELCOME TO RECURSION";
		String reverse = reverse(str);
		System.out.println("THE REVERSE STRING IS:" +reverse);
		

	}

	private static String reverse(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty())
            return str;
		
		
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
