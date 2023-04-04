package stepdefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps   {

//	WebDriver driver;
//	Base base;
//	public LoginSteps(Base base) {
//		this.base = base;
//	}
//	
//	Hooks hook = new Hooks();
//	WebDriver driver = hook.setDriver();
	
	@Given("user navigates to the website")
	public void user_navigates_to_the_website() {
		System.out.println("@Given--user navigates to the website");
//		driver.get("https://www.bedbathandbeyond.com/store/cart");
	}

	@When("user validates the home page")
	public void user_validates_the_home_page() {
		System.out.println("user validated home page");
	}

	@Then("user enters {string} username")
	public void user_enters_username(String username) {
		System.out.println("@Then--user enters "+username+" username");
	}

	@And("user enters {string} password")
	public void user_enters_pasword(String password) {
		System.out.println("@And---user enters "+password+" pasword");

	}

	@And("user click on sign in button")
	public void user_click_on_sign_in_button() {

		System.out.println("@And--user click on sign in button");
	}

}
