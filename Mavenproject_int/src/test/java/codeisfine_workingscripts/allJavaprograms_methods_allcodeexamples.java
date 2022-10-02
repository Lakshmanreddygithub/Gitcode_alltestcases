package codeisfine_workingscripts;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import Utility_allstaticmethods.Utility_allstaticmethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class allJavaprograms_methods_allcodeexamples{
	
public static WebDriver driver;	
	 //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");	 
	public static void main(final String[] args) throws InterruptedException, IOException {
// browser info			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();	
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("https://www.gmail.com");
		    Thread.sleep(2000);		
		// driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));//email fields
		// driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));//next
		// button
//-----------------------------------------------------------------	  

			
//create object to invoke the  method with in the same class
		/*
		 * //method public void launch(){ WebDriverManager.chromedriver().setup();
		 * driver = new ChromeDriver(); driver.manage().window().maximize(); } //main
		 * method here public static void main(String[] args) { //object created to
		 * invoke the above method ruffnotes ruffnotes_obj=new ruffnotes();
		 * ruffnotes_obj.launch(); //driver.get("https://www.gmail.com"); }
		 */
		    
//locators className-tagName-cssSelector
    //driver.findElement(By.className("profileheader"));
  //Locating by TagName
  	//driver.findElement(By.tagName("select")).click();
  //driver.findElement(By.cssSelector(“input#email”)).sendKeys(“myemail@email.com”);

//What are some commonly encountered exceptions in Selenium?
  	
  	//NoSuchElementException – When no element could be located by the locator provided.
  	//ElementNotVisibleException – When an element is present in the DOM but is not visible.
  	//NoAlertPresentException – When we try to switch to an alert box but the targetted alert is not present.
  	//NoSuchFrameException – When we try to switch to a frame but the targetted frame is not present.
  	//NoSuchWindowException – When we try to switch to a window but the targetted window is not present.
  	//UnexpectedAlertPresentException – When an unexpected alert blocks the normal interaction of the driver.
  	//TimeoutException – When a command execution gets a timeout.
  	//InvalidElementStateException – When the state of an element is not appropriate for the desired action.
  	//NoSuchAttributeException – When we are trying to fetch an attribute’s value but the attribute is not correct.
  	//WebDriverException – When there is some issue with the driver instance preventing it from getting launched.
  				    		    
//try catch example		
		  		WebElement saveButton1 = driver.findElement(By.id("Save"));
		  		try{
		  		if(saveButton1.isDisplayed()){
		  		saveButton1.click();
		  		   }
		  		}
		  		catch(NoSuchElementException e){
		  		e.printStackTrace();
		  		}					  					
//how to record video of test execution
	  	
		/*
		 * @Test void test1 () throws Exception{
		 * 
		 * //start record utility method-this will create video of the test execution
		 * 
		 * ScreenRecorderUtil.startRecord("test1");
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver();
		 * 
		 * driver.manage().window().maximize();
		 * //-------------------------------------------------------------------
		 * driver.get("https://www.gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).click(
		 * ); driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).
		 * sendKeys("screen record utility"); //stop record utility method
		 * ScreenRecorderUtil.stopRecord(); }
		 */  

//date and time stamp for results
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
	String reportName="Test-Report-"+timeStamp+".html";		    

//read data from hasmap data structure and logi
		HashMap<String,String> hmdo=new HashMap<String,String>();
	 	hmdo.put("val1", "hmdovalue1@hmdovalue2");
	 	hmdo.put("val2", "test@test2");	
//data from hashmap - set value in the field 
 	driver.get("https://www.gmail.com"); 	 	
 	String testdata=hmdo.get("val1");
 	String testdata2=hmdo.get("val2");		 	
 	String arrayvalue[]=testdata.split("@");		 	
 	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(arrayvalue[0]);
 	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys(arrayvalue[1]);		    
    
		 
//log4j-generate logs-add log4j	maven dependency-and add log4j properties file or log4jxml in the project directory	 
		    
	Logger logger = Logger.getLogger("ruffnotes");
	//DOMConfigurator.configure("Log4j.xml");
	//PropertyConfigurator.configure("Log4j.properties");

	driver.get("https://www.gmail.com");
	logger.info("browser launched");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("logger info");
	logger.info("value entered in the field");		    
		    
//login using encode-decode pasword

	  driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	  Thread.sleep(10);
	  driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(Utility_allstaticmethods.decodestring("YWRtaW4xMjM"));						  
	  driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			 
		    	    
//convert byte to string 		    
//encode password
		 	String str1="test123";
		 	byte[] encodedstring=Base64.encodeBase64(str1.getBytes());
		 	//convert byte to string 
		 	String Convertedbytetostring= new String(encodedstring);
		 	System.out.println("encoded string:"+new String(Convertedbytetostring));		 	
//Decode password		 			 	
		 	byte[] decodedstring=Base64.decodeBase64(Convertedbytetostring);
		 	System.out.println("decoded string:"+new String(decodedstring));  			
		    
		    
		    
		    
		    
//encode password
		 	String str2="test123";
		 	byte[] encodedstring2=Base64.encodeBase64(str2.getBytes());
		 	//convert byte to string 
		 	String Convertedbytetostring1= new String(encodedstring2);
		 	System.out.println("encoded string:"+new String(Convertedbytetostring1));		 	
//Decode password		 			 	
		 	byte[] decodedstring1=Base64.decodeBase64(Convertedbytetostring1);
		 	System.out.println("decoded string:"+new String(decodedstring1));  		    
		    
		    
		    
		    
		    
	
//to refresh
  	//js.executeScript("history.go(0)");			
//to scroll
  	//js.executeScript("arguments[0].scrollIntoView(true);",element);		    
 	    
//generate alert window using javascript executor	
	driver.get("https://www.gmail.com");
	Thread.sleep(10);
	WebElement  NextbtnElement=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	//Element.click();
	Utility_allstaticmethods.clickElementByJS(NextbtnElement, driver);
	Utility_allstaticmethods.generatealertwindow("clicked on next btn", driver);
			
		    
//clickElement using javascript executor	
	driver.get("https://www.gmail.com");
	Thread.sleep(10);
	WebElement  NextbtnElement1=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	//Element.click();
	Utility_allstaticmethods.clickElementByJS(NextbtnElement1, driver);		    
		    
	    
//how to take screenshot	
  driver.get("https://www.gmail.com");
  Thread.sleep(20);
  File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  File target=new File(".\\projectscreenshots\\gmailtoday.jpg");
  FileUtils.copyFile(source,target);
		    
		    
//highlightelement use Utility_allstaticmethods-javascript executor
	// browser info		 	     
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();	
		  driver.manage().window().maximize();			
		  driver.get("https://www.gmail.com");
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
	Utility_allstaticmethods.highlightelement(element1, driver);
	
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
	Utility_allstaticmethods.highlightelement(element2, driver);
		  	
		  			 	
//mouse over on elements and do mouse click on element	
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
 	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
 	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
 	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
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
// multiple mouse events in one line
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
	

//handle alert with ok buton			 	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.xpath("//button[contains(text(),'click the button to display an ')]")).click();
	Thread.sleep(2000);
	System.out.println("text on aler box :"+driver.switchTo().alert().getText());//get the text on box
	driver.switchTo().alert().accept();//jump to alert and click on button
//handle alert with ok and cancel buton	
	driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='click the button to display a confirm box']")).click();
	Thread.sleep(2000);
	System.out.println("text on aler box :"+driver.switchTo().alert().getText());//get the text on box
	//driver.switchTo().alert().dismiss();//will click on cancel
	  		 	driver.switchTo().alert().accept();
//handle alert box = enter the value in text box		 	
	driver.findElement(By.xpath("//a[normalize-space()='Alert with Textbox']")).click();
	driver.findElement(By.xpath("//button[normalize-space()='click the button to demonstrate the prompt box']")).click();
	Thread.sleep(2000);
	System.out.println("text on aler box :"+driver.switchTo().alert().getText());//get the text on box
	driver.switchTo().alert().sendKeys("test");
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();		   

			 
//Handle authentication popups
		 	 	
		 	driver.get("https://the-internet.herokuapp.com/basic_auth");		 	
		 	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");		    
		    
//headless browser test code-no ui only backend execution	
		ChromeOptions options1 = new ChromeOptions();	
		options1.setHeadless(true);
		options1.addArguments("--headless");	
				
//datatypes in java:--  		  
	  int c1=10; 		  
	  long h1=100000;		  
	  double d1=10.00;  
	  float e1;		  
	  char f1='h'; 
	  String g1="uft";
	System.out.println(c1);  
	System.out.println(h1);
	System.out.println(d1);	
	System.out.println(f1);
	System.out.println(g1);
	
//	ChromeOptions
			ChromeOptions options5 = new ChromeOptions();	
			options5.setHeadless(true);
			options5.addArguments("--headless");		
			options5.addArguments("disable-infobars");
			 options5.addArguments("start-maximized");
			 String BrowserName1=options1.getBrowserName();
			 System.out.println(BrowserName1);	
		
//using Actions builder-seriesOfActions// enter value in search field and click		  
	 //WebDriverManager.chromedriver().setup(); WebDriver driver =new ChromeDriver();
	 driver.manage().window().maximize();		 
	  driver.get("http://www.edureka.co/");	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//Using  Actions builder	  
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
		
//In case you want to set a custom size for the browser window, then you can set your own dimensions as shown in the below code snippet.

		Dimension d = new Dimension(420,600);
		driver.manage().window().setSize(d); 		
		
//use extends keyword and call the methods/reusable functions  which are in other class

		/*
		 * //public class ruffnotes extends Methods_nomainmethod { //main method //
		 * public static void main(String[] args) throws InterruptedException {
		 * //browsersetup(); //calculatepercent(); //terminatetest(); //} }
		 */	
		
//scanner object for getting captcha code
		Scanner scan = new Scanner(System.in);
		String captcha = scan.nextLine();
		driver.findElement(By.id("")).sendKeys(captcha);

//calculatepercent-verify using if condition-- Click on Percent Calculators
	      driver.findElement(By.xpath("//a[normalize-space()='Percentage Calculator']")).click();
	      Thread.sleep(2000);
       // Enter value 10 in the first number of the percent Calculator
	      driver.findElement(By.id("cpar1")).sendKeys("10");	      
	      // Enter value 50 in the second number of the percent Calculator
	      driver.findElement(By.id("cpar2")).sendKeys("50");	      
	      // Click Calculate Button
	      driver.findElement(By.xpath("(//input[@value='Calculate'])[1]")).click();
	      Thread.sleep(2000);	      
//Get the Result Text based on its xpath
	      String result =
	         driver.findElement(By.xpath("//div[@id=\"content\"]/h2[1]")).getText();	      
	      // Print a Log In message to the screen
	      System.out.println(" The Result is " + result);
//verify using if condition      
	      if(result.contains("5")) {
	         System.out.println(" The Result is Pass");
	      } else {
	         System.out.println(" The Result is Fail");
	      }		
		
		  
//untill() and visibilityOfElementLocated()--Explanation:

	//The first line says how much time to wait which is 10 seconds.
		/*
		 * The second condition says an expected condition to wait for. Here it is an
		 * element with id’name’ in the mentioned xpath.
		 */
			  
	//WebDriverWait wait = new WebDriverWait(driver, 10);
	//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated (By.xpath("//input[@id=’name’]")));

//untill() and alertIsPresent()		
	
	//The first line says how much time to wait – that is 10 seconds.
	//The second condition says an expected condition to wait for. Here it is an alert pop up.	  
		  
	//WebDriverWait wait1 = new WebDriverWait(driver, 10);
	//Alert Alert1 = wait1.until(ExpectedConditions.alertIsPresent());
			
		

//chrome options-getbrowser name etc...
		
		WebDriverManager.chromedriver().setup();
		  ChromeOptions options4 = new ChromeOptions();
	        options4.addArguments("start-maximized");
		  //WebDriver driver = new ChromeDriver(options);
		  //driver.manage().window().maximize();
		 String BrowserName=options4.getBrowserName();
		 System.out.println(BrowserName);
		

//WebDriver conditions and Exception Handling

		/*
		 * //When we aspire to verify the presence of any element on the webpage using
		 * various WebDriver ‘s conditional commands, WebDriver presumes the web element
		 * to be present on the web page. If the web element is not present on the web
		 * page, the conditional commands throw a “NoSuchElementPresentException”. Thus
		 * to avoid such exceptions from halting the program execution, we use Exception
		 * Handling mechanisms. Refer the code snippet below:
		 */
		WebElement saveButton = driver.findElement(By.id("Save"));
		try{
		if(saveButton.isDisplayed()){
		saveButton.click();
		   }
		}
		catch(NoSuchElementException e){
		e.printStackTrace();
		}			
		

//WebDriver methods counts the number of elements?
				  //System.out.println(driver.findElements(By.id("search")).size());
				 
//given below retrieve the title of a web page?
				  //System.out.println(driver.getTitle());
			 
//Selenium selenium = new WebDriverBackedSelenium(driver, "http://www.techbeamers.com/");
				
//Which of the following WebDriver method that supports moving between named windows?	  
				  
	 //driver.switchTo().window("windowName");		  
	
	  //HtmlUnitDriver driver = new HtmlUnitDriver(true);
	  		
		

//The code snippet below illustrates the multiple selections in a drop down.

	// select the multiple values from a dropdown
	Select selectByValue1 = new Select(driver.findElement(By.id("SelectID_One")));
	selectByValue1.selectByValue("greenvalue");
	selectByValue1.selectByVisibleText("Red");
	selectByValue1.selectByIndex(2);	
			
	
//ChromeOptions 
		
		 WebDriverManager.chromedriver().setup();
		  ChromeOptions options2 = new ChromeOptions();
	        options2.addArguments("start-maximized");
		  WebDriver driver1 = new ChromeDriver(options2);
		  //driver.manage().window().maximize();
		 String BrowserName2=options2.getBrowserName();
		 System.out.println(BrowserName2);
		
		
		
//We can delete cookies in 3 ways.
		driver.manage().deleteCookieNamed("CookieName");
		//driver.manage().deleteCookie(CookieId);
		driver.manage().deleteAllCookies();		
		
//What exactly are the below instructions meant for?

		/*
		 * FirefoxProfile profile = new FirefoxProfile();
		 * profile.addAdditionalPreference("general.useragent.override",
		 * "some logical name"); WebDriver driver = new FirefoxDriver(profile);
 
		 * ans : Changing the User Agent.
		 */
		
		
		
		
//Right click on the LogIn button
        Actions action = new Actions(driver);
        WebElement loginBox = driver.findElement(By.cssSelector(".#u_0_a"));
        action.contextClick(loginBox).perform();
        //dragdrop
        action.dragAndDrop(loginBox, loginBox).build().perform();
               
//Another way to perform click on Login button using action class	?
		
		 // click on the LogIn button
        WebElement loginBtn = driver.findElement(By.id("u_0_a"));
                 Actions act = new Actions(driver);
                 act.moveToElement(loginBtn).click().perform();
         //Third way is press Enter key
                 // click on the Log In button
                 WebElement loginBtn1 = driver.findElement(By.id("u_0_a"));
                          Actions act1 = new Actions(driver);
                          act.sendKeys(Keys.ENTER);		
//	WebElement -getAttribute 
		
			WebElement googleSrchBtn = driver.findElement(By.name("bySrchButton"));
			System.out.println("Name of the button is:- " +googleSrchBtn.getAttribute("name"));
			System.out.println("Id of the button is:- "+ googleSrchBtn.getAttribute("id"));
			System.out.println("Class of the button is:- "+ googleSrchBtn.getAttribute("class"));
			System.out.println("Invalid Attribute status of the button is:- "+ googleSrchBtn.getAttribute("status"));
			System.out.println("Label of the button is:- "+ googleSrchBtn.getAttribute("aria-label"));
		
//tooltip
		WebElement edit = driver.findElement(By.id("header_logo"));
		String tooltiptext = edit.getAttribute("title");
		System.out.println(tooltiptext);
		
//code to find the number of frames in a web page -
		
	driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");
	System.out.print("No. of Frames:");		
	System.out.println(driver.findElements(By.tagName("frame")).size());
				
//To get the attribute value using selenium WebDriver, we can use

		//'element.getAttribute(attributeName)'.
		WebElement searchTextBox= driver.findElement(By.id("lst-ib"));
		// retrieving html attribute value using getAttribute() method
		String titleValue=searchTextBox.getAttribute("title");
		
//What are the three arguments that can be taken into consideration for Switching?
		//Answer: The three arguments that can be taken into consideration for Switching includes:

		/*
		 * a number: This will select the number by its zero-based index. A name or ID:
		 * This will select a frame by its name or ID. Previously found WebElement: This
		 * will help in using the previously located WebElement to select a frame.
		 */
		
		
//findElements() –
			/*
			 * Used for finding all elements matching the specified locator value in the
			 * current webpage. All matching elements will be fetched and stored in the list
			 * of WebElements. The general syntax for the method is:
			 */	  
		  List elementList = driver.findElements(By.xpath("//*[@id=\"identifierNext\"]/div/button"));		
		
	
		//Question-10: Write a Java program to demonstrate stringreversewith_andwithoutStringBufferclass?
		
		  //stringreversewith_andwithoutStringBufferclass?
		  //stringreversewith_andwithoutStringBufferclass
		 
		 
}
		 
	
		
//What is the use of @Factory annotation in TestNG?
		
		/*
		 * Ans. @Factory annotation helps in the dynamic execution of test cases.
		 * Using @Factory annotation, we can pass parameters to the whole test class at
		 * run time. The parameters passed can then be used by one or more test methods
		 * of that class.
		 * 
		 * For example – there are two classes TestClass and the TestFactory class.
		 * Because of the @Factory annotation, the test methods in class TestClass will
		 * run twice with the data “k1” and “k2”.
		 */
		
//How can we run test cases in parallel using TestNG?
		
	//In order to run the tests in parallel just add these two key-value pairs in the suite
		//parallel=”{methods/tests/classes}”				
		//thread-count=”{number of thread you want to run simultaneously}”.
		//<suite name="ArtOfTestingSuite" parallel="methods" thread-count="5">		
			
//How to prevent a test case from running using TestNG?

		// @Test(enabled = false)
		// @Test(groups = {"NegativeTests"}, enabled = false)

		/*
		 * Test method can be disabled from getting executed by setting the “enabled”
		 * attribute as false.
		 * 
		 * 
		 * //In case of a test method
		 * 
		 * @Test(enabled = false) public void testMethod1() { //Test logic } //In case
		 * of test method belonging to a group
		 * 
		 * @Test(groups = {"NegativeTests"}, enabled = false) public void testMethod2()
		 * { //Test logic }
		 */

//logging in Java?

		/*
		 * Log4j is an open-source API widely used for logging in Java. It supports
		 * multiple levels of logging like – ALL, DEBUG, INFO, WARN, ERROR, TRACE, and
		 * FATAL.
		 */

//What is the use of logging in automation??
		/*
		 * Logging helps in debugging the tests when required and also provides storage
		 * of the test’s runtime behavior.
		 */

//How to handle the HTTPS website in Selenium or how to accept the SSL untrusted connection?

	// Steps for Chrome Browser:to handle the SSL untrusted connection
		  
	/*
	 * For Desiredcpabilities class create the object Set the ACCEPT_SSL_CERTS as
	 * true With the capability open the chrome browser Create the object of
	 * DesiredCapabilities class using chrome DesiredCapabilities capability =
	 * DesiredCapabilities.chrome(); // Set ACCEPT_SSL_CERTS variable to true
	 * capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); // Set the
	 * chrome driver path System.setProperty("webdriver.chrome.driver",
	 * "Path of the Chrome driver"); // Open the browser //WebDriver driver = new
	 * ChromeDriver(capability); driver.manage().timeouts().implicitlyWait(10,
	 * TimeUnit.SECONDS); // Enter the site URL where you are facing SSL error.
	 * driver.get("Enter site URL");
	 */
		
		  //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		/*
		 * //for firefox 
		 * 
		 * // Ans. Using profiles, we can handle accept the SSL untrusted
		 * connection certificate./ //Profiles are basically set of user preferences
		 * stored in a file.
		 * 
		 * FirefoxProfile profile = new FirefoxProfile();
		 * profile.setAcceptUntrustedCertificates(true);
		 * profile.setAssumeUntrustedCertificateIssuer(false); WebDriver driver = new
		 * FirefoxDriver(profile);
		 */

//How can we check if an element is getting displayed on a web page?
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).isDisplayed();
//How can we check if an element is enabled for interaction on a web page?	  
		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button")).isEnabled();
//How can we find all the links on a web page?
		// Ans. All the links are of anchor tag ‘a’.
		// So by locating elements of tagName ‘a’ we can find all the links on a
		// webpage.
		List<WebElement> links = driver.findElements(By.tagName("a"));
//How to locate a link using its text in Selenium?
		WebElement link1 = driver.findElement(By.linkText("artOfTesting"));
		WebElement link2 = driver.findElement(By.partialLinkText("artOf"));
WebElement element = null;
		//How to verify tooltip text using Selenium?
		// Ans. Tooltips web elements have an attribute of type ‘title’.
		// By fetching the value of the ‘title’ attribute, we can verify the tooltip
		// text in selenium.
		//WebElement element = null;
		String toolTipText = element.getAttribute("title");
		
		
//explicit wait in Selenium?
		//WebDriverWait wait2 = new WebDriverWait(driver, 10);
		//WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
//How can we fetch a text written over an element?
		// Ans. Using the getText() method we can fetch the text over an element.
		// String text = driver.findElement("elementLocator").getText();
//What are the different ways to refresh a browser?
		// Ans. There a multiple ways to refresh a page in Selenium-
		// Using driver.navigate().refresh() command.
		// Using sendKeys(Keys.F5) on any textbox on the webpage.
		// Using driver.get(“URL”) on the current URL or using driver.getCurrentUrl().
		// Using driver.navigate().to(“URL”) on the current URL or
		// driver.navigate().to(driver.getCurrentUrl());
//How to check a checkBox in Selenium?	  
		// Ans. The same click() method used for clicking buttons or radio buttons can
		// be used for checking the checkbox as well.
//How can we submit a form in Selenium?	  
		// Ans. Using the submit() method we can submit a form in selenium.
		// driver.findElement(By.id("form1")).submit();
		// Also, the click() method can be used for the same purpose.
//How do you find broken links in Selenium WebDriver?	  
		// We can detect whether the given links are broken or not by using the
		// following process:
		// First, accumulate all the links present on a web page using the <a> anchor
		// tag. For each <a> tag, use the attribute ‘href’ value to obtain the hyperlink
		// Send HTTP requests for each link and verify the HTTP response code
		// Based on the HTTP response code, determine if the link is valid or broken.
		// Then, use the driver.get() method to navigate to a URL, which will respond
		// with a status of 200 – OK (200 – OK indicates that the link is working). If
		// we get any other status, then it indicates that the link is broken
		// Repeat the same process for all the links captured.

//What is the difference between type keys and type commands?

		// TypeKeys() will trigger JavaScript events, while type() won’t.
		// TypeKeys collects different value attributes using JavaScript.
		// Whereas, the type commands imitate an actual user typing.

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

//We can fetch the attribute of an element by using the getAttribute() method. Sample code:
		// WebElement eLogin = driver.findElement(By.name(&ldquo;Login&rdquo;);
		// String LoginClassName = eLogin.getAttribute("classname");
//to retrieve some text from any textbox, we can use getText() method
		// WebElement eLogin = driver.findElement(By.name(&ldquo;Login&rdquo;);
		// String LoginText = Login.getText ();

// Write a code to wait for a particular element to be visible on a page. Write a code to wait for an alert to appear.
		// We can write a code such that we specify the XPath of the web element that
		// needs to be
		// visible on the page and then ask the WebDriver to wait for a specified time.
		// Look at the sample piece of code below:
		/*
		 * // Write a code to wait for a particular element to be visible on a page
		 * WebDriverWait wait=new WebDriverWait(driver, 20); WebElement Element =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//*[@id=\"identifierNext\"]/div/button"))); //write another piece of code
		 * asking the WebDriver to wait until an error appears WebElement Element1 =
		 * (WebElement) wait.until(ExpectedConditions.alertIsPresent());
		 * 
		 */

	}


//Can you explain how can you handle colours in web driver?

	// We can use the command getCssValue(arg0) to fetch the colors by sending the
	// color as the argument.

//Can you mention why do you need the Session handling in Selenium?

	/*
	 * Session handling is very important while working with Selenium. This is
	 * because while working with the test case scenarios we need to establish the
	 * communication between the browser and the application while executing the
	 * commands. There can be an issue where while running a particular test script,
	 * another test script can be triggered within the same host and same type of
	 * browser.
	 */


//Here, the WebDriver is the interface where the Firefox, chrome and all other browser driver implementations are made.

//How is the desired capability useful in terms of Selenium?
// series of key-value pairs can be used to store information like the browser
// name, browser version, the path of the browser driver in the system, etc., to
// determine the behavior of the browser at the run-time. This feature or
// functionality is commonly referred to as desired capability.
// The driver instance can be configured using this.
// It comes into practice when you want to run the test cases in different
// operating systems, browsers, and versions.

//How can you verify the specific position of a web element?
// verifyElementPositionLeft and verifyElementPositionTop commands are used.
// These use the pixel comparison by identifying the position of the element
// from the left and top of the web page respectively.

//How can the message in the alert box be retrieved?
// storeAlert() command can be used to retrieve the message from the alert
// pop-up and store it in a variable.
// How can you handle working with multiple windows in Selenium?
// selectWindow() command in Selenium can be used to switch among the working
// windows.
// The distinguishing factor among all the windows is the title of the window.

//List the advantages of Web driver over Selenium server?
// If Selenium web driver is used, then no need to use the dependency of the
// selenium server.
// Selenium server provides us with the functionality of Selenium RC for the
// backward compatibility.
// Selenium server acts as a middleware for the communication between browsers
// and the application. Whereas, the Selenium web driver directly calls the
// browser to support automation.
//What is the same-origin policy? How can we avoid it?
//This policy is introduced for security reasons.

//By this policy, it ensures that we cannot access the script from another site.
//The source code which is loaded within the browser can only be operated within that website’s domain.
//This policy can be avoided by using the proxy-injection method. In this method, the browser is tricked using the Selenium’s server to be a real URL (fictional URL).

//How do you find broken links in Selenium WebDriver?

// When we use driver.get() method to navigate to a URL, it will respond with a
// status of 200-OK

// 200 – OK denotes that the link is working and it has been obtained. If any
// other status is obtained,
// then it is an indication that the link is broken.

// Some of the HTTP status codes are :

// 200 – valid Link
// 404 – Link Not Found
// 400 – Bad Request
// 401 – Unauthorized
// 500 – Internal error
// As a starter, obtain the links from the web application, and then
// individually get their status.

/*
 * //Navigate to the interested webpage for e.g. www.amazon.com
 * 
 * // Collect all the links from the webpage. All the links are associated with
 * the Tag ‘a‘
 * 
 * List<WebElement> links = driver.findElements(By.tagName("a"));
 * 
 * // Create a list of type WebElement to store all the Link elements in it.
 * 
 * for(int i=0; i<links.size(); i++) {
 * 
 * WebElement element = links.get(i);
 * 
 * String url=element.getAttribute("href");
 * 
 * // verifyLink(url); }
 * 
 * //Now Create a Connection using URL object( i.e ., link)
 * 
 * String urlLink; URL link = new URL(urlLink);
 * 
 * // Connect using Connect Method
 * 
 * HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
 * 
 * //Use getResponseCode () to get response code
 * 
 * //if(httpConn.getResponseCode()!== 200)
 * 
 * //Through exception, if any error occurred
 * 
 * //System.out.println(“BrokenLink”);
 */

//How to set browser window size in Selenium?

/*
 * // The window size can be maximized, set or resized
 * 
 * //To maximize the window
 * 
 * driver.manage().window().maximize();
 * 
 * // To set the window size
 * 
 * Dimension d = new Dimension(400,600);
 * 
 * driver.manage().window().setSize(d);
 * 
 * //Alternatively,
 * 
 * // The window size can be reset using JavaScriptExecutor
 * 
 * ((JavascriptExecutor)driver).executeScript("window.resizeTo(1024, 768)");
 */

//How to retrieve CSS properties of an element?

// getCssValue() method is used to retrieve CSS properties of any web element
// driver.findElement(By.id(“email“)).getCssValue(“font-size”);

//How To Highlight Element Using Selenium WebDriver

	/*
	 * //Highlight Element_JavascriptExecutor //To launch gmail.com
	 * driver.get("https://www.gmail.com"); //Collects the webelement WebElement ele
	 * = driver.findElement(By.xpath("//*[@id=\"identifierId\"]")); //Create object
	 * of a JavascriptExecutor interface JavascriptExecutor js =
	 * (JavascriptExecutor) driver; //use executeScript() method and pass the
	 * arguments //Here i pass values based on css style. Yellow background color
	 * with solid red color border. js.
	 * executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
	 * , ele);
	 */

//WebDriverWait	 

// WebDriverWait wait = new WebDriverWait(driver, 5);

// wait.until(ExpectedConditions.presenceOfElementLocated(locator));

//To Scroll Web page Down using Selenium WebDriver use JavascriptExecutor

/*
 * //to perform Scroll on application using Selenium
 * driver.navigate().to("https://www.softwaretestingmaterial.com");
 * JavascriptExecutor js = (JavascriptExecutor) driver;
 * js.executeScript("window.scrollBy(0,250)", ""); //To scroll to the Bottom of
 * the Web Page using Selenium WebDriver
 * js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //To
 * Scroll Web page Up using Sleneium WebDriver:
 * js.executeScript("window.scrollBy(0,-250)", "");
 */

//To resize browser window to particular dimensions, we use ‘Dimension’ class to resize the browser window.	  

//The below code opens the SoftwareTestingMaterial website and then set the browser window size to 480*620	  

//Resize Browser Window using Dimensions class
/*
 * driver.navigate().to("https://www.softwaretestingmaterial.com");
 * System.out.println(driver.manage().window().getSize()); //Create object of
 * Dimensions class Dimension d = new Dimension(516, 620); //Resize the current
 * window to the given dimension driver.manage().window().setSize(d);
 * System.out.println(driver.manage().window().getSize());
 */

//How to handle browser (chrome) notifications in Selenium?
//	  In Chrome, we can use ChromeOptions as shown below.
/*
 * ChromeOptions options = new ChromeOptions();
 * options.addArguments("disable-infobars"); WebDriver driver = new
 * ChromeDriver(options);
 */

//How to find more than one web element in the list?

	/*
	 * times, we may come across elements of the same type like multiple hyperlinks,
	 * images etc arranged in an ordered or unordered list. Thus, it makes absolute
	 * sense to deal with such elements
	 */
//by a single piece of code and this can be done using WebElement List.


	/*
	 * List <WebElement> elementList =
	 * driver.findElements(By.xpath("//div[@id='example']//ul//li"));
	 * 
	 * // Fetching the size of the list int listSize = elementList.size(); for (int
	 * i=0; i<listSize; i++) { // Clicking on each service provider link
	 * serviceProviderLinks.get(i).click(); // Navigating back to the previous page
	 * driver.navigate().back(); }
	 */

//Question-10: Write a Java program to demonstrate stringreversewith_andwithoutStringBufferclass?
//stringreversewith_andwithoutStringBufferclass
/*
 * public class stringreversewith_andwithoutStringBufferclass { //with
 * stringbuffer public String invertWithStringBuffer(String str) { StringBuffer
 * buffer = new StringBuffer(str); buffer.reverse(); return buffer.toString(); }
 * //without stringbuffer public String invertWithoutStringBuffer(String str) {
 * 
 * int length = str.length(); String original = str; String invert = ""; for
 * (int i = length - 1; i >= 0; i--) { invert = invert + original.charAt(i); }
 * return invert; } public static void main(String[] args) {
 * stringreversewith_andwithoutStringBufferclass invertStr = new
 * stringreversewith_andwithoutStringBufferclass();
 * System.out.println("Inverted String with StringBuffer class: " +
 * invertStr.invertWithStringBuffer("987654321")); System.out.println("");
 * System.out.println("Inverted String without StringBuffer class: " +
 * invertStr.invertWithoutStringBuffer("kjihgfedcba")); }
 * 
 * }
 */

//How to turn off the test-output (generated test output folder) in TestNG?

//Ans. In Eclipse, modify the launch/Run configuration and add a <-usedefaultlisteners false> option to disable the test output.	  

//What is the time-unit you use in testng time tests?

//Ans. We use milliseconds as the time unit in @Test or @TestSuite methods.	  

//Q: How would you differentiate between the absolute and relative XPath?

//Ans.
/*
 * Single slash "/" signifies an absolute XPath.
 * 
 * Double Slash "//" represents the relative XPath.
 */

//What is the Selenese command to show the value of a variable in the log file?
//Ans. echo()	  

// What is the best way to check for the highlighted text on a web page?

//Ans. Use the below code to verify the highlighted text for an element on the web page.
// getCssValue("color");getCssValue("background-color");
/*
 * String clr =
 * driver.findElement(By.xpath("//a[text()='TechBeamers']")).getCssValue("color"
 * );
 * 
 * String bkclr =
 * driver.findElement(By.xpath("//a[text()='TechBeamers']")).getCssValue(
 * "background-color");
 * 
 * System.out.println(clr);
 * 
 * System.out.println(bkclr);
 */

//How would you simulate the right click operation in WebDriver?
//Ans. You can make use of the Actions class features.

/*
 * Actions test = new Actions(driver); // Here, driver is the object of
 * WebDriver class.
 * 
 * test.moveToElement(element).perform();
 * 
 * test.contextClick().perform();
 */

//How would you handle the alert popups in Selenium Webdriver?		
//Ans. First, you’ve to switch the control to the pop up then press the ok or cancel button.
//After that, turn back to the source page screen.	
/*
 * String srcPage = driver.getWindowHandle(); Alert pop =
 * driver.switchTo().alert(); // shift control to the alert popup. pop.accept();
 * // click on ok button. pop.dismiss(); // click on cancel button. // Move the
 * control back to source page. driver.switchTo().window(srcPage); // move back
 * to the source page.
 */

//How can you check the state of a checkbox/radio button?
// Ans. We can call the isSelected() method to test the status of these elements.
// Example Code:

//boolean test = driver.findElement(By.xpath("checkbox/radio button XPath")).isSelected();

//Yes, we can use the Advanced User Interactions API to perform drag and drop operations in a Selenium Webdriver project.
/*
 * Actions act = new Actions(driver); act.dragAndDrop(source_locator,
 * target_locator).build().perform(); //Or you can use the below code style.
 * (new Actions(driver)).dragAndDrop(source_locator, target_locator).perform();
 */

//How would you automatically click a screenshot whenever an exception occurs?
//Ans. For this you will have to use <EventFiringWebDriver> class and needs to implement 
//the <onException> method of the <WebDriverEventListener> interface.
/*
 * WebDriver browser = new ChromeDriver(); EventFiringWebDriver eventDriver =
 * new EventFiringWebDriver(browser).register(new
 * AbstractWebDriverEventListener() {
 * 
 * @Override public void onException(Throwable throwable, WebDriver browser) {
 * // Take the screenshot using the Webdriver. File screen =
 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Now you can
 * copy the screenshot somewhere on your system. FileUtils.copyFile(screen, new
 * File("c:\Selenium Testing Questions\screen.png")); } }); try {
 * eventDriver.findElement(By.id("test"));
 * fail("Caught the Expected exception."); // Intentionally causing the
 * exception for demo. } catch (NoSuchElementException e) { // Triggering point
 * for the <onException> event. }
 */

//Explain how you can login into any site if it’s showing any authentication popup for password and username?
/*
 * Pass the username and password with url
 * 
 * Syntax-http://username:password@url ex- http://creyate:tom@www.gmail.com
 */
//How to run the Selenium Webdriver test from the command line?

//Ans. We can run any Selenium Webdriver test written in Java using the following command.

//java -classpath ".;selenium-server-standalone-2.33.0.jar" SampleClass

/*
 * JavascriptExecutor webdriver = null; // Initialize the JS object.
 * JavascriptExecutor JS = (JavascriptExecutor) webdriver; // Get the current
 * site title. String sitetitle =
 * (String)JS.executeScript("return document.title");
 * System.out.println("My Site Title: " + sitetitle);
 */
////Java -jar "C:\Selenium Webdriver Questions\selenium-server-standalone-2.33.0.jar" -htmlSuite "*firefox" "http://www.google.com" " “C:\Selenium Webdriver Questions\SeleniumSuite.HTML"
//Below is the Webdriver specific code to achieve the same objective.
/*
 * WebDriverWait check = new WebDriverWait(driver, 100);
 * check.until(ExpectedConditions.anyElement(By.id(id)));
 */
//How to launch a batch file in a Selenium Webdriver project?	  
/*
 * Process batch = Runtime.getRuntime.exec("path of the batch file");
 * batch.waitFor();
 */
//How would you make sure that a page is loaded using Selenium and Webdriver?
/*
 * selenium.waitForPageToLoad("5000"); // Or while
 * (!(selenium.isElementPresent("any page element ")==true)) {
 * selenium.setSpeed("5"); Thread.sleep(5); }
 */

//How to handle a proxy using Selenium in Java?
//Selenium implements a PROXY class to configure the proxy. See below example:

/*
 * String setPROXY = "10.0.0.10:8080";
 * 
 * org.openqa.selenium.Proxy allowProxy = new org.openqa.selenium.Proxy();
 * allowProxy.setHttpProxy(setPROXY) .setFtpProxy(setPROXY)
 * .setSslProxy(setPROXY); DesiredCapabilities allowCap = new
 * DesiredCapabilities(); allowCap.setCapability(CapabilityType.PROXY,
 * allowProxy); WebDriver driver = new FirefoxDriver(allowCap);
 */

//How to simulate Mouse over action on a submenu option under a header menu and click?
//Using the Actions object, you can first move the menu title, and then proceed to the popup menu item and click it. 
//Don’t at all miss to invoke the “actions.Perform()” at the end. Check out the below Java code:

/*
 * Actions acts = new Actions(driver); WebElement menuHoverLink =
 * driver.findElement(By.linkText("Menu heading"));
 * acts.moveToElement(menuHoverLink);
 * 
 * WebElement subLink =
 * driver.findElement(By.cssSelector("#headerMenu .subLink"));
 * 
 * acts.moveToElement(subLink); acts.click(); acts.perform();
 */

/*
 * File screen = ((TakesScreenshot)ins).getScreenshotAs(OutputType.FILE); // Now
 * you can do whatever you need to do with it, for example copy somewhere
 * 
 * FileUtils.copyFile(screen, new File("c:\tmp\myscreen.png"));
 * 
 * //driver.findElement(By.id("<<htmlform>>")).submit();
 */
// java.lang.Thread.sleep(10);

//How do you check for the presence of a web element after the successful page load?
/*
 * //We can verify the presence of a web element with the following code.
 * //While using the below function, do supply some timeout value (in seconds)
 * to check the element in a regular interval.
 * 
 * public void checkIfElementPresent(String element, int timeout) throws
 * Exception { for (int sec = 0;; sec++) { if (sec >= 10)
 * fail("Timeout! Couldn't locate element." + element); try { if
 * (selenium.isElementPresent(element)) break; } catch (Exception ex) { }
 * Thread.sleep(1000); } }
 */

//Test Cases using User defined Methods/Reusable Components)
/*
 * //Reusable Components: //Lunch Browser--//Login---//Close Browser...
 * //variable web driver //public static WebDriver driver; //Launch Browser
 * 
 * public void launch(){ WebDriverManager.chromedriver().setup(); driver = new
 * ChromeDriver(); driver.manage().window().maximize(); }
 * 
 * //Close Browser
 * 
 * public void closeBrowser(){ driver.close(); }
 * 
 * // Login
 * 
 * public void login(String Username, String Password) throws
 * InterruptedException{ String url="https://www.demo.guru99.com/V4/";
 * driver.get(url); driver.findElement(By.name("uid")).sendKeys(Username);
 * driver.findElement(By.name("password")).sendKeys(Password);
 * driver.findElement(By.name("btnLogin")).click(); Thread.sleep(3000); }
 * 
 * //public static void main(String[] args) throws InterruptedException,
 * IOException { //browser info
 * 
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * driver.manage().window().maximize();
 * 
 * //TC01_Javaprograms userdefinedmethods_obj=new TC01_Javaprograms(); //Test
 * Case 1: Verify Login (Positive Test Case)
 * 
 * userdefinedmethods_obj.launch(); userdefinedmethods_obj.login("mngr355941",
 * "UdymAgU"); String url=driver.getCurrentUrl(); if (url.contains("guru99")){
 * System.out.println("Test Case 1: "+
 * "user defined reusable methods with Login is Successful - Passed"); } else{
 * System.out.println("Test Case 1: "+
 * "user defined reusable methods with Login is unsuccessful - Failed"); }
 * userdefinedmethods_obj.closeBrowser(); } }
 */

// Data Driven Testing for Login Interface by reading test data from a text
// file.
/*
 * FileReader file= new FileReader("C:\\Users\\dell\\Desktop\\Datatxtfile.txt");
 * BufferedReader br = new BufferedReader(file);
 * 
 * int Count=0; int Iteration=0; String line; while
 * ((line=br.readLine())!=null){ Count = Count+1; if (Count > 1 ){ Iteration=
 * Iteration+1; String [] inputData = line.split(",",2);
 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
 * driver.manage().window().maximize(); String
 * url="https://www.demo.guru99.com/V4/"; driver.get(url);
 * driver.findElement(By.name("uid")).sendKeys(inputData[0]);
 * driver.findElement(By.name("password")).sendKeys(inputData[1]);
 * driver.findElement(By.name("btnLogin")).click(); Thread.sleep(3000); String
 * url2= driver.getCurrentUrl(); if (url2.contains("guru99")){
 * System.out.println(Iteration +
 * "Login-data from text file is Successful - Passed"); } else {
 * System.out.println(Iteration
 * +" Login-data from text file is Unsuccessful - Failed");} driver.close();}}
 * br.close(); file.close();
 */

// Verify if the 1st URL is an Internal link
// Verify if the 2nd URL is an External link
/*
 * driver.get(
 * "https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
 * driver.findElement(By.linkText("Create account")).click(); String
 * url1=driver.getCurrentUrl(); System.out.println(url1);
 * 
 * if (url1.contains("wikipedia.org")){ System.out.println("1st Verification: "+
 * "It is an Internal Link - Passed"); } else{
 * System.out.println("1st Verification: "+
 * "It is Not an Internal Link - Failed"); }
 */
// driver.get("https://www.google.com/");

/*
 * driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
 * //Switch to 3rd Frame from Top Window using index driver.switchTo().frame(2);
 * driver.findElement(By.linkText("org.openqa.selenium")).click();
 */
// driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=6rqlkhhibc3d4pvkdt6fafs4s1");
//Handle Image, Image Button and Image Link
/*
 * driver.get("http://www.google.com"); //Return Google Image name String
 * imageName = driver.findElement(By.id("hplogo")).getAttribute("alt");
 * System.out.println("Google Image name" + imageName);
 * driver.navigate().to("https://www.seleniumhq.org/"); Thread.sleep(3000);
 * //Click Image Link
 * driver.findElement(By.xpath("//*[@id='choice']/tbody/tr/td[2]/center/a/img"))
 * .click();
 */

/*
 * driver.get("http://www.gcrit.com/build3/create_account.php"); WebElement
 * checkBox = driver.findElement(By.name("newsletter")); //Check the Element
 * Displayed Status boolean status = checkBox.isDisplayed();
 * System.out.println(status);//true //Check the Element Enabled Status status =
 * checkBox.isEnabled(); System.out.println(status);//true //Check the Element
 * Selected Status status = checkBox.isSelected();
 * System.out.println(status);//false //Select the Checkbox checkBox.click();
 * //Check the Element Selected Status status = checkBox.isSelected();
 * System.out.println(status);//true
 * 
 * //Select the Checkbox checkBox.click(); //Check the Element Selected Status
 * status = checkBox.isSelected(); System.out.println(status);//false
 */

//Check Link Existence
/*
 * boolean linkPresent= driver.findElement(By.linkText("Gmail")).isDisplayed();
 * System.out.println(linkPresent); //Check Enabled status boolean linkStatus =
 * driver.findElement(By.linkText("Gmail")).isEnabled();
 * System.out.println(linkStatus); //Return Link Name String linkName =
 * driver.findElement(By.linkText("Gmail")).getText();
 * System.out.println(linkName); //Click(Redirects)Link
 * driver.findElement(By.linkText("Gmail")).click(); Thread.sleep(2000);
 * driver.close();
 */

// driver.get("https://www.gmail.com/");
//Handle Popup Window
/*
 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
 * driver.findElement(By.name("proceed")).click(); //Switch driver focus from
 * the web page to popup window Alert popup =driver.switchTo().alert();
 * //Captures the error message from the window popup String errMessage =
 * popup.getText(); System.out.println(errMessage); Thread.sleep(2000);
 * popup.accept(); driver.findElement(By.id("login1")).sendKeys("India123");
 */

//Full Screen the Browser window
// driver.manage().window().fullscreen();

//Java Programming (Java Standard Edition / Core Java)
/*
 * 1) Comments 2) Data Types 3) Modifiers 4) Variables 5) Operators 6) Java
 * Control Flow Statements a) Conditional Statements/Decision Making Statements
 * b) Loop Statements c) Branching Statements 7) String Handling 8) Array,
 * ArrayList 9) IO Operations (includes File handling) 10) Java Methods a)
 * Built-in Methods b) User defined Methods 11) Exception Handling 12) Java OOPS
 * a) Inheritance b) Polymorphism c) Abstraction d) Encapsulation
 * ......................................................
 * 
 */

//isEnabled()	
/*
 * driver.get("http://www.google.com"); Thread.sleep(2000); boolean linkStatus =
 * driver.findElement(By.linkText("Gmail")).isEnabled();
 * System.out.println(linkStatus);
 */

//IsDisplayed()	
/*
 * driver.get("http://www.google.com"); Thread.sleep(2000);
 * 
 * boolean linkPresent = driver.findElement(By.linkText("Gmail")).isDisplayed();
 * System.out.println(linkPresent);
 */

//google url
/*
 * driver.get("https://www.google.com/"); String browserUrl=
 * driver.getCurrentUrl(); System.out.println(browserUrl);//Google Url
 */

//Yahoo Url
/*
 * driver.navigate().to("https://in.yahoo.com/"); browserUrl=
 * driver.getCurrentUrl(); System.out.println(browserUrl);//Yahoo Url
 */

//Gmail
/*
 * driver.get("https://www.gmail.com/"); driver.manage().window().maximize();
 * driver.findElement(By.id("identifierId")).sendKeys("India123@gmail.com");
 * //WebElement WebElement EmailBox = driver.findElement(By.id("identifierId"));
 * EmailBox.sendKeys("India123@gmail.com"); Thread.sleep(3000); String val =
 * EmailBox.getAttribute("value"); System.out.println(val); Thread.sleep(3000);
 * EmailBox.clear();
 */

//icici bank-title

/*
 * driver.get("https://www.icicibank.com/"); Thread.sleep(3000); String title =
 * driver.getTitle(); System.out.println(title);
 */

/*
 * //Declare Static Variables static int a=10, b=20; //Declare Non Static
 * Variables int c =30, d=40; //Create a Static Method with returns a value
 * public static int add(){ int result = a+b; return result; } //Create a Non
 * Static Method with returns a value public int multiply(){ int result = c*d;
 * return result; } //Main method below public static void main(String[] args) {
 * TC01_Javaprograms obj = new TC01_Javaprograms(); //Calling a Non Static
 * method int val = obj.multiply(); System.out.println(val);//1200 //Calling a
 * Non Static Variable int val2= obj.d; System.out.println(val2);//40 //Call a
 * Static Method int val3 = TC01_Javaprograms.add();
 * System.out.println(val3);//30 //Call Static Variable int val4 =
 * TC01_Javaprograms.b; System.out.println(val4);//20
 */// Generate Random Numbers
	// System.out.println(Math.random());

//Return System Date
/*
 * Date myDate = new Date(); System.out.println(myDate);
 * System.out.println(myDate.getTime()); System.out.println(myDate.getDay());
 */

//File Handling:
//Note: Using File Object we can create and delete all type files, but we can't conduct internal operations

/*
 * //1) Create a Folder on Desktop File fileobject= new
 * File("C:\\Users\\dell\\Desktop\\notes"); fileobject.mkdir(); //2) Delete a
 * Folder fileobject.delete(); //3) Create a File File fileobject = new File
 * ("C:\\Users\\dell\\Desktop\\notes1.xlsx"); fileobject.createNewFile();
 * fileobject.delete();
 */

//Example for Reading input using input devices-Input Stream
/*
 * Scanner scan =new Scanner(System.in);
 * 
 * System.out.println("Enter Your Name"); String name = scan.nextLine();
 * System.out.println("Your name is: "+name);
 * 
 * System.out.println("Enter Your city"); String city = scan.nextLine();
 * System.out.println("Your city is: "+city);
 * 
 * System.out.println("Enter tool Name"); String toolname = scan.nextLine();
 * System.out.println("Your tool name is: "+toolname);
 */

/*
 * Scanner scan = new Scanner(System.in);//Input Stream
 * System.out.println("Enter Your Name");
 * 
 * String name = scan.nextLine(); System.out.println("Your name is: "+name);
 * 
 * System.out.println("Enter a City"); String city = scan.next();
 * 
 * System.out.println("Your City is: "+city);
 * System.out.println("Enter Your Mobile Number");
 * 
 * long mobile = scan.nextLong();
 * System.out.println("Your Mobile Number is: "+mobile);
 * System.out.println("Enter your ID");
 * 
 * int id = scan.nextInt(); System.out.println("Your ID is: "+id);
 * //System.out.println("Enter a Value");
 * 
 * boolean val=scan.nextBoolean(); System.out.println("Your value is: "+val);
 * System.out.println("Enter a Number with decimal places");
 * 
 * double d = scan.nextDouble(); System.out.println("Your Number is: "+d);
 * System.out.println("Enter a Charcter");
 * 
 * char a = scan.next().charAt(0); System.out.println("Your Char is: "+a);
 */

//Declaration of Arrays

//3rd Method

//Example:
/*
 * int [] a= {10, 20, 30, 40}; System.out.println(a[1] +a[3]);//60
 */

//Creating different type Arrays

/*
 * int [] a= {10, 20, 30, 40, 50}; //Array of Integers
 * 
 * char [] b= {'A', 'S', '1', '*'};//Array of Characters
 * 
 * String [] c = {"UFT", "Selenium", "RFT", "SilkTest"};//Array of Strings
 * 
 * double [] d ={1.234, 3.456, 6.45, 7.890}; // Array of decimal ponit values
 * 
 * boolean [] e = {true, true, false, true, false}; //Array og Boolean Values /
 * Logical Values
 * 
 * System.out.println(a[2]);//30 System.out.println(d[3]);//7.890
 * System.out.println(e[0]);//true
 */
//2nd Method
// Example:
/*
 * int [] a = new int [3]; a[0] =10; a[1] =20; a[2] =30; System.out.println(a[1]
 * + a[2]);//50
 */
//1st Method
/*
 * int a[];//declaration a=new int[3];//memory allocation a[0] = 10;//value
 * retrive a[1] = 20; a[2] = 30; System.out.println(a[1] + a[2]);//50
 */
//String Comparison	
/*
 * String str1 = "SELENIUM"; String str2 = "selenium"; String str3 = "SELENIUM";
 * String str4 = "zseleniu"; //String Comparison using Relational (==) Operator
 * System.out.println(str1 == str2);//false System.out.println(str1 ==
 * str3);//true //String Comparison using equals() Method
 * System.out.println(str1.equals(str2));//false
 * System.out.println(str1.equals(str3));//true //String comparison using
 * compareTo() System.out.println(str1.compareTo(str2));//Negative value
 * System.out.println(str1.compareTo(str3));//0
 * System.out.println(str4.compareTo(str1));//Positive value
 */
//String operations	
/*
 * System.out.println("Selenium"+"Testing");//SeleniumTesting
 * System.out.println("Selenium"+1+1);//Selenium11
 * System.out.println(1+1+"Selenium");//2Selenmium System.out.println(1+11);//12
 */

//String may have Alphabets, Numbers and Special characters
/*
 * String a="India"; String b="100"; int c=100; String d="India123"; String f=
 * "India123#$";
 */
/*
 * 
 * //concat method
 * 
 * String str1= "Selenium"; String str2 = " Testing";
 * System.out.println(str1.concat(str2));
 */

//java programs	
//object method is in out side main method -using that inside the main method by using object
//return---
//return statement is used in User defined methods (methods with return value)
//and return statement must be always last statement in the method		
/*
 * TC01_Javaprograms obj = new TC01_Javaprograms(); int res= obj.add(100, 50);
 * System.out.println(res);//150
 * 
 * System.out.println(obj.add(100, 200));//300 } public int add(int a, int b){
 * int result=a+b; return result; }
 * 
 * }
 */

//continue statement	 
/*
 * for (int i=1; i<=10; i++){ if (i%2 != 0){ continue; } System.out.println(i);
 * }
 */
//break statement is used to stop the execution and comes out of loop
// Mostly break statements are used in switch and in loops....
// Example :

// for (int i=1; i<=10; i++) { System.out.println(i); if (i==5) { break; } }

/*
 * //Print 1 to 10 Numbers in reverse Order except 4th and 9th numbers for (int
 * i=10; i>=0; i--) {
 * 
 * if((i!=4)&&(i!=9)) {
 * 
 * System.out.println(i); }
 * 
 * }
 */

//Print 1 to 10 Numbers in reverse Order
/*
 * for (int i=10;i>=0;i--) {
 * 
 * System.out.println(i);
 * 
 * }
 */

//Enhanced for loop

/*
 * String [] tools = {"Selenium","UFT", "RFT", "SilkTest"};
 * 
 * for (String mytools : tools) {
 * 
 * 
 * System.out.println(mytools); }
 */

//Print 1 to 5 Numbers except 4 using for loop
/*
 * for (int i=1; i<=5; i++)
 * 
 * { if (i != 4) {
 * 
 * System.out.println(i); }
 * 
 * }
 */

//Print 1 to 5 numbers using while loop

/*
 * int j=1;
 * 
 * while (j<=5){ System.out.println(j); j++; }
 */

/*
 * int a,b; a=100;//Correct b=200; //Correct int c=a+b; //Incorrect
 * System.out.println(c);
 */
//
/*
 * int d, e, f; d=100; e=200; f=300;
 * 
 * int g=d*e*f; System.out.println(g);
 */

//Array is a collection of similar type of elements

//declare an array of integers

/*
 * int[] values;
 * 
 * values=new int[3];
 * 
 * values[0]=100; values[1]=200; values[2]=300;
 * 
 * System.out.println(values[0]); System.out.println(values[1]);
 * System.out.println(values[2]);
 */



//declare an array of string
/*
 * String[] countries=new String[3];
 * 
 * countries[0]="India"; countries[1]="Canada"; countries[2]="US";
 * 
 * System.out.println(countries[0]); System.out.println(countries[1]);
 * System.out.println(countries[2]);
 */

// VariableDeclaration with Initialization

/*
 * int a;//Variable Declaration a=100; //Initialization int b=200;
 * //VariableDeclaration with Initialization int c, d, e; //Declare multiple
 * variables int f=40, g=50, h=60; //Declare multiple variables with
 * initialization
 */

/*
 * //Concatenation of two strings String d="Selenium"; String e= "Testing";
 * String f=d+e; //Concatenation System.out.println(f);
 */

//Java supports Explicit declaration of Data Types
/*
 * int sno =123;//Correct int x;//Correct char a='A'; //Correct boolean y=true;
 * int abc =100; //Incorrect
 */

//We declare Variables and Constants
/*
 * int a; a=100;
 * 
 * int b=200; b=300;
 * 
 * int c=400;
 * 
 * final int y=1000; //Constant
 */

/*
 * //Create Object to call Non Static methods TC01_Javaprograms obj = new
 * TC01_Javaprograms();
 * 
 * int res = obj.add(100, 200); System.out.println(res);//300 //Or
 * System.out.println(obj.add(100, 200));//300 obj.comparison();//X is a Big
 * Number
 */
/*
 * //Create a Method with Arguments and return a value (Non Static method)
 * public int add(int a, int b){ int result; result=a+b; return result; }
 */

/*
 * //stringreversewith_andwithoutStringBufferclas public void
 * stringreversewith_andwithoutStringBufferclass() { //with stringbuffer public
 * String invertWithStringBuffer(final String str) { final StringBuffer buffer =
 * new StringBuffer(str); buffer.reverse(); return buffer.toString(); }
 * //without stringbuffer
 * 
 * public String invertWithoutStringBuffer(final String str) {
 * 
 * final int length = str.length(); final String original = str; String invert =
 * ""; for (int i = length - 1; i >= 0; i--) { invert = invert +
 * original.charAt(i); } return invert; }
 * 
 * public static void main(final String[] args) { final
 * stringreversewith_andwithoutStringBufferclass invertStr = new
 * stringreversewith_andwithoutStringBufferclass();
 * System.out.println("Inverted String with StringBuffer class: " +
 * invertStr.invertWithStringBuffer("987654321")); System.out.println("");
 * System.out.println("Inverted String without StringBuffer class: " +
 * invertStr.invertWithoutStringBuffer("kjihgfedcba")); } }
 */
  
  
  