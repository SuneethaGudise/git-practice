package mapprograms;

import java.util.HashMap;

public class HashMapCreate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(1, "TOYOTO");
		hm.put(2,"HONDA");
		hm.put(3,"ACURA");
		hm.put(4,"BMW" );
		hm.put(4,"MAZDA");
		System.out.println(hm);

	}

}
