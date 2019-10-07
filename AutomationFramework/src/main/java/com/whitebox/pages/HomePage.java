package com.whitebox.pages;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BrowserTest;

public class HomePage extends BrowserTest{
	
	@FindBy(xpath ="//td[contains(username:'Suneetha.gudise@gmail.com')]")
	WebElement  myusername;
	
	@FindBy(xpath ="//*[@id=\"navbar-collapse\"]/ul/li[2]/a")
	WebElement schedule;
	
	@FindBy(xpath ="//*[@id=\"navbar-collapse\"]/ul/li[3]/a")
	WebElement demo;
	
	@FindBy(xpath ="//*[@id=\"navbar-collapse\"]/ul/li[4]/a")
	WebElement resource;
	
	@FindBy(xpath ="//a[@innertext=FAQ]")
	WebElement faq;
	
	@FindBy(xpath ="//a[@innertext=INFO]")
	WebElement info;
	
	public HomePage()
	{
       PageFactory.initElements(driver, this);
	}
	
	
	public boolean isSliderpresent() {
	 boolean slider=	driver.findElement(By.xpath("//*[@id=\"promo-slider\"]/ul[1]/li[6]/img")).isDisplayed();
		
		return slider;
		
	}
	
	public int sliderCount() {
	 List<WebElement> slides = driver.findElements(By.xpath("//*[@id=\"promo-slider\"]/ul[1]/li"));
		System.out.println(slides.size());
		return slides.size();
	}
	public String validateHomepage() {
		 return driver.getTitle();
	}
	public SchedulePage clickSchedule() {
		schedule.click();
		return new SchedulePage();
	}
    public DemoPage clickDemo() {
    	demo.click();
    	return new DemoPage();
    }
    public ResourcePage clickResource() {
    	resource.click();
    	return new ResourcePage();
    	
    }
}
