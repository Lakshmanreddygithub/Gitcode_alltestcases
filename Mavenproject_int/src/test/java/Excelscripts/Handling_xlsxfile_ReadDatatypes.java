package Excelscripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Handling_xlsxfile_ReadDatatypes {
	

public static void main(String[] args) throws IOException  {
	
//file object
	FileInputStream file=new FileInputStream(".\\Testdatafiles\\Testdata.xlsx");
//workbook object
	XSSFWorkbook workbook = new XSSFWorkbook(file);
//access sheet from workbook
	XSSFSheet sheet=workbook.getSheet("testingdata");
//find row and column count and print
	int rows =sheet.getLastRowNum();
	int cols=sheet.getRow(0).getLastCellNum();
	System.out.println("number of rows:"+rows);
	System.out.println("number of columns:"+cols);
	
//use nested for loop - access rows and columns
	
	for (int rc=0;rc<=rows;rc++){		
		XSSFRow row=sheet.getRow(rc);		
		for (int cc=0;cc<rows;cc++) {			
			XSSFCell cell=row.getCell(cc);
			
//access the cell values and print the data types
	switch (cell.getCellType()) {
		case STRING:
			System.out.print(cell.getStringCellValue());break;
		case NUMERIC:
			System.out.print(cell.getNumericCellValue());break;
		case BOOLEAN:
			System.out.print(cell.getBooleanCellValue());break;
		case FORMULA:
			System.out.print(cell.getNumericCellValue());break;
	}
		System.out.print("|");
		}
	System.out.println();
	}	
	workbook.close();
	
	}
	
}
