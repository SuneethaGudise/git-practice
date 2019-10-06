package mapprograms;
import java.util.*;
//PROGRAM TO SORT THE MAP BY VALUE
public class SortMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Map<Integer,String> map = new TreeMap<>();
    map.put(50, "berry");
    map.put(20, "banana");
    map.put(10, "apple");
    map.put(40, "Cherry");
    map.put(50,"Mango");
    map.put(30,"Mango");
    //Before Sorting the output is as below 
    //Insertion order is not preserved
    //Duplicate keys are not allowed so only one 50 is printed
    //but duplicate values are allowed so Mango two times is printed
    
    System.out.println("Before sorting" +map);//Before sorting {50 =mango,20=banana,40 =cherry,10=apple,30=mango
	 Set<Integer> s=map.keySet();
	System.out.println(s);
	// Map<Integer,String> map2=sortByValue(map);

	// System.out.println(s);
	}
	
	} 