package practiceIOstream;
import java.io.FileOutputStream;

public class practiceoutputstream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fout = new FileOutputStream("C:/Working/suneetha/IO.txt");
			String s="Welcome to Java";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Done Correct");
				
			}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
