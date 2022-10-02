package Utility_allstaticmethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

//import Configproperties_Demo.ReadConfigfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	

	ReadConfigfile readconfig=new ReadConfigfile();
	
	public String baseURL=readconfig.geturl();
	public String username=readconfig.getusername();
	public String password=readconfig.getpassword();
	
	public static WebDriver driver;	
	//public static Logger logger;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void browsersetup(String browser)	{			
		//logger = Logger.getLogger("myproject");
		//PropertyConfigurator.configure("Log4j.properties");
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 driver.manage().window().maximize();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().arch64().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("ie"))	{
			//System.setProperty("webdriver.ie.driver",readconfig.getIEPath());
			//driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		
		String timestamp1= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String ScreenshotName="Screenshot-"+timestamp1+".jpg";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		 File target=new File(".\\projectscreens\\"+ScreenshotName);
		//File target = new File(System.getProperty("user.dir") + "/projectscreens/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	   
	}
	
	/*
	 * public String randomestring() { String
	 * generatedstring=RandomStringUtils.randomAlphabetic(8);
	 * return(generatedstring); }
	 * 
	 * public static String randomeNum() { String generatedString2 =
	 * RandomStringUtils.randomNumeric(4); return (generatedString2); }
	 */
	
	
}
