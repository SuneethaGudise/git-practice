package arrayprograms;
//WAP TO LOCATE AND SWAP ONLY 2 ELEMENTS WHICH ARE NOT SORTED IN GIVEN SORTED ARRAY
public class SwapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,5,6,4};
		int len = a.length;
		int n =5;int pos=-1;
		for(int k=0;k<len;k++)
			System.out.print(a[k]);
		
		//for(int j=n;j<len;j++)
	
		for(int i =0;i<len;i++) 
		{ 		
			if(n==a[i])
			{
			 	n=a[i];
				pos=i;
				//temp=pos;
			//}
			for(int j= i;j<len;j++)
			{
				if(a[i]>a[j]) 
				{
					int temp=a[j];
					a[j]=a[pos];
					a[pos]=temp;
				}
			}
		  }
	   }
		System.out.println(" ");
		for(int k=0;k<len;k++)
			
			System.out.print(a[k]);
		
	}
}
			