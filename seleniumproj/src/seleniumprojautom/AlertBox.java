package seleniumprojautom;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox {
	public static void main(String[] args)throws InterruptedException {
		
	
		System.out.println("Starting now...");
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		System.out.println("Starting now..444.");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		System.out.println("1234");
	    Assert.assertEquals("Facebook - Log In or Sign Up",title);
	   driver.findElement(By.name("firstname")).sendKeys("aaa");
	   driver.findElement(By.name("lastname")).sendKeys("zzz");
	   driver.findElement(By.name("reg_email__")).sendKeys("12345523");
	   driver.findElement(By.name("websubmit")).click();
	   Alert alt = driver.switchTo().alert();
	   alt.dismiss();;
	}
	}

