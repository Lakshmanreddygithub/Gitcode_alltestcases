package codeisfine_workingscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadDownloadfile_sendkeys_robot_autoit {
	
	public static WebDriver driver;
	public static void main(String[] args) {
// browser info		
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  
//How to do file upload in Selenium?
	  //Ans. File upload action can be performed in multiple ways-
	 // Using element.sendKeys(“path of file”) on the webElement of input tag and type file i.e. the elements should be like –
	  //<input type=”file” name=”fileUpload”>
	  //With the help of Robot API.
	 // Using the AutoIT API.
		  
//Explain how to upload a file using AutoIt tool?
		  
		/*
		 * Download and install AutoIt tool
		 * 
		 * Open SciTE Script editor and add the below mentioned AutoIt script. Save it
		 * as ‘UploadFile.au3’ in your system.
		 * 
		 * Below is the AutoIt Script:
		 * 
		 * WinWaitActive("File Upload")
		 * Send("D:\SoftwareTestingMaterial\UploadFile.txt") Send("{ENTER}") Save it as
		 * ‘UploadFile.au3’
		 * 
		 * After the file is saved, we need to convert the ‘UploadFile.au3’ to
		 * ‘UploadFile.exe’. (This can be done by Right Click on the file and click on
		 * ‘Compile Script’) .
		 * 
		 * Add the below mentioned Selenium Script and run :
		 * 
		 * Runtime.getRuntime().exec(“D:\\Automation\\AutoIt\\Uploadfile.exe”);
		 */

		  
// Uploadfile using SendKeys method		
		  
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		//pass the path of the file to be uploaded using Sendkeys method
		browse.sendKeys("C:\\QA Testing D Drive\\Testdata.xlsx");
		//'close' method is used to close the browser window
		driver.close();
//Upload file using AutoIt Script in Selenium WebDriver:
		
	//To open URL "http://softwaretestingmaterial.com"
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	//Locating 'browse' button
	WebElement browse1 =driver.findElement(By.id("uploadfile"));
	//To click on the 'browse' button
	browse1.click();
	
	//To call the AutoIt script
	
	//Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\Uploadfile.exe");
	//'close' method is used to close the browser window
	//driver.close();

//download file using AutoIt Script in Selenium WebDriver:
	
	//To open URL
	driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
	//Download Text File
	driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
	//To call the AutoIt script
	//Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\DownloadFile.exe");
	//'close' method is used to close the browser window
	//driver.close();
	
	
//---------------------------------------		
/*code to compile the file to upload
WinWaitActive("Open")
Send("C:\\Users\\dell\\Desktop\\Logindata.xlsx")
Send("{ENTER}"
*/
//-------------------------------------------		
	
//download file using AutoIt Script in Selenium WebDriver:
	
//Compile code to download file
	
/*
 * //wait for 8 seconds to appear download and save dialog. Used class property
 * of download dialog. WinWait("[CLASS:#MozillaDialogClass]","",8) //Perform
 * keyboard ALT key + s key to select Save File Radio button using keyboard
 * shortcut. Send("!s") // Wait for 9 seconds Sleep(9000) //Press Keyboard ENTER
 * button. Send("{ENTER}")
 */
	//To open URL
			driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
			//Download Text File
			driver.findElement(By.xpath("//*[@id='post-body-5864649494765988891']/div[1]/form/div[1]/a[1]")).click();
			//To call the AutoIt script
			//Runtime.getRuntime().exec("D:\\SoftwareTestingMaterial\\AutoIt\\DownloadFile.exe");
			//'close' method is used to close the browser window
			//driver.close();
//Follow the below steps:

	//Download Autoit tool from here and install it
	//Open Programs – Autoit tool – SciTE Script Editor and add the below mentioned AutoIt script in Autoit 
	//editor and save it as ‘UploadFile.au3’ in your system
	//Convert it as ‘UploadFile.exe’
	//In Eclipse, add the below mentioned Selenium Script and run
	
	}

}

//How to upload a file?

		/*
		 * There are two ways you can upload file in selenium WebDriver, one is using
		 * SendKey method when there is text box available to enter the file’s name and
		 * second is using AutoIT Script tool when there is no text box to enter the
		 * file’s name.
		 * 
		 * Upload file using SenKey() method – First, locate the text box and then using
		 * SendKey() set the file path and click on the Submit button. Syntax is –
		 * 
		 * //locate browse button WebElement browse
		 * =driver.findElement(By.id("id value")); //pass the path of the file to be
		 * uploaded using Sendkeys method
		 * browse.sendKeys("D:\\SoftwareTestingMaterial\\UploadFile.txt"); //click on
		 * submit button driver.findelement(By.id(“id value”)).click; Upload using
		 * open-source AutoIT Script tool First, download and install the AutoIT Script
		 * tool (http://www.autoitscript.com/site/autoit) Open Autoit tool -> SciTE
		 * Script Editor Paste below code in editor and save it with .exe extension say
		 * test.exe WinWaitActive("File Upload"); Name of the file upload window
		 * (Windows Popup ame: File Upload)
		 * 
		 * Send("logo.jpg"); File name Send("{ENTER}"); Compile code and then build
		 * tools menu of AutoIT editor Paste below code in Java editor and execute test
		 * // open the Upload window using selenium
		 * driver.findElement(By.id("Id value")).click(); //wait for page to load
		 * Thread.sleep("20000");
		 * Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " +
		 * "<filepath>\\test.exe"); // Give path where the exe is saved.
		 */