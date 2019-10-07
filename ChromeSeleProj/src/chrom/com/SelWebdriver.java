package chrom.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelWebdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\ChromeSeleProj\\chromedriver.exe");
		WebDriver drive =new ChromeDriver();
		drive.get("https://www.amazon.com/");
		drive.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		

	}

}
