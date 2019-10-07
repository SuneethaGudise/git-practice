package stringPrograms;
//WAP TO REVERSE EACH INDIVIDUAL WORD IN SENTENCE
public class ReverseSetence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="I WANT TO REVERSE THE STRING";
		int len = str.length();
		
		System.out.println(str);
		System.out.println(len);
		for(int i =len -1;i>=0;i--) {
			char ch = str.charAt(i);
			 System.out.print(ch);
		}
      
	}

}
