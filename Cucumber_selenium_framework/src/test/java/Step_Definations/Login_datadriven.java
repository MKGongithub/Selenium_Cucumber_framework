package Step_Definations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_datadriven {

	WebDriver driver;

	@Given("first open chrome browser")
	public void open_chrome_browser() {

		driver = new ChromeDriver();
		System.out.println("Browser is open");
		System.setProperty("Webdriver.charome.driver",
				"C:\\Users\\mbajp\\OneDrive\\Desktop\\java\\Salenium\\Cucumber_selenium_framework\\drivers\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@When("user is on  Login page")
	public void user_is_on_login_page() {

		System.out.println("user is on login page");
		driver.get("https://magnus.jalatechnologies.com/");

	}

	@And("^user Enter (.*) and (.*)$")
	public void user_enter_username_and_password(String username, String password) {
		System.out.println("user Enter username and pass");
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
	}

	@And("Click on sign in button")
	public void click_on_sign_in_button() {
		System.out.println("Click on sign in button");
		driver.findElement(By.xpath("//button[@id='btnLogin']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		
		System.out.println("user is navigated to home page");
		System.out.println("Login successfully");
		driver.close();
	}
}
