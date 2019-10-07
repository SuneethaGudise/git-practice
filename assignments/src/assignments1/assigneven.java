package assignments1;

public class assigneven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		a = "even = ";

		String b;
		b = "odd = ";
		// String c;
		// c=a+b;
		// System.out.println(c);;
		// System.out.println(c=c+2);
		// System.out.println(c=c+2 +a);

		for (int i = 1; i <= 50; i++) {
			// System.out.println(i);
			if (i % 2 == 0) {
				a = a + i + ",";
				// System.out.println("c=");
				// System.out.println ("even =" + i );
				// System.out.print("even=");
				// System.out.print(" ");
				// System.out.print(i);
				// System.out.print(" ");
			}

			else {
				// System.out.print("odd=");
				// System.out.print(" ");
				// System.out.println(i);
				// System.out.println("odd =" + i);
				// System.out.println("c=");
				b = b + i + ",";
			}
			
			
		}
		System.out.println(a );
		System.out.println(b );
		
		

	}

}
