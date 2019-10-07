package BaseTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.whitebox.util.TimeUtil;

//LAUNCHING BROWSER IS BASE CLASS .FROM THIS CLASS REMAINING CLASEES FROM DIFFERENT PACKAGE WILL INHERIT THE BROWSER
public class BrowserTest {

	public static WebDriver driver;	
	public static Properties prop;
	
	public BrowserTest() {
		try {
			prop =new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\ravi\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\com\\whitebox\\configdetails\\configeration.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialize()
	{
		String browsername = prop.getProperty("chrome");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\AutomationFramework\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(TimeUtil.Page_Load_TimeOut,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TimeUtil.Implicit_Wait,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		//driver.get(prop.getProperty("title"));
		driver.get(prop.getProperty("url"));
	}
   public static void sendKeys(WebDriver driver,WebElement element,int timeout) {
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys();
	}
   public static void clickOn(WebDriver driver,WebElement element, int timeout) {
	   new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
	   element.click();
   }
   public static void click(WebDriver driver , WebElement element) {
	   JavascriptExecutor js = (JavascriptExecutor)driver;	
	   js.executeScript("arguments[0].click();", element);
		
   }
}
