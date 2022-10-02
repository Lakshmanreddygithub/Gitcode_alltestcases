package codeisfine_workingscripts;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_MultipleDatafrom_TXTfile {	
	
	public static void main(String [] args) throws IOException, InterruptedException {	
		
//Data Driven Testing for  Login   by reading test data from a text file.		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
	
	//txt file methods- FileReader,BufferedReader,readLine,close
	
	FileReader file =new FileReader("C:\\QA Testing D Drive\\Datatxtfile.txt");
		
	BufferedReader br = new BufferedReader(file);
	
//variables declared
int Count=0;
int Iteration=0;
String line;
//loop to iterate
	while ((line=br.readLine())!=null) {
		Count =Count+1;
	
		if (Count >1) {	
		Iteration=Iteration+1;
		//get data and store in variable
		String [] inputData =line.split(",",2);
	//login code
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.demo.guru99.com/V4/");	
	driver.findElement(By.name("uid")).sendKeys(inputData[0]);
	driver.findElement(By.name("password")).sendKeys(inputData[1]);
	driver.findElement(By.name("btnLogin")).click();	
	Thread.sleep(3000);

	String url =driver.getCurrentUrl();
	
	// if condition 
	
	
	if (url.contains("guru99")) {
	System.out.println(Iteration + "Login is Successful - Passed");
	}
	else {
	System.out.println(Iteration +"Login is Unsuccessful - Failed");
	}	
	
	driver.close();
	
	}
	}
	//closing file and buffer instances
	
	br.close();
	file.close();
	}
		
}


