package seleniumprojautom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindElement {
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tools Automation Form");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
	WebDriver drive = new ChromeDriver();
	drive.get("https://www.toolsqa.com/automation-practice-form/");
	drive.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 //	TO CLICK ON PARTIAL LINK TEST
/*	WebElement plt = drive.findElement(By.partialLinkText("Partial"));
	drive.manage().window().maximize();
	System.out.println("Partial Link Test" + plt.getText());
	plt.click();
	wait(2);
	//TO MOVE THE MOUSE ON LINKTEST AND CLICK
	WebElement lt =drive.findElement(By.linkText("Link Test"));
	Actions alt =new Actions(drive);
	alt.moveToElement(lt).perform();
	lt.click();
	wait(2);
	//TO CHECK IF THE AUTOMATION FOR OPENING THE LINKTEXT PAGE CORRECT OR NOT
	WebElement h1 =drive.findElement(By.xpath("//*[@id=\"page\"]/div[4]/div/div[1]/h1"));
	String hText = h1.getText();
	String hText2 ="Automation Practice Table";
	System.out.println(hText);
	if (hText.equals(hText2))
		System.out.println("Automation Practice Table Loaded succesfully");
	else
		System.out.println("Automation Practice Table Loaded Failed");
	wait(2);
	/*WebElement fn=drive.findElement(By.cssSelector("First name"));
	System.out.println("first Name");*/
	//TO ENTER THE NAME IN THE TEXT BOX

	List<WebElement> gen =drive.findElements(By.name("sex"));
	gen.get(0).click();
	if(gen.get(0).isSelected()) {
	WebElement ftb = drive.findElement(By.name("firstname"));
	
	ftb.sendKeys("Varun");
	
	System.out.println("Varun");
	wait(2);

	//ftb.clear();

	WebElement ltb = drive.findElement(By.name("lastname"));
	ltb.sendKeys("Gudise");
	wait(2);
	
	WebElement sex =  drive.findElement(By.id("sex-0"));
	sex.click();
	wait(2);
	//sex.isEnabled();
	}
	else {
	 WebElement ftb1 =drive.findElement(By.name("firstname"));
	 ftb1.sendKeys("Vennela");
	 System.out.println("Vennela");
	 wait(2);
	 WebElement ltb1 =drive.findElement(By.name("lastname"));
	 ltb1.sendKeys("Gudise");
	 wait(2);
	 WebElement sex1 =drive.findElement(By.id("sex-1"));
	 sex1.click();
	 wait(2);
	 
	}
	
	WebElement sex1 =drive.findElement(By.id("sex-1"));
	sex1.click();
	wait(2);
	
	drive.close();
	

	}

}
