package codeisfine_workingscripts;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logger_Log4j {
	
public static WebDriver driver;

	public static void main(String[] args) {
			 
//log4j-generate logs-add log4j	maven dependency-and add log4j properties file or log4jxml in the project directory	 
		    
	Logger logger = Logger.getLogger("Logger_Log4j");//provided class name here
	//DOMConfigurator.configure("Log4j.xml");
	//PropertyConfigurator.configure("Log4j.properties");//Class PropertyConfigurator. Allows the configuration of log4j from an external file.

//browser code
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();	
    //gmail search
	driver.get("https://www.gmail.com");
	logger.info("browser launched");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("logger info");
	logger.info("value entered in the field");	
	logger.warning("value not entered");//if in some cases
	

	}

}
