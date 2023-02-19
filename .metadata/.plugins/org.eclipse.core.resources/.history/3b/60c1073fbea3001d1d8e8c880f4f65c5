package stepsdefination;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks  {
	
	WebDriver driver;
	Base base;
	
	public Hooks(Base base) {
		this.base = base;
	}
	
	
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
		
	@Before
	public void setUp() {
		System.out.println("@before hook is setting up browser");
		base.setDriver();
	}
		
	@After
	public void teadDown() {
		System.out.println("@afterhook is closing the browser");
//		base.getDriver().quit();
	}
}
