package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyRead {

	public void read(String filelocation) throws Throwable {

		File file = new File(filelocation);
		FileInputStream inputstream = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(inputstream);

		FileOutputStream outout = new FileOutputStream(file);

		prop.setProperty("Baba", "Khatu");
		prop.setProperty("Fav", "Shyam");
		prop.store(outout, filelocation);

	}

	public static void main(String[] args) throws Throwable {

		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\propertyfile.properties";
		PropertyRead Obj = new PropertyRead();
		Obj.read(filelocation);
		System.out.println(filelocation);

	}
}
