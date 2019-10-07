package assignments1;

public class stringchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="This is JAVA WORLD JAVA";
		String [] b=a.split("\\s");
		int clength=b.length;
		System.out.println("The clength is" + clength);
				
		for(int i=0;i<clength;i++) {
			System.out.println(b[i]);
		
			String temp = b[i];
		for(int j=i+1;j<clength;j++) {
			//System.out.println(j);
			
			String t= b[j];
			
			if(temp.equals(t)) {
		System.out.println("the duplicate word is" + "=" + temp);
		//System.out.println(j);
			
	}		
		}
}	
		
	}
}

		
			
		
			
		
		
			
		
	
