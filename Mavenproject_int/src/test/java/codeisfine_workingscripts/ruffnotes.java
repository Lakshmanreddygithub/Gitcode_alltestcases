package codeisfine_workingscripts;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ruffnotes  {
	
	private static final Function ExpectedConditions = null;
	public static WebDriver driver;	
//create object to invoke the  method with in the same class
//method
	 public void launch(){ 
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		   }
	 
		 
//main method here
	public static void main(String[] args ) throws Exception {
		
		//object created to invoke the above method
		ruffnotes executionrecord_obj=new ruffnotes();		  
		executionrecord_obj.launch();
		driver.get("https://www.gmail.com"); 
		//search code
		WebElement element1 = driver.findElement(By.name("q"));
        element1.sendKeys("test");
        element1.sendKeys(Keys.ENTER);
        
        
		 	
}
	}
		 
 
//driver.get("https://www.gmail.com"); 
//WebElement  Element=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
//driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));

//Next btn
//email fields- 
//Thread.sleep(10);
//driver.get("https://www.google.com/");