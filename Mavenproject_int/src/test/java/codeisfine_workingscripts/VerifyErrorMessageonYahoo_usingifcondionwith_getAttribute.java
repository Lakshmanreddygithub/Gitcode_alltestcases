package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class VerifyErrorMessageonYahoo_usingifcondionwith_getAttribute {
	WebDriver driver;	
	
	//all void methods no main method
@Test
	public void VerifyErrorMessageonYahoo_function() throws InterruptedException{
	
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"ysignin\"]/div")).click();
		driver.findElement(By.id("login-signin")).click();
		//driver.quit();
		
//VerifyErrorMessage-getAttribute		
		String ExpectedMessage ="username-error";		
		String ActualMessage=driver.findElement(By.xpath("//*[@id=\"username-error\"]")).getAttribute("id");		
		System.out.println("attribute value is :" +ActualMessage);
		
	if (ExpectedMessage.equals(ActualMessage)){
		System.out.println("test pass : message found");		
	}		
	else {
		System.out.println("test fail : element not found");
	}	
	}

@AfterMethod

public void closebrowser() {
	//driver.close();
}

}


