package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader1 {
	
	
	public void read(String filelocation) throws Throwable {
		
		
		File file = new File(filelocation);
		FileInputStream fileinput = new FileInputStream(file);
		
		Workbook book = new XSSFWorkbook(fileinput);
		Sheet sheet = book.getSheetAt(0);
		
		for (int i = 0 ; i<sheet.getLastRowNum()+1;i++) {
			
			for (int j = 0; j < sheet.getRow(i).getLastCellNum();j++) {
				
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "  |  ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws Throwable {
		
		String fileLocation = System.getProperty("user.dir") + "\\src\\test\\resources\\TestExcel.xlsx" ;
//		String sheetname = "Sheet1";
		
		ExcelReader1 obj = new ExcelReader1();
		obj.read(fileLocation);
		
		
		
	}
}



