package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice1 {

	public void read(String FileLocation) throws Throwable {

		File file = new File(FileLocation);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(inputstream);
		Sheet sheet = book.getSheetAt(0);
		int count = sheet.getLastRowNum();

		for (int i = 0; i < count + 1; i++) {
			for (int j = 0; j < sheet.getRow(i).getLastCellNum(); j++) {
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + " | ");
			}
			System.out.println();
		}

	}

	public void write(String FileLocation, String Data[]) throws Throwable {
		File file = new File(FileLocation);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(inputstream);
		Sheet sheet = book.getSheetAt(0);
		int count = sheet.getLastRowNum();
		Row newrow = sheet.createRow(count + 1);
		
		for (int i = 0; i <Data.length;i++) {
			newrow.createCell(i).setCellValue(Data[i]);
		}
		
		inputstream.close();
		
		FileOutputStream outputstream = new FileOutputStream(file);
		book.write(outputstream);
		outputstream.close();
		

	}

	public static void main(String[] args) throws Throwable {

		String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\TestExcel.xlsx";
		String Data[] = {"First","Second","Third"};

		// System.out.println("File Location is " + filelocation);

		Practice1 Obj = new Practice1();
		Obj.write(filelocation, Data);
		Obj.read(filelocation);

	}
}
