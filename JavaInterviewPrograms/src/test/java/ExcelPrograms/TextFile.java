package ExcelPrograms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class TextFile {

	public void read(String filelocation) throws Throwable {

		File file = new File(filelocation);
		FileReader filereader = new FileReader(file);
		BufferedReader reader = new BufferedReader(filereader);

		String line = null;

		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

	public void write(String filelocation) throws Throwable {
		File file = new File(filelocation);
		FileWriter filewriter = new FileWriter(file,true);
		BufferedWriter writer =  new BufferedWriter(filewriter);
		writer.newLine();
		writer.write("This is First Line");
		writer.newLine();
		writer.write("This is Second Line");
		writer.newLine();
		writer.write("This is last line");
		writer.close();
			
	}

	public static void main(String[] args) throws Throwable {
		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\demotextfile.txt";

		TextFile Obj = new TextFile();
		Obj.write(filelocation);
		Obj.read(filelocation);

	}
}
