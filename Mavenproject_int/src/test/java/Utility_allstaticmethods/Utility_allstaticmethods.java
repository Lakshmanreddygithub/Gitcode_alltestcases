package Utility_allstaticmethods;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
//import org.apache.commons.lang.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Utility_allstaticmethods {

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
//--------------------------------------------	

//Creating a custom function for highlighting element

	public static void highLighterMethod(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}
	//// call this method as below
	// highLighterMethod(driver,ele);
	// ele.sendKeys("SoftwareTestingMaterial.com");
//-------------------------------------------------------------------------------------------
//click method by jse
	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);

	}

//--------------------------------------------------------------------------------------
	public static void generatealertwindow(String message, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

//to refresh
	// js.executeScript("history.go(0)");
//to scroll
	// js.executeScript("arguments[0].scrollIntoView(true);",element);
//--------------------------------------------------------------------------
	/*
	 * static String decodestring(String password) { //encode password
	 * 
	 * String str1="test123"; byte[]
	 * encodedstring=Base64.encodeBase64(str1.getBytes()); //convert byte to string
	 * String Convertedbytetostring= new String(encodedstring);
	 * System.out.println("encoded string:"+new String(Convertedbytetostring));
	 * 
	 * 
	 * //decode password byte[] decodedstring=Base64.decodeBase64(password); return
	 * (new String(decodedstring));
	 * 
	 * }
	 */

// decode password
	public static String decodestring(String password) {
		byte[] decodedstring = Base64.decodeBase64(password);
		return (new String(decodedstring));
	}

//read data from hasmap data structure and login
	static HashMap<String,String> hmdodata(){
 		HashMap<String,String> hmdo=new HashMap<String,String>();
	 	hmdo.put("val1", "hmdovalue1@hmdovalue2");
	 	hmdo.put("val2", "test@test2");
	 	return hmdo;
 	}	
	
//CaptureScreenshot-generic method
public static void CaptureScreenshot ( WebDriver driver) throws IOException {
	
	//CaptureScreenshot-generic method
	//String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp 
	String timestamp1= new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	String ScreenshotName="Screenshot-"+timestamp1+".jpg";
	//TakesScreenshot ts = (TakesScreenshot) driver;
	  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  File target=new File(".\\projectscreens\\"+ScreenshotName);
	  FileUtils.copyFile(source,target);   }

	/*
	 * //randomestring public String randomestring() { String
	 * generatedstring=RandomStringUtils.randomAlphabetic(8);
	 * return(generatedstring); }
	 */

	/*
	 * //randomeNum public static String randomeNum() { String generatedString2 =
	 * RandomString.randomNumeric(4); return (generatedString2); }
	 */

//launchbrowser
public static void LaunchChromebrowser(WebDriver driver) throws Exception {  
	 WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();	 
}  


//cross browser setting code-generic method-dont use

	public static void CBT_browsersetup(WebDriver driver,String browser,String URL) {
		
	  if(browser.equals("chrome")) {	  
		  WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		  driver.manage().window().maximize(); }
	  else if(browser.equals("firefox")) {
		  WebDriverManager.firefoxdriver().arch64().setup(); driver = new
		   FirefoxDriver(); driver.manage().window().maximize(); }
	  else if(browser.equals("ie")) {
	  //System.setProperty("webdriver.ie.driver",readconfig.getIEPath()); 
		  //driver ie  = new InternetExplorerDriver();
		  }	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.get(URL);
	  
	  }
	
//login generic method	-dont use
	public static void Login_Generic(WebDriver driver,String uname, String pwd) throws InterruptedException {
		
		driver.findElement(By.name("userName")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.name("submit")).click();
		Thread.sleep(20);
	}
//invoke logger method
	/*
	 * public static void InvokeLogger () { Logger logger =
	 * Logger.getLogger("myproject");
	 * PropertyConfigurator.configure("Log4j.properties"); }
	 */

//take screenshot method222	
	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//this.takeSnapShot(driver, "c://test.png");-use this method like this
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
				File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
			//Move image file to new destination 
				File DestFile=new File(fileWithPath);
				//Copy file at destination
				FileUtils.copyFile(SrcFile, DestFile); }
			
	public void integerdata_addition(String num1, String num2, String num3){
		
		int val1=Integer.parseInt(num1);
		int val2=Integer.parseInt(num2);
		int val3= Integer.parseInt(num3);
		int result =val1+val2+val3;
		System.out.println(result);
	}
	
}
	
	

