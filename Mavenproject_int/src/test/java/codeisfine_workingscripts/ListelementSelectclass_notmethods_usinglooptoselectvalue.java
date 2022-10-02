package codeisfine_workingscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListelementSelectclass_notmethods_usinglooptoselectvalue {
	
	public static void main(String[] args) {
		
//browser driver setup
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.opencart.com/index.php?route=account/register");
	
//select class country drop down			
	WebElement dropdowncountry =driver.findElement(By.id("input-country"));	
	
	Select mydropdowncountry = new Select(dropdowncountry);		
	mydropdowncountry.selectByIndex(20);
	mydropdowncountry.selectByValue("30");
	mydropdowncountry.selectByVisibleText("France");
	mydropdowncountry.deselectAll();
	mydropdowncountry.getOptions();
	mydropdowncountry.selectByIndex(2);
	//returns true or false value 
	System.out.println(driver.findElement(By.id("India")).isSelected());
//without methods using loop to select value from the drop down
	
	List <WebElement> alloptionsfromdropdown=mydropdowncountry.getOptions();
	
	System.out.println(alloptionsfromdropdown);
	
	for (WebElement options : alloptionsfromdropdown) {	
		
		if (options.getText().equals("India")) {
			
			options.click();
			
			break;//is used to exit from loop
			
			}
	}	
	}
}


