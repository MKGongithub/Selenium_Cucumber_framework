package Step_Definations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

	@Given("open loging page")
	public void open_loging_page() {
		System.out.println("Inside given : open loging page");
	}

	@When("Enter valid username")
	public void enter_valid_username() {
		System.out.println("Inside when :Enter valid username");

	}

	@And("Enter valid password")
	public void enter_valid_password() {
		System.out.println("Inside And :Enter valid password");

	}

	@Then("Login successfully navigated to page opened")
	public void login_successfully_new_page_opened() {
		System.out.println("Inside when :Login successfully new page opened");

	}
}
