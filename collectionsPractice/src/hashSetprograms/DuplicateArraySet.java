package hashSetprograms;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String arr[]= {"apple","berry","cherry","straw","berry"};
		Set<String> str = new HashSet<String>();
		str.add("apple");
		str.add("berry");
		str.add("cherry");
		str.add("straw");
		str.add("berry");
		System.out.println(str);//duplicate is not allowed so it wont reaad berry two times
				}
		
	}


	


