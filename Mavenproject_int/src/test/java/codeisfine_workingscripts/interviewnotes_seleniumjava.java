package codeisfine_workingscripts;

//public static By txtusername =By.name("uid");
//public static By txtpassword=By.name("password");
//public static By btnlogin=By.name("btnLogin");

public class interviewnotes_seleniumjava {

	public static void main(String[] args) {			
		// TODO Auto-generated method stub	
	
		/*//use keyboard operation tab need to import keys package
			 *	Datepicker.sendKeys(Keys.TAB);
			 
			//Alt + Shift + R	Rename of package, class name
				F11	Debug
				F5	Step Into function
				F6	Next step (line by line)
				F7	Step out
				F8	Skip to next Breakpoint
				isSelected() command is applicable on Radio Buttons and Checkboxes only
				1)how to run multiple testcases -multiple java class files -using testng.
				2)how to run multiple tests in single java class file without testng.
				3)Debugging scripts 
				4)Difference between run as java application and launch java application.
				5)Capture screenshot and store in results folder.
				6)How to highlight the element/object on the application.
				7)Call other(login)class from the another class.
				8)Create and use Reusable functions.
				9)what is the alternative for run from step in selenium.
				//Prerequisites for writing Selenium WebDriver Test Cases...
				i) Test Scenario or Manual Test Case
				ii) Element Locators to Locate/Recognize/Identify Elements/Objects
				iii) Selenium WebDriver API Commands to perform operations on elements
				iv) Programming Concepts to enhance the Test Cases
				v) Testing Framework (Junit/TestNG) to group Test cases, prioritize Test cases, execute Test batches and generate Test Reports
			 */
												
		/*//User defined Methods/Reusable Components.
		 * 
				Write Selenium WebDriver Test Cases using 
				Reusable Components:
				1) Launch Browser
				2) Login
				3) Close Browser...
				17)Selenium server -add javadoc location path to see the description of the methods commands.
			
				//this keyword is invoke an instance current class constructor
				//A Constructor in Java is a block of code similar to a method
				//that is called an instance of Object is created					
				*/			
		/*//TestNG Testing Framework for Selenium
				1) Introduction to TestNG Testing Framework
				2) Install TestNG and write first TestNG program
				3) Create multiple Test cases and run
				4) TestNG Annotations
				5) Execute multiple Programs / Classes using XML
				6) Grouping Test Cases
				7) Data driven testing using @DataProvider Annotation
				8) Parallel Test Execution
			//Advantages of TestNG for Selenium:
				- TestNG Annotations are easy to create Test Cases
				- Test cases can be grouped and prioritized more easily
				- Executes multiple programs/Classes using XML
				- Parallel Testing
				- Generates Test Reports
				Etc...
				b) TestNG Test Case:
				i) main method is not used in TestNG programs
				ii) TestNG programs contain methods only that contain Annotations
				iii) If we don't write @Test Annotation then the method won't be executed
				21)Results check verify  in console and testng results summary.*/

				/*22)Declare WebDriver variable with in the class to access that variable in all the methods which are in that class.
				if you declare a WebDriver variable with in the method that is applicable and can use in that method only.
*/
		/*Create multiple Test cases and Run				
				Example:
				Test Cases:
				i) launchBrowser()
				ii) verifyGoogleTitle()
				iii) closeBrowser()
				Genearal Test Execution Flow:
				TestNG executes Test cases in Alphabetical order
				i) closeBrowser()
				ii) launchBrowser()
				iii) verifyGoogleTitle()*/

			//Usnig "priority" attribute we can prioritize Test cases then we can control execute the test cases in desired order.
			//Alt+Shift+Q = Show view for console, variables,breakpoints,projectexplorer,error log etc....

				/*/	Use "priority" attribute if there is no functionality dependency between test cases,
				Use “dependsOnMethods" attribute if there is functionality dependency between test cases,
*/
				/*@Test - The annotated method is a Test Case
			
		//Execute multiple Programs / Classes using XML	
				 XML file for executing multiple programs / classes 
				<suite name = "Suite Name"> 
				<test name = "Test Name"> 
				<classes> 
				<class name = "package.class1name"/> 
				<class name = "package.class2name"/> 
				</classes> 
				</test> 
				</suite> 
				........................................ 
		//Tags in this XML file 
				suite tag, 
				test tag, 
				classes tag,
				class tag 
				........................................
				Writing tags,
				<tagName> -Open tag
				</tagName> -Close tag
				Or
				<tagName/> -Open and Close*/
				/*
		//Navigation for creating XML file in Eclipse IDE,
				In Eclipse IDE,
				Select Java Package and right click
				> New
				> Other
				> Enter "TestNG"
				> Enter source and package names
				> Enter XML file Name
				> Finish*/
				/*
			//TestNG will generate the default report. When you execute testng.xml file, and refresh the project. You will get test-output folder in that.
				32)not only inspect element  also use view page source to see the elements locators values- 
				33)gettitle can find in view page source.
				34) to execute multiple classes -use testng xml file.
				35) Check Testng index and emailable reports which are in test output folder under testng -for detailed test results summary.
				[TestNGContentHandler] [WARN] It is strongly recommended to add
				 "<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
				" at the top of the suite file [C:\Users\dell\eclipse-workspace1\
				Myproject_SeleniumJava\src\BatchTestingusingxml.xml] otherwise
				 TestNG may fail or not work as expected.*/
				/*	can make java programms/classes as testng classes and can run them as testng bacth test/suite.
				38)using testng.xml -can run multiple java classes by adding the testscripts/class in xml as class tags.
				39)Alt+Shift+x g  -to run testng suite.
				Alt+Shift+x n  -to run testng test.*/

	/*Note: use one parent class to create Browser driver and close, by inheriting classes we can execute.
				41) Use extends keyword in the class name to access another class and its contains.
				42)we can use extends keyword to access another class for reuse-reusable componets/functions etc...
				43)//Created one class - which has Reusable user defined method for browserdriver to luanchbrowser
				in @Test we can set priority and groups also.
				45) create string type array to store multiple values =
				and create string type object.

			//String inputData [] [] = new String [rows][columns];
				46)
				@DataProvider (name = "testdata") - in this "testdata" is keyword we can use it for excel datadriven test.
				47)we have two types of dataprovidres one is annotation and another one is attribute.
				example :
				@Test (dataProvider ="testdata") = this is attribute.
				@DataProvider (name = "testdata") = this is annotation.*/
				/*48)
		//Apache POI in Selenium
				The Apache POI in Selenium is a widely used API for selenium data driven testing.
				 It is a POI library written in Java that gives users an API for manipulating Microsoft documents like .xls and .xlsx. 
				Users can easily create, modify and read/write into excel files. POI stands for “Poor Obfuscation Implementation.”
				POI stands for “Poor Obfuscation Implementation.”
				Apchae poi jar download link :
				https://dlcdn.apache.org/poi/release/bin/poi-bin-5.0.0-20210120.zip
*/
				/*49)Test Requirements, Test scenarios, Test Cases, and Test Data...
				50) Note: Test Data is not required for all Test cases....
				51)Selenium integration with Maven
				Advantages of Maven Integration:
		//Selenium Test Environment Setup
				(You can add all required dependencies like Selenium WebDriver, TestNG etc...to Maven Project (POM xml) then it will download and add those jar file to your project)
				b) Maintenance of Selenium Test Environment
				(If any new version of project dependencies comes then you just add those dependencies to POM XML then it will download add those jar files...)
				c) All of your project team members can get same configuration (by using the POM XML)
				(Maintain Common Configuration for all Team Members)
			//After creating Maven project
				Add Dependencies from Internet for your Automated Testing in POM (Project Object Model)
				XML file between "Dependencies" tags (Open and Close tag) and Save Then it will download those dependencies jar files and add to Maven Project
				Note: You can edit Dependencies, and share the XML.
				Selenium WebDriver-java, TestNG etc...
				Create Selenium Test Cases under src/test/java> Java Package>...
			//maven project dependencies to add from maven repository
				1.selenium webdriver launguage binding dependency
				2.testng dependency
				53)	update pom.xml -properties tags source and target versions to latest for maven build success and run as maven test
				 <properties>
				    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
				    <maven.compiler.source>16.0.2</maven.compiler.source>
				 	<maven.compiler.target>16.0.2</maven.compiler.target>
				  </properties>
*/
	/*	//54)selenium grid.
				55)testng results generated in the form of html and xml.
				56)Selenium Test Environment Setup using Selenium WebDriver, Java, TestNG, Jenkins and Maven. Create Automation Framework Resources like Driver Scripts, Object Repositories, Built-in Functions, Test Data and Other Files, and Create Selenium test Cases using Test Automation Resources & Execute.
				What is Automation Framework?, Why Automation Framework, Advantages of Selenium Framework, and Challenges for Selenium Automation Framework.
				Selenium Automation Framework Design & Implementation,  Types of Automation Frameworks, Keyword Driver Framework, Hybrid Framework and Data Driven Framework.
				57) instead of set system property use the below line config class after adding webdrivermanager dependency in pom.xml,
				if we add webdrivermanager dependency in pom.xml-this will automatically get the latest version of browser.
				WebDriverManager.chromedriver().setup(); 
				58) remove below line from pom.xml testng dependency.-so that when we create class in src main this will not be moved to src test folder.
				  <scope>test</scope>
				59)under src test create one java class and store all object repository elements-
				store elements in variables and  use those in classes */			
				//in framework 5 things/class files are  very important-browser ino class, object repository elements class, actiondriver commands class file and tco1/test case class file and pom.xml.
				//61)for reporting purpose add extent reports dependency in pom.xml and create variables
				//62)add argument means add one parameter.
				/*//sample demo application
				http://demo.guru99.com/access.php?uid=mngr355941%20&%20pass=UdymAgU%20&%20email=lakshman.v1black@gmail.com
				http://demo.guru99.com/v4/
				mngr355941
				UdymAgU
				http://demo.guru99.com/
				http://demo.automationtesting.in/Register.html
				https://admin-demo.nopcommerce.com/
				https://frontend.nopcommerce.com/
				https://www.opencart.com/index.php?route=account/register
				https://www.orangehrm.com/
				Admin email: admin@yourstore.com
				Admin password: admin*/
				/*
		//pom.xml dependency list :-
				1)selenium-server or selenium java.(3.141.59)
				2)testng(7.4.0)
				3)webdrivermanager-(5.0.3)
				4)extentreports-(4.0.9)
				5)poi-(5.0.0)
				6)poi-ooxml-(5.0.0)
				7)mysql
				mysql-connector-java.*/

/*//dependencies 
				1)<dependency>
				    <groupId>org.seleniumhq.selenium</groupId>
				    <artifactId>selenium-server</artifactId>
				    <version>3.141.59</version>
				</dependency>

				2)<!-- https://mvnrepository.com/artifact/org.testng/testng -->
				<dependency>
				    <groupId>org.testng</groupId>
				    <artifactId>testng</artifactId>
				    <version>7.4.0</version>
				</dependency>

				3)<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
				<dependency>
				    <groupId>io.github.bonigarcia</groupId>
				    <artifactId>webdrivermanager</artifactId>
				    <version>5.0.3</version>
				</dependency>

				4)<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
				<dependency>
				    <groupId>com.aventstack</groupId>
				    <artifactId>extentreports</artifactId>
				    <version>4.0.9</version>
				</dependency>

				5)<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
				<dependency>
				    <groupId>org.apache.poi</groupId>
				    <artifactId>poi</artifactId>
				    <version>5.0.0</version>
				</dependency>

				6)<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
				<dependency>
				    <groupId>org.apache.poi</groupId>
				    <artifactId>poi-ooxml</artifactId>
				    <version>5.0.0</version>
				</dependency>
				7)
				<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
				<dependency>
				    <groupId>mysql</groupId>
				    <artifactId>mysql-connector-java</artifactId>
				    <version>8.0.26</version>
				</dependency>
*/
		
		
		/*1)to achieve datadriven testing data from excel files with selenium-we can use thirdy paty api-thats is apache poi.
				2)jar file-it contains many methods classes and libraries.
				3)for maven project add 2 dependencies(poi.ooxml and poi) in pomxml  for apache poi.
				4)create object=we have predefines classes its has.methods.
				5) hashmap is a collection in java -we can store the data in the form of key value pairs.
				6)implictwait-timeouts- applicable throughout the script  while navigating to multiple pages.
				7)webdriver is java interface
				8) api, -has classes and methods(it is library).
				9)to automate windows based applications using selenium-we cant integrate this with autoit or sikuli tools
				10)reports can use extent reports or allure reports.
				11)json wire protocol will encode the code which we written in java and this will communicate the browser specific drivers.
				12)while automation if the application url contains "frontend" dont use that url because elements wont get identified-so use proper perfect url.
				13) bootstrap is a popular css framework for developing responsive websites.
				14) bootstrap is a framework.-bootstrap elements.
				15)*/

				//<maven.compiler.source>16.0.2</maven.compiler.source>
				 	//<maven.compiler.target>16.0.2</maven.compiler.target>
				//C:\Users\dell\Desktop\eclipse\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_16.0.2.v20210721-1149\jre
				//http://localhost:8080/
				//enable-future-java
			/*
	// git hub notes java -jar jenkins.war --enable-future-java  --httpPort=8080
				git-
				https://git-scm.com/downloads
				create git repository
				signup for github.com-remote repository
				git-git hub
				git init(create local repository)( C:/Users/dell/eclipse-workspace/myproject_fr)
				git remote add origin(create remote repository(github url).("https://github.com/Lakshmanreddygithub/myproject_framework.git").
				now associate local repository with remote repository(git to github)
				//git commands------
				git init
				git remote add origin
				git status
				git add -a
				git status
				git add -A
				one time activity
				git config --global user.name "Lakshmanreddygithub"
				git config --global user.email "lakshman.v1black@gmail.com"
*/
					
				/*
	//Selenium Grid:
				> Selenium Grid is only for Test Execution and it doesn't Support Test Design
				> Selenium Grid supports Parallel Testing
				(It can execute Test scripts against different browsers and machines (computers)
				We use Parameterization feature for Data Driven Testing....
				Selenium WebDriver: Using programming (Flat files/excel files)....*/
				/*
		//Java has three important editions
				i) Java Standard Edition / Core Java (Old name J2SE)
				ii) Java Enterprise Edition / Advanced Java (Old name J2EE)
				iii) Java Micro Edition (Old name J2ME)
				Java Standard Edition or Core Java is enough for Automated Testing with Selenium,
*/
/*
				Note 1: In Computer Programming 80% concepts are common (in every programming language), Syntax may vary from one language to another
				Example: Data Types, Variables, Operators, Control Flow (Conditional, Loop and Branching) etc...
				Note 2: Some features may vary from one language to another, Example: Functions in C Languages, Methods in Java....

			//Conditional / Decision Making statements (if, switch,)
				Loop Statements (for, while, do while and enhanced for)
				Branching statements (break, continue and return)
				Decide among several alternates (else if)
				Execute a block of statements when more than one condition is true (nested if)
				Decide among several alternates (using switch statement)*/

			/*	
			 //Used for repetitive execution
				i) for loop
				ii) while loop
				iii) do while loop
				iv) enhanced for loop (Array)
				c) Branching Statements
				• Branching statements are used to transfer control from one point to another in the code
				• Branching statements are defined by three keywords - break, continue and return
*/
				/*
		//Inheritance:
				When we inherit from an existing class then we can reuse methods and fields from the parent class.
				*/
				/*//Java Supports,
				a) Single Inheritance
				ClassB extends ClassA
				b) Mluti Level Inheritance
				ClassB extends ClassA
				ClassC extends ClassB
				c) Multiple Inheritance (* Java doesn’t support multiple Inheritance)
				ClassB extends ClassA
				ClassB extends ClassZ*/
								
				//Java is a case sensitive language
				//Note: All Java keywords and reserved words are small letters;
				
				//(if, for, public, main, true, false, null...)
							
				/*
		//Three important steps in Computer programming,
				i) Write a Program (in any Editor)
				ii) Compile the Program
				iii) Run the program*/

			//Array length is fixed and index starts from zero to n-1

				/*
		//There are three ways available in Java for reading input,
				1) Scanner
				2) DataInputStream
				3) BufferedReader
				Note: using java.util.Scanner is the easier way and it 
				includes many methods to check input is valid or not*/

			//In Automated Testing Selenium with Java we may face two types’ exceptions
				//1) Global Exceptions (Ex: ArithmeticException)
				//2) Local Exceptions (Ex: NoSuchElementException

				//Button - External Operation (Click) - Internal Operation (Submits)
				//Link - External Operation (Click) - Internal Operation (Redierects...)
				//Radio Button External Operation (Click) - Internal Operation (Selects)
				//Checkbox External Operation (Click) - Internal Operation (Selects/Checks)		
			//......................................................	
		
		//Write Selenium WebDriver Test Cases using User defined Methods/Reusable Components)
			/*
			//Reusable Components:
				1) Launch Browser
				2) Login
				3) Close Browser...*/

				//this keyword is invoke an instance current class constructor
				//A Constructor in Java is a block of code similar to a method
				//that is called an instance of Object is created.
				//TestNG executes Test cases in Alphabetical order
				//Usnig "priority" attribute we can prioritize Test cases then we can control the test execution process
	/*System info: host: 'LAKSHMANREDDY',
	 ip: '192.168.0.18',
	 os.name: 'Windows 7', 
	os.arch: 'amd64', 
	os.version: '6.1', 
	java.version: '16.0.2'*/

		
		
	//Usage of Comments in Test Automation
	/*
	 * a) To write Test case Header b) To write Method header c) To explain Complex
	 * Logic etc...
	 */

	//break statement is used to stop the execution and comes out of loop
	 //Mostly break statements are used in switch and in loops....
	
		//User defined Methods
			/*
			 * 1) Method with return a value (Perform operation/s and return a value) a)
			 * Call methods by invoking object (Non Static Method) b) Call methods without
			 * invoking Object (Static Method) 2) Method without return any value
			 */
		//(perform operations)
			//a) Call methods by invoking object (Non Static Method)
			//b) Call methods without invoking Object (Static Method)

			//Note: We Write Methods outside of main method,
			// but we call methods inside of method.

			//Usage of User defined Methods
				//1) Internal Use (Create and Call Methods within the same Class)
				//2) External Use (Call Methods from another Class)
//Inheritance
			//The Inheritance between parent Class and Child Class is achieved using "extends" keyword
			//We can't use Non Static variables in Static Methods

		//Verification Commands on Web Elements
			//14) isDisplayed() command is applicable on all the web elements
			//15) isEnabled() command is applicable on all the web elements
			//16) isSelected() command is applicable on Radio Buttons and Checkboxes only
			
//Browser Regular Commands
			/*
			 * 1) get() 2) getTitle() 3) getCurrentUrl() 4) getWindowHandle() 5) close() 6)
			 * quit() b) Browser Navigation Commands 1) navigate().to() 2) navigate().back()
			 * 3) navigate().forward() 4) navigate().refresh() c) Commands on Web Elements
			 * 1) findElement() 2) findElements() 3) sendKeys() 4) click() 5) clear() 6)
			 * getText() 7) getAttibute("Arg...") d) Verification Commands 1) isDisplayed()
			 * 2) isEnabled() 3) isSelected()
			 */		
//Java Programming (Java Standard Edition / Core Java)
	/*
	 * 1) Comments 2) Data Types 3) Modifiers 4) Variables 5) Operators 6) Java
	 * Control Flow Statements a) Conditional Statements/Decision Making Statements
	 * b) Loop Statements c) Branching Statements 7) String Handling 8) Array,
	 * ArrayList 9) IO Operations (includes File handling) 10) Java Methods a)
	 * Built-in Methods b) User defined Methods 11) Exception Handling 12) Java OOPS
	 * a) Inheritance b) Polymorphism c) Abstraction d) Encapsulation
	 */					
	//Check Displayed Status (Visible/Displayed/Exists)
	//Driver.switchTo().frame(2);				
//Automation Framework Design & Implementation
	/*
	 * 1) Maven Integration and Jenkins Integration 2) Create Folder Structure 3)
	 * Create Test Automation Resources (Object Repositories, Customized Commands,
	 * Reusable Functions, Test Data etc,) 4) Create Test Cases using Test
	 * Automation Resources 5) Execute Test Batches using Driver Script and generate
	 * Test Result
	 */			
//Selenium Project
	/*1) Understanding the AUT
	2) Derive Test Scenarios
	3) Selenium Test Environment Setup (Using Eclipse IDE, Java, Selenium WebDriver, TestNG, Maven, jenkins etc,)
	4) Create Selenium Test Cases
	5) Execute Test Batches and Analyze Test Results*/
//Jenkins
	//Note: Jenkins is : an open-source Continuous Integration (CI) server, which automates the build and deploy process of your web applications. By running your Selenium test suite in Jenkins, you also automate testing as part of the build process.
	//Maven is: an Open Source build automation tool, It is used to setup Selenium Environment easily and maintenance of Test environment also easy.

	//Note :Test Automation Resources: Object Repositories, Customized Commands, Reusable Functions, Test data etc…

//Errors occured-----
	/*
	 * 1)[Utils] [ERROR] [Error] jxl.read.biff.BiffException: Unable to recognize
	 * OLE stream java.lang.RuntimeException: jxl.read.biff.BiffException: Unable to
	 * recognize OLE stream 2)java.lang.RuntimeException:
	 * jxl.read.biff.BiffException: Unable to recognize OLE stream 3)SLF4J: Failed
	 * to load class "org.slf4j.impl.StaticLoggerBinder". SLF4J: Defaulting to
	 * no-operation (NOP) logger implementation SLF4J: See
	 * http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
	 * -----------------
	 */
	/*
	 * //Webdriver_SeleniumRC------------ public class Webdriver_SeleniumRC { public
	 * static WebDriver driver; public static Selenium selenium; public static
	 * String reg() { driver=new FirefoxDriver(); selenium=new
	 * WebDriverBackedSelenium(driver, "http://mail.in.com");//selenium rc method
	 * driver.get("http://mail.in.com");
	 * driver.findElement(By.cssSelector("input.registernow")).click();
	 * driver.findElement(By.id("fname")).sendKeys("Nageswara Rao");
	 * driver.findElement(By.id("day")).sendKeys("5");
	 * driver.findElement(By.id("month")).sendKeys("Mar"); selenium.select("year",
	 * "1988"); selenium.type("username", "nag1234"); return "Pass"; } public static
	 * void main(String[] args) { // TODO Auto-generated method stub reg();
	 * 
	 * }
	 */
		
		
		
		
}
	}
	
	