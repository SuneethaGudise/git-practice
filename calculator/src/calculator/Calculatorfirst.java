package calculator;

public class Calculatorfirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstCalculator  calc=new FirstCalculator();
		
		double x = 2;
		double y = 0;
		//
		double result =calc.sum(x,y);
		System.out.println("sum is " + result);
		
		x=2;y=4;
		result =calc.sum(x,y);
		System.out.println("sum is " + result);
		x=2;y=3;
		result =calc.diff(x, y);
		System.out.println("diff is " + result);
		
		result =calc.mult(x, y);
		System.out.println("mul is " + result);
				
		result =calc.div(x, y);
		System.out.println("div is " + result);
		//calc.addCount = 10;
		System.out.println("no of adds " + calc.getAddCount());
		System.out.println("no of substractions " + calc.getDifftCount());
		System.out.println("no.of multiplications"+ calc.getMultCount());
		System.out.println("no of divisions " + calc.getDivCount());
		System.out.println("Total no.of operations:" + calc.getTotalCount());
	}

}
