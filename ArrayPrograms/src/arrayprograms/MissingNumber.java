package arrayprograms;

public class MissingNumber {
//NEED TO FIX EXCEPTION
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,10,10,10,15};
		int len =a.length;
		int j = a[0];
		//for(int i =0;i<len;i++) {
		//	for(int j=0;j<=10;j++) {
				for(int i = 0;i<len;i++) {
				
			
				if(j != a[i]) {
					for(int k =j;k<a[i];k++) {
					System.out.println("missing number is  :" + k);
					//j=a[i];
					}
				}
				if (j < a[i+1])
					j++;
				//	j=a[i];
			}
						
		}

	}


