package arrayprograms;
//WAP TO FIND COMMON ARRAY IN ANY TWO GIVEN ARRAYS
public class CommonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,23,45,17,13,26,41,67,89,3,12};
		int la =a.length;
		int b[]= {20,43,23,14,67,32,65,59,29};
		int lb =b.length;
		for(int i=0; i<la; i++) {
			for(int j=0; j<lb ;j++) {
				if(a[i]==b[j]) {
					//int k =b[j];
					System.out.println(b[j]);
				}
			}
		}

	}

}
