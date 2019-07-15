package practiceIOstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//WAP USING BUFFEREDREADER AND INPUTSTREAMREADER TO INPUT TWO NUMBERS AND SUBTRACT THEM

public class BufferReaderAndInputStream {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the numbers:");
		i=Integer.parseInt(br.readLine());
		j=Integer.parseInt(br.readLine());
		
		k =i-j;
		System.out.println("the Difference between two numbers is:" +k);
				
				

	}

}
