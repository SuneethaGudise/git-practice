package vararg;

public class Varargprac {
	public static void m1(int... x)
	{
		System.out.println("This is var arg example");
	}
	public static void m1(int x)
	{
		System.out.println("This is general method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
	    m1(10,20);
		m1(10);
		
      
	}

}
