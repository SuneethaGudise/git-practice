package seleniumprojautom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webDriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		WebDriver drive =new ChromeDriver();
		drive.get("https://www.google.com/");
		//TO GET THE TITLE OF THE PAGE
		String str=drive.getTitle();
		System.out.println(str);
		String url =drive.getCurrentUrl();
		System.out.println(url);
		//NAVIGATE TO ANOTHER BROWSER
		drive.navigate().to("https://www.amazon.com/");
		url =drive.getCurrentUrl();
		System.out.println(url);
		//NAVIGATE BACK TO GOOGLE
		drive.navigate().back();
		url=drive.getCurrentUrl();
		System.out.println(url);
		//NAVIGATE FORWARD TO AMAZON
		drive.navigate().forward();
		url=drive.getCurrentUrl();
		System.out.println(url);
		//REFRESHING THE BROWSER
		drive.navigate().refresh();
		url=drive.getCurrentUrl();
		System.out.println("REFRESHED");
		
	}

}
