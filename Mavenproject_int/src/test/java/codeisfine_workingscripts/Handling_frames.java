package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handling_frames {
public static WebDriver driver;

/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
/**
 * @param args
 */
public static void main(String[] args) {
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();

//code to find the number of frames in a web page -	
	driver.get("https://seleniumautomationpractice.blogspot.com/2019/07/example-of-html-iframe-alternative.html");		
	System.out.println(driver.findElements(By.tagName("frame")).size());
	System.out.print("No. of Frames:");	
//The frame is a web page embedded in another web page or an HTML document embedded in another HTML document. The IFrame is frequently used to insert content from another source into a Web page. The <iframe> tag specifies an inline frame.
	/*
	 * The frame inside the frame is called nested frames. To switch from one frame
	 * to another first switch to the outer frame by either index or ID of the
	 * iframe. Once you switch to the outer frame you can find the total number of
	 * iframes inside the outer frame and then switch to the inner frame by any
	 * known method. You should follow the same order as we entered into the frame
	 * while exiting that is an exit from the inner frame first and then the outer
	 * frame.
	 */	
//Syntax to switch frame are:
	
	  driver.switchTo().frame(0);// (switch to outer frame) 
	  int count = driver.findElements(By.tagName("iframe")).size();// (get iframe count)
	  System.out.println(count);
	  driver.switchTo().frame(0); //(Switching to inner frame)
	  driver.switchTo().parentFrame(); //(to move back to parent frame)
	  driver.switchTo().defaultContent();// (to move back to main frame, mostly  parent frame)
	 
	/*
	 * driver.get("https://gmail.com/"); driver.manage().window().maximize();
	 * //driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); int size
	 * = driver.findElements(By.tagName("iframe")).size(); for(int i=0; i<=size;
	 * i++){ driver.switchTo().frame(i); int
	 * total=driver.findElements(By.tagName("iframe")).size();
	 * System.out.println(total); driver.switchTo().defaultContent(); }
	 */		
	  
//How do you handle a frame in WebDriver?	
	//An iframe (an acronym for ‘inline frame’) is used to insert another document within the current HTML document.
		//Selecting iframe by ID:
			//driver.switchTo().frame(“ID of the frame“);
		//Locating iframe using the tagName:	
			//driver.switchTo().frame(driver.findElements(By.tagName(“iframe”).get(0));
		//Locating iframe using index:
	
			//frame(index)
			//driver.switchTo().frame(0);
		//frame(“Name of the Frame”)
			//driver.switchTo().frame(“name of the frame”);
		//frame(WebElement element)
		//Select Parent Window
			//driver.switchTo().defaultContent();	
//Handling_Frames	
	/*
	 * // Select iframe by id driver.switchTo().frame("ID of the frame"); //Locating
	 * iframe using tagName
	 * //driver.switchTo().frame(driver.findElements(By.tagName("iframe").get(0));
	 * //Locating iframe using index-frame(index) driver.switchTo().frame(0);
	 * //frame(Name of Frame) driver.switchTo().frame("name of the frame"); //
	 * frame(WebElement element) // Select Parent Window
	 * driver.switchTo().defaultContent();
	 */	
//Which technique should you consider using throughout the script “if there is neither frame id nor frame name”?
	
	/*If neither frame name nor frame id is available, then we can use frame by index.
	Let’s say, that there are 3 frames in a web page and if none of them have frame name and frame id, then we can still select those frames by using frame (zero-based) index attribute. Each frame will have an index number. The first frame would be at index “0”, the second at index “1” and the third at index “2”. Once the frame has been selected, all subsequent calls on the WebDriver interface will be made to that frame.
*/
	//driver.switchTo().frame(int arg0);
	
  
	//move to a particular frame in Selenium?       
	
	//driver.switchTo().frame("{frameIndex/frameId/frameName}");
	//For locating a frame, we can either use the index (starting from 0), its name, or its Id.
	
	
	
	
	}

}
