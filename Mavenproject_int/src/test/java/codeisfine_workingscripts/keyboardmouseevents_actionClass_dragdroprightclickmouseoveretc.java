package codeisfine_workingscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardmouseevents_actionClass_dragdroprightclickmouseoveretc {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
// browser info		
		  WebDriverManager.chromedriver().setup();	    
	      //ChromeOptions options = new ChromeOptions();
		  //options.addArguments("disable-infobars");
		  driver = new ChromeDriver();	
		  driver.manage().window().maximize();
		 // driver.get("https://www.gmail.com");
		  Thread.sleep(2000);
//---------------------------------------------------------------------------------

		 	
//mouse over on elements and do mouse click on element	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
	//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	//mouseeventbuilder
	Actions mouseeventbuilder=new Actions(driver);	
	Thread.sleep(2000); 	
	WebElement mouseover1=driver.findElement(By.xpath("//b[normalize-space()='Admin']"));
	WebElement mouseover2=driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
	WebElement mouseover3=driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));
//mouse events over and click
	mouseeventbuilder.moveToElement(mouseover1).build().perform();
	mouseeventbuilder.moveToElement(mouseover2).build().perform();
	Thread.sleep(2000);
	mouseeventbuilder.moveToElement(mouseover3).click().build().perform();
//multiple mouse events in one line
mouseeventbuilder.moveToElement(mouseover1).moveToElement(mouseover2).moveToElement(mouseover3).click().build().perform();
////rightclick
	mouseeventbuilder.contextClick().build().perform();//rightclick
//drag and drop-use clickandhold movetoelement source target release 
	WebElement source_element=driver.findElement(By.xpath("//div[@id='box3']"));	
	WebElement target_element=driver.findElement(By.xpath("//div[@id='box103']"));	
	mouseeventbuilder.clickAndHold(source_element).moveToElement(target_element).release().build().perform();//drag and drop
//anotherway of draganddrop
	mouseeventbuilder.dragAndDrop(source_element, target_element);
//slider element -use dragAndDropBy
	driver.switchTo().frame(0);
	WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
	mouseeventbuilder.dragAndDropBy(slider, 300, 0).build().perform();
		  
		  
		//using Actions builder-seriesOfActions// enter value in search field and click		  
			 WebDriverManager.chromedriver().setup(); WebDriver driver =new ChromeDriver();
			 driver.manage().window().maximize();		 
			  driver.get("http://www.edureka.co/");	  
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// Using  Actions builder	  
			  Actions builder = new Actions(driver);		  
			  WebElement searchelement = driver.findElement(By.xpath("//input[@aria-label='Enter Course, Category or keyword']"));
			  searchelement.click();	
			  WebElement search = driver.findElement(By.xpath("//input[@id='search-input']"));
			  builder.moveToElement(search).build().perform();
			  Thread.sleep(2000);
	//seriesOfActions using			
				  Action seriesOfActions;
				  seriesOfActions = builder
					.sendKeys(searchelement, "Selenium")
					.sendKeys(search, Keys.ENTER)
					.build();
				  seriesOfActions.perform();
				  Thread.sleep(3000);
				  driver.quit();					  
		  
		  
//What are the different mouse actions that can be performed?
		  
			/*
			 * Selenium has the ability to handle various types of keyboard and mouse
			 * events. In order to perform action events, use
			 * org.openqa.selenium.interactions Actions in class. This API includes actions
			 * such as clicking multiple elements, drag and drop.
			 * 
			 * Let us create an object action of Action class.
			 * 
			 * Actions action = new Actions(driver); Now to focus on an element using
			 * WebDriver use action -
			 * 
			 * actions.moveToElement(element).perform(); Here perform() method is used to
			 * execute the action.
			 * 
			 * Let us see mouse events using selenium action class API -
			 * 
			 * click() : It Clicks on an element. doubleClick() : Double clicks onElement.
			 * contextClick() : Performs a context-click on an element. clickAndHold() : It
			 * Clicks on an element without releasing. dragAndDrop(source, target) : Invokes
			 * click-and-hold at the location and moves to the target location of the
			 * element before releasing the mouse. where the source is an element to grab
			 * and the target is the element to release. dragAndDropBy(source, xOffset,
			 * yOffset) : Performs click-and-hold at the source location and shifts by a
			 * given offset, then frees the mouse. Here xOffset is to shift horizontally and
			 * yOffset is to shift vertically. moveByOffset(x-offset, y-offset) : Shifts the
			 * mouse from its current position (or 0,0) by the given offset.
			 * moveToElement(toElement) : Shifts the mouse to the centre of the element.
			 * release() : Releases left mouse button at the existing mouse location
			 */		  

//different keyboard operations;---
		  
  	//.sendKeys(“sequence of characters”) – Used for passing character sequence to an input or textbox element.
  	//.pressKey(“non-text keys”) – Used for keys like control, function keys etc that are non-text.
  	//.releaseKey(“non-text keys”) – Used in conjunction with keypress event to simulate releasing a key from keyboard event.
  
//The different mouse events supported in Selenium are-
		//click(WebElement element)
		//doubleClick(WebElement element)
		//contextClick(WebElement element)
		//mouseDown(WebElement element)
		//mouseUp(WebElement element)
		//mouseMove(WebElement element)
		//mouseMove(WebElement element, long xOffset, long yOffset)
		  
//How to do drag and drop in Selenium?
		 // Ans. Using Action class, drag and drop can be performed in Selenium. Sample code-

			/*
			 * Actions builder = new Actions(driver); Action dragAndDrop =
			 * builder.clickAndHold(SourceElement) .moveToElement(TargetElement)
			 * .release(TargetElement) .build(); dragAndDrop.perform();
			 */
		  
		  
//Write the code to double-click an element?
		  
		  //Ans. Code to double click an element-
			/*
			 * Actions action = new Actions(driver); WebElement
			 * element=driver.findElement(By.id("elementId"));
			 * action.doubleClick(element).perform();
			 */
		  
	//How to send ALT/SHIFT/CONTROL key in Selenium WebDriver?
		/*
		 * When we generally use ALT/SHIFT/CONTROL keys, we hold onto those keys and
		 * click other buttons to achieve the special functionality. So it is not enough
		 * just to specify keys.ALT or keys.SHIFT or keys.CONTROL functions.
		 */
		/*
		 * String baseUrl = &ldquo;https://www.facebook.com&rdquo;;
		 * driver.get("baseUrl"); WebElement txtUserName =
		 * driver.findElement(By.id(&ldquo;Email&rdquo;);
		 * 
		 * Actions builder = new Actions(driver); Action seriesOfActions = builder
		 * .moveToElement(txtUerName) .click() .keyDown(txtUserName, Keys.SHIFT)
		 * .sendKeys(txtUserName, &ldquo;hello&rdquo;) .keyUp(txtUserName, Keys.SHIFT)
		 * .doubleClick(txtUserName); .contextClick(); .build();
		 * seriesOfActions.perform();
		 */
	}
}
		  	  
// Alert is used to display a warning message. It is a pop-up window that comes up on the screen.

//A few methods using which this can be achieved:

//Void dismiss(): This method is called when the ‘Cancel’ button is clicked in the alert box.
//Void accept(): This method is called when you click on the ‘OK’ button of the alert.
//String getText(): This method is called to capture the alert message.
//Void sendKeys(String stringToSed): This is called when you want to send some data to alert box.		  
		  
//Most commonly used keyboard and mouse events provided by the Actions class are in the table below:	  

  //clickAndHold()---	Clicks (without releasing) the current mouse location.
  //dragAndDrop()---	Performs click-and-hold at the location of the source element, moves.
  //source,target()--	Moves to the location of the target element, then releases the mouse.		  


		  //driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));//email fields
		  //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));//next button
		  
//Actions class utility is used to hover over a web element in Selenium WebDriver
			
			/*
			 * Actions action = new Actions(driver);
			 * //action.moveToElement(driver.findElement(By.xpath(
			 * "//*[@id=\"identifierId\"]"))).perform();
			 * action.moveToElement(driver.findElement(By.xpath(
			 * "//*[@id=\"identifierNext\"]/div/button"))).perform(); Thread.sleep(2000);
			 * action.moveToElement(driver.findElement(By.xpath(
			 * "//*[@id=\"identifierNext\"]/div/button"))).contextClick();
			 * Thread.sleep(2000); //action.moveToElement(driver.findElement(By.xpath(
			 * "//*[@id=\"identifierNext\"]/div/button"))).doubleClick();
			 * //action.moveToElement(driver.findElement(By.xpath(
			 * "//*[@id=\"identifierNext\"]/div/button/span"))).sendKeys(args);
			 */
	
//Write a code snippet to perform right-click an element in WebDriver.
//We will use Action class to generate user event like right-click an element in WebDriver.
		
		/*
		 * Actions action = new Actions(driver); WebElement element =
		 * driver.findElement(By.id("elementId"));
		 * action.contextClick(element).perform();
		 */ 
		
//Write a code snippet to perform mouse hover in WebDriver.
		
		//Actions action = new Actions(driver);  
		//WebElement element = driver.findElement(By.id("elementId"));  
		//action.moveToElement(element).perform(); 
		
//How do you perform drag and drop operation in WebDriver?
		/*
		 * //Code snippet to perform drag and drop operation:
		 * 
		 * //WebElement on which drag and drop operation needs to be performed
		 * WebElement fromWebElement = driver.findElement(By.id("elementId"));
		 * 
		 * //WebElement to which the above object is dropped WebElement toWebElement =
		 * driver.findElement(By.id("elementId"));
		 * 
		 * //Creating object of Actions class to build composite actions Actions builder
		 * = new Actions(driver);
		 * 
		 * //Building a drag and drop action Action dragAndDrop =
		 * builder.clickAndHold(fromWebElement) .moveToElement(toWebElement)
		 * .release(toWebElement) .build();
		 * 
		 * //Performing the drag and drop action dragAndDrop.perform();
		 */
			
//-----------------------------------------------------------
			
// Instantiating Action Interface
			/*
			 * Actions actions=new Actions(driver); // howering on the dropdown
			 * actions.moveToElement(driver.findElement(By.id("id of the dropdown"))).
			 * perform(); // Clicking on one of the items in the list options WebElement
			 * subLinkOption=driver.findElement(By.id("id of the sub link"));
			 * subLinkOption.click();
			 */
	
//Perform Right Click Action In Selenium:
		
		/*Actions action = new Actions(driver);
		By locator = By.cssSelector(".context-menu-one");
    //Wait for the element. Used Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.presenceOfElementLocated(locator)); 
            WebElement rightClickElement=driver.findElement(locator);
            
    //contextClick() method to do right click on the element
            
            action.contextClick(rightClickElement).build().perform();
            WebElement getCopyText =driver.findElement(By.cssSelector(".context-menu-icon-copy"));
            
    //getText() method to get the text value
            String GetText = getCopyText.getText();
            //To print the value
            System.out.println(GetText);
            //To close the browser
            //driver.close();
//use dragAndDrop() method. It accepts two parametes source and target.                     
            //To get source locator
    		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
             //To get target locator
    		WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
             //dragAndDrop(source, target) method accepts two parameters source and locator. 
             //used dragAndDrop method to drag and drop the source locator to target locator
    		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
	
	
	
//Mouse Events Using Selenium Actions Class API:
	
	click (): Simply click on an element
	doubleClick (): Double clicks on Element
	contextClick() : Performs a context-click (right-click) on an element
	clickAndHold(): Clicks at the present mouse location (without releasing)
	dragAndDrop(source, target): Clicks-and-hold at the source location and moves to the target location of the element before releasing the mouse. source – element to grab, target – element to release
	dragAndDropBy(source, xOffset, yOffset): Invokes click-and-hold at the source location, shifts by a given offset, then frees the mouse. xOffset  is to shift horizontally and yOffset is to shift vertically
	moveByOffset(x-offset, y-offset): Shifts the mouse from its current position or 0,0 by the given offset. x-offset – Sets the horizontal offset (negative value – shifting the mouse to the left), y-offset – Sets the vertical offset (negative value – shifting the mouse to the up)
	moveToElement(toElement): It shifts the mouse to the center of the element
	release(): Releases the depressed left mouse button at the existing mouse location

	}

}
*/

