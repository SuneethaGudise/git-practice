package basictestng;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniAmazonTest {
	WebDriver driver;
 @BeforeSuite
 public void setUp()
 {
 System.out.println("Add selenium server standalone jars");
}
 @BeforeTest
 public void chromedriver()
 {
	 System.out.println("Copy and paste chromedriever.exe");
 }
 @BeforeMethod
 public void setUpChrome()
 {
System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\TestNgPractice\\chromedriver.exe" );
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	 //driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
	 driver.get("https://www.amazon.com/");
 }
 @Test
 public void openTitlepage()
 {
	 String title = driver.getTitle();
	// String actualTitle = "amazon.com";
	// Assert.assertEquals( actualTitle,title);
	 System.out.println(title);
 }
 @Test
 public void searchTest()
 {
	 WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	 search.sendKeys("watches");
	 WebElement searchclick =driver.findElement(By.className("nav-input"));
	 searchclick.click();
	 
 }
 @AfterTest
 public void tearDownChromeTest()
 {
	System.out.println("Close the test"); 
 }
 @AfterMethod
 public void tearDownChrome()
 {
	 driver.quit();
 }
 @AfterSuite
 public void tearDown()
 {
	 System.out.println("Generate the reports");
 }

 
}