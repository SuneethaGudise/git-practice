package ArrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//REVERSE USING LINKEDLIST
public class ReverseStrCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList<String> list = new LinkedList<String>();
     list.add("apple");
     list.add("blackberry");
     list.add("cherry");
     
     //Before Reversing
     System.out.println(list);
     
     //Method to reverse
       Collections.reverse(list);
       
       //After Reverse
       System.out.println(list);
 
     


	}

}
