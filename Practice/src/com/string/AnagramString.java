package com.string;

import java.util.ArrayList;
import java.util.List;

public class AnagramString {
	/* using Collections add() & remove() methods */
	private static void isAnagram(String s1, String s2) {
		char[] c1 = s1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] c2 = s2.replaceAll("\\s", "").toLowerCase().toCharArray();
		if(c1.length==c2.length) {
		if (c1.length > 0) {
		List lst = new ArrayList();
		for (Character c : c1) lst.add(c);
		for (Character c : c2) {
		if(!lst.remove(c)) System.out.println(s1 + "and " + s2 + "not Anagrams");
		}
		if (lst.isEmpty()) System.out.println(s1 + " and " + s2 + "are Anagrams");
		}
		}else
		System.out.println(s1 + " and " + s2 +" r not Anagrams");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("scrabble","clabbers");
		isAnagram("zero","hero");

	}

}
