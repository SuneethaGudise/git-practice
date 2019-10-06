package ArrayListPrograms;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//PRINT ELEMENTS IN REVERSE ORDER USING LISTITERATOR
public class ReverseUseListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst =new ArrayList<>(Arrays.asList("aaa","bbb","ccc","ddd"));
		ListIterator  itr =lst.listIterator();
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			itr.next();
		}
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
			}
		List<Integer> lst1 = new ArrayList<>(Arrays.asList(10,20,30,40));
		ListIterator lstr = lst1.listIterator();
		while(lstr.hasNext()) {
			lstr.next();
		}
		while(lstr.hasPrevious()) {
			System.out.println(lstr.previous());
		}
	}
		}
