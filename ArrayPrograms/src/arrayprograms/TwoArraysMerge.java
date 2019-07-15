package arrayprograms;
//WAP TO MERGE TWO ARRAYS INTO ONE ARRAY(I WROTE)
public class TwoArraysMerge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int la = a.length;
		int b [] = {6,7,8,9,10};
		int lb = b.length;
		int c [] = new int[la+lb];
		int lc = c.length;
		int pos=la;
		for(int i =0 ;i<la;i++)
		{
			c[i]=a[i];
			//pos=i+1;
		}
		//pos = la;
		for(int j= 0;j<lb;j++)
		{
			c[pos]=b[j];
			pos++;
		}
     for(int k = 0;k<lc;k++)
     {
    	 System.out.println(c[k]);
     }
	}

}
