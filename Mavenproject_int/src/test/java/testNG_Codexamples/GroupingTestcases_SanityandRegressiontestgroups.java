package testNG_Codexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingTestcases_SanityandRegressiontestgroups { 
    WebDriver driver;  
//sanity group regression group
@Test(groups = {"sanity", "regression"},priority=1)
	  public void launchBrowser(){
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  }
 
 @Test(groups = {"sanity","regression"},priority=6)
	  public void closeBrowser(){
	  driver.close();
	  }
 
 @Test(groups = {"sanity","regression"},priority=2)
 	  public void verifyGoogleTitle(){
	  driver.get("https://www.google.com/");
	  Assert.assertEquals("Google", driver.getTitle());}
 
@Test (groups = {"regression"}, priority=3)

public void verifyYahooTitle(){
	
	  driver.get("https://in.yahoo.com/");		  
	  String Yahaoomessage= driver.getTitle();
	  System.out.println(Yahaoomessage);
	  Assert.assertEquals("Yahoo Search - Web Search",Yahaoomessage);}

@Test (groups = {"regression"}, priority=4)

public void verifyBankOfAmericaTitle(){
	driver.get("https://www.bankofamerica.com/");
	Assert.assertEquals("Bank of America - Banking, Credit Cards, Loans and Merrill Investing", driver.getTitle());}

 @Test (groups = {"regression"}, priority=5)
 
 public void verifyGcreddyTitle(){
		driver.get("http://www.gcreddy.com/");
		Assert.assertEquals("Software testing | Manual Testing | UFT | Selenium | Java | SQL | Python Tutorials", driver.getTitle());
		}
	  }


