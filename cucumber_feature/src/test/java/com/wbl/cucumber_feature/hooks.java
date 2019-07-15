package com.wbl.cucumber_feature;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	@Before
	public void beforeScenario()
	{
		System.out.println("This will run before class");
	}
	
 @After
 public void afterScenario()
 {
	 System.out.println("This will run after class");
 }
}
