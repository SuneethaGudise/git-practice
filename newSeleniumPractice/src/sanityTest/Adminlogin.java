package sanityTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Adminlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\newSeleniumPractice\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement el= driver.findElement(By.id("twotabsearchtextbox"));
		//el.sendKeys("laptops");
		//WebElement txt= driver.findElement(By.xpath("//*[@id="twotabsearchtextbox"]"));
		WebElement el1 = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]"));
		el1.click();
		//txt.sendKeys("laptops");
		el.click();
		
		
        
	}

}
