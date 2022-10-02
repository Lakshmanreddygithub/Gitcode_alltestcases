package elements_objectreposirory_or;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_pagefactory {
	//public static WebDriver driver;
	
	WebDriver driver;

    @FindBy(id="search")
    WebElement searchTextBox;
   
    @FindBy(name="searchBtn")
    WebElement searchButton;

    //Constructor for this class
    public POM_pagefactory(WebDriver driver){
        this.driver = driver;
        //initElements method to initialize all elements
        PageFactory.initElements(driver, this);
    }
    
    //Sample method
    public void search(String searchTerm){
        searchTextBox.sendKeys(searchTerm);  
        searchButton.click();}
              
public static void main(String[] args) {
	
	
}}

//---------------we can create a robust automation framework using POM---------------------------

//we can implement an object repository using the Page Object Model as well as Page Factory design patterns.

//What is Page Object Model or POM?
		/*
		 * //Page Object Model(POM) is a design pattern in Selenium. //A design pattern
		 * is a solution or a set of standards that are used for solving commonly
		 * occurring software problems. //Now coming to POM – POM helps to create a
		 * framework for maintaining selenium scripts. //In POM for each page of the
		 * application, a class is created having the web elements belonging to the page
		 * //and methods handling the events on that page. The test scripts are
	 * maintained in separate files and the methods of the page object files are
	 * called from the test scripts file.
	 */
//What are the advantages of POM?

	/*
	 * Using POM, we can create an Object Repository i.e. a set of web elements in
	 * separate files along with their associated functions. In this way, keeping
	 * the code clean. For any change in UI(or web elements) only page object files
	 * are required to be updated leaving test files unchanged. It makes code
	 * reusable as well as maintainable.
	 */
//What is Page Factory?

	/*
	 * Page factory is an implementation of the Page Object Model in Selenium. It
	 * provides @FindBy annotation to find web elements. In addition, there is a
	 * PageFactory.initElements() method to initialize all web elements defined
	 * with @FindBy annotation.
	 */

//What is POM (Page Object Model)? What are its advantages?
	//Page Object Model is a design pattern used to create object repositories for the web UI elements. Every web page of an application has a corresponding page class that is responsible for locating the web elements and performing actions on them.

//Its advantages are as follows:

	//It provides support to separate operations and flows on the UI from verification, hence improving code readability.
	//As the object repository is independent of test cases, multiple tests can use the same object repository.
	//It increases the reusability of the code

//Page Factory class :-

	/*
	 * in selenium is an extension of the Page object design pattern.
	 * 
	 * Page Factory is an inbuilt concept that provides an optimized way to
	 * implement the Page Object Model. Here optimization is, it refers to the fact
	 * that the memory utilization is very good and also the implementation is done
	 * in an object-oriented manner.
	 * 
	 * It is used to initialize the elements on the Page Object or instantiate the
	 * Page Objects. Annotations for elements can be created and recommended as the
	 * describing properties may not always be descriptive enough to differentiate
	 * one object with the other.
	 * 
	 * Here the concept of separating the Page Object Repository and Test Methods is
	 * followed. Instead of using ‘FindElements’, here we use annotations
	 * like @FindBy to find WebElement, and the initElements method to initialize
	 * web elements from the Page Factory class. It makes handling "Page Objects"
	 * easier and optimized by providing the @FindBy annotation and initElements
	 * method.
	 * 
	 * @FindBy annotation - can accept attributes tagName, partialLinkText, name,
	 * linkText, id, CSS, className & XPath and is used to locate and declare web
	 * elements using different locators.
	 * 
	 * Example - @FindBy(id="elementId") WebElement element;
	 * 
	 * initElements() - is a static method of PageFactory class used in conjunction
	 * with @FindBy annotation. Web elements located by @FindBy annotation can be
	 * initialized using the initElements method.
	 * 
	 * Example - initElements(WebDriver driver, java.lang.Class pageObjectClass)
	 */