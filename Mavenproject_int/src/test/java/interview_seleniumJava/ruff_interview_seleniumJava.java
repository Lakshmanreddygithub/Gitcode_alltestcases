package interview_seleniumJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ruff_interview_seleniumJava {

	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();	
		
		//We can delete cookies in 3 ways.   
				//driver.manage().deleteCookieNamed("CookieName");
				//driver.manage().deleteCookie(CookieId);
				driver.manage().deleteAllCookies();	
				
				
		
		
		
	}
}
