

package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class AppiumAutoON {
	
	//adb shell
	//dumpsys window windows | grep -E 'mCurrentFocus|mFocusedApp|mInputMethodTarget|mSurface'
	//this command is used to get activity details of any app opened in mobile device
	//dumpsys window windows | grep -E 'mSurface'
	
public static AndroidDriver driver;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AppiumServiceBuilder builder = new AppiumServiceBuilder();
		File nodejsfile = new File("C:\\Program Files (x86)\\nodejs\\node.exe");
		File appiumfile = new File("C:\\Users\\lenovo\\AppData\\Local\\Programs\\Appium Server GUI\\resources\\app\\node_modules\\appium\\build\\lib\\main.js");
		File logfile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\logs\\log.txt"); 
		
		AppiumDriverLocalService service = AppiumDriverLocalService
				.buildService(builder.usingDriverExecutable(nodejsfile)
									.withAppiumJS(appiumfile)
									.withLogFile(logfile)
									.withArgument(GeneralServerFlag.LOCAL_TIMEZONE));


		service.start();
				
	
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.flipkart.android");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activity.HomeFragmentHolderActivity");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(10000);
		
		driver.quit();
		
		service.stop();
		
	}

}
