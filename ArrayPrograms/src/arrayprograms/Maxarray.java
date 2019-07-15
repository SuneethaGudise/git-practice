package arrayprograms;

public class Maxarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,40,80,30,20,90,3,40,60,170,50};
		int len =a.length;//11
		System.out.println(len);//11
		int max =a[0];//max=10
		for(int i =1;i<len;i++)
		{
			if(max<a[i]) {
				max=a[i];
				
			}
			//System.out.println(max);
		}
		System.out.println(max);

	}

}
