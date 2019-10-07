package com.whitebox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BrowserTest;

public class LoginPage extends BrowserTest {
	//PAGE FACTORY
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="login")
	WebElement Login;
	@FindBy(id="register")
	WebElement register;
	@FindBy(id ="logo")
	WebElement logo;
	//INITIALIZATION THE PAGE OBJECT
  public LoginPage() {
	  PageFactory.initElements(driver,this);
  }
  // ACTIONS
  public String vaidateLogin() {
	  return driver.getTitle();
  }
  public boolean imgLogo() {
	  return logo.isDisplayed();
	  
  }
  //ACTIONS ONCE LOGIN BUTTON IS CLICKED THEN IT SHOULD BE LANDED TO HOMEPAGE SO WE SHOULD RETURN HOMEPAGE ONCE LOGIN IS CLICKED
  public HomePage loginPagedet(String user,String pwd)
  {
	  username.sendKeys(user);
	  password.sendKeys(pwd);
	  Login.click();
	 // register.click();
	//  return loginPagedet(null, null);
	return new HomePage();
  }
}
