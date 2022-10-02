package Excelscripts;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class HashMapToExcel {
public static void main(String[] args) throws IOException {	
	//excel
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Hashmapdatatoexcel");
	//hash map		
		Map<String,String> data=new HashMap<String,String>();
		data.put("101","Manual");
		data.put("102","Automation");
		data.put("103","Uft");
		data.put("104","Selenium");
		data.put("105","Mysql");		
		
		int rowno=0;	
	//read data	
		for(Map.Entry entry:data.entrySet())
		{
			XSSFRow row=sheet.createRow(rowno++);			
			row.createCell(0).setCellValue((String)entry.getKey());
			row.createCell(1).setCellValue((String)entry.getValue());		}	
		//store in sheet
		FileOutputStream fos=new FileOutputStream(".\\Testdatafiles\\Hashmapdatatoexcel.xlsx");		
		workbook.write(fos);
		fos.close();
		System.out.println("Hashmapdata to excel written succesfully");		
	}
}

