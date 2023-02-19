package ExcelPrograms;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public void readFromFile(String filepath, String filename, String sheetname) throws Throwable {

		
		// CREATED USING APACHE POI 5.0.0 and APACHE POI OOXML 5.0.0 
		// Creating an object of fileclass with full path of the file including name
		File file = new File(filepath + "\\" + filename);

		// Create an object of FileInputStream class to read excel file and pass above
		// file to the input stream
		 
		FileInputStream fileinputstream = new FileInputStream(file);		
		Workbook workbook = new XSSFWorkbook(fileinputstream);						
		
		
		Sheet sheet = workbook.getSheet(sheetname);
		
		
		
//		System.out.println(sheet.getLastRowNum() + "is the last row num after reading");
//		System.out.println(sheet.getRow(1).getLastCellNum() + "is the last cell of row 1");
		
		for (int i = 0;i<sheet.getLastRowNum()+1; i ++) {
			
			for(int j = 0; j<sheet.getRow(i).getLastCellNum();j++) {
				
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() + "  |  ");
						
			}
			
			System.out.println();
			
		}
				
				
		
		
	}
	
	public static void main(String[] args) throws Throwable {
		ExcelReader reader = new ExcelReader();
		String fileLocation = System.getProperty("user.dir")+"\\src\\test\\resources";
		
		reader.readFromFile(fileLocation, "TestExcel.xlsx", "Sheet1");

	
	// user.dir	C:\D Drive\Automation\JavaInterviewPrograms
		
	}

}
