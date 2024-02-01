package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		// create the object of fileInputStream
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		//open the workbook in readable mode
		Workbook book = WorkbookFactory.create(fis);
		
		//get the sheet
		Sheet sheet = book.getSheet("Valid");
		
		//get the row
		Row row = sheet.getRow(1);
		
		//create a cell
		Cell cell = row.createCell(2);
		
		//set the value
		cell.setCellValue("Pass");
		
		//open the workbook in writable mode and save it
		FileOutputStream fos= new FileOutputStream("./src/test/resources/TestData.xlsx");
		
		//write the data
		book.write(fos);
		
		//print data sent successfully
		System.out.println("Data sent successfully");
		
		
		
	}

}
