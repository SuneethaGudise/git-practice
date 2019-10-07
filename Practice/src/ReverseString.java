
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is java";
		int len = str.length();
		for(int i=len-1;i>=0;i--)
		{
			char ch = str.charAt(i);
		
		
			System.out.print(ch);
		}

	}

}
