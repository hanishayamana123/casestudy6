package Ddc2_mystepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class casestudy_01 {
	WebDriver driver;
	@Given("User launching the test me application in chrome")
	public void user_launching_the_test_me_application_in_chrome() {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver_win32\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("User clicks on Signup link")
	public void user_clicks_on_Signup_link() {
		driver.findElement(By.xpath("//a[contains(text(),'SignUp')]")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters username {string}")
	public void user_enters_username(String string) {
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("User enters firstname {string}")
	public void user_enters_firstname(String string) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters lastname {string}")
	public void user_enters_lastname(String string) {
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters password {string}")
	public void user_enters_password(String string) {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("User enters confirm password {string}")
	public void user_enters_confirm_password(String string) {
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("User selects gender")
	public void user_selects_gender() {
		driver.findElement(By.xpath("//input[@value='Female']"));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	@When("User enters email {string}")
	public void user_enters_email(String string) {
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("xyz@gmail.com");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	

	@When("User enters mobile number {string}")
	public void user_enters_mobile_number(String string) {
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@When("User enters dob {string}")
	public void user_enters_dob(String string) {
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	@When("User enters address {string}")
	public void user_enters_address(String string) throws InterruptedException {
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys(string);
		Thread.sleep(5000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}
	

	@Then("User clicks on register link")
	public void user_clicks_on_register_link()  {
		
		driver.findElement(By.xpath("//input[@value='Register']")).click();;
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}


}
