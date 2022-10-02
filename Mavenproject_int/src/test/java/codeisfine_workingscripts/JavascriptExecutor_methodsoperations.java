package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutor_methodsoperations {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// browser info
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		  Thread.sleep(2000);
		  
		  //WebElement Element=	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		  //driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));//email fields
		  //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));//next button
//-----------------------------------------------
		  
//How to execute JavaScript code in Selenium?
		  
		 // Ans. JavaScript code can be executed in Selenium using JavaScriptExecuter.
		  //Sample code for javascript execution-

		  WebDriver driver = new ChromeDriver();
		  if (driver instanceof JavascriptExecutor) {
		   ((JavascriptExecutor)driver).executeScript("{JavaScriptCode}");
		  }
				  
//window.resizeTo()
		  
//To set the window to a particular size, use window.resizeTo() method. Check the below piece of code:
	((JavascriptExecutor)driver).executeScript("window.resizeTo(1024, 768);");
  
//scrollIntoView().
	
//How to scroll down to a particular element?
	//To scroll down to a particular element on a web page, we can use the function scrollIntoView(). Example:	
		  WebElement Element=	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", Element);
		  
/*
 * JavaScriptExecutor is an interface which provides a mechanism to execute
 * Javascript through the Selenium WebDriver. It provides “executescript” and
 * “executeAsyncScript” methods, to run JavaScript in the context of the
 * currently selected frame or window.
 */ 		  
		  
//We can handle hidden elements by using javaScript executor	
			//(JavascriptExecutor(driver)).executeScript("document.getElementsByClassName(ElementLocator).click();");
		  
//Use JavascriptExecutor_Ifselenium_commandsfails like click type etc...
		/*
		 * //Text can be entered into a textbox using JavaScriptExecutor
		 * JavascriptExecutor js= (JavascriptExecutor) driver;
		 * //js.executeScript("document.getElementById(‘email').value=“abc.efg@xyz.com”)
		 * ;
		 */// How to scroll down a page using JavaScriptexecutor?
		/*
		 * // scrollBy() method is used to scroll down the webpage JavascriptExecutor
		 * js= (JavascriptExecutor) driver;
		 * driver.get("https://www.google.com/intl/en-GB/gmail/about/"); // Scroll down
		 * to the desired location js.executeScript("window.scrollBy(0,5000)");
		 */
	}
}

//to perform Scroll on application using Selenium
		/*
		 * driver.navigate().to("https://www.softwaretestingmaterial.com");
		 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver;
		 * //js.executeScript("window.scrollBy(0,250)", ""); //To scroll to the Bottom
		 * of the Web Page using Selenium WebDriver
		 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //To
		 * Scroll Web page Up using Sleneium WebDriver: Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-250)", "");
		 * 
		 * // //Here i pass values based on css style. Yellow background color with
		 * solid red color border. WebElement ele =
		 * driver.findElement(By.xpath("//*[@id=\"identifierId\"]")); js.
		 * executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
		 * , ele);}
		 */
	
//How would you fill a text field without calling the sendKeys()?
//Ans. It's a bit slower than the sendKeys() method but we do have means to type in a text field.
// JavascriptExecutor webdriver = null;

/*
 * //To Scroll Web page Down using Selenium WebDriver use JavascriptExecutor
 * //to perform Scroll on application using Selenium
 * driver.navigate().to("https://www.softwaretestingmaterial.com");
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,250)", ""); //To scroll to the Bottom of
 * the Web Page using Selenium WebDriver
 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //To
 * Scroll Web page Up using Sleneium WebDriver:
 * js.executeScript("window.scrollBy(0,-250)", "");
 */

// JavascriptExecutor JS = (JavascriptExecutor)webdriver;
// JS.executeScript("Script,Arguments");
// JS.executeScript("document.getElementById(User').value='admin@testmail.com'");
// JS.executeScript("document.getElementById('Pass').value='######'");

//How to input text in the text box without calling the sendKeys()?
// To initialize js object
// JavascriptExecutor JS = (JavascriptExecutor)webdriver;
// To enter username
// --JS.executeScript("document.getElementById('User').value='SoftwareTestingMaterial.com'");
// To enter password
// JS.executeScript("document.getElementById('Pass').value='tester'");

	
//How to read a JavaScript variable in Selenium WebDriver?
// can read JavaScript variable By using JavascriptExecutor

//To initialize the JS object.
//JavascriptExecutor JS = (JavascriptExecutor) webdriver;
//To get the site title.
// String title = (String)JS.executeScript("return document.title");
// System.out.println("Title of the webpage : " + title);
//----------------------------------------------------------------------------------------------

//What is JavaScriptExecutor and in which cases JavaScriptExecutor will help in Selenium automation?
// In general, we click on an element using click() method in Selenium.
//JavascriptExecutor_Ifselenium_commandsfails
// For example:
//driver.findElement(By.id("Id Value")).click();
/*
 * //Sometimes web controls don’t react well against selenium commands and we
 * may face issues with the above statement (click()). To overcome such kind of
 * situation, we use JavaScriptExecutor interface.
 */
/*
 * It provides a mechanism to execute Javascript through Selenium driver. It
 * provides “executescript” & “executeAsyncScript” methods, to run JavaScript in
 * the context of the currently selected frame or window.
 * 
 * There is no need to write a separate script to execute JavaScript within the
 * browser using Selenium WebDriver script. Just we use predefined interface
 * named ‘Java Script Executor’. We need to import the JavascriptExecutor
 * package in the script.
 */
// JavascriptExecutor js = (JavascriptExecutor) driver;
// js.executeScript("Script,Arguments");

/*
 * Script – The JavaScript to execute Arguments – The arguments to the
 * script(Optional). May be empty. Returns – One of Boolean, Long, String, List,
 * WebElement, or null.
 */
/*
 * Let’s see some scenarios we could handle using this JavascriptExecutor
 * Interface:
 * 
 * 1. To type Text in Selenium WebDriver without using sendKeys() method 2. To
 * click a Button in Selenium WebDriver using JavaScript 3. To handle Checkbox
 * 4. To generate Alert Pop window in selenium 5. To refresh browser window
 * using Javascript 6. To get innertext of the entire webpage in Selenium 7. To
 * get the Title of our webpage 8. To get the domain 9. To get the URL of a
 * webpage 10. To perform Scroll on an application using Selenium 11. To click
 * on a SubMenu which is only visible on mouse hover on Menu 12. To navigate to
 * different page using Javascript
 */
//How To Highlight Element Using Selenium WebDriver?
// By using JavascriptExecutor interface, we could highlight the specified
// element
 
//What is JavaScriptExecutor and in which cases JavaScriptExecutor will help in Selenium automation?

	/*
	 * In selenium mostly we click on an element using click() method.
	 * 
	 * Many times web controls don’t react against selenium commands and we face
	 * issues with the Click() statement. To overcome such a situation, in selenium
	 * we use the JavaScriptExecutor interface.
	 * 
	 * JavaScriptExecutor executes Javascript using Selenium driver and provides
	 * “executescript” & “executeAsyncScript” methods, to run JavaScript in the
	 * context of the currently selected frame or window.
	 * 
	 * To execute JavaScript within the browser using the Selenium WebDriver script,
	 * writing a separate script is not required. Just use a predefined interface
	 * named ‘Java Script Executor’ and need to import the JavascriptExecutor
	 * package in the script.
	 * 
	 * Package:
	 * 
	 * import org.openqa.selenium.JavascriptExecutor; import
	 * org.openqa.selenium.JavascriptExecutor; Syntax:
	 * 
	 * JavascriptExecutor js = (JavascriptExecutor) driver;
	 * js.executeScript(Script,Arguments); where Script is the JavaScript to be
	 * executed.
	 * 
	 * Arguments are the arguments to the script and are optional and can be empty.
	 * 
	 * JavascriptExecutor returns either Boolean, or Long, or String, or List, or
	 * WebElement, or null.
	 * 
	 * Let us discuss some scenarios we could handle using JavascriptExecutor :
	 * 
	 * Without using the sendKeys() method, you can use this interface to type Text
	 * in Selenium WebDriver. Using JavascriptExecutor, you can click on a Button.
	 * You can use it to handle the Checkboxes. It can be used to generate the Alert
	 * Pop window. You can Refresh browser window using Javascript You can get the
	 * inner text of the entire webpage in Selenium Get the Title of webpage Get the
	 * domain Get the URL of a webpage Perform Scroll on an application using
	 * Selenium Click on a SubMenu which is only visible on mouse hover on Menu
	 * Navigate to a different page using Javascript.
	 * 
	 */