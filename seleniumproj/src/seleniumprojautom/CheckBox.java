package seleniumprojautom;

import java.util.List;

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
		String str = drive.getTitle();
		System.out.println(str);
		WebElement radium =drive.findElement(By.className("control-label"));
		//CHECKBOX ELEMENTS
		List<WebElement> checkbox = drive.findElements(By.tagName("label"));
		//System.out.println(checkbox);
		//checkbox.get(0).click();
		WebElement check1 =drive.findElement(By.id("profession-0"));
		check1.click();

	}

}
