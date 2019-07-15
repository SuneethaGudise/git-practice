package arrayprograms;

public class MergeArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,12,13,14,15};
		int b[] = {16,17,18,19,20};
		int la =a.length;
		int lb =b.length;
		int c[] = new int [la+lb];
		int lc =c.length;
		int count =0;
		for(int i=0;i<la;i++)
		{
		c[i]=a[i];
		count++;	
		}
		for(int j=0;j<lb;j++)
		{
			c[count++]=b[j];
		}
		for(int k=0;k<lc;k++)
		{
			System.out.println(c[k]);
		}
		{
			
		}
		

	}

}
