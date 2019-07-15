package arrayprograms;

public class Minarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {20,40,80,50,90,30,28,47,13,56,120};
		int len =a.length;//11
		int min = a[0];
		for(int i=1;i<len;i++) {
			if(min>a[i]) {
				min=a[i];
				
			}
			
		}
		System.out.println(min);

	}

}
