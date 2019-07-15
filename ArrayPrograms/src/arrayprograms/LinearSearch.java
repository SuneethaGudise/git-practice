package arrayprograms;
//WAP TO PERFORM A LINEAR SEARCH ON ANY GIVEN ARRAY 
import java.io.PrintStream;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,5,7,9,12,15,17};
		int len =a.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number from Given Array :");
		int n =scan.nextInt();
		//int j = 7;
		boolean found = false; int pos = -1;
		for(int i=0;i<len;i++) {
			if(n==a[i]) 
			{
				found = true; pos = i;
				//System.out.println("search is success in Array of :" +i + "=" + a[i]);
			}/*else
				System.out.println("number not found");8*/
			
		}
		
		if(found == true) 
		{
			System.out.println("search is success in Array of :" +pos+ "=" + a[pos]);
		}
		else
			System.out.println("number not found");
		
	}	
}		
			
	


