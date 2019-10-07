package stringPrograms;
//Driver class 
public class ImmutableStuString {
	
	
	 
	    public static void main(String args[]) 
	    { 
	    	ImmutableString  s = new ImmutableString ("ABC", 101); 
	    
	        System.out.println(s.getName()); 
	        System.out.println(s.getRegNo()); 
	  
	        // Uncommenting below line causes error 
	        // s.regNo = 102; 
	    } 
	
}
