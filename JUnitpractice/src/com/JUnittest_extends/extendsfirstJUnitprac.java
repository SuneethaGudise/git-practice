package com.JUnittest_extends;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.junittest.firstJUnitprac;

//import junit.framework.Assert;

public class extendsfirstJUnitprac extends firstJUnitprac{
	@BeforeClass
	 public static void beforeclass() {
		System.out.println("Beforeclass is running-----");
	 }
	
	@Before
	 public void before() {
		System.out.println("Before is running------");
	 }
	@After
	 public void after() {
		System.out.println("After  the test ---");
	 }
	

	@Test

	 public void validrecharge() {
		Assert.assertEquals("success", sum(45));
	 }
	
	@Test

	 public void invalidrecharge() {
		Assert.assertEquals("failed", sum(29));
	 }
    @Test
    public void invalidrechargeamt() {
    	Assert.assertEquals("failed",sum(0));
    }
    
}

