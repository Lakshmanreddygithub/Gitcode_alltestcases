package testNG_Codexamples;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/*// //driver= new ChromeDriver();	
Execute the “ListenerTestNGTestCase” class. Methods in class “ListenerTestNG” 
 * are called automatically according to the behavior of methods annotated as @Test
////TestNG Listeners. Using TestNG listeners we could generate logs and customize TestNG Reports.
//ListenerTestNG	implements ITestListener		
		
		 * //WebDriver Event Listeners in Selenium WebDriver. Listeners “listen” to the
		 * event defined in the selenium script and behave accordingly. The main purpose
		 * of using listeners is to create logs and reports.
//Verify the Output in the console. You could find the logs in the console.
//If you want to use listeners in multiple classes.
//Add the below lines of code in the TestNG.xml file
//	
 * 
 */
/*<listeners>
        <listener class-name="listeners.listenerTestNG"/>
</listeners>*/

public class ListenerTestNG implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
}