package com.junit;
//STILL NOT YERT COMPLETE NEED TO INITIALIZE THE VALUES


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestJunit1{
	
	@BeforeClass
	public void setUpClass()
	{
		System.out.println("BeforeClass is counted");
	}
	@Before
	public void setUp()
	{
		System.out.println("Before count is:");
	}
 
 @Test
 public void test3() 
 {
	 System.out.println("Test3 is Checked");
 }
 @Test
 public void test4() 
 {
	 System.out.println("Test4 is Checked");
 }
 @After
 public void tearDown()
 {
	 System.out.println("After count:" );
 }
 @AfterClass
 public static void tearDownClass()
 {
	 System.out.println("AfterClass is counted:" );
 }
}



