package arrayprograms;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {18,3,7,1};
		int len =a.length;
		//int minpos = -1;
		for (int j =0; j<len;j++) 
		{
			int min = a[j];
			int minpos = -1;
			for(int i =j;i<len;i++) 
			{
				if(min>a[i]) 
				{
					minpos =i;
					min =a[i];
				}
			}
			if(minpos!=-1)
				
			{
				int temp =a[j];
				a[j] = a[minpos];
				a[minpos]=temp;
			}
				
			
			
			//System.out.println("The Sorted Numbers are: " + a[minpos]);
		}
		for(int k=0;k<len;k++)
		System.out.println("The Sorted Numbers are: " + a[k]  );
		

	}

}
