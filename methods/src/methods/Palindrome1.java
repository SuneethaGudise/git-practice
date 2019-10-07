package methods;


	public class Palindrome1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "madam";
			int n = str.length();
			System.out.println(str);
		
			System.out.println(n);
			String palind ="";
			for(int i= n-1;i>=0; i--) {
				char ch = str.charAt(i);
			//	System.out.print(ch);
				
				palind = palind+Character.toString(ch);
				
				//System.out.println(" ");
				if(str.equals(palind)) {
					//System.out.print(" ");
					System.out.println(palind);
					System.out.print("madam is palindrome");
				     }
					
				
				/*else {
					System.out.println("not palindrome");
			 }*/
			   
			}
			 
		}

	}



