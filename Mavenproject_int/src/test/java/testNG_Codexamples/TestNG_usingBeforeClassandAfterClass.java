package testNG_Codexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_usingBeforeClassandAfterClass {
	  WebDriver driver;	  
@BeforeClass
	  public void launchBrowser(){
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }
	  @Test (priority=1)	  
	  public void verifyGoogleTitle(){
	  driver.get("https://www.google.com/");
	  Assert.assertEquals("Google", driver.getTitle());
	  }
	  @Test (priority=2)
	  public void verifyYahooTitle(){
		  driver.get("https://in.yahoo.com/");		  
		  String Yahaoomessage= driver.getTitle();
		  System.out.println(Yahaoomessage);
		  Assert.assertEquals("Yahoo Search - Web Search",Yahaoomessage);}
	  @Test (priority=3)
	  public void verifyGuru99pageTitle() throws InterruptedException{
		  driver.get("http://www.demo.guru99.com/V4/");
		  Thread.sleep(2000);
		  String Guru99pagetitle = driver.getTitle();		  
		  Assert.assertEquals("Guru99 Bank Home Page", Guru99pagetitle);}	  
@AfterClass
	  public void closeBrowser(){
	  driver.close();
	  }
	  }

