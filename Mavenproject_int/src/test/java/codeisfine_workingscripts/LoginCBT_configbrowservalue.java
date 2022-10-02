package codeisfine_workingscripts;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility_allstaticmethods.ReadConfigfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginCBT_configbrowservalue {	
	
	public static WebDriver driver;	
	public static void main(String[] args) throws InterruptedException {	
		
		/*
		 * //required files:
		 *  code to login and for cbt
		 *   code readcong file methods utility
		 * configfile which has values
		 */
		
	//get browser from config value	
		ReadConfigfile readconfig=new ReadConfigfile();
		String browsername=readconfig.getbrowser();
		System.out.println(browsername);	
	//get url,un,pwd from config file
		String url=readconfig.geturl();
		String uname=readconfig.getusername();
		String pwd=readconfig.getpassword();	
	//CBT code				
		  if(browsername.equals("chrome")) {	  
			  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			  driver.manage().window().maximize(); }
		  else if(browsername.equals("firefox")) {
			  WebDriverManager.firefoxdriver().arch64().setup(); driver = new
			   FirefoxDriver(); driver.manage().window().maximize(); }
		  else if(browsername.equals("ie")) {
		  //System.setProperty("webdriver.ie.driver",readconfig.getIEPath()); 
			  //driver ie  = new InternetExplorerDriver();
			  }	  
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);			  		
	//Login code	
		  driver.get(url);
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(20);		
		
	}

}
