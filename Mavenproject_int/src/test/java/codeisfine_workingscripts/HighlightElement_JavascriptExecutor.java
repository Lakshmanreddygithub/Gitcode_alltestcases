package codeisfine_workingscripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import reusable_methodsfunctions.Reusable_methodsall;


public class HighlightElement_JavascriptExecutor extends Reusable_methodsall {
	
	public static WebDriver driver;	
	
public static void main(String[] args) throws IOException {
		
//How To Highlight Element Using Selenium WebDriver
//Let’s make the above code as a function. 
//So whenever we want to highlight particular element, we could use this method to achieve our goal.				
	
// browser info		 	     
	WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();	
	  driver.manage().window().maximize();			
	//gmail eg  
	  driver.get("https://www.gmail.com");
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	
//Method 1	good example
//Call the highlighterMethod and pass webdriver and WebElement which you want to highlight as arguments.
	highLighterMethod(driver, ele);
	ele.sendKeys("interview testing qa");
	captureScreen(driver, null);
	
//Method 2	
//highlightelement use from reusablemethods
	
	// browser info		 	     
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();	
		  driver.manage().window().maximize();			
		  driver.get("https://www.gmail.com");
		  
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	highlightelement(element1, driver);	
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	highlightelement(element2, driver);
	captureScreen(driver, null);
	
	
		}
	}						


