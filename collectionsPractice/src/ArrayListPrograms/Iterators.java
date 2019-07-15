package ArrayListPrograms;
import java.util.*;
//PRINT ELEMENTS OF THE LIST USING ITERATOR
public class Iterators {
	public static void main(String [] args) {
		List<String> str =new ArrayList<>(Arrays.asList("Apple","banana","cherry","strawberry"));
		Iterator<String> itr =str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator ltr =str.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		List<Integer> intr =new ArrayList<>(Arrays.asList(10,20,30,40,50));
		Iterator itr1 =intr.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		ListIterator ltr1 =intr.listIterator();
		while(ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}	
	}
}
		



