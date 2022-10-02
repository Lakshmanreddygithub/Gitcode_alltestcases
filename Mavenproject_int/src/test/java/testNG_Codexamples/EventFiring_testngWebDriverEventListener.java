package testNG_Codexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EventFiring_testngWebDriverEventListener {	
//WebDriver Event Listeners in Selenium to create logs and reports	
//The main purpose of using listeners is to create logs and reports.
// WebDriverEventListener--
//WebDriverEventListener: This WebDriver Event Listener interface allows us to implement the methods
//Once the script is executed, Selenium WebDriver does perform activities such as Type, Click, Navigate etc., To keep track of these
//activities we use WebDriver Event Listeners interface
//EventFiringWebDriver: This EventFiringWebDriver class actually fire WebDriver event
	//Listeners mainly comprise of two types, namely		
		//WebDriver listeners
		//TestNG listeners
public static WebDriver driver;
public static void main(String[] args) {		
// browser info	-  //ChromeOptions options = new ChromeOptions();//options.addArguments("disable-infobars");		
		  WebDriverManager.chromedriver().setup();	      
		  driver = new ChromeDriver();	
		  driver.manage().window().maximize();			
//EventFiringWebDriver		
		EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver); 
		//EventCapture eCapture = new EventCapture(); 
//Registering with EventFiringWebDriver
//Register method allows to register our implementation of WebDriverEventListner to listen to the WebDriver events
		//eventHandler.register(eCapture); 
//navigating to the webpage "www.softwaretestingmaterial.com"
		eventHandler.navigate().to("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/"); 
		eventHandler.findElement(By.id("email")).sendKeys("xyz");
//navigating to the webpage "www.softwaretestingmaterial.com/category/selenium/"
		eventHandler.navigate().to("https://www.softwaretestingmaterial.com/agile-testing-interview-questions/"); 
//navigating back to the first page
		eventHandler.navigate().back();
		eventHandler.quit();
//Unregister allows to detach
		//eventHandler.unregister(eCapture);
		System.out.println("End of Listners Class"); }

}
