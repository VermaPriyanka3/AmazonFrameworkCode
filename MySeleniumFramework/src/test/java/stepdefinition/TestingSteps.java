package stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.utilities.LaunchBrowser;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;


public class TestingSteps {
	
    static WebDriver driver; 
	@Given("^User is on Homepage$")
	public void user_is_on_Homepage() throws Throwable {
	driver=LaunchBrowser.startApplication(driver, "Chrome" , "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&\\");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
		driver.findElement(By.xpath(".//input[@type='email']")).sendKeys("priya.verma038@gmail.com");
		driver.findElement(By.xpath(".//input[@id='continue']")).click();
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("pr1pr2@iya");
		driver.findElement(By.xpath(".//input[@id='signInSubmit']")).click();
		//WebElement username ; 
		
	}

	/*
	 * @Then("^User can visit the home page$") public void
	 * user_can_visit_the_home_page() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @When("^User Logout from the application$") public void
	 * user_Logout_from_the_application() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 * 
	 * @Then("^User cannot visit the home page$") public void
	 * user_cannot_visit_the_home_page() throws Throwable { // Write code here that
	 * turns the phrase above into concrete actions throw new PendingException(); }
	 */
	}


