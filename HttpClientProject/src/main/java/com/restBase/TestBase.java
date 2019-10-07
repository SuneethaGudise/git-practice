package com.restBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

public class TestBase {
	public Properties prop;
	
	//CREATE A CONTRUCTOR TO READ PROPERTIES FILE FROM THIS CONSTRUCTOR
	public TestBase() {
	try {
		prop = new Properties();
		{
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"src/main/java/com/restConfinproperties");
			prop.load(ip);
		}
	}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}
	}
	


