package ArrayListPrograms;
import java.util.*;
import java.util.Arrays;

public class Iteratorforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst =new ArrayList(Arrays.asList(54,37,45,20,10));
		//USING FOR LOOP
		for(int i=0;i<lst.size();i++)
			System.out.println(lst.get(i));
         //USING ENHANCED FORLOOP
	    for(int n:lst)
	    	System.out.println(n);
	}

}
