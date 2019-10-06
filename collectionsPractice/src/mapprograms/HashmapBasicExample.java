package mapprograms;



	import java.util.HashMap;
	import java.util.LinkedHashMap;
	import java.util.Map;

	public class HashmapBasicExample {

		public static void main(String[] args) {
			//declaring the hashmap.it doesn't maintain any order
			Map<Integer,String> hmap=new HashMap<Integer,String>();
			//adding key-value pair to it
			hmap.put(1, "Jane");
			hmap.put(2, "Thakkudu");
			hmap.put(3, "GK");
			hmap.put(4, "John");
			hmap.put(5, "Rose");
			hmap.put(6, "GeorgeKutty");
			//displaying individually
			String value=hmap.get(5);
			System.out.println(value);
			//displaying or getting as the group
			for(Map.Entry<Integer,String> m:hmap.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
			}
			
			System.out.println("Values before removing:"+hmap);
			hmap.remove(4);
			System.out.println("Values after removing:"+hmap);
			
			for(Integer k:hmap.keySet()){
				String value1=hmap.get(k);
				System.out.println("key="+k+" value="+value1);
				
			}
			
			//*****************************************************
			Map<Integer,String> linkedhmap=new LinkedHashMap<Integer,String>();
			linkedhmap.put(8,"143");
			linkedhmap.put(9,"smiley");
			linkedhmap.put(10, "always");
			System.out.println("from linked hash map:");
			for(Integer m:linkedhmap.keySet()){
				String value1=linkedhmap.get(m);
				System.out.println("Key= "+m+ " value= "+value1);
			}
			

		

	}

}
