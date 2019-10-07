package com.test;

import java.io.File;

public class MyFolderExists {
 //FOLDER EXISTS OR NOT
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fobj = new File("C:/Users/ravi/Desktop/SELENIUM");
		boolean a = fobj.exists();
		if(a==true) {
			System.out.println("Folder exists");
		}
			else {
				System.out.println("Folder does not exists");
			}
		}

	}


