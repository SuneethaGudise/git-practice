package arrayprograms;

public class MissingSequenceNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,7,11,12,13,14,17};
		int len =a.length;
		int j =a[0];
		for(int i =0;i<len;i++) {
			if(j!=a[i]) {
				for(int k =j;k<a[i];k++) {
					System.out.println(k);
					j =a[i];
				}
			}
			j++;
		}

	}

}
