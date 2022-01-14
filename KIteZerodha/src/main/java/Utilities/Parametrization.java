package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
	public static String getdata(int row,int cell) throws EncryptedDocumentException, IOException, FileNotFoundException {
		FileInputStream file = new FileInputStream("C:\\Users\\MANDAR\\eclipse-workspace\\java\\src\\KIteZerodha\\src\\main\\resources\\Zerodha.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
