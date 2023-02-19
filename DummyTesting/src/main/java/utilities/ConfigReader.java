package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigReader {

	public static Map<String, String> Config = new HashMap<String, String>();
	public static Properties propMain = new Properties();

	public static Map<String, String> configRead() {

		String environment = System.getProperty("env");

		try {
			if (environment.equalsIgnoreCase("dev")) {
				
				File file = new File(System.getProperty("user.dir") + "/src/test/resources/config/dev.properties");

				FileInputStream inputstream = new FileInputStream(file);
				propMain.load(inputstream);
				
				Config.put("browser", propMain.getProperty("browser"));
				Config.put("siteurl", propMain.getProperty("siteurl"));
				Config.put("apiurl", propMain.getProperty("apiurl"));

			} else if (environment.equalsIgnoreCase("prod")) {
				FileInputStream fisQA = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/config/prod.properties");
				propMain.load(fisQA);
				Config.put("browser", propMain.getProperty("browser"));
				Config.put("siteurl", propMain.getProperty("siteurl"));
				Config.put("apiurl", propMain.getProperty("apiurl"));

			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return Config;

	}

	public static Map<String, String> getConfig() {
		if (Config == null) {
			Config = configRead();
		}

		return Config;

	}

	// this block needs to be removed one above one starts working
//	private Properties prop;

//	public Properties init_prop() {
//
//		prop = new Properties();
//		try {
//			FileInputStream ip = new FileInputStream("./src/test/resources/config/Config.properties");
//			prop.load(ip);
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		return prop;
//
//	}
//	

	
	

}
