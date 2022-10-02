package codeisfine_workingscripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//we have used the Robot class object called a robot with two inbuilt methods keyPress(KeyEvenet.VK_*) and keyRelease(KeyEvenet.VK_*).

public class Robotclass_keysandswitchingtabs {
	
       public static void main(String[] args) throws AWTException {  
    	   
    	 WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         //to click enter (Keys.ENTER);
         driver.get("https://www.google.com");
         //webelement object
         WebElement element1 = driver.findElement(By.name("q"));
         element1.sendKeys("guru99");
         element1.sendKeys(Keys.ENTER);
         
        //to open link in new tab 
         String value = Keys.chord(Keys.CONTROL,Keys.RETURN);
         System.out.println("value is :"+value);
         
         driver.findElement(By.partialLinkText("guru99")).sendKeys(value);
         
     //robot class navigate through tabs 
         Robot robot = new Robot(); // instantiated robot class
         robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys
         robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
         robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
         robot.keyRelease(KeyEvent.VK_2); //if you again want to go back to first tab press and release vk_1
        //go to first tab
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_1);
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_1);
       }
          
}

