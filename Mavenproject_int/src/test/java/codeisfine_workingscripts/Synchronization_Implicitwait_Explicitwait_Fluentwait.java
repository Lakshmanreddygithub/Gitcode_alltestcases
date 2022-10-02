package codeisfine_workingscripts;

import org.openqa.selenium.WebDriver;

public class Synchronization_Implicitwait_Explicitwait_Fluentwait {
 public static WebDriver driver;
	public static void main(String[] args) {
	
//What are the types of waits supported by WebDriver?
		
	//Implicit wait - Implicit wait commands Selenium to wait for a certain amount of time before throwing a “No such element” exception.

		//driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.2000);

	//Explicit wait - Explicit wait is used to tell the Web Driver to wait for certain conditions before throwing an "ElementNotVisibleException" exception.

		//WebDriverWait wait = new WebDriverWait(WebDriver Reference, TimeOut);

	//Fluent wait - It is used to tell the web driver to wait for a condition, as well as the frequency with which we want to check the condition before throwing an "ElementNotVisibleException" exception.

		//Wait wait1 = new FluentWait(WebDriver reference).withTimeout(timeout, SECONDS).pollingEvery(timeout, SECONDS).ignoring(Exception.class);
	
//The below methods will delay the speed of the execution. 

		//Thread.sleep(): The current thread will stop for a specified period of time. It only waits once when the command is given. It takes only a single argument that is Integer format.

		//set sleep(): This command will stop the execution for every selenium command. This command is used only for demonstration purposes and also for a slow web application.
		
//Implicit wait instructs the WebDriver to wait for some time by polling the DOM.
	//-Once you have declared implicit wait, it will be available for the entire life of the WebDriver instance. By default, the value will be 0. If you set a longer default, then the behavior will poll the DOM on a periodic basis depending on the browser/ driver implementation.

//Explicit wait instructs the execution to wait for some time until some condition is achieved.
	//-Some of those conditions to be attained are:
		//1.elementToBeClickable
		//2.elementToBeSelected
		//3.presenceOfElementLocated		
//How do you achieve synchronization in WebDriver?
		//It is a mechanism that involves more than one component to work parallel with each other.
		//Synchronization can be classified into two categories:
	//Unconditional: In this we just specify timeout value only. We will make the tool to wait until a certain amount of time and then proceed further.
	//Conditional: It specifies a condition along with timeout value, so that tool waits to check for the condition and then comes out if nothing happens.		

//Explicit waits are instantiated for a particular instance only, whereas implicit waits are not.	
//explicit wait in Selenium?
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
//expected conditions that can be used in Explicit waits?
		//Some of the commonly used expected conditions of an element that can be used with explicit waits are-
			//elementToBeClickable(WebElement element or By locator)
			//stalenessOf(WebElement element)
			//visibilityOf(WebElement element)
			//visibilityOfElementLocated(By locator)
			//invisibilityOfElementLocated(By locator)
			//attributeContains(WebElement element, String attribute, String value)
			//alertIsPresent()
			//titleContains(String title)
			//titleIs(String title)
			//textToBePresentInElementLocated(By, String)

		
//FluentWait
		/*
		 * //Wait wait = new FluentWait(driver)
		 * 
		 * .withTimeout(20, SECONDS)
		 * 
		 * .pollingEvery(5, SECONDS)
		 * 
		 * .ignoring(NoSuchElementException.class);
		 * 
		 * WebElement textBox = wait.until(new Function<webdriver,webElement>() {
		 * 
		 * public WebElement apply(WebDriver driver) {
		 * 
		 * return driver.findElement(By.id("textBoxId"));
		 * 
		 * } } );
		 */
	
		
//Synchronization indetail ;--
		
		/*
		 * Synchronization is a mechanism that involves two or more components that work
		 * parallel with Each other.
		 * 
		 * In Test Automation, Application Under Test and Test Automation tool are the
		 * two components.
		 * 
		 * Both these components have their own speed, and to make these two components
		 * should move with the same and desired speed, we should write our scripts in
		 * such a way that we will not encounter "Element Not Found" errors which will
		 * consume time again in debugging.
		 * 
		 * Unconditional and Conditional Synchronization are the two categories of
		 * synchronization.
		 * 
		 * Unconditional Synchronization:
		 * 
		 * In Unconditional synchronization, we specify the timeout value only. The tool
		 * will wait until a certain amount of time and then proceed further.
		 * 
		 * Examples: Wait() and Thread.Sleep(),
		 * 
		 * The disadvantage in the above statements is, even though the application is
		 * ready there is a chance of unnecessary waiting time.
		 * 
		 * When we interact with third-party systems like interfaces, it is not possible
		 * to write a condition or check for a condition. In such scenarios, we have to
		 * make applications wait for a certain amount of time by specifying timeout
		 * value and the unconditional wait comes as help here.
		 * 
		 * Conditional Synchronization:
		 * 
		 * In conditional synchronization, we specify a condition along with timeout
		 * value, so the tool waits and checks for the condition and then it come out if
		 * nothing happens.
		 * 
		 * It is important to set the timeout value in conditional synchronization
		 * because the tool should proceed further instead of making the tool to wait
		 * for a particular condition to satisfy.
		 * 
		 * In Selenium implicit Wait and Explicit Wait are two components of conditional
		 * statements.
		 * 
		 * There are two types of Conditional Synchronization:
		 * 
		 * Implicit Wait Explicit Wait Implicit Wait:
		 * 
		 * Implicit Wait tells the WebDriver to before throwing exception
		 * NoSuchElement/ElementNotVisible, wait until the stated time. Waiting time
		 * between each consecutive step is taken by default across the test script. So,
		 * the next test Step will be executed only when the specified time is elapsed.
		 * 
		 * Syntax:
		 * 
		 * driver.Manage().Timeouts().ImplicitlyWait(TimeSpan.FromSeconds(30));
		 * FromMilliSecondsThe Implicit wait takes two arguments: TimeSpan (timeToWait)
		 * and time measure.
		 * 
		 * FromSeconds FromMinutes FromHours FromDays Explicit Wait:
		 * 
		 * When page load dynamically explicit waits are good to use. Before throwing
		 * NoSuchElement (or) ElementNotVisible Exceptions, explicit Wait tells the
		 * WebDriver to Wait till the specified condition is met or maximum time
		 * elapses. Explicit waits are applied for the specified test Step in the test
		 * script.
		 * 
		 * We must first create an instance for the “WebDriverWait” class to use
		 * Explicit wait.
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(30));
		 * wait.Until(ExpectedConditions.VisibilityOfAllElementsLocatedBy(By.Id(
		 * element_ID))); The reference variable “wait” informs the WebDriver to wait
		 * until the Expected condition to occur (or) Wait for the specified time of
		 * 30seconds, whichever shows in first place before throwing an exception.
		 * 
		 * Below are the ExpectedConditions:
		 * 
		 * AlertIsPresent() ElementSelectionStateToBe()
		 * VisibilityOfAllElementsLocatedBy() ElementToBeSelected()
		 * FrameToBeAvaliableAndSwitchToIt() InvisibilityOfTheElementLocated()
		 * TextToBePresentInElementLocated() TextToBePresentInElementValue() TitleIs()
		 * TitleContains() VisibilityOf() VisibilityOfAllElements()
		 * VisibilityOfElementLocated() InvisibilityOfElementWithText()
		 * ElementToBeClickable() PresenceOfAllElementsLocatedBy()
		 * PresenceOfElementLocated() TextToBePresentInElement() The Implicit wait is
		 * simple as compared to Explicit wait and can be declared in setup method of
		 * the test script in single line of code. But, despite being easy and simple to
		 * apply and hence rising scope of Explicit Waits as these waits can be applied
		 * for a specified test Step in test script.
		 */
		
		
		
	}

}

//Explicit wait.  

/*
 * Syntax:
 * 
 * WebDriverWait wait = new WebDriverWait(WebDriverReference,TimeOut); Below is
 * the list of Expected Conditions used in Explicit Wait
 * 
 * alertIsPresent() elementSelectionStateToBe() elementToBeClickable()
 * elementToBeSelected() frameToBeAvaliableAndSwitchToIt()
 * invisibilityOfTheElementLocated() invisibilityOfElementWithText()
 * presenceOfAllElementsLocatedBy() presenceOfElementLocated()
 * textToBePresentInElement() textToBePresentInElementLocated()
 * textToBePresentInElementValue() titleIs() titleContains() visibilityOf()
 * visibilityOfAllElements() visibilityOfAllElementsLocatedBy()
 * visibilityOfElementLocated()
 */

//FluentWait syntax is -
	/*
	 * Wait<WebDriver> wait = new FluentWait(WebDriver reference)
	 * .withTimeout(timeout, SECONDS) .pollingEvery(timeout, SECONDS)
	 * .ignoring(Exception.class);
	 */
	

