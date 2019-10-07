package practiceIOstream;

import java.io.FileOutputStream;

public class practiceoutputstream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileOutputStream fos=new FileOutputStream("C:/Working/suneetha/Outputstream.txt");
			String s = "My practice test";
			byte i[] =s.getBytes();
			fos.write(i);
			fos.close();
			System.out.println("sucess");
		}
		catch(Exception e) {
			System.out.println("invalid");
		}
		/*try {
			FileOutputStream fout = new FileOutputStream("")
					String s1="All the best";
			       byte b1[]=s1.getBytes();
			       fout.write(b1);
			       fout.close();
			       System.out.println("correct");
			       
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}*/

}
}
