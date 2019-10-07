package com.whitebox.pageTestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.whitebox.pages.DemoPage;
import com.whitebox.pages.HomePage;
import com.whitebox.pages.LoginPage;
import com.whitebox.pages.ResourcePage;
import com.whitebox.pages.SchedulePage;
import com.whitebox.util.TimeUtil;

import BaseTest.BrowserTest;

public class DemoPageTest extends BrowserTest {
	LoginPage loginpage;
	HomePage homepage;
	SchedulePage schedulepage;
	  TimeUtil time;
	  ResourcePage resourcepage;
	  DemoPage demopage;
	public DemoPageTest() {
		super();
	}
	@BeforeMethod
	
	public void setUp() {
		initialize();
		loginpage=new LoginPage();
		 homepage=loginpage.loginPagedet(prop.getProperty("username"),prop.getProperty("password"));
		 schedulepage = homepage.clickSchedule();
}
	 @Test(priority=1)
	public void demopageTitleTest() {
		String demotitle = demopage.validateDemo();
		Assert.assertEquals(demotitle,"QA/QE/SDET Training.");
	}
	 @Test(priority = 2)
	 public void moveOnResourcePage() {
		 resourcepage = demopage.validRegisterPage();
		 
	 }
}
