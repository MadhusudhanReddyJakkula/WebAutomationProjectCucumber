package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	WebDriver driver= null;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Inside Step - user is on home page");
	    String projectPath=System.getProperty("user.dir");
	    
	    System.out.println("Projectpath is "+projectPath);
	    
	    
	    System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
	    
	}

	@When("user search for restaurants in {string}")
	public void user_search_for_restaurants_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user search for restaurants in {string}");
	}

	
	@And("click on find restaurants in your area")
	public void click_on_find_restaurants_in_your_area() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - click on find restaurants in your area");
	}

	@Then("user should see some restaurants in {string}")
	public void user_should_see_some_restaurants_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Inside Step - user should see some restaurants in {string}");
	}

}
