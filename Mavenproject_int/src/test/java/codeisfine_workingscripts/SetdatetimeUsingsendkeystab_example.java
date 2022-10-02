package codeisfine_workingscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetdatetimeUsingsendkeystab_example {

    public static void main(String [] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/");
  //DateTimePicker_example    
        WebElement Datepicker=driver.findElement(By.xpath("/html/body/form/input[1]"));
//enter date
        Datepicker.sendKeys("06041986");

//use keyboard operation tab
        Datepicker.sendKeys(Keys.TAB);
Thread.sleep(1000);
//enter time
	Datepicker.sendKeys("0505PM");

    }

    }

