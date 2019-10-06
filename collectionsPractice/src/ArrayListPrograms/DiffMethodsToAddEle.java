package ArrayListPrograms;
import java.util.*;

public class DiffMethodsToAddEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create ArrayList
		ArrayList<String> arr =new ArrayList<String>();
		//USING add()
		arr. add("apple");
		 arr.add("banana");
		 arr.add("cherry");
		 System.out.println(arr);
		 ArrayList<Integer> arr0 =new ArrayList<Integer>();
		 arr0.add(100);
		 arr0.add(200);
		 arr0.add(300);
		 arr0.add(400);
		 System.out.println(arr0);
		//USING Arrays.asList()
		 ArrayList<String> arr1 =new ArrayList<String>(Arrays.asList("pine apple","water melon","blue berry"));
		 System.out.println(arr1);
		 
		 //Numbers Arrays.asList()
		 ArrayList<Integer> arr2 =new ArrayList<Integer>(Arrays.asList(10,20,30,50,70));
		 System.out.println(arr2);
		
		 //List.of
	/*	 List<String> ls = new ArrayList<String>(List.of("apple","berry"));
		
             System.out.println(ls);*/
		 
	
	}
}
