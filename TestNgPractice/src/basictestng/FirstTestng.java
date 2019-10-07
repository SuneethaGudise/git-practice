package basictestng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestng {
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Set up System property of chrome");
	}
	@BeforeTest
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	@BeforeClass
	public void logIn()
	{
		System.out.println("log into the app");
	}
	@BeforeMethod
    public void enterUrl()
    {
	 System.out.println("Enter the Url");
    }
	@Test(priority =2)
	public void utest1()
	{
		System.out.println("This is first testng testcase");
	}
	
	@Test
	public void dtest2()
	{
		int a=10;
		int b=20;
		int c= a+b;
	Assert.assertEquals(30,30);
		//int c =5/0;
		System.out.println("This is second testng testcase");
	}
	@Test(priority =1)
	public void rtest3()
	{
		System.out.println("This is third testcase");
	}
	@AfterMethod()
	public void logOut()
	{
		System.out.println("logout from the app");
	}
    @AfterClass
    public void deleteAllCookies()
    {
    	System.out.println("Delete the cookies");
    }
    @AfterTest
    public void closeBrowser()
    {
    	System.out.println("Close the browser");
    }
    @AfterSuite
    public void generateTestReports()
    {
    	System.out.println("Generate the test case reports");
    }
}
