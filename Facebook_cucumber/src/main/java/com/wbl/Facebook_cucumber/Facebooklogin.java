package com.wbl.Facebook_cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebooklogin {
	static String URL="https://www.facebook.com/";
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.navigate().to(URL);
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		System.out.println("1234");
	    Assert.assertEquals("Facebook - Log In or Sign Up",title);
	    driver.findElement(By.id("email")).sendKeys("sunitha.gudis@gmail.com"); 
	    driver.findElement(By.id("pass")).sendKeys("kutty136");
	    WebElement login = driver.findElement(By.id("u_0_2"));
		System.out.println("4567");
	    System.out.println(login.getText());

	    login.click();
	//	JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",login);
	//	WebElement profilename=driver.findElement(By.cssSelector("#u_0_a > div:nth-child(1) > div:nth-child(1) > div > a > span > span"));
		// Assert.assertEquals("sunitha", profilename);
				System.out.println("FaceBook login is successful");
				
				
				
		//TO SEND THE TEXT IN SEARCH BOX AND CLICK SEARCH BUTTON
		WebElement search =driver.findElement(By.name("q"))	;	
		search.sendKeys("keto");
		WebElement searchbutton =driver.findElement(By.xpath("//*[@id=\"js_5b\"]/form/button/i"));
		Actions movemouseon = new Actions(driver);
		movemouseon.moveToElement(searchbutton).click().build().perform();
		
	}
}
