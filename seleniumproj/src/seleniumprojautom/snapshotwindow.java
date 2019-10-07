package seleniumprojautom;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class snapshotwindow {

	public static void main(String[] args ) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        dr.get("https://www.walmart.com/");
       // WebElement 	elem =  dr.findElement(By.id("loginButton"));
       // elem.click();
        		//(webdriver.chrome.driver",C:/Users/ravi/Downloads/chromedriver_win32);
        WebElement el =dr.findElement(By.xpath("//*[@id=\"global-search-input\"]"));
        
        el.sendKeys("Laptops");
        
        //WebElement el1= dr.findElement(By.linkText("DEMOS"));
        el.click();
        File scr=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
        FileUtils.getFile(scr,"C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
        System.out.println("Take screen");
        
        

	}

	}


