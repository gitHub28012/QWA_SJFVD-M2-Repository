package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataFromExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create the object of fileInputStream clas
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");
		
		//Open the workbook in readable mode
		Workbook book = WorkbookFactory.create(fis);
		
		//get the sheet
		Sheet sheet = book.getSheet("Valid");
		
		//get the row
		Row row = sheet.getRow(1);
		
		//get the sheet
		Cell cell = row.getCell(0);
		
		//convert the cell value in string format
		String username = cell.getStringCellValue();
		
		//print the username
		System.out.println(username);
		
		
		
	}

}
