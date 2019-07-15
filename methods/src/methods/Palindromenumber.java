package methods;



	import java.util.Scanner;

	public class Palindromenumber {
		public static int palindrome(int num) {
			int originum = num;
			int rev=0;
			
			while(num!=0) {
				rev=(rev*10)+(num%10);
				num=num/10;
			}
				
			System.out.println(rev);
			//int n=num;
			if(rev==originum) {
				System.out.println("palindrome");
				return rev;
			}
			else
				System.out.println("not palindrome");
			return rev;
	        }

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The Number :");
		   int num=scan.nextInt();
		   int n =num;
		  // int rev = n;
		int res =palindrome( n );

		}

	}



