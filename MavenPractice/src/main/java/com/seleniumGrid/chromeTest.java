package com.seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class chromeTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		//1.DEFINE DESIRED CAPABILITIES
		System.out.println("Step 1");
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		System.out.println("Step 2");
		//2.CHROME OPTIONS DEFINITION:
		ChromeOptions option = new ChromeOptions();
		option.merge(cap);
		System.out.println("Step 3");
		
		String huburl= "http://192.168.0.16:5555/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(huburl),option);
		System.out.println("Step 4");
		driver.get("https://www.walmart.com/");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("#global-search-input")).sendKeys("shoes");
		driver.findElement(By.cssSelector("#global-search-input")).sendKeys(Keys.ENTER);
		
		driver.quit();
	}

}
