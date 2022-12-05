package Step_Definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_searchsteps{
	
	
	WebDriver driver;
	@Given("open browser")
	public void open_browser() {
		
		
		driver= new ChromeDriver();
		
		 System.out.println("Inside given: open browser");
		System.setProperty("WebDriver.chrome.driver" ,"C:\\Users\\mbajp\\OneDrive\\Desktop\\java\\Salenium\\Cucumber_selenium_framework\\drivers\\chromedriver.exe");
		
		 
		 
	}

	@And("user in on google browser page")
	public void user_in_on_google_browser_page() {
		 System.out.println("Inside And: user in on google browser page");


		driver.get("https://www.google.com/");

	}

	@When("user enter textin  search box on google")
	public void user_search_on_google() {
		 System.out.println("Inside when: user enter textin  search box on google");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("www.flipkart.com");

	    	}

	@And("click enter")
	public void click_enter() {
		
		System.out.println("inside And:click enter ");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);

		
	    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    System.out.println("Inside Then: user is navigated to search results");
		driver.close();
	}

}
