package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInternalandExternalLinksinwikipedia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://en.wikipedia.org/wiki/Selenium_(software)#Selenium_WebDriver");
		Thread.sleep(4000);
		driver.findElement(By.linkText("Create account")).click();
	//Getcurrenturl
		Thread.sleep(4000);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
	//use if conditions and contains method to check	
		if (url1.contains("wikipedia.org")){
			System.out.println("1st Verification: "+ "It is an Internal Link - Passed");
			}
			else{
			System.out.println("1st Verification: "+ "It is Not an Internal Link - Failed");
			}
		//---------------------if ends------------------------
		Thread.sleep(4000);
			driver.navigate().back();
			Thread.sleep(4000);
		//verify external link	
			driver.findElement(By.partialLinkText("github.com")).click();
			Thread.sleep(4000);
			String url2=driver.getCurrentUrl();
			System.out.println(url2);
			
			if (url2.equals("https://github.com/SeleniumHQ/")){
			System.out.println("2nd Verification: "+ "It is an External Link - Passed");
			}
			else
			{
			System.out.println("2nd Verification: "+ "It is Not an External Link - Failed");
			}
			//driver.close();	
			
	}

}
