package seleniumprojautom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chromeauto {
	public static void wait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	public static void main(String[] args) { //throws InterruptedException {
		
		System.out.println("Starting now...");
		//TODO Auto-generated method stub
		//TO OPEN THE TOOLQA BROWSER
		System.setProperty("WebDriver.chrome.driver",
				"C:\\Users\\ravi\\eclipse-workspace\\seleniumproj\\chromedriver.exe");
		System.out.println("Starting now..444.");
		WebDriver dr = new ChromeDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
		dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//TO CLICK THE HOME ELEMENT
		WebElement el= dr.findElement(By.className("menu-text"));
//		el.click();
		//dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

          wait(1);
		//TO MOVE THE MOUSE AND SELECT TUTORIAL ELEMENT
		WebElement el1 = dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/a/span/span"));
		Actions build = new Actions(dr);
		build.moveToElement(el1).perform();
		wait(2);
		//TO MOVE THE MOUSE ON SOFTWARE TESTING TUTORIAL ELEMENT IN TUTORIAL
	 /* WebElement el2 = dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[1]/a/span/span"));
		Actions build1 = new Actions(dr);
		build1.moveToElement(el2).perform();
		el2.click();
		wait(3);
		//TO SELECT MAVEN ELEMENT IN TUTORIAL
		WebElement el3=dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[9]/a"));
		Actions build2 =new Actions(dr);
		build2.moveToElement(el3).perform();
		el3.click();
         wait(3);*/
		//TO CLICK WEB AUTOMATION TOOL IN TUTORIAL AND SELECT SELENIUM IN JAVA
		WebElement wat =dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[2]/ul/li[4]/a/span/span"));
		System.out.println(wat.getText());
		Actions wat1=new Actions(dr);
		wat1.moveToElement(wat).perform();
		wat.click();
		WebElement sij =dr.findElement(By.linkText("Selenium in Java"));
		System.out.println(sij.getText());
		Actions sij3=new Actions(dr);
		sij3.moveToElement(sij).perform();
		wait(2);           
		sij.click();
		wait(3);
		//TO MOVE THE MOUSE ON TOOLS AND ON BDD FRAMEWORK AND SELECT SPECFLOW TOOLS
		WebElement tools = dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/a/span/span"));
		Actions tool =new Actions(dr);
		tool.moveToElement(tools).perform();
		WebElement bdd =dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/ul/li[3]/a/span/span"));
		System.out.println("BDD FRAMEWORKS");
		Actions bddf =new Actions(dr);
		bddf.moveToElement(bdd);
	    wait(2);
		bdd.click();
		wait(5);
		//NOW TO SELECT SPECFLOW TUTORIALS
		WebElement sft =dr.findElement(By.xpath("//*[@id=\"primary-menu\"]/li[3]/ul/li[3]/ul/li/a/span/span"));
		Actions sftb =new Actions(dr);
		sftb.moveToElement(sft);
		
		sft.click();
		wait(2);
		
		dr.close();
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(el1.getText());
		
	
		
}
}
