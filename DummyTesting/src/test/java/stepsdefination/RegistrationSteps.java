package stepsdefination;

import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class RegistrationSteps {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	

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
	
	
}