package codeisfine_workingscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handle_alertsandpopups {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	
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
			
//Syntax send the value to the alert is -

		//alert.sendkeys(String tringToSend);
		 
//Handle authentication popups
	 	 	
	 	driver.get("https://the-internet.herokuapp.com/basic_auth");		 	
	 	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");	
	 	
//How to handle alerts in Selenium?
		//Ans. In order to accept or dismiss an alert box, the alert class is used.
		//This requires first switching to the alert box and then using accept() or dismiss() command
		Alert alert = driver.switchTo().alert(); 
		//To accept the alert
		alert.accept();		
		//To cancel the alert box
		alert.dismiss();		
		//Handle alert		  
		  driver.findElement(By.id("alert")).click();
		  //Thread.sleep(3000);		  
		  Alert alert1 = driver.switchTo().alert();
		  String alertMessage = driver.switchTo().alert().getText();
		  System.out.println(alertMessage);
		  //Thread.sleep(3000);
		  alert.accept();
		  //Thread.sleep(3000);
				
//Explain how you will login into any site if it is showing any authentication popup for username and password?		

	//Since there will be popup for logging in, we need to use the explicit command and verify if 
	//the alert is actually present. Only if the alert is present, we need to pass the username and password credentials. 

//How can the message in the alert box be retrieved?
//storeAlert() command can be used to retrieve the message from the alert pop-up and store it in a variable.	
		
//The sample code for using the explicit wait command and verifying the alert is below:

		//WebDriverWait wait = new WebDriverWait(driver, 10); 
		//Alert alert2 = wait.until(ExpectedConditions.alertIsPresent()); 
		//alert.authenticateUsing(new UserAndPassword("usrname","password"));	
				
	}

}

//How would you handle the alert popups in Selenium Webdriver?		
	//Ans. First, you’ve to switch the control to the pop up then press the ok or cancel button.
	//After that, turn back to the source page screen.
	
	/*
	 * String srcPage = driver.getWindowHandle(); Alert pop =
	 * driver.switchTo().alert(); // shift control to the alert popup. pop.accept();
	 * // click on ok button. pop.dismiss(); // click on cancel button. // Move the
	 * control back to source page. driver.switchTo().window(srcPage); // move back
	 * to the source page.
	 *///---------------------------------------------------------------------------------
//How can we handle web-based pop-up?
	
	//WebDriver offers the users a very efficient way to handle these pop-ups using Alert interface.
	//There are the four methods that we would be using along with the Alert interface.

//void dismiss() The dismiss() method clicks on the “Cancel” button as soon as the pop-up window appears.
//void accept() – The accept() method clicks on the “Ok” button as soon as the pop-up window appears.
//String getText() – The getText() method returns the text displayed on the alert box.
//void sendKeys(String stringToSend) – The sendKeys() method enters the specified string pattern into the alert box.
//Syntax:
//accepting javascript alert
	/*
	 * Alert alert = driver.switchTo().alert(); alert.accept();
	 */
//--------------------------------------------------------------------------------
//We could handle windows based popups in Selenium using some third party tools such as AutoIT, Robot class etc.           	
    

	/*
	 * A small message/dialogue box that appears on the top of a web application and
	 * it provides some information/warning to the user is an alert. It may expect
	 * input information from the user.
	 * 
	 * In web applications, there are three kinds of popup boxes,
	 * 
	 * Alert box Confirm box Prompt box Alert box-
	 * 
	 * To display some information to the user an alert box is used. The user needs
	 * to click the OK button displayed on an alert box that shows up to proceed.
	 * 
	 * Alert box
	 * 
	 * Confirm box -
	 * 
	 * When an application wants to get confirmation from the user, a confirmation
	 * box is used. The user needs to click on either Yes/Ok button or No/Cancel
	 * button on the confirm box to proceed further.
	 * 
	 * Confirm box
	 * 
	 * Prompt box -
	 * 
	 * When an application expects input from the user immediately after opening it,
	 * a prompt box is used. After Entering the input, the user needs to click on
	 * either Yes/Ok button or No/Cancel button when the confirm box shows up to
	 * proceed further.
	 * 
	 * Prompt box
	 * 
	 * You can’t inspect any button or textbox present on any popup boxes using the
	 * Developer tool. Pop-up boxes block screen and appear on top of the screen.
	 * Users cannot perform any action on screen unless you handle these pop-ups.
	 * 
	 * User can perform below operations on these pop-ups using selenium are,
	 * 
	 * Accept - to click on the OK button Dismiss - to click on Cancel button
	 * SendKeys - to enter text in the text box available on the pop-up GetText - to
	 * get label text on pop-up
	 */

	/*
	 * Thread.sleep(2000);
	 * 
	 * String alertBoxOutput, popupText; // Alert popups
	 * driver.findElement(By.id("alertBox")).click(); popupText =
	 * driver.switchTo().alert().getText(); Assert.assertEquals(popupText,
	 * "I am an alert box!"); driver.switchTo().alert().accept(); alertBoxOutput =
	 * driver.findElement(By.id("output")).getText();
	 * Assert.assertEquals(alertBoxOutput, "You selected alert box"); //Confirmation
	 * popups driver.findElement(By.id("confirmBox")).click(); popupText =
	 * driver.switchTo().alert().getText(); Assert.assertEquals(popupText,
	 * "Press a button!"); driver.switchTo().alert().accept(); alertBoxOutput =
	 * driver.findElement(By.id("output")).getText();
	 * Assert.assertEquals(alertBoxOutput, "You pressed OK in confirm box");
	 * driver.findElement(By.id("confirmBox")).click();
	 * driver.switchTo().alert().dismiss(); alertBoxOutput =
	 * driver.findElement(By.id("output")).getText();
	 * Assert.assertEquals(alertBoxOutput, "You pressed Cancel in confirm box");
	 * //Prompt pop ups driver.findElement(By.id("promptBox")).click(); popupText =
	 * driver.switchTo().alert().getText(); Assert.assertEquals(popupText,
	 * "Please enter your name:"); driver.switchTo().alert().sendKeys("Reddy");
	 * driver.switchTo().alert().accept(); alertBoxOutput =
	 * driver.findElement(By.id("output")).getText();
	 * Assert.assertEquals(alertBoxOutput, "You entered text Reddy in prompt box");
	 * driver.findElement(By.id("promptBox")).click();
	 * driver.switchTo().alert().dismiss(); alertBoxOutput =
	 * driver.findElement(By.id("output")).getText();
	 * Assert.assertEquals(alertBoxOutput, "You pressed Cancel in prompt box.");
	 * 
	 * driver.quit();
	 */