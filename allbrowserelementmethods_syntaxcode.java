package codeisfine_workingscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class allbrowserelementmethods_syntaxcode {
	public static WebDriver driver;
	
	public static void main(String[] args) {
// browser info		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
//-----------------------------------------------------------------
//all . browser methods
	//driver.get("url"); or  
	//driver.navigate().to("url"); 
	//String Text = driver.findElement(By.id("Text")).getText();
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//driver.navigate().to("https://google.com"); 
	//driver.switchTo().frame("ID of the frame");  
	// Select iframe by id
		 // driver.switchTo().frame("ID of the frame");  
	//Locating iframe using tagName
		  //driver.switchTo().frame(driver.findElements(By.tagName("iframe").get(0));  
	//Locating iframe using index-frame(index)
		  //driver.switchTo().frame(0);  
		  //frame(Name of Frame)
		 // driver.switchTo().frame("name of the frame");  
		 // frame(WebElement element)
     //	Select Parent Window
		  //driver.switchTo().defaultContent();  
//How can you find if an element is displayed on the screen?		  
		 // isDisplayed():  
			 // boolean buttonPresence = driver.findElement(By.id("gbqfba")).isDisplayed();  
		//isSelected():  
			  //boolean buttonSelected = driver.findElement(By.id("gbqfba")).isSelected();  
		//isEnabled():  
			  //boolean searchIconEnabled = driver.findElement(By.id("gbqfb")).isEnabled();  		  
//List <WebElement> elementList = driver.findElements(By.xpath("//div[@id='example']//ul//li"));		  
//How to retrieve CSS properties of an element?	  
		 // driver.findElement(By.id(“id“)).getCssValue(“name of css attribute”);
		  //driver.findElement(By.id(“id“)).getCssValue(“font-size”);	
//@Test(priority=0)
		  //driver.findElement(By.xpath("xpath_of_element1")).clear();
	//gettext
		  //String availableText = driver.findElement(By.xpath("//*[@id='gbw']/div/div/div[1]/div[1]/a")).getText();
		  	//System.out.println("Text Available is :"+availableText);
	// getAttribute
		  //String attributeValue = driver.findElement(By.name("nameSelenium")).getAttribute("value");
		  //System.out.println("Available attribute value is :"+attributeValue);
		  //Output: valueSelenium
	//driver.findElement(By.linkText(“Software Testing Material Website”)).click();
   //driver.findElement(By.id("form_1")).submit();
		  
//How to press ENTER key on text box In Selenium WebDriver?
//To press ENTER key using Selenium WebDriver, We need to use Selenium Enum Keys with its constant ENTER.
		  //driver.findElement(By.xpath("xpath")).sendKeys(Keys.ENTER);
//How to pause a test execution for 5 seconds at a specific point?
	//By using java.lang.Thread.sleep(long milliseconds) method we could pause the execution for a specific time. 
		  //To pause 5 seconds, we need to pass parameter as 5000 (5 seconds)
		  //Thread.sleep(5000)
	//Alternative method to driver.get(“url”) method is driver.navigate.to(“url”)
//driver.navigate().to(“url”); – to launch a new web browser window and navigate to the specified URL
		  //driver.getCurrentUrl();
		  //driver.manage().window().maximize();
		  //driver.manage().deleteAllCookies();
//There are multiple ways to refresh a page in selenium
		
		//Using driver.navigate().refresh() command as mentioned in the question 45
		//Using driver.get(“URL”) on the current URL or using driver.getCurrentUrl()
		//Using driver.navigate().to(“URL”) on the current URL or driver.navigate().to(driver.getCurrentUrl());
		//Using sendKeys(Keys.F5) on any textbox on the webpage		  
//driver.getWindowHandle() – It returns a handle of the current page (a unique identifier)
//driver.getWindowHandles() – It returns a set of handles of the all the pages available.
//driver.close(): To close current WebDriver instance
//driver.quit(): To close all the opened WebDriver instances
	//Syntax of findElement()-
		  //WebElement textbox = driver.findElement(By.id(“textBoxLocator”));
	//Syntax of findElements()-
		  //List <WebElement> elements = element.findElements(By.id(“value”));
//Another difference between the two is- if no element is found then findElement() throws NoSuchElementException 
//whereas findElements() returns a list of 0 elements.	  
	//browser browserName=InternetExplorer,version=6,maxInstances=2,platform=WINDOWS
	//-browser browserName=firefox,version=11,maxInstances=2,platform=WINDOWS
		  
		 //How to delete Browser Cookies with Selenium Web Driver?
		  //driver.Manage().Cookies.DeleteAllCookies();
		  //driver.navigate().to("https://www.softwaretestingmaterial.com");
	     // System.out.println(driver.manage().window().getSize());
	      //Create object of Dimensions class
	      //Dimension d = new Dimension(516, 620);
	      //Resize the current window to the given dimension
	     // driver.manage().window().setSize(d);
	      //System.out.println(driver.manage().window().getSize());
		//driver.findElement(By.id(“email“)).getCssValue(“font-size”);
		  
	//Yes. You can navigate in the browser. A few methods using which you can achieve it are:
			 // driver.navigate.forward
			  //driver.manage.back
			  //driver.manage.navigate
			  //driver.navigate.to(“url”)
		  
//--------------------	
////How can we get a text of a web element?
	/*
	 *  //Get command is used to get the inner text of the specified web element.
	 *   //The get command doesn't require any parameter, but it returns a string type value.
	 *    //It is also one of the widely used commands for verification of messages, labels, and errors,etc.,from web pages
	 *    */ 
		  
//String Text = driver.findElement(By.id("Text")).getText();

//The difference between findElement() and findElements() is as follows:

//findElement(): It finds one particular element within the current page using the locating mechanism. It returns the first element located by the locator.
//findElements(): It finds all the elements within the current page with the help of the locating mechanism. Hence, it returns a list of matching web elements found by the locator.

		  //String valueAttribute =driver.findElement(By.id("locator")).getAttribute("value");	
		  //driver.manage().deleteAllCookies();
		  //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
//In order to fetch the current page URL, we can use the getCurrentURL() command.

		  //driver.getCurrentUrl();	
		  
WebElement element = null;
			//	driver.getPageSource() 
  //By fetching the value of the ‘title’ attribute, we can verify the tooltip text in selenium.
		  	String toolTipText = element.getAttribute("title");
//How to locate a link using its text in Selenium?
		  WebElement link1 = driver.findElement(By.linkText("artOfTesting"));
		  WebElement link2 = driver.findElement(By.partialLinkText("artOf"));  
//So by locating elements of tagName ‘a’ we can find all the links on a webpage.
		  List<WebElement> links = driver.findElements(By.tagName("a"));	
		  
//findElements() –
			/*
			 * Used for finding all elements matching the specified locator value in the
			 * current webpage. All matching elements will be fetched and stored in the list
			 * of WebElements. The general syntax for the method is:
			 */	  
		  List elementList = driver.findElements(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		  
//What are the types of WebDriver APIs available in Selenium?
		  
		  //Selenium Webdriver is itself an API and it’s an interface.
		  
		  /*Selenium hierarchy contains two WebDriver - Remote WebDriver and Selenium WebDriver.
		   *  Remote WebDriver is a class that implements the Selenium WebDriver interface whereas
		   *   browser classes ChromeDriver(), FirefoxDriver() and etc. extend the Remote WebDriver.
		   *    There are many APIs and methods in Selenium and following are some as follows*/

	//1. Navigation Commands:

		/* navigate().to(URL) - To navigate to a particular URL.
		 Driver.navigate().to("http://qatechhub.com");

		 get(url) - To navigate to a particular URL.
		 Driver.get("http://qatechhub.com");

		 navigate().back() - Takes us  back in the browsing
		 Driver.navigate().back();

		 navigate().forward() - Takes us  forward in the browsing
		 Driver.navigate().forward();

		 navigate().refresh() - reloads the page.
		 Driver.navigate().refresh();*/

	// 2. Resizing Windows:

		/* Set Size - Sets the size of the window; the unit used is pixels.
		 Dimension d = new Dimension(640, 640);
		 Driver.manage().window().setSize(d);
		 Maximizing the Window - To set the size of the window as full size as per the screen.
		 Driver.manage().window().maximize();*/
		  
	//3. Deleting Cookies:

		 /*Delete cookies in Selenium as per below command

		 Driver.manage().deleteAllCookies();
		 This will not actually delete the physical cookies file from the browser but it bypasses 
		 these files that cookies don’t appear in the browsing experience.*/

	//4. Closing the Browser:

		/* close() - Closes the active window
		 Driver.close();
		 quit() - closes all the windows which are open in Selenium sessions
		 Driver.quit();*/
		 
	//5. Different Get Methods:
/*
		 getCurrentUrl() - This method returns the URL of the currently active page as a string.
		 getPageSource() - This method returns the complete HTML source code of the page.
		 getTitle() - This method returns the title of the current page as a string.
		 getWindowHandle() - This method returns the sessionId or windowHandle as a string.
		 getWindowHandles() - This method returns a set of sessionIds or windowHandles.*/
		  
	//6. Searching WebElements: 

		// To search for web elements on a web page below methods are used:

		/* findElement() - This method returns a web element that matches the required criteria.
		 WebElement element = Driver.findElement(By.id("text-box"));
		 findElements() - This method returns a list of web elements which match the criteria.
		 List<WebElement> allElements = Driver.findElements(By.id("checkbox"));
		 */
	//Mouse Operations:

		/*
		 * Mouse operations like mouse hover, drag, and drop, right clickor double click
		 * with Selenium actions class is used:
		 * 
		 * //Mouse Hover:
		 * 
		 * Actions action = new Actions(Driver);
		 * 
		 * WebElement mobileElement =
		 * Driver.findElement(By.linkText("Mobile & Accessories"));
		 * action.moveToElement(mobileElement).build().perform();
		 * 
		 * //Drag and Drop:
		 * 
		 * WebElement source = Driver.findElement(By.id("draggable")); WebElement target
		 * = Driver.findElement(By.id("droppable")); Actions action = new
		 * Actions(Driver); action.dragAndDrop(source, target).build().perform();
		 */
		  
	}
	
}



