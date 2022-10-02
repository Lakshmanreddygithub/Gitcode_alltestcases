package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dimensionclass_resizesetsizewindow_Usingjse {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
//How to set the size of browser window using Selenium?
		
//To maximize the size of browser window, you can use the following piece of code:
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	driver.manage().window().maximize();// – To maximize the window
	
//To resize the current window to a particular dimension, you can use the setSize() method. Check out the below piece of code:
	System.out.println(driver.manage().window().getSize());
	Dimension d = new Dimension(420,600);
	driver.manage().window().setSize(d);
	
//To set the window to a particular size, use window.resizeTo() method. Check the below piece of code:
	((JavascriptExecutor)driver).executeScript("window.resizeTo(1024, 768);");
		
	//Dimension 
	
			//=============== getSize() ===================
			WebElement dimensionsElement = driver.findElement(By.id("u_0_15"));		
			Dimension dimensions = dimensionsElement.getSize();
			System.out.println("Height :" + dimensions.height + "Width : " + dimensions.width);
			
			//======= getLocation() ========================
			WebElement locationElement = driver.findElement(By.id("u_0_15"));
			Point mpoint = locationElement.getLocation();
			System.out.println("X coordinate : " + mpoint.x + "Y coordinate: " + mpoint.y);
	
	}

}

