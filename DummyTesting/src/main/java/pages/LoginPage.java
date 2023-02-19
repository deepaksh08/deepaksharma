package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;

	private By textinputemailid = By.id("signin-email");
	private By buttonloginemailsubmit = By.id("signin-email-submit");
	private By headingloginpageform = By.xpath("//*[contains(text(),'sign in or create')]");
	private By buttonapplelogin = By.id("appleid-signin-btn");
	private By buttongooglelogin = By.id("google-signin-btn");
	private By buttonfacebooklogin = By.id("facebook-signin-btn");
	private By linkSignIn = By.id("profileWrapper");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isLoginSectionHeadingPresent() {
		return driver.findElement(headingloginpageform).isDisplayed();
	}

	public boolean isAppleLoginButtonPresent() {
		return driver.findElement(buttonapplelogin).isDisplayed();
	}

	public boolean isGoogleLoginButtonPresent() {
		return driver.findElement(buttongooglelogin).isDisplayed();
	}

	public boolean isFacebookLoginButtonPresent() {
		return driver.findElement(buttonfacebooklogin).isDisplayed();
	}

	public void enterEmailID(String emailid) {
		driver.findElement(textinputemailid).sendKeys(emailid);
	}

	public void hitsubmitEmailId() {
		driver.findElement(buttonloginemailsubmit).click();
	}
	public void hitSignInOption() {
		driver.findElement(linkSignIn).click();
	}
}
