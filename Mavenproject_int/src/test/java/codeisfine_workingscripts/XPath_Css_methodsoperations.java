package codeisfine_workingscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Css_methodsoperations {
	
	public static void main(String[] args) throws InterruptedException {
		
//browser info
		WebDriverManager.chromedriver().setup();
//ChromeOptions options = new ChromeOptions();
//options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//----------------------------------------------------------------------------------
//Xpath query	
		//Webtable //position is to select particular row //--//table//tr[   position()=2]
//webtable clicking on particular checkbox in the row	-using table-tr-last()funstion
			//---//table [@id="table1"]//tr[last() -2]/td/input[@type="checkbox"]
	//driver.get("https://theautomationzone.blogspot.com/2020/07/sample-webtable-3.html");	
	//driver.findElement(By.xpath("//table [@id=\"table1\"]//tr[last()]/td/input[@type=\"checkbox\"]")).click();
//radio button
	//---------//input[ @type="radio"][@id="gender-0"]
	
//using text() function for links 
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		 //driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
//Xpath axes functions methods
		
//xpath axes self node
		driver.get("https://money.rediff.com/gainers/bse/daily/group");
		
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Goblin India')]/self::a")).getText();
		System.out.println(text1);	
		
//parent node
String text2=driver.findElement(By.xpath("//a[contains(text(),'Goblin India')]/parent::td")).getText();	
System.out.println(text2);
//child node and get elements
List<WebElement> childs= driver.findElements(By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/child::td"));		
System.out.println("number of elements :"+childs.size());
//Ancestor node
String getvaluesalltext= driver.findElement(By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr")).getText();	
System.out.println("text of the each  elements :"+getvaluesalltext);
//Descendent-means child and grand child nodes
List<WebElement> Descendentnodes=driver.findElements((By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/descendant::*")));
System.out.println("number of Descendent nodes :"+Descendentnodes.size());
//Following nodes 
List<WebElement> Followingnodes=driver.findElements((By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/following::tr")));
System.out.println("number of Followingnodes:"+Followingnodes.size());
//Following-sibling nodes 
List<WebElement> Followingsiblingnodes=driver.findElements((By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/following-sibling::tr")));
System.out.println("number of Followingsiblingnodes:"+Followingsiblingnodes.size());
//preceding nodes 
List<WebElement> precedingnodes =driver.findElements((By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/preceding::tr")));	
System.out.println("number of precedingnodes:"+precedingnodes.size());
//preceding-sibling nodes 
List<WebElement> precedingsibling =driver.findElements((By.xpath("//a[contains(text(),'Goblin India')]/ancestor::tr/preceding-sibling::tr")));
System.out.println("number of precedingsibling:"+precedingsibling.size());
		 		
	}
}

//xpath methods functions  queries-

		/*
		 * //click on choose file button
		 * driver.get("http://demo.automationtesting.in/Register.html");
		 * driver.findElement(By.xpath("//div/input[@ng-model=\"FirstName\"]")).sendKeys
		 * ("123"); driver.findElement(By.
		 * xpath("//textarea[@class='form-control ng-pristine ng-valid ng-touched']")).
		 * sendKeys("123"); Thread.sleep(2000);
		 * driver.findElement(By.id("imagesrc")).click();
		 */
//Code Snippet :
		
//Xpath in Selenium
		//===================
		//*[@id='value'] - Any Elements by id
		//*[@name='value']- Any Elements by name
		//*[text()='value']- any Elements by text
		//input[@id='value']- input Elements by id
		//div[text()='value']- input Elements by text
		//input[@id='value' and @name='value'] - two or more attributes
		//input[@id='value' or @name='value'] - two or more attributes
		//div[@id='value']/.. - one element up
		//div[@id='value']/input - one element down by tag
		//div[@id='value']/div/input - two element down by tag
		//div[@id='value']//input - any level inside the element
		//div[@id='value']//input[1] - first element inside an element wit tag
		//div[@id='value']//input[@id='value'] - element inside an element with tag and attribute
//Elements as attributes
		//div[@id='value']/..
		//*[div[@id='value']] 
		//div[@id='value']/../..
		//*[*[div[@id='value']]]
		
		
//Webtable 
		//position is to select particular row
		//--//table//tr[   position()=2]

		//driver.get("http://demo.guru99.com/test/table.html");

		/*
		 * //xpath methods queries-
		 * 
		 * driver.get("https://www.opencart.com/index.php?route=account/register");
		 * //*using in xpath driver.findElement(By.xpath("//*[@name='username']")).
		 * sendKeys("*using in xpath"); Thread.sleep(2000); //multiple attributes using
		 * and ,or operator //input[ (@name='email' and @id='input-email') or @xpath='1'
		 * ] driver.findElement(By.xpath(
		 * "//input[(@name='email'and@id='input-email')or@xpath='1']")).
		 * sendKeys("multiple attributes using and or operator"); // text()
		 * function--and getting the text from page //label[ text()='Country'] String
		 * gettextval1 =
		 * driver.findElement(By.xpath("//label[ text()='Country']")).getText();
		 * System.out.println(gettextval1); //get the name of the logo String
		 * gettextval2 =
		 * driver.findElement(By.xpath("//img[@title='OpenCart - Account Register']")).
		 * getAttribute("title"); System.out.println(gettextval2+": name of the logo");
		 * //click link
		 * //driver.findElement(By.linkText("OpenCart Community forum")).click();
		 * //using normalize-space() function driver.findElement(By.
		 * xpath("//a[normalize-space()='OpenCart Community forum']")).click(); //note :
		 * //a[normalize-space()='provide link text name here which is on ui'] //xpath
		 * query for dropdown combobox and select value -
		 * //xpath("//div/select[@name='country_id']") //--/...represents to the parenr
		 * of the element-//div/select[@name='country_id']/.. Select country = new
		 * Select(driver.findElement(By.xpath("//div/select[@name='country_id']")));
		 * country.selectByVisibleText("India"); Thread.sleep(2000); //placeholder
		 * attribute-using-//div/input/placeholder driver.findElement(By.
		 * xpath("//div/input[@placeholder='Enter your email address']")).sendKeys(
		 * "//div/input/placeholder"); Thread.sleep(5000); //radio button xpath query
		 * and click
		 * driver.get("https://www.opencart.com/index.php?route=marketplace/extension");
		 * driver.findElement(By.xpath("//label[normalize-space()='Developers']")).click
		 * ();
		 */

		// text() is full match
		// contains() is partial match

	


//xpath

//XPath is the navigation tool used to locate a web element based on its XML path.

/*
 * XPath, also defined as XML-Path (Extensible Markup Language Path), is a
 * language used to query XML documents and provide functionalities like
 * locating elements in Selenium by iterating through each element in a webpage.
 * In XPath, data is stored in a key-value pair format similar to an HTML tag.
 * It uses a single slash, i.e. ‘ / ’ for creating an absolute path, and a
 * double slash, i.e. ‘ // ’ for creating a relative path for an element to be
 * located on a webpage.
 */

//Single slash is used to create Xpath with an absolute path i.e. the XPath would be created to start selection from the start node.

// ---"/html/body/div[2]/div[1]/div[1]/a"

//Double slash is used to create Xpath with relative path i.e. the XPath would be created to start selection from anywhere within the document

// --"//div[class="qa-logo"]/a"

//Absolute Path: 
// This path starts from the root node and ends with the desired elements node.
// It starts with a single slash (/)
// Example: /html.body/div/td/input
//Relative Path:
// This path starts from any node in between and to the desired elements node.
// It starts with a double slash (//)
// Example: //input/example[@id=name]
//How can we locate an element by only partially matching the value of its attributes in Xpath?		
// Ans. Using contains() method we can locate an element by partially matching
// its attribute’s value.
// This is particularly helpful in scenarios where the attributes have dynamic
// values with a certain constant part.
// xPath expression = //*[contains(@name,'user')]
// Basically, the above statement will match all the values of the name
// attribute containing the word ‘user’ in them.
//How can we move to the parent of an element using XPath?
// Ans. Using ‘/..’ after the XPath expression of the child element, we can move
// to the parent of an element.
// For example, the locator //div[@id=”childId”]/.. will move to the parent of
// the div element with id value as ‘childId’.
//The fundamental difference between XPath and CSS selector is –
// using XPaths we can traverse up in the document i.e. we can move to parent
// elements.
// Whereas using the CSS selector, we can only move downwards in the document.
//What is an absolute XPath?
// Ans. An absolute XPath is a way of locating an element using an XML
// expression, beginning from the root node i.e. HTML node in the case of web
// pages.
// The main disadvantage of absolute XPath is that even if there is a slight
// change in the UI or any element then also whole XPath will fail.
// Example – html/body/div/div[2]/div/div/div/div[1]/div/input
//What is a relative XPath?
// Ans. A relative XPath is a way of locating an element using an XML
// expression, starting from anywhere in the HTML document.
// In this way, there are different ways of creating robust relative XPaths that
// are unaffected by changes in other UI elements.
// Example – //input[@id=’username’]
//How can we locate an element by only partially matching the value of its attributes in Xpath?			
// contains() method
// Using contains() method we can locate an element by partially matching its
// attribute’s value
// This is particularly helpful in scenarios where the attributes have dynamic
// values with a certain constant part.
// xPath expression = //*[contains(@name,'user')]
//locate elements using their text in XPath?				
// Using the text() method
// xPathExpression = //*[text()='username']
//How can we move to the parent of an element using XPath?		
// Using ‘/..’ after the XPath expression of the child element, we can move to
// the parent of an element.
// For example, the locator //div[@id=”childId”]/.. will move to the parent of
// the div element with id value as ‘childId’.
//move to the nth-child element using XPath?		
// Basically, there are two ways of navigating to the nth element using XPath-
// Using square brackets with index position-
// Example – div[2] will find the second div element.
// Using position()-
// Example – div[position()=3] will find the third div element.

//CSS Selector-------------------------------

//syntax of finding elements by class using CSS Selector?		
// using .className--
// By using .className in the CSS locator, we can select all the elements
// belonging to a particular class
// e.g. ‘.red’ will select all elements having class ‘red’.

//finding elements by id using CSS Selector?		
// By using #idValue
// By using #idValue we can select all the elements belonging to a particular
// class
// e.g. ‘#userId’ will select the element having an id – userId.

// select elements by their attribute value using the CSS Selector?
// Using [attribute=value]--
// Using [attribute=value] in the CSS locator, we can select all the elements
// belonging to a particular class
// e.g. ‘[type=small]’ will select the element having attribute type of value
// ‘small’.

//move to the nth-child element using the CSS selector?
//// Using :nth-child(n)--
// Using :nth-child(n) in the CSS locator, we can move to the nth child element
// e.g. div:nth-child(2) will locate 2nd div element of its parent.


//----------------------------------------------------------


//Topics are as follows :
	
	/*
	 * Into :(0:00) Basics :(1:36) Using OR & AND :(8:12) innerText or text function
	 * :(11:20) Parent / Child is Unique :(12:53) Xpath with Index :(18:10) Absolute
	 * vs Relative :(21:07) Advance - Elements as an Attribute (23:02)
	 */

// XPath Functions
	/*
	 * Contains :(25:52) Starts-With :(29:17) Position :(30:42) Last :(32:34) Count
	 * :(34:13) Ignore Space - normalize-space :(36:35) Ignore Case - translate
	 * (41:00) Ignore Space + Ignore Case :(46:00) String-Length :(49:00) Floor and
	 * Round :(50:30) Not :(53:05) substring-before | Substring-after :(55:20)
	 */
// AXES
	/*
	 * AXES intro :(58:34) parent :(1:00:37) ancestor and ancestor-or-self
	 * :(1:02:36) child and descendant :(1:05:32) following and following-sibling
	 * :(1:08:28) preceding and preceding-sibling - same and above Example
	 * :(1:12:25)
	 */



//Xpath Contains and Positions and more
//============================
	/*
	 * contains() starts-with() last() - tables position() - use checkboxes in
	 * tables count() - tables is an example
	 * 
	 * Xpath Ignore Case and Whitespaces and more ============================
	 * normalize-space() - example with spaces translate() - replace example not() -
	 * take any example floor() round() string-length(string)
	 * substring-before(string1, string2) substring-after(string1, string2)
	 * 
	 * Xpath Axes =========== ancestor ancestor-or-self attribute child descendant
	 * descendant-or-self following following-sibling parent preceding
	 * preceding-sibling self
	 */