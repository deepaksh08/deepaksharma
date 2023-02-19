package stepsdefination;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on home page")
	public void user_is_on_home_page() {
		DriverFactory.getDriver().get("https://www.bedbathandbeyond.com/store/cart");
	}

	@When("user hits login option on home page")
	public void user_hits_login_option_on_home_page() {
		loginPage.hitSignInOption();

	}

	@Then("User Valdiate heading")
	public void  User_Valdiate_heading () {
		Assert.assertTrue(loginPage.isLoginSectionHeadingPresent());

	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		String loginTitle = loginPage.getLoginPageTitle();
		System.out.println("Login page title is "+loginTitle);
		Assert.assertTrue(loginTitle.contains(expectedTitleName));
		
	}

	@Then("User validate third party login options")
	public void user_validate_third_party_login_options() {
		loginPage.isAppleLoginButtonPresent();
		loginPage.isFacebookLoginButtonPresent();
		loginPage.isGoogleLoginButtonPresent();

	}

	@Then("User enters email id {string}")
	public void user_enters_email_id(String email) {
		loginPage.enterEmailID(email);

	}

	@Then("User submit the email")
	public void user_submit_the_email() {
		loginPage.hitsubmitEmailId();

	}
	

}