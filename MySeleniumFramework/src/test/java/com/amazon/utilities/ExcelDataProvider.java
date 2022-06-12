package com.amazon.utilities;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelDataProvider {

	XSSFWorkbook wb;

	public ExcelDataProvider (){	 
		// . is used as TestData is already in the home directory
		//File src = new File ("src\\TestData\\Data.xlsx"); 
		File src = new File ("C:\\Users\\P50034506\\eclipse-workspace\\MySeleniumFramework\\src\\TestData\\Data.xlsx");
		try {
			//FileInput stream is used to convert this data into a raw data , and will provide tr source as well 
			FileInputStream fis = new FileInputStream(src);
			//For Reading excel , the class used is XSSF 
			wb = new XSSFWorkbook(fis);
		}
		catch (Exception e) {
			System.out.println("Unable to read the data from Excel file"+e.getMessage());
		}
	}
	
    public String getStringData(int sheetIndex, int row , int column)
    {
    	return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
    }

	public String getStringData(String sheetName , int row, int column) 
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}

	public double getNumericData(String sheetName , int row , int column)
	{
		 return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();	
	}
}
