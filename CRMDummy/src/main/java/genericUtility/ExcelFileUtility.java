package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//read data from excel sheet
public class ExcelFileUtility {
public String readDataFromExcel(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./ConfigAppData/testscriptData.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	String data =wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	wb.close();
	return data;
	
}
//To Get Row Count
public int getRowCount(String sheetName) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("./ConfigAppData/testscriptData.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	int rowcount = wb.getSheet(sheetName).getLastRowNum();
	wb.close();
	return rowcount;
	
	
}
//To write data to excel sheet

public void writeDataIntoExcelSheet(String sheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./ConfigAppData/testscriptData.xlsx");
	Workbook wb= WorkbookFactory.create(fis);	
	wb.getSheet(sheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	FileOutputStream fos=new FileOutputStream ("./ConfigAppData/testscriptData.xlsx");
	wb.write(fos);
	wb.close();
}
	
	
	
}


