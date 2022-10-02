package codeisfine_workingscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


//class 
public class commandslocators_staticvoidmethodselement_listelements_examples {
		
	public static WebDriver driver;

//Methods--					
		//public static Selenium selenium=new WebDriverBackedSelenium(driver, "http://mail.in.com");//rc method
	
	public static void commandslocatorsmethods() throws Exception {
		
	//commandslocators_methodselement_listelements_examples which mostly used
		
		driver.get("http://google.com");
		//driver.findElement(By.id("f_id")).sendKeys("");
		driver.findElement(By.name("q")).sendKeys("static method call just using the method name no class object");
		//driver.findElement(By.cssSelector("input.signin")).click();
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a")).click();
		Thread.sleep(6000);
		
		//driver.findElement(By.linkText("Sign out")).click();
		
		driver.findElement(By.id("fname")).clear();
		driver.findElement(By.id("fname")).sendKeys("interview");	
		
		new Select(driver.findElement(By.id("day"))).selectByVisibleText("10");
		new Select(driver.findElement(By.id("month"))).selectByVisibleText("mar");
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("1998");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("interview");
		
		  WebElement t=driver.findElement(By.id("gridSource"));
		  
	// list web element	  
		  List<WebElement> rows=t.findElements(By.tagName("tr"));
		  
		  for(WebElement r :rows)  {
			   List<WebElement> cols=r.findElements(By.tagName("td"));
			   for(WebElement c:cols)
			   {
				   System.out.println(c.getText());   
			   }		   
		  }}
	
	
	
//Main method 
	
	  public static void main(String[] args) throws Exception {
		  
		// TODO Auto-generated method stub	
		  
//---browser info----
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com");
//Preconditions for browser and for webDriver
		//System.setProperty("webDriver.chrome.Driver", "D:\\chromeDriver.exe");
		//WebDriver Driver=new ChromeDriver();		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//-----------------------------------		
		
		//call functions methods from main method		
				//commandslocatorsmethods();
		
		String url1=driver.getCurrentUrl();
		String url2=driver.getCurrentUrl();				
		//if (url1.contains("wikipedia.org"))				
		//if (url2.equals("https://github.com/SeleniumHQ/")).		
//use gettext command to capture message
		String message = driver.findElement(By.tagName("h1")).getText();
		System.out.println(message);
		String ErrorMessage=driver.findElement(By.className("messageStackError")).getText();
		System.out.println(ErrorMessage);
		String message1 = driver.findElement(By.linkText("Gmail")).getText();
	//use equals command to compare
		//if (message.equals("Your Account Has Been Created!"))			
		//11)use boolean method to verify
		//boolean linkExistence=driver.findElement(By.linkText("Gmail")).isDisplayed();
		String linkExistence;
		  //if (linkExistence == true) {}
//another method of verifying element 
		  if (driver.findElement(By.linkText("Gmail")).isDisplayed()== true){
		  System.out.println("Gmail Link Exists - Passed"); }
		  else{
		  System.out.println("Gmail Link Not Exists - Failed"); 
		  }		 
//Alt+Shift+Q = Show view for console, variables,breakpoints,projectexplorer,error log etc....
			//Alt+Shift+x g  -to run testng suite.
			//Alt+Shift+x n  -to run testng test.
					
//create Object/Instance of the Class
	//Usually we create Object/Instance of the Class within main method, but we can also create Objects outside of the main method
	//Syntax: ClassName objectName= new ClassClassName();
					 
 	
	}

}






