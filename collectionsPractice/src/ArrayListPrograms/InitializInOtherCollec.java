package ArrayListPrograms;
import java.util.*;
public class InitializInOtherCollec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating Collection
		List<Integer> ls =new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(13);
		ls.add(59);
		
        System.out.println("BEFORE INITIALIZIN IN ArrayList :" +ls);
        ls.add(2,30);
        ls.add(0,3);
        System.out.println("Adding the new value in1st and 3rd index" +ls);
		//Now Initializing in ArrayList
		List<Integer> arr = new ArrayList<Integer>(ls);
		Collections.reverse(arr);
		System.out.println("AFTER INITIALIZIN IN ArrayList :" +arr);
	}

}
