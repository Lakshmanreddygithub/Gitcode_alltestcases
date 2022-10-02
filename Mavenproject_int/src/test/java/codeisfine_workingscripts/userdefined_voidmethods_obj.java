package codeisfine_workingscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userdefined_voidmethods_obj {
	
	public static WebDriver driver;	

	//all methods
	public  void CodetoHandletwoBrowserTabswithSelenium() throws InterruptedException {
		//Code to Handle two Browser Tabs with Selenium:
				 				     
		 WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
				      
				      //Go to URL  
				      driver.get("http://www.google.com");  
				      //Set timeout  
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
				      
				      // Open new tab  
				      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");  
				      //Go to URL  
				      driver.get("http://www.gmail.com");  
				      //Set new tab timeout  
				      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
				      // Do some operation      
				      driver.findElement(By.id("gmail-sign-in")).click();  
				      driver.findElement(By.id("Email")).sendKeys("WebDriver");  
				      driver.findElement(By.id("Passwd")).sendKeys("WebDriver");  
				      driver.findElement(By.id("signIn")).click();  
				      Thread.sleep(2000);     
				      // Switch first tab  
				      driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");  
				      driver.switchTo().defaultContent();  
				      Thread.sleep(2000);  
				      // Write search String  
				      driver.findElement(By.id("gbqfq")).sendKeys("WebDriver");  
				      // Click on Search button      
				      driver.findElement(By.id("gbqfb")).click();  
				      Thread.sleep(2000);  
				      
				     // Browser close   
				      driver.close();		
	}

	//----
	
public void Howtofindmorethan_onewebelementinthelist() {
	
	//How to find more than one web element in the list?
			//Ans. It can be done using WebElement List. E.g.
	WebDriver driver = new ChromeDriver(); 
			List <WebElement> elementList = driver.findElements(By.id(""));
			
			//div[@id=’example’]//ul//li”));
			int listSize = elementList.size();
			for (int i=0; i<listSize; i++){
			//serviceProviderLinks.get(i).click();
			}
			
				
}
			//UsingfindElements_findThenumberofvaluesinrowinwebtable/  
			  public void UsingfindElements_findThenumberofvaluesinrowinwebtable() {
				//UsingfindElements_findThenumberofvaluesinrowinwebtable/  
			     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver(); 
			     String url = "https://www.exampleurl.com/example.htm";
			     driver.get(url); 
			     driver.manage().window().maximize(); 
			     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);       
			     List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
			     System.out.println("The number of values in row 2 is "+ rows.size());
			     driver.close(); 
			  } 
			  
			//Using findElement() :-
				 
			  public void UsingfindElement() { 
			     System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			     WebDriver driver = new ChromeDriver(); 
			     String url = "https://www.exampleurl.com/example.htm";      driver.get(url); 
			     driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS); 
			     driver.findElement(By.cssSelector("input[id='search']")).sendKeys("Selenium");
			 
			  } 
			  
			  public void ClickFrameslink() {
					//Mention how to switch one frame to another frame?
							//Ans. To switch one frame to another frame, you can use the following command:	
				  WebDriver driver = new ChromeDriver(); 
					driver.findElement(By.id("hi")).click();
					driver.switchTo().frame(0);
					driver.switchTo().defaultContent();  //Erase all switches before applying switch second time 
					driver.switchTo().frame(0);
					
				}
			  
			  public void FirefoxBrowserLaunchDemo() {
				  
					//Setting webdriver.gecko.driver property  
			  System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
					//Instantiating driver object and launching browser  
			  WebDriver driver = new FirefoxDriver(); 
					//Using get() method to open a webpage  
					driver.get("google.com");
					//Closing the browser  
					driver.quit();  
		
					
				}
			  
			  public void webtablefindnumberofrowsandcolumns() {
				 
				  WebDriver driver = new ChromeDriver(); 
					//Finding number of Rows
					List<WebElement> rowsNumber = driver.findElements(By.xpath("//*[@id=\"content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a\"]/div/div/table[1]/tbody/tr[1]/td[1]"));
							
							int rowCount = rowsNumber.size();
					System.out.println("No of rows in this table : " + rowCount);

					//Finding number of Columns
					List<WebElement> columnsNumber = driver.findElements(By.xpath("//*[@id=\"content-8b4988b9-2ec9-4e77-9b4d-9c2994bd9e8a\"]/div/div/table[1]/thead/tr/th[1]\""));

					int columnCount = columnsNumber.size();
					System.out.println("No of columns in this table : " + columnCount);

				
				}
			
		
			  
				public void launchBrowser() {
					 WebDriver driver;	
					WebDriverManager.chromedriver().setup();
				    driver = new ChromeDriver();
				    driver.manage().window().maximize();
				}
				
				public void terminateBrowser(){
				
				driver.close();
				} 
			  
				public void selectmorethanonewebelementinthelist() {
					
					//Q17. select more than one web element in the list?
							//Ans. It can be done using WebElement List. E.g.
							List <WebElement> elementList = driver.findElements(By.xpath("//div[@id=’example’]//ul//li"));
							int listSize = elementList.size();
							
				}

				public void TakesScreenshot() throws IOException  {
					// Code to capture the screenshot
					File scrFile = ((org.openqa.selenium.TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					// Code to copy the screenshot in the desired location
					FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));
					}
				
				
				 public void readText() {
					    System.setProperty("webdriver.chrome.driver", "<<chromedriver.exe>>");
					    WebDriver webdriver = new ChromeDriver();
					    webdriver.get("https://www.google.com");
					    String strText = webdriver.findElement(By.xpath("<<xpath expr>>")).getText();
					    System.out.println("Text element contains: " + strText);
					 }
				 
				 public void CreateobjectofRobotclass() throws AWTException {
				 	
				 	// Create object of Robot class
				 			 Robot r = new Robot();  
				 			 
				 			 // Press Alt and S key, it will shift the focus to 'Save' button of Windows dialog
				 			 r.keyPress(KeyEvent.VK_ALT);
				 			 r.keyPress(KeyEvent.VK_S);
				 			 
				 			 // Now, release S and Alt key
				 			 r.keyRelease(KeyEvent.VK_S);
				 			 r.keyRelease(KeyEvent.VK_ALT);
				 			 
				 			 // Press Enter Key as Focus is on Save button, so it will be 
				 			 r.keyPress(KeyEvent.VK_ENTER);
				 			 
				 			 // Release Enter key
				 			 r.keyRelease(KeyEvent.VK_ENTER);
				 			 
				 	
				 }
				 
	
	 public void JavascriptExecutorexample_entertext() {

			JavascriptExecutor webdriver = null;
			//How to enter text in the HTML text box without invoking the sendKeys()?
			//There is a Selenium JavascriptExecutor class that provides methods to perform actions on the HTML elements.
			// Set up the JS object
			JavascriptExecutor jscript = (JavascriptExecutor)webdriver;
			// Issue command to enter the text
			jscript.executeScript("document.getElementById('textbox').value = 'Some Text';");
			// Set up the JavaScript object
			JavascriptExecutor jscript1 = (JavascriptExecutor) webdriver;
			// Read the site title
			String strTitle = (String)jscript1.executeScript("return document.title");
			System.out.println("Webpage Title: " + strTitle);
		}				  
//main method------
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		//call all void methods
		//to invoke methods created class object
		userdefined_voidmethods_obj userdefinedmethods_obj=new userdefined_voidmethods_obj();		  
		userdefinedmethods_obj.CodetoHandletwoBrowserTabswithSelenium();	
		userdefinedmethods_obj.Howtofindmorethan_onewebelementinthelist();
		userdefinedmethods_obj.UsingfindElements_findThenumberofvaluesinrowinwebtable();
		userdefinedmethods_obj.UsingfindElement();
		userdefinedmethods_obj.ClickFrameslink();
		
		userdefinedmethods_obj.FirefoxBrowserLaunchDemo();
		userdefinedmethods_obj.webtablefindnumberofrowsandcolumns();
		userdefinedmethods_obj.launchBrowser();
		userdefinedmethods_obj.terminateBrowser();
		userdefinedmethods_obj.selectmorethanonewebelementinthelist();
		userdefinedmethods_obj.TakesScreenshot();
		userdefinedmethods_obj.CreateobjectofRobotclass();
		userdefinedmethods_obj.JavascriptExecutorexample_entertext();
		
		
			
		
	}}
		 

