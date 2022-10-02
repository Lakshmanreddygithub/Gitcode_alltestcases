package testNG_Codexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatemultipleTestcasesandRun_UsingPriority {
	
//Test Cases:i) launchBrowser()-ii) verifyGoogleTitle()-iii)verifyYahooTitle()-iv) closeBrowser()
//TestNG executes Test cases in Alphabetical order
//Usnig "priority" attribute we can prioritize Test cases then we can control the test execution process
public static WebDriver driver;	
	@Test (priority=1)
		public void launchBrowser(){
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();	}	
	@Test (priority=2)
		public void verifyGoogleTitle(){
			driver.get("https://www.google.com/");
			Assert.assertEquals("Google", driver.getTitle());}
	@Test (priority=3)
		public void verifyYahooTitle(){
			driver.get("https://in.yahoo.com/");
			Assert.assertEquals("Yahoo", driver.getTitle()); }
	@Test (priority=4)
		public void closeBrowser(){
			driver.close();
	}
}


