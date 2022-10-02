 package codeisfine_workingscripts;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ifelseifexample_browserdecide_datafromconfigfile{

	Utility_allstaticmethods.ReadConfigfile ReadConfigfile=new Utility_allstaticmethods.ReadConfigfile();
	
	public static WebDriver driver;
	
	public void if_elseifexample_browserdecide(String br ) {		
		
		Logger logger = Logger.getLogger("interview");
		//PropertyConfigurator.configure("log4j.properties");
		
	//if elseif code to launch browser which is set in config file
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",ReadConfigfile.getChromePath());
			driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",ReadConfigfile.getFirefoxPath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver",ReadConfigfile.getIEPath());
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		
	}
	
	//main method
	
	public static void main ( String[]args) {
		
		ifelseifexample_browserdecide_datafromconfigfile browserdecideconfigfile_obj =new ifelseifexample_browserdecide_datafromconfigfile();
		
		browserdecideconfigfile_obj.if_elseifexample_browserdecide("chrome");		
		
		//Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//div[@id=\"content\"]/h2[1]")).getText();	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
//verify using if condition      
	      if(result.contains("text")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }
				
	}
	
	

}
