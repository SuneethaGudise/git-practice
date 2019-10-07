package com.test;

import java.io.File;

public class DeletefolderinConditions {
	//DELETING FOLDER USING CONDITIONS
 public static void main(String [] args) {
	 File fobj =new File("C:/Users/ravi/Desktop/SELENIUM");
	  boolean a =fobj.delete();
	  if(a==true) {
		  System.out.println("Folder is Deleted");
	  }
	  else {
		  System.out.println("folder not exists");
	  }
	 
 }
}
