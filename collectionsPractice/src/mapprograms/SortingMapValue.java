package mapprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingMapValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new TreeMap<>();
	    map.put(50, "berry");
	    map.put(20, "banana");
	    map.put(10, "apple");
	    map.put(40, "Cherry");
	    map.put(50,"Mango");
	    map.put(30,"Mango");
       System.out.println(map);//In tree map Insertion order is preseved
	}

}
