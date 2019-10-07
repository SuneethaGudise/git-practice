package com.test;

import java.io.File;
import java.io.IOException;

public class CreateFile {
//CREATING NEW FILE
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		File fobj =new File("C:/Users/ravi/Desktop/abc.txt");
		fobj.createNewFile();

	}

}
