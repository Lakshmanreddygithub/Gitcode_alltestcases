package testNG_Codexamples;

import org.testng.annotations.Test;

public class TestNGnotesmaterial {	

//What is the significance of testng.xml?
	
	/*
	 * Selenium does not support report generation and test case management, we use
	 * the TestNG framework with selenium to support these features. TestNG is more
	 * advanced than JUnit and implementation of annotations is easy.
	 * 
	 * The test suite is not defined in testing source code and it is represented in
	 * an XML file because the suite is a collection of test cases and an execution
	 * is the feature of the test suite.
	 * 
	 * To execute test cases in a suite or group of test cases, you need to create a
	 * testng.xml file. The testng.xml file contains the name of all classes and
	 * methods that needs to be executed as a part of execution flow.
	 * 
	 * Advantages of using testng.xml file are -
	 * 
	 * The execution of multiple test cases from multiple classes is allowed.
	 * Parallel execution is allowed. Execution of test cases in groups, where a
	 * single test can belong to multiple groups is allowed.
	 */
//What is the difference between @Factory and @DataProvider annotation?
	
	/*
	 * @Factory method creates instances of test class and runs all the test
	 * methods in that class with a different set of data. Whereas, @DataProvider is
	 * bound to individual test methods and run the specific methods multiple times.
	 */
	/*
	 * //How can we run test cases in parallel using TestNG?
	 * 
	 * //In order to run the tests in parallel just add these two key-value pairs in
	 * the suite parallel=”{methods/tests/classes}” thread-count=”{number of thread
	 * you want to run simultaneously}”. <suite name="ArtOfTestingSuite"
	 * parallel="methods" thread-count="5">
	 */
	
//What is the use of @Factory annotation in TestNG?
	
	/*
	 * Ans. @Factory annotation helps in the dynamic execution of test cases.
	 * Using @Factory annotation, we can pass parameters to the whole test class at
	 * run time. The parameters passed can then be used by one or more test methods
	 * of that class.
	 * 
	 * For example – there are two classes TestClass and the TestFactory class.
	 * Because of the @Factory annotation, the test methods in class TestClass will
	 * run twice with the data “k1” and “k2”.
	 * 
	 */	
	
//How can we make one test method dependent on others using TestNG?
	
	/*
	 * Using the dependsOnMethods parameter inside @Test annotation in TestNG, we
	 * can make one test method run only after the successful execution of the
	 * dependent test method.
	 */
	
//How to prevent a test case from running using TestNG?
	
	/*
	 * Test method can be disabled from getting executed by setting the “enabled”
	 * attribute as false.
	 */

	//In case of a test method
		@Test(enabled = false)
		public void testMethod1() {
		  //Test logic
		}	 
	//In case of test method belonging to a group
		@Test(groups = {"NegativeTests"}, enabled = false)
		public void testMethod2() {
		  //Test logic
		}	
	
	//@Test(dependsOnMethods = { "preTests" })
//DataProvider is a TestNG feature, which enables us to write DataDriven tests
//DataProvider is in fact another way of passing parameters to the test method	
	/*
	 * @DataProvider marks a method as supplying data for a test method. The
	 * annotated method must return an Object[] where each Object[] can be assigned
	 * to parameter list of the test method. 
	 * To use the DataProvider feature in your tests, you have to declare a method annotated by @DataProvider and then use the said method in the test method using the ‘dataProvider‘ attribute in the Test annotation*/
//How to skip a method or a code block in TestNG?
	//If you want to skip a particular test method, then you can set the ‘enabled’ parameter in test annotation to false.
	//@Test(enabled = false)
//Soft Assertions are customized error handlers provided by TestNG. Soft Assertions do not throw exceptions when assertion fails, and they simply continue to the next test step. They are commonly used when we want to perform multiple assertions.
//To mark a test as failed with soft assertions, call assertAll() method at the end of the test.		

//Explain what is Group Test in TestNG?
	//In TestNG, methods can be categorized into groups. When a particular group is being executed,all the methods in that group will be executed.

//We can execute a group by parameterizing it’s name in group attribute of @Test annotation.
	//Example: @Test(groups={“smoke test,regression test”})
	
//Dependency is a feature in TestNG that allows a test method to depend on a single or a group of test methods. Method dependency only works if the “depend-on-method” is part of the same class or any of the inherited base classes (i.e. while extending a class).
	 //Syntax: @Test(dependsOnMethods = { “initEnvironmentTest” })	
//Explain what does @Test(invocationCount=?) and @Test(threadPoolSize=?) indicate?	
	//@Test(invocationCount=?) is a parameter that indicates the number of times this method should be invoked.
	//@Test(threadPoolSize=?) is used for executing suites in parallel. Each suite can be run in a separate thread.
    //To specify how many times @Test method should be invoked from different threads,
	//y@Test(threadPoolSize = 3, invocationCount = 10)
//example :	
	//@Test(threadPoolSize = 3, invocationCount = 10)
	//public void testServer() {}
//What are the different types of TestNG Listeners in Selenium?
	//IAnnotationTransformer
	//IAnnotationTransformer2
	//IConfigurable
	//IConfigurationListener
	//IExecutionListener
	//IHookable
	//IInvokedMethodListener
	//IInvokedMethodListener2
	//IMethodInterceptor
	//IReporter
	//ISuiteListener
	//ITestListener
//How can you prepare a customised HTML report in TestNG using Hybrid framework?
	//Junit with the help of an Ant.
	//TestNG using inbuild default file.
	//Also use XSL file.
	
//How do you set the test case priority in TestNG?
	//Setting Priority in TestNG:
		//Test Execution Sequence:
			//Method1
			//Method2
			//Method3	
//What are some advantages of TestNG?
	
	/*
	 * TestNG provides different assertions that help in checking the expected and
	 * actual results. It provides parallel execution of test methods. We can define
	 * the dependency of one test method over others in TestNG. Also, we can assign
	 * priority to test methods in selenium. It allows the grouping of test methods
	 * into test groups. It allows data-driven testing using @DataProvider
	 * annotation. TestNG has inherent support for reporting. It has support for
	 * parameterizing test cases using @Parameters annotation.
	 */
//What are some common assertions provided by TestNG?
	//Some of the common assertions provided by testNG are-

	/*
	 * assertEquals(String actual, String expected, String message) – (and other
	 * overloaded data type in parameters) assertNotEquals(double data1, double
	 * data2, String message) – (and other overloaded data type in parameters)
	 * assertFalse(boolean condition, String message) assertTrue(boolean condition,
	 * String message) assertNotNull(Object object) fail(boolean condition, String
	 * message) true(String message)
	 */
	
//How can we create a data-driven framework using TestNG?
	
	/*
	 * Using @DataProvider we can create a data-driven framework. Basically, we can
	 * pass test data to the associated test method and then multiple iterations of
	 * the test run for the different test data values passed from the @DataProvider
	 * method. The method annotated with @DataProvider annotation return a 2D array
	 * of object.
	 */	
	
	/*
	 * //Data provider returning 2D array of 3*2 matrix
	 * 
	 * @DataProvider(name = "dataProvider1") public Object[][] dataProviderMethod1()
	 * { return new Object[][] {{"kuldeep","rana"}, {"k1","r1"},{"k2","r2"}}; }
	 * 
	 * //This method is bound to the above data provider returning 2D array of 3*2
	 * matrix //The test case will run 3 times with different set of values
	 * 
	 * @Test(dataProvider = "dataProvider1") public void sampleTest(String s1,
	 * String s2) { System.out.println(s1 + " " + s2); }
	 */

//Advantages of TestNG are -

	/*
	 * Can generate logs Due to Annotations code is efficient and easy to manage
	 * Ability to generate execution Reports in HTML Can be Grouped & Prioritised
	 * tests easily Parallel testing is possible in TestNG Data Parameterization is
	 * supported Due to annotation testing time reduced considerable testing time
	 * reduce considerably Scheduling of test cases can be done properly Can use a
	 * data-driven approach by using a data provider Proper control over test
	 * execution is possible
	 */
}