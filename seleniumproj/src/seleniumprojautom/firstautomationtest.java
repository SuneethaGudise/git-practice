package seleniumprojautom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstautomationtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
        /*WebDriver dr = new ChromeDriver();
        dr.get("http://whiteboxqa.com/");
        
        
       dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement 	elem =  dr.findElement(By.id("loginButton"));
        elem.click();
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        		//(webdriver.chrome.driver",C:/Users/ravi/Downloads/chromedriver_win32);
        WebElement el =dr.findElement(By.linkText("FAQ"));
        el.click();
        dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement el1= dr.findElement(By.linkText("DEMOS"));
        el1.click();*/
        WebDriver drive =new ChromeDriver();
        drive.get("https://www.amazon.com/");
        WebElement amt =drive.findElement(By.id("twotabsearchtextbox"));
        //amt.sendKeys("laptops");
        //drive.manage().window().maximize();
        //amt.sendKeys(Keys.ENTER);
        //amt.submit();
        WebElement amt1 =drive.findElement(By.className("nav-line-3"));
        amt1.click();
     
        
	
	}

	
	}


