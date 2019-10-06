package ArrayListPrograms;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr =new ArrayList<String>();
		arr.add("I");
		arr.add("want");
		arr.add("to");
		arr.add("search");
		arr.add("the");
		arr.add("element");
		//Method to search an element
		arr.contains("search");
		System.out.println(arr);
		if(arr.contains("ELEment"))
		{
			System.out.println("Searched Element found");
		}
		else
			System.out.println("Searched Element not found");

	}

}
