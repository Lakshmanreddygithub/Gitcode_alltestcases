package codeisfine_workingscripts;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class SGrid_HubNodes_remoteexecution {
	
//To execute scripts two important library packages DesiredCapabilities object and RemoteWebDriver object are required.
//You can mouse hover on the logos of browser present in the Selenium Hub console to get the details like browserName,platform of the Node.	
	public static WebDriver driver;
	static String nodeUrl;	
	 @Test(priority=1)
	 
	 public void Grid_nodeurlcapabilitiessetup() throws MalformedURLException {	
		 
		//node url		 
		 
				 nodeUrl ="http://192.168.0.18:4444/wd/hub";
		//DesiredCapabilities library is used  to set browser type and the OS of Node. 
				 
				 DesiredCapabilities capabilities = new DesiredCapabilities();
				 capabilities.setBrowserName("chrome");
				 capabilities.setPlatform(Platform.WINDOWS);
		//The RemoteWebDriver object is used to select the Node on which test will be executed. 
				 
				 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
				 driver =new RemoteWebDriver(new URL(nodeUrl),capabilities);
				 driver = new ChromeDriver(); 	 }	 
	 @Test(priority=2) 
	 
	 public void simpleTest_torunonNodeVM() throws InterruptedException {		 
		driver.get("https://www.gmail.com");	 
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("123");//email fields		
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));	 }	 
	 //@Test(priority=3)
	 /*public void afterTest()
	 {  driver.quit();	 }*/
 
	//-------------------------------------
	 
	/*
	 * public static void main(String[] args) {
	 * 
	 * }
	 */

}

//Explain how Selenium Grid works.
	//1.Selenium Grid creates a test suite that works by forwarding test cases to the hub,
	//2.and from there, the test cases are redirected to Selenium WebDriver.
	//3.WebDriver will then execute them in the browser. The test suite allows for running tests in parallel.
//What is Selenium Grid?
	/*
	 * Selenium Grid is a tool that helps in the distributed testing. Using Grid, we
	 * can run test scripts in different machines having different browsers, browser
	 * versions, platforms, etc in parallel. In the Selenium grid, there is a hub
	 * that is a central server managing all the distributed machines known as
	 * nodes.
	 */
//What are some advantages of the Selenium grid?
	/*
	 * The advantages of the Selenium grid are-
	 * 
	 * It allows running test cases in parallel thereby saving test execution time.
	 * Multi-browser testing is possible using the Selenium grid by running the test
	 * on machines having different browsers. Also, we can do multi-platform testing
	 * by configuring nodes having different operating systems.
	 */
//What is a hub in the Selenium Grid?
	/*
	 * hub is a server or a central point in the Selenium grid that controls the
	 * test executions on the different machines
	 */
//What is a node in the Selenium Grid?
	/*
	 * Nodes are the machines that are attached to the selenium grid hub and have
	 * selenium instances running the test scripts. Unlike a hub, there can be
	 * multiple nodes in the selenium grid.
	 */
//Why & When To Use Selenium Grid?

	/*
	 * Many web browsers are available and used nowadays. Users may use FireFox, or
	 * Safari, or Chrome, or Internet Explorer browser for reading. Users may use
	 * different versions of the browsers and also may be running browsers on any OS
	 * like Windows, or Mac, or Linux.
	 * 
	 * To help users get the best user experience, you need to go extra miles and
	 * test Web application on different browsers along with different platforms.
	 * You need to test applications on different browsers and OS. You need to put
	 * extra effort and spend time testing your web application on every possible OS
	 * and available browser. Is it possible and feasible? Now how to make it
	 * possible? Here Selenium grid fits well and saves your time and energy.
	 * 
	 * Now the question is, Is it possible to set up selenium grid infrastructure
	 * using local systems? It is challenging to maintain Selenium Grid with all
	 * required browsers and operating systems and for that multiple online
	 * platforms provide an online Selenium Grid which you can access to run
	 * selenium scripts.
	 */

//What is Selenium Grid?
	/*
	 * One of the important tools in the Selenium suite is Selenium Grid. Selenium
	 * grid has the capability of co-ordinating WebDriver tests or RC tests that can
	 * run on multiple browsers simultaneously. Selenium Grid can initiate WebDriver
	 * tests or RC tests on different operating systems. Selenium Grid even
	 * initiates or executes tests hosted on different machines. There can be only
	 * one hub and it will be a central part of the Selenium Grid setup and nodes
	 * are test machines on which tests are run.
	 * 
	 * Selenium Grid
	 * 
	 * Let us see how it works? Grid hosts a Hub-Node architecture. Here there is
	 * one Hub acts as the master and one or more nodes that act as slaves.
	 * 
	 * Consider you have 100 tests that are required to be executed simultaneously
	 * on different machines in different combinations of operating systems and
	 * browsers. Each machine has a different OS and inside OS, the test is executed
	 * on different browsers. This will save a lot of your execution time.
	 */

//Explain Selenium Grid architecture?

	/*
	 * We know Selenium Grid is one of the important tools of Selenium suite and it
	 * functions on Node and multiple hub basis. Let us see what is Hub and Node?
	 * and how it works?
	 * 
	 * The Hub - There is only one Hub called as master and that is a central point
	 * of that grid setup. Any grid setup will have only one Hub. Tests that need to
	 * be executed should be loaded on HUB. Tests that are loaded on Hub will be
	 * executed only on Nodes. Any host machine can be configured as Hub and will
	 * co-ordinated test execution on other hosts. The Nodes - Nodes are the
	 * machines on which tests are run. Hub will launch these tests. The Hub can
	 * launch one or more Nodes on remote machines or on the same machine where Hub
	 * is located. Each node can have different operating systems and different
	 * versions of the same browser or different browsers. You need to configure Hub
	 * first and the register nodes with Hub to execute tests.
	 */

//How to configure Hub on a Windows machine?
	/*
	 * Before proceeding further with configuration make sure Java is installed on
	 * your system and environment variable is set. Now to configure Hub, first, you
	 * need to download the Selenium Server Jar file
	 * 'selenium-server-standalone-3.141.59.jar' from Seleniumhq's website.
	 * 
	 * Configure Hub on a Windows machine
	 * 
	 * Place this Jar file in an appropriate directory (says c:/Selenium Server. )
	 * 
	 * Open windows command prompt and navigate to the directory where Jar file is
	 * stored.
	 * 
	 * for example c:>Selenium Server
	 * 
	 * Now execute below command -
	 * 
	 * java -jar selenium-server-standalone-3.141.59.jar -role hub Where
	 * selenium-server-standalone-3.141.59.jar is the downloaded jar file. -role
	 * flag is used to set a host machine as Hub. One thing to keep in mind is Hub
	 * will be up and running as long as the command prompt is open. By default, the
	 * selenium grid uses 4444 port for web interfaces. To check whether the Hub is
	 * up and running open browser and navigate to http://localhost:4444 and you
	 * will see below UI.
	 * 
	 */

//How to configure the Node?

	/*
	 * Nodes are host machines on which the tests are run. These tests are launched
	 * by the Hub. Hub can launch one or more nodes on remote machines or on the
	 * same machine where Hub is located. Node executes tests you loaded on the hub.
	 * 
	 * To configure nodes, you need to download the Jar files on the Node machines
	 * and place it on any directory of convenience. Open windows command prompt and
	 * execute below command-
	 * 
	 * java-DWebDriver.chrome.driver=C:chromedriver.exe -jar
	 * selenium-server-standalone-3.141.59.jar -role node -hub
	 * http://192.168.2.11:4444/grid/register
	 * 
	 * To set a Node on the same machine as you Hub, you need to open another
	 * command prompt other than Hub prompt.
	 * 
	 * DWebDriver.chrome.driver=C:chromedriver.exe is used to set the browser driver
	 * path. role node flag used to set a particular host machine as a node. hub
	 * http://192.168.2.11:4444/grid/register directs Node to connect with Hub using
	 * Hub's IP address. If you want to launch a Node on the same machine as your
	 * HUb, then you can specify ‘-hub http://localhost:4444/grid/register‘ in the
	 * command. To check Nodes are registered, open and browser and navigate to
	 * http://localhost:4444/grid/console. Once Selenium Grid is configured, you can
	 * proceed with the test script execution on Nodes.
	 */

//How to build a Selenium Grid?
	/*
	 * To execute scripts two important library packages DesiredCapabilities object
	 * and RemoteWebDriver object are required. DesiredCapabilities library is used
	 * to set browser type and the OS of Node. Use the below code to import the
	 * DesiredCapabilities object.
	 * import org.openqa.selenium.remote.DesiredCapabilities; The RemoteWebDriver
	 * object is used to select the Node on which test will be executed. Use the
	 * below code to import RemoteWebDriver object.
	 * import java.net.MalformedURLException; import java.net.URL; import
	 * org.openqa.selenium.remote.RemoteWebDriver; You can mouse hover on the logos
	 * of browser present in the Selenium Hub console to get the details like
	 * browserName and platform of the Node.
	 *Use below code to setup grid
	 * package TestGrid; import org.testng.annotations.AfterTest; import
	 * org.testng.annotations.BeforeTest; import org.testng.annotations.Test; import
	 * java.net.MalformedURLException; import java.net.URL; import org.junit.Assert;
	 * import org.openqa.selenium.Platform; import org.openqa.selenium.WebDriver;
	 * import org.openqa.selenium.remote.DesiredCapabilities; import
	 * org.openqa.selenium.remote.RemoteWebDriver; public class TestGrid { static
	 * WebDriver driver; static String nodeUrl;
	 * @BeforeTest public void setup() throws MalformedURLException { nodeUrl =
	 * "http://192.168.2.11:4444/wd/hub"; DesiredCapabilities capabilities =
	 * DesiredCapabilities.chrome(); capabilities.setBrowserName("chrome");
	 * capabilities.setPlatform(Platform.WINDOWS); driver = new RemoteWebDriver(new
	 * URL(nodeUrl), capabilities); }	 * @Test public void simpleTest() { driver.get("https://nikasio.com"); }
	 * @AfterTest public void afterTest() { driver.quit(); } } Here the test is
	 * divided into three test annotations @BeforeTest, @Test, and @AfterTest.
	 * In @BeforeTest, DesiredCapabilities and RemoteWebDriver objects are used to
	 * configure Node. In @Test directed Node to navigate to nikasio.com's home  * page.In @AfterTest, directed Node to quite the browser instance.
	 * On execution, you will get below output.May 18, 2018 4:15:07 PM org.openqa.selenium.remote.ProtocolHandshake
	 * createSession INFO: Detected dialect: OSS PASSED: simpleTest
	 */





























