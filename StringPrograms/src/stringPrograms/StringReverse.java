package stringPrograms;
//WAPTO REVERSE A STRING DONOT USE STRINGBUFFER/STRINGBUILDERINBUILT REVERSE FUNCTION
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="WELCOME";
		int len =str.length();
		System.out.println(str);
		System.out.println(len);//7
		for(int i =len-1;i>=0;i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}

	}

}
