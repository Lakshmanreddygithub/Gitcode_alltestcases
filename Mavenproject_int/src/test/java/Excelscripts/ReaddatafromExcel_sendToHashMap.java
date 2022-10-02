package Excelscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReaddatafromExcel_sendToHashMap {
	
public static void main(String[] args) throws IOException  {	
	//object for data files fileinputstream
		FileInputStream fis=new FileInputStream("C:\\QA Testing D Drive\\Testdata.xlsx");
	//import workbook and sheets	
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("testingdata");	
		//get rows and columns count
		int rows=sheet.getLastRowNum();
		System.out.println("rows are :"+rows);
		
	//hash map collection in java
		
		HashMap<String,String> data=new HashMap<String,String>();	
		
	//Reading data from excel to HashMap
		
		for(int r=0;r<=rows;r++)
		{
			String key=sheet.getRow(r).getCell(0).getStringCellValue();
			String value=sheet.getRow(r).getCell(1).getStringCellValue();
			data.put(key, value);			
		}		
		//Read data from HashMap		
		for(Map.Entry entry:data.entrySet())
		{
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}		
		workbook.close();		
	}
}
