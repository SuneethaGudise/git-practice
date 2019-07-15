package methodOverriding.com;

public class SumOverriding {
	int sum(int a,int b) {
		 int c ;
		return c=a+b;
		
	}
	/*void display()
	{
		System.out.println("the sum is = " + c);
	}*/
 public static class AddOverride extends SumOverriding{
	 public static void main(String [] args) {
		 
		SumOverriding add =new  SumOverriding() ;
		
		 System.out.println( add.sum(10,20));
	 }
 }
}
