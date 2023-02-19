package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingIntoExcel {

	
	public void write(String fileLocation,String[] data) throws Throwable {
		
		File file = new File(fileLocation);
		FileInputStream inputstream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(inputstream);
		Sheet sheet = workbook.getSheetAt(0);
		
		int rowcount = sheet.getLastRowNum();
		
		Row newrow = sheet.createRow(rowcount+1);
		
		
		int l = data.length;
		
		for (int i = 0 ;i<l;i++) {
			
			newrow.createCell(i).setCellValue(data[i]);
			
		}
		inputstream.close();
		
		FileOutputStream outputstream = new FileOutputStream(file);
		workbook.write(outputstream);
		outputstream.close();
		System.out.println("FileSuccessfully Updated");
		
	}
	
	
	
	public static void main(String[] args) throws Throwable {
		
		String[] data = {"Location","Shalimar"};		
		String fileLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\TestExcel.xlsx" ;
		WritingIntoExcel obj = new WritingIntoExcel();
		obj.write(fileLocation, data);
		System.out.println(data.length);
		
			
	}
	
}
