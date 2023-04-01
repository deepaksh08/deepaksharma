
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePAGEFACTORY {

	private WebDriver driver;

//	private By textinputemailid = By.id("signin-email");
//	private By buttonloginemailsubmit = By.id("signin-email-submit");
//	private By headingloginpageform = By.xpath("//*[contains(text(),'sign in or create')]");
//	private By buttonapplelogin = By.id("appleid-signin-btn");	
//	private By buttongooglelogin = By.id("google-signin-btn");
//	private By buttonfacebooklogin = By.id("facebook-signin-btn");
//	private By linkSignIn = By.id("profileWrapper");

	
	@FindBy(id="signin-email") WebElement textinputemailid;
	@FindBy(id="signin-email-submit") WebElement buttonloginemailsubmit;
	@FindBy(xpath="//*[contains(text(),'sign in or create')]") WebElement headingloginpageform;
	@FindBy(id="appleid-signin-btn") WebElement buttonapplelogin;
	@FindBy(id="google-signin-btn") WebElement buttongooglelogin;
	@FindBy(id="facebook-signin-btn") WebElement buttonfacebooklogin;
	@FindBy(id="profileWrapper") WebElement linkSignIn;
	
	
	
	public LoginPagePAGEFACTORY(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean isLoginSectionHeadingPresent() {
//		return driver.findElement(headingloginpageform).isDisplayed();
		return headingloginpageform.isDisplayed();
	}

	public boolean isAppleLoginButtonPresent() {
//		return driver.findElement(buttonapplelogin).isDisplayed();
		return buttonapplelogin.isDisplayed();
	}

	public boolean isGoogleLoginButtonPresent() {
//		return driver.findElement(buttongooglelogin).isDisplayed();
		return buttongooglelogin.isDisplayed();
	}

	public boolean isFacebookLoginButtonPresent() {
//		return driver.findElement(buttonfacebooklogin).isDisplayed();
		return buttonfacebooklogin.isDisplayed();
	}

	public void enterEmailID(String emailid) {
//		driver.findElement(textinputemailid).sendKeys(emailid);
		textinputemailid.sendKeys(emailid);
	}

	public void hitsubmitEmailId() {
//		driver.findElement(buttonloginemailsubmit).click();
		buttonloginemailsubmit.click();
	}
	public void hitSignInOption() {
//		driver.findElement(linkSignIn).click();
		linkSignIn.click();
	}
}
