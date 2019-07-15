package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CREATING ARRAYLIST OR LINKEDLIST
	//	ArrayList<Integer> arr =new ArrayList<Integer>();
	  LinkedList<Integer> arr =new LinkedList<Integer>();	
	  //ADDING ELEMENTS TO ARRAYLIST OR LINKEDLIST OBJECT
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		
		//BEFORE REVERSING
		System.out.println(arr);
		
		//method used to reverse
		Collections.reverse(arr);
		
		//AFTER REVERSING
		System.out.println(arr);

	}

}
