package hashSetprograms;
import java.util.*;
public class AddsTwoSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> sint = new HashSet<>(Arrays.asList(11,13,15,16,18));
		Set<Integer> sint1 = new HashSet<>(Arrays.asList(12,14,17,19,20));
		sint.addAll(sint1);
		System.out.println(sint);

	}

}
