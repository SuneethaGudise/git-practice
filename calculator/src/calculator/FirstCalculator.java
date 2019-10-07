package calculator;

public class FirstCalculator {

	public int getAddCount()
	{
		return sumOperCount;
		
	}
	
	private int sumOperCount = 0;
	private int multOperCount =0;
   
	public double sum(double x, double y) {
		sumOperCount++; totalCount++;
		double z = x + y;
		return z;
	}
	public int getDifftCount() {
		return diffCount;
	}
     private int diffCount;
	public double diff(double x, double y) {
		diffCount++;totalCount++;
		double z = x - y;
		return z;
	}
	public int getMultCount() {
		return multOperCount;
	}

	public double mult(double x, double y) {
		multOperCount++;totalCount++;
		double z = x * y;
		return z;

	}
	public int getDivCount() {
		return divCount;
	}
	private int divCount;

	public double div(double x, double y) {
		divCount++;totalCount++;
		double z = 0;
		try {
			z = x / y;
			//System.out.println(x / 0 + " : Dividing by zero is Error");
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Enter digit other than zero");
		}
		return z;
	}
	private int totalCount=0;
	
	public int getTotalCount()
	{
		return totalCount;
		//return divCount + multOperCount + sumOperCount + diffCount ;
	}
	 
}
