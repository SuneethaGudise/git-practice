package arrayprograms;

public class IntersectionArray {
//WAPTO FIND INTERSECTION OF TWO UNSORTED ARRAYS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,8,7,5,3};
		int la=a.length;
		int b[] = {6,4,2,3,6};
		int lb =b.length;
		int c [] = {5,7,9,3,6};
		int lc =c.length;
		for(int i=0;i<la;i++) {
			for(int j=0;j<lb;j++) {
				for(int k =0;k<lc;k++) {
					
				//if(a[i]==b[j]) {
				if(a[i]==b[j] && a[i] == c[k] ) {
					if(b[j]==c[k]) {
						System.out.println(c[k]);
						
					}
					
				}
			}
		}
		}
	}

}
