package ArrayListPrograms;
import java.util.*;
public class ConvertArrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATING ArrayList and Initiaizing the values
		ArrayList<String> al =new ArrayList<String>();
		al.add("apple");
		al.add("kiwi");
		al.add("banana");
		al.add("cherry");
		System.out.println(al);
		//CONVERTING ArrayList TO Array
		String str[] =new String[al.size()];
		for(int i=0;i<al.size();i++)
			str[i] = al.get(i);
		for(String k : str)
			System.out.println(k);
		
	}
	
  
	}
		
	
			
	
		
		

	


