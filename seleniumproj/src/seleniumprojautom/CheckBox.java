package seleniumprojautom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		WebDriver drive= new ChromeDriver();
		drive.get("https://www.toolsqa.com/automation-practice-form/");
		 drive.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String str = drive.getTitle();
		System.out.println(str);
		drive.manage().deleteAllCookies();
		System.out.println("step 1");
		WebElement scroll = drive.findElement(By.xpath("/html"));
		scroll.getLocation();
		System.out.println("step 2");
		WebElement firnam =drive.findElement(By.name("firstname"));
		firnam.sendKeys("Josh");
		WebElement lastnam = drive.findElement(By.name("lastname"));
		lastnam.sendKeys("lilly");
		WebElement radium =drive.findElement(By.className("control-label"));
		radium.click();
		//CHECKBOX ELEMENTS
		List<WebElement> checkbox = drive.findElements(By.tagName("label"));
		System.out.println(checkbox);
		checkbox.get(0).click();
		System.out.println("step 3");
		WebElement check1 =drive.findElement(By.id("profession-0"));
		check1.click();
		System.out.println("step 4");

	}

}
