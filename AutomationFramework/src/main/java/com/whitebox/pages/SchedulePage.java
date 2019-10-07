
 package com.whitebox.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseTest.BrowserTest;

public class SchedulePage extends BrowserTest{
	@FindBy(xpath ="/html/body/div[1]/div/div/header/h1")
	WebElement schedulename;
	@FindBy(id="Calendar")
	WebElement calender;
	@FindBy(xpath="/html/body")
	WebElement backgroundTable;
	@FindBy(xpath ="/html/body/div[1]/div/div/header/div/ul/li[1]")
	WebElement youarehere;
	@FindBy(xpath ="//*[@id=\"navbar-collapse\"]/ul/li[1]/a")
	WebElement homeInschedule;
	@FindBy(id ="schedule")
	WebElement scheduleoption;
	@FindBy(xpath ="//*[@id=\"schedule\"]/div/div/table/thead/tr/th[1]")
	WebElement hash;
	@FindBy(xpath="//*[@id=\"schedule\"]/div/div/table/thead/tr/th[2]")
	WebElement morning;
	@FindBy(xpath="//*[@id=\"schedule\"]/div/div/table/thead/tr/th[3]")
	WebElement evening;
	@FindBy(id="Course")
	WebElement course;
	
	public SchedulePage() {
		PageFactory.initElements(driver,this);
	}
    public String scheduleTitle() {
    	return driver.getTitle();
    }
    
    public boolean verifySchedulename()
    {
    	return schedulename.isDisplayed();
    }
    
    public HomePage clickonhomeinschedulePage() {
    	
    	if(youarehere.isDisplayed())
    	homeInschedule.click();
    	return new HomePage();
    }
    public boolean calanderClick()
    {
    	
    if(	 calender.isSelected())
    {
    	backgroundTable.isDisplayed();
    }
    	return calender.isEnabled();
    }
    
    public void scheduleOptionClick() {
    	scheduleoption.click();
    	if(scheduleoption.isSelected())
    		hash.isDisplayed();
    	    morning.isDisplayed();
    	    evening.isDisplayed();
    		//return scheduleoption.isEnabled();
    }
    public void courseContentClick() {
    	course.click();
    	
    }
}
