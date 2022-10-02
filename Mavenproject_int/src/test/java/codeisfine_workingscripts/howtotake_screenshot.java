package codeisfine_workingscripts;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class howtotake_screenshot {
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {	
		
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();		

//how to take screenshot	
  driver.get("https://www.gmail.com");
  Thread.sleep(20);
  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File target=new File(".\\projectscreenshots\\gmailtoday.jpg");
  FileUtils.copyFile(source,target);

	}
}


//take a screenshot of the failed test use try catch block?
		  
	/*
	 * To take a screenshot of the failed test, we will place the entire code in try-catch block.
	 *  by placing the test steps in a try block and then screen
	 * capture statement in the catch block.
	 *  In try block, if a test step fails then it goes to the catch block and captures a screenshot of the web page.
	 */	  
	/*
	 * //driver.manage().window().maximize(); try{
	 * //driver.get("https://www.gmail.com"); //driver.navigate().refresh();
	 * //driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(
	 * "123@gmail.com");
	 * //driver.findElement(By.id("emaile")).sendKeys("testmail@gmail.com");
	 * //Statement with incorrect id
	 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click(
	 * ); //Thread.sleep(5000); File scrFile =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrFile, new
	 * File(".\\projectscreenshots\\gmailerror.jpg")); }
	 * 
	 * catch(Exception e){
	 * 
	 * File screenshotFile =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(screenshotFile, new
	 * File(".\\projectscreenshots\\failgmail.jpg"));
	 * System.out.println("there is an error check info : " + e ); }
	 */
	     
	


//How to take multiple screenshots in Selenium WebDriver?
			/*
			 * In testing, it is very much necessary to store test result data to prove the
			 * certain test is passed/failed or functionality is covered or not and you can
			 * take screenshots as test result or proof, which can be used for reference
			 * later. The same way we need to take screenshots as proof in automation
			 * testing also. During automated testing of continuous application flow, you
			 * might want to capture a series of screenshots. Selenium WebDriver has a nice
			 * little utility MultiScreenShot to capture multiple screenshots. This utility
			 * allows you to take a screenshot of individual elements and minimize the
			 * browser.
			 * 
			 * We will see how to setup MultiScreenShot utility with selenium WebDriver and
			 * capture multiple screenshots. We will use Google.com for the explanation.
			 * 
			 * First, download the MultiScreenShot jar file. Add jar in your Selenium
			 * Webdriver project by adding it to Java Build Path. Now import the package in
			 * your class file. Let us create an object to use MultiScreenShot. Pass two
			 * arguments that are the path to save screenshot and class name to create the
			 * folder and save the screenshot inside that. Example:
			 * path=C:UsersxxxxxxDesktopTestMultiScrShot className=ScreenShots Full page
			 * screenshot is taken when you call the method and this method accepts
			 * WebDriver object as an argument.
			 * 
			 * Example: multiScrShot.multiScreenShot(driver);
			 * 
			 * Screenshot of elements on a page is taken when you call method and method
			 * accepts WebDriver object as argument and WebElement object
			 * 
			 * Example: mShot.elementScreenShot(driver,
			 * driver.findElement(By.id("search-submit")));
			 * 
			 * Minimize the browser window when the browser window is maximized. No argument
			 * is required to pass.
			 * 
			 */
		  
		  
//How to take multiple screenshots in Selenium WebDriver?
			/*
			 * MultiScreenShot multiScrShot=new MultiScreenShot("C:New","TestMultiScrShot");
			 * 
			 * WebDriver driver =new FirefoxDriver();
			 * 
			 * 
			 * driver.get("https://google.com"); //maximize the window
			 * 
			 * 
			 * driver.manage().window().maximize(); //take full screenshot using
			 * MultiScreenShot class multiScrShot.multiScreenShot(driver); //take element
			 * screenshot using MultiScreenShot class multiScrShot.elementScreenShot(driver,
			 * driver.findElement(By.name("btnK"))); //navigate to https://nikasio.com
			 * driver.navigate().to("https://nikasio.com"); //take element screenshot using
			 * MultiScreenShot class multiScrShot.elementScreenShot(driver,
			 * driver.findElement(By.id("slide-2-layer-2"))); //take full screenshot using
			 * MultiScreenShot class multiScrShot.multiScreenShot(driver); //minimize the
			 * window using MultiScreenShot class multiScrShot.minimize(); driver.quit();
			 */
		  
		  
		  

