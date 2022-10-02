package testNG_Codexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/*// //driver= new ChromeDriver();	
Execute the “ListenerTestNGTestCase” class. Methods in class “ListenerTestNG” 
 * are called automatically according to the behavior of methods annotated as @Test
////TestNG Listeners. Using TestNG listeners we could generate logs and customize TestNG Reports.
//ListenerTestNG	implements ITestListener		
		
		 * //WebDriver Event Listeners in Selenium WebDriver. Listeners “listen” to the
		 * event defined in the selenium script and behave accordingly. The main purpose
		 * of using listeners is to create logs and reports.
//Verify the Output in the console. You could find the logs in the console.
//If you want to use listeners in multiple classes.
//Add the below lines of code in the TestNG.xml file
//	
/*<listeners>
        <listener class-name="listeners.listenerTestNG"/>
</listeners>*/

@Listeners(ListenerTestNG.class)
public class ListenerTestNGTestCase {
	public static WebDriver driver;
	@Test(priority=1)	
	public void TestToPass()				
	{	
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();	
	    System.out.println("This method to pass test");	
	    driver.get("https://www.softwaretestingmaterial.com/100-software-testing-interview-questions/");	
	    driver.getTitle();
	    driver.quit();
	}		
	//Used skip exception to skip the test
	@Test(priority=2)
	public void TestToSkip ()
	{
          System.out.println("This method to skip test");
	    throw new SkipException("Skipping - This is not ready for testing ");
	}
	// In the above method, we have already closed the browser. So we couldnot get the title here. It is to forcefully fail the test			
	@Test(priority=3)		
	public void TestToFail()				
	{		
	    driver.getTitle();
	    System.out.println("This method to test fail");	
}
}