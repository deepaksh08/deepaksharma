package stepdefination;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks  {
//	
//	 WebDriver driver;
//	 Hooks hook;
//	Base base;
//	
//	public Hooks(Base base) {
//		this.base = base;
//	}
//	
//	 public Hooks(){
//		    driver = new ChromeDriver();;
//		  }
//	 
//	 public WebDriver setDriver() {
//		 
//		 if (driver == null){
//		      driver = new ChromeDriver();
//		      return driver;
//		    }else{
//		      return driver;
//		    }
//			
//	 }
//			
	
//	@BeforeAll
//	public static void beforeAll() {
//		
//		System.out.println("before all method to be executed one time at first place");
//	}
//	
//	@BeforeAll(order=1)
//	public static void beforeAll1() {
//		
//		System.out.println("before all 1 method order = 1 next to before all");
//	}
//	
//	@AfterAll(order=1)
//	public static void afterAll1() {
//		System.out.println("after all1 method order=1 prior to after all");
//	
//	}
//	
//	@AfterAll
//	public static void afterAll() {
//		System.out.println("after all method to be executed one time at end");
//	
//	}
//	
//	@BeforeStep
//	public static void beforeStep() {
//		
//		System.out.println("method is called before each step");
//	}
//	
//	@AfterStep
//	public static void afterStep() {
//		System.out.println("method is called after each step");
//	}
	
//	@Before("@Sanity")
//	public void setUp1() {
//		System.out.println("@before hook is setting up browser- Sanity Specific");
//	}
//		
//	@After("@Sanity")
//	public void teadDown1() {
//		System.out.println("@after hook is closing the browser - Sanity Specific");
//	}
		
//	@Before 
//	public void setUp() {
//		System.out.println("@before hook is setting up browser");
//		hook.setDriver();
//		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				  .withTimeout(Duration.ofSeconds(30))
//				  .pollingEvery(Duration.ofSeconds(5))
//	              .withMessage("Time out as the condition is not met")
//				  .ignoring(NoSuchElementException.class);
//		
	}
		
//	@After
//	public void teadDown() {
//		System.out.println("@afterhook is closing the browser");
//		base.getDriver().quit();
//	}
//}
