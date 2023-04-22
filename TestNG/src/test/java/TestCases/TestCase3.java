package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class ");
	}
	@Test
	public void testing1() {
		System.out.println("test1");
	}

	@Test
	public void testing2() {
		System.out.println("test2");
	}
	@Test
	public void testing3() {
		
		System.out.println("test3");
	}
}
