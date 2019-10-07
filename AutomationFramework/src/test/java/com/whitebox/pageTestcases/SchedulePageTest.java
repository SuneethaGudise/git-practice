package com.whitebox.pageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.whitebox.pages.HomePage;
import com.whitebox.pages.LoginPage;
import com.whitebox.pages.SchedulePage;
import com.whitebox.util.TimeUtil;

import BaseTest.BrowserTest;

public class SchedulePageTest extends BrowserTest{
	LoginPage loginpage;
	HomePage homepage;
	SchedulePage schedulepage;
	  TimeUtil time;
	  public static void waitingTime()
	  {
		  try {
			  Thread.sleep(2000);
		  }
		  catch(Exception e) {
			  System.out.print("Exception handled");
		  }
	  }
	
	public SchedulePageTest()
	{
		super();
	}
     
	@BeforeClass
	//@BeforeSuite
	public void setUp() {
		initialize();
		loginpage=new LoginPage();
		 homepage=loginpage.loginPagedet(prop.getProperty("username"),prop.getProperty("password"));
		 schedulepage = homepage.clickSchedule();
		
	}
	@Test(priority=1)
	public void schedulepageTitleTest() {
		String schdpagetitle = schedulepage.scheduleTitle();
		Assert.assertEquals(schdpagetitle,"QA/QE/SDET Training.");
		waitingTime();
	}
	@Test(priority=2)
	public void scheduleNamedispalyTest() {
		boolean schname = schedulepage.verifySchedulename();
		Assert.assertTrue(schname);
		waitingTime();
	}
	@Test(priority=3)
	public void homeInScheduleTest()
	{
		homepage = schedulepage.clickonhomeinschedulePage();
		waitingTime();
	}
    @Test(priority = 4)
    public void calendarclickTest() {
    	schedulepage.calanderClick();
    	waitingTime();
    }
    @Test(priority=5)
    public void verifyscheduleOptionTest() {
    	schedulepage.scheduleOptionClick();
    	waitingTime();
    }
    @Test(priority=6)
    public void courseClickTest() {
    	schedulepage.courseContentClick();
    	waitingTime();
    }
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
}
