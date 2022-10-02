package codeisfine_workingscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateInvokeMethods {
	

//Reusable Components: //Lunch Browser--//Login---//Close Browser...//variable web driver
	
   public static WebDriver driver; 
//Launch Browser	  
	  public void launch(){ 
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    }	  
//Close Browser	  
	  public void closeBrowser(){ 
		  driver.close(); }	  
 // Login with string arguments data
	  public void login(String Username, String Password) throws InterruptedException { 
		String url="https://www.demo.guru99.com/V4/";
	    driver.get(url); driver.findElement(By.name("uid")).sendKeys(Username);
	    driver.findElement(By.name("password")).sendKeys(Password);
	    driver.findElement(By.name("btnLogin")).click();
	    Thread.sleep(3000);
	    }	
	  
//main method started below  
	  
	public static void main(String[] args) throws InterruptedException {
		
	//to invoke methods created class object
		CreateInvokeMethods userdefinedmethods_obj=new CreateInvokeMethods();		  
		  userdefinedmethods_obj.launch();
		  userdefinedmethods_obj.login("mngr442844", "YrUtusA");		  
		  String url=driver.getCurrentUrl();
		  if (url.contains("guru99")) {
		  System.out.println("Test Case 1: "+ "user defined reusable methods with Login is Successful - Passed"); }
		  else{
		  System.out.println("Test Case 1: "+ "user defined reusable methods with Login is unsuccessful - Failed"); }
		  userdefinedmethods_obj.closeBrowser();
		  }
	
}
