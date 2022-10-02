package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigClass_datafromconfigproperties {	
	
	//read config file class
	reusable_methodsfunctions.ReadConfigfile ReadConfigfile=new reusable_methodsfunctions.ReadConfigfile();	
	
	//getting values from properties file and store in variables
		public String baseurl=ReadConfigfile.geturl();
		public String username=ReadConfigfile.getusername();
		public String password=ReadConfigfile.getpassword();
		public String browser=ReadConfigfile.getbrowser();
		
		
//logintest -data from config.properties
		
		//@Test
			public  void logintest_datafromconfigproperties() {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				System.out.println(browser);
				System.out.println(baseurl);
				System.out.println(username);
				System.out.println(password);
				
				driver.get(baseurl);				
				driver.findElement(By.name("userName")).sendKeys(username);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.name("submit")).click();
				
			}
	
			public static void main(String[] args) {
				
				ConfigClass_datafromconfigproperties configdataobj = new ConfigClass_datafromconfigproperties();
				
				configdataobj.logintest_datafromconfigproperties();
				
				
			}

}
