package stringPrograms;
//WAP TO CHECK IF GIVEN STRING OF PARENTHESIS HAS BALANCED PARENTHESIS OR NOT .
//FOR EXAMPLE A STRING AS "(())" IS VALID AND ")(" OR "())" ARE  NOT VALID
public class Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc(123(xyz))";
		int len =str.length();
		int count=0;
		int count1=0;
		
		for(int i =0;i<len;i++)
		{
		char  ch = 	str.charAt(i);
		 if(ch=='(')
		 {
			count++; 
		 }
		 if(ch==')')
		 {
			 count1++;
		 }
		}
		if(count == count1) {
			System.out.println("Valid string");
		}
		else
			System.out.println("Inalid String");

	}

}
