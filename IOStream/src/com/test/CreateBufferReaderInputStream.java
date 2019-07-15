package com.test;


	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	public class CreateBufferReaderInputStream {
	

	  public static void main(String args[]) throws Exception {
	    InputStreamReader isr = new InputStreamReader(System.in);

	    BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter the string:");
	    String s;
	    while ((s = br.readLine()) != null) {
	      System.out.println(s.length());
	    }
	    isr.close();
	  }
	}


