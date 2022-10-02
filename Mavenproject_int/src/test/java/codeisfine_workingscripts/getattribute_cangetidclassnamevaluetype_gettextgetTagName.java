package codeisfine_workingscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getattribute_cangetidclassnamevaluetype_gettextgetTagName{
	
	public static void main(String[] args) {
		
//browserdriver setup
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();

	//get attribute can get - id,class,name,value,type
		
		WebElement emailinputfield=driver.findElement(By.name("Email"));
		emailinputfield.clear();
		
		  System.out.println("attribute id is :" +emailinputfield.getAttribute("id"));
		  
		  System.out.println("attribute class is :"+emailinputfield.getAttribute("class"));
		  
		  System.out.println("attribute name is :"+emailinputfield.getAttribute("name"));
		  
		  System.out.println("attribute value is :"+emailinputfield.getAttribute("value"));
		  
		  System.out.println("attribute type is :"+emailinputfield.getAttribute("type")); 
		  
//get text getTagName
		  System.out.println("gettext is :" +emailinputfield.getText());
	
		  
//getAttribute and getText for login button
		  
	WebElement loginbutton=	driver.findElement(By.xpath(" //button[normalize-space()='Log in']"));
	System.out.println(loginbutton.getAttribute("type"));
	System.out.println(loginbutton.getAttribute("class"));
//getText
	System.out.println("gettext is : " +loginbutton.getText());
	System.out.println("getTagName is : " +loginbutton.getTagName());	
loginbutton.click();
	}
	}
