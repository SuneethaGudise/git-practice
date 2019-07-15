package ArrayListPrograms;
import java.util.*;
//FIND DUPLICATES IN ARRAY USING SET
public class DuplicateArraySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"apple","berry","cherry","straw","berry"};
		Set<String> str = new HashSet<String>();
		
		for(int i =0;i<arr.length;i++) 
		
			if(!str.add(arr[i])){
				System.out.println(arr[i]);
		}
		

	}

}
