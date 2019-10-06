package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionFeature {
	static String URL="https://www.facebook.com/";
	public static WebDriver driver;
	
	
	@Given("^Open the Browser$")
	   public void open_the_Browser() throws Throwable {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\chromedriver.exe" );
		driver=new ChromeDriver(options);
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	@Then("^Open the Facebook page$")
	   public void open_the_Facebook_page() throws Throwable {
		driver.navigate().to(URL);
	  
	}
	@When("^User wants to login into Facebook$")
	public void User_wants_to_login_into_Facebook() throws Throwable {
		String title =driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals("Facebook - Log In or Sign Up",title);
	  
	}

@Then("^User enters email and password$")
public void user_enters_email_and_password() throws Throwable {
	driver.findElement(By.id("email")).sendKeys("sunitha.gudise@gmail.com");
   driver.findElement(By.id("pass")).sendKeys( "kutty136");

}
    
//	@Then("^User enters  the \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_the_and(String email, String password) throws Throwable {
//	   System.out.println(email +"and " + password);
//	   driver.findElement(By.id("email")).sendKeys(email);
//	   driver.findElement(By.id("pass")).sendKeys(password);
//	}
 	@And("^User has to click the login button$")
	public void User_has_to_click_the_login_button() throws Throwable {
	System.out.println(driver.findElement(By.id("email")).getText());
		System.out.println(driver.findElement(By.id("pass")).getText());
			//driver.findElement(By.cssSelector("#u_0_a")).click();
 	   driver.findElement(By.id("loginbutton")).click();

			
		// same as above but differrent way to click the login button
		//WebElement login = driver.findElement(By.id("u_0_2"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",login);
 	}
		
	
		
	@Given("^Search for the option$")
 	public void Search_for_the_option() throws Throwable {
 		WebElement search =driver.findElement(By.name("q"))	;	
		search.sendKeys("keto");
		System.out.println("step1");
//		WebElement search = driver.findElement(By.name("q"));
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].sendkeys();",search);
		
 		//driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div[2]/div/form/div/div/div/div")).sendKeys("keto");
		System.out.println("step2");
 	}
	

 	@When("^Move the mouse on searchbutton$")
 	public void Move_the_mouse_on_searchbutton() throws Throwable {
 		WebElement searchbutton =driver.findElement(By.xpath("//*[@id=\"js_2b\"]/form/button/i"));
		Actions movemouseon = new Actions(driver);
		movemouseon.moveToElement(searchbutton).click().build().perform();
		  
 	}

@Then("^Close the browser$")
public void close_the_browser() throws Throwable {
driver.quit();
}
 	}
