package seleniumprojautom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.name("firstname"));
		driver.findElement(By.name("lastname"));
		driver.findElement(By.id("buttonwithclass")).click();;
		

	}
	/*public static void flash(WebElement element,WebDriver driver){
		JavascriptExecutor js =((JavascriptExecutor)driver);
		for(int i=0;i<100;i++){
		changeColor("rgb(0,200,0)",element.driver);
		changeColor(bgcolor,element.driver);
		}
		}
		public static void changeColor(String color,WebElement element,WebDriver driver){
			 JavascriptExecutor js = (JavascriptExecutor)driver;	
		js.executeScript("arguments[0].style.backgroundColor= ' "+color+"'", element);
		try{
		Thread.sleep(20);
		}
		catch(InterrupedException e){
		}
		}
		//TO DRAW A BORDER AROUND THE ELEMENT
		public static void drawBorder(WebElement element,WebDriver driver){
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px  solid red' ",element);
		}
*/
}
