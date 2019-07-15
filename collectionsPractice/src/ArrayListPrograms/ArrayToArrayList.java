package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ARRAY
		String arr[]= {"apple","banana","cherry","mango"};
		
		//CONVERTING INTO ARRAYLIST AND INITILIZING ARRAY VALUES TO ARRAYLIST USINGARRAYS .ASLIST()
		ArrayList<String> al =new ArrayList<String>(Arrays.asList(arr));
	/*	//ADDING ARRAY ELEMENTS TO ARRAYLIST BY USING COOLECTIONS.ADDALL()
		Collections.addAll(al,arr);*/
		for(String str: al)
			System.out.println(str);

	}

}
