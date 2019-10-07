package com.string;

public class SplitString {
	
		
		//splits the words based on white spaces
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				String str ="Java split method is used here";
				String[] spl =str.split("\\s");//splits the words based on white spaces
				for(String s :spl) {
					System.out.println(s);	
				}
				
		 
			}

		}



