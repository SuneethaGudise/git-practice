package seleniumprojautom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytestautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
		// WebElement elm =dr.findElement(By.linkText("Link Test"));
		// elm.click();
		// WebElement txt =
		// dr.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
		// txt.sendKeys("Suneetha");
		System.out.println(dr.getTitle());
		// dr.manage().window().maximize();//to maximize the window
		// dr.close();//to close the current window
		// dr.quit();// to quit all the windows currently open
		List<WebElement> el = dr.findElements(By.name("sex"));
		// WebElement el1 = dr.findElement(By.("sex-0"));
		// el1.click();
		el.get(1).click();
		if (el.get(0).isSelected()) {
			
			// el.get(1).click();
			WebElement txt = dr.findElement(
					By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
			txt.sendKeys("Varun");
			System.out.println("Male");
		} else {
			// el.get(1).click();
			System.out.println("Female");
			WebElement txt = dr.findElement(
					By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[8]/input"));
			txt.sendKeys("Vennela");
			WebElement e = dr
					.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/p[6]"));
			e.click();
			WebElement txt1 = dr.findElement(By.id("datepicker"));
			txt1.sendKeys("10-18-2018");
		}

	}
}