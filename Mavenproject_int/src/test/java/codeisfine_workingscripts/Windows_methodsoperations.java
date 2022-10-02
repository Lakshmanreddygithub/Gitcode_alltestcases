package codeisfine_workingscripts;

import org.openqa.selenium.WebDriver;

public class Windows_methodsoperations {
	public static WebDriver driver;
	public static void main(String[] args) {

//How to switch between multiple windows in Selenium?
		
		//Ans. Selenium has driver.getWindowHandles() and driver.switchTo().window(“{windowHandleName}”) commands to work with multiple windows.

		//The getWindowHandles() command returns a list of ids corresponding to each window. If we pass a particular window handle to the driver.switchTo().window(“{windowHandleName}”) command then we can switch control/focus to that particular window.

			/*
			 * for (String windowHandle : driver.getWindowHandles()) {
			 * driver.switchTo().window(handle); }
			 */
		
// What is the difference between getwindowhandles() and getwindowhandle()?
		//getwindowhandles(): It is used to get the address of all open browsers, and its return data type is Set<String>.
		//getwindowhandle(): It is used to get the address of the current browser where the control is, and its return type is a string data type
		
//How to switch to a new window (new tab) which opens up after you click on a link?
	
		// to switch to a new window:
	driver.switchTo().window("provide window name");
//you can use the driver.getWindowHandle() command to get the name of all the windows that were initiated by the WebDriver.
//Note that it will not return the window names of browser windows which are not initiated by your WebDriver.
//Once you have the name of the window, then you can use an enhanced for loop to switch to that window. Look at the piece of code below.

	//use an enhanced for loop to switch to that window. Look at the piece of code below.
	
		String handle= driver.getWindowHandle();	
		for (String handle1 : driver.getWindowHandles()) 
		{
		driver.switchTo().window(handle1);
		}
		
//How to handle multiple windows in Selenium?
		
	//A window handle is a unique identifier that holds the address of all the windows.
	//This is basically a pointer to a window, which returns the string value.
	   //methods
			//get.windowhandle(): helps in getting the window handle of the current window.
			//get.windowhandles(): helps in getting the handles of all the windows opened.
			//set: helps to set the window handles which is in the form of a string.
			//switch to: helps in switching between the windows.
			//action: helps to perform certain actions on the windows.		

//switchTo() command is used to switch between windows, frames or pop-ups within the application. 
//Every window instantiated by the WebDriver is given a unique alphanumeric value called “Window Handle”.
	
	/*
	 * //Get the window handle of the window you wish to switch to
	 * 
	 * String handle= driver.getWindowHandle();
	 * 
	 * //Switch to the desired window
	 * 
	 * driver.switchTo().window(handle);
	 * 
	 * //Alternatively
	 * 
	 * //for(Set<String> handle1= driver.getWindowHandles())
	 * 
	 * //{ driver.switchTo().window(handle1); }
	 */	
		
	}
}

