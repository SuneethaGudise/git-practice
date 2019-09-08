package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitionFeature {
	static String URL="https://www.facebook.com/";
	WebDriver driver;
	
	
	@Given("^Open the Browser$")
	   public void open_the_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ravi\\eclipse-workspace\\Facebook_cucumber\\chromedriver.exe" );
		driver=new ChromeDriver();
	   
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
	  //  throw new PendingException();
	}
	@Then("^User enters email and password$")
	public void User_enters_email_and_password() throws Throwable {
	   
	   driver.findElement(By.id("email")).sendKeys("sunitha.gudise@gmail.com");
	   driver.findElement(By.id("pass")).sendKeys("kutty136");
	}
 	@And("^User has to click the login button$")
	public void User_has_to_click_the_login_button() throws Throwable {
		
			//driver.findElement(By.cssSelector("#u_0_a")).click();
 	   driver.findElement(By.id("loginbutton")).click();

			
		// same as above but differrent way to click the login button
		//WebElement login = driver.findElement(By.id("u_0_2"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].click();",login);
 	}
		
	
		
// 	@Given("^Search for the option$")
// 	public void Search_for_the_option() throws Throwable {
// 		//WebElement search =driver.findElement(By.name("q"))	;	
//		//search.sendKeys("keto");
// 		driver.findElement(By.id("js_62")).sendKeys("keto");
// 	}
//
// 	@When("^Move the mouse on searchbutton$")
// 	public void Move_the_mouse_on_searchbutton() throws Throwable {
// 		WebElement searchbutton =driver.findElement(By.xpath("//*[@id=\"js_5b\"]/form/button/i"));
//		Actions movemouseon = new Actions(driver);
//		movemouseon.moveToElement(searchbutton).click().build().perform();
//		  
// 	}
 	}
