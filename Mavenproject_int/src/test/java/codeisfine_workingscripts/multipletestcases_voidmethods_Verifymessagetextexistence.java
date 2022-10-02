package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipletestcases_voidmethods_Verifymessagetextexistence{
	
	
	public static WebDriver driver;
//Creating reusable methods functions below
	
//Launch Browser
	public void launch(){
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
//Close Browser
	public void closeBrowser(){
	driver.close();
	}
	
// Login void method with argumnets
	public void login(String Username, String Password){
		
	driver.get("http://www.demo.guru99.com/V4/");
	driver.findElement(By.name("uid")).sendKeys(Username);
	driver.findElement(By.name("password")).sendKeys(Password);
	driver.findElement(By.name("btnLogin")).click();	
	//Thread.sleep(3000);
	
	}
	
//Main method starts here execution
	
	public static void main(String[] args) {	
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	//creating object (obj) reference for class
	multipletestcases_voidmethods_Verifymessagetextexistence obj=new multipletestcases_voidmethods_Verifymessagetextexistence();	
	
//Test Case 1: Verify  Login (Positive Test Case)
	//Reusing the user defined reusable methods
	
	obj.launch();	
	//passs arguments
	obj.login("mngr442844","YrUtusA");
	
	String url=driver.getCurrentUrl();
	System.out.println(url);
	//verify 
	if (url.contains("guru99")){
	System.out.println("Test Case 1: "+ " Login is Successful - Passed");
	}	
	else{
	System.out.println("Test Case 1: "+ " Login is unsuccessful - Failed");
	}
	obj.closeBrowser();	
	
//Test Case 2: Verify message text existence	
	  obj.launch();	  
	  obj.login("mngr442844","YrUtusA");	
	  
	  String Etext ="Welcome To Manager's Page of Guru99 Bank";		
		String Actualtext=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee")).getText();
		System.out.println("text on page is :" + Actualtext);
		
		if (Etext.equals(Actualtext)) {
			System.out.println("testcase 2 : text exists passed");
		}
		else {
			System.out.println("testcase 2 : text not exists");
		}		  
	 obj.closeBrowser();
	}
}

