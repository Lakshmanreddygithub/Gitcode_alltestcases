package reusable_methodsfunctions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import Configproperties_Demo.ReadConfigfile;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusable_methodsall {

	public static WebDriver driver;	
	//public static Logger logger;
//--------select browser
	

	//launchbrowser
	public static void LaunchChromebrowser(WebDriver driver) throws Exception {  
		 WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();	
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}  
		public static void Selectedbrowserlaunch(){	
			String browser="chrome";
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
		//driver.get(baseURL);
	}
//--------------------

	public static void tearDown() {
		driver.quit();
	}
//-----
	public static void captureScreen(WebDriver driver, String tname) throws IOException {
		//timestamp code
		String timestamp1= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String ScreenshotName="Screenshot-"+timestamp1+".jpg";
		//TakesScreenshot code
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		 File target=new File(".\\projectscreens\\"+ScreenshotName);
		//File target = new File(System.getProperty("user.dir") + "/projectscreens/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken"); 
	}
	
	
	public static void launchgmailandtakescreens() {
		
		driver.get("https://www.google.com");
	     //webelement object
	         WebElement element1 = driver.findElement(By.name("q"));
	         element1.sendKeys("testing qa");
	}
	
	public static void TimeStampcode() {
		//calender TimeStamp-code---------------
		  Calendar currentDate = Calendar.getInstance();
		  SimpleDateFormat formatter= 
		  new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
		  String date1 = formatter.format(currentDate.getTime());
		  System.out.println("Now the date is :=>  " + date1);
		 //-------------------------------------------
	}
	
	//Creating a custom function for highlighting element
	
		public static void highLighterMethod(WebDriver driver, WebElement element){
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);						
		}
//highlight elemet with color
		//------------------------------------------------		
		public static void highlightelement(WebElement element, WebDriver driver) {

			String bgcolor = element.getCssValue("backgroundColor");
			for (int i = 0; i < 20; i++) {
				changecolor_tohighlightelement("#000000", element, driver);
				changecolor_tohighlightelement(bgcolor, element, driver);
			}}
		
		public static void changecolor_tohighlightelement(String color, WebElement element, WebDriver driver) {
			JavascriptExecutor js = ((JavascriptExecutor) driver);
			js.executeScript("arguments[0].style.backgroundColor ='" + color + "'", element);
			try {
				Thread.sleep(20);
				
			} catch (InterruptedException e) {

			}}	
	
	
	public static void main(String[]args) throws IOException {
		

		// driver.get("https://www.gmail.com");
			WebElement ele = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));	
		Selectedbrowserlaunch();
		//tearDown();
		launchgmailandtakescreens();
		captureScreen(driver, "test");
		TimeStampcode();
		highLighterMethod(driver,ele);
		
		// driver.get("https://www.gmail.com");
			//WebElement ele = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
			
		/*
		 * //Method 1 //Call the highlighterMethod and pass webdriver and WebElement
		 * which you want to highlight as arguments. highLighterMethod(driver,ele);
		 * ele.sendKeys("interview testing qa");
		 */
		
		
		
		
		
		
		
	}
}
	
	/*
	 * public String randomestring() { String
	 * generatedstring=RandomStringUtils.randomAlphabetic(8);
	 * return(generatedstring); }
	 * 
	 * public static String randomeNum() { String generatedString2 =
	 * RandomStringUtils.randomNumeric(4); return (generatedString2); }
	 */
	
	

