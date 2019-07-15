package exceptionhandling;
//WAPTHAT IS EXPECTED TO THROWA NULL POINTER EXCEPTION AND HANDLE IT USING TRY CATCH AND FINALLY
public class NullpointExcepCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		//String srt2= " abc"
		int n ;
		try {
			
		if(str.equals("abc"))
		{
			System.out.println("Strings are same");
		}
		else
			System.out.println("Strings are not same");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
		}
		try {
			n=15/5;
			System.out.println(n);
		}
		
		
		finally
		{
			//if(str!=null)
				System.out.println("finally blocked is executed");
		}
		}
	}


