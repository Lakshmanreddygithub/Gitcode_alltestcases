package codeisfine_workingscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Robotclass_controlmousekeyboardoperationsevents {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

public static void main(String[] args) throws AWTException {
	
	//Let us see the code on how to declare robot class -

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN); //will press down key on the keyboard
		robot.keyPress(KeyEvent.VK_TAB); // will press tab key on the keyboar
//----------------------------
		
		 //driver.findElement(By.id("PopUp")).click();
		  Robot robot1 = new Robot();
		  robot.mouseMove(400, 5);
		  
		  //robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		 // Thread.sleep(2000);
		 // robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		  //Thread.sleep(2000);
		 // driver.quit();	
}
	
}
	
//This Robot class provides control over the mouse and keyboard devices.

//The methods include:

	//KeyPress(): This method is called when you want to press any key.
	//KeyRelease(): This method is used to release the p	ressed key on the keyboard.
	//MouseMove(): This method is called when you want to move the mouse pointer in the X and Y co-ordinates.
	//MousePress(): This is used to press the left button of the mouse.
	//MouseMove(): This method helps in releasing the pressed button of the mouse.	
		
//What is Robot API?
		//Ans. Robot API is used for handling Keyboard or mouse events.

		/*
		 * Robot robot = new Robot(); Simulate enter key action
		 * robot.keyPress(KeyEvent.VK_ENTER);
		 */
		
		
//Let’s handle a window-based pop-up using the Robot class.

		//Robot class is a java based utility to emulate the keyboard and mouse actions.

		/*We will automate one scenario

		Launch the browser and open “gmail.com”
		Enter username and password and click on the Sign button(Note script has dummy username and password)
		Click on the compose icon
		Click on the attachment icon and select the file to upload with the window based pop up.
		WebDriver Code using Robot Class

		Step 1: Create a new java class named as “DemoAlertWindow” under project “Learning_Selenium”
		Step 2: Import package import java.awt.Robot prior to the script creation.
		Step 3: Import package java.awt.event.KeyEvent allows the user to use keyPress and keyRelease events of a keyboard.
		Below is the test script that is equivalent to the above-mentioned scenario.*/

		/*
		 * // // click on compose button driver.findElement(By.xpath(
		 * "//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click(); // click on
		 * attach files icon driver.findElement(By.xpath(
		 * "//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();
		 * // creating instance of Robot class (A java based utility) //import
		 * java.awt.Robot; //import java.awt.event.KeyEvent; Robot rb =new Robot(); //
		 * pressing keys with the help of keyPress and keyRelease events
		 * rb.keyPress(KeyEvent.VK_D); rb.keyRelease(KeyEvent.VK_D); Thread.sleep(2000);
		 * rb.keyPress(KeyEvent.VK_SHIFT); rb.keyPress(KeyEvent.VK_SEMICOLON);
		 * rb.keyRelease(KeyEvent.VK_SEMICOLON); rb.keyRelease(KeyEvent.VK_SHIFT);
		 * rb.keyPress(KeyEvent.VK_BACK_SLASH); rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		 * Thread.sleep(2000); rb.keyPress(KeyEvent.VK_P); rb.keyRelease(KeyEvent.VK_P);
		 * rb.keyPress(KeyEvent.VK_I); rb.keyRelease(KeyEvent.VK_I);
		 * rb.keyPress(KeyEvent.VK_C); rb.keyRelease(KeyEvent.VK_C); Thread.sleep(2000);
		 * rb.keyPress(KeyEvent.VK_ENTER); rb.keyRelease(KeyEvent.VK_ENTER);
		 * Thread.sleep(2000); }
		 * 
		 * @AfterClass public void tearDown() { driver.quit();
		 */

//Robot class summay?

	/*
	 * In some automation scripts, there is a need to use mouse or keyboard actions
	 * to interact with OS like Alerts, download pop-up, Print pop-up, etc. and
	 * Selenium Webdriver cannot handle these OS pop-ups or applications.
	 * 
	 * A Robot is a class in Selenium and is used to generate native system input
	 * events for test automation, where you need control over the mouse and
	 * keyboard. To handle the OS popups which WebDriver does not handle, the Robot
	 * class was introduced.
	 * 
	 * The main purpose of ow Robot class is to assist automation testing for Java
	 * platform implementations. In other words, the Robot class provides control
	 * over mouse and keyboard devices.
	 * 
	 * This class is easy to implement and easily integrate with the automation
	 * framework.
	 * 
	 * Let us see the importance of the Robot class -
	 * 
	 * Using Robot class you can easily upload a file Robot class handle the mouse
	 * and keyboard functions pop-ups can be handled easily with Robot class
	 */		    
	/*
	Below are the few methods that help in the easy execution of test scripts required for Robot class implementation.
	
	KeyPress()
	KeyRelease()
	MouseMove()
	MousePress()
	MouseRelease()
	Let us understand these methods in details -
	
	KeyPress() - Use this method when you want to press any key
	Example : robot.keyPress(keyEvent.VK_UP); will press UP key on the keyboard.
	
	KeyRelease() - Use this method to release the pressed key on the keyboard.
	Example: robot.keyRelease(keyEvent.VK_CAPS_LOCK); will release the pressed caps lock key on the keyboard.
	
	MouseMove() - use this method when you want to move the mouse pointer in the X and Y coordinates.
	Example : robot.mouseMove(coordinates.get.X(),coordinates.get.Y());will move the mouse over X and Y coordinates.
	
	MousePress() - use this method to press the left button of the mouse.
	Example - robot.mousePress(InputEvent.BUTTON1_MASK); will press the mouse button
	
	MouseRelease() - Help this method in releasing the pressed button of the mouse.
	Example - robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); will release the right click of the mouse.
*/
	


	

