package methodtest;

public class testclass {
	public static void sum(int i) {
	if( i>=35 && i<=50) {
		 System.out.println( "student has just passed ");
		 
	 }
	 else {
		 //throw new ArithmeticException("student has to get one mark to pass  ");
		 System.out.println( "student has failed ");
	 }
	 if(i>50 && i<=65) {
		 System.out.println("student has passed in second class");
	 }
		 else
		 {
			 System.out.println("Student has not passed in second class");
		 }
	 if(i>65 && i<=75) {
		 System.out.println("student has passed in first class");
	 }
		 else
		 {
			 System.out.println("Student has not passed in first class");
		 }
	 if(i>75) {
		 System.out.println("student has passed in distinction");
	 }
		 else
		 {
			 System.out.println("Student has paased in first class");
		 }
	 
	}
		public static void main(String []args) {
			sum(79);
		}
	}

