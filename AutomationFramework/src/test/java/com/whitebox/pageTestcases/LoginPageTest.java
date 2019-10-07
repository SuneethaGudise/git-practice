package com.whitebox.pageTestcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.whitebox.pages.HomePage;
import com.whitebox.pages.LoginPage;

import BaseTest.BrowserTest;
//import junit.framework.Assert;

public class LoginPageTest extends BrowserTest {
	//CREATE THE VARIABLES FOR THE PAGES
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialize();
		loginpage = new LoginPage();
	}
	
    @Test
    public void LoginpageTitleTest()
    {
    	String title = loginpage.vaidateLogin();
        Assert.assertEquals(title,"QA/QE/SDET Training.");
    }
    
    @Test
    public void logindetTest()
    {
    	homepage = loginpage.loginPagedet(prop.getProperty("username"),prop.getProperty("password"));
    	
    }
    @Test
    public void logoTest()
    {
    	boolean img = loginpage.imgLogo();
    	Assert.assertTrue(img);
    }
    @AfterMethod
    public void tearDown() {
    	driver.quit();
    }
}
