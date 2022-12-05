package Step_Definations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooksdemosteps {
	
	WebDriver driver;
	
	@Before(order = 1)
	public void setup() {
		driver = new ChromeDriver();
		
		System.out.println("i am inside setup1");
		System.out.println("Browser is open");
		System.setProperty("Webdriver.charome.driver",
				"C:\\Users\\mbajp\\OneDrive\\Desktop\\java\\Salenium\\Cucumber_selenium_framework\\drivers\\chromedriver.exe");
		driver.manage().window().maximize();
		
		
	}

	@Before(order = 0)
	public void setuo2() {
		
		System.out.println("i ma insidde setup2");
	}
	
	
	@After(order = 2)
	public void teardown() {
		driver.close();
		
		
	}
	
	@After(order=1)
	public void teardown1() {
		driver.close();
		
		
	}
	
	@Given("first open browser")
	public void first_open_browser() {
	   
	}

	@When("search login page")
	public void search_login_page() {
	   
	}

	@And("Enter username nad password")
	public void enter_username_nad_password() {
	    
	}

	@Then("page navigate to homepage")
	public void page_navigate_to_homepage() {
	    
	}
}




//browser will launch once only and all test cases executed one by one
