package seleniumprojautom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.toolsqa.com/automation-practice-form/");
	        
	        WebElement radiobutton1 = driver.findElement(By.id("exp-0"));
	        radiobutton1.click();
	        
	        
	        
	}

}
