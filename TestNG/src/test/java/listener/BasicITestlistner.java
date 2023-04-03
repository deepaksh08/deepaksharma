package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class BasicITestlistner implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("TEST STARTED here..................." + result.getName() + result.getTestClass());

	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("TEST PASS here....................." + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		System.out.println("TEST FAILURE here.................."  + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("TEST SKIPPED here........................" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {
		System.out.println("...................START ONSTARTLISTNER............."  + context.getName());

	}

	public void onFinish(ITestContext context) {
		System.out.println(".............FINISH ONFINISHLISTENER.................." + context.getName());

	}

}
