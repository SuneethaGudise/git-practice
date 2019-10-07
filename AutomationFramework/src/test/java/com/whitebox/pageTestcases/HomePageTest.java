package com.whitebox.pageTestcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.whitebox.pages.DemoPage;
import com.whitebox.pages.HomePage;
import com.whitebox.pages.LoginPage;
import com.whitebox.pages.ResourcePage;
import com.whitebox.pages.SchedulePage;
import com.whitebox.util.TimeUtil;

import BaseTest.BrowserTest;

public class HomePageTest extends BrowserTest{
	LoginPage loginpage;
	HomePage homepage;
    SchedulePage schedulepage;
    DemoPage demopage;
    ResourcePage resourcepage;
    TimeUtil time;
	public HomePageTest() {
		super();

	}
	@BeforeClass
	public void setUp()
	{
		initialize();
		loginpage = new LoginPage();
		homepage = loginpage.loginPagedet(prop.getProperty("username"),prop.getProperty("password"));
	}
		
	@Test
	public void homePageTitleTest() {
		String homeTitle = homepage.validateHomepage();
		Assert.assertEquals(homeTitle,"QA/QE/SDET Training.");
	}
	@Test
	public void slidesTest() {
		assertTrue(homepage.isSliderpresent());
		System.out.println("slides are scrolling");
	}
	@Test
	public void slidesCountTest() {
		Assert.assertEquals(homepage.sliderCount(),6);
	}
	@Test (priority =1)
	public void scheduleClickTest() {
		schedulepage = homepage.clickSchedule();
		
	}
	@Test (priority =2)
	public void demoClickTest() {
		demopage = homepage.clickDemo();
		
	}
	@Test (priority =3)
	public void resourceClickTest() {
		resourcepage = homepage.clickResource();
		
	}
	
	
	
//	
//	@AfterClass
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
