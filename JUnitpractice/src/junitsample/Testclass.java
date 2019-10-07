package junitsample;

//import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import junit.framework.Assert;

public class Testclass {

	Addition A =new Addition();
	@Before
	public void beforeTest() 
	  {
		System.out.println("This will executed before test method");	
	  }
	@After
	public void afterTest()
	  {
		System.out.println("This will excuted after test method");
	  }
	@Test
	public void testAdd()
	  {
		System.out.println("This is the testAdd script");
		assertEquals(8,A.sum(5 ,3));
		assertEquals(-8,A.sum(-5 ,-3));
		assertEquals(12,A.sum(15 ,-3));
	  }
	@Test
	public void testAdd1()
	  {
		System.out.println("This is the testAdd1 script");
		assertEquals(6,A.sum(4 ,2));
		assertEquals(90,A.sum(40 ,50));
		assertEquals(10,A.sum(18,-8));
	  }	
	  }
		