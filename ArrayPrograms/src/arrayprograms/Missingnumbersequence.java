package arrayprograms;

public class Missingnumbersequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,6,7,9,10};
		int len =a.length;
		int j =a[0];
		for (int i =0;i<len;i++) {
			if(j!=a[i]) {
				System.out.println("Missing number: " + j);
				j=a[i];
			}
			j++;
			
			
		}
		


	}

}
