package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytheElementExistence_UsingisDisplayedandBoolean {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

//isDisplayed used to verify element existence

		driver.get("https://www.google.com");

		
		  boolean linkExistence=driver.findElement(By.linkText("Gmail")).isDisplayed();
		  
		  if (linkExistence == true){
		  
		  System.out.println("Gmail Link Exists - Passed"); }
		  else{		  System.out.println("Gmail Link Not Exists - Failed"); 
		  } 
		  //driver.close();
		 
		
		/*
		 * if (driver.findElement(By.linkText("Gmail")).isDisplayed() == true) {
		 * System.out.println("Gmail Link Exists - Passed"); } else {
		 * System.out.println("Gmail Link Not Exists - Failed"); }
		 */

	}

}
