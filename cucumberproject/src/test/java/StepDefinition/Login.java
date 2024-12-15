package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public  WebDriver driver;

	@Given("user is in login page")
	public void user_is_in_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com");
	   
	}

	@When("user enters valid usn, psw")
	public void user_enters_valid_usn_psw() {
		
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.id("pass")).sendKeys("admin@123");
	   
	}

	@When("click on login button")
	public void click_on_login_button() {
	    
		driver.findElement(By.name("login")).click();
	}

	@Then("home page should be dsiplayed")
	public void home_page_should_be_dsiplayed() {
	 System.out.println(driver.getTitle());
	}

	@Then("if user clicks on logout button login page should be displayed")
	public void if_user_clicks_on_logout_button_login_page_should_be_displayed() {
	  driver.quit();

}
	}
