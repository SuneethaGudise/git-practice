package exceptionhandling;
import java.lang.ArithmeticException;

public class exceptionassingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 test obj =new test();
	int res= obj.sub(5,-4);
	// int res= obj.sub(i, j)
	 System.out.println(res);
	 try {
	 test obj1=new test();
	 int dres =obj1.div(55,0);
	 System.out.println(dres);
	 }
	 catch(ArithmeticException e) {
	 System.out.println("invalid input");
	 
	  
	 }
	 System.out.println("program ended");
	 
	 


	
}
//catch(ArithemeticException) {
	

	  
		  
	

}
