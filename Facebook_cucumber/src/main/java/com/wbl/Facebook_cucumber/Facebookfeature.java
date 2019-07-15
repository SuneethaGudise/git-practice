package com.wbl.Facebook_cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebookfeature {
	static String URL="https://www.facebook.com/";
	WebDriver driver;
	
	
	@Given("^Open the Browser$")
	   public void open_the_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\chromedriver.exe" );
		driver=new ChromeDriver();
	   
	  }

	@When("^Open the Facebook page$")
	   public void open_the_Facebook_page() throws Throwable {
		driver.navigate.to(URL);
	  
	}

	@Then("^Click in Logon button$")
	public void click_in_Logon_button() throws Throwable {
		if(driver.findElements(By.id("loginbutton")).is)
	    
	}

}
