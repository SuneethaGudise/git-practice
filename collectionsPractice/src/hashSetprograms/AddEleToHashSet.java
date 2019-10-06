package hashSetprograms;

import java.util.HashSet;

public class AddEleToHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<Integer> hs =new HashSet<Integer>();
     hs.add(10);
     hs.add(20);
     hs.add(30);
     //USINF ADVANCED FOR LOOP
     for(int set : hs)
    	 System.out.println(set);//20,10,30(because insersion order is not preserved)
     HashSet st =new HashSet();
     st.add("str");
     st.add("svn");
     st.add("dscv");
     st.add("str");
     System.out.println(st);//[str,svn,dscv]because duplicates are not allowed
     
	//SEARCH THE ELEMENT
     if(st.contains("str"))
    	 System.out.println("str found");
     else
    	 System.out.println("str not found");
	}

}
