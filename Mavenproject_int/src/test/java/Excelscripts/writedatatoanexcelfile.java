package Excelscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;



public class writedatatoanexcelfile {
	

	public static void main(String[] args) {
		
//write data to an excel file ?
		
		try {
			  // To specify the file path which you want to create or write
			  File src=new File(".\\Testdatafiles\\ruffdata.xlsx");
			  // To Load the file
			  FileInputStream fis=new FileInputStream(src);
			   // To load the workbook
			   XSSFWorkbook wb=new XSSFWorkbook(fis);
			   XSSFSheet sheet=wb.createSheet("testdata");
//			   XSSFSheet sheet=wb.getSheet("testdata");
			   
			   XSSFRow row=sheet.createRow(0);   	      	 
		    		  XSSFCell cell=row.createCell(0);		    		  						
						cell.setCellValue((String)"test");
				
						  XSSFRow row1=sheet.createRow(1);   	      	 
			    		  XSSFCell cell1=row1.createCell(1);		    		  						
							cell1.setCellValue((String)"qa");
						
			  // To get the sheet to modify or create
			   //XSSFSheet sh1= wb.getSheet("Sheet1");
			 // here createCell will create column and setCellvalue will set the value
			 //sh1.getRow(0).createCell(2).setCellValue("hi");
			 //sh1.getRow(0).getCell(0).setCellValue("Manual");
			   //sheet.getRow(1).getCell(1).setCellValue("test");
			  // sheet.getRow(1).getCell(1).setCellValue("Uft");
			   //sheet.getRow(2).getCell(2).setCellValue("selenium");
			 
			 
			 //sh1.getRow(1).createCell(2).setCellValue("hello");
			 //sh1.getRow(2).createCell(2).setCellValue("qa");
			
			 // to specify where you want to save file
			 FileOutputStream writedata=new FileOutputStream(new File(".\\Testdatafiles\\ruffdata.xlsx"));
			// finally write content 
			 wb.write(writedata);
			// close the file
			 writedata.close();
			 
			  } 
		
		catch (Exception e)
		{
			   System.out.println(e.getMessage());
			   
			  }
		
	}
	
}
	
