package com.test;

import java.io.File;

public class MyFolderDelete {
	//DELETE A FOLDER

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fobj =new File("C:/Users/ravi/Desktop/SELENIUM");
		fobj.delete();
		System.out.println("Folder is deleted");

	}

}
