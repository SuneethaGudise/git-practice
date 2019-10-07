package com.whitebox.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BrowserTest;

public class DemoPage extends BrowserTest {
   
	/*@FindBy(linkText="Resource")
	WebElement resorce;*/
	
	
	public DemoPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateDemo() {
		return driver.getTitle();
	}
	public ResourcePage validRegisterPage() {
		WebElement resorce = driver.findElement(By.className("dropdown-toggle"));
		Actions build =new Actions(driver);
		build.moveToElement(resorce).perform();
		return new ResourcePage();
	}
	
	
}
