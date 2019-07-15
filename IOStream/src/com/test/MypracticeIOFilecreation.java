package com.test;

import java.io.File;

public class MypracticeIOFilecreation {
  //CREATING FOLDER
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fObj is object of File
		File fObj =new File("C:/Users/ravi/Desktop/SELENIUM");//it accepts forward slashes/only here
		fObj.mkdir();
		System.out.println("CORRECT");
	}

}
