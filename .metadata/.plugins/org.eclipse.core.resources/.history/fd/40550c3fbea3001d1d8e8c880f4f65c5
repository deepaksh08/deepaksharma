package stepsdefination;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Base {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver() {
		
		driver = new ChromeDriver();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  .withTimeout(Duration.ofSeconds(30))
				  .pollingEvery(Duration.ofSeconds(5))
	              .withMessage("Time out as the condition is not met")
				  .ignoring(NoSuchElementException.class);
		
		
	

		driver.manage().window().maximize();
	}
}









