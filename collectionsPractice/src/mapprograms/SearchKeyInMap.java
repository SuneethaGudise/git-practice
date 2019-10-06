package mapprograms;
import java.util.*;
public class SearchKeyInMap {
//SEARCH FOR KEY IN CREATED MAP and return its value
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Integer,String> hm =new HashMap<>();
	hm.put(10," Apple");
	hm.put(20,"Banana");
	hm.put(30, "Cherry");
	hm.put(40, "Mango");
	hm.put(50, "Berry");
	//TO SEARCH THE KEY VALUE
	System.out.println("if Map Has key :" +hm.containsKey(40 ));//TRUE
	//TO GET THE KEY VALUE
	System.out.println("Return the value: "+hm.get(40));//Mango
	System.out.println(hm);//Insertion order is not preserved
	//TO REMOVE THE KEY VALUE
	hm.remove(50);
	System.out.println(hm);
	//IT WILL GIVE NULL VALUE IF WE ENTER VALUE NAME(CHERRY) INSTEAD OF KEY (30)
	System.out.println(hm.get("cherry"));

	}

}
